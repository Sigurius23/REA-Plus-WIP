package com.mapbox.common.battery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.common.BatteryChargingStatusCallback;
import com.mapbox.common.BatteryMonitorInterface;
import com.mapbox.common.BatteryMonitorObserver;
import com.mapbox.common.MapboxSDKCommon;
import java.util.LinkedHashMap;
import java.util.Map;
import p009a8.RunnableC0533c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 (2\u00020\u0001:\u0001(B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR$\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Lcom/mapbox/common/battery/AndroidBatteryMonitor;", "Lcom/mapbox/common/BatteryMonitorInterface;", "Landroid/content/Context;", "context", "", "intentBatteryActionName", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "Ll83/a0;", "onNewIntent", "(Landroid/content/Intent;)V", "Lcom/mapbox/bindgen/Expected;", "", "state", "notifyObservers", "(Lcom/mapbox/bindgen/Expected;)V", "Lcom/mapbox/common/BatteryChargingStatusCallback;", "callback", "getBatteryChargingStatus", "(Lcom/mapbox/common/BatteryChargingStatusCallback;)V", "Lcom/mapbox/common/BatteryMonitorObserver;", "observer", "registerObserver", "(Lcom/mapbox/common/BatteryMonitorObserver;)V", "unregisterObserver", "Landroid/content/Context;", "chargingState", "Lcom/mapbox/bindgen/Expected;", "", "Landroid/os/Handler;", "observers", "Ljava/util/Map;", "Landroid/content/IntentFilter;", "intentFilter", "Landroid/content/IntentFilter;", "Landroid/content/BroadcastReceiver;", "broadcastReceiver", "Landroid/content/BroadcastReceiver;", "Companion", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class AndroidBatteryMonitor implements BatteryMonitorInterface {
    private static final int BATTERY_STATUS_UNPLUGGED = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String NO_BATTERY_INFO_ERROR = "Unknown battery status";
    private final BroadcastReceiver broadcastReceiver;
    private Expected<String, Boolean> chargingState;
    private final Context context;
    private final IntentFilter intentFilter;
    private final Map<BatteryMonitorObserver, Handler> observers;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ3\u0010\r\u001a\u00020\b2\u0010\u0010\u000b\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00062\u0010\u0010\f\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u0011*\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;", "", "<init>", "()V", "Landroid/content/Intent;", "intent", "Lcom/mapbox/bindgen/Expected;", "", "", "getState", "(Landroid/content/Intent;)Lcom/mapbox/bindgen/Expected;", "e1", "e2", "equals", "(Lcom/mapbox/bindgen/Expected;Lcom/mapbox/bindgen/Expected;)Z", "Lcom/mapbox/common/BatteryMonitorObserver;", "state", "Ll83/a0;", "notify", "(Lcom/mapbox/common/BatteryMonitorObserver;Lcom/mapbox/bindgen/Expected;)V", "Lcom/mapbox/common/BatteryMonitorInterface;", "create", "()Lcom/mapbox/common/BatteryMonitorInterface;", "", "BATTERY_STATUS_UNPLUGGED", "I", "NO_BATTERY_INFO_ERROR", "Ljava/lang/String;", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean equals(Expected<?, ?> e5, Expected<?, ?> e13) {
            if (e5 == null || e13 == null) {
                return AbstractC22676k.m65745e(e5, e13);
            }
            if (e5.isValue()) {
                if (e13.isValue()) {
                    return AbstractC22676k.m65745e(e5.getValue(), e13.getValue());
                }
                return false;
            }
            if (e13.isError()) {
                return AbstractC22676k.m65745e(e5.getError(), e13.getError());
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Expected<String, Boolean> getState(Intent intent) {
            if (intent == null || !intent.hasExtra("plugged")) {
                Expected<String, Boolean> expectedCreateError = ExpectedFactory.createError(AndroidBatteryMonitor.NO_BATTERY_INFO_ERROR);
                AbstractC22676k.m65749i(expectedCreateError, "{\n                Expect…INFO_ERROR)\n            }");
                return expectedCreateError;
            }
            Expected<String, Boolean> expectedCreateValue = ExpectedFactory.createValue(Boolean.valueOf(intent.getIntExtra("plugged", -1) != 0));
            AbstractC22676k.m65749i(expectedCreateValue, "{\n                val is…isCharging)\n            }");
            return expectedCreateValue;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void notify(final BatteryMonitorObserver batteryMonitorObserver, Expected<String, Boolean> expected) {
            final int i13 = 0;
            Expected<String, Boolean> expectedOnValue = expected.onValue(new Expected.Action() { // from class: com.mapbox.common.battery.a
                @Override // com.mapbox.bindgen.Expected.Action
                public final void run(Object obj) {
                    switch (i13) {
                        case 0:
                            AndroidBatteryMonitor.Companion.notify$lambda$0(batteryMonitorObserver, ((Boolean) obj).booleanValue());
                            break;
                        default:
                            AndroidBatteryMonitor.Companion.notify$lambda$1(batteryMonitorObserver, (String) obj);
                            break;
                    }
                }
            });
            final int i14 = 1;
            expectedOnValue.onError(new Expected.Action() { // from class: com.mapbox.common.battery.a
                @Override // com.mapbox.bindgen.Expected.Action
                public final void run(Object obj) {
                    switch (i14) {
                        case 0:
                            AndroidBatteryMonitor.Companion.notify$lambda$0(batteryMonitorObserver, ((Boolean) obj).booleanValue());
                            break;
                        default:
                            AndroidBatteryMonitor.Companion.notify$lambda$1(batteryMonitorObserver, (String) obj);
                            break;
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void notify$lambda$0(BatteryMonitorObserver this_notify, boolean z4) {
            AbstractC22676k.m65750j(this_notify, "$this_notify");
            this_notify.onBatteryChargingStatusChanged(z4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void notify$lambda$1(BatteryMonitorObserver this_notify, String it) {
            AbstractC22676k.m65750j(this_notify, "$this_notify");
            AbstractC22676k.m65750j(it, "it");
            this_notify.onBatteryStatusError(it);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final BatteryMonitorInterface create() {
            return new AndroidBatteryMonitor(MapboxSDKCommon.INSTANCE.getContext(), null, 2, 0 == true ? 1 : 0);
        }

        private Companion() {
        }
    }

    public AndroidBatteryMonitor(Context context, String intentBatteryActionName) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(intentBatteryActionName, "intentBatteryActionName");
        this.context = context;
        this.observers = new LinkedHashMap();
        this.intentFilter = new IntentFilter(intentBatteryActionName);
        this.broadcastReceiver = new BroadcastReceiver() { // from class: com.mapbox.common.battery.AndroidBatteryMonitor$broadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                AbstractC22676k.m65750j(context2, "context");
                AbstractC22676k.m65750j(intent, "intent");
                this.this$0.onNewIntent(intent);
            }
        };
    }

    public static final BatteryMonitorInterface create() {
        return INSTANCE.create();
    }

    private final void notifyObservers(Expected<String, Boolean> state) {
        for (Map.Entry<BatteryMonitorObserver, Handler> entry : this.observers.entrySet()) {
            BatteryMonitorObserver key = entry.getKey();
            Handler value = entry.getValue();
            if (value != null) {
                value.post(new RunnableC0533c(12, key, state));
            } else {
                INSTANCE.notify(key, state);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyObservers$lambda$2$lambda$1(BatteryMonitorObserver observer, Expected state) {
        AbstractC22676k.m65750j(observer, "$observer");
        AbstractC22676k.m65750j(state, "$state");
        INSTANCE.notify(observer, state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void onNewIntent(Intent intent) {
        Companion companion = INSTANCE;
        Expected<String, Boolean> state = companion.getState(intent);
        if (!companion.equals(state, this.chargingState)) {
            this.chargingState = state;
            notifyObservers(state);
        }
    }

    @Override // com.mapbox.common.BatteryMonitorInterface
    public synchronized void getBatteryChargingStatus(BatteryChargingStatusCallback callback) {
        AbstractC22676k.m65750j(callback, "callback");
        callback.run(INSTANCE.getState(this.context.registerReceiver(null, this.intentFilter)));
    }

    @Override // com.mapbox.common.BatteryMonitorInterface
    public synchronized void registerObserver(BatteryMonitorObserver observer) {
        try {
            AbstractC22676k.m65750j(observer, "observer");
            Map<BatteryMonitorObserver, Handler> map = this.observers;
            Looper looperMyLooper = Looper.myLooper();
            map.put(observer, looperMyLooper != null ? new Handler(looperMyLooper) : null);
            if (this.observers.size() == 1) {
                this.context.registerReceiver(this.broadcastReceiver, this.intentFilter);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.mapbox.common.BatteryMonitorInterface
    public synchronized void unregisterObserver(BatteryMonitorObserver observer) {
        AbstractC22676k.m65750j(observer, "observer");
        this.observers.remove(observer);
        if (this.observers.isEmpty()) {
            this.context.unregisterReceiver(this.broadcastReceiver);
        }
    }

    public /* synthetic */ AndroidBatteryMonitor(Context context, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? "android.intent.action.BATTERY_CHANGED" : str);
    }
}
