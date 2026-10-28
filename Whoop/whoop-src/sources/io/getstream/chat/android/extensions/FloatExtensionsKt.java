package io.getstream.chat.android.extensions;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0001H\u0007¨\u0006\u0006"}, m65681d2 = {"limitTo", "", "min", "max", "isInt", "", "stream-chat-android-core"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FloatExtensionsKt {
    @InternalStreamChatApi
    public static final boolean isInt(float f13) {
        return f13 - ((float) ((int) f13)) <= 0.0f;
    }

    @InternalStreamChatApi
    public static final float limitTo(float f13, float f14, float f15) {
        if (f13 < f14) {
            return f14;
        }
        return f13 > f15 ? f15 : f13;
    }
}
