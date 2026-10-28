package io.getstream.chat.android.client.internal.state.extensions.internal;

import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.InterfaceC2994c0;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.internal.state.plugin.internal.StatePlugin;
import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.internal.state.plugin.state.internal.ChatClientStateCalls;
import io.getstream.chat.android.client.plugin.Plugin;
import io.getstream.chat.android.client.plugin.factory.PluginFactory;
import io.getstream.chat.android.models.InitializationState;
import java.util.List;
import k93.AbstractC22306c;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0018\u0010\t\u001a\u00020\u0006*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/client/ChatClient;", "Lbc3/c0;", "scope", "Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;", "requestsAsState", "(Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;)Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "getLogic", "(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logic", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatClientKt {
    public static final LogicRegistry getLogic(ChatClient chatClient) {
        Object objResolveDependency;
        AbstractC22676k.m65750j(chatClient, "<this>");
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        Object obj = null;
        if (interfaceC2339e.isLoggable(enumC2341g, ChatClient.TAG)) {
            InterfaceC2344j interfaceC2344j = C2343i.f9271c;
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            interfaceC2344j.log(enumC2341g, ChatClient.TAG, AbstractC31061c.m95640p("[resolveDependency] DR: ", c22673i0.getOrCreateKotlinClass(StatePlugin.class).getSimpleName(), ", T: ", c22673i0.getOrCreateKotlinClass(LogicRegistry.class).getSimpleName()), null);
        }
        C22673i0 c22673i1 = AbstractC22671h0.f89337a;
        if (AbstractC22306c.m64100b(c22673i1.getOrCreateKotlinClass(StatePlugin.class), c22673i1.getOrCreateKotlinClass(PluginFactory.class))) {
            InterfaceC2339e interfaceC2339e2 = C2343i.f9272d;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339e2.isLoggable(enumC2341g2, ChatClient.TAG)) {
                C2343i.f9271c.log(enumC2341g2, ChatClient.TAG, AbstractC31061c.m95640p("[resolveFactoryDependency] F: ", c22673i1.getOrCreateKotlinClass(StatePlugin.class).getSimpleName(), ", T: ", c22673i1.getOrCreateKotlinClass(LogicRegistry.class).getSimpleName()), null);
            }
            for (Object obj2 : chatClient.getPluginFactories()) {
                if (((PluginFactory) obj2) instanceof StatePlugin) {
                    obj = obj2;
                    break;
                }
            }
            PluginFactory pluginFactory = (PluginFactory) obj;
            if (pluginFactory == null) {
                throw new IllegalStateException(AbstractC11895b.m31996o("Factory '", AbstractC22671h0.f89337a.getOrCreateKotlinClass(StatePlugin.class).getQualifiedName(), "' was not found. Did you init it within ChatClient?"));
            }
            C22673i0 c22673i2 = AbstractC22671h0.f89337a;
            objResolveDependency = pluginFactory.resolveDependency(c22673i2.getOrCreateKotlinClass(LogicRegistry.class));
            if (objResolveDependency == null) {
                throw new IllegalStateException(AbstractC2875y.m8300m("Dependency '", c22673i2.getOrCreateKotlinClass(LogicRegistry.class).getQualifiedName(), "' was not resolved by factory '", c22673i2.getOrCreateKotlinClass(StatePlugin.class).getQualifiedName(), "'"));
            }
        } else {
            if (!AbstractC22306c.m64100b(c22673i1.getOrCreateKotlinClass(StatePlugin.class), c22673i1.getOrCreateKotlinClass(Plugin.class))) {
                throw new IllegalStateException(("Unsupported dependency resolver: " + c22673i1.getOrCreateKotlinClass(StatePlugin.class)).toString());
            }
            InterfaceC2339e interfaceC2339e3 = C2343i.f9272d;
            EnumC2341g enumC2341g3 = EnumC2341g.VERBOSE;
            if (interfaceC2339e3.isLoggable(enumC2341g3, ChatClient.TAG)) {
                C2343i.f9271c.log(enumC2341g3, ChatClient.TAG, AbstractC31061c.m95640p("[resolvePluginDependency] P: ", c22673i1.getOrCreateKotlinClass(StatePlugin.class).getSimpleName(), ", T: ", c22673i1.getOrCreateKotlinClass(LogicRegistry.class).getSimpleName()), null);
            }
            List<Plugin> plugins = chatClient.getPlugins();
            InitializationState initializationStateAwaitInitializationState = chatClient.awaitInitializationState(ChatClient.RESOLVE_DEPENDENCY_TIMEOUT);
            if (initializationStateAwaitInitializationState != InitializationState.COMPLETE) {
                InterfaceC2339e interfaceC2339e4 = C2343i.f9272d;
                EnumC2341g enumC2341g4 = EnumC2341g.ERROR;
                if (interfaceC2339e4.isLoggable(enumC2341g4, ChatClient.TAG)) {
                    C2343i.f9271c.log(enumC2341g4, ChatClient.TAG, "[resolvePluginDependency] failed (initializationState is not COMPLETE): " + initializationStateAwaitInitializationState + " ", null);
                }
                throw new IllegalStateException("ChatClient::connectUser() must be called before resolving any dependency");
            }
            for (Object obj3 : plugins) {
                if (((Plugin) obj3) instanceof StatePlugin) {
                    obj = obj3;
                    break;
                }
            }
            Plugin plugin = (Plugin) obj;
            if (plugin == null) {
                throw new IllegalStateException(AbstractC11895b.m31996o("Plugin '", AbstractC22671h0.f89337a.getOrCreateKotlinClass(StatePlugin.class).getQualifiedName(), "' was not found. Did you init it within ChatClient?"));
            }
            C22673i0 c22673i3 = AbstractC22671h0.f89337a;
            objResolveDependency = plugin.resolveDependency(c22673i3.getOrCreateKotlinClass(LogicRegistry.class));
            if (objResolveDependency == null) {
                throw new IllegalStateException(AbstractC2875y.m8300m("Dependency '", c22673i3.getOrCreateKotlinClass(LogicRegistry.class).getQualifiedName(), "' was not resolved by plugin '", c22673i3.getOrCreateKotlinClass(StatePlugin.class).getQualifiedName(), "'"));
            }
        }
        return (LogicRegistry) objResolveDependency;
    }

    public static final ChatClientStateCalls requestsAsState(ChatClient chatClient, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(chatClient, "<this>");
        AbstractC22676k.m65750j(scope, "scope");
        return new ChatClientStateCalls(chatClient, scope);
    }
}
