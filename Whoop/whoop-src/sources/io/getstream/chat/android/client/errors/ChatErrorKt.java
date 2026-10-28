package io.getstream.chat.android.client.errors;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.net.ConnectException;
import java.net.UnknownHostException;
import n23.AbstractC26202e;
import n23.C26198a;
import n23.C26199b;
import n23.C26200c;
import n23.C26201d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u001a1\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0010\u001a\u00020\n*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0005*\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, m65681d2 = {"Ln23/b;", "Lio/getstream/chat/android/client/errors/ChatErrorCode;", "chatErrorCode", "", "statusCode", "", "cause", "Ln23/c;", "fromChatErrorCode", "(Ln23/b;Lio/getstream/chat/android/client/errors/ChatErrorCode;ILjava/lang/Throwable;)Ln23/c;", "Ln23/e;", "", "isPermanent", "(Ln23/e;)Z", "", "message", "copyWithMessage", "(Ln23/e;Ljava/lang/String;)Ln23/e;", "extractCause", "(Ln23/e;)Ljava/lang/Throwable;", "HTTP_TOO_MANY_REQUESTS", "I", "HTTP_TIMEOUT", "HTTP_API_ERROR", "stream-chat-android-core"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatErrorKt {
    private static final int HTTP_API_ERROR = 500;
    private static final int HTTP_TIMEOUT = 408;
    private static final int HTTP_TOO_MANY_REQUESTS = 429;

    @InternalStreamChatApi
    public static final AbstractC26202e copyWithMessage(AbstractC26202e abstractC26202e, String message) {
        AbstractC22676k.m65750j(abstractC26202e, "<this>");
        AbstractC22676k.m65750j(message, "message");
        if (abstractC26202e instanceof C26198a) {
            return new C26198a(message);
        }
        if (abstractC26202e instanceof C26200c) {
            C26200c c26200c = (C26200c) abstractC26202e;
            return new C26200c(message, c26200c.f103913b, c26200c.f103914c, c26200c.f103915d);
        }
        if (!(abstractC26202e instanceof C26201d)) {
            throw new NoWhenBranchMatchedException();
        }
        Throwable cause = ((C26201d) abstractC26202e).f103917b;
        AbstractC22676k.m65750j(cause, "cause");
        return new C26201d(message, cause);
    }

    @InternalStreamChatApi
    public static final Throwable extractCause(AbstractC26202e abstractC26202e) {
        AbstractC22676k.m65750j(abstractC26202e, "<this>");
        if (abstractC26202e instanceof C26198a) {
            return null;
        }
        if (abstractC26202e instanceof C26200c) {
            return ((C26200c) abstractC26202e).f103915d;
        }
        if (abstractC26202e instanceof C26201d) {
            return ((C26201d) abstractC26202e).f103917b;
        }
        throw new NoWhenBranchMatchedException();
    }

    @InternalStreamChatApi
    public static final C26200c fromChatErrorCode(C26199b c26199b, ChatErrorCode chatErrorCode, int i13, Throwable th3) {
        AbstractC22676k.m65750j(c26199b, "<this>");
        AbstractC22676k.m65750j(chatErrorCode, "chatErrorCode");
        return new C26200c(chatErrorCode.getDescription(), chatErrorCode.getCode(), i13, th3);
    }

    public static /* synthetic */ C26200c fromChatErrorCode$default(C26199b c26199b, ChatErrorCode chatErrorCode, int i13, Throwable th3, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = -1;
        }
        if ((i14 & 4) != 0) {
            th3 = null;
        }
        return fromChatErrorCode(c26199b, chatErrorCode, i13, th3);
    }

    @InternalStreamChatApi
    public static final boolean isPermanent(AbstractC26202e abstractC26202e) {
        AbstractC22676k.m65750j(abstractC26202e, "<this>");
        if (abstractC26202e instanceof C26200c) {
            C26200c c26200c = (C26200c) abstractC26202e;
            if (AbstractC37056f.m118959K(Integer.valueOf(HTTP_TOO_MANY_REQUESTS), Integer.valueOf(HTTP_TIMEOUT), Integer.valueOf(HTTP_API_ERROR)).contains(Integer.valueOf(c26200c.f103914c))) {
                return false;
            }
            Throwable th3 = c26200c.f103915d;
            if (!(th3 instanceof UnknownHostException) && !(th3 instanceof ConnectException)) {
                return true;
            }
        }
        return false;
    }
}
