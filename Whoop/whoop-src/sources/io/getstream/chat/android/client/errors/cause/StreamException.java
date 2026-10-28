package io.getstream.chat.android.client.errors.cause;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004B\u0013\b\u0014\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0003\u0010\u0007B\u001d\b\u0014\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0003\u0010\nB\u0013\b\u0014\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0003\u0010\u000b\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/client/errors/cause/StreamException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "message", "", "(Ljava/lang/String;)V", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "Lio/getstream/chat/android/client/errors/cause/StreamChannelNotFoundException;", "Lio/getstream/chat/android/client/errors/cause/StreamCodeException;", "Lio/getstream/chat/android/client/errors/cause/StreamSdkException;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class StreamException extends Exception {
    public /* synthetic */ StreamException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private StreamException() {
    }

    private StreamException(String str) {
        super(str);
    }

    public StreamException(String str, DefaultConstructorMarker defaultConstructorMarker) {
        super(str);
    }

    private StreamException(String str, Throwable th3) {
        super(str, th3);
    }

    public StreamException(String str, Throwable th3, DefaultConstructorMarker defaultConstructorMarker) {
        super(str, th3);
    }

    private StreamException(Throwable th3) {
        super(th3);
    }

    public StreamException(Throwable th3, DefaultConstructorMarker defaultConstructorMarker) {
        super(th3);
    }
}
