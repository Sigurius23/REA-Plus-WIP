package io.getstream.chat.android.p226ui.utils.extensions;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import e93.AbstractC12889b;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0001H\u0007\u001a\b\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, m65681d2 = {"dpToPx", "", "dpToPxPrecise", "", "displayMetrics", "Landroid/util/DisplayMetrics;", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class IntKt {
    public static final DisplayMetrics displayMetrics() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        AbstractC22676k.m65749i(displayMetrics, "getDisplayMetrics(...)");
        return displayMetrics;
    }

    @InternalStreamChatApi
    public static final int dpToPx(int i13) {
        return AbstractC12889b.m36258X(dpToPxPrecise(i13));
    }

    @InternalStreamChatApi
    public static final float dpToPxPrecise(int i13) {
        return i13 * displayMetrics().density;
    }
}
