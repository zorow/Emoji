package com.vanniktech.emoji.ios.category;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;

import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.ios.R;

@SuppressWarnings({"checkstyle:magicnumber", "PMD.MethodReturnsInternalArray"})
public class SymbolsCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[]{
            new Emoji(new String(new int[]{0x1f441, 0xfe0f, 0x200d, 0x1f5e8, 0xfe0f}, 0, 5), R.drawable.emoji_1f441_fe0f_200d_1f5e8_fe0f),
            new Emoji(new String(new int[]{0x1f498}, 0, 1), R.drawable.emoji_1f498),
            new Emoji(new String(new int[]{0x2764}, 0, 1), R.drawable.emoji_2764),
            new Emoji(new String(new int[]{0x1f493}, 0, 1), R.drawable.emoji_1f493),
            new Emoji(new String(new int[]{0x1f494}, 0, 1), R.drawable.emoji_1f494),
            new Emoji(new String(new int[]{0x1f495}, 0, 1), R.drawable.emoji_1f495),
            new Emoji(new String(new int[]{0x1f496}, 0, 1), R.drawable.emoji_1f496),
            new Emoji(new String(new int[]{0x1f497}, 0, 1), R.drawable.emoji_1f497),
            new Emoji(new String(new int[]{0x1f499}, 0, 1), R.drawable.emoji_1f499),
            new Emoji(new String(new int[]{0x1f49a}, 0, 1), R.drawable.emoji_1f49a),
            new Emoji(new String(new int[]{0x1f49b}, 0, 1), R.drawable.emoji_1f49b),
            new Emoji(new String(new int[]{0x1f49c}, 0, 1), R.drawable.emoji_1f49c),
            new Emoji(new String(new int[]{0x1f5a4}, 0, 1), R.drawable.emoji_1f5a4),
            new Emoji(new String(new int[]{0x1f49d}, 0, 1), R.drawable.emoji_1f49d),
            new Emoji(new String(new int[]{0x1f49e}, 0, 1), R.drawable.emoji_1f49e),
            new Emoji(new String(new int[]{0x1f49f}, 0, 1), R.drawable.emoji_1f49f),
            new Emoji(new String(new int[]{0x2763}, 0, 1), R.drawable.emoji_2763),
            new Emoji(new String(new int[]{0x1f4a4}, 0, 1), R.drawable.emoji_1f4a4),
            new Emoji(new String(new int[]{0x1f4a2}, 0, 1), R.drawable.emoji_1f4a2),
            new Emoji(new String(new int[]{0x1f4ac}, 0, 1), R.drawable.emoji_1f4ac),
            new Emoji(new String(new int[]{0x1f5ef}, 0, 1), R.drawable.emoji_1f5ef),
            new Emoji(new String(new int[]{0x1f4ad}, 0, 1), R.drawable.emoji_1f4ad),
            new Emoji(new String(new int[]{0x1f4ae}, 0, 1), R.drawable.emoji_1f4ae),
            new Emoji(new String(new int[]{0x1f310}, 0, 1), R.drawable.emoji_1f310),
            new Emoji(new String(new int[]{0x2668}, 0, 1), R.drawable.emoji_2668),
            new Emoji(new String(new int[]{0x1f6d1}, 0, 1), R.drawable.emoji_1f6d1),
            new Emoji(new String(new int[]{0x1f55b}, 0, 1), R.drawable.emoji_1f55b),
            new Emoji(new String(new int[]{0x1f567}, 0, 1), R.drawable.emoji_1f567),
            new Emoji(new String(new int[]{0x1f550}, 0, 1), R.drawable.emoji_1f550),
            new Emoji(new String(new int[]{0x1f55c}, 0, 1), R.drawable.emoji_1f55c),
            new Emoji(new String(new int[]{0x1f551}, 0, 1), R.drawable.emoji_1f551),
            new Emoji(new String(new int[]{0x1f55d}, 0, 1), R.drawable.emoji_1f55d),
            new Emoji(new String(new int[]{0x1f552}, 0, 1), R.drawable.emoji_1f552),
            new Emoji(new String(new int[]{0x1f55e}, 0, 1), R.drawable.emoji_1f55e),
            new Emoji(new String(new int[]{0x1f553}, 0, 1), R.drawable.emoji_1f553),
            new Emoji(new String(new int[]{0x1f55f}, 0, 1), R.drawable.emoji_1f55f),
            new Emoji(new String(new int[]{0x1f554}, 0, 1), R.drawable.emoji_1f554),
            new Emoji(new String(new int[]{0x1f560}, 0, 1), R.drawable.emoji_1f560),
            new Emoji(new String(new int[]{0x1f555}, 0, 1), R.drawable.emoji_1f555),
            new Emoji(new String(new int[]{0x1f561}, 0, 1), R.drawable.emoji_1f561),
            new Emoji(new String(new int[]{0x1f556}, 0, 1), R.drawable.emoji_1f556),
            new Emoji(new String(new int[]{0x1f562}, 0, 1), R.drawable.emoji_1f562),
            new Emoji(new String(new int[]{0x1f557}, 0, 1), R.drawable.emoji_1f557),
            new Emoji(new String(new int[]{0x1f563}, 0, 1), R.drawable.emoji_1f563),
            new Emoji(new String(new int[]{0x1f558}, 0, 1), R.drawable.emoji_1f558),
            new Emoji(new String(new int[]{0x1f564}, 0, 1), R.drawable.emoji_1f564),
            new Emoji(new String(new int[]{0x1f559}, 0, 1), R.drawable.emoji_1f559),
            new Emoji(new String(new int[]{0x1f565}, 0, 1), R.drawable.emoji_1f565),
            new Emoji(new String(new int[]{0x1f55a}, 0, 1), R.drawable.emoji_1f55a),
            new Emoji(new String(new int[]{0x1f566}, 0, 1), R.drawable.emoji_1f566),
            new Emoji(new String(new int[]{0x1f300}, 0, 1), R.drawable.emoji_1f300),
            new Emoji(new String(new int[]{0x2660}, 0, 1), R.drawable.emoji_2660),
            new Emoji(new String(new int[]{0x2665}, 0, 1), R.drawable.emoji_2665),
            new Emoji(new String(new int[]{0x2666}, 0, 1), R.drawable.emoji_2666),
            new Emoji(new String(new int[]{0x2663}, 0, 1), R.drawable.emoji_2663),
            new Emoji(new String(new int[]{0x1f0cf}, 0, 1), R.drawable.emoji_1f0cf),
            new Emoji(new String(new int[]{0x1f004}, 0, 1), R.drawable.emoji_1f004),
            new Emoji(new String(new int[]{0x1f3b4}, 0, 1), R.drawable.emoji_1f3b4),
            new Emoji(new String(new int[]{0x1f507}, 0, 1), R.drawable.emoji_1f507),
            new Emoji(new String(new int[]{0x1f508}, 0, 1), R.drawable.emoji_1f508),
            new Emoji(new String(new int[]{0x1f509}, 0, 1), R.drawable.emoji_1f509),
            new Emoji(new String(new int[]{0x1f50a}, 0, 1), R.drawable.emoji_1f50a),
            new Emoji(new String(new int[]{0x1f4e2}, 0, 1), R.drawable.emoji_1f4e2),
            new Emoji(new String(new int[]{0x1f4e3}, 0, 1), R.drawable.emoji_1f4e3),
            new Emoji(new String(new int[]{0x1f514}, 0, 1), R.drawable.emoji_1f514),
            new Emoji(new String(new int[]{0x1f515}, 0, 1), R.drawable.emoji_1f515),
            new Emoji(new String(new int[]{0x1f3b5}, 0, 1), R.drawable.emoji_1f3b5),
            new Emoji(new String(new int[]{0x1f3b6}, 0, 1), R.drawable.emoji_1f3b6),
            new Emoji(new String(new int[]{0x1f4b9}, 0, 1), R.drawable.emoji_1f4b9),
            new Emoji(new String(new int[]{0x1f4b1}, 0, 1), R.drawable.emoji_1f4b1),
            new Emoji(new String(new int[]{0x1f4b2}, 0, 1), R.drawable.emoji_1f4b2),
            new Emoji(new String(new int[]{0x1f3e7}, 0, 1), R.drawable.emoji_1f3e7),
            new Emoji(new String(new int[]{0x1f6ae}, 0, 1), R.drawable.emoji_1f6ae),
            new Emoji(new String(new int[]{0x267f}, 0, 1), R.drawable.emoji_267f),
            new Emoji(new String(new int[]{0x1f6b9}, 0, 1), R.drawable.emoji_1f6b9),
            new Emoji(new String(new int[]{0x1f6ba}, 0, 1), R.drawable.emoji_1f6ba),
            new Emoji(new String(new int[]{0x1f6bb}, 0, 1), R.drawable.emoji_1f6bb),
            new Emoji(new String(new int[]{0x1f6bc}, 0, 1), R.drawable.emoji_1f6bc),
            new Emoji(new String(new int[]{0x1f6be}, 0, 1), R.drawable.emoji_1f6be),
            new Emoji(new String(new int[]{0x1f6c2}, 0, 1), R.drawable.emoji_1f6c2),
            new Emoji(new String(new int[]{0x1f6c3}, 0, 1), R.drawable.emoji_1f6c3),
            new Emoji(new String(new int[]{0x1f6c4}, 0, 1), R.drawable.emoji_1f6c4),
            new Emoji(new String(new int[]{0x1f6c5}, 0, 1), R.drawable.emoji_1f6c5),
            new Emoji(new String(new int[]{0x26a0}, 0, 1), R.drawable.emoji_26a0),
            new Emoji(new String(new int[]{0x1f6b8}, 0, 1), R.drawable.emoji_1f6b8),
            new Emoji(new String(new int[]{0x26d4}, 0, 1), R.drawable.emoji_26d4),
            new Emoji(new String(new int[]{0x1f6ab}, 0, 1), R.drawable.emoji_1f6ab),
            new Emoji(new String(new int[]{0x1f6b3}, 0, 1), R.drawable.emoji_1f6b3),
            new Emoji(new String(new int[]{0x1f6ad}, 0, 1), R.drawable.emoji_1f6ad),
            new Emoji(new String(new int[]{0x1f6af}, 0, 1), R.drawable.emoji_1f6af),
            new Emoji(new String(new int[]{0x1f6b1}, 0, 1), R.drawable.emoji_1f6b1),
            new Emoji(new String(new int[]{0x1f6b7}, 0, 1), R.drawable.emoji_1f6b7),
            new Emoji(new String(new int[]{0x1f4f5}, 0, 1), R.drawable.emoji_1f4f5),
            new Emoji(new String(new int[]{0x1f51e}, 0, 1), R.drawable.emoji_1f51e),
            new Emoji(new String(new int[]{0x2622}, 0, 1), R.drawable.emoji_2622),
            new Emoji(new String(new int[]{0x2623}, 0, 1), R.drawable.emoji_2623),
            new Emoji(new String(new int[]{0x2b06}, 0, 1), R.drawable.emoji_2b06),
            new Emoji(new String(new int[]{0x2197}, 0, 1), R.drawable.emoji_2197),
            new Emoji(new String(new int[]{0x27a1}, 0, 1), R.drawable.emoji_27a1),
            new Emoji(new String(new int[]{0x2198}, 0, 1), R.drawable.emoji_2198),
            new Emoji(new String(new int[]{0x2b07}, 0, 1), R.drawable.emoji_2b07),
            new Emoji(new String(new int[]{0x2199}, 0, 1), R.drawable.emoji_2199),
            new Emoji(new String(new int[]{0x2b05}, 0, 1), R.drawable.emoji_2b05),
            new Emoji(new String(new int[]{0x2196}, 0, 1), R.drawable.emoji_2196),
            new Emoji(new String(new int[]{0x2195}, 0, 1), R.drawable.emoji_2195),
            new Emoji(new String(new int[]{0x2194}, 0, 1), R.drawable.emoji_2194),
            new Emoji(new String(new int[]{0x21a9}, 0, 1), R.drawable.emoji_21a9),
            new Emoji(new String(new int[]{0x21aa}, 0, 1), R.drawable.emoji_21aa),
            new Emoji(new String(new int[]{0x2934}, 0, 1), R.drawable.emoji_2934),
            new Emoji(new String(new int[]{0x2935}, 0, 1), R.drawable.emoji_2935),
            new Emoji(new String(new int[]{0x1f503}, 0, 1), R.drawable.emoji_1f503),
            new Emoji(new String(new int[]{0x1f504}, 0, 1), R.drawable.emoji_1f504),
            new Emoji(new String(new int[]{0x1f519}, 0, 1), R.drawable.emoji_1f519),
            new Emoji(new String(new int[]{0x1f51a}, 0, 1), R.drawable.emoji_1f51a),
            new Emoji(new String(new int[]{0x1f51b}, 0, 1), R.drawable.emoji_1f51b),
            new Emoji(new String(new int[]{0x1f51c}, 0, 1), R.drawable.emoji_1f51c),
            new Emoji(new String(new int[]{0x1f51d}, 0, 1), R.drawable.emoji_1f51d),
            new Emoji(new String(new int[]{0x1f6d0}, 0, 1), R.drawable.emoji_1f6d0),
            new Emoji(new String(new int[]{0x269b}, 0, 1), R.drawable.emoji_269b),
            new Emoji(new String(new int[]{0x1f549}, 0, 1), R.drawable.emoji_1f549),
            new Emoji(new String(new int[]{0x2721}, 0, 1), R.drawable.emoji_2721),
            new Emoji(new String(new int[]{0x2638}, 0, 1), R.drawable.emoji_2638),
            new Emoji(new String(new int[]{0x262f}, 0, 1), R.drawable.emoji_262f),
            new Emoji(new String(new int[]{0x271d}, 0, 1), R.drawable.emoji_271d),
            new Emoji(new String(new int[]{0x2626}, 0, 1), R.drawable.emoji_2626),
            new Emoji(new String(new int[]{0x262a}, 0, 1), R.drawable.emoji_262a),
            new Emoji(new String(new int[]{0x262e}, 0, 1), R.drawable.emoji_262e),
            new Emoji(new String(new int[]{0x1f54e}, 0, 1), R.drawable.emoji_1f54e),
            new Emoji(new String(new int[]{0x1f52f}, 0, 1), R.drawable.emoji_1f52f),
            new Emoji(new String(new int[]{0x2648}, 0, 1), R.drawable.emoji_2648),
            new Emoji(new String(new int[]{0x2649}, 0, 1), R.drawable.emoji_2649),
            new Emoji(new String(new int[]{0x264a}, 0, 1), R.drawable.emoji_264a),
            new Emoji(new String(new int[]{0x264b}, 0, 1), R.drawable.emoji_264b),
            new Emoji(new String(new int[]{0x264c}, 0, 1), R.drawable.emoji_264c),
            new Emoji(new String(new int[]{0x264d}, 0, 1), R.drawable.emoji_264d),
            new Emoji(new String(new int[]{0x264e}, 0, 1), R.drawable.emoji_264e),
            new Emoji(new String(new int[]{0x264f}, 0, 1), R.drawable.emoji_264f),
            new Emoji(new String(new int[]{0x2650}, 0, 1), R.drawable.emoji_2650),
            new Emoji(new String(new int[]{0x2651}, 0, 1), R.drawable.emoji_2651),
            new Emoji(new String(new int[]{0x2652}, 0, 1), R.drawable.emoji_2652),
            new Emoji(new String(new int[]{0x2653}, 0, 1), R.drawable.emoji_2653),
            new Emoji(new String(new int[]{0x26ce}, 0, 1), R.drawable.emoji_26ce),
            new Emoji(new String(new int[]{0x1f500}, 0, 1), R.drawable.emoji_1f500),
            new Emoji(new String(new int[]{0x1f501}, 0, 1), R.drawable.emoji_1f501),
            new Emoji(new String(new int[]{0x1f502}, 0, 1), R.drawable.emoji_1f502),
            new Emoji(new String(new int[]{0x25b6}, 0, 1), R.drawable.emoji_25b6),
            new Emoji(new String(new int[]{0x23e9}, 0, 1), R.drawable.emoji_23e9),
            new Emoji(new String(new int[]{0x23ed}, 0, 1), R.drawable.emoji_23ed),
            new Emoji(new String(new int[]{0x23ef}, 0, 1), R.drawable.emoji_23ef),
            new Emoji(new String(new int[]{0x25c0}, 0, 1), R.drawable.emoji_25c0),
            new Emoji(new String(new int[]{0x23ea}, 0, 1), R.drawable.emoji_23ea),
            new Emoji(new String(new int[]{0x23ee}, 0, 1), R.drawable.emoji_23ee),
            new Emoji(new String(new int[]{0x1f53c}, 0, 1), R.drawable.emoji_1f53c),
            new Emoji(new String(new int[]{0x23eb}, 0, 1), R.drawable.emoji_23eb),
            new Emoji(new String(new int[]{0x1f53d}, 0, 1), R.drawable.emoji_1f53d),
            new Emoji(new String(new int[]{0x23ec}, 0, 1), R.drawable.emoji_23ec),
            new Emoji(new String(new int[]{0x23f8}, 0, 1), R.drawable.emoji_23f8),
            new Emoji(new String(new int[]{0x23f9}, 0, 1), R.drawable.emoji_23f9),
            new Emoji(new String(new int[]{0x23fa}, 0, 1), R.drawable.emoji_23fa),
            new Emoji(new String(new int[]{0x1f3a6}, 0, 1), R.drawable.emoji_1f3a6),
            new Emoji(new String(new int[]{0x1f505}, 0, 1), R.drawable.emoji_1f505),
            new Emoji(new String(new int[]{0x1f506}, 0, 1), R.drawable.emoji_1f506),
            new Emoji(new String(new int[]{0x1f4f6}, 0, 1), R.drawable.emoji_1f4f6),
            new Emoji(new String(new int[]{0x1f4f3}, 0, 1), R.drawable.emoji_1f4f3),
            new Emoji(new String(new int[]{0x1f4f4}, 0, 1), R.drawable.emoji_1f4f4),
            new Emoji(new String(new int[]{0x267b}, 0, 1), R.drawable.emoji_267b),
            new Emoji(new String(new int[]{0x1f4db}, 0, 1), R.drawable.emoji_1f4db),
            new Emoji(new String(new int[]{0x269c}, 0, 1), R.drawable.emoji_269c),
            new Emoji(new String(new int[]{0x1f530}, 0, 1), R.drawable.emoji_1f530),
            new Emoji(new String(new int[]{0x1f531}, 0, 1), R.drawable.emoji_1f531),
            new Emoji(new String(new int[]{0x2b55}, 0, 1), R.drawable.emoji_2b55),
            new Emoji(new String(new int[]{0x2705}, 0, 1), R.drawable.emoji_2705),
            new Emoji(new String(new int[]{0x2611}, 0, 1), R.drawable.emoji_2611),
            new Emoji(new String(new int[]{0x2714}, 0, 1), R.drawable.emoji_2714),
            new Emoji(new String(new int[]{0x2716}, 0, 1), R.drawable.emoji_2716),
            new Emoji(new String(new int[]{0x274c}, 0, 1), R.drawable.emoji_274c),
            new Emoji(new String(new int[]{0x274e}, 0, 1), R.drawable.emoji_274e),
            new Emoji(new String(new int[]{0x2795}, 0, 1), R.drawable.emoji_2795),
            new Emoji(new String(new int[]{0x2796}, 0, 1), R.drawable.emoji_2796),
            new Emoji(new String(new int[]{0x2797}, 0, 1), R.drawable.emoji_2797),
            new Emoji(new String(new int[]{0x27b0}, 0, 1), R.drawable.emoji_27b0),
            new Emoji(new String(new int[]{0x27bf}, 0, 1), R.drawable.emoji_27bf),
            new Emoji(new String(new int[]{0x303d}, 0, 1), R.drawable.emoji_303d),
            new Emoji(new String(new int[]{0x2733}, 0, 1), R.drawable.emoji_2733),
            new Emoji(new String(new int[]{0x2734}, 0, 1), R.drawable.emoji_2734),
            new Emoji(new String(new int[]{0x2747}, 0, 1), R.drawable.emoji_2747),
            new Emoji(new String(new int[]{0x203c}, 0, 1), R.drawable.emoji_203c),
            new Emoji(new String(new int[]{0x2049}, 0, 1), R.drawable.emoji_2049),
            new Emoji(new String(new int[]{0x2753}, 0, 1), R.drawable.emoji_2753),
            new Emoji(new String(new int[]{0x2754}, 0, 1), R.drawable.emoji_2754),
            new Emoji(new String(new int[]{0x2755}, 0, 1), R.drawable.emoji_2755),
            new Emoji(new String(new int[]{0x2757}, 0, 1), R.drawable.emoji_2757),
            new Emoji(new String(new int[]{0x3030}, 0, 1), R.drawable.emoji_3030),
            new Emoji(new String(new int[]{0x00a9}, 0, 1), R.drawable.emoji_00a9),
            new Emoji(new String(new int[]{0x00ae}, 0, 1), R.drawable.emoji_00ae),
            new Emoji(new String(new int[]{0x2122}, 0, 1), R.drawable.emoji_2122),
            new Emoji(new String(new int[]{0x0023, 0xfe0f, 0x20e3}, 0, 3), R.drawable.emoji_0023_fe0f_20e3),
            new Emoji(new String(new int[]{0x002a, 0xfe0f, 0x20e3}, 0, 3), R.drawable.emoji_002a_fe0f_20e3),
            new Emoji(new String(new int[]{0x0030, 0xfe0f, 0x20e3}, 0, 3), R.drawable.emoji_0030_fe0f_20e3),
            new Emoji(new String(new int[]{0x0031, 0xfe0f, 0x20e3}, 0, 3), R.drawable.emoji_0031_fe0f_20e3),
            new Emoji(new String(new int[]{0x0032, 0xfe0f, 0x20e3}, 0, 3), R.drawable.emoji_0032_fe0f_20e3),
            new Emoji(new String(new int[]{0x0033, 0xfe0f, 0x20e3}, 0, 3), R.drawable.emoji_0033_fe0f_20e3),
            new Emoji(new String(new int[]{0x0034, 0xfe0f, 0x20e3}, 0, 3), R.drawable.emoji_0034_fe0f_20e3),
            new Emoji(new String(new int[]{0x0035, 0xfe0f, 0x20e3}, 0, 3), R.drawable.emoji_0035_fe0f_20e3),
            new Emoji(new String(new int[]{0x0036, 0xfe0f, 0x20e3}, 0, 3), R.drawable.emoji_0036_fe0f_20e3),
            new Emoji(new String(new int[]{0x0037, 0xfe0f, 0x20e3}, 0, 3), R.drawable.emoji_0037_fe0f_20e3),
            new Emoji(new String(new int[]{0x0038, 0xfe0f, 0x20e3}, 0, 3), R.drawable.emoji_0038_fe0f_20e3),
            new Emoji(new String(new int[]{0x0039, 0xfe0f, 0x20e3}, 0, 3), R.drawable.emoji_0039_fe0f_20e3),
            new Emoji(new String(new int[]{0x1f51f}, 0, 1), R.drawable.emoji_1f51f),
            new Emoji(new String(new int[]{0x1f4af}, 0, 1), R.drawable.emoji_1f4af),
            new Emoji(new String(new int[]{0x1f520}, 0, 1), R.drawable.emoji_1f520),
            new Emoji(new String(new int[]{0x1f521}, 0, 1), R.drawable.emoji_1f521),
            new Emoji(new String(new int[]{0x1f522}, 0, 1), R.drawable.emoji_1f522),
            new Emoji(new String(new int[]{0x1f523}, 0, 1), R.drawable.emoji_1f523),
            new Emoji(new String(new int[]{0x1f524}, 0, 1), R.drawable.emoji_1f524),
            new Emoji(new String(new int[]{0x1f170}, 0, 1), R.drawable.emoji_1f170),
            new Emoji(new String(new int[]{0x1f18e}, 0, 1), R.drawable.emoji_1f18e),
            new Emoji(new String(new int[]{0x1f171}, 0, 1), R.drawable.emoji_1f171),
            new Emoji(new String(new int[]{0x1f191}, 0, 1), R.drawable.emoji_1f191),
            new Emoji(new String(new int[]{0x1f192}, 0, 1), R.drawable.emoji_1f192),
            new Emoji(new String(new int[]{0x1f193}, 0, 1), R.drawable.emoji_1f193),
            new Emoji(new String(new int[]{0x2139}, 0, 1), R.drawable.emoji_2139),
            new Emoji(new String(new int[]{0x1f194}, 0, 1), R.drawable.emoji_1f194),
            new Emoji(new String(new int[]{0x24c2}, 0, 1), R.drawable.emoji_24c2),
            new Emoji(new String(new int[]{0x1f195}, 0, 1), R.drawable.emoji_1f195),
            new Emoji(new String(new int[]{0x1f196}, 0, 1), R.drawable.emoji_1f196),
            new Emoji(new String(new int[]{0x1f17e}, 0, 1), R.drawable.emoji_1f17e),
            new Emoji(new String(new int[]{0x1f197}, 0, 1), R.drawable.emoji_1f197),
            new Emoji(new String(new int[]{0x1f17f}, 0, 1), R.drawable.emoji_1f17f),
            new Emoji(new String(new int[]{0x1f198}, 0, 1), R.drawable.emoji_1f198),
            new Emoji(new String(new int[]{0x1f199}, 0, 1), R.drawable.emoji_1f199),
            new Emoji(new String(new int[]{0x1f19a}, 0, 1), R.drawable.emoji_1f19a),
            new Emoji(new String(new int[]{0x1f201}, 0, 1), R.drawable.emoji_1f201),
            new Emoji(new String(new int[]{0x1f202}, 0, 1), R.drawable.emoji_1f202),
            new Emoji(new String(new int[]{0x1f237}, 0, 1), R.drawable.emoji_1f237),
            new Emoji(new String(new int[]{0x1f236}, 0, 1), R.drawable.emoji_1f236),
            new Emoji(new String(new int[]{0x1f22f}, 0, 1), R.drawable.emoji_1f22f),
            new Emoji(new String(new int[]{0x1f250}, 0, 1), R.drawable.emoji_1f250),
            new Emoji(new String(new int[]{0x1f239}, 0, 1), R.drawable.emoji_1f239),
            new Emoji(new String(new int[]{0x1f21a}, 0, 1), R.drawable.emoji_1f21a),
            new Emoji(new String(new int[]{0x1f232}, 0, 1), R.drawable.emoji_1f232),
            new Emoji(new String(new int[]{0x1f251}, 0, 1), R.drawable.emoji_1f251),
            new Emoji(new String(new int[]{0x1f238}, 0, 1), R.drawable.emoji_1f238),
            new Emoji(new String(new int[]{0x1f234}, 0, 1), R.drawable.emoji_1f234),
            new Emoji(new String(new int[]{0x1f233}, 0, 1), R.drawable.emoji_1f233),
            new Emoji(new String(new int[]{0x3297}, 0, 1), R.drawable.emoji_3297),
            new Emoji(new String(new int[]{0x3299}, 0, 1), R.drawable.emoji_3299),
            new Emoji(new String(new int[]{0x1f23a}, 0, 1), R.drawable.emoji_1f23a),
            new Emoji(new String(new int[]{0x1f235}, 0, 1), R.drawable.emoji_1f235),
            new Emoji(new String(new int[]{0x25aa}, 0, 1), R.drawable.emoji_25aa),
            new Emoji(new String(new int[]{0x25ab}, 0, 1), R.drawable.emoji_25ab),
            new Emoji(new String(new int[]{0x25fb}, 0, 1), R.drawable.emoji_25fb),
            new Emoji(new String(new int[]{0x25fc}, 0, 1), R.drawable.emoji_25fc),
            new Emoji(new String(new int[]{0x25fd}, 0, 1), R.drawable.emoji_25fd),
            new Emoji(new String(new int[]{0x25fe}, 0, 1), R.drawable.emoji_25fe),
            new Emoji(new String(new int[]{0x2b1b}, 0, 1), R.drawable.emoji_2b1b),
            new Emoji(new String(new int[]{0x2b1c}, 0, 1), R.drawable.emoji_2b1c),
            new Emoji(new String(new int[]{0x1f536}, 0, 1), R.drawable.emoji_1f536),
            new Emoji(new String(new int[]{0x1f537}, 0, 1), R.drawable.emoji_1f537),
            new Emoji(new String(new int[]{0x1f538}, 0, 1), R.drawable.emoji_1f538),
            new Emoji(new String(new int[]{0x1f539}, 0, 1), R.drawable.emoji_1f539),
            new Emoji(new String(new int[]{0x1f53a}, 0, 1), R.drawable.emoji_1f53a),
            new Emoji(new String(new int[]{0x1f53b}, 0, 1), R.drawable.emoji_1f53b),
            new Emoji(new String(new int[]{0x1f4a0}, 0, 1), R.drawable.emoji_1f4a0),
            new Emoji(new String(new int[]{0x1f518}, 0, 1), R.drawable.emoji_1f518),
            new Emoji(new String(new int[]{0x1f532}, 0, 1), R.drawable.emoji_1f532),
            new Emoji(new String(new int[]{0x1f533}, 0, 1), R.drawable.emoji_1f533),
            new Emoji(new String(new int[]{0x26aa}, 0, 1), R.drawable.emoji_26aa),
            new Emoji(new String(new int[]{0x26ab}, 0, 1), R.drawable.emoji_26ab),
            new Emoji(new String(new int[]{0x1f534}, 0, 1), R.drawable.emoji_1f534),
            new Emoji(new String(new int[]{0x1f535}, 0, 1), R.drawable.emoji_1f535)
    };

    @Override
    @NonNull
    public Emoji[] getEmojis() {
        return DATA;
    }

    @Override
    @DrawableRes
    public int getIcon() {
        return R.drawable.emoji_category_symbols;
    }
}
