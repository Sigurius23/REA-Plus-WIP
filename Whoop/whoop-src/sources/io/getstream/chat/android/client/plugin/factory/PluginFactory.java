package io.getstream.chat.android.client.plugin.factory;

import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.plugin.DependencyResolver;
import io.getstream.chat.android.client.plugin.Plugin;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.User;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/factory/PluginFactory;", "Lio/getstream/chat/android/client/plugin/DependencyResolver;", "get", "Lio/getstream/chat/android/client/plugin/Plugin;", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface PluginFactory extends DependencyResolver {
    Plugin get(User user);
}
