package io.getstream.chat.android.client.user.storage;

import android.content.Context;
import android.content.SharedPreferences;
import io.getstream.chat.android.client.user.CredentialConfig;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/client/user/storage/SharedPreferencesCredentialStorage;", "Lio/getstream/chat/android/client/user/storage/UserCredentialStorage;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lio/getstream/chat/android/client/user/CredentialConfig;", "get", "()Lio/getstream/chat/android/client/user/CredentialConfig;", "Ll83/a0;", "clear", "()V", "credentialConfig", "put", "(Lio/getstream/chat/android/client/user/CredentialConfig;)V", "Landroid/content/SharedPreferences;", "prefs", "Landroid/content/SharedPreferences;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SharedPreferencesCredentialStorage implements UserCredentialStorage {
    private static final String KEY_IS_ANONYMOUS = "is_anonymous";
    private static final String KEY_USER_ID = "user_id";
    private static final String KEY_USER_NAME = "user_name";
    private static final String KEY_USER_TOKEN = "user_token";
    private static final String SYNC_CONFIG_PREFS_NAME = "stream_credential_config_store";
    private final SharedPreferences prefs;

    public SharedPreferencesCredentialStorage(Context context) {
        AbstractC22676k.m65750j(context, "context");
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(SYNC_CONFIG_PREFS_NAME, 0);
        AbstractC22676k.m65749i(sharedPreferences, "getSharedPreferences(...)");
        this.prefs = sharedPreferences;
    }

    @Override // io.getstream.chat.android.client.user.storage.UserCredentialStorage
    public final void clear() {
        this.prefs.edit().clear().apply();
    }

    @Override // io.getstream.chat.android.client.user.storage.UserCredentialStorage
    public final CredentialConfig get() {
        SharedPreferences sharedPreferences = this.prefs;
        String string = sharedPreferences.getString(KEY_USER_ID, "");
        if (string == null) {
            string = "";
        }
        String string2 = sharedPreferences.getString(KEY_USER_TOKEN, "");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = sharedPreferences.getString(KEY_USER_NAME, "");
        CredentialConfig credentialConfig = new CredentialConfig(string, string2, string3 != null ? string3 : "", sharedPreferences.getBoolean(KEY_IS_ANONYMOUS, false));
        if (credentialConfig.isValid$stream_chat_android_client_release()) {
            return credentialConfig;
        }
        return null;
    }

    @Override // io.getstream.chat.android.client.user.storage.UserCredentialStorage
    public final void put(CredentialConfig credentialConfig) {
        AbstractC22676k.m65750j(credentialConfig, "credentialConfig");
        SharedPreferences.Editor editorEdit = this.prefs.edit();
        editorEdit.putString(KEY_USER_ID, credentialConfig.getUserId());
        editorEdit.putString(KEY_USER_TOKEN, credentialConfig.getUserToken());
        editorEdit.putString(KEY_USER_NAME, credentialConfig.getUserName());
        editorEdit.putBoolean(KEY_IS_ANONYMOUS, credentialConfig.getIsAnonymous());
        editorEdit.apply();
    }
}
