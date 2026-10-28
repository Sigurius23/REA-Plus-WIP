package io.getstream.chat.android.client.token;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/chat/android/client/token/ConstantTokenProvider;", "Lio/getstream/chat/android/client/token/TokenProvider;", "token", "", "<init>", "(Ljava/lang/String;)V", "loadToken", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ConstantTokenProvider implements TokenProvider {
    private final String token;

    public ConstantTokenProvider(String token) {
        AbstractC22676k.m65750j(token, "token");
        this.token = token;
    }

    @Override // io.getstream.chat.android.client.token.TokenProvider
    /* JADX INFO: renamed from: loadToken, reason: from getter */
    public final String getToken() {
        return this.token;
    }
}
