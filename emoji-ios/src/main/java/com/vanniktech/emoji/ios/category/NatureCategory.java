package com.vanniktech.emoji.ios.category;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;

import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.ios.R;

@SuppressWarnings({"checkstyle:magicnumber", "PMD.MethodReturnsInternalArray"})
public class NatureCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[]{
            new Emoji(new String(new int[]{0x1f648}, 0, 1), R.drawable.emoji_1f648),
            new Emoji(new String(new int[]{0x1f649}, 0, 1), R.drawable.emoji_1f649),
            new Emoji(new String(new int[]{0x1f64a}, 0, 1), R.drawable.emoji_1f64a),
            new Emoji(new String(new int[]{0x1f4a5}, 0, 1), R.drawable.emoji_1f4a5),
            new Emoji(new String(new int[]{0x1f4a6}, 0, 1), R.drawable.emoji_1f4a6),
            new Emoji(new String(new int[]{0x1f4a8}, 0, 1), R.drawable.emoji_1f4a8),
            new Emoji(new String(new int[]{0x1f4ab}, 0, 1), R.drawable.emoji_1f4ab),
            new Emoji(new String(new int[]{0x1f435}, 0, 1), R.drawable.emoji_1f435),
            new Emoji(new String(new int[]{0x1f412}, 0, 1), R.drawable.emoji_1f412),
            new Emoji(new String(new int[]{0x1f98d}, 0, 1), R.drawable.emoji_1f98d),
            new Emoji(new String(new int[]{0x1f436}, 0, 1), R.drawable.emoji_1f436),
            new Emoji(new String(new int[]{0x1f415}, 0, 1), R.drawable.emoji_1f415),
            new Emoji(new String(new int[]{0x1f429}, 0, 1), R.drawable.emoji_1f429),
            new Emoji(new String(new int[]{0x1f43a}, 0, 1), R.drawable.emoji_1f43a),
            new Emoji(new String(new int[]{0x1f98a}, 0, 1), R.drawable.emoji_1f98a),
            new Emoji(new String(new int[]{0x1f431}, 0, 1), R.drawable.emoji_1f431),
            new Emoji(new String(new int[]{0x1f408}, 0, 1), R.drawable.emoji_1f408),
            new Emoji(new String(new int[]{0x1f981}, 0, 1), R.drawable.emoji_1f981),
            new Emoji(new String(new int[]{0x1f42f}, 0, 1), R.drawable.emoji_1f42f),
            new Emoji(new String(new int[]{0x1f405}, 0, 1), R.drawable.emoji_1f405),
            new Emoji(new String(new int[]{0x1f406}, 0, 1), R.drawable.emoji_1f406),
            new Emoji(new String(new int[]{0x1f434}, 0, 1), R.drawable.emoji_1f434),
            new Emoji(new String(new int[]{0x1f40e}, 0, 1), R.drawable.emoji_1f40e),
            new Emoji(new String(new int[]{0x1f98c}, 0, 1), R.drawable.emoji_1f98c),
            new Emoji(new String(new int[]{0x1f984}, 0, 1), R.drawable.emoji_1f984),
            new Emoji(new String(new int[]{0x1f42e}, 0, 1), R.drawable.emoji_1f42e),
            new Emoji(new String(new int[]{0x1f402}, 0, 1), R.drawable.emoji_1f402),
            new Emoji(new String(new int[]{0x1f403}, 0, 1), R.drawable.emoji_1f403),
            new Emoji(new String(new int[]{0x1f404}, 0, 1), R.drawable.emoji_1f404),
            new Emoji(new String(new int[]{0x1f437}, 0, 1), R.drawable.emoji_1f437),
            new Emoji(new String(new int[]{0x1f416}, 0, 1), R.drawable.emoji_1f416),
            new Emoji(new String(new int[]{0x1f417}, 0, 1), R.drawable.emoji_1f417),
            new Emoji(new String(new int[]{0x1f43d}, 0, 1), R.drawable.emoji_1f43d),
            new Emoji(new String(new int[]{0x1f40f}, 0, 1), R.drawable.emoji_1f40f),
            new Emoji(new String(new int[]{0x1f411}, 0, 1), R.drawable.emoji_1f411),
            new Emoji(new String(new int[]{0x1f410}, 0, 1), R.drawable.emoji_1f410),
            new Emoji(new String(new int[]{0x1f42a}, 0, 1), R.drawable.emoji_1f42a),
            new Emoji(new String(new int[]{0x1f42b}, 0, 1), R.drawable.emoji_1f42b),
            new Emoji(new String(new int[]{0x1f418}, 0, 1), R.drawable.emoji_1f418),
            new Emoji(new String(new int[]{0x1f98f}, 0, 1), R.drawable.emoji_1f98f),
            new Emoji(new String(new int[]{0x1f42d}, 0, 1), R.drawable.emoji_1f42d),
            new Emoji(new String(new int[]{0x1f401}, 0, 1), R.drawable.emoji_1f401),
            new Emoji(new String(new int[]{0x1f400}, 0, 1), R.drawable.emoji_1f400),
            new Emoji(new String(new int[]{0x1f439}, 0, 1), R.drawable.emoji_1f439),
            new Emoji(new String(new int[]{0x1f430}, 0, 1), R.drawable.emoji_1f430),
            new Emoji(new String(new int[]{0x1f407}, 0, 1), R.drawable.emoji_1f407),
            new Emoji(new String(new int[]{0x1f43f}, 0, 1), R.drawable.emoji_1f43f),
            new Emoji(new String(new int[]{0x1f987}, 0, 1), R.drawable.emoji_1f987),
            new Emoji(new String(new int[]{0x1f43b}, 0, 1), R.drawable.emoji_1f43b),
            new Emoji(new String(new int[]{0x1f428}, 0, 1), R.drawable.emoji_1f428),
            new Emoji(new String(new int[]{0x1f43c}, 0, 1), R.drawable.emoji_1f43c),
            new Emoji(new String(new int[]{0x1f43e}, 0, 1), R.drawable.emoji_1f43e),
            new Emoji(new String(new int[]{0x1f983}, 0, 1), R.drawable.emoji_1f983),
            new Emoji(new String(new int[]{0x1f414}, 0, 1), R.drawable.emoji_1f414),
            new Emoji(new String(new int[]{0x1f413}, 0, 1), R.drawable.emoji_1f413),
            new Emoji(new String(new int[]{0x1f423}, 0, 1), R.drawable.emoji_1f423),
            new Emoji(new String(new int[]{0x1f424}, 0, 1), R.drawable.emoji_1f424),
            new Emoji(new String(new int[]{0x1f425}, 0, 1), R.drawable.emoji_1f425),
            new Emoji(new String(new int[]{0x1f426}, 0, 1), R.drawable.emoji_1f426),
            new Emoji(new String(new int[]{0x1f427}, 0, 1), R.drawable.emoji_1f427),
            new Emoji(new String(new int[]{0x1f54a}, 0, 1), R.drawable.emoji_1f54a),
            new Emoji(new String(new int[]{0x1f985}, 0, 1), R.drawable.emoji_1f985),
            new Emoji(new String(new int[]{0x1f986}, 0, 1), R.drawable.emoji_1f986),
            new Emoji(new String(new int[]{0x1f989}, 0, 1), R.drawable.emoji_1f989),
            new Emoji(new String(new int[]{0x1f438}, 0, 1), R.drawable.emoji_1f438),
            new Emoji(new String(new int[]{0x1f40a}, 0, 1), R.drawable.emoji_1f40a),
            new Emoji(new String(new int[]{0x1f422}, 0, 1), R.drawable.emoji_1f422),
            new Emoji(new String(new int[]{0x1f98e}, 0, 1), R.drawable.emoji_1f98e),
            new Emoji(new String(new int[]{0x1f40d}, 0, 1), R.drawable.emoji_1f40d),
            new Emoji(new String(new int[]{0x1f432}, 0, 1), R.drawable.emoji_1f432),
            new Emoji(new String(new int[]{0x1f409}, 0, 1), R.drawable.emoji_1f409),
            new Emoji(new String(new int[]{0x1f433}, 0, 1), R.drawable.emoji_1f433),
            new Emoji(new String(new int[]{0x1f40b}, 0, 1), R.drawable.emoji_1f40b),
            new Emoji(new String(new int[]{0x1f42c}, 0, 1), R.drawable.emoji_1f42c),
            new Emoji(new String(new int[]{0x1f41f}, 0, 1), R.drawable.emoji_1f41f),
            new Emoji(new String(new int[]{0x1f420}, 0, 1), R.drawable.emoji_1f420),
            new Emoji(new String(new int[]{0x1f421}, 0, 1), R.drawable.emoji_1f421),
            new Emoji(new String(new int[]{0x1f988}, 0, 1), R.drawable.emoji_1f988),
            new Emoji(new String(new int[]{0x1f419}, 0, 1), R.drawable.emoji_1f419),
            new Emoji(new String(new int[]{0x1f41a}, 0, 1), R.drawable.emoji_1f41a),
            new Emoji(new String(new int[]{0x1f980}, 0, 1), R.drawable.emoji_1f980),
            new Emoji(new String(new int[]{0x1f990}, 0, 1), R.drawable.emoji_1f990),
            new Emoji(new String(new int[]{0x1f991}, 0, 1), R.drawable.emoji_1f991),
            new Emoji(new String(new int[]{0x1f98b}, 0, 1), R.drawable.emoji_1f98b),
            new Emoji(new String(new int[]{0x1f40c}, 0, 1), R.drawable.emoji_1f40c),
            new Emoji(new String(new int[]{0x1f41b}, 0, 1), R.drawable.emoji_1f41b),
            new Emoji(new String(new int[]{0x1f41c}, 0, 1), R.drawable.emoji_1f41c),
            new Emoji(new String(new int[]{0x1f41d}, 0, 1), R.drawable.emoji_1f41d),
            new Emoji(new String(new int[]{0x1f41e}, 0, 1), R.drawable.emoji_1f41e),
            new Emoji(new String(new int[]{0x1f577}, 0, 1), R.drawable.emoji_1f577),
            new Emoji(new String(new int[]{0x1f578}, 0, 1), R.drawable.emoji_1f578),
            new Emoji(new String(new int[]{0x1f982}, 0, 1), R.drawable.emoji_1f982),
            new Emoji(new String(new int[]{0x1f490}, 0, 1), R.drawable.emoji_1f490),
            new Emoji(new String(new int[]{0x1f338}, 0, 1), R.drawable.emoji_1f338),
            new Emoji(new String(new int[]{0x1f339}, 0, 1), R.drawable.emoji_1f339),
            new Emoji(new String(new int[]{0x1f940}, 0, 1), R.drawable.emoji_1f940),
            new Emoji(new String(new int[]{0x1f33a}, 0, 1), R.drawable.emoji_1f33a),
            new Emoji(new String(new int[]{0x1f33b}, 0, 1), R.drawable.emoji_1f33b),
            new Emoji(new String(new int[]{0x1f33c}, 0, 1), R.drawable.emoji_1f33c),
            new Emoji(new String(new int[]{0x1f337}, 0, 1), R.drawable.emoji_1f337),
            new Emoji(new String(new int[]{0x1f331}, 0, 1), R.drawable.emoji_1f331),
            new Emoji(new String(new int[]{0x1f332}, 0, 1), R.drawable.emoji_1f332),
            new Emoji(new String(new int[]{0x1f333}, 0, 1), R.drawable.emoji_1f333),
            new Emoji(new String(new int[]{0x1f334}, 0, 1), R.drawable.emoji_1f334),
            new Emoji(new String(new int[]{0x1f335}, 0, 1), R.drawable.emoji_1f335),
            new Emoji(new String(new int[]{0x1f33e}, 0, 1), R.drawable.emoji_1f33e),
            new Emoji(new String(new int[]{0x1f33f}, 0, 1), R.drawable.emoji_1f33f),
            new Emoji(new String(new int[]{0x2618}, 0, 1), R.drawable.emoji_2618),
            new Emoji(new String(new int[]{0x1f340}, 0, 1), R.drawable.emoji_1f340),
            new Emoji(new String(new int[]{0x1f341}, 0, 1), R.drawable.emoji_1f341),
            new Emoji(new String(new int[]{0x1f342}, 0, 1), R.drawable.emoji_1f342),
            new Emoji(new String(new int[]{0x1f343}, 0, 1), R.drawable.emoji_1f343),
            new Emoji(new String(new int[]{0x1f344}, 0, 1), R.drawable.emoji_1f344),
            new Emoji(new String(new int[]{0x1f30d}, 0, 1), R.drawable.emoji_1f30d),
            new Emoji(new String(new int[]{0x1f30e}, 0, 1), R.drawable.emoji_1f30e),
            new Emoji(new String(new int[]{0x1f30f}, 0, 1), R.drawable.emoji_1f30f),
            new Emoji(new String(new int[]{0x1f311}, 0, 1), R.drawable.emoji_1f311),
            new Emoji(new String(new int[]{0x1f312}, 0, 1), R.drawable.emoji_1f312),
            new Emoji(new String(new int[]{0x1f313}, 0, 1), R.drawable.emoji_1f313),
            new Emoji(new String(new int[]{0x1f314}, 0, 1), R.drawable.emoji_1f314),
            new Emoji(new String(new int[]{0x1f315}, 0, 1), R.drawable.emoji_1f315),
            new Emoji(new String(new int[]{0x1f316}, 0, 1), R.drawable.emoji_1f316),
            new Emoji(new String(new int[]{0x1f317}, 0, 1), R.drawable.emoji_1f317),
            new Emoji(new String(new int[]{0x1f318}, 0, 1), R.drawable.emoji_1f318),
            new Emoji(new String(new int[]{0x1f319}, 0, 1), R.drawable.emoji_1f319),
            new Emoji(new String(new int[]{0x1f31a}, 0, 1), R.drawable.emoji_1f31a),
            new Emoji(new String(new int[]{0x1f31b}, 0, 1), R.drawable.emoji_1f31b),
            new Emoji(new String(new int[]{0x1f31c}, 0, 1), R.drawable.emoji_1f31c),
            new Emoji(new String(new int[]{0x2600}, 0, 1), R.drawable.emoji_2600),
            new Emoji(new String(new int[]{0x1f31d}, 0, 1), R.drawable.emoji_1f31d),
            new Emoji(new String(new int[]{0x1f31e}, 0, 1), R.drawable.emoji_1f31e),
            new Emoji(new String(new int[]{0x2b50}, 0, 1), R.drawable.emoji_2b50),
            new Emoji(new String(new int[]{0x1f31f}, 0, 1), R.drawable.emoji_1f31f),
            new Emoji(new String(new int[]{0x2601}, 0, 1), R.drawable.emoji_2601),
            new Emoji(new String(new int[]{0x26c5}, 0, 1), R.drawable.emoji_26c5),
            new Emoji(new String(new int[]{0x26c8}, 0, 1), R.drawable.emoji_26c8),
            new Emoji(new String(new int[]{0x1f324}, 0, 1), R.drawable.emoji_1f324),
            new Emoji(new String(new int[]{0x1f325}, 0, 1), R.drawable.emoji_1f325),
            new Emoji(new String(new int[]{0x1f326}, 0, 1), R.drawable.emoji_1f326),
            new Emoji(new String(new int[]{0x1f327}, 0, 1), R.drawable.emoji_1f327),
            new Emoji(new String(new int[]{0x1f328}, 0, 1), R.drawable.emoji_1f328),
            new Emoji(new String(new int[]{0x1f329}, 0, 1), R.drawable.emoji_1f329),
            new Emoji(new String(new int[]{0x1f32a}, 0, 1), R.drawable.emoji_1f32a),
            new Emoji(new String(new int[]{0x1f32b}, 0, 1), R.drawable.emoji_1f32b),
            new Emoji(new String(new int[]{0x1f32c}, 0, 1), R.drawable.emoji_1f32c),
            new Emoji(new String(new int[]{0x1f308}, 0, 1), R.drawable.emoji_1f308),
            new Emoji(new String(new int[]{0x2614}, 0, 1), R.drawable.emoji_2614),
            new Emoji(new String(new int[]{0x26a1}, 0, 1), R.drawable.emoji_26a1),
            new Emoji(new String(new int[]{0x2744}, 0, 1), R.drawable.emoji_2744),
            new Emoji(new String(new int[]{0x2603}, 0, 1), R.drawable.emoji_2603),
            new Emoji(new String(new int[]{0x26c4}, 0, 1), R.drawable.emoji_26c4),
            new Emoji(new String(new int[]{0x2604}, 0, 1), R.drawable.emoji_2604),
            new Emoji(new String(new int[]{0x1f525}, 0, 1), R.drawable.emoji_1f525),
            new Emoji(new String(new int[]{0x1f4a7}, 0, 1), R.drawable.emoji_1f4a7),
            new Emoji(new String(new int[]{0x1f30a}, 0, 1), R.drawable.emoji_1f30a),
            new Emoji(new String(new int[]{0x1f384}, 0, 1), R.drawable.emoji_1f384),
            new Emoji(new String(new int[]{0x2728}, 0, 1), R.drawable.emoji_2728),
            new Emoji(new String(new int[]{0x1f38b}, 0, 1), R.drawable.emoji_1f38b),
            new Emoji(new String(new int[]{0x1f38d}, 0, 1), R.drawable.emoji_1f38d)
    };

    @Override
    @NonNull
    public Emoji[] getEmojis() {
        return DATA;
    }

    @Override
    @DrawableRes
    public int getIcon() {
        return R.drawable.emoji_category_nature;
    }
}
