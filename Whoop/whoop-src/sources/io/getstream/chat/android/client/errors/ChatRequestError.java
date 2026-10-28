package io.getstream.chat.android.client.errors;

import java.io.IOException;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/client/errors/ChatRequestError;", "Ljava/io/IOException;", "message", "", "streamCode", "", "statusCode", "cause", "", "<init>", "(Ljava/lang/String;IILjava/lang/Throwable;)V", "getStreamCode", "()I", "getStatusCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatRequestError extends IOException {
    private final int statusCode;
    private final int streamCode;

    public /* synthetic */ ChatRequestError(String str, int i13, int i14, Throwable th3, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, i14, (i15 & 8) != 0 ? null : th3);
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final int getStreamCode() {
        return this.streamCode;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        int i13 = this.streamCode;
        int i14 = this.statusCode;
        String message = getMessage();
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "streamCode: ", ", statusCode: ", ", message: ");
        sbM30465s.append(message);
        return sbM30465s.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRequestError(String message, int i13, int i14, Throwable th3) {
        super(message, th3);
        AbstractC22676k.m65750j(message, "message");
        this.streamCode = i13;
        this.statusCode = i14;
    }
}
