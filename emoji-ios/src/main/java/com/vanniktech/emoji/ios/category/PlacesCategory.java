package com.vanniktech.emoji.ios.category;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;

import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.ios.R;

@SuppressWarnings({"checkstyle:magicnumber", "PMD.MethodReturnsInternalArray"})
public class PlacesCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[]{
            new Emoji(new String(new int[]{0x1f3ce}, 0, 1), R.drawable.emoji_1f3ce),
            new Emoji(new String(new int[]{0x1f3cd}, 0, 1), R.drawable.emoji_1f3cd),
            new Emoji(new String(new int[]{0x1f5fa}, 0, 1), R.drawable.emoji_1f5fa),
            new Emoji(new String(new int[]{0x1f5fe}, 0, 1), R.drawable.emoji_1f5fe),
            new Emoji(new String(new int[]{0x1f3d4}, 0, 1), R.drawable.emoji_1f3d4),
            new Emoji(new String(new int[]{0x26f0}, 0, 1), R.drawable.emoji_26f0),
            new Emoji(new String(new int[]{0x1f30b}, 0, 1), R.drawable.emoji_1f30b),
            new Emoji(new String(new int[]{0x1f5fb}, 0, 1), R.drawable.emoji_1f5fb),
            new Emoji(new String(new int[]{0x1f3d5}, 0, 1), R.drawable.emoji_1f3d5),
            new Emoji(new String(new int[]{0x1f3d6}, 0, 1), R.drawable.emoji_1f3d6),
            new Emoji(new String(new int[]{0x1f3dc}, 0, 1), R.drawable.emoji_1f3dc),
            new Emoji(new String(new int[]{0x1f3dd}, 0, 1), R.drawable.emoji_1f3dd),
            new Emoji(new String(new int[]{0x1f3de}, 0, 1), R.drawable.emoji_1f3de),
            new Emoji(new String(new int[]{0x1f3df}, 0, 1), R.drawable.emoji_1f3df),
            new Emoji(new String(new int[]{0x1f3db}, 0, 1), R.drawable.emoji_1f3db),
            new Emoji(new String(new int[]{0x1f3d7}, 0, 1), R.drawable.emoji_1f3d7),
            new Emoji(new String(new int[]{0x1f3d8}, 0, 1), R.drawable.emoji_1f3d8),
            new Emoji(new String(new int[]{0x1f3d9}, 0, 1), R.drawable.emoji_1f3d9),
            new Emoji(new String(new int[]{0x1f3da}, 0, 1), R.drawable.emoji_1f3da),
            new Emoji(new String(new int[]{0x1f3e0}, 0, 1), R.drawable.emoji_1f3e0),
            new Emoji(new String(new int[]{0x1f3e1}, 0, 1), R.drawable.emoji_1f3e1),
            new Emoji(new String(new int[]{0x1f3e2}, 0, 1), R.drawable.emoji_1f3e2),
            new Emoji(new String(new int[]{0x1f3e3}, 0, 1), R.drawable.emoji_1f3e3),
            new Emoji(new String(new int[]{0x1f3e4}, 0, 1), R.drawable.emoji_1f3e4),
            new Emoji(new String(new int[]{0x1f3e5}, 0, 1), R.drawable.emoji_1f3e5),
            new Emoji(new String(new int[]{0x1f3e6}, 0, 1), R.drawable.emoji_1f3e6),
            new Emoji(new String(new int[]{0x1f3e8}, 0, 1), R.drawable.emoji_1f3e8),
            new Emoji(new String(new int[]{0x1f3e9}, 0, 1), R.drawable.emoji_1f3e9),
            new Emoji(new String(new int[]{0x1f3ea}, 0, 1), R.drawable.emoji_1f3ea),
            new Emoji(new String(new int[]{0x1f3eb}, 0, 1), R.drawable.emoji_1f3eb),
            new Emoji(new String(new int[]{0x1f3ec}, 0, 1), R.drawable.emoji_1f3ec),
            new Emoji(new String(new int[]{0x1f3ed}, 0, 1), R.drawable.emoji_1f3ed),
            new Emoji(new String(new int[]{0x1f3ef}, 0, 1), R.drawable.emoji_1f3ef),
            new Emoji(new String(new int[]{0x1f3f0}, 0, 1), R.drawable.emoji_1f3f0),
            new Emoji(new String(new int[]{0x1f492}, 0, 1), R.drawable.emoji_1f492),
            new Emoji(new String(new int[]{0x1f5fc}, 0, 1), R.drawable.emoji_1f5fc),
            new Emoji(new String(new int[]{0x1f5fd}, 0, 1), R.drawable.emoji_1f5fd),
            new Emoji(new String(new int[]{0x26ea}, 0, 1), R.drawable.emoji_26ea),
            new Emoji(new String(new int[]{0x1f54c}, 0, 1), R.drawable.emoji_1f54c),
            new Emoji(new String(new int[]{0x1f54d}, 0, 1), R.drawable.emoji_1f54d),
            new Emoji(new String(new int[]{0x26e9}, 0, 1), R.drawable.emoji_26e9),
            new Emoji(new String(new int[]{0x1f54b}, 0, 1), R.drawable.emoji_1f54b),
            new Emoji(new String(new int[]{0x26f2}, 0, 1), R.drawable.emoji_26f2),
            new Emoji(new String(new int[]{0x26fa}, 0, 1), R.drawable.emoji_26fa),
            new Emoji(new String(new int[]{0x1f301}, 0, 1), R.drawable.emoji_1f301),
            new Emoji(new String(new int[]{0x1f303}, 0, 1), R.drawable.emoji_1f303),
            new Emoji(new String(new int[]{0x1f304}, 0, 1), R.drawable.emoji_1f304),
            new Emoji(new String(new int[]{0x1f305}, 0, 1), R.drawable.emoji_1f305),
            new Emoji(new String(new int[]{0x1f306}, 0, 1), R.drawable.emoji_1f306),
            new Emoji(new String(new int[]{0x1f307}, 0, 1), R.drawable.emoji_1f307),
            new Emoji(new String(new int[]{0x1f309}, 0, 1), R.drawable.emoji_1f309),
            new Emoji(new String(new int[]{0x1f30c}, 0, 1), R.drawable.emoji_1f30c),
            new Emoji(new String(new int[]{0x1f3a0}, 0, 1), R.drawable.emoji_1f3a0),
            new Emoji(new String(new int[]{0x1f3a1}, 0, 1), R.drawable.emoji_1f3a1),
            new Emoji(new String(new int[]{0x1f3a2}, 0, 1), R.drawable.emoji_1f3a2),
            new Emoji(new String(new int[]{0x1f682}, 0, 1), R.drawable.emoji_1f682),
            new Emoji(new String(new int[]{0x1f683}, 0, 1), R.drawable.emoji_1f683),
            new Emoji(new String(new int[]{0x1f684}, 0, 1), R.drawable.emoji_1f684),
            new Emoji(new String(new int[]{0x1f685}, 0, 1), R.drawable.emoji_1f685),
            new Emoji(new String(new int[]{0x1f686}, 0, 1), R.drawable.emoji_1f686),
            new Emoji(new String(new int[]{0x1f687}, 0, 1), R.drawable.emoji_1f687),
            new Emoji(new String(new int[]{0x1f688}, 0, 1), R.drawable.emoji_1f688),
            new Emoji(new String(new int[]{0x1f689}, 0, 1), R.drawable.emoji_1f689),
            new Emoji(new String(new int[]{0x1f68a}, 0, 1), R.drawable.emoji_1f68a),
            new Emoji(new String(new int[]{0x1f69d}, 0, 1), R.drawable.emoji_1f69d),
            new Emoji(new String(new int[]{0x1f69e}, 0, 1), R.drawable.emoji_1f69e),
            new Emoji(new String(new int[]{0x1f68b}, 0, 1), R.drawable.emoji_1f68b),
            new Emoji(new String(new int[]{0x1f68c}, 0, 1), R.drawable.emoji_1f68c),
            new Emoji(new String(new int[]{0x1f68d}, 0, 1), R.drawable.emoji_1f68d),
            new Emoji(new String(new int[]{0x1f68e}, 0, 1), R.drawable.emoji_1f68e),
            new Emoji(new String(new int[]{0x1f690}, 0, 1), R.drawable.emoji_1f690),
            new Emoji(new String(new int[]{0x1f691}, 0, 1), R.drawable.emoji_1f691),
            new Emoji(new String(new int[]{0x1f692}, 0, 1), R.drawable.emoji_1f692),
            new Emoji(new String(new int[]{0x1f693}, 0, 1), R.drawable.emoji_1f693),
            new Emoji(new String(new int[]{0x1f694}, 0, 1), R.drawable.emoji_1f694),
            new Emoji(new String(new int[]{0x1f695}, 0, 1), R.drawable.emoji_1f695),
            new Emoji(new String(new int[]{0x1f696}, 0, 1), R.drawable.emoji_1f696),
            new Emoji(new String(new int[]{0x1f697}, 0, 1), R.drawable.emoji_1f697),
            new Emoji(new String(new int[]{0x1f698}, 0, 1), R.drawable.emoji_1f698),
            new Emoji(new String(new int[]{0x1f699}, 0, 1), R.drawable.emoji_1f699),
            new Emoji(new String(new int[]{0x1f69a}, 0, 1), R.drawable.emoji_1f69a),
            new Emoji(new String(new int[]{0x1f69b}, 0, 1), R.drawable.emoji_1f69b),
            new Emoji(new String(new int[]{0x1f69c}, 0, 1), R.drawable.emoji_1f69c),
            new Emoji(new String(new int[]{0x1f6b2}, 0, 1), R.drawable.emoji_1f6b2),
            new Emoji(new String(new int[]{0x1f6f4}, 0, 1), R.drawable.emoji_1f6f4),
            new Emoji(new String(new int[]{0x1f6f5}, 0, 1), R.drawable.emoji_1f6f5),
            new Emoji(new String(new int[]{0x1f68f}, 0, 1), R.drawable.emoji_1f68f),
            new Emoji(new String(new int[]{0x1f6e3}, 0, 1), R.drawable.emoji_1f6e3),
            new Emoji(new String(new int[]{0x1f6e4}, 0, 1), R.drawable.emoji_1f6e4),
            new Emoji(new String(new int[]{0x26fd}, 0, 1), R.drawable.emoji_26fd),
            new Emoji(new String(new int[]{0x1f6a8}, 0, 1), R.drawable.emoji_1f6a8),
            new Emoji(new String(new int[]{0x1f6a5}, 0, 1), R.drawable.emoji_1f6a5),
            new Emoji(new String(new int[]{0x1f6a6}, 0, 1), R.drawable.emoji_1f6a6),
            new Emoji(new String(new int[]{0x1f6a7}, 0, 1), R.drawable.emoji_1f6a7),
            new Emoji(new String(new int[]{0x2693}, 0, 1), R.drawable.emoji_2693),
            new Emoji(new String(new int[]{0x26f5}, 0, 1), R.drawable.emoji_26f5),
            new Emoji(new String(new int[]{0x1f6f6}, 0, 1), R.drawable.emoji_1f6f6),
            new Emoji(new String(new int[]{0x1f6a4}, 0, 1), R.drawable.emoji_1f6a4),
            new Emoji(new String(new int[]{0x1f6f3}, 0, 1), R.drawable.emoji_1f6f3),
            new Emoji(new String(new int[]{0x26f4}, 0, 1), R.drawable.emoji_26f4),
            new Emoji(new String(new int[]{0x1f6e5}, 0, 1), R.drawable.emoji_1f6e5),
            new Emoji(new String(new int[]{0x1f6a2}, 0, 1), R.drawable.emoji_1f6a2),
            new Emoji(new String(new int[]{0x2708}, 0, 1), R.drawable.emoji_2708),
            new Emoji(new String(new int[]{0x1f6e9}, 0, 1), R.drawable.emoji_1f6e9),
            new Emoji(new String(new int[]{0x1f6eb}, 0, 1), R.drawable.emoji_1f6eb),
            new Emoji(new String(new int[]{0x1f6ec}, 0, 1), R.drawable.emoji_1f6ec),
            new Emoji(new String(new int[]{0x1f4ba}, 0, 1), R.drawable.emoji_1f4ba),
            new Emoji(new String(new int[]{0x1f681}, 0, 1), R.drawable.emoji_1f681),
            new Emoji(new String(new int[]{0x1f69f}, 0, 1), R.drawable.emoji_1f69f),
            new Emoji(new String(new int[]{0x1f6a0}, 0, 1), R.drawable.emoji_1f6a0),
            new Emoji(new String(new int[]{0x1f6a1}, 0, 1), R.drawable.emoji_1f6a1),
            new Emoji(new String(new int[]{0x1f680}, 0, 1), R.drawable.emoji_1f680),
            new Emoji(new String(new int[]{0x1f6f0}, 0, 1), R.drawable.emoji_1f6f0),
            new Emoji(new String(new int[]{0x1f320}, 0, 1), R.drawable.emoji_1f320),
            new Emoji(new String(new int[]{0x26f1}, 0, 1), R.drawable.emoji_26f1),
            new Emoji(new String(new int[]{0x1f386}, 0, 1), R.drawable.emoji_1f386),
            new Emoji(new String(new int[]{0x1f387}, 0, 1), R.drawable.emoji_1f387),
            new Emoji(new String(new int[]{0x1f391}, 0, 1), R.drawable.emoji_1f391),
            new Emoji(new String(new int[]{0x1f5ff}, 0, 1), R.drawable.emoji_1f5ff)
    };

    @Override
    @NonNull
    public Emoji[] getEmojis() {
        return DATA;
    }

    @Override
    @DrawableRes
    public int getIcon() {
        return R.drawable.emoji_category_places;
    }
}
