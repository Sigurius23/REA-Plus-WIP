package io.getstream.chat.android.client.setup.state.internal;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import com.whoop.service.network.model.UserState;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.network.NetworkStateProvider;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.models.ConnectionState;
import io.getstream.chat.android.models.InitializationState;
import io.getstream.chat.android.models.User;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u001e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0014\u0010'\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010$R\u0014\u0010-\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010(¨\u0006."}, m65681d2 = {"Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "Lio/getstream/chat/android/client/network/NetworkStateProvider;", "networkStateProvider", "<init>", "(Lio/getstream/chat/android/client/network/NetworkStateProvider;)V", "Ll83/a0;", "clearState", "()V", "Lio/getstream/chat/android/models/ConnectionState;", "connectionState", "setConnectionState", "(Lio/getstream/chat/android/models/ConnectionState;)V", "Lio/getstream/chat/android/models/InitializationState;", "state", "setInitializationState", "(Lio/getstream/chat/android/models/InitializationState;)V", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "setUser", "(Lio/getstream/chat/android/models/User;)V", "Lio/getstream/chat/android/client/network/NetworkStateProvider;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lec3/p1;", "_initializationState", "Lec3/p1;", "_connectionState", "_user", "Lec3/f2;", "Lec3/f2;", "getConnectionState", "()Lec3/f2;", "getUser", "", "isOnline", "()Z", "isOffline", "isConnecting", "getInitializationState", "initializationState", "isNetworkAvailable", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MutableClientState implements ClientState {
    private final InterfaceC13075p1 _connectionState;
    private final InterfaceC13075p1 _initializationState;
    private InterfaceC13075p1 _user;
    private final InterfaceC13037f2 connectionState;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final NetworkStateProvider networkStateProvider;

    public MutableClientState(NetworkStateProvider networkStateProvider) {
        AbstractC22676k.m65750j(networkStateProvider, "networkStateProvider");
        this.networkStateProvider = networkStateProvider;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:ClientState");
        this._initializationState = AbstractC13091v.m36593c(InitializationState.NOT_INITIALIZED);
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(ConnectionState.Offline.INSTANCE);
        this._connectionState = c13045h2M36593c;
        this._user = AbstractC13091v.m36593c(null);
        this.connectionState = c13045h2M36593c;
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    public final void clearState() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[clearState] no args", null);
        }
        ((C13045h2) this._initializationState).m36570j(InitializationState.NOT_INITIALIZED);
        ((C13045h2) this._connectionState).m36570j(ConnectionState.Offline.INSTANCE);
        ((C13045h2) this._user).m36570j(null);
    }

    @Override // io.getstream.chat.android.client.setup.state.ClientState
    public final InterfaceC13037f2 getConnectionState() {
        return this.connectionState;
    }

    @Override // io.getstream.chat.android.client.setup.state.ClientState
    public final InterfaceC13037f2 getInitializationState() {
        return this._initializationState;
    }

    @Override // io.getstream.chat.android.client.setup.state.ClientState
    public final InterfaceC13037f2 getUser() {
        return this._user;
    }

    @Override // io.getstream.chat.android.client.setup.state.ClientState
    public final boolean isConnecting() {
        return AbstractC22676k.m65745e(((C13045h2) this._connectionState).getValue(), ConnectionState.Connecting.INSTANCE);
    }

    @Override // io.getstream.chat.android.client.setup.state.ClientState
    public final boolean isNetworkAvailable() {
        return this.networkStateProvider.isConnected();
    }

    @Override // io.getstream.chat.android.client.setup.state.ClientState
    public final boolean isOffline() {
        return AbstractC22676k.m65745e(((C13045h2) this._connectionState).getValue(), ConnectionState.Offline.INSTANCE);
    }

    @Override // io.getstream.chat.android.client.setup.state.ClientState
    public final boolean isOnline() {
        return ((C13045h2) this._connectionState).getValue() instanceof ConnectionState.Connected;
    }

    public final void setConnectionState(ConnectionState connectionState) {
        AbstractC22676k.m65750j(connectionState, "connectionState");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[setConnectionState] state: " + connectionState, null);
        }
        C13045h2 c13045h2 = (C13045h2) this._connectionState;
        c13045h2.getClass();
        c13045h2.m36571k(null, connectionState);
    }

    public final void setInitializationState(InitializationState state) {
        AbstractC22676k.m65750j(state, "state");
        C13045h2 c13045h2 = (C13045h2) this._initializationState;
        c13045h2.getClass();
        c13045h2.m36571k(null, state);
    }

    public final void setUser(User user) {
        AbstractC22676k.m65750j(user, "user");
        C13045h2 c13045h2 = (C13045h2) this._user;
        c13045h2.getClass();
        c13045h2.m36571k(null, user);
    }
}
