package io.getstream.chat.android.client.socket;

import a11.C0134l;
import androidx.core.app.NotificationCompat;
import androidx.health.platform.client.proto.C1533u;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c93.InterfaceC4351m;
import d13.AbstractC11478a;
import ec3.InterfaceC13037f2;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.events.ConnectedEvent;
import io.getstream.chat.android.core.internal.fsm.FiniteStateMachine;
import io.getstream.chat.android.core.internal.fsm.builder.FSMBuilder;
import io.getstream.chat.android.core.internal.fsm.builder.StateHandlerBuilder;
import j93.InterfaceC21461d;
import java.util.Map;
import l83.C23454a0;
import l83.InterfaceC23462h;
import n23.C26200c;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0004789:B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\n\u001a\u00020\b2\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0086@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u001f\u0010\u0015J\u0010\u0010 \u001a\u00020\bH\u0086@¢\u0006\u0004\b \u0010\u0015J\u0010\u0010!\u001a\u00020\bH\u0086@¢\u0006\u0004\b!\u0010\u0015J\u0010\u0010\"\u001a\u00020\bH\u0086@¢\u0006\u0004\b\"\u0010\u0015J\u0010\u0010#\u001a\u00020\bH\u0086@¢\u0006\u0004\b#\u0010\u0015R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R'\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020+0*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010.R\u0011\u00102\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006;"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService;", "", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;", "initialState", "<init>", "(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;)V", "Lkotlin/Function2;", "Lq83/d;", "Ll83/a0;", "onNewState", "observer", "(Lc93/m;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;", "connectionConf", "", "forceReconnection", "onReconnect", "(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;ZLq83/d;)Ljava/lang/Object;", "onConnect", "(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lq83/d;)Ljava/lang/Object;", "onNetworkNotAvailable", "(Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/events/ConnectedEvent;", "connectedEvent", "onConnectionEstablished", "(Lio/getstream/chat/android/client/events/ConnectedEvent;Lq83/d;)Ljava/lang/Object;", "Ln23/c;", "error", "onUnrecoverableError", "(Ln23/c;Lq83/d;)Ljava/lang/Object;", "onNetworkError", "onRequiredDisconnect", "onStop", "onWebSocketEventLost", "onNetworkAvailable", "onResume", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event;", "stateMachine$delegate", "getStateMachine", "()Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;", "stateMachine", "getCurrentState", "()Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;", "currentState", "Lec3/f2;", "getCurrentStateFlow", "()Lec3/f2;", "currentStateFlow", "ConnectionType", "RestartReason", "Event", "State", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatSocketStateService {

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    /* JADX INFO: renamed from: stateMachine$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h stateMachine;

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;", "", "<init>", "(Ljava/lang/String;I)V", "INITIAL_CONNECTION", "AUTOMATIC_RECONNECTION", "FORCE_RECONNECTION", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public enum ConnectionType {
        INITIAL_CONNECTION,
        AUTOMATIC_RECONNECTION,
        FORCE_RECONNECTION;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event;", "", "<init>", "()V", "Connect", "ConnectionEstablished", "WebSocketEventLost", "NetworkNotAvailable", "NetworkAvailable", "UnrecoverableError", "NetworkError", "RequiredDisconnection", "Stop", "Resume", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkAvailable;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Resume;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static abstract class Event {

        @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event;", "connectionConf", "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;", "connectionType", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;", "<init>", "(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;)V", "getConnectionConf", "()Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;", "getConnectionType", "()Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class Connect extends Event {
            private final SocketFactory.ConnectionConf connectionConf;
            private final ConnectionType connectionType;

            public Connect(SocketFactory.ConnectionConf connectionConf, ConnectionType connectionType) {
                AbstractC22676k.m65750j(connectionConf, "connectionConf");
                AbstractC22676k.m65750j(connectionType, "connectionType");
                this.connectionConf = connectionConf;
                this.connectionType = connectionType;
            }

            public static /* synthetic */ Connect copy$default(Connect connect, SocketFactory.ConnectionConf connectionConf, ConnectionType connectionType, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    connectionConf = connect.connectionConf;
                }
                if ((i13 & 2) != 0) {
                    connectionType = connect.connectionType;
                }
                return connect.copy(connectionConf, connectionType);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final SocketFactory.ConnectionConf getConnectionConf() {
                return this.connectionConf;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final ConnectionType getConnectionType() {
                return this.connectionType;
            }

            public final Connect copy(SocketFactory.ConnectionConf connectionConf, ConnectionType connectionType) {
                AbstractC22676k.m65750j(connectionConf, "connectionConf");
                AbstractC22676k.m65750j(connectionType, "connectionType");
                return new Connect(connectionConf, connectionType);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Connect)) {
                    return false;
                }
                Connect connect = (Connect) other;
                return AbstractC22676k.m65745e(this.connectionConf, connect.connectionConf) && this.connectionType == connect.connectionType;
            }

            public final SocketFactory.ConnectionConf getConnectionConf() {
                return this.connectionConf;
            }

            public final ConnectionType getConnectionType() {
                return this.connectionType;
            }

            public final int hashCode() {
                return this.connectionType.hashCode() + (this.connectionConf.hashCode() * 31);
            }

            public final String toString() {
                return "Connect(connectionConf=" + this.connectionConf + ", connectionType=" + this.connectionType + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event;", "connectedEvent", "Lio/getstream/chat/android/client/events/ConnectedEvent;", "<init>", "(Lio/getstream/chat/android/client/events/ConnectedEvent;)V", "getConnectedEvent", "()Lio/getstream/chat/android/client/events/ConnectedEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class ConnectionEstablished extends Event {
            private final ConnectedEvent connectedEvent;

            public ConnectionEstablished(ConnectedEvent connectedEvent) {
                AbstractC22676k.m65750j(connectedEvent, "connectedEvent");
                this.connectedEvent = connectedEvent;
            }

            public static /* synthetic */ ConnectionEstablished copy$default(ConnectionEstablished connectionEstablished, ConnectedEvent connectedEvent, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    connectedEvent = connectionEstablished.connectedEvent;
                }
                return connectionEstablished.copy(connectedEvent);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final ConnectedEvent getConnectedEvent() {
                return this.connectedEvent;
            }

            public final ConnectionEstablished copy(ConnectedEvent connectedEvent) {
                AbstractC22676k.m65750j(connectedEvent, "connectedEvent");
                return new ConnectionEstablished(connectedEvent);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ConnectionEstablished) && AbstractC22676k.m65745e(this.connectedEvent, ((ConnectionEstablished) other).connectedEvent);
            }

            public final ConnectedEvent getConnectedEvent() {
                return this.connectedEvent;
            }

            public final int hashCode() {
                return this.connectedEvent.hashCode();
            }

            public final String toString() {
                return "ConnectionEstablished(connectedEvent=" + this.connectedEvent + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkAvailable;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event;", "<init>", "()V", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class NetworkAvailable extends Event {
            public static final NetworkAvailable INSTANCE = new NetworkAvailable();

            private NetworkAvailable() {
            }

            public final String toString() {
                return "NetworkAvailable";
            }
        }

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event;", "Ln23/c;", "error", "<init>", "(Ln23/c;)V", "component1", "()Ln23/c;", "copy", "(Ln23/c;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/c;", "getError", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class NetworkError extends Event {
            private final C26200c error;

            public NetworkError(C26200c error) {
                AbstractC22676k.m65750j(error, "error");
                this.error = error;
            }

            public static /* synthetic */ NetworkError copy$default(NetworkError networkError, C26200c c26200c, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    c26200c = networkError.error;
                }
                return networkError.copy(c26200c);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final C26200c getError() {
                return this.error;
            }

            public final NetworkError copy(C26200c error) {
                AbstractC22676k.m65750j(error, "error");
                return new NetworkError(error);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NetworkError) && AbstractC22676k.m65745e(this.error, ((NetworkError) other).error);
            }

            public final C26200c getError() {
                return this.error;
            }

            public final int hashCode() {
                return this.error.hashCode();
            }

            public final String toString() {
                return "NetworkError(error=" + this.error + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event;", "<init>", "()V", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class NetworkNotAvailable extends Event {
            public static final NetworkNotAvailable INSTANCE = new NetworkNotAvailable();

            private NetworkNotAvailable() {
            }

            public final String toString() {
                return "NetworkNotAvailable";
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event;", "<init>", "()V", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class RequiredDisconnection extends Event {
            public static final RequiredDisconnection INSTANCE = new RequiredDisconnection();

            private RequiredDisconnection() {
            }

            public final String toString() {
                return "RequiredDisconnection";
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Resume;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event;", "<init>", "()V", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class Resume extends Event {
            public static final Resume INSTANCE = new Resume();

            private Resume() {
            }

            public final String toString() {
                return "Resume";
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event;", "<init>", "()V", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class Stop extends Event {
            public static final Stop INSTANCE = new Stop();

            private Stop() {
            }

            public final String toString() {
                return "Stop";
            }
        }

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event;", "Ln23/c;", "error", "<init>", "(Ln23/c;)V", "component1", "()Ln23/c;", "copy", "(Ln23/c;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/c;", "getError", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class UnrecoverableError extends Event {
            private final C26200c error;

            public UnrecoverableError(C26200c error) {
                AbstractC22676k.m65750j(error, "error");
                this.error = error;
            }

            public static /* synthetic */ UnrecoverableError copy$default(UnrecoverableError unrecoverableError, C26200c c26200c, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    c26200c = unrecoverableError.error;
                }
                return unrecoverableError.copy(c26200c);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final C26200c getError() {
                return this.error;
            }

            public final UnrecoverableError copy(C26200c error) {
                AbstractC22676k.m65750j(error, "error");
                return new UnrecoverableError(error);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UnrecoverableError) && AbstractC22676k.m65745e(this.error, ((UnrecoverableError) other).error);
            }

            public final C26200c getError() {
                return this.error;
            }

            public final int hashCode() {
                return this.error.hashCode();
            }

            public final String toString() {
                return "UnrecoverableError(error=" + this.error + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event;", "<init>", "()V", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class WebSocketEventLost extends Event {
            public static final WebSocketEventLost INSTANCE = new WebSocketEventLost();

            private WebSocketEventLost() {
            }

            public final String toString() {
                return "WebSocketEventLost";
            }
        }

        private Event() {
        }

        public Event(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;", "", "<init>", "(Ljava/lang/String;I)V", "LIFECYCLE_RESUME", "NETWORK_AVAILABLE", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public enum RestartReason {
        LIFECYCLE_RESUME,
        NETWORK_AVAILABLE;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;", "", "<init>", "()V", "RestartConnection", "Connecting", "Connected", "Disconnected", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static abstract class State {

        /* JADX INFO: loaded from: classes11.dex */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;", NotificationCompat.CATEGORY_EVENT, "Lio/getstream/chat/android/client/events/ConnectedEvent;", "<init>", "(Lio/getstream/chat/android/client/events/ConnectedEvent;)V", "getEvent", "()Lio/getstream/chat/android/client/events/ConnectedEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class Connected extends State {
            private final ConnectedEvent event;

            public Connected(ConnectedEvent event) {
                AbstractC22676k.m65750j(event, "event");
                this.event = event;
            }

            public static /* synthetic */ Connected copy$default(Connected connected, ConnectedEvent connectedEvent, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    connectedEvent = connected.event;
                }
                return connected.copy(connectedEvent);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final ConnectedEvent getEvent() {
                return this.event;
            }

            public final Connected copy(ConnectedEvent event) {
                AbstractC22676k.m65750j(event, "event");
                return new Connected(event);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Connected) && AbstractC22676k.m65745e(this.event, ((Connected) other).event);
            }

            public final ConnectedEvent getEvent() {
                return this.event;
            }

            public final int hashCode() {
                return this.event.hashCode();
            }

            public final String toString() {
                return "Connected(event=" + this.event + ")";
            }
        }

        /* JADX INFO: loaded from: classes11.dex */
        @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;", "connectionConf", "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;", "connectionType", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;", "<init>", "(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;)V", "getConnectionConf", "()Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;", "getConnectionType", "()Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class Connecting extends State {
            private final SocketFactory.ConnectionConf connectionConf;
            private final ConnectionType connectionType;

            public Connecting(SocketFactory.ConnectionConf connectionConf, ConnectionType connectionType) {
                AbstractC22676k.m65750j(connectionConf, "connectionConf");
                AbstractC22676k.m65750j(connectionType, "connectionType");
                this.connectionConf = connectionConf;
                this.connectionType = connectionType;
            }

            public static /* synthetic */ Connecting copy$default(Connecting connecting, SocketFactory.ConnectionConf connectionConf, ConnectionType connectionType, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    connectionConf = connecting.connectionConf;
                }
                if ((i13 & 2) != 0) {
                    connectionType = connecting.connectionType;
                }
                return connecting.copy(connectionConf, connectionType);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final SocketFactory.ConnectionConf getConnectionConf() {
                return this.connectionConf;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final ConnectionType getConnectionType() {
                return this.connectionType;
            }

            public final Connecting copy(SocketFactory.ConnectionConf connectionConf, ConnectionType connectionType) {
                AbstractC22676k.m65750j(connectionConf, "connectionConf");
                AbstractC22676k.m65750j(connectionType, "connectionType");
                return new Connecting(connectionConf, connectionType);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Connecting)) {
                    return false;
                }
                Connecting connecting = (Connecting) other;
                return AbstractC22676k.m65745e(this.connectionConf, connecting.connectionConf) && this.connectionType == connecting.connectionType;
            }

            public final SocketFactory.ConnectionConf getConnectionConf() {
                return this.connectionConf;
            }

            public final ConnectionType getConnectionType() {
                return this.connectionType;
            }

            public final int hashCode() {
                return this.connectionType.hashCode() + (this.connectionConf.hashCode() * 31);
            }

            public final String toString() {
                return "Connecting(connectionConf=" + this.connectionConf + ", connectionType=" + this.connectionType + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;", "<init>", "()V", "Stopped", "NetworkDisconnected", "WebSocketEventLost", "DisconnectedByRequest", "DisconnectedTemporarily", "DisconnectedPermanently", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static abstract class Disconnected extends State {

            /* JADX INFO: loaded from: classes11.dex */
            @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected;", "<init>", "()V", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class DisconnectedByRequest extends Disconnected {
                public static final DisconnectedByRequest INSTANCE = new DisconnectedByRequest();

                private DisconnectedByRequest() {
                }

                public final String toString() {
                    return "Disconnected.ByRequest";
                }
            }

            /* JADX INFO: loaded from: classes11.dex */
            @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected;", "Ln23/c;", "error", "<init>", "(Ln23/c;)V", "component1", "()Ln23/c;", "copy", "(Ln23/c;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/c;", "getError", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final /* data */ class DisconnectedPermanently extends Disconnected {
                private final C26200c error;

                public DisconnectedPermanently(C26200c error) {
                    AbstractC22676k.m65750j(error, "error");
                    this.error = error;
                }

                public static /* synthetic */ DisconnectedPermanently copy$default(DisconnectedPermanently disconnectedPermanently, C26200c c26200c, int i13, Object obj) {
                    if ((i13 & 1) != 0) {
                        c26200c = disconnectedPermanently.error;
                    }
                    return disconnectedPermanently.copy(c26200c);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final C26200c getError() {
                    return this.error;
                }

                public final DisconnectedPermanently copy(C26200c error) {
                    AbstractC22676k.m65750j(error, "error");
                    return new DisconnectedPermanently(error);
                }

                public final boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof DisconnectedPermanently) && AbstractC22676k.m65745e(this.error, ((DisconnectedPermanently) other).error);
                }

                public final C26200c getError() {
                    return this.error;
                }

                public final int hashCode() {
                    return this.error.hashCode();
                }

                public final String toString() {
                    return "DisconnectedPermanently(error=" + this.error + ")";
                }
            }

            /* JADX INFO: loaded from: classes11.dex */
            @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected;", "Ln23/c;", "error", "<init>", "(Ln23/c;)V", "component1", "()Ln23/c;", "copy", "(Ln23/c;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/c;", "getError", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final /* data */ class DisconnectedTemporarily extends Disconnected {
                private final C26200c error;

                public DisconnectedTemporarily(C26200c error) {
                    AbstractC22676k.m65750j(error, "error");
                    this.error = error;
                }

                public static /* synthetic */ DisconnectedTemporarily copy$default(DisconnectedTemporarily disconnectedTemporarily, C26200c c26200c, int i13, Object obj) {
                    if ((i13 & 1) != 0) {
                        c26200c = disconnectedTemporarily.error;
                    }
                    return disconnectedTemporarily.copy(c26200c);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final C26200c getError() {
                    return this.error;
                }

                public final DisconnectedTemporarily copy(C26200c error) {
                    AbstractC22676k.m65750j(error, "error");
                    return new DisconnectedTemporarily(error);
                }

                public final boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof DisconnectedTemporarily) && AbstractC22676k.m65745e(this.error, ((DisconnectedTemporarily) other).error);
                }

                public final C26200c getError() {
                    return this.error;
                }

                public final int hashCode() {
                    return this.error.hashCode();
                }

                public final String toString() {
                    return "DisconnectedTemporarily(error=" + this.error + ")";
                }
            }

            /* JADX INFO: loaded from: classes11.dex */
            @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected;", "<init>", "()V", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class NetworkDisconnected extends Disconnected {
                public static final NetworkDisconnected INSTANCE = new NetworkDisconnected();

                private NetworkDisconnected() {
                }

                public final String toString() {
                    return "Disconnected.Network";
                }
            }

            @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected;", "<init>", "()V", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class Stopped extends Disconnected {
                public static final Stopped INSTANCE = new Stopped();

                private Stopped() {
                }

                public final String toString() {
                    return "Disconnected.Stopped";
                }
            }

            /* JADX INFO: loaded from: classes11.dex */
            @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected;", "<init>", "()V", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class WebSocketEventLost extends Disconnected {
                public static final WebSocketEventLost INSTANCE = new WebSocketEventLost();

                private WebSocketEventLost() {
                }

                public final String toString() {
                    return "Disconnected.InactiveWS";
                }
            }

            private Disconnected() {
            }

            public Disconnected(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* JADX INFO: loaded from: classes11.dex */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;", "reason", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;", "<init>", "(Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;)V", "getReason", "()Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class RestartConnection extends State {
            private final RestartReason reason;

            public RestartConnection(RestartReason reason) {
                AbstractC22676k.m65750j(reason, "reason");
                this.reason = reason;
            }

            public static /* synthetic */ RestartConnection copy$default(RestartConnection restartConnection, RestartReason restartReason, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    restartReason = restartConnection.reason;
                }
                return restartConnection.copy(restartReason);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final RestartReason getReason() {
                return this.reason;
            }

            public final RestartConnection copy(RestartReason reason) {
                AbstractC22676k.m65750j(reason, "reason");
                return new RestartConnection(reason);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RestartConnection) && this.reason == ((RestartConnection) other).reason;
            }

            public final RestartReason getReason() {
                return this.reason;
            }

            public final int hashCode() {
                return this.reason.hashCode();
            }

            public final String toString() {
                return "RestartConnection(reason=" + this.reason + ")";
            }
        }

        private State() {
        }

        public State(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectionType.values().length];
            try {
                iArr[ConnectionType.INITIAL_CONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConnectionType.AUTOMATIC_RECONNECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConnectionType.FORCE_RECONNECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.socket.ChatSocketStateService$observer$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.socket.ChatSocketStateService", m100430f = "ChatSocketStateService.kt", m100431l = {29}, m100432m = "observer")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194341 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C194341(InterfaceC30057d<? super C194341> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            ChatSocketStateService.this.observer(null, this);
            return EnumC31071a.f128113w;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatSocketStateService() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ State.Disconnected.Stopped m54917A(State.Disconnected.DisconnectedTemporarily disconnectedTemporarily, Event.Stop stop) {
        return (State.Disconnected.Stopped) stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$69(disconnectedTemporarily, stop);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ State.Disconnected.DisconnectedTemporarily m54918B(State.Disconnected.NetworkDisconnected networkDisconnected, Event.NetworkError networkError) {
        return (State.Disconnected.DisconnectedTemporarily) stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$46(networkDisconnected, networkError);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ State.Disconnected.DisconnectedTemporarily m54919C(State.Connecting connecting, Event.NetworkError networkError) {
        return (State.Disconnected.DisconnectedTemporarily) stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$27(connecting, networkError);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ State.Disconnected.DisconnectedByRequest m54920D(State.Disconnected.Stopped stopped, Event.RequiredDisconnection requiredDisconnection) {
        return (State.Disconnected.DisconnectedByRequest) stateMachine_delegate$lambda$75$lambda$74$lambda$42$lambda$39(stopped, requiredDisconnection);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ State.Disconnected.DisconnectedPermanently m54921E(State.Connecting connecting, Event.UnrecoverableError unrecoverableError) {
        return (State.Disconnected.DisconnectedPermanently) stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$26(connecting, unrecoverableError);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ State.Disconnected.DisconnectedByRequest m54923G(State.Connecting connecting, Event.RequiredDisconnection requiredDisconnection) {
        return (State.Disconnected.DisconnectedByRequest) stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$28(connecting, requiredDisconnection);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ State.Disconnected.Stopped m54924H(State.Disconnected.NetworkDisconnected networkDisconnected, Event.Stop stop) {
        return (State.Disconnected.Stopped) stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$48(networkDisconnected, stop);
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ State.Disconnected.DisconnectedTemporarily m54926J(State.Disconnected.WebSocketEventLost webSocketEventLost, Event.NetworkError networkError) {
        return (State.Disconnected.DisconnectedTemporarily) stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$55(webSocketEventLost, networkError);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ State.Disconnected.DisconnectedTemporarily m54928L(State.RestartConnection restartConnection, Event.NetworkError networkError) {
        return (State.Disconnected.DisconnectedTemporarily) stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$18(restartConnection, networkError);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ State.Disconnected.WebSocketEventLost m54929M(State.Disconnected.DisconnectedTemporarily disconnectedTemporarily, Event.WebSocketEventLost webSocketEventLost) {
        return (State.Disconnected.WebSocketEventLost) stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$65(disconnectedTemporarily, webSocketEventLost);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ State.Connected m54930N(State.RestartConnection restartConnection, Event.ConnectionEstablished connectionEstablished) {
        return (State.Connected) stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$14(restartConnection, connectionEstablished);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ State.Disconnected.DisconnectedByRequest m54931O(State.RestartConnection restartConnection, Event.RequiredDisconnection requiredDisconnection) {
        return (State.Disconnected.DisconnectedByRequest) stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$19(restartConnection, requiredDisconnection);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ State.Disconnected.NetworkDisconnected m54932P(State.Disconnected.DisconnectedTemporarily disconnectedTemporarily, Event.NetworkNotAvailable networkNotAvailable) {
        return (State.Disconnected.NetworkDisconnected) stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$64(disconnectedTemporarily, networkNotAvailable);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ State.Connecting m54933Q(State.Connecting connecting, Event.Connect connect) {
        return (State.Connecting) stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$22(connecting, connect);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ State.Disconnected.DisconnectedTemporarily m54934R(State.Connected connected, Event.NetworkError networkError) {
        return (State.Disconnected.DisconnectedTemporarily) stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$35(connected, networkError);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ State.Disconnected.DisconnectedPermanently m54935S(State.Disconnected.NetworkDisconnected networkDisconnected, Event.UnrecoverableError unrecoverableError) {
        return (State.Disconnected.DisconnectedPermanently) stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$45(networkDisconnected, unrecoverableError);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ State.Disconnected.DisconnectedPermanently m54936T(State.Connected connected, Event.UnrecoverableError unrecoverableError) {
        return (State.Disconnected.DisconnectedPermanently) stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$34(connected, unrecoverableError);
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ State.Disconnected.WebSocketEventLost m54937U(State.RestartConnection restartConnection, Event.WebSocketEventLost webSocketEventLost) {
        return (State.Disconnected.WebSocketEventLost) stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$15(restartConnection, webSocketEventLost);
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ State.Disconnected.DisconnectedByRequest m54938V(State.Disconnected.WebSocketEventLost webSocketEventLost, Event.RequiredDisconnection requiredDisconnection) {
        return (State.Disconnected.DisconnectedByRequest) stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$56(webSocketEventLost, requiredDisconnection);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ State.Disconnected.Stopped m54939W(State.Connected connected, Event.Stop stop) {
        return (State.Disconnected.Stopped) stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$37(connected, stop);
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ State.RestartConnection m54940X(State.Disconnected.NetworkDisconnected networkDisconnected, Event.NetworkAvailable networkAvailable) {
        return (State.RestartConnection) stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$49(networkDisconnected, networkAvailable);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ State.Disconnected.Stopped m54941Y(State.Connecting connecting, Event.Stop stop) {
        return (State.Disconnected.Stopped) stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$29(connecting, stop);
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ State.Connected m54942Z(State.Disconnected.WebSocketEventLost webSocketEventLost, Event.ConnectionEstablished connectionEstablished) {
        return (State.Connected) stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$52(webSocketEventLost, connectionEstablished);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ State.Disconnected.DisconnectedByRequest m54943a(State.Disconnected.NetworkDisconnected networkDisconnected, Event.RequiredDisconnection requiredDisconnection) {
        return (State.Disconnected.DisconnectedByRequest) stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$47(networkDisconnected, requiredDisconnection);
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ State.Disconnected.DisconnectedByRequest m54944a0(State.Disconnected.DisconnectedTemporarily disconnectedTemporarily, Event.RequiredDisconnection requiredDisconnection) {
        return (State.Disconnected.DisconnectedByRequest) stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$68(disconnectedTemporarily, requiredDisconnection);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ State.Connecting m54945b(State.Disconnected.DisconnectedTemporarily disconnectedTemporarily, Event.Connect connect) {
        return (State.Connecting) stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$62(disconnectedTemporarily, connect);
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ State.Connecting m54946b0(State.RestartConnection restartConnection, Event.Connect connect) {
        return (State.Connecting) stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$13(restartConnection, connect);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ State.RestartConnection m54947c(State.Disconnected.Stopped stopped, Event.Resume resume) {
        return (State.RestartConnection) stateMachine_delegate$lambda$75$lambda$74$lambda$42$lambda$41(stopped, resume);
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ State.Connecting m54948c0(State.Disconnected.WebSocketEventLost webSocketEventLost, Event.Connect connect) {
        return (State.Connecting) stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$51(webSocketEventLost, connect);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ State.Connecting m54949d(State.Disconnected.Stopped stopped, Event.Connect connect) {
        return (State.Connecting) stateMachine_delegate$lambda$75$lambda$74$lambda$42$lambda$40(stopped, connect);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ State.Connected m54950e(State.Connecting connecting, Event.ConnectionEstablished connectionEstablished) {
        return (State.Connected) stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$23(connecting, connectionEstablished);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final FiniteStateMachine<State, Event> getStateMachine() {
        return (FiniteStateMachine) this.stateMachine.getValue();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ State.Disconnected.NetworkDisconnected m54953h(State.Connected connected, Event.NetworkNotAvailable networkNotAvailable) {
        return (State.Disconnected.NetworkDisconnected) stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$33(connected, networkNotAvailable);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ State.Disconnected.DisconnectedTemporarily m54954i(State.Disconnected.DisconnectedTemporarily disconnectedTemporarily, Event.NetworkError networkError) {
        return (State.Disconnected.DisconnectedTemporarily) stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$67(disconnectedTemporarily, networkError);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ State.Disconnected.DisconnectedPermanently m54955j(State.RestartConnection restartConnection, Event.UnrecoverableError unrecoverableError) {
        return (State.Disconnected.DisconnectedPermanently) stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$17(restartConnection, unrecoverableError);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ State.Connected m54956k(State.Disconnected.DisconnectedTemporarily disconnectedTemporarily, Event.ConnectionEstablished connectionEstablished) {
        return (State.Connected) stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$63(disconnectedTemporarily, connectionEstablished);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ State.Disconnected.WebSocketEventLost m54957l(State.Connected connected, Event.WebSocketEventLost webSocketEventLost) {
        return (State.Disconnected.WebSocketEventLost) stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$32(connected, webSocketEventLost);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ State.Disconnected.Stopped m54958m(State.Disconnected.WebSocketEventLost webSocketEventLost, Event.Stop stop) {
        return (State.Disconnected.Stopped) stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$57(webSocketEventLost, stop);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ State.Disconnected.Stopped m54959n(State.RestartConnection restartConnection, Event.Stop stop) {
        return (State.Disconnected.Stopped) stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$20(restartConnection, stop);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ State.Connected m54961p(State.Connected connected, Event.ConnectionEstablished connectionEstablished) {
        return (State.Connected) stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$31(connected, connectionEstablished);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ State.Disconnected.NetworkDisconnected m54962q(State.Disconnected.WebSocketEventLost webSocketEventLost, Event.NetworkNotAvailable networkNotAvailable) {
        return (State.Disconnected.NetworkDisconnected) stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$53(webSocketEventLost, networkNotAvailable);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ State.Connected m54963r(State.Disconnected.NetworkDisconnected networkDisconnected, Event.ConnectionEstablished connectionEstablished) {
        return (State.Connected) stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$44(networkDisconnected, connectionEstablished);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ State.Disconnected.WebSocketEventLost m54964s(State.Connecting connecting, Event.WebSocketEventLost webSocketEventLost) {
        return (State.Disconnected.WebSocketEventLost) stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$24(connecting, webSocketEventLost);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteStateMachine stateMachine_delegate$lambda$75(State state, ChatSocketStateService chatSocketStateService) {
        return FiniteStateMachine.INSTANCE.invoke(new C19442c(state, chatSocketStateService));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 stateMachine_delegate$lambda$75$lambda$74(State state, final ChatSocketStateService chatSocketStateService, FSMBuilder FiniteStateMachine) {
        AbstractC22676k.m65750j(FiniteStateMachine, "$this$FiniteStateMachine");
        FiniteStateMachine.initialState(state);
        final int i13 = 0;
        FiniteStateMachine.defaultHandler(new InterfaceC4351m(chatSocketStateService) { // from class: io.getstream.chat.android.client.socket.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatSocketStateService f73954x;

            {
                this.f73954x = chatSocketStateService;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i13) {
                    case 0:
                        ChatSocketStateService.State state2 = (ChatSocketStateService.State) obj;
                        ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$12(this.f73954x, state2, (ChatSocketStateService.Event) obj2);
                        return state2;
                    default:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$59(this.f73954x, (ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                }
            }
        });
        Map<InterfaceC21461d, Map<InterfaceC21461d, InterfaceC4351m>> stateFunctions = FiniteStateMachine.getStateFunctions();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(State.RestartConnection.class);
        StateHandlerBuilder stateHandlerBuilder = new StateHandlerBuilder();
        final int i14 = 2;
        InterfaceC4351m interfaceC4351m = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i14) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers = stateHandlerBuilder.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(Event.Connect.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m);
        eventHandlers.put(orCreateKotlinClass2, interfaceC4351m);
        final int i15 = 13;
        InterfaceC4351m interfaceC4351m2 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i15) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers2 = stateHandlerBuilder.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(Event.ConnectionEstablished.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m2);
        eventHandlers2.put(orCreateKotlinClass3, interfaceC4351m2);
        final int i16 = 25;
        InterfaceC4351m interfaceC4351m3 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i16) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers3 = stateHandlerBuilder.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(Event.WebSocketEventLost.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m3);
        eventHandlers3.put(orCreateKotlinClass4, interfaceC4351m3);
        final int i17 = 6;
        InterfaceC4351m interfaceC4351m4 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i17) {
                    case 0:
                        return ChatSocketStateService.m54964s((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54932P((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54929M((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 3:
                        return ChatSocketStateService.m54966u((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54954i((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54944a0((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54965t((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 7:
                        return ChatSocketStateService.m54917A((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 8:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54970y((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 10:
                        return ChatSocketStateService.m54955j((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 11:
                        return ChatSocketStateService.m54968w((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 12:
                        return ChatSocketStateService.m54928L((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 13:
                        return ChatSocketStateService.m54931O((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 14:
                        return ChatSocketStateService.m54959n((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 15:
                        return ChatSocketStateService.m54933Q((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 16:
                        return ChatSocketStateService.m54921E((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54919C((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54923G((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54941Y((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Stop) obj2);
                    default:
                        return ChatSocketStateService.m54961p((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers4 = stateHandlerBuilder.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(Event.NetworkNotAvailable.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m4);
        eventHandlers4.put(orCreateKotlinClass5, interfaceC4351m4);
        final int i18 = 10;
        InterfaceC4351m interfaceC4351m5 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i18) {
                    case 0:
                        return ChatSocketStateService.m54964s((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54932P((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54929M((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 3:
                        return ChatSocketStateService.m54966u((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54954i((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54944a0((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54965t((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 7:
                        return ChatSocketStateService.m54917A((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 8:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54970y((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 10:
                        return ChatSocketStateService.m54955j((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 11:
                        return ChatSocketStateService.m54968w((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 12:
                        return ChatSocketStateService.m54928L((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 13:
                        return ChatSocketStateService.m54931O((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 14:
                        return ChatSocketStateService.m54959n((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 15:
                        return ChatSocketStateService.m54933Q((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 16:
                        return ChatSocketStateService.m54921E((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54919C((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54923G((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54941Y((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Stop) obj2);
                    default:
                        return ChatSocketStateService.m54961p((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers5 = stateHandlerBuilder.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(Event.UnrecoverableError.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m5);
        eventHandlers5.put(orCreateKotlinClass6, interfaceC4351m5);
        final int i19 = 12;
        InterfaceC4351m interfaceC4351m6 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i19) {
                    case 0:
                        return ChatSocketStateService.m54964s((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54932P((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54929M((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 3:
                        return ChatSocketStateService.m54966u((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54954i((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54944a0((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54965t((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 7:
                        return ChatSocketStateService.m54917A((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 8:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54970y((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 10:
                        return ChatSocketStateService.m54955j((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 11:
                        return ChatSocketStateService.m54968w((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 12:
                        return ChatSocketStateService.m54928L((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 13:
                        return ChatSocketStateService.m54931O((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 14:
                        return ChatSocketStateService.m54959n((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 15:
                        return ChatSocketStateService.m54933Q((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 16:
                        return ChatSocketStateService.m54921E((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54919C((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54923G((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54941Y((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Stop) obj2);
                    default:
                        return ChatSocketStateService.m54961p((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers6 = stateHandlerBuilder.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(Event.NetworkError.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m6);
        eventHandlers6.put(orCreateKotlinClass7, interfaceC4351m6);
        final int i24 = 13;
        InterfaceC4351m interfaceC4351m7 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i24) {
                    case 0:
                        return ChatSocketStateService.m54964s((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54932P((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54929M((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 3:
                        return ChatSocketStateService.m54966u((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54954i((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54944a0((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54965t((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 7:
                        return ChatSocketStateService.m54917A((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 8:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54970y((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 10:
                        return ChatSocketStateService.m54955j((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 11:
                        return ChatSocketStateService.m54968w((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 12:
                        return ChatSocketStateService.m54928L((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 13:
                        return ChatSocketStateService.m54931O((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 14:
                        return ChatSocketStateService.m54959n((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 15:
                        return ChatSocketStateService.m54933Q((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 16:
                        return ChatSocketStateService.m54921E((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54919C((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54923G((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54941Y((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Stop) obj2);
                    default:
                        return ChatSocketStateService.m54961p((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers7 = stateHandlerBuilder.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(Event.RequiredDisconnection.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m7);
        eventHandlers7.put(orCreateKotlinClass8, interfaceC4351m7);
        final int i25 = 14;
        InterfaceC4351m interfaceC4351m8 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i25) {
                    case 0:
                        return ChatSocketStateService.m54964s((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54932P((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54929M((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 3:
                        return ChatSocketStateService.m54966u((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54954i((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54944a0((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54965t((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 7:
                        return ChatSocketStateService.m54917A((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 8:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54970y((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 10:
                        return ChatSocketStateService.m54955j((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 11:
                        return ChatSocketStateService.m54968w((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 12:
                        return ChatSocketStateService.m54928L((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 13:
                        return ChatSocketStateService.m54931O((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 14:
                        return ChatSocketStateService.m54959n((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 15:
                        return ChatSocketStateService.m54933Q((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 16:
                        return ChatSocketStateService.m54921E((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54919C((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54923G((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54941Y((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Stop) obj2);
                    default:
                        return ChatSocketStateService.m54961p((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers8 = stateHandlerBuilder.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(Event.Stop.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m8);
        eventHandlers8.put(orCreateKotlinClass9, interfaceC4351m8);
        stateFunctions.put(orCreateKotlinClass, stateHandlerBuilder.get());
        Map<InterfaceC21461d, Map<InterfaceC21461d, InterfaceC4351m>> stateFunctions2 = FiniteStateMachine.getStateFunctions();
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(State.Connecting.class);
        StateHandlerBuilder stateHandlerBuilder2 = new StateHandlerBuilder();
        final int i26 = 15;
        InterfaceC4351m interfaceC4351m9 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i26) {
                    case 0:
                        return ChatSocketStateService.m54964s((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54932P((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54929M((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 3:
                        return ChatSocketStateService.m54966u((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54954i((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54944a0((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54965t((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 7:
                        return ChatSocketStateService.m54917A((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 8:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54970y((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 10:
                        return ChatSocketStateService.m54955j((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 11:
                        return ChatSocketStateService.m54968w((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 12:
                        return ChatSocketStateService.m54928L((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 13:
                        return ChatSocketStateService.m54931O((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 14:
                        return ChatSocketStateService.m54959n((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 15:
                        return ChatSocketStateService.m54933Q((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 16:
                        return ChatSocketStateService.m54921E((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54919C((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54923G((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54941Y((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Stop) obj2);
                    default:
                        return ChatSocketStateService.m54961p((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers9 = stateHandlerBuilder2.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(Event.Connect.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m9);
        eventHandlers9.put(orCreateKotlinClass11, interfaceC4351m9);
        final int i27 = 20;
        InterfaceC4351m interfaceC4351m10 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i27) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers10 = stateHandlerBuilder2.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(Event.ConnectionEstablished.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m10);
        eventHandlers10.put(orCreateKotlinClass12, interfaceC4351m10);
        final int i28 = 0;
        InterfaceC4351m interfaceC4351m11 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i28) {
                    case 0:
                        return ChatSocketStateService.m54964s((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54932P((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54929M((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 3:
                        return ChatSocketStateService.m54966u((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54954i((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54944a0((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54965t((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 7:
                        return ChatSocketStateService.m54917A((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 8:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54970y((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 10:
                        return ChatSocketStateService.m54955j((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 11:
                        return ChatSocketStateService.m54968w((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 12:
                        return ChatSocketStateService.m54928L((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 13:
                        return ChatSocketStateService.m54931O((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 14:
                        return ChatSocketStateService.m54959n((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 15:
                        return ChatSocketStateService.m54933Q((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 16:
                        return ChatSocketStateService.m54921E((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54919C((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54923G((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54941Y((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Stop) obj2);
                    default:
                        return ChatSocketStateService.m54961p((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers11 = stateHandlerBuilder2.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(Event.WebSocketEventLost.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m11);
        eventHandlers11.put(orCreateKotlinClass13, interfaceC4351m11);
        final int i29 = 11;
        InterfaceC4351m interfaceC4351m12 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i29) {
                    case 0:
                        return ChatSocketStateService.m54964s((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54932P((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54929M((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 3:
                        return ChatSocketStateService.m54966u((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54954i((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54944a0((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54965t((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 7:
                        return ChatSocketStateService.m54917A((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 8:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54970y((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 10:
                        return ChatSocketStateService.m54955j((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 11:
                        return ChatSocketStateService.m54968w((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 12:
                        return ChatSocketStateService.m54928L((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 13:
                        return ChatSocketStateService.m54931O((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 14:
                        return ChatSocketStateService.m54959n((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 15:
                        return ChatSocketStateService.m54933Q((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 16:
                        return ChatSocketStateService.m54921E((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54919C((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54923G((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54941Y((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Stop) obj2);
                    default:
                        return ChatSocketStateService.m54961p((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers12 = stateHandlerBuilder2.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(Event.NetworkNotAvailable.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m12);
        eventHandlers12.put(orCreateKotlinClass14, interfaceC4351m12);
        final int i34 = 16;
        InterfaceC4351m interfaceC4351m13 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i34) {
                    case 0:
                        return ChatSocketStateService.m54964s((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54932P((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54929M((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 3:
                        return ChatSocketStateService.m54966u((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54954i((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54944a0((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54965t((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 7:
                        return ChatSocketStateService.m54917A((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 8:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54970y((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 10:
                        return ChatSocketStateService.m54955j((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 11:
                        return ChatSocketStateService.m54968w((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 12:
                        return ChatSocketStateService.m54928L((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 13:
                        return ChatSocketStateService.m54931O((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 14:
                        return ChatSocketStateService.m54959n((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 15:
                        return ChatSocketStateService.m54933Q((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 16:
                        return ChatSocketStateService.m54921E((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54919C((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54923G((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54941Y((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Stop) obj2);
                    default:
                        return ChatSocketStateService.m54961p((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers13 = stateHandlerBuilder2.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(Event.UnrecoverableError.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m13);
        eventHandlers13.put(orCreateKotlinClass15, interfaceC4351m13);
        final int i35 = 17;
        InterfaceC4351m interfaceC4351m14 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i35) {
                    case 0:
                        return ChatSocketStateService.m54964s((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54932P((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54929M((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 3:
                        return ChatSocketStateService.m54966u((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54954i((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54944a0((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54965t((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 7:
                        return ChatSocketStateService.m54917A((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 8:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54970y((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 10:
                        return ChatSocketStateService.m54955j((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 11:
                        return ChatSocketStateService.m54968w((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 12:
                        return ChatSocketStateService.m54928L((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 13:
                        return ChatSocketStateService.m54931O((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 14:
                        return ChatSocketStateService.m54959n((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 15:
                        return ChatSocketStateService.m54933Q((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 16:
                        return ChatSocketStateService.m54921E((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54919C((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54923G((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54941Y((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Stop) obj2);
                    default:
                        return ChatSocketStateService.m54961p((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers14 = stateHandlerBuilder2.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(Event.NetworkError.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m14);
        eventHandlers14.put(orCreateKotlinClass16, interfaceC4351m14);
        final int i36 = 18;
        InterfaceC4351m interfaceC4351m15 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i36) {
                    case 0:
                        return ChatSocketStateService.m54964s((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54932P((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54929M((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 3:
                        return ChatSocketStateService.m54966u((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54954i((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54944a0((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54965t((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 7:
                        return ChatSocketStateService.m54917A((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 8:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54970y((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 10:
                        return ChatSocketStateService.m54955j((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 11:
                        return ChatSocketStateService.m54968w((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 12:
                        return ChatSocketStateService.m54928L((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 13:
                        return ChatSocketStateService.m54931O((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 14:
                        return ChatSocketStateService.m54959n((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 15:
                        return ChatSocketStateService.m54933Q((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 16:
                        return ChatSocketStateService.m54921E((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54919C((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54923G((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54941Y((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Stop) obj2);
                    default:
                        return ChatSocketStateService.m54961p((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers15 = stateHandlerBuilder2.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(Event.RequiredDisconnection.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m15);
        eventHandlers15.put(orCreateKotlinClass17, interfaceC4351m15);
        final int i37 = 19;
        InterfaceC4351m interfaceC4351m16 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i37) {
                    case 0:
                        return ChatSocketStateService.m54964s((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54932P((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54929M((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 3:
                        return ChatSocketStateService.m54966u((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54954i((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54944a0((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54965t((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 7:
                        return ChatSocketStateService.m54917A((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 8:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54970y((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 10:
                        return ChatSocketStateService.m54955j((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 11:
                        return ChatSocketStateService.m54968w((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 12:
                        return ChatSocketStateService.m54928L((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 13:
                        return ChatSocketStateService.m54931O((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 14:
                        return ChatSocketStateService.m54959n((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 15:
                        return ChatSocketStateService.m54933Q((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 16:
                        return ChatSocketStateService.m54921E((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54919C((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54923G((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54941Y((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Stop) obj2);
                    default:
                        return ChatSocketStateService.m54961p((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers16 = stateHandlerBuilder2.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(Event.Stop.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m16);
        eventHandlers16.put(orCreateKotlinClass18, interfaceC4351m16);
        stateFunctions2.put(orCreateKotlinClass10, stateHandlerBuilder2.get());
        Map<InterfaceC21461d, Map<InterfaceC21461d, InterfaceC4351m>> stateFunctions3 = FiniteStateMachine.getStateFunctions();
        InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(State.Connected.class);
        StateHandlerBuilder stateHandlerBuilder3 = new StateHandlerBuilder();
        final int i38 = 20;
        InterfaceC4351m interfaceC4351m17 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i38) {
                    case 0:
                        return ChatSocketStateService.m54964s((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54932P((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54929M((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 3:
                        return ChatSocketStateService.m54966u((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54954i((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54944a0((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54965t((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 7:
                        return ChatSocketStateService.m54917A((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 8:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54970y((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 10:
                        return ChatSocketStateService.m54955j((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 11:
                        return ChatSocketStateService.m54968w((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 12:
                        return ChatSocketStateService.m54928L((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 13:
                        return ChatSocketStateService.m54931O((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 14:
                        return ChatSocketStateService.m54959n((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 15:
                        return ChatSocketStateService.m54933Q((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 16:
                        return ChatSocketStateService.m54921E((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54919C((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54923G((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54941Y((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Stop) obj2);
                    default:
                        return ChatSocketStateService.m54961p((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers17 = stateHandlerBuilder3.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass20 = c22673i0.getOrCreateKotlinClass(Event.ConnectionEstablished.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m17);
        eventHandlers17.put(orCreateKotlinClass20, interfaceC4351m17);
        final int i39 = 0;
        InterfaceC4351m interfaceC4351m18 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i39) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers18 = stateHandlerBuilder3.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass21 = c22673i0.getOrCreateKotlinClass(Event.WebSocketEventLost.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m18);
        eventHandlers18.put(orCreateKotlinClass21, interfaceC4351m18);
        final int i44 = 1;
        InterfaceC4351m interfaceC4351m19 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i44) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers19 = stateHandlerBuilder3.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass22 = c22673i0.getOrCreateKotlinClass(Event.NetworkNotAvailable.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m19);
        eventHandlers19.put(orCreateKotlinClass22, interfaceC4351m19);
        final int i45 = 3;
        InterfaceC4351m interfaceC4351m20 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i45) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers20 = stateHandlerBuilder3.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass23 = c22673i0.getOrCreateKotlinClass(Event.UnrecoverableError.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m20);
        eventHandlers20.put(orCreateKotlinClass23, interfaceC4351m20);
        final int i46 = 4;
        InterfaceC4351m interfaceC4351m21 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i46) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers21 = stateHandlerBuilder3.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass24 = c22673i0.getOrCreateKotlinClass(Event.NetworkError.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m21);
        eventHandlers21.put(orCreateKotlinClass24, interfaceC4351m21);
        final int i47 = 5;
        InterfaceC4351m interfaceC4351m22 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i47) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers22 = stateHandlerBuilder3.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass25 = c22673i0.getOrCreateKotlinClass(Event.RequiredDisconnection.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m22);
        eventHandlers22.put(orCreateKotlinClass25, interfaceC4351m22);
        final int i48 = 6;
        InterfaceC4351m interfaceC4351m23 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i48) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers23 = stateHandlerBuilder3.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass26 = c22673i0.getOrCreateKotlinClass(Event.Stop.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m23);
        eventHandlers23.put(orCreateKotlinClass26, interfaceC4351m23);
        stateFunctions3.put(orCreateKotlinClass19, stateHandlerBuilder3.get());
        Map<InterfaceC21461d, Map<InterfaceC21461d, InterfaceC4351m>> stateFunctions4 = FiniteStateMachine.getStateFunctions();
        InterfaceC21461d orCreateKotlinClass27 = c22673i0.getOrCreateKotlinClass(State.Disconnected.Stopped.class);
        StateHandlerBuilder stateHandlerBuilder4 = new StateHandlerBuilder();
        final int i49 = 7;
        InterfaceC4351m interfaceC4351m24 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i49) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers24 = stateHandlerBuilder4.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass28 = c22673i0.getOrCreateKotlinClass(Event.RequiredDisconnection.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m24);
        eventHandlers24.put(orCreateKotlinClass28, interfaceC4351m24);
        final int i54 = 8;
        InterfaceC4351m interfaceC4351m25 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i54) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers25 = stateHandlerBuilder4.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass29 = c22673i0.getOrCreateKotlinClass(Event.Connect.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m25);
        eventHandlers25.put(orCreateKotlinClass29, interfaceC4351m25);
        final int i55 = 9;
        InterfaceC4351m interfaceC4351m26 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i55) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers26 = stateHandlerBuilder4.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass30 = c22673i0.getOrCreateKotlinClass(Event.Resume.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m26);
        eventHandlers26.put(orCreateKotlinClass30, interfaceC4351m26);
        stateFunctions4.put(orCreateKotlinClass27, stateHandlerBuilder4.get());
        Map<InterfaceC21461d, Map<InterfaceC21461d, InterfaceC4351m>> stateFunctions5 = FiniteStateMachine.getStateFunctions();
        InterfaceC21461d orCreateKotlinClass31 = c22673i0.getOrCreateKotlinClass(State.Disconnected.NetworkDisconnected.class);
        StateHandlerBuilder stateHandlerBuilder5 = new StateHandlerBuilder();
        final int i56 = 10;
        InterfaceC4351m interfaceC4351m27 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i56) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers27 = stateHandlerBuilder5.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass32 = c22673i0.getOrCreateKotlinClass(Event.Connect.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m27);
        eventHandlers27.put(orCreateKotlinClass32, interfaceC4351m27);
        final int i57 = 11;
        InterfaceC4351m interfaceC4351m28 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i57) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers28 = stateHandlerBuilder5.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass33 = c22673i0.getOrCreateKotlinClass(Event.ConnectionEstablished.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m28);
        eventHandlers28.put(orCreateKotlinClass33, interfaceC4351m28);
        final int i58 = 12;
        InterfaceC4351m interfaceC4351m29 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i58) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers29 = stateHandlerBuilder5.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass34 = c22673i0.getOrCreateKotlinClass(Event.UnrecoverableError.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m29);
        eventHandlers29.put(orCreateKotlinClass34, interfaceC4351m29);
        final int i59 = 14;
        InterfaceC4351m interfaceC4351m30 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i59) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers30 = stateHandlerBuilder5.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass35 = c22673i0.getOrCreateKotlinClass(Event.NetworkError.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m30);
        eventHandlers30.put(orCreateKotlinClass35, interfaceC4351m30);
        final int i64 = 15;
        InterfaceC4351m interfaceC4351m31 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i64) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers31 = stateHandlerBuilder5.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass36 = c22673i0.getOrCreateKotlinClass(Event.RequiredDisconnection.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m31);
        eventHandlers31.put(orCreateKotlinClass36, interfaceC4351m31);
        final int i65 = 16;
        InterfaceC4351m interfaceC4351m32 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i65) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers32 = stateHandlerBuilder5.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass37 = c22673i0.getOrCreateKotlinClass(Event.Stop.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m32);
        eventHandlers32.put(orCreateKotlinClass37, interfaceC4351m32);
        final int i66 = 17;
        InterfaceC4351m interfaceC4351m33 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i66) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers33 = stateHandlerBuilder5.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass38 = c22673i0.getOrCreateKotlinClass(Event.NetworkAvailable.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m33);
        eventHandlers33.put(orCreateKotlinClass38, interfaceC4351m33);
        stateFunctions5.put(orCreateKotlinClass31, stateHandlerBuilder5.get());
        Map<InterfaceC21461d, Map<InterfaceC21461d, InterfaceC4351m>> stateFunctions6 = FiniteStateMachine.getStateFunctions();
        InterfaceC21461d orCreateKotlinClass39 = c22673i0.getOrCreateKotlinClass(State.Disconnected.WebSocketEventLost.class);
        StateHandlerBuilder stateHandlerBuilder6 = new StateHandlerBuilder();
        final int i67 = 18;
        InterfaceC4351m interfaceC4351m34 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i67) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers34 = stateHandlerBuilder6.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass40 = c22673i0.getOrCreateKotlinClass(Event.Connect.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m34);
        eventHandlers34.put(orCreateKotlinClass40, interfaceC4351m34);
        final int i68 = 19;
        InterfaceC4351m interfaceC4351m35 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i68) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers35 = stateHandlerBuilder6.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass41 = c22673i0.getOrCreateKotlinClass(Event.ConnectionEstablished.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m35);
        eventHandlers35.put(orCreateKotlinClass41, interfaceC4351m35);
        final int i69 = 21;
        InterfaceC4351m interfaceC4351m36 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i69) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers36 = stateHandlerBuilder6.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass42 = c22673i0.getOrCreateKotlinClass(Event.NetworkNotAvailable.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m36);
        eventHandlers36.put(orCreateKotlinClass42, interfaceC4351m36);
        final int i74 = 22;
        InterfaceC4351m interfaceC4351m37 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i74) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers37 = stateHandlerBuilder6.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass43 = c22673i0.getOrCreateKotlinClass(Event.UnrecoverableError.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m37);
        eventHandlers37.put(orCreateKotlinClass43, interfaceC4351m37);
        final int i75 = 23;
        InterfaceC4351m interfaceC4351m38 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i75) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers38 = stateHandlerBuilder6.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass44 = c22673i0.getOrCreateKotlinClass(Event.NetworkError.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m38);
        eventHandlers38.put(orCreateKotlinClass44, interfaceC4351m38);
        final int i76 = 24;
        InterfaceC4351m interfaceC4351m39 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i76) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers39 = stateHandlerBuilder6.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass45 = c22673i0.getOrCreateKotlinClass(Event.RequiredDisconnection.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m39);
        eventHandlers39.put(orCreateKotlinClass45, interfaceC4351m39);
        final int i77 = 26;
        InterfaceC4351m interfaceC4351m40 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i77) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers40 = stateHandlerBuilder6.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass46 = c22673i0.getOrCreateKotlinClass(Event.Stop.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m40);
        eventHandlers40.put(orCreateKotlinClass46, interfaceC4351m40);
        stateFunctions6.put(orCreateKotlinClass39, stateHandlerBuilder6.get());
        Map<InterfaceC21461d, Map<InterfaceC21461d, InterfaceC4351m>> stateFunctions7 = FiniteStateMachine.getStateFunctions();
        InterfaceC21461d orCreateKotlinClass47 = c22673i0.getOrCreateKotlinClass(State.Disconnected.DisconnectedByRequest.class);
        StateHandlerBuilder stateHandlerBuilder7 = new StateHandlerBuilder();
        final int i78 = 1;
        InterfaceC4351m interfaceC4351m41 = new InterfaceC4351m(chatSocketStateService) { // from class: io.getstream.chat.android.client.socket.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatSocketStateService f73954x;

            {
                this.f73954x = chatSocketStateService;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i78) {
                    case 0:
                        ChatSocketStateService.State state2 = (ChatSocketStateService.State) obj;
                        ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$12(this.f73954x, state2, (ChatSocketStateService.Event) obj2);
                        return state2;
                    default:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$59(this.f73954x, (ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers41 = stateHandlerBuilder7.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass48 = c22673i0.getOrCreateKotlinClass(Event.RequiredDisconnection.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m41);
        eventHandlers41.put(orCreateKotlinClass48, interfaceC4351m41);
        final int i79 = 27;
        InterfaceC4351m interfaceC4351m42 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i79) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers42 = stateHandlerBuilder7.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass49 = c22673i0.getOrCreateKotlinClass(Event.Connect.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m42);
        eventHandlers42.put(orCreateKotlinClass49, interfaceC4351m42);
        stateFunctions7.put(orCreateKotlinClass47, stateHandlerBuilder7.get());
        Map<InterfaceC21461d, Map<InterfaceC21461d, InterfaceC4351m>> stateFunctions8 = FiniteStateMachine.getStateFunctions();
        InterfaceC21461d orCreateKotlinClass50 = c22673i0.getOrCreateKotlinClass(State.Disconnected.DisconnectedTemporarily.class);
        StateHandlerBuilder stateHandlerBuilder8 = new StateHandlerBuilder();
        final int i83 = 28;
        InterfaceC4351m interfaceC4351m43 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i83) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers43 = stateHandlerBuilder8.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass51 = c22673i0.getOrCreateKotlinClass(Event.Connect.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m43);
        eventHandlers43.put(orCreateKotlinClass51, interfaceC4351m43);
        final int i84 = 29;
        InterfaceC4351m interfaceC4351m44 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i84) {
                    case 0:
                        return ChatSocketStateService.m54957l((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54953h((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54946b0((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 3:
                        return ChatSocketStateService.m54936T((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54934R((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54967v((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54939W((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 7:
                        return ChatSocketStateService.m54920D((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 8:
                        return ChatSocketStateService.m54949d((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54947c((ChatSocketStateService.State.Disconnected.Stopped) obj, (ChatSocketStateService.Event.Resume) obj2);
                    case 10:
                        return ChatSocketStateService.m54971z((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 11:
                        return ChatSocketStateService.m54963r((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 12:
                        return ChatSocketStateService.m54935S((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 13:
                        return ChatSocketStateService.m54930N((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 14:
                        return ChatSocketStateService.m54918B((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 15:
                        return ChatSocketStateService.m54943a((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 16:
                        return ChatSocketStateService.m54924H((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54940X((ChatSocketStateService.State.Disconnected.NetworkDisconnected) obj, (ChatSocketStateService.Event.NetworkAvailable) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54948c0((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54942Z((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 20:
                        return ChatSocketStateService.m54950e((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                    case 21:
                        return ChatSocketStateService.m54962q((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return ChatSocketStateService.m54969x((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return ChatSocketStateService.m54926J((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 24:
                        return ChatSocketStateService.m54938V((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 25:
                        return ChatSocketStateService.m54937U((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 26:
                        return ChatSocketStateService.m54958m((ChatSocketStateService.State.Disconnected.WebSocketEventLost) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 27:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60((ChatSocketStateService.State.Disconnected.DisconnectedByRequest) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 28:
                        return ChatSocketStateService.m54945b((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Connect) obj2);
                    default:
                        return ChatSocketStateService.m54956k((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers44 = stateHandlerBuilder8.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass52 = c22673i0.getOrCreateKotlinClass(Event.ConnectionEstablished.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m44);
        eventHandlers44.put(orCreateKotlinClass52, interfaceC4351m44);
        final int i85 = 1;
        InterfaceC4351m interfaceC4351m45 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i85) {
                    case 0:
                        return ChatSocketStateService.m54964s((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54932P((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54929M((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 3:
                        return ChatSocketStateService.m54966u((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54954i((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54944a0((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54965t((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 7:
                        return ChatSocketStateService.m54917A((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 8:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54970y((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 10:
                        return ChatSocketStateService.m54955j((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 11:
                        return ChatSocketStateService.m54968w((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 12:
                        return ChatSocketStateService.m54928L((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 13:
                        return ChatSocketStateService.m54931O((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 14:
                        return ChatSocketStateService.m54959n((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 15:
                        return ChatSocketStateService.m54933Q((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 16:
                        return ChatSocketStateService.m54921E((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54919C((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54923G((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54941Y((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Stop) obj2);
                    default:
                        return ChatSocketStateService.m54961p((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers45 = stateHandlerBuilder8.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass53 = c22673i0.getOrCreateKotlinClass(Event.NetworkNotAvailable.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m45);
        eventHandlers45.put(orCreateKotlinClass53, interfaceC4351m45);
        final int i86 = 2;
        InterfaceC4351m interfaceC4351m46 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i86) {
                    case 0:
                        return ChatSocketStateService.m54964s((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54932P((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54929M((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 3:
                        return ChatSocketStateService.m54966u((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54954i((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54944a0((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54965t((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 7:
                        return ChatSocketStateService.m54917A((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 8:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54970y((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 10:
                        return ChatSocketStateService.m54955j((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 11:
                        return ChatSocketStateService.m54968w((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 12:
                        return ChatSocketStateService.m54928L((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 13:
                        return ChatSocketStateService.m54931O((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 14:
                        return ChatSocketStateService.m54959n((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 15:
                        return ChatSocketStateService.m54933Q((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 16:
                        return ChatSocketStateService.m54921E((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54919C((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54923G((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54941Y((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Stop) obj2);
                    default:
                        return ChatSocketStateService.m54961p((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers46 = stateHandlerBuilder8.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass54 = c22673i0.getOrCreateKotlinClass(Event.WebSocketEventLost.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m46);
        eventHandlers46.put(orCreateKotlinClass54, interfaceC4351m46);
        final int i87 = 3;
        InterfaceC4351m interfaceC4351m47 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i87) {
                    case 0:
                        return ChatSocketStateService.m54964s((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54932P((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54929M((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 3:
                        return ChatSocketStateService.m54966u((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54954i((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54944a0((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54965t((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 7:
                        return ChatSocketStateService.m54917A((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 8:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54970y((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 10:
                        return ChatSocketStateService.m54955j((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 11:
                        return ChatSocketStateService.m54968w((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 12:
                        return ChatSocketStateService.m54928L((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 13:
                        return ChatSocketStateService.m54931O((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 14:
                        return ChatSocketStateService.m54959n((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 15:
                        return ChatSocketStateService.m54933Q((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 16:
                        return ChatSocketStateService.m54921E((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54919C((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54923G((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54941Y((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Stop) obj2);
                    default:
                        return ChatSocketStateService.m54961p((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers47 = stateHandlerBuilder8.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass55 = c22673i0.getOrCreateKotlinClass(Event.UnrecoverableError.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m47);
        eventHandlers47.put(orCreateKotlinClass55, interfaceC4351m47);
        final int i88 = 4;
        InterfaceC4351m interfaceC4351m48 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i88) {
                    case 0:
                        return ChatSocketStateService.m54964s((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54932P((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54929M((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 3:
                        return ChatSocketStateService.m54966u((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54954i((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54944a0((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54965t((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 7:
                        return ChatSocketStateService.m54917A((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 8:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54970y((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 10:
                        return ChatSocketStateService.m54955j((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 11:
                        return ChatSocketStateService.m54968w((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 12:
                        return ChatSocketStateService.m54928L((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 13:
                        return ChatSocketStateService.m54931O((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 14:
                        return ChatSocketStateService.m54959n((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 15:
                        return ChatSocketStateService.m54933Q((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 16:
                        return ChatSocketStateService.m54921E((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54919C((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54923G((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54941Y((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Stop) obj2);
                    default:
                        return ChatSocketStateService.m54961p((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers48 = stateHandlerBuilder8.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass56 = c22673i0.getOrCreateKotlinClass(Event.NetworkError.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m48);
        eventHandlers48.put(orCreateKotlinClass56, interfaceC4351m48);
        final int i89 = 5;
        InterfaceC4351m interfaceC4351m49 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i89) {
                    case 0:
                        return ChatSocketStateService.m54964s((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54932P((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54929M((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 3:
                        return ChatSocketStateService.m54966u((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54954i((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54944a0((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54965t((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 7:
                        return ChatSocketStateService.m54917A((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 8:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54970y((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 10:
                        return ChatSocketStateService.m54955j((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 11:
                        return ChatSocketStateService.m54968w((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 12:
                        return ChatSocketStateService.m54928L((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 13:
                        return ChatSocketStateService.m54931O((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 14:
                        return ChatSocketStateService.m54959n((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 15:
                        return ChatSocketStateService.m54933Q((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 16:
                        return ChatSocketStateService.m54921E((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54919C((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54923G((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54941Y((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Stop) obj2);
                    default:
                        return ChatSocketStateService.m54961p((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers49 = stateHandlerBuilder8.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass57 = c22673i0.getOrCreateKotlinClass(Event.RequiredDisconnection.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m49);
        eventHandlers49.put(orCreateKotlinClass57, interfaceC4351m49);
        final int i94 = 7;
        InterfaceC4351m interfaceC4351m50 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i94) {
                    case 0:
                        return ChatSocketStateService.m54964s((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54932P((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54929M((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 3:
                        return ChatSocketStateService.m54966u((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54954i((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54944a0((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54965t((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 7:
                        return ChatSocketStateService.m54917A((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 8:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54970y((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 10:
                        return ChatSocketStateService.m54955j((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 11:
                        return ChatSocketStateService.m54968w((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 12:
                        return ChatSocketStateService.m54928L((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 13:
                        return ChatSocketStateService.m54931O((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 14:
                        return ChatSocketStateService.m54959n((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 15:
                        return ChatSocketStateService.m54933Q((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 16:
                        return ChatSocketStateService.m54921E((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54919C((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54923G((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54941Y((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Stop) obj2);
                    default:
                        return ChatSocketStateService.m54961p((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers50 = stateHandlerBuilder8.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass58 = c22673i0.getOrCreateKotlinClass(Event.Stop.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m50);
        eventHandlers50.put(orCreateKotlinClass58, interfaceC4351m50);
        stateFunctions8.put(orCreateKotlinClass50, stateHandlerBuilder8.get());
        Map<InterfaceC21461d, Map<InterfaceC21461d, InterfaceC4351m>> stateFunctions9 = FiniteStateMachine.getStateFunctions();
        InterfaceC21461d orCreateKotlinClass59 = c22673i0.getOrCreateKotlinClass(State.Disconnected.DisconnectedPermanently.class);
        StateHandlerBuilder stateHandlerBuilder9 = new StateHandlerBuilder();
        final int i95 = 8;
        InterfaceC4351m interfaceC4351m51 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i95) {
                    case 0:
                        return ChatSocketStateService.m54964s((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54932P((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54929M((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 3:
                        return ChatSocketStateService.m54966u((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54954i((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54944a0((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54965t((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 7:
                        return ChatSocketStateService.m54917A((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 8:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54970y((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 10:
                        return ChatSocketStateService.m54955j((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 11:
                        return ChatSocketStateService.m54968w((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 12:
                        return ChatSocketStateService.m54928L((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 13:
                        return ChatSocketStateService.m54931O((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 14:
                        return ChatSocketStateService.m54959n((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 15:
                        return ChatSocketStateService.m54933Q((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 16:
                        return ChatSocketStateService.m54921E((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54919C((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54923G((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54941Y((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Stop) obj2);
                    default:
                        return ChatSocketStateService.m54961p((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers51 = stateHandlerBuilder9.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass60 = c22673i0.getOrCreateKotlinClass(Event.Connect.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m51);
        eventHandlers51.put(orCreateKotlinClass60, interfaceC4351m51);
        final int i96 = 9;
        InterfaceC4351m interfaceC4351m52 = new InterfaceC4351m() { // from class: io.getstream.chat.android.client.socket.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i96) {
                    case 0:
                        return ChatSocketStateService.m54964s((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 1:
                        return ChatSocketStateService.m54932P((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 2:
                        return ChatSocketStateService.m54929M((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.WebSocketEventLost) obj2);
                    case 3:
                        return ChatSocketStateService.m54966u((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 4:
                        return ChatSocketStateService.m54954i((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 5:
                        return ChatSocketStateService.m54944a0((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 6:
                        return ChatSocketStateService.m54965t((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 7:
                        return ChatSocketStateService.m54917A((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 8:
                        return ChatSocketStateService.stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 9:
                        return ChatSocketStateService.m54970y((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 10:
                        return ChatSocketStateService.m54955j((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case 11:
                        return ChatSocketStateService.m54968w((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkNotAvailable) obj2);
                    case 12:
                        return ChatSocketStateService.m54928L((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case 13:
                        return ChatSocketStateService.m54931O((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case 14:
                        return ChatSocketStateService.m54959n((ChatSocketStateService.State.RestartConnection) obj, (ChatSocketStateService.Event.Stop) obj2);
                    case 15:
                        return ChatSocketStateService.m54933Q((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Connect) obj2);
                    case 16:
                        return ChatSocketStateService.m54921E((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.UnrecoverableError) obj2);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return ChatSocketStateService.m54919C((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.NetworkError) obj2);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return ChatSocketStateService.m54923G((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.RequiredDisconnection) obj2);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return ChatSocketStateService.m54941Y((ChatSocketStateService.State.Connecting) obj, (ChatSocketStateService.Event.Stop) obj2);
                    default:
                        return ChatSocketStateService.m54961p((ChatSocketStateService.State.Connected) obj, (ChatSocketStateService.Event.ConnectionEstablished) obj2);
                }
            }
        };
        Map<InterfaceC21461d, InterfaceC4351m> eventHandlers52 = stateHandlerBuilder9.getEventHandlers();
        InterfaceC21461d orCreateKotlinClass61 = c22673i0.getOrCreateKotlinClass(Event.RequiredDisconnection.class);
        AbstractC22681m0.m65774e(2, interfaceC4351m52);
        eventHandlers52.put(orCreateKotlinClass61, interfaceC4351m52);
        stateFunctions9.put(orCreateKotlinClass59, stateHandlerBuilder9.get());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State stateMachine_delegate$lambda$75$lambda$74$lambda$12(ChatSocketStateService chatSocketStateService, State state, Event event) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(event, "event");
        C2345k logger = chatSocketStateService.getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "Cannot handle event " + event + " while being in inappropriate state " + state, null);
        }
        return state;
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$13(State.RestartConnection onEvent, Event.Connect it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Connecting(it.getConnectionConf(), it.getConnectionType());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$14(State.RestartConnection onEvent, Event.ConnectionEstablished it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Connected(it.getConnectedEvent());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$15(State.RestartConnection onEvent, Event.WebSocketEventLost it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.WebSocketEventLost.INSTANCE;
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$16(State.RestartConnection onEvent, Event.NetworkNotAvailable it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.NetworkDisconnected.INSTANCE;
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$17(State.RestartConnection onEvent, Event.UnrecoverableError it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Disconnected.DisconnectedPermanently(it.getError());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$18(State.RestartConnection onEvent, Event.NetworkError it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Disconnected.DisconnectedTemporarily(it.getError());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$19(State.RestartConnection onEvent, Event.RequiredDisconnection it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.DisconnectedByRequest.INSTANCE;
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$20(State.RestartConnection onEvent, Event.Stop it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.Stopped.INSTANCE;
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$22(State.Connecting onEvent, Event.Connect it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Connecting(it.getConnectionConf(), it.getConnectionType());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$23(State.Connecting onEvent, Event.ConnectionEstablished it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Connected(it.getConnectedEvent());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$24(State.Connecting onEvent, Event.WebSocketEventLost it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.WebSocketEventLost.INSTANCE;
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$25(State.Connecting onEvent, Event.NetworkNotAvailable it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.NetworkDisconnected.INSTANCE;
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$26(State.Connecting onEvent, Event.UnrecoverableError it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Disconnected.DisconnectedPermanently(it.getError());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$27(State.Connecting onEvent, Event.NetworkError it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Disconnected.DisconnectedTemporarily(it.getError());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$28(State.Connecting onEvent, Event.RequiredDisconnection it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.DisconnectedByRequest.INSTANCE;
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$29(State.Connecting onEvent, Event.Stop it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.Stopped.INSTANCE;
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$31(State.Connected onEvent, Event.ConnectionEstablished it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Connected(it.getConnectedEvent());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$32(State.Connected onEvent, Event.WebSocketEventLost it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.WebSocketEventLost.INSTANCE;
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$33(State.Connected onEvent, Event.NetworkNotAvailable it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.NetworkDisconnected.INSTANCE;
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$34(State.Connected onEvent, Event.UnrecoverableError it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Disconnected.DisconnectedPermanently(it.getError());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$35(State.Connected onEvent, Event.NetworkError it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Disconnected.DisconnectedTemporarily(it.getError());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$36(State.Connected onEvent, Event.RequiredDisconnection it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.DisconnectedByRequest.INSTANCE;
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$37(State.Connected onEvent, Event.Stop it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.Stopped.INSTANCE;
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$42$lambda$39(State.Disconnected.Stopped onEvent, Event.RequiredDisconnection it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.DisconnectedByRequest.INSTANCE;
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$42$lambda$40(State.Disconnected.Stopped onEvent, Event.Connect it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Connecting(it.getConnectionConf(), it.getConnectionType());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$42$lambda$41(State.Disconnected.Stopped onEvent, Event.Resume it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.RestartConnection(RestartReason.LIFECYCLE_RESUME);
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$43(State.Disconnected.NetworkDisconnected onEvent, Event.Connect it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Connecting(it.getConnectionConf(), it.getConnectionType());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$44(State.Disconnected.NetworkDisconnected onEvent, Event.ConnectionEstablished it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Connected(it.getConnectedEvent());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$45(State.Disconnected.NetworkDisconnected onEvent, Event.UnrecoverableError it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Disconnected.DisconnectedPermanently(it.getError());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$46(State.Disconnected.NetworkDisconnected onEvent, Event.NetworkError it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Disconnected.DisconnectedTemporarily(it.getError());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$47(State.Disconnected.NetworkDisconnected onEvent, Event.RequiredDisconnection it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.DisconnectedByRequest.INSTANCE;
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$48(State.Disconnected.NetworkDisconnected onEvent, Event.Stop it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.Stopped.INSTANCE;
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$49(State.Disconnected.NetworkDisconnected onEvent, Event.NetworkAvailable it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.RestartConnection(RestartReason.NETWORK_AVAILABLE);
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$51(State.Disconnected.WebSocketEventLost onEvent, Event.Connect it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Connecting(it.getConnectionConf(), it.getConnectionType());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$52(State.Disconnected.WebSocketEventLost onEvent, Event.ConnectionEstablished it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Connected(it.getConnectedEvent());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$53(State.Disconnected.WebSocketEventLost onEvent, Event.NetworkNotAvailable it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.NetworkDisconnected.INSTANCE;
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$54(State.Disconnected.WebSocketEventLost onEvent, Event.UnrecoverableError it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Disconnected.DisconnectedPermanently(it.getError());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$55(State.Disconnected.WebSocketEventLost onEvent, Event.NetworkError it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Disconnected.DisconnectedTemporarily(it.getError());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$56(State.Disconnected.WebSocketEventLost onEvent, Event.RequiredDisconnection it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.DisconnectedByRequest.INSTANCE;
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$57(State.Disconnected.WebSocketEventLost onEvent, Event.Stop it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.Stopped.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$59(ChatSocketStateService chatSocketStateService, State.Disconnected.DisconnectedByRequest onEvent, Event.RequiredDisconnection it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return chatSocketStateService.getCurrentState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60(State.Disconnected.DisconnectedByRequest onEvent, Event.Connect it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        int i13 = WhenMappings.$EnumSwitchMapping$0[it.getConnectionType().ordinal()];
        if (i13 == 1) {
            return new State.Connecting(it.getConnectionConf(), it.getConnectionType());
        }
        if (i13 == 2) {
            return onEvent;
        }
        if (i13 == 3) {
            return new State.Connecting(it.getConnectionConf(), it.getConnectionType());
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$62(State.Disconnected.DisconnectedTemporarily onEvent, Event.Connect it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Connecting(it.getConnectionConf(), it.getConnectionType());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$63(State.Disconnected.DisconnectedTemporarily onEvent, Event.ConnectionEstablished it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Connected(it.getConnectedEvent());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$64(State.Disconnected.DisconnectedTemporarily onEvent, Event.NetworkNotAvailable it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.NetworkDisconnected.INSTANCE;
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$65(State.Disconnected.DisconnectedTemporarily onEvent, Event.WebSocketEventLost it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.WebSocketEventLost.INSTANCE;
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$66(State.Disconnected.DisconnectedTemporarily onEvent, Event.UnrecoverableError it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Disconnected.DisconnectedPermanently(it.getError());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$67(State.Disconnected.DisconnectedTemporarily onEvent, Event.NetworkError it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return new State.Disconnected.DisconnectedTemporarily(it.getError());
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$68(State.Disconnected.DisconnectedTemporarily onEvent, Event.RequiredDisconnection it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.DisconnectedByRequest.INSTANCE;
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$69(State.Disconnected.DisconnectedTemporarily onEvent, Event.Stop it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.Stopped.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71(State.Disconnected.DisconnectedPermanently onEvent, Event.Connect it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        int i13 = WhenMappings.$EnumSwitchMapping$0[it.getConnectionType().ordinal()];
        if (i13 == 1) {
            return new State.Connecting(it.getConnectionConf(), it.getConnectionType());
        }
        if (i13 == 2) {
            return onEvent;
        }
        if (i13 == 3) {
            return new State.Connecting(it.getConnectionConf(), it.getConnectionType());
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final State stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$72(State.Disconnected.DisconnectedPermanently onEvent, Event.RequiredDisconnection it) {
        AbstractC22676k.m65750j(onEvent, "$this$onEvent");
        AbstractC22676k.m65750j(it, "it");
        return State.Disconnected.DisconnectedByRequest.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ State.Disconnected.NetworkDisconnected m54965t(State.RestartConnection restartConnection, Event.NetworkNotAvailable networkNotAvailable) {
        return (State.Disconnected.NetworkDisconnected) stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$16(restartConnection, networkNotAvailable);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ State.Disconnected.DisconnectedPermanently m54966u(State.Disconnected.DisconnectedTemporarily disconnectedTemporarily, Event.UnrecoverableError unrecoverableError) {
        return (State.Disconnected.DisconnectedPermanently) stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$66(disconnectedTemporarily, unrecoverableError);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ State.Disconnected.DisconnectedByRequest m54967v(State.Connected connected, Event.RequiredDisconnection requiredDisconnection) {
        return (State.Disconnected.DisconnectedByRequest) stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$36(connected, requiredDisconnection);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ State.Disconnected.NetworkDisconnected m54968w(State.Connecting connecting, Event.NetworkNotAvailable networkNotAvailable) {
        return (State.Disconnected.NetworkDisconnected) stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$25(connecting, networkNotAvailable);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ State.Disconnected.DisconnectedPermanently m54969x(State.Disconnected.WebSocketEventLost webSocketEventLost, Event.UnrecoverableError unrecoverableError) {
        return (State.Disconnected.DisconnectedPermanently) stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$54(webSocketEventLost, unrecoverableError);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ State.Disconnected.DisconnectedByRequest m54970y(State.Disconnected.DisconnectedPermanently disconnectedPermanently, Event.RequiredDisconnection requiredDisconnection) {
        return (State.Disconnected.DisconnectedByRequest) stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$72(disconnectedPermanently, requiredDisconnection);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ State.Connecting m54971z(State.Disconnected.NetworkDisconnected networkDisconnected, Event.Connect connect) {
        return (State.Connecting) stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$43(networkDisconnected, connect);
    }

    public final State getCurrentState() {
        return getStateMachine().getState();
    }

    public final InterfaceC13037f2 getCurrentStateFlow() {
        return getStateMachine().getStateFlow();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object observer(InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C194341 c194341;
        if (interfaceC30057d instanceof C194341) {
            c194341 = (C194341) interfaceC30057d;
            int i13 = c194341.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c194341.label = i13 - Integer.MIN_VALUE;
            } else {
                c194341 = new C194341(interfaceC30057d);
            }
        } else {
            c194341 = new C194341(interfaceC30057d);
        }
        Object obj = c194341.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c194341.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC13037f2 stateFlow = getStateMachine().getStateFlow();
            C19435xe21bf3bc c19435xe21bf3bc = new C19435xe21bf3bc(interfaceC4351m);
            c194341.L$0 = null;
            c194341.label = 1;
            if (stateFlow.collect(c19435xe21bf3bc, c194341) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        throw new KotlinNothingValueException();
    }

    public final Object onConnect(SocketFactory.ConnectionConf connectionConf, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC11478a.m30857i("[onConnect] user.id: '", connectionConf.getUser().getId(), "', isReconnection: ", connectionConf.getIsReconnection()), null);
        }
        Object objSendEvent = getStateMachine().sendEvent(new Event.Connect(connectionConf, ConnectionType.INITIAL_CONNECTION), interfaceC30057d);
        return objSendEvent == EnumC31071a.f128113w ? objSendEvent : C23454a0.f92919a;
    }

    public final Object onConnectionEstablished(ConnectedEvent connectedEvent, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC31061c.m95640p("[onConnected] user.id: '", connectedEvent.getMe().getId(), "', connectionId: ", connectedEvent.getConnectionId()), null);
        }
        Object objSendEvent = getStateMachine().sendEvent(new Event.ConnectionEstablished(connectedEvent), interfaceC30057d);
        return objSendEvent == EnumC31071a.f128113w ? objSendEvent : C23454a0.f92919a;
    }

    public final Object onNetworkAvailable(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[onNetworkAvailable] no args", null);
        }
        Object objSendEvent = getStateMachine().sendEvent(Event.NetworkAvailable.INSTANCE, interfaceC30057d);
        return objSendEvent == EnumC31071a.f128113w ? objSendEvent : C23454a0.f92919a;
    }

    public final Object onNetworkError(C26200c c26200c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[onNetworkError] error: " + c26200c, null);
        }
        Object objSendEvent = getStateMachine().sendEvent(new Event.NetworkError(c26200c), interfaceC30057d);
        return objSendEvent == EnumC31071a.f128113w ? objSendEvent : C23454a0.f92919a;
    }

    public final Object onNetworkNotAvailable(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.WARN;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[onNetworkNotAvailable] no args", null);
        }
        Object objSendEvent = getStateMachine().sendEvent(Event.NetworkNotAvailable.INSTANCE, interfaceC30057d);
        return objSendEvent == EnumC31071a.f128113w ? objSendEvent : C23454a0.f92919a;
    }

    public final Object onReconnect(SocketFactory.ConnectionConf connectionConf, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        ConnectionType connectionType;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC11478a.m30857i("[onReconnect] user.id: '", connectionConf.getUser().getId(), "', isReconnection: ", connectionConf.getIsReconnection()), null);
        }
        FiniteStateMachine<State, Event> stateMachine = getStateMachine();
        if (z4) {
            connectionType = ConnectionType.FORCE_RECONNECTION;
        } else {
            if (z4) {
                throw new NoWhenBranchMatchedException();
            }
            connectionType = ConnectionType.AUTOMATIC_RECONNECTION;
        }
        Object objSendEvent = stateMachine.sendEvent(new Event.Connect(connectionConf, connectionType), interfaceC30057d);
        return objSendEvent == EnumC31071a.f128113w ? objSendEvent : C23454a0.f92919a;
    }

    public final Object onRequiredDisconnect(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[onRequiredDisconnect] no args", null);
        }
        Object objSendEvent = getStateMachine().sendEvent(Event.RequiredDisconnection.INSTANCE, interfaceC30057d);
        return objSendEvent == EnumC31071a.f128113w ? objSendEvent : C23454a0.f92919a;
    }

    public final Object onResume(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[onResume] no args", null);
        }
        Object objSendEvent = getStateMachine().sendEvent(Event.Resume.INSTANCE, interfaceC30057d);
        return objSendEvent == EnumC31071a.f128113w ? objSendEvent : C23454a0.f92919a;
    }

    public final Object onStop(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[onStop] no args", null);
        }
        Object objSendEvent = getStateMachine().sendEvent(Event.Stop.INSTANCE, interfaceC30057d);
        return objSendEvent == EnumC31071a.f128113w ? objSendEvent : C23454a0.f92919a;
    }

    public final Object onUnrecoverableError(C26200c c26200c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[onUnrecoverableError] error: " + c26200c, null);
        }
        Object objSendEvent = getStateMachine().sendEvent(new Event.UnrecoverableError(c26200c), interfaceC30057d);
        return objSendEvent == EnumC31071a.f128113w ? objSendEvent : C23454a0.f92919a;
    }

    public final Object onWebSocketEventLost(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.WARN;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[onWebSocketEventLost] no args", null);
        }
        Object objSendEvent = getStateMachine().sendEvent(Event.WebSocketEventLost.INSTANCE, interfaceC30057d);
        return objSendEvent == EnumC31071a.f128113w ? objSendEvent : C23454a0.f92919a;
    }

    public ChatSocketStateService(State initialState) {
        AbstractC22676k.m65750j(initialState, "initialState");
        this.logger = AbstractC1772c1.m5382S(this, "Chat:SocketState");
        this.stateMachine = AbstractC30060g.m92088H(new C0134l(23, initialState, this));
    }

    public /* synthetic */ ChatSocketStateService(State state, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? State.Disconnected.Stopped.INSTANCE : state);
    }
}
