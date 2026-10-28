package com.mapbox.common.movement;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.location.ActivityRecognition;
import com.google.android.gms.tasks.Task;
import com.mapbox.common.location.FailedTask;
import com.mapbox.common.location.IncompatibleGooglePlayServicesActivityRecognitionVersion;
import java.lang.reflect.Method;
import l83.InterfaceC23462h;
import p503tp.C34030d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ltp/d;", "activityTransitionRequest", "Landroid/app/PendingIntent;", "pendingIntent", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", "requestActivityTransitionUpdates", "(Ltp/d;Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;", "", "detectionIntervalMillis", "callbackIntent", "requestActivityUpdates", "(JLandroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;", "removeActivityTransitionUpdates", "(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;", "removeActivityUpdates", "googleActivityRecognitionClient", "Ljava/lang/Object;", "Companion", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class ProxyGoogleActivityRecognitionClient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h available$delegate = AbstractC30060g.m92088H(ProxyGoogleActivityRecognitionClient$Companion$available$2.INSTANCE);
    private static Method removeActivityTransitionUpdates;
    private static Method removeActivityUpdates;
    private static Method requestActivityTransitionUpdates;
    private static Method requestActivityUpdates;
    private final Object googleActivityRecognitionClient;

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003R\u001b\u0010\f\u001a\u00020\u00078@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, m65681d2 = {"Lcom/mapbox/common/movement/ProxyGoogleActivityRecognitionClient$Companion;", "", "<init>", "()V", "Ll83/a0;", "verifyAndCacheMethods$common_release", "verifyAndCacheMethods", "", "available$delegate", "Ll83/h;", "getAvailable$common_release", "()Z", "available", "Ljava/lang/reflect/Method;", "removeActivityTransitionUpdates", "Ljava/lang/reflect/Method;", "removeActivityUpdates", "requestActivityTransitionUpdates", "requestActivityUpdates", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getAvailable$common_release() {
            return ((Boolean) ProxyGoogleActivityRecognitionClient.available$delegate.getValue()).booleanValue();
        }

        public final void verifyAndCacheMethods$common_release() throws IncompatibleGooglePlayServicesActivityRecognitionVersion {
            try {
                Companion companion = ProxyGoogleActivityRecognitionClient.INSTANCE;
                Method method = com.google.android.gms.location.ActivityRecognitionClient.class.getMethod("requestActivityTransitionUpdates", C34030d.class, PendingIntent.class);
                AbstractC22676k.m65749i(method, "getMethod(\n            \"…t::class.java\n          )");
                ProxyGoogleActivityRecognitionClient.requestActivityTransitionUpdates = method;
                Method method2 = com.google.android.gms.location.ActivityRecognitionClient.class.getMethod("requestActivityUpdates", Long.TYPE, PendingIntent.class);
                AbstractC22676k.m65749i(method2, "getMethod(\n            \"…::class.java,\n          )");
                ProxyGoogleActivityRecognitionClient.requestActivityUpdates = method2;
                Method method3 = com.google.android.gms.location.ActivityRecognitionClient.class.getMethod("removeActivityTransitionUpdates", PendingIntent.class);
                AbstractC22676k.m65749i(method3, "getMethod(\n            \"…::class.java,\n          )");
                ProxyGoogleActivityRecognitionClient.removeActivityTransitionUpdates = method3;
                Method method4 = com.google.android.gms.location.ActivityRecognitionClient.class.getMethod("removeActivityUpdates", PendingIntent.class);
                AbstractC22676k.m65749i(method4, "getMethod(\n            \"…t::class.java\n          )");
                ProxyGoogleActivityRecognitionClient.removeActivityUpdates = method4;
            } catch (ClassNotFoundException e5) {
                throw new IncompatibleGooglePlayServicesActivityRecognitionVersion(e5);
            } catch (NoSuchMethodException e13) {
                throw new IncompatibleGooglePlayServicesActivityRecognitionVersion(e13);
            } catch (SecurityException e14) {
                throw new IncompatibleGooglePlayServicesActivityRecognitionVersion(e14);
            }
        }

        private Companion() {
        }
    }

    public ProxyGoogleActivityRecognitionClient(Context context) {
        AbstractC22676k.m65750j(context, "context");
        com.google.android.gms.location.ActivityRecognitionClient client = ActivityRecognition.getClient(context);
        AbstractC22676k.m65749i(client, "getClient(context)");
        this.googleActivityRecognitionClient = client;
    }

    public final Task<Void> removeActivityTransitionUpdates(PendingIntent pendingIntent) {
        AbstractC22676k.m65750j(pendingIntent, "pendingIntent");
        try {
            Method method = removeActivityTransitionUpdates;
            if (method == null) {
                AbstractC22676k.m65757q("removeActivityTransitionUpdates");
                throw null;
            }
            Object objInvoke = method.invoke(this.googleActivityRecognitionClient, pendingIntent);
            AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type com.google.android.gms.tasks.Task<java.lang.Void>");
            return (Task) objInvoke;
        } catch (Exception e5) {
            return new FailedTask(e5);
        }
    }

    public final Task<Void> removeActivityUpdates(PendingIntent pendingIntent) {
        AbstractC22676k.m65750j(pendingIntent, "pendingIntent");
        try {
            Method method = removeActivityUpdates;
            if (method == null) {
                AbstractC22676k.m65757q("removeActivityUpdates");
                throw null;
            }
            Object objInvoke = method.invoke(this.googleActivityRecognitionClient, pendingIntent);
            AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type com.google.android.gms.tasks.Task<java.lang.Void>");
            return (Task) objInvoke;
        } catch (Exception e5) {
            return new FailedTask(e5);
        }
    }

    public final Task<Void> requestActivityTransitionUpdates(C34030d activityTransitionRequest, PendingIntent pendingIntent) {
        AbstractC22676k.m65750j(activityTransitionRequest, "activityTransitionRequest");
        AbstractC22676k.m65750j(pendingIntent, "pendingIntent");
        try {
            Method method = requestActivityTransitionUpdates;
            if (method == null) {
                AbstractC22676k.m65757q("requestActivityTransitionUpdates");
                throw null;
            }
            Object objInvoke = method.invoke(this.googleActivityRecognitionClient, activityTransitionRequest, pendingIntent);
            AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type com.google.android.gms.tasks.Task<java.lang.Void>");
            return (Task) objInvoke;
        } catch (Exception e5) {
            return new FailedTask(e5);
        }
    }

    public final Task<Void> requestActivityUpdates(long detectionIntervalMillis, PendingIntent callbackIntent) {
        AbstractC22676k.m65750j(callbackIntent, "callbackIntent");
        try {
            Method method = requestActivityUpdates;
            if (method == null) {
                AbstractC22676k.m65757q("requestActivityUpdates");
                throw null;
            }
            Object objInvoke = method.invoke(this.googleActivityRecognitionClient, Long.valueOf(detectionIntervalMillis), callbackIntent);
            AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type com.google.android.gms.tasks.Task<java.lang.Void>");
            return (Task) objInvoke;
        } catch (Exception e5) {
            return new FailedTask(e5);
        }
    }
}
