package io.getstream.chat.android.client.errors;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import n23.C26200c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Ln23/c;", "", "isStatusBadRequest", "(Ln23/c;)Z", "isValidationError", "", "HTTP_BAD_REQUEST", "I", "stream-chat-android-core"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NetworkErrorKt {
    private static final int HTTP_BAD_REQUEST = 400;

    @InternalStreamChatApi
    public static final boolean isStatusBadRequest(C26200c c26200c) {
        AbstractC22676k.m65750j(c26200c, "<this>");
        return c26200c.f103914c == HTTP_BAD_REQUEST;
    }

    @InternalStreamChatApi
    public static final boolean isValidationError(C26200c c26200c) {
        AbstractC22676k.m65750j(c26200c, "<this>");
        return c26200c.f103913b == ChatErrorCode.VALIDATION_ERROR.getCode();
    }
}
