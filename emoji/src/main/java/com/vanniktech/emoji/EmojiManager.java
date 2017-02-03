package com.vanniktech.emoji;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.emoji.EmojiTree;

import java.util.ArrayList;
import java.util.List;

public final class EmojiManager {
    private static final EmojiManager INSTANCE = new EmojiManager();

    private List<EmojiCategory> categories = new ArrayList<>();
    private EmojiTree emojiTree = new EmojiTree();

    private EmojiManager() {
        // No instances apart from singleton.
    }

    public static EmojiManager getInstance() {
        return INSTANCE;
    }

    public static void install(@NonNull final EmojiProvider provider) {
        if (!INSTANCE.categories.isEmpty() || !INSTANCE.emojiTree.isEmpty()) {
            throw new IllegalStateException("Please call the install method only once.");
        }

        for (final EmojiCategory entry : provider.getCategories()) {
            INSTANCE.categories.add(entry);

            for (final Emoji emoji : entry.getEmojis()) {
                INSTANCE.emojiTree.add(emoji);
            }
        }
    }

    public static void destroy() {
        INSTANCE.categories = new ArrayList<>();
        INSTANCE.emojiTree = new EmojiTree();
    }

    public List<EmojiCategory> getCategories() {
        if (categories.isEmpty()) {
            throw new IllegalStateException("Please install an EmojiProvider through the install method first.");
        }

        return new ArrayList<>(categories);
    }

    @Nullable
    public Emoji findEmoji(@NonNull final CharSequence candiate) {
        if (emojiTree.isEmpty()) {
            throw new IllegalStateException("Please install an EmojiProvider through the install method first.");
        }

        return emojiTree.findEmoji(candiate);
    }
}
