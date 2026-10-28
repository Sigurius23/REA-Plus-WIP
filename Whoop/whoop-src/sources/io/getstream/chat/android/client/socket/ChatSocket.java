package io.getstream.chat.android.client.socket;

import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import bc3.AbstractC3028k2;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.LifecycleHandler;
import io.getstream.chat.android.client.StreamLifecycleObserver;
import io.getstream.chat.android.client.clientstate.DisconnectCause;
import io.getstream.chat.android.client.debugger.ChatClientDebugger;
import io.getstream.chat.android.client.errors.ChatErrorCode;
import io.getstream.chat.android.client.errors.ChatErrorDetail;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.events.ConnectedEvent;
import io.getstream.chat.android.client.events.ConnectionErrorEvent;
import io.getstream.chat.android.client.events.HealthEvent;
import io.getstream.chat.android.client.network.NetworkStateProvider;
import io.getstream.chat.android.client.scope.UserScope;
import io.getstream.chat.android.client.token.TokenManager;
import io.getstream.chat.android.client.utils.internal.ServerClockOffset;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import io.getstream.chat.android.models.User;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.InterfaceC23462h;
import n23.AbstractC26202e;
import n23.C26200c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.C30064k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002y|\b\u0010\u0018\u0000 \u0084\u00012\u00020\u0001:\u0002\u0084\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!J\u0017\u0010'\u001a\u00020\u00172\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010*\u001a\u00020\u0017H\u0000¢\u0006\u0004\b(\u0010)J\u001a\u0010/\u001a\u00020\u00192\b\b\u0002\u0010,\u001a\u00020+H\u0080@¢\u0006\u0004\b-\u0010.J$\u00103\u001a\u00020\u0019\"\n\b\u0000\u00101\u0018\u0001*\u0002002\u0006\u0010,\u001a\u00020+H\u0080H¢\u0006\u0004\b2\u0010.J\u000f\u00106\u001a\u00020\u0002H\u0000¢\u0006\u0004\b4\u00105J(\u00108\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b;\u0010<J\u0018\u0010>\u001a\u00020\u00192\u0006\u0010=\u001a\u00020#H\u0082@¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b@\u0010\u001dJ\u000f\u0010A\u001a\u00020\u0019H\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0019H\u0002¢\u0006\u0004\bC\u0010BJ\u0018\u0010F\u001a\u00020\u00192\u0006\u0010E\u001a\u00020DH\u0082@¢\u0006\u0004\bF\u0010GJ\u0018\u0010I\u001a\u00020\u00192\u0006\u0010E\u001a\u00020HH\u0082@¢\u0006\u0004\bI\u0010JJ#\u0010M\u001a\u00020\u00192\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00190KH\u0002¢\u0006\u0004\bM\u0010NJ\u0013\u0010P\u001a\u00020H*\u00020OH\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\u00022\u0006\u0010R\u001a\u00020\u0002H\u0002¢\u0006\u0004\bS\u0010TJ\u001d\u0010X\u001a\u00020\u00022\f\u0010W\u001a\b\u0012\u0004\u0012\u00020V0UH\u0002¢\u0006\u0004\bX\u0010YR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ZR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010ZR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010[R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\\R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010]R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010^R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010_R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010`R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u001b\u0010j\u001a\u00020e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0018\u0010l\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020\u001e0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010t\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010z\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010}\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001c\u0010\u0083\u0001\u001a\u00030\u0080\u0001*\u00020\u007f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001¨\u0006\u0085\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocket;", "", "", "apiKey", "wssUrl", "Lio/getstream/chat/android/client/token/TokenManager;", "tokenManager", "Lio/getstream/chat/android/client/socket/SocketFactory;", "socketFactory", "Lio/getstream/chat/android/client/scope/UserScope;", "userScope", "Lio/getstream/chat/android/client/StreamLifecycleObserver;", "lifecycleObserver", "Lio/getstream/chat/android/client/network/NetworkStateProvider;", "networkStateProvider", "Lio/getstream/chat/android/client/debugger/ChatClientDebugger;", "clientDebugger", "Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;", "serverClockOffset", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/token/TokenManager;Lio/getstream/chat/android/client/socket/SocketFactory;Lio/getstream/chat/android/client/scope/UserScope;Lio/getstream/chat/android/client/StreamLifecycleObserver;Lio/getstream/chat/android/client/network/NetworkStateProvider;Lio/getstream/chat/android/client/debugger/ChatClientDebugger;Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;)V", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "", "isAnonymous", "Ll83/a0;", "connectUser", "(Lio/getstream/chat/android/models/User;ZLq83/d;)Ljava/lang/Object;", "disconnect", "(Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/socket/SocketListener;", "listener", "removeListener", "(Lio/getstream/chat/android/client/socket/SocketListener;)V", "addListener", "Lio/getstream/chat/android/client/events/ChatEvent;", NotificationCompat.CATEGORY_EVENT, "sendEvent$stream_chat_android_client_release", "(Lio/getstream/chat/android/client/events/ChatEvent;)Z", "sendEvent", "isConnected$stream_chat_android_client_release", "()Z", "isConnected", "", "timeoutInMillis", "awaitConnection$stream_chat_android_client_release", "(JLq83/d;)Ljava/lang/Object;", "awaitConnection", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;", "T", "awaitState$stream_chat_android_client_release", "awaitState", "connectionIdOrError$stream_chat_android_client_release", "()Ljava/lang/String;", "connectionIdOrError", "forceReconnection", "reconnectUser", "(Lio/getstream/chat/android/models/User;ZZLq83/d;)Ljava/lang/Object;", "Lbc3/k1;", "observeSocketStateService", "()Lbc3/k1;", "chatEvent", "handleEvent", "(Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;", "startObservers", "disposeObservers", "()V", "disposeNetworkStateObserver", "Ln23/e;", "error", "handleError", "(Ln23/e;Lq83/d;)Ljava/lang/Object;", "Ln23/c;", "onChatNetworkError", "(Ln23/c;Lq83/d;)Ljava/lang/Object;", "Lkotlin/Function1;", NotificationCompat.CATEGORY_CALL, "callListeners", "(Lkotlin/jvm/functions/Function1;)V", "Lio/getstream/chat/android/client/events/ConnectionErrorEvent;", "toNetworkError", "(Lio/getstream/chat/android/client/events/ConnectionErrorEvent;)Ln23/c;", "moreInfo", "moreInfoTemplate", "(Ljava/lang/String;)Ljava/lang/String;", "", "Lio/getstream/chat/android/client/errors/ChatErrorDetail;", "details", "buildDetailsTemplate", "(Ljava/util/List;)Ljava/lang/String;", "Ljava/lang/String;", "Lio/getstream/chat/android/client/token/TokenManager;", "Lio/getstream/chat/android/client/socket/SocketFactory;", "Lio/getstream/chat/android/client/scope/UserScope;", "Lio/getstream/chat/android/client/StreamLifecycleObserver;", "Lio/getstream/chat/android/client/network/NetworkStateProvider;", "Lio/getstream/chat/android/client/debugger/ChatClientDebugger;", "Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;", "Lio/getstream/chat/android/client/socket/StreamWebSocket;", "streamWebSocket", "Lio/getstream/chat/android/client/socket/StreamWebSocket;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;", "connectionConf", "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;", "", "listeners", "Ljava/util/Set;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService;", "chatSocketStateService", "Lio/getstream/chat/android/client/socket/ChatSocketStateService;", "socketStateObserverJob", "Lbc3/k1;", "Lio/getstream/chat/android/client/socket/HealthMonitor;", "healthMonitor", "Lio/getstream/chat/android/client/socket/HealthMonitor;", "io/getstream/chat/android/client/socket/ChatSocket$lifecycleHandler$1", "lifecycleHandler", "Lio/getstream/chat/android/client/socket/ChatSocket$lifecycleHandler$1;", "io/getstream/chat/android/client/socket/ChatSocket$networkStateListener$1", "networkStateListener", "Lio/getstream/chat/android/client/socket/ChatSocket$networkStateListener$1;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected;", "Lio/getstream/chat/android/client/clientstate/DisconnectCause;", "getCause", "(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected;)Lio/getstream/chat/android/client/clientstate/DisconnectCause;", "cause", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class ChatSocket {
    private static final long DEFAULT_CONNECTION_TIMEOUT = 60000;
    private static final String TAG = "Chat:Socket";
    private final String apiKey;
    private final ChatSocketStateService chatSocketStateService;
    private final ChatClientDebugger clientDebugger;
    private SocketFactory.ConnectionConf connectionConf;
    private final HealthMonitor healthMonitor;
    private final ChatSocket$lifecycleHandler$1 lifecycleHandler;
    private final StreamLifecycleObserver lifecycleObserver;
    private final Set<SocketListener> listeners;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final ChatSocket$networkStateListener$1 networkStateListener;
    private final NetworkStateProvider networkStateProvider;
    private final ServerClockOffset serverClockOffset;
    private final SocketFactory socketFactory;
    private InterfaceC3027k1 socketStateObserverJob;
    private StreamWebSocket streamWebSocket;
    private final TokenManager tokenManager;
    private final UserScope userScope;
    private final String wssUrl;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.socket.ChatSocket$disposeObservers$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.socket.ChatSocket$disposeObservers$1", m100430f = "ChatSocket.kt", m100431l = {225}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194311 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C194311(InterfaceC30057d<? super C194311> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChatSocket.this.new C194311(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194311) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                StreamLifecycleObserver streamLifecycleObserver = ChatSocket.this.lifecycleObserver;
                ChatSocket$lifecycleHandler$1 chatSocket$lifecycleHandler$1 = ChatSocket.this.lifecycleHandler;
                this.label = 1;
                if (streamLifecycleObserver.dispose(chatSocket$lifecycleHandler$1, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.socket.ChatSocket$observeSocketStateService$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.socket.ChatSocket$observeSocketStateService$1", m100430f = "ChatSocket.kt", m100431l = {118}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194321 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ C22669g0 $socketListenerJob;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: io.getstream.chat.android.client.socket.ChatSocket$observeSocketStateService$1$1, reason: invalid class name */
        @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.socket.ChatSocket$observeSocketStateService$1$1", m100430f = "ChatSocket.kt", m100431l = {122, 140, 142, 144, 176}, m100432m = "invokeSuspend")
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;", "state", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
        public static final class AnonymousClass1 extends AbstractC32275i implements InterfaceC4351m {
            final /* synthetic */ InterfaceC2994c0 $$this$launch;
            final /* synthetic */ C22669g0 $socketListenerJob;
            int I$0;
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ ChatSocket this$0;

            /* JADX INFO: renamed from: io.getstream.chat.android.client.socket.ChatSocket$observeSocketStateService$1$1$WhenMappings */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ChatSocketStateService.ConnectionType.values().length];
                    try {
                        iArr[ChatSocketStateService.ConnectionType.INITIAL_CONNECTION.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ChatSocketStateService.ConnectionType.AUTOMATIC_RECONNECTION.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ChatSocketStateService.ConnectionType.FORCE_RECONNECTION.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ChatSocket chatSocket, InterfaceC2994c0 interfaceC2994c0, C22669g0 c22669g0, InterfaceC30057d<? super AnonymousClass1> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.this$0 = chatSocket;
                this.$$this$launch = interfaceC2994c0;
                this.$socketListenerJob = c22669g0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C23454a0 invokeSuspend$lambda$4(ChatSocketStateService.State state, SocketListener socketListener) {
                socketListener.onConnected(((ChatSocketStateService.State.Connected) state).getEvent());
                return C23454a0.f92919a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C23454a0 invokeSuspend$lambda$5(SocketListener socketListener) {
                socketListener.onConnecting();
                return C23454a0.f92919a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C23454a0 invokeSuspend$lambda$7(ChatSocket chatSocket, ChatSocketStateService.State state, SocketListener socketListener) {
                socketListener.onDisconnected(chatSocket.getCause((ChatSocketStateService.State.Disconnected) state));
                return C23454a0.f92919a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$$this$launch, this.$socketListenerJob, interfaceC30057d);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(ChatSocketStateService.State state, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((AnonymousClass1) create(state, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
            
                if (r3.onReconnect(r13, false, r12) == r1) goto L88;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x0111, code lost:
            
                if (io.getstream.chat.android.client.socket.ChatSocket.observeSocketStateService$reconnect(r13, r2, r0, r12) == r1) goto L88;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x012e, code lost:
            
                if (io.getstream.chat.android.client.socket.ChatSocket.observeSocketStateService$reconnect(r13, r2, r0, r12) == r1) goto L88;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0142, code lost:
            
                if (io.getstream.chat.android.client.socket.ChatSocket.observeSocketStateService$connectUser(r13, r2, r0, r12) == r1) goto L88;
             */
            /* JADX WARN: Code restructure failed: missing block: B:87:0x0214, code lost:
            
                if (r4.onReconnect(r13, false, r12) == r1) goto L88;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    Method dump skipped, instruction units count: 561
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.socket.ChatSocket.C194321.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194321(C22669g0 c22669g0, InterfaceC30057d<? super C194321> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$socketListenerJob = c22669g0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C194321 c194321 = ChatSocket.this.new C194321(this.$socketListenerJob, interfaceC30057d);
            c194321.L$0 = obj;
            return c194321;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194321) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return C23454a0.f92919a;
            }
            AbstractC34132o.m107864I(obj);
            ChatSocketStateService chatSocketStateService = ChatSocket.this.chatSocketStateService;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ChatSocket.this, interfaceC2994c0, this.$socketListenerJob, null);
            this.L$0 = null;
            this.label = 1;
            chatSocketStateService.observer(anonymousClass1, this);
            return enumC31071a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.socket.ChatSocket$startObservers$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.socket.ChatSocket", m100430f = "ChatSocket.kt", m100431l = {219}, m100432m = "startObservers")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194331 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C194331(InterfaceC30057d<? super C194331> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChatSocket.this.startObservers(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [io.getstream.chat.android.client.socket.ChatSocket$lifecycleHandler$1] */
    /* JADX WARN: Type inference failed for: r9v7, types: [io.getstream.chat.android.client.socket.ChatSocket$networkStateListener$1] */
    public ChatSocket(String apiKey, String wssUrl, TokenManager tokenManager, SocketFactory socketFactory, UserScope userScope, StreamLifecycleObserver lifecycleObserver, NetworkStateProvider networkStateProvider, ChatClientDebugger chatClientDebugger, ServerClockOffset serverClockOffset) {
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(wssUrl, "wssUrl");
        AbstractC22676k.m65750j(tokenManager, "tokenManager");
        AbstractC22676k.m65750j(socketFactory, "socketFactory");
        AbstractC22676k.m65750j(userScope, "userScope");
        AbstractC22676k.m65750j(lifecycleObserver, "lifecycleObserver");
        AbstractC22676k.m65750j(networkStateProvider, "networkStateProvider");
        AbstractC22676k.m65750j(serverClockOffset, "serverClockOffset");
        this.apiKey = apiKey;
        this.wssUrl = wssUrl;
        this.tokenManager = tokenManager;
        this.socketFactory = socketFactory;
        this.userScope = userScope;
        this.lifecycleObserver = lifecycleObserver;
        this.networkStateProvider = networkStateProvider;
        this.clientDebugger = chatClientDebugger;
        this.serverClockOffset = serverClockOffset;
        this.logger = AbstractC1772c1.m5382S(this, TAG);
        this.listeners = new LinkedHashSet();
        this.chatSocketStateService = new ChatSocketStateService(null, 1, 0 == true ? 1 : 0);
        this.healthMonitor = new HealthMonitor(null, null, userScope, new ChatSocket$healthMonitor$1(this, null), new ChatSocket$healthMonitor$2(this, null), 3, null);
        this.lifecycleHandler = new LifecycleHandler() { // from class: io.getstream.chat.android.client.socket.ChatSocket$lifecycleHandler$1
            @Override // io.getstream.chat.android.client.LifecycleHandler
            public final Object resume(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                Object objOnResume = this.this$0.chatSocketStateService.onResume(interfaceC30057d);
                return objOnResume == EnumC31071a.f128113w ? objOnResume : C23454a0.f92919a;
            }

            @Override // io.getstream.chat.android.client.LifecycleHandler
            public final Object stopped(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                Object objOnStop = this.this$0.chatSocketStateService.onStop(interfaceC30057d);
                return objOnStop == EnumC31071a.f128113w ? objOnStop : C23454a0.f92919a;
            }
        };
        this.networkStateListener = new NetworkStateProvider.NetworkStateListener() { // from class: io.getstream.chat.android.client.socket.ChatSocket$networkStateListener$1
            @Override // io.getstream.chat.android.client.network.NetworkStateProvider.NetworkStateListener
            public final Object onConnected(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                Object objOnNetworkAvailable = this.this$0.chatSocketStateService.onNetworkAvailable(interfaceC30057d);
                return objOnNetworkAvailable == EnumC31071a.f128113w ? objOnNetworkAvailable : C23454a0.f92919a;
            }

            @Override // io.getstream.chat.android.client.network.NetworkStateProvider.NetworkStateListener
            public final Object onDisconnected(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                Object objOnNetworkNotAvailable = this.this$0.chatSocketStateService.onNetworkNotAvailable(interfaceC30057d);
                return objOnNetworkNotAvailable == EnumC31071a.f128113w ? objOnNetworkNotAvailable : C23454a0.f92919a;
            }
        };
    }

    public static /* synthetic */ Object awaitConnection$stream_chat_android_client_release$default(ChatSocket chatSocket, long j7, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitConnection");
        }
        if ((i13 & 1) != 0) {
            j7 = 60000;
        }
        return chatSocket.awaitConnection$stream_chat_android_client_release(j7, interfaceC30057d);
    }

    private final String buildDetailsTemplate(List<ChatErrorDetail> details) {
        return !details.isEmpty() ? AbstractC11895b.m31998q("\nError details: ", details) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void callListeners(Function1 call) {
        synchronized (this.listeners) {
            try {
                for (SocketListener socketListener : this.listeners) {
                    AbstractC3006f0.m8732z(this.userScope, socketListener.getDeliverOnMainThread() ? DispatcherProvider.INSTANCE.getMain() : C30064k.f122676w, null, new ChatSocket$callListeners$1$1$1(call, socketListener, null), 2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disposeNetworkStateObserver() {
        this.networkStateProvider.unsubscribe(this.networkStateListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disposeObservers() {
        disposeNetworkStateObserver();
        AbstractC3006f0.m8732z(this.userScope, null, null, new C194311(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DisconnectCause getCause(ChatSocketStateService.State.Disconnected disconnected) {
        if ((disconnected instanceof ChatSocketStateService.State.Disconnected.DisconnectedByRequest) || (disconnected instanceof ChatSocketStateService.State.Disconnected.Stopped)) {
            return DisconnectCause.ConnectionReleased.INSTANCE;
        }
        if (disconnected instanceof ChatSocketStateService.State.Disconnected.NetworkDisconnected) {
            return DisconnectCause.NetworkNotAvailable.INSTANCE;
        }
        if (disconnected instanceof ChatSocketStateService.State.Disconnected.DisconnectedPermanently) {
            return new DisconnectCause.UnrecoverableError(((ChatSocketStateService.State.Disconnected.DisconnectedPermanently) disconnected).getError());
        }
        if (disconnected instanceof ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) {
            return new DisconnectCause.Error(((ChatSocketStateService.State.Disconnected.DisconnectedTemporarily) disconnected).getError());
        }
        if (disconnected instanceof ChatSocketStateService.State.Disconnected.WebSocketEventLost) {
            return DisconnectCause.WebSocketNotAvailable.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleError(AbstractC26202e abstractC26202e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[handleError] error: " + abstractC26202e, null);
        }
        boolean z4 = abstractC26202e instanceof C26200c;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (z4) {
            Object objOnChatNetworkError = onChatNetworkError((C26200c) abstractC26202e, interfaceC30057d);
            return objOnChatNetworkError == EnumC31071a.f128113w ? objOnChatNetworkError : c23454a0;
        }
        callListeners(new C19440a(abstractC26202e, 2));
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 handleError$lambda$7(AbstractC26202e abstractC26202e, SocketListener it) {
        AbstractC22676k.m65750j(it, "it");
        it.onError(abstractC26202e);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleEvent(ChatEvent chatEvent, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        boolean z4 = chatEvent instanceof ConnectedEvent;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (z4) {
            ConnectedEvent connectedEvent = (ConnectedEvent) chatEvent;
            this.serverClockOffset.onConnected$stream_chat_android_client_release(connectedEvent.getCreatedAt());
            Object objOnConnectionEstablished = this.chatSocketStateService.onConnectionEstablished(connectedEvent, interfaceC30057d);
            return objOnConnectionEstablished == EnumC31071a.f128113w ? objOnConnectionEstablished : c23454a0;
        }
        if (!(chatEvent instanceof HealthEvent)) {
            callListeners(new C19440a(chatEvent, 1));
            return c23454a0;
        }
        this.serverClockOffset.onHealthCheck$stream_chat_android_client_release(((HealthEvent) chatEvent).getCreatedAt());
        this.healthMonitor.ack();
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 handleEvent$lambda$5(ChatEvent chatEvent, SocketListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        listener.onEvent(chatEvent);
        return C23454a0.f92919a;
    }

    private final String moreInfoTemplate(String moreInfo) {
        return !AbstractC39414r.m125890i0(moreInfo) ? AbstractC11266d.m30461o("\nMore information available at ", moreInfo) : "";
    }

    private final InterfaceC3027k1 observeSocketStateService() {
        return AbstractC3006f0.m8732z(this.userScope, null, null, new C194321(new C22669g0(), null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object observeSocketStateService$connectUser(ChatSocket chatSocket, C22669g0 c22669g0, SocketFactory.ConnectionConf connectionConf, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws UnsupportedEncodingException {
        C2345k logger = chatSocket.getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[connectUser] connectionConf: " + connectionConf, null);
        }
        AbstractC3006f0.m8732z(chatSocket.userScope, null, null, new ChatSocket$observeSocketStateService$connectUser$3(chatSocket, null), 3);
        chatSocket.connectionConf = connectionConf;
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) c22669g0.f89336w;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        boolean zIsConnected = chatSocket.networkStateProvider.isConnected();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zIsConnected) {
            if (zIsConnected) {
                throw new NoWhenBranchMatchedException();
            }
            Object objOnNetworkNotAvailable = chatSocket.chatSocketStateService.onNetworkNotAvailable(interfaceC30057d);
            return objOnNetworkNotAvailable == EnumC31071a.f128113w ? objOnNetworkNotAvailable : c23454a0;
        }
        chatSocket.serverClockOffset.onConnectionStarted$stream_chat_android_client_release();
        StreamWebSocket streamWebSocketCreateSocket = chatSocket.socketFactory.createSocket(connectionConf);
        c22669g0.f89336w = AbstractC13091v.m36582H(new C13052j1(streamWebSocketCreateSocket.listen(), new ChatSocket$observeSocketStateService$connectUser$4$1(chatSocket, null), 0), chatSocket.userScope);
        chatSocket.streamWebSocket = streamWebSocketCreateSocket;
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object observeSocketStateService$reconnect(ChatSocket chatSocket, C22669g0 c22669g0, SocketFactory.ConnectionConf connectionConf, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws UnsupportedEncodingException {
        C2345k logger = chatSocket.getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[reconnect] connectionConf: " + connectionConf, null);
        }
        connectionConf.asReconnectionConf$stream_chat_android_client_release();
        Object objObserveSocketStateService$connectUser = observeSocketStateService$connectUser(chatSocket, c22669g0, connectionConf, interfaceC30057d);
        return objObserveSocketStateService$connectUser == EnumC31071a.f128113w ? objObserveSocketStateService$connectUser : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onChatNetworkError(C26200c c26200c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        if (ChatErrorCode.INSTANCE.isAuthenticationError(c26200c.m77810d())) {
            this.tokenManager.expireToken();
        }
        int iM77810d = c26200c.m77810d();
        if (iM77810d == ChatErrorCode.UNDEFINED_TOKEN.getCode() || iM77810d == ChatErrorCode.INVALID_TOKEN.getCode() || iM77810d == ChatErrorCode.API_KEY_NOT_FOUND.getCode() || iM77810d == ChatErrorCode.VALIDATION_ERROR.getCode() || iM77810d == ChatErrorCode.DUPLICATE_USERNAME_ERROR.getCode()) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                logger.m7230a().log(enumC2341g, logger.m7231b(), "One unrecoverable error happened. Error: " + c26200c + ". Error code: " + c26200c.m77810d(), null);
            }
            Object objOnUnrecoverableError = this.chatSocketStateService.onUnrecoverableError(c26200c, interfaceC30057d);
            if (objOnUnrecoverableError == EnumC31071a.f128113w) {
                return objOnUnrecoverableError;
            }
        } else {
            Object objOnNetworkError = this.chatSocketStateService.onNetworkError(c26200c, interfaceC30057d);
            if (objOnNetworkError == EnumC31071a.f128113w) {
                return objOnNetworkError;
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object startObservers(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C194331 c194331;
        if (interfaceC30057d instanceof C194331) {
            c194331 = (C194331) interfaceC30057d;
            int i13 = c194331.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c194331.label = i13 - Integer.MIN_VALUE;
            } else {
                c194331 = new C194331(interfaceC30057d);
            }
        } else {
            c194331 = new C194331(interfaceC30057d);
        }
        Object obj = c194331.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c194331.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            StreamLifecycleObserver streamLifecycleObserver = this.lifecycleObserver;
            ChatSocket$lifecycleHandler$1 chatSocket$lifecycleHandler$1 = this.lifecycleHandler;
            c194331.label = 1;
            if (streamLifecycleObserver.observe(chatSocket$lifecycleHandler$1, c194331) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        this.networkStateProvider.subscribe(this.networkStateListener);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C26200c toNetworkError(ConnectionErrorEvent connectionErrorEvent) {
        return new C26200c(AbstractC18489d0.m53370k(connectionErrorEvent.getError().getMessage(), moreInfoTemplate(connectionErrorEvent.getError().getMoreInfo()), buildDetailsTemplate(connectionErrorEvent.getError().getDetails())), connectionErrorEvent.getError().getCode(), connectionErrorEvent.getError().getStatusCode(), 8);
    }

    public final void addListener(SocketListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        synchronized (this.listeners) {
            this.listeners.add(listener);
        }
    }

    public final Object awaitConnection$stream_chat_android_client_release(long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM8748b = AbstractC3028k2.m8748b(j7, new C19429xc620f2cd(this, null), interfaceC30057d);
        return objM8748b == EnumC31071a.f128113w ? objM8748b : C23454a0.f92919a;
    }

    public final <T extends ChatSocketStateService.State> Object awaitState$stream_chat_android_client_release(long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        AbstractC22676k.m65756p();
        throw null;
    }

    public final Object connectUser(User user, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        SocketFactory.ConnectionConf userConnectionConf;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC11478a.m30857i("[connectUser] user.id: ", user.getId(), ", isAnonymous: ", z4), null);
        }
        InterfaceC3027k1 interfaceC3027k1 = this.socketStateObserverJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.socketStateObserverJob = observeSocketStateService();
        ChatSocketStateService chatSocketStateService = this.chatSocketStateService;
        if (z4) {
            userConnectionConf = new SocketFactory.ConnectionConf.AnonymousConnectionConf(this.wssUrl, this.apiKey, user);
        } else {
            if (z4) {
                throw new NoWhenBranchMatchedException();
            }
            userConnectionConf = new SocketFactory.ConnectionConf.UserConnectionConf(this.wssUrl, this.apiKey, user);
        }
        Object objOnConnect = chatSocketStateService.onConnect(userConnectionConf, interfaceC30057d);
        return objOnConnect == EnumC31071a.f128113w ? objOnConnect : C23454a0.f92919a;
    }

    public final String connectionIdOrError$stream_chat_android_client_release() {
        ChatSocketStateService.State currentState = this.chatSocketStateService.getCurrentState();
        if (currentState instanceof ChatSocketStateService.State.Connected) {
            return ((ChatSocketStateService.State.Connected) currentState).getEvent().getConnectionId();
        }
        throw new IllegalStateException("This state doesn't contain connectionId");
    }

    public final Object disconnect(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[disconnect] no args", null);
        }
        this.connectionConf = null;
        Object objOnRequiredDisconnect = this.chatSocketStateService.onRequiredDisconnect(interfaceC30057d);
        return objOnRequiredDisconnect == EnumC31071a.f128113w ? objOnRequiredDisconnect : C23454a0.f92919a;
    }

    public final boolean isConnected$stream_chat_android_client_release() {
        return this.chatSocketStateService.getCurrentState() instanceof ChatSocketStateService.State.Connected;
    }

    public final Object reconnectUser(User user, boolean z4, boolean z13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        SocketFactory.ConnectionConf userConnectionConf;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            InterfaceC2344j interfaceC2344jM7230a = logger.m7230a();
            String strM7231b = logger.m7231b();
            StringBuilder sbM73379l = AbstractC25012a.m73379l("[reconnectUser] user.id: ", user.getId(), ", isAnonymous: ", ", forceReconnection: ", z4);
            sbM73379l.append(z13);
            interfaceC2344jM7230a.log(enumC2341g, strM7231b, sbM73379l.toString(), null);
        }
        ChatSocketStateService chatSocketStateService = this.chatSocketStateService;
        if (z4) {
            userConnectionConf = new SocketFactory.ConnectionConf.AnonymousConnectionConf(this.wssUrl, this.apiKey, user);
        } else {
            if (z4) {
                throw new NoWhenBranchMatchedException();
            }
            userConnectionConf = new SocketFactory.ConnectionConf.UserConnectionConf(this.wssUrl, this.apiKey, user);
        }
        Object objOnReconnect = chatSocketStateService.onReconnect(userConnectionConf, z13, interfaceC30057d);
        return objOnReconnect == EnumC31071a.f128113w ? objOnReconnect : C23454a0.f92919a;
    }

    public final void removeListener(SocketListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        synchronized (this.listeners) {
            this.listeners.remove(listener);
        }
    }

    public final boolean sendEvent$stream_chat_android_client_release(ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
        StreamWebSocket streamWebSocket = this.streamWebSocket;
        if (streamWebSocket != null) {
            return streamWebSocket.send(event);
        }
        return false;
    }

    public /* synthetic */ ChatSocket(String str, String str2, TokenManager tokenManager, SocketFactory socketFactory, UserScope userScope, StreamLifecycleObserver streamLifecycleObserver, NetworkStateProvider networkStateProvider, ChatClientDebugger chatClientDebugger, ServerClockOffset serverClockOffset, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, tokenManager, socketFactory, userScope, streamLifecycleObserver, networkStateProvider, (i13 & 128) != 0 ? null : chatClientDebugger, serverClockOffset);
    }
}
