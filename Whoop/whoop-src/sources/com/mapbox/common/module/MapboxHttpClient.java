package com.mapbox.common.module;

import android.content.Context;
import android.content.res.Resources;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.GetLifecycleStateCallback;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpRequestErrorType;
import com.mapbox.common.LifecycleMonitorFactory;
import com.mapbox.common.LifecycleMonitorInterface;
import com.mapbox.common.LifecycleMonitoringState;
import com.mapbox.common.LifecycleObserver;
import com.mapbox.common.LifecycleState;
import com.mapbox.common.MapboxSDKCommon;
import com.mapbox.common.NetworkRestriction;
import com.mapbox.common.NetworkStatus;
import com.mapbox.common.OfflineSwitch;
import com.mapbox.common.OfflineSwitchObserver;
import com.mapbox.common.ReachabilityChanged;
import com.mapbox.common.ReachabilityFactory;
import com.mapbox.common.ReachabilityInterface;
import com.mapbox.common.ResultCallback;
import com.mapbox.common.http_backend.Request;
import com.mapbox.common.http_backend.RequestObserver;
import com.mapbox.common.http_backend.Service;
import io.getstream.chat.android.client.api.QueryParams;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p012ab.C0680g0;
import p047c9.C4316g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001UB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001c\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001d\u0010\u0016J\u000f\u0010\u001e\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001e\u0010\u0016J\u000f\u0010\u001f\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b\u0011\u0010)J\u001f\u0010,\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\rH\u0016¢\u0006\u0004\b.\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR$\u0010D\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`C\u0012\u0004\u0012\u00020\b0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010;R\u0014\u0010G\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010;R\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR$\u0010Q\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`C\u0012\u0004\u0012\u00020\b0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010ER\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006V"}, m65681d2 = {"Lcom/mapbox/common/module/MapboxHttpClient;", "Lcom/mapbox/common/http_backend/Service;", "Lcom/mapbox/common/module/HttpClientDetail;", "detail", "<init>", "(Lcom/mapbox/common/module/HttpClientDetail;)V", "", "id", "Lcom/mapbox/common/module/RequestDetail;", "removeCall", "(J)Lcom/mapbox/common/module/RequestDetail;", "", QueryParams.URL, "", "allowAlways", "(Ljava/lang/String;)Z", "Lcom/mapbox/common/http_backend/Request;", "request", "needToPauseRequest", "(Lcom/mapbox/common/http_backend/Request;)Z", "Ll83/a0;", "processForegroundQueue", "()V", "canSendForegroundRequest", "()Z", "Lcom/mapbox/common/HttpRequestError;", "checkRequestRestrictions", "(Lcom/mapbox/common/http_backend/Request;)Lcom/mapbox/common/HttpRequestError;", "disableBackgroundRequests", "enableBackgroundRequests", "enablePauseRequestsOnDemand", "disablePauseRequestsOnDemand", "", "getForegroundQueueSize", "()I", "", "max", "setMaxRequestsPerHost", "(B)V", "Lcom/mapbox/common/http_backend/RequestObserver;", "observer", "(Lcom/mapbox/common/http_backend/Request;Lcom/mapbox/common/http_backend/RequestObserver;)J", "Lcom/mapbox/common/ResultCallback;", "callback", "cancelRequest", "(JLcom/mapbox/common/ResultCallback;)V", "supportsKeepCompression", "Lcom/mapbox/common/module/HttpClientDetail;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/mapbox/common/ReachabilityInterface;", "reachability", "Lcom/mapbox/common/ReachabilityInterface;", "Lcom/mapbox/common/NetworkStatus;", "networkStatus", "Lcom/mapbox/common/NetworkStatus;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "offline", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/mapbox/common/OfflineSwitchObserver;", "offlineObserver", "Lcom/mapbox/common/OfflineSwitchObserver;", "Lcom/mapbox/common/ReachabilityChanged;", "reachabilityChanged", "Lcom/mapbox/common/ReachabilityChanged;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/mapbox/common/module/RequestId;", "foregroundRequests", "Ljava/util/concurrent/ConcurrentHashMap;", "allowBackgroundRequests", "pauseRequestsOnDemand", "Lcom/mapbox/common/LifecycleMonitorInterface;", "lifecycleMonitor", "Lcom/mapbox/common/LifecycleMonitorInterface;", "Lcom/mapbox/common/LifecycleObserver;", "lifecycleObserver", "Lcom/mapbox/common/LifecycleObserver;", "Lcom/mapbox/common/LifecycleState;", "lifecycleState", "Lcom/mapbox/common/LifecycleState;", "pendingCalls", "Lcom/mapbox/common/GetLifecycleStateCallback;", "getLifeCycleStateCallback", "Lcom/mapbox/common/GetLifecycleStateCallback;", "HttpServiceLifecycleObserver", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapboxHttpClient implements Service {
    private final AtomicBoolean allowBackgroundRequests;
    private final Context context;
    private final HttpClientDetail detail;
    private final ConcurrentHashMap<Long, RequestDetail> foregroundRequests;
    private final GetLifecycleStateCallback getLifeCycleStateCallback;
    private LifecycleMonitorInterface lifecycleMonitor;
    private LifecycleObserver lifecycleObserver;
    private LifecycleState lifecycleState;
    private NetworkStatus networkStatus;
    private final AtomicBoolean offline;
    private final OfflineSwitchObserver offlineObserver;
    private final AtomicBoolean pauseRequestsOnDemand;
    private final ConcurrentHashMap<Long, RequestDetail> pendingCalls;
    private final ReachabilityInterface reachability;
    private final ReachabilityChanged reachabilityChanged;

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lcom/mapbox/common/module/MapboxHttpClient$HttpServiceLifecycleObserver;", "Lcom/mapbox/common/LifecycleObserver;", "<init>", "(Lcom/mapbox/common/module/MapboxHttpClient;)V", "Lcom/mapbox/common/LifecycleState;", "state", "Ll83/a0;", "onLifecycleStateChanged", "(Lcom/mapbox/common/LifecycleState;)V", "Lcom/mapbox/common/LifecycleMonitoringState;", "", "error", "onMonitoringStateChanged", "(Lcom/mapbox/common/LifecycleMonitoringState;Ljava/lang/String;)V", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public final class HttpServiceLifecycleObserver implements LifecycleObserver {
        public HttpServiceLifecycleObserver() {
        }

        @Override // com.mapbox.common.LifecycleObserver
        public void onLifecycleStateChanged(LifecycleState state) {
            AbstractC22676k.m65750j(state, "state");
            boolean z4 = MapboxHttpClient.this.lifecycleState == LifecycleState.FOREGROUND || MapboxHttpClient.this.lifecycleState == LifecycleState.MOVING_FOREGROUND;
            MapboxHttpClient.this.lifecycleState = state;
            if (MapboxHttpClient.this.foregroundRequests.isEmpty() || z4 || !MapboxHttpClient.this.canSendForegroundRequest()) {
                return;
            }
            MapboxHttpClient.this.processForegroundQueue();
        }

        @Override // com.mapbox.common.LifecycleObserver
        public void onMonitoringStateChanged(LifecycleMonitoringState state, String error) {
            AbstractC22676k.m65750j(state, "state");
            if (error != null || state == LifecycleMonitoringState.STOPPED) {
                MapboxHttpClient.this.lifecycleState = LifecycleState.UNKNOWN;
            }
        }
    }

    @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkRestriction.values().length];
            try {
                iArr[NetworkRestriction.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkRestriction.DISALLOW_EXPENSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkRestriction.DISALLOW_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MapboxHttpClient(HttpClientDetail detail) {
        AbstractC22676k.m65750j(detail, "detail");
        this.detail = detail;
        Context context = MapboxSDKCommon.INSTANCE.getContext();
        this.context = context;
        ReachabilityInterface reachabilityInterfaceReachability = ReachabilityFactory.reachability("");
        AbstractC22676k.m65749i(reachabilityInterfaceReachability, "reachability(\"\")");
        this.reachability = reachabilityInterfaceReachability;
        NetworkStatus networkStatusCurrentNetworkStatus = reachabilityInterfaceReachability.currentNetworkStatus();
        AbstractC22676k.m65749i(networkStatusCurrentNetworkStatus, "reachability.currentNetworkStatus()");
        this.networkStatus = networkStatusCurrentNetworkStatus;
        this.offline = new AtomicBoolean(false);
        C0680g0 c0680g0 = new C0680g0(this, 16);
        this.offlineObserver = c0680g0;
        ReachabilityChanged reachabilityChanged = new ReachabilityChanged() { // from class: com.mapbox.common.module.a
            @Override // com.mapbox.common.ReachabilityChanged
            public final void run(NetworkStatus networkStatus) {
                MapboxHttpClient.reachabilityChanged$lambda$2(this.f21931a, networkStatus);
            }
        };
        this.reachabilityChanged = reachabilityChanged;
        this.foregroundRequests = new ConcurrentHashMap<>();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.allowBackgroundRequests = atomicBoolean;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        this.pauseRequestsOnDemand = atomicBoolean2;
        this.lifecycleState = LifecycleState.UNKNOWN;
        this.pendingCalls = new ConcurrentHashMap<>();
        OfflineSwitch.getInstance().registerObserver(c0680g0);
        reachabilityInterfaceReachability.addListener(reachabilityChanged);
        String packageName = context.getPackageName();
        Resources resources = context.getResources();
        if (resources != null) {
            int identifier = resources.getIdentifier("com.mapbox.common.http.allow_background_requests", "bool", packageName);
            if (identifier != 0) {
                atomicBoolean.set(resources.getBoolean(identifier));
            }
            int identifier2 = resources.getIdentifier("com.mapbox.common.http.pause_requests_on_demand", "bool", packageName);
            if (identifier2 != 0) {
                atomicBoolean2.set(resources.getBoolean(identifier2));
            }
        }
        if (!atomicBoolean.get() || atomicBoolean2.get()) {
            disableBackgroundRequests();
        }
        this.getLifeCycleStateCallback = new GetLifecycleStateCallback() { // from class: com.mapbox.common.module.b
            @Override // com.mapbox.common.GetLifecycleStateCallback
            public final void run(Expected expected) {
                MapboxHttpClient.getLifeCycleStateCallback$lambda$4(this.f21932a, expected);
            }
        };
    }

    private final boolean allowAlways(String url) {
        Iterator it = MapboxHttpClientKt.ALLOW_FROM_BACKGROUND_LIST.iterator();
        while (it.hasNext()) {
            if (AbstractC39421y.m125930O(url, (String) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canSendForegroundRequest() {
        LifecycleState lifecycleState = this.lifecycleState;
        return lifecycleState == LifecycleState.FOREGROUND || lifecycleState == LifecycleState.MOVING_FOREGROUND || lifecycleState == LifecycleState.UNKNOWN;
    }

    private final HttpRequestError checkRequestRestrictions(Request request) {
        if (this.offline.get()) {
            return new HttpRequestError(HttpRequestErrorType.CONNECTION_ERROR, "Not connected");
        }
        int i13 = WhenMappings.$EnumSwitchMapping$0[request.getNetworkRestriction().ordinal()];
        if (i13 != 2) {
            if (i13 != 3) {
                return null;
            }
            return new HttpRequestError(HttpRequestErrorType.CONNECTION_ERROR, "Not allowed");
        }
        if (this.networkStatus == NetworkStatus.REACHABLE_VIA_WWAN) {
            return new HttpRequestError(HttpRequestErrorType.CONNECTION_ERROR, "No connection satisfies network restriction");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifeCycleStateCallback$lambda$4(MapboxHttpClient this$0, Expected it) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(it, "it");
        Object valueOrElse = it.getValueOrElse(new C4316g(14));
        AbstractC22676k.m65749i(valueOrElse, "it.getValueOrElse { LifecycleState.UNKNOWN }");
        this$0.lifecycleState = (LifecycleState) valueOrElse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleState getLifeCycleStateCallback$lambda$4$lambda$3(String it) {
        AbstractC22676k.m65750j(it, "it");
        return LifecycleState.UNKNOWN;
    }

    private final boolean needToPauseRequest(Request request) {
        if (canSendForegroundRequest()) {
            return false;
        }
        boolean z4 = (request.getFlags() & 2) != 0;
        if (this.pauseRequestsOnDemand.get() && z4) {
            return true;
        }
        if (this.allowBackgroundRequests.get()) {
            return false;
        }
        String url = request.getUrl();
        AbstractC22676k.m65749i(url, "request.url");
        return !allowAlways(url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void offlineObserver$lambda$1(MapboxHttpClient this$0, boolean z4) {
        AbstractC22676k.m65750j(this$0, "this$0");
        this$0.offline.set(!z4);
        if (z4) {
            return;
        }
        Iterator<Map.Entry<Long, RequestDetail>> it = this$0.pendingCalls.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().cancel(new HttpRequestError(HttpRequestErrorType.CONNECTION_ERROR, "Connection lost"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processForegroundQueue() {
        while (!this.foregroundRequests.isEmpty() && canSendForegroundRequest()) {
            Map.Entry<Long, RequestDetail> next = this.foregroundRequests.entrySet().iterator().next();
            AbstractC22676k.m65749i(next, "next()");
            Long key = next.getKey();
            next.getValue().start();
            this.foregroundRequests.remove(key);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reachabilityChanged$lambda$2(MapboxHttpClient this$0, NetworkStatus status) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(status, "status");
        this$0.networkStatus = status;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RequestDetail removeCall(long id4) {
        this.foregroundRequests.remove(Long.valueOf(id4));
        return this.pendingCalls.remove(Long.valueOf(id4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void request$lambda$5(RequestObserver observer, long j7, HttpRequestError httpRequestError) {
        AbstractC22676k.m65750j(observer, "$observer");
        observer.onFailed(j7, httpRequestError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void request$lambda$6(RequestObserver observer, long j7, Exception exception) {
        AbstractC22676k.m65750j(observer, "$observer");
        AbstractC22676k.m65750j(exception, "$exception");
        observer.onFailed(j7, new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, String.valueOf(exception.getMessage())));
    }

    @Override // com.mapbox.common.http_backend.Service
    public void cancelRequest(long id4, ResultCallback callback) {
        AbstractC22676k.m65750j(callback, "callback");
        RequestDetail requestDetailRemoveCall = removeCall(id4);
        if (requestDetailRemoveCall == null) {
            callback.run(false);
        } else {
            RequestDetail.DefaultImpls.cancel$default(requestDetailRemoveCall, null, 1, null);
            callback.run(true);
        }
    }

    public final void disableBackgroundRequests() {
        this.allowBackgroundRequests.set(false);
        if (this.lifecycleMonitor == null || this.lifecycleObserver == null) {
            this.lifecycleMonitor = LifecycleMonitorFactory.getOrCreate();
            this.lifecycleObserver = new HttpServiceLifecycleObserver();
            LifecycleMonitorInterface lifecycleMonitorInterface = this.lifecycleMonitor;
            AbstractC22676k.m65747g(lifecycleMonitorInterface);
            LifecycleObserver lifecycleObserver = this.lifecycleObserver;
            AbstractC22676k.m65747g(lifecycleObserver);
            lifecycleMonitorInterface.registerObserver(lifecycleObserver);
            LifecycleMonitorInterface lifecycleMonitorInterface2 = this.lifecycleMonitor;
            AbstractC22676k.m65747g(lifecycleMonitorInterface2);
            lifecycleMonitorInterface2.getLifecycleState(this.getLifeCycleStateCallback);
        }
    }

    public final void disablePauseRequestsOnDemand() {
        this.pauseRequestsOnDemand.set(false);
    }

    public final void enableBackgroundRequests() {
        this.allowBackgroundRequests.set(true);
    }

    public final void enablePauseRequestsOnDemand() {
        this.pauseRequestsOnDemand.set(true);
        if (this.lifecycleMonitor == null || this.lifecycleObserver == null) {
            this.lifecycleMonitor = LifecycleMonitorFactory.getOrCreate();
            this.lifecycleObserver = new HttpServiceLifecycleObserver();
            LifecycleMonitorInterface lifecycleMonitorInterface = this.lifecycleMonitor;
            AbstractC22676k.m65747g(lifecycleMonitorInterface);
            LifecycleObserver lifecycleObserver = this.lifecycleObserver;
            AbstractC22676k.m65747g(lifecycleObserver);
            lifecycleMonitorInterface.registerObserver(lifecycleObserver);
            LifecycleMonitorInterface lifecycleMonitorInterface2 = this.lifecycleMonitor;
            AbstractC22676k.m65747g(lifecycleMonitorInterface2);
            lifecycleMonitorInterface2.getLifecycleState(this.getLifeCycleStateCallback);
        }
    }

    public final int getForegroundQueueSize() {
        return this.foregroundRequests.size();
    }

    @Override // com.mapbox.common.http_backend.Service
    public long request(Request request, RequestObserver observer) {
        RequestObserver requestObserver;
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(observer, "observer");
        long jNewId = NetworkIdGenerator.INSTANCE.newId();
        HttpRequestError httpRequestErrorCheckRequestRestrictions = checkRequestRestrictions(request);
        if (httpRequestErrorCheckRequestRestrictions != null) {
            this.detail.executor().execute(new RunnableC5445c(observer, jNewId, httpRequestErrorCheckRequestRestrictions, 0));
            return jNewId;
        }
        try {
            requestObserver = observer;
            try {
                RequestDetail requestDetailBuildRequest = this.detail.buildRequest(request, jNewId, requestObserver, new MapboxHttpClient$request$requestWrapper$1(this));
                this.pendingCalls.put(Long.valueOf(jNewId), requestDetailBuildRequest);
                if (!needToPauseRequest(request)) {
                    requestDetailBuildRequest.start();
                    return jNewId;
                }
                this.foregroundRequests.put(Long.valueOf(jNewId), requestDetailBuildRequest);
                return jNewId;
            } catch (Exception e5) {
                e = e5;
                this.detail.executor().execute(new RunnableC5445c(requestObserver, jNewId, e, 1));
                return jNewId;
            }
        } catch (Exception e13) {
            e = e13;
            requestObserver = observer;
        }
    }

    @Override // com.mapbox.common.http_backend.Service
    public void setMaxRequestsPerHost(byte max) {
        this.detail.setMaxRequestsPerHost(max);
    }

    @Override // com.mapbox.common.http_backend.Service
    public boolean supportsKeepCompression() {
        return this.detail.supportsKeepCompression();
    }
}
