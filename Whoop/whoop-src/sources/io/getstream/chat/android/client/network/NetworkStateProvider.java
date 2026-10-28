package io.getstream.chat.android.client.network;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import l83.C23467m;
import l83.InterfaceC23462h;
import m83.C25235a0;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001%\b\u0000\u0018\u00002\u00020\u0001:\u0001-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010$R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, m65681d2 = {"Lio/getstream/chat/android/client/network/NetworkStateProvider;", "", "Lbc3/c0;", "scope", "Landroid/net/ConnectivityManager;", "connectivityManager", "<init>", "(Lbc3/c0;Landroid/net/ConnectivityManager;)V", "Ll83/a0;", "notifyListenersIfNetworkStateChanged", "()V", "", "Lio/getstream/chat/android/client/network/NetworkStateProvider$NetworkStateListener;", "onConnected", "(Ljava/util/Set;)V", "onDisconnected", "", "isConnected", "()Z", "listener", "subscribe", "(Lio/getstream/chat/android/client/network/NetworkStateProvider$NetworkStateListener;)V", "unsubscribe", "Lbc3/c0;", "Landroid/net/ConnectivityManager;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "lock", "Ljava/lang/Object;", "", "Landroid/net/Network;", "availableNetworks", "Ljava/util/Set;", "io/getstream/chat/android/client/network/NetworkStateProvider$callback$1", "callback", "Lio/getstream/chat/android/client/network/NetworkStateProvider$callback$1;", "Z", "listeners", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRegistered", "Ljava/util/concurrent/atomic/AtomicBoolean;", "NetworkStateListener", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NetworkStateProvider {
    private final Set<Network> availableNetworks;
    private final NetworkStateProvider$callback$1 callback;
    private final ConnectivityManager connectivityManager;
    private volatile boolean isConnected;
    private final AtomicBoolean isRegistered;
    private volatile Set<? extends NetworkStateListener> listeners;
    private final Object lock;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final InterfaceC2994c0 scope;

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/network/NetworkStateProvider$NetworkStateListener;", "", "Ll83/a0;", "onConnected", "(Lq83/d;)Ljava/lang/Object;", "onDisconnected", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface NetworkStateListener {
        Object onConnected(InterfaceC30057d<? super C23454a0> interfaceC30057d);

        Object onDisconnected(InterfaceC30057d<? super C23454a0> interfaceC30057d);
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.network.NetworkStateProvider$onConnected$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.network.NetworkStateProvider$onConnected$1", m100430f = "NetworkStateProvider.kt", m100431l = {81}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C193841 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Set<NetworkStateListener> $this_onConnected;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C193841(Set<? extends NetworkStateListener> set, InterfaceC30057d<? super C193841> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$this_onConnected = set;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C193841(this.$this_onConnected, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C193841) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            int i13;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                it = this.$this_onConnected.iterator();
                i13 = 0;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$1;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                NetworkStateListener networkStateListener = (NetworkStateListener) it.next();
                this.L$0 = null;
                this.L$1 = it;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (networkStateListener.onConnected(this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.network.NetworkStateProvider$onDisconnected$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.network.NetworkStateProvider$onDisconnected$1", m100430f = "NetworkStateProvider.kt", m100431l = {87}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C193851 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Set<NetworkStateListener> $this_onDisconnected;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C193851(Set<? extends NetworkStateListener> set, InterfaceC30057d<? super C193851> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$this_onDisconnected = set;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C193851(this.$this_onDisconnected, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C193851) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            int i13;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                it = this.$this_onDisconnected.iterator();
                i13 = 0;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$1;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                NetworkStateListener networkStateListener = (NetworkStateListener) it.next();
                this.L$0 = null;
                this.L$1 = it;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (networkStateListener.onDisconnected(this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [io.getstream.chat.android.client.network.NetworkStateProvider$callback$1] */
    public NetworkStateProvider(InterfaceC2994c0 scope, ConnectivityManager connectivityManager) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(connectivityManager, "connectivityManager");
        this.scope = scope;
        this.connectivityManager = connectivityManager;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:NetworkStateProvider");
        this.lock = new Object();
        this.availableNetworks = new LinkedHashSet();
        this.callback = new ConnectivityManager.NetworkCallback() { // from class: io.getstream.chat.android.client.network.NetworkStateProvider$callback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                AbstractC22676k.m65750j(network, "network");
                this.this$0.availableNetworks.add(network);
                this.this$0.notifyListenersIfNetworkStateChanged();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                AbstractC22676k.m65750j(network, "network");
                AbstractC22676k.m65750j(networkCapabilities, "networkCapabilities");
                this.this$0.notifyListenersIfNetworkStateChanged();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                AbstractC22676k.m65750j(network, "network");
                this.this$0.availableNetworks.remove(network);
                this.this$0.notifyListenersIfNetworkStateChanged();
                if (this.this$0.availableNetworks.isEmpty()) {
                    NetworkStateProvider networkStateProvider = this.this$0;
                    networkStateProvider.onDisconnected(networkStateProvider.listeners);
                }
            }
        };
        this.isConnected = isConnected();
        this.listeners = C25235a0.f99113w;
        this.isRegistered = new AtomicBoolean(false);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyListenersIfNetworkStateChanged() {
        boolean zIsConnected = isConnected();
        if (!this.isConnected && zIsConnected) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
            EnumC2341g enumC2341g = EnumC2341g.INFO;
            if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                logger.m7230a().log(enumC2341g, logger.m7231b(), "Network connected.", null);
            }
            this.isConnected = true;
            onConnected(this.listeners);
            return;
        }
        if (!this.isConnected || zIsConnected) {
            return;
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339eM7232c2 = logger2.m7232c();
        EnumC2341g enumC2341g2 = EnumC2341g.INFO;
        if (interfaceC2339eM7232c2.isLoggable(enumC2341g2, logger2.m7231b())) {
            logger2.m7230a().log(enumC2341g2, logger2.m7231b(), "Network disconnected.", null);
        }
        this.isConnected = false;
        onDisconnected(this.listeners);
    }

    private final void onConnected(Set<? extends NetworkStateListener> set) {
        AbstractC3006f0.m8732z(this.scope, null, null, new C193841(set, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDisconnected(Set<? extends NetworkStateListener> set) {
        AbstractC3006f0.m8732z(this.scope, null, null, new C193851(set, null), 3);
    }

    public final boolean isConnected() {
        Object objM107888l;
        try {
            ConnectivityManager connectivityManager = this.connectivityManager;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                objM107888l = Boolean.valueOf(networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16));
            } else {
                objM107888l = null;
            }
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Boolean bool = (Boolean) (objM107888l instanceof C23467m ? null : objM107888l);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void subscribe(NetworkStateListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        synchronized (this.lock) {
            this.listeners = AbstractC12350b.m34555D(listener, this.listeners);
            if (this.isRegistered.compareAndSet(false, true)) {
                this.connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), this.callback);
            }
        }
    }

    public final void unsubscribe(NetworkStateListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        synchronized (this.lock) {
            try {
                LinkedHashSet linkedHashSetM34604y = AbstractC12350b.m34604y(listener, this.listeners);
                if (linkedHashSetM34604y.isEmpty() && this.isRegistered.compareAndSet(true, false)) {
                    this.connectivityManager.unregisterNetworkCallback(this.callback);
                }
                this.listeners = linkedHashSetM34604y;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
