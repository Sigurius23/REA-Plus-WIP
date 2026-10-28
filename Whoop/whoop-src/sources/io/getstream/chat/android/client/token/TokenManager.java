package io.getstream.chat.android.client.token;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H&¢\u0006\u0004\b\u0010\u0010\u0007J\u000f\u0010\u0011\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/token/TokenManager;", "", "Ll83/a0;", "ensureTokenLoaded", "()V", "", "loadSync", "()Ljava/lang/String;", "expireToken", "", "hasTokenProvider", "()Z", "Lio/getstream/chat/android/client/token/CacheableTokenProvider;", "provider", "setTokenProvider", "(Lio/getstream/chat/android/client/token/CacheableTokenProvider;)V", "getToken", "hasToken", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface TokenManager {
    void ensureTokenLoaded();

    void expireToken();

    String getToken();

    boolean hasToken();

    boolean hasTokenProvider();

    String loadSync();

    void setTokenProvider(CacheableTokenProvider provider);
}
