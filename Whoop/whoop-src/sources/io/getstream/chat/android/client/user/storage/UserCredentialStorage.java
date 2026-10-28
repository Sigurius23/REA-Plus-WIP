package io.getstream.chat.android.client.user.storage;

import io.getstream.chat.android.client.user.CredentialConfig;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/user/storage/UserCredentialStorage;", "", "Lio/getstream/chat/android/client/user/CredentialConfig;", "credentialConfig", "Ll83/a0;", "put", "(Lio/getstream/chat/android/client/user/CredentialConfig;)V", "get", "()Lio/getstream/chat/android/client/user/CredentialConfig;", "clear", "()V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface UserCredentialStorage {
    void clear();

    CredentialConfig get();

    void put(CredentialConfig credentialConfig);
}
