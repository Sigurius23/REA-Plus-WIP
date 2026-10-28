package io.getstream.chat.android.client.token;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/client/token/TokenManagerImpl;", "Lio/getstream/chat/android/client/token/TokenManager;", "<init>", "()V", "Ll83/a0;", "ensureTokenLoaded", "", "loadSync", "()Ljava/lang/String;", "Lio/getstream/chat/android/client/token/CacheableTokenProvider;", "provider", "setTokenProvider", "(Lio/getstream/chat/android/client/token/CacheableTokenProvider;)V", "", "hasTokenProvider", "()Z", "getToken", "hasToken", "expireToken", "token", "Ljava/lang/String;", "Lio/getstream/chat/android/client/token/TokenProvider;", "Lio/getstream/chat/android/client/token/TokenProvider;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class TokenManagerImpl implements TokenManager {
    public static final String EMPTY_TOKEN = "";
    private TokenProvider provider;
    private volatile String token = "";

    @Override // io.getstream.chat.android.client.token.TokenManager
    public final void ensureTokenLoaded() {
        if (hasToken()) {
            return;
        }
        loadSync();
    }

    @Override // io.getstream.chat.android.client.token.TokenManager
    public final void expireToken() {
        this.token = "";
    }

    @Override // io.getstream.chat.android.client.token.TokenManager
    public final String getToken() {
        return this.token;
    }

    @Override // io.getstream.chat.android.client.token.TokenManager
    public final boolean hasToken() {
        return !AbstractC22676k.m65745e(this.token, "");
    }

    @Override // io.getstream.chat.android.client.token.TokenManager
    public final boolean hasTokenProvider() {
        return this.provider != null;
    }

    @Override // io.getstream.chat.android.client.token.TokenManager
    public final String loadSync() {
        TokenProvider tokenProvider = this.provider;
        if (tokenProvider == null) {
            AbstractC22676k.m65757q("provider");
            throw null;
        }
        String token = tokenProvider.getToken();
        this.token = token;
        return token;
    }

    @Override // io.getstream.chat.android.client.token.TokenManager
    public final void setTokenProvider(CacheableTokenProvider provider) {
        AbstractC22676k.m65750j(provider, "provider");
        this.provider = provider;
        this.token = provider.getCachedToken();
    }
}
