package io.getstream.chat.android.client.utils;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/utils/TimeProvider;", "", "<init>", "()V", "MILLIS_TO_SECONDS_FACTOR", "", "provideCurrentTimeInSeconds", "provideCurrentTimeInMilliseconds", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class TimeProvider {
    public static final TimeProvider INSTANCE = new TimeProvider();
    private static final long MILLIS_TO_SECONDS_FACTOR = 1000;

    private TimeProvider() {
    }

    public final long provideCurrentTimeInMilliseconds() {
        return System.currentTimeMillis();
    }

    public final long provideCurrentTimeInSeconds() {
        return System.currentTimeMillis() / 1000;
    }
}
