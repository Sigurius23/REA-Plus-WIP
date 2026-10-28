package com.mapbox.common.movement;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.tasks.Task;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.MovementInfo;
import com.mapbox.common.MovementMode;
import com.mapbox.common.MovementModeProvider;
import com.mapbox.common.location.C5432a;
import com.mapbox.common.location.GoogleDeviceLocationProviderKt;
import com.mapbox.common.location.LocationServiceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l83.C23465k;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import p460rg.AbstractC31366a;
import p479s4.AbstractC32122c;
import p503tp.C34026b;
import p503tp.C34028c;
import p503tp.C34030d;
import p503tp.C34032e;
import p503tp.C34034f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006*\u0001+\b\u0001\u0018\u0000 .2\u00020\u0001:\u0002./B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, m65681d2 = {"Lcom/mapbox/common/movement/GoogleActivityRecognition;", "Lcom/mapbox/common/movement/ActivityRecognitionClient;", "Landroid/content/Context;", "context", "Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;", "mode", "<init>", "(Landroid/content/Context;Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;)V", "", "hasActivityRecognitionPermission", "()Z", "", "activityRecognitionPermissionName", "()Ljava/lang/String;", "Ll83/a0;", "start", "()V", "stop", "isPlatformActivityRecognitionAvailable", "Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;", "observer", "addObserver", "(Lcom/mapbox/common/movement/ActivityRecognitionClient$Observer;)V", "removeObserver", "Landroid/content/Context;", "Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "observers", "Ljava/util/concurrent/CopyOnWriteArrayList;", "isSubscribed", "Z", "Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;", "activityClient", "Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;", "Landroid/content/IntentFilter;", "activityUpdatesIntentFilter", "Landroid/content/IntentFilter;", "Landroid/app/PendingIntent;", "activityUpdatesPendingIntent$delegate", "Ll83/h;", "getActivityUpdatesPendingIntent", "()Landroid/app/PendingIntent;", "activityUpdatesPendingIntent", "com/mapbox/common/movement/GoogleActivityRecognition$broadcast$1", "broadcast", "Lcom/mapbox/common/movement/GoogleActivityRecognition$broadcast$1;", "Companion", "Mode", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class GoogleActivityRecognition implements ActivityRecognitionClient {
    private static final long ACTIVITY_DETECTION_INTERVAL_MILLIS = 1000;
    public static final String ACTIVITY_UPDATES_ACTION = "com.mapbox.common.movement.action.ACTIVITY_RECOGNITION_UPDATES";
    private static final int ACTIVITY_UPDATES_CODE = 1000;
    public static final String TAG = "ActivityRecognitionObserver";
    private static final int TRANSITION_API_CONFIDENCE_SCORE = 85;
    private final ProxyGoogleActivityRecognitionClient activityClient;
    private final IntentFilter activityUpdatesIntentFilter;

    /* JADX INFO: renamed from: activityUpdatesPendingIntent$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h activityUpdatesPendingIntent;
    private final GoogleActivityRecognition$broadcast$1 broadcast;
    private final Context context;
    private boolean isSubscribed;
    private final Mode mode;
    private final CopyOnWriteArrayList<ActivityRecognitionClient.Observer> observers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h TRANSITION_API_MONITORING_TYPES$delegate = AbstractC30060g.m92088H(C5453xff25772.INSTANCE);
    public static final String GOOGLE_ACTIVITY_RECOGNITION_CLIENT = "com.google.android.gms.location.ActivityRecognitionClient";
    private static boolean googlePlayActivityRecognitionBundled = LocationServiceUtils.isOnClasspath(GOOGLE_ACTIVITY_RECOGNITION_CLIENT);

    @Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\b\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u00138\u0006X\u0087T¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u0003R!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R(\u0010%\u001a\u00020\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b*\u0010\u0003\u001a\u0004\b'\u0010\u0019\"\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010\u001cR\u0014\u00101\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010\u001cR\u0014\u00102\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010/¨\u00063"}, m65681d2 = {"Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;", "", "<init>", "()V", "Ltp/e;", "Lcom/mapbox/common/MovementModeProvider;", "provider", "Lcom/mapbox/common/MovementInfo;", "toMovementInfo", "(Ltp/e;Lcom/mapbox/common/MovementModeProvider;)Lcom/mapbox/common/MovementInfo;", "Lcom/google/android/gms/location/ActivityRecognitionResult;", "(Lcom/google/android/gms/location/ActivityRecognitionResult;Lcom/mapbox/common/MovementModeProvider;)Lcom/mapbox/common/MovementInfo;", "", "activityType", "Lcom/mapbox/common/MovementMode;", "fromGmsType", "(I)Lcom/mapbox/common/MovementMode;", "T", "Lcom/google/android/gms/tasks/Task;", "", "name", "withLogs", "(Lcom/google/android/gms/tasks/Task;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;", "", "isAvailable$common_release", "()Z", "isAvailable", "ACTIVITY_UPDATES_ACTION", "Ljava/lang/String;", "getACTIVITY_UPDATES_ACTION$annotations", "", "Ltp/b;", "TRANSITION_API_MONITORING_TYPES$delegate", "Ll83/h;", "getTRANSITION_API_MONITORING_TYPES", "()Ljava/util/List;", "TRANSITION_API_MONITORING_TYPES", "googlePlayActivityRecognitionBundled", "Z", "getGooglePlayActivityRecognitionBundled$common_release", "setGooglePlayActivityRecognitionBundled$common_release", "(Z)V", "getGooglePlayActivityRecognitionBundled$common_release$annotations", "", "ACTIVITY_DETECTION_INTERVAL_MILLIS", "J", "ACTIVITY_UPDATES_CODE", "I", "GOOGLE_ACTIVITY_RECOGNITION_CLIENT", "TAG", "TRANSITION_API_CONFIDENCE_SCORE", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final MovementMode fromGmsType(int activityType) {
            if (activityType == 0) {
                return MovementMode.IN_VEHICLE;
            }
            if (activityType == 1) {
                return MovementMode.CYCLING;
            }
            if (activityType == 2) {
                return MovementMode.ON_FOOT;
            }
            if (activityType == 3) {
                return MovementMode.STATIONARY;
            }
            if (activityType == 7) {
                return MovementMode.WALKING;
            }
            if (activityType != 8) {
                return null;
            }
            return MovementMode.RUNNING;
        }

        public static /* synthetic */ void getACTIVITY_UPDATES_ACTION$annotations() {
        }

        /* JADX INFO: renamed from: getGooglePlayActivityRecognitionBundled$common_release$annotations */
        public static /* synthetic */ void m16626xcab4ed7a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<C34026b> getTRANSITION_API_MONITORING_TYPES() {
            return (List) GoogleActivityRecognition.TRANSITION_API_MONITORING_TYPES$delegate.getValue();
        }

        private final MovementInfo toMovementInfo(ActivityRecognitionResult activityRecognitionResult, MovementModeProvider movementModeProvider) {
            ArrayList<C34034f> arrayList;
            if (activityRecognitionResult == null || (arrayList = activityRecognitionResult.f20571w) == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (C34034f c34034f : arrayList) {
                Companion companion = GoogleActivityRecognition.INSTANCE;
                int i13 = c34034f.f142693w;
                if (i13 > 22 || i13 < 0) {
                    i13 = 4;
                }
                MovementMode movementModeFromGmsType = companion.fromGmsType(i13);
                C23465k c23465k = movementModeFromGmsType != null ? new C23465k(movementModeFromGmsType, Integer.valueOf(c34034f.f142694x)) : null;
                if (c23465k != null) {
                    arrayList2.add(c23465k);
                }
            }
            return new MovementInfo(new HashMap(AbstractC25247g0.m74000i0(arrayList2)), movementModeProvider);
        }

        public static /* synthetic */ MovementInfo toMovementInfo$default(Companion companion, C34032e c34032e, MovementModeProvider movementModeProvider, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                movementModeProvider = MovementModeProvider.SYSTEM;
            }
            return companion.toMovementInfo(c34032e, movementModeProvider);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> Task<T> withLogs(Task<T> task, String str) {
            Task<T> taskAddOnFailureListener = task.addOnSuccessListener(new C5432a(new GoogleActivityRecognition$Companion$withLogs$1(str), 5)).addOnFailureListener(new C5454a(str, 0));
            AbstractC22676k.m65749i(taskAddOnFailureListener, "name: String): Task<T> {…lure: $it\")\n            }");
            return taskAddOnFailureListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void withLogs$lambda$6(Function1 tmp0, Object obj) {
            AbstractC22676k.m65750j(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void withLogs$lambda$7(String name, Exception it) {
            AbstractC22676k.m65750j(name, "$name");
            AbstractC22676k.m65750j(it, "it");
            MapboxCommonLogger.INSTANCE.logD$common_release(GoogleActivityRecognition.TAG, name + " failure: " + it);
        }

        public final boolean getGooglePlayActivityRecognitionBundled$common_release() {
            return GoogleActivityRecognition.googlePlayActivityRecognitionBundled;
        }

        public final boolean isAvailable$common_release() {
            return LocationServiceUtils.getGooglePlayServicesBundled() && getGooglePlayActivityRecognitionBundled$common_release() && ProxyGoogleActivityRecognitionClient.INSTANCE.getAvailable$common_release() && GoogleDeviceLocationProviderKt.getGooglePlayServicesHelper().isGooglePlayServicesReady();
        }

        public final void setGooglePlayActivityRecognitionBundled$common_release(boolean z4) {
            GoogleActivityRecognition.googlePlayActivityRecognitionBundled = z4;
        }

        private Companion() {
        }

        public static /* synthetic */ MovementInfo toMovementInfo$default(Companion companion, ActivityRecognitionResult activityRecognitionResult, MovementModeProvider movementModeProvider, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                movementModeProvider = MovementModeProvider.SYSTEM;
            }
            return companion.toMovementInfo(activityRecognitionResult, movementModeProvider);
        }

        private final MovementInfo toMovementInfo(C34032e c34032e, MovementModeProvider movementModeProvider) {
            List<C34028c> list;
            MovementMode movementModeFromGmsType;
            if (c34032e == null || (list = c34032e.f142687w) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (C34028c c34028c : list) {
                C23465k c23465k = (c34028c.f142673x == 0 && (movementModeFromGmsType = GoogleActivityRecognition.INSTANCE.fromGmsType(c34028c.f142672w)) != null) ? new C23465k(movementModeFromGmsType, Integer.valueOf(GoogleActivityRecognition.TRANSITION_API_CONFIDENCE_SCORE)) : null;
                if (c23465k != null) {
                    arrayList.add(c23465k);
                }
            }
            return new MovementInfo(new HashMap(AbstractC25247g0.m74000i0(arrayList)), movementModeProvider);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/mapbox/common/movement/GoogleActivityRecognition$Mode;", "", "(Ljava/lang/String;I)V", "TRANSITION_API", "SAMPLING_API", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public enum Mode {
        TRANSITION_API,
        SAMPLING_API
    }

    @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.TRANSITION_API.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.SAMPLING_API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [com.mapbox.common.movement.GoogleActivityRecognition$broadcast$1] */
    public GoogleActivityRecognition(Context context, Mode mode) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(mode, "mode");
        this.context = context;
        this.mode = mode;
        this.observers = new CopyOnWriteArrayList<>();
        this.activityClient = new ProxyGoogleActivityRecognitionClient(context);
        this.activityUpdatesIntentFilter = new IntentFilter(ACTIVITY_UPDATES_ACTION);
        this.activityUpdatesPendingIntent = AbstractC30060g.m92088H(new GoogleActivityRecognition$activityUpdatesPendingIntent$2(this));
        this.broadcast = new BroadcastReceiver() { // from class: com.mapbox.common.movement.GoogleActivityRecognition$broadcast$1

            @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[GoogleActivityRecognition.Mode.values().length];
                    try {
                        iArr[GoogleActivityRecognition.Mode.TRANSITION_API.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[GoogleActivityRecognition.Mode.SAMPLING_API.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Code duplicated, block: B:23:0x0058  */
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                C34032e c34032e;
                MovementInfo movementInfo$default;
                Bundle extras;
                ActivityRecognitionResult activityRecognitionResult;
                MovementInfo movementInfo$default2;
                ArrayList arrayListM15623b;
                ArrayList arrayListM15623b2;
                AbstractC22676k.m65750j(context2, "context");
                AbstractC22676k.m65750j(intent, "intent");
                int i13 = WhenMappings.$EnumSwitchMapping$0[this.this$0.mode.ordinal()];
                if (i13 == 1) {
                    if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT")) {
                        MapboxCommonLogger.INSTANCE.logD$common_release(GoogleActivityRecognition.TAG, "Activity transition result received");
                        if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT")) {
                            Parcelable.Creator<C34032e> creator = C34032e.CREATOR;
                            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
                            c34032e = (C34032e) (byteArrayExtra == null ? null : AbstractC31366a.m96470j(byteArrayExtra, creator));
                        } else {
                            c34032e = null;
                        }
                        if (c34032e == null || (movementInfo$default = GoogleActivityRecognition.Companion.toMovementInfo$default(GoogleActivityRecognition.INSTANCE, c34032e, (MovementModeProvider) null, 1, (Object) null)) == null) {
                            return;
                        }
                        Iterator it = this.this$0.observers.iterator();
                        while (it.hasNext()) {
                            ((ActivityRecognitionClient.Observer) it.next()).onMovementInfo(movementInfo$default);
                        }
                        return;
                    }
                    return;
                }
                if (i13 != 2) {
                    return;
                }
                if (!intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT") && ((arrayListM15623b2 = ActivityRecognitionResult.m15623b(intent)) == null || arrayListM15623b2.isEmpty())) {
                    return;
                }
                MapboxCommonLogger.INSTANCE.logD$common_release(GoogleActivityRecognition.TAG, "Activity recognition result received");
                if ((!intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT") && ((arrayListM15623b = ActivityRecognitionResult.m15623b(intent)) == null || arrayListM15623b.isEmpty())) || (extras = intent.getExtras()) == null) {
                    activityRecognitionResult = null;
                } else {
                    Object obj = extras.get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
                    if (obj instanceof byte[]) {
                        activityRecognitionResult = (ActivityRecognitionResult) AbstractC31366a.m96470j((byte[]) obj, ActivityRecognitionResult.CREATOR);
                    } else if (obj instanceof ActivityRecognitionResult) {
                        activityRecognitionResult = (ActivityRecognitionResult) obj;
                    } else {
                        activityRecognitionResult = null;
                    }
                }
                if (activityRecognitionResult == null) {
                    ArrayList arrayListM15623b3 = ActivityRecognitionResult.m15623b(intent);
                    activityRecognitionResult = (arrayListM15623b3 == null || arrayListM15623b3.isEmpty()) ? null : (ActivityRecognitionResult) arrayListM15623b3.get(arrayListM15623b3.size() - 1);
                }
                if (activityRecognitionResult == null || (movementInfo$default2 = GoogleActivityRecognition.Companion.toMovementInfo$default(GoogleActivityRecognition.INSTANCE, activityRecognitionResult, (MovementModeProvider) null, 1, (Object) null)) == null) {
                    return;
                }
                Iterator it3 = this.this$0.observers.iterator();
                while (it3.hasNext()) {
                    ((ActivityRecognitionClient.Observer) it3.next()).onMovementInfo(movementInfo$default2);
                }
            }
        };
    }

    private final String activityRecognitionPermissionName() {
        return Build.VERSION.SDK_INT >= 29 ? "android.permission.ACTIVITY_RECOGNITION" : "com.google.android.gms.permission.ACTIVITY_RECOGNITION";
    }

    private final PendingIntent getActivityUpdatesPendingIntent() {
        Object value = this.activityUpdatesPendingIntent.getValue();
        AbstractC22676k.m65749i(value, "<get-activityUpdatesPendingIntent>(...)");
        return (PendingIntent) value;
    }

    private final boolean hasActivityRecognitionPermission() {
        return AbstractC32122c.checkSelfPermission(this.context, activityRecognitionPermissionName()) == 0;
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public void addObserver(ActivityRecognitionClient.Observer observer) {
        AbstractC22676k.m65750j(observer, "observer");
        this.observers.add(observer);
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public boolean isPlatformActivityRecognitionAvailable() {
        return hasActivityRecognitionPermission();
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    public void removeObserver(ActivityRecognitionClient.Observer observer) {
        AbstractC22676k.m65750j(observer, "observer");
        this.observers.remove(observer);
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    @SuppressLint({"MissingPermission"})
    public synchronized void start() {
        try {
            if (!this.isSubscribed && hasActivityRecognitionPermission()) {
                this.isSubscribed = true;
                AbstractC32122c.registerReceiver(this.context, this.broadcast, this.activityUpdatesIntentFilter, 2);
                int i13 = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
                if (i13 == 1) {
                    Companion companion = INSTANCE;
                    companion.withLogs(this.activityClient.requestActivityTransitionUpdates(new C34030d(companion.getTRANSITION_API_MONITORING_TYPES(), null, null, null), getActivityUpdatesPendingIntent()), "requestActivityTransitionUpdates");
                } else if (i13 == 2) {
                    INSTANCE.withLogs(this.activityClient.requestActivityUpdates(1000L, getActivityUpdatesPendingIntent()), "requestActivityUpdates");
                }
                return;
            }
            MapboxCommonLogger.INSTANCE.logD$common_release(TAG, "start() skipped. isSubscribed: " + this.isSubscribed + ", has permission: " + hasActivityRecognitionPermission());
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.mapbox.common.movement.ActivityRecognitionClient
    @SuppressLint({"MissingPermission"})
    public synchronized void stop() {
        try {
            if (this.isSubscribed && hasActivityRecognitionPermission()) {
                this.isSubscribed = false;
                this.context.unregisterReceiver(this.broadcast);
                int i13 = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
                if (i13 == 1) {
                    INSTANCE.withLogs(this.activityClient.removeActivityTransitionUpdates(getActivityUpdatesPendingIntent()), "removeActivityTransitionUpdates");
                } else if (i13 == 2) {
                    INSTANCE.withLogs(this.activityClient.removeActivityUpdates(getActivityUpdatesPendingIntent()), "removeActivityUpdates");
                }
                return;
            }
            MapboxCommonLogger.INSTANCE.logD$common_release(TAG, "stop() skipped. isSubscribed: " + this.isSubscribed + ", has permission: " + hasActivityRecognitionPermission());
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public /* synthetic */ GoogleActivityRecognition(Context context, Mode mode, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? Mode.TRANSITION_API : mode);
    }
}
