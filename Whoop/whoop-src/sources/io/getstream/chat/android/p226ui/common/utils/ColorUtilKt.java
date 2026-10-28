package io.getstream.chat.android.p226ui.common.utils;

import android.graphics.Color;
import e93.AbstractC12889b;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"adjustColorBrightness", "", "color", "factor", "", "MAX_COLOR_COMPONENT_VALUE", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ColorUtilKt {
    private static final int MAX_COLOR_COMPONENT_VALUE = 255;

    @InternalStreamChatApi
    public static final int adjustColorBrightness(int i13, float f13) {
        int iAlpha = Color.alpha(i13);
        int iM36258X = AbstractC12889b.m36258X(Color.red(i13) * f13);
        int iM36258X2 = AbstractC12889b.m36258X(Color.green(i13) * f13);
        int iM36258X3 = AbstractC12889b.m36258X(Color.blue(i13) * f13);
        if (iM36258X > MAX_COLOR_COMPONENT_VALUE) {
            iM36258X = MAX_COLOR_COMPONENT_VALUE;
        }
        if (iM36258X2 > MAX_COLOR_COMPONENT_VALUE) {
            iM36258X2 = MAX_COLOR_COMPONENT_VALUE;
        }
        if (iM36258X3 > MAX_COLOR_COMPONENT_VALUE) {
            iM36258X3 = MAX_COLOR_COMPONENT_VALUE;
        }
        return Color.argb(iAlpha, iM36258X, iM36258X2, iM36258X3);
    }
}
