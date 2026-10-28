package io.getstream.chat.android.client.extensions;

import android.content.SharedPreferences;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0087\b¨\u0006\u0005"}, m65681d2 = {"getNonNullString", "", "Landroid/content/SharedPreferences;", "key", "defaultValue", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SharedPreferencesKt {
    @InternalStreamChatApi
    public static final String getNonNullString(SharedPreferences sharedPreferences, String key, String defaultValue) {
        AbstractC22676k.m65750j(sharedPreferences, "<this>");
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(defaultValue, "defaultValue");
        String string = sharedPreferences.getString(key, defaultValue);
        AbstractC22676k.m65747g(string);
        return string;
    }
}
