package io.getstream.chat.android.client.user;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/client/user/CredentialConfig;", "", "userId", "", "userToken", "userName", "isAnonymous", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getUserId", "()Ljava/lang/String;", "getUserToken", "getUserName", "()Z", "isValid", "isValid$stream_chat_android_client_release", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CredentialConfig {
    private final boolean isAnonymous;
    private final String userId;
    private final String userName;
    private final String userToken;

    public CredentialConfig(String userId, String userToken, String userName, boolean z4) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(userToken, "userToken");
        AbstractC22676k.m65750j(userName, "userName");
        this.userId = userId;
        this.userToken = userToken;
        this.userName = userName;
        this.isAnonymous = z4;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    /* JADX INFO: renamed from: isAnonymous, reason: from getter */
    public final boolean getIsAnonymous() {
        return this.isAnonymous;
    }

    public final boolean isValid$stream_chat_android_client_release() {
        return this.userId.length() > 0 && this.userToken.length() > 0 && this.userName.length() > 0;
    }
}
