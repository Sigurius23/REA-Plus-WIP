package com.mapbox.common;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.RunnableC1283d;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import java.util.HashMap;
import java.util.Map;
import l83.C23454a0;
import p009a8.RunnableC0533c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\b\u0006*\u000214\b\u0000\u0018\u0000 72\u00020\u0001:\u000278B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000eJ!\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000f\u0010\fJ#\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\r2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00112\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R6\u0010-\u001a\"\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010+0*j\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010+`,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R6\u0010/\u001a\"\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010+0*j\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010+`,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.R6\u00100\u001a\"\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010+0*j\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010+`,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, m65681d2 = {"Lcom/mapbox/common/LifecycleMonitorAndroid;", "Lcom/mapbox/common/LifecycleMonitorInterface;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/mapbox/common/LifecycleMonitoringState;", "state", "", "error", "Ll83/a0;", "notifyObservers", "(Lcom/mapbox/common/LifecycleMonitoringState;Ljava/lang/String;)V", "Lcom/mapbox/common/LifecycleState;", "(Lcom/mapbox/common/LifecycleState;)V", "notifyPendingCallbacks", "(Lcom/mapbox/common/LifecycleState;Ljava/lang/String;)V", "Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;", "updateMonitorState", "(Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;Ljava/lang/String;)V", "updateLifecycleState", "start", "()V", "stop", "Lcom/mapbox/common/GetLifecycleStateCallback;", "callback", "getLifecycleState", "(Lcom/mapbox/common/GetLifecycleStateCallback;)V", "Lcom/mapbox/common/GetLifecycleMonitoringStateCallback;", "getMonitoringState", "(Lcom/mapbox/common/GetLifecycleMonitoringStateCallback;)V", "Lcom/mapbox/common/LifecycleObserver;", "observer", "registerObserver", "(Lcom/mapbox/common/LifecycleObserver;)V", "unregisterObserver", "Landroid/content/Context;", "Lcom/mapbox/common/LifecycleService;", "lifecycleService", "Lcom/mapbox/common/LifecycleService;", "monitorState", "Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;", "Ljava/util/HashMap;", "Landroid/os/Handler;", "Lkotlin/collections/HashMap;", "observers", "Ljava/util/HashMap;", "pendingLifecycleStateCallbacks", "pendingMonitoringStateCallbacks", "com/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceCallback$1", "lifecycleServiceCallback", "Lcom/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceCallback$1;", "com/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceConnection$1", "lifecycleServiceConnection", "Lcom/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceConnection$1;", "Companion", "MonitorState", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class LifecycleMonitorAndroid implements LifecycleMonitorInterface {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String TAG = "LifecycleMonitor";
    private final Context context;
    private LifecycleService lifecycleService;
    private final LifecycleMonitorAndroid$lifecycleServiceCallback$1 lifecycleServiceCallback;
    private final LifecycleMonitorAndroid$lifecycleServiceConnection$1 lifecycleServiceConnection;
    private MonitorState monitorState;
    private HashMap<LifecycleObserver, Handler> observers;
    private HashMap<GetLifecycleStateCallback, Handler> pendingLifecycleStateCallbacks;
    private HashMap<GetLifecycleMonitoringStateCallback, Handler> pendingMonitoringStateCallbacks;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m65681d2 = {"Lcom/mapbox/common/LifecycleMonitorAndroid$Companion;", "", "()V", "TAG", "", "create", "Lcom/mapbox/common/LifecycleMonitorInterface;", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LifecycleMonitorInterface create() {
            return new LifecycleMonitorAndroid(MapboxSDKCommon.INSTANCE.getContext(), null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;", "", "(Ljava/lang/String;I)V", "STARTING", "STARTED", "STOPPING", "STOPPED", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public enum MonitorState {
        STARTING,
        STARTED,
        STOPPING,
        STOPPED
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MonitorState.values().length];
            try {
                iArr[MonitorState.STOPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MonitorState.STOPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MonitorState.STARTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MonitorState.STARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.LifecycleMonitorAndroid$getLifecycleState$1 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/mapbox/common/LifecycleState;", "state", "Ll83/a0;", "invoke", "(Lcom/mapbox/common/LifecycleState;)V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C53961 extends AbstractC22680m implements Function1 {
        final /* synthetic */ GetLifecycleStateCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53961(GetLifecycleStateCallback getLifecycleStateCallback) {
            super(1);
            this.$callback = getLifecycleStateCallback;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LifecycleState) obj);
            return C23454a0.f92919a;
        }

        public final void invoke(LifecycleState state) {
            AbstractC22676k.m65750j(state, "state");
            this.$callback.run(ExpectedFactory.createValue(state));
        }
    }

    public /* synthetic */ LifecycleMonitorAndroid(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public static final LifecycleMonitorInterface create() {
        return INSTANCE.create();
    }

    private final synchronized void notifyObservers(LifecycleMonitoringState state, String error) {
        try {
            for (Map.Entry<LifecycleObserver, Handler> entry : this.observers.entrySet()) {
                Handler value = entry.getValue();
                if (value != null) {
                    value.post(new RunnableC1283d(entry, state, error, 4));
                } else {
                    entry.getKey().onMonitoringStateChanged(state, error);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyObservers$lambda$4$lambda$2$lambda$1(Map.Entry observer, LifecycleMonitoringState state, String str) {
        AbstractC22676k.m65750j(observer, "$observer");
        AbstractC22676k.m65750j(state, "$state");
        ((LifecycleObserver) observer.getKey()).onMonitoringStateChanged(state, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyObservers$lambda$8$lambda$6$lambda$5(Map.Entry observer, LifecycleState state) {
        AbstractC22676k.m65750j(observer, "$observer");
        AbstractC22676k.m65750j(state, "$state");
        ((LifecycleObserver) observer.getKey()).onLifecycleStateChanged(state);
    }

    private final synchronized void notifyPendingCallbacks(LifecycleMonitoringState state, String error) {
        Expected<String, LifecycleMonitoringState> expectedCreateError;
        if (error != null) {
            try {
                expectedCreateError = ExpectedFactory.createError(error);
            } catch (Throwable th3) {
                throw th3;
            }
        } else {
            expectedCreateError = null;
        }
        if (expectedCreateError == null) {
            expectedCreateError = ExpectedFactory.createValue(state);
            AbstractC22676k.m65749i(expectedCreateError, "run {\n            Expect…ateValue(state)\n        }");
        }
        for (Map.Entry<GetLifecycleMonitoringStateCallback, Handler> entry : this.pendingMonitoringStateCallbacks.entrySet()) {
            Handler value = entry.getValue();
            if (value != null) {
                value.post(new RunnableC5411b(entry, expectedCreateError, 1));
            } else {
                entry.getKey().run(expectedCreateError);
            }
        }
        this.pendingMonitoringStateCallbacks.clear();
    }

    public static /* synthetic */ void notifyPendingCallbacks$default(LifecycleMonitorAndroid lifecycleMonitorAndroid, LifecycleState lifecycleState, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        lifecycleMonitorAndroid.notifyPendingCallbacks(lifecycleState, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyPendingCallbacks$lambda$14$lambda$12$lambda$11(Map.Entry callback, Expected result) {
        AbstractC22676k.m65750j(callback, "$callback");
        AbstractC22676k.m65750j(result, "$result");
        ((GetLifecycleMonitoringStateCallback) callback.getKey()).run(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyPendingCallbacks$lambda$20$lambda$18$lambda$17(Map.Entry callback, Expected result) {
        AbstractC22676k.m65750j(callback, "$callback");
        AbstractC22676k.m65750j(result, "$result");
        ((GetLifecycleStateCallback) callback.getKey()).run(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void updateLifecycleState(LifecycleState state) {
        notifyPendingCallbacks$default(this, state, null, 2, null);
        notifyObservers(state);
    }

    private final synchronized void updateMonitorState(MonitorState state, String error) {
        try {
            this.monitorState = state;
            if (error != null) {
                notifyPendingCallbacks(LifecycleState.UNKNOWN, error);
            }
            int i13 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i13 == 2) {
                LifecycleMonitoringState lifecycleMonitoringState = LifecycleMonitoringState.STOPPED;
                notifyPendingCallbacks(lifecycleMonitoringState, error);
                notifyObservers(lifecycleMonitoringState, error);
            } else if (i13 == 4) {
                LifecycleMonitoringState lifecycleMonitoringState2 = LifecycleMonitoringState.STARTED;
                notifyPendingCallbacks(lifecycleMonitoringState2, error);
                notifyObservers(lifecycleMonitoringState2, error);
                if (this.observers.isEmpty() && this.pendingLifecycleStateCallbacks.isEmpty()) {
                    stop();
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static /* synthetic */ void updateMonitorState$default(LifecycleMonitorAndroid lifecycleMonitorAndroid, MonitorState monitorState, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        lifecycleMonitorAndroid.updateMonitorState(monitorState, str);
    }

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public synchronized void getLifecycleState(GetLifecycleStateCallback callback) {
        LifecycleService lifecycleService;
        try {
            AbstractC22676k.m65750j(callback, "callback");
            int i13 = WhenMappings.$EnumSwitchMapping$0[this.monitorState.ordinal()];
            if (i13 == 1 || i13 == 2 || i13 == 3) {
                HashMap<GetLifecycleStateCallback, Handler> map = this.pendingLifecycleStateCallbacks;
                Looper looperMyLooper = Looper.myLooper();
                map.put(callback, looperMyLooper != null ? new Handler(looperMyLooper) : null);
                if (this.monitorState != MonitorState.STARTING) {
                    start();
                }
            } else if (i13 == 4 && (lifecycleService = this.lifecycleService) != null) {
                lifecycleService.getLifecycleState(Looper.myLooper(), new C53961(callback));
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:12:0x001d, B:15:0x0029, B:16:0x0033, B:18:0x003b, B:20:0x0042), top: B:25:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x003b A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:12:0x001d, B:15:0x0029, B:16:0x0033, B:18:0x003b, B:20:0x0042), top: B:25:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    @Override // com.mapbox.common.LifecycleMonitorInterface
    public synchronized void getMonitoringState(GetLifecycleMonitoringStateCallback callback) {
        Looper looperMyLooper;
        Handler handler;
        try {
            AbstractC22676k.m65750j(callback, "callback");
            int i13 = WhenMappings.$EnumSwitchMapping$0[this.monitorState.ordinal()];
            if (i13 == 1) {
                HashMap<GetLifecycleMonitoringStateCallback, Handler> map = this.pendingMonitoringStateCallbacks;
                looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    handler = new Handler(looperMyLooper);
                } else {
                    handler = null;
                }
                map.put(callback, handler);
            } else if (i13 == 2) {
                callback.run(ExpectedFactory.createValue(LifecycleMonitoringState.STOPPED));
            } else if (i13 == 3) {
                HashMap<GetLifecycleMonitoringStateCallback, Handler> map2 = this.pendingMonitoringStateCallbacks;
                looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    handler = new Handler(looperMyLooper);
                } else {
                    handler = null;
                }
                map2.put(callback, handler);
            } else if (i13 == 4) {
                callback.run(ExpectedFactory.createValue(LifecycleMonitoringState.STARTED));
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public synchronized void registerObserver(LifecycleObserver observer) {
        try {
            AbstractC22676k.m65750j(observer, "observer");
            HashMap<LifecycleObserver, Handler> map = this.observers;
            Looper looperMyLooper = Looper.myLooper();
            map.put(observer, looperMyLooper != null ? new Handler(looperMyLooper) : null);
            if (this.monitorState != MonitorState.STARTED) {
                start();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void start() {
        MonitorState monitorState = this.monitorState;
        MonitorState monitorState2 = MonitorState.STARTING;
        if (monitorState != monitorState2 && monitorState != MonitorState.STARTED) {
            updateMonitorState$default(this, monitorState2, null, 2, null);
            if (this.context.bindService(new Intent(this.context, (Class<?>) LifecycleService.class), this.lifecycleServiceConnection, 1)) {
                return;
            }
            Log.error("Failed to bind lifecycle service", TAG);
            updateMonitorState(MonitorState.STOPPED, "Cannot start service");
        }
    }

    public final synchronized void stop() {
        try {
            MonitorState monitorState = this.monitorState;
            MonitorState monitorState2 = MonitorState.STOPPING;
            if (monitorState != monitorState2 && monitorState != MonitorState.STOPPED) {
                updateMonitorState$default(this, monitorState2, null, 2, null);
                LifecycleService lifecycleService = this.lifecycleService;
                if (lifecycleService != null) {
                    this.context.unbindService(this.lifecycleServiceConnection);
                    lifecycleService.stopSelf();
                }
                this.lifecycleServiceConnection.onServiceDisconnected(null);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public synchronized void unregisterObserver(LifecycleObserver observer) {
        AbstractC22676k.m65750j(observer, "observer");
        this.observers.remove(observer);
        if (this.observers.isEmpty()) {
            stop();
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.mapbox.common.LifecycleMonitorAndroid$lifecycleServiceCallback$1] */
    private LifecycleMonitorAndroid(Context context) {
        this.context = context;
        this.monitorState = MonitorState.STOPPED;
        this.observers = new HashMap<>();
        this.pendingLifecycleStateCallbacks = new HashMap<>();
        this.pendingMonitoringStateCallbacks = new HashMap<>();
        this.lifecycleServiceCallback = new LifecycleService.Callback() { // from class: com.mapbox.common.LifecycleMonitorAndroid$lifecycleServiceCallback$1
            @Override // com.mapbox.common.LifecycleService.Callback
            public void onLifecycleStateChanged(LifecycleState state) {
                AbstractC22676k.m65750j(state, "state");
                this.this$0.updateLifecycleState(state);
            }
        };
        this.lifecycleServiceConnection = new LifecycleMonitorAndroid$lifecycleServiceConnection$1(this);
    }

    private final synchronized void notifyObservers(LifecycleState state) {
        try {
            for (Map.Entry<LifecycleObserver, Handler> entry : this.observers.entrySet()) {
                Handler value = entry.getValue();
                if (value != null) {
                    value.post(new RunnableC0533c(11, entry, state));
                } else {
                    entry.getKey().onLifecycleStateChanged(state);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private final synchronized void notifyPendingCallbacks(LifecycleState state, String error) {
        Expected<String, LifecycleState> expectedCreateError;
        if (error != null) {
            try {
                expectedCreateError = ExpectedFactory.createError(error);
            } catch (Throwable th3) {
                throw th3;
            }
        } else {
            expectedCreateError = null;
        }
        if (expectedCreateError == null) {
            expectedCreateError = ExpectedFactory.createValue(state);
            AbstractC22676k.m65749i(expectedCreateError, "run {\n            Expect…ateValue(state)\n        }");
        }
        for (Map.Entry<GetLifecycleStateCallback, Handler> entry : this.pendingLifecycleStateCallbacks.entrySet()) {
            Handler value = entry.getValue();
            if (value != null) {
                value.post(new RunnableC5411b(entry, expectedCreateError, 0));
            } else {
                entry.getKey().run(expectedCreateError);
            }
        }
        this.pendingLifecycleStateCallbacks.clear();
    }
}
