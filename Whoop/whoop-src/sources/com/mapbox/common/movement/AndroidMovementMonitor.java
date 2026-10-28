package com.mapbox.common.movement;

import android.os.Handler;
import android.os.Looper;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.common.MapboxSDKCommon;
import com.mapbox.common.MovementInfo;
import com.mapbox.common.MovementInfoCallback;
import com.mapbox.common.MovementModeObserver;
import com.mapbox.common.MovementModeProvider;
import com.mapbox.common.MovementMonitorInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import p009a8.RunnableC0533c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\"\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006 "}, m65681d2 = {"Lcom/mapbox/common/movement/AndroidMovementMonitor;", "Lcom/mapbox/common/MovementMonitorInterface;", "Lcom/mapbox/common/movement/ActivityRecognitionClient;", "activityRecognition", "<init>", "(Lcom/mapbox/common/movement/ActivityRecognitionClient;)V", "Lcom/mapbox/common/MovementInfo;", "info", "Ll83/a0;", "onPlatformMovementInfoAvailable", "(Lcom/mapbox/common/MovementInfo;)V", "movementInfo", "notifyObservers", "Lcom/mapbox/common/MovementInfoCallback;", "callback", "getMovementInfo", "(Lcom/mapbox/common/MovementInfoCallback;)V", "setMovementInfo", "Lcom/mapbox/common/MovementModeObserver;", "observer", "registerObserver", "(Lcom/mapbox/common/MovementModeObserver;)V", "unregisterObserver", "Lcom/mapbox/common/movement/ActivityRecognitionClient;", "", "Landroid/os/Handler;", "observers", "Ljava/util/Map;", "sdkMovementInfo", "Lcom/mapbox/common/MovementInfo;", "systemMovementInfo", "Companion", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class AndroidMovementMonitor implements MovementMonitorInterface {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String NO_MOVEMENT_INFO_ERROR = "Movement is not available";
    private final ActivityRecognitionClient activityRecognition;
    private final Map<MovementModeObserver, Handler> observers;
    private MovementInfo sdkMovementInfo;
    private MovementInfo systemMovementInfo;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m65681d2 = {"Lcom/mapbox/common/movement/AndroidMovementMonitor$Companion;", "", "()V", "NO_MOVEMENT_INFO_ERROR", "", "create", "Lcom/mapbox/common/MovementMonitorInterface;", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final MovementMonitorInterface create() {
            ActivityRecognitionClient googleActivityRecognition;
            if (GoogleActivityRecognition.INSTANCE.isAvailable$common_release()) {
                googleActivityRecognition = new GoogleActivityRecognition(MapboxSDKCommon.INSTANCE.getContext(), null, 2, 0 == true ? 1 : 0);
            } else {
                googleActivityRecognition = StubActivityRecognition.INSTANCE;
            }
            return new AndroidMovementMonitor(googleActivityRecognition);
        }

        private Companion() {
        }
    }

    public AndroidMovementMonitor(ActivityRecognitionClient activityRecognition) {
        AbstractC22676k.m65750j(activityRecognition, "activityRecognition");
        this.activityRecognition = activityRecognition;
        this.observers = new LinkedHashMap();
        activityRecognition.addObserver(new ActivityRecognitionClient.Observer() { // from class: com.mapbox.common.movement.AndroidMovementMonitor.1
            @Override // com.mapbox.common.movement.ActivityRecognitionClient.Observer
            public synchronized void onMovementInfo(MovementInfo info) {
                AbstractC22676k.m65750j(info, "info");
                AndroidMovementMonitor.this.onPlatformMovementInfoAvailable(info);
            }
        });
    }

    public static final MovementMonitorInterface create() {
        return INSTANCE.create();
    }

    private final void notifyObservers(MovementInfo movementInfo) {
        for (Map.Entry<MovementModeObserver, Handler> entry : this.observers.entrySet()) {
            MovementModeObserver key = entry.getKey();
            Handler value = entry.getValue();
            if (value == null || AbstractC22676k.m65745e(value.getLooper(), Looper.myLooper())) {
                key.onMovementModeChanged(movementInfo);
            } else {
                value.post(new RunnableC0533c(13, key, movementInfo));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyObservers$lambda$2$lambda$1(MovementModeObserver observer, MovementInfo movementInfo) {
        AbstractC22676k.m65750j(observer, "$observer");
        AbstractC22676k.m65750j(movementInfo, "$movementInfo");
        observer.onMovementModeChanged(movementInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void onPlatformMovementInfoAvailable(MovementInfo info) {
        this.systemMovementInfo = info;
        notifyObservers(info);
    }

    @Override // com.mapbox.common.MovementMonitorInterface
    public synchronized void getMovementInfo(MovementInfoCallback callback) {
        Expected<String, MovementInfo> expectedCreateError;
        try {
            AbstractC22676k.m65750j(callback, "callback");
            MovementInfo movementInfo = this.systemMovementInfo;
            if (movementInfo == null) {
                movementInfo = this.sdkMovementInfo;
            }
            if (movementInfo != null) {
                expectedCreateError = ExpectedFactory.createValue(movementInfo);
                AbstractC22676k.m65749i(expectedCreateError, "{\n            ExpectedFa…mentInfo>(info)\n        }");
            } else {
                expectedCreateError = ExpectedFactory.createError(NO_MOVEMENT_INFO_ERROR);
                AbstractC22676k.m65749i(expectedCreateError, "{\n            ExpectedFa…ENT_INFO_ERROR)\n        }");
            }
            callback.run(expectedCreateError);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.mapbox.common.MovementMonitorInterface
    public synchronized void registerObserver(MovementModeObserver observer) {
        try {
            AbstractC22676k.m65750j(observer, "observer");
            Map<MovementModeObserver, Handler> map = this.observers;
            Looper looperMyLooper = Looper.myLooper();
            map.put(observer, looperMyLooper != null ? new Handler(looperMyLooper) : null);
            if (this.observers.size() == 1) {
                this.activityRecognition.start();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.mapbox.common.MovementMonitorInterface
    public synchronized void setMovementInfo(MovementInfo movementInfo) {
        AbstractC22676k.m65750j(movementInfo, "movementInfo");
        if (!this.activityRecognition.isPlatformActivityRecognitionAvailable()) {
            this.sdkMovementInfo = new MovementInfo(movementInfo.getMovementMode(), MovementModeProvider.SDK);
            notifyObservers(movementInfo);
        }
    }

    @Override // com.mapbox.common.MovementMonitorInterface
    public synchronized void unregisterObserver(MovementModeObserver observer) {
        AbstractC22676k.m65750j(observer, "observer");
        this.observers.remove(observer);
        if (this.observers.isEmpty()) {
            this.activityRecognition.stop();
        }
    }
}
