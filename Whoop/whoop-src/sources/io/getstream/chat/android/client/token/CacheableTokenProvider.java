package io.getstream.chat.android.client.token;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\b\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/client/token/CacheableTokenProvider;", "Lio/getstream/chat/android/client/token/TokenProvider;", "tokenProvider", "<init>", "(Lio/getstream/chat/android/client/token/TokenProvider;)V", "cachedToken", "", "loadToken", "getCachedToken", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CacheableTokenProvider implements TokenProvider {
    private volatile String cachedToken;
    private final TokenProvider tokenProvider;

    public CacheableTokenProvider(TokenProvider tokenProvider) {
        AbstractC22676k.m65750j(tokenProvider, "tokenProvider");
        this.tokenProvider = tokenProvider;
        this.cachedToken = "";
    }

    public final String getCachedToken() {
        return this.cachedToken;
    }

    @Override // io.getstream.chat.android.client.token.TokenProvider
    public final String loadToken() {
        String strLoadToken;
        String str = this.cachedToken;
        synchronized (this) {
            strLoadToken = this.cachedToken;
            if (AbstractC22676k.m65745e(strLoadToken, str)) {
                strLoadToken = null;
            }
            if (strLoadToken == null) {
                strLoadToken = this.tokenProvider.loadToken();
                this.cachedToken = strLoadToken;
            }
        }
        return strLoadToken;
    }
}
