package io.getstream.chat.android.client.plugin.factory;

import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.plugin.Plugin;
import io.getstream.chat.android.client.plugin.ThrottlingPlugin;
import io.getstream.chat.android.models.User;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/factory/ThrottlingPluginFactory;", "Lio/getstream/chat/android/client/plugin/factory/PluginFactory;", "<init>", "()V", "get", "Lio/getstream/chat/android/client/plugin/Plugin;", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThrottlingPluginFactory implements PluginFactory {
    public static final ThrottlingPluginFactory INSTANCE = new ThrottlingPluginFactory();

    private ThrottlingPluginFactory() {
    }

    @Override // io.getstream.chat.android.client.plugin.factory.PluginFactory
    public final Plugin get(User user) {
        AbstractC22676k.m65750j(user, "user");
        return new ThrottlingPlugin(null, 1, null);
    }
}
