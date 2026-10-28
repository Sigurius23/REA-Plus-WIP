package io.getstream.chat.android.client.errors.cause;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b6\u0018\u00002\u00020\u0001B\t\b\u0014¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0014\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0002\u0010\u0006B\u001d\b\u0014\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\tB\u0013\b\u0014\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/client/errors/cause/StreamCodeException;", "Lio/getstream/chat/android/client/errors/cause/StreamException;", "<init>", "()V", "message", "", "(Ljava/lang/String;)V", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class StreamCodeException extends StreamException {
    public /* synthetic */ StreamCodeException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private StreamCodeException(String str) {
        super(str);
    }

    public StreamCodeException(String str, DefaultConstructorMarker defaultConstructorMarker) {
        super(str);
    }

    private StreamCodeException(String str, Throwable th3) {
        super(str, th3);
    }

    public StreamCodeException(String str, Throwable th3, DefaultConstructorMarker defaultConstructorMarker) {
        super(str, th3);
    }

    private StreamCodeException(Throwable th3) {
        super(th3);
    }

    public StreamCodeException(Throwable th3, DefaultConstructorMarker defaultConstructorMarker) {
        super(th3);
    }

    private StreamCodeException() {
        super((DefaultConstructorMarker) null);
    }
}
