package io.getstream.chat.android.client.logger;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000f\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0010\u0010\fJ'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/logger/ChatLoggerHandler;", "", "", "throwable", "Ll83/a0;", "logT", "(Ljava/lang/Throwable;)V", "tag", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "", "message", "logI", "(Ljava/lang/Object;Ljava/lang/String;)V", "logD", "logV", "logW", "logE", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Throwable;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChatLoggerHandler {
    void logD(Object tag, String message);

    void logE(Object tag, String message);

    void logE(Object tag, String message, Throwable throwable);

    void logI(Object tag, String message);

    void logT(Object tag, Throwable throwable);

    void logT(Throwable throwable);

    default void logV(Object tag, String message) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
    }

    void logW(Object tag, String message);
}
