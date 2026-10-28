package io.getstream.chat.android.p226ui.common.images.internal;

import android.graphics.Bitmap;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"safeConfig", "Landroid/graphics/Bitmap$Config;", "Landroid/graphics/Bitmap;", "getSafeConfig", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap$Config;", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class RoundedCornersTransformationKt {
    public static final Bitmap.Config getSafeConfig(Bitmap bitmap) {
        AbstractC22676k.m65750j(bitmap, "<this>");
        Bitmap.Config config = bitmap.getConfig();
        return config == null ? Bitmap.Config.ARGB_8888 : config;
    }
}
