package com.mapbox.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.RunnableC1605m;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l83.C23454a0;
import l83.C23468n;
import l83.InterfaceC23457c;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\bJ3\u0010\u0010\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0010\u0010\u0018J3\u0010\u0012\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0012\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lcom/mapbox/common/LifecycleUtils;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/mapbox/common/LifecycleState;", "getAppStatePreLollipop", "(Landroid/content/Context;)Lcom/mapbox/common/LifecycleState;", "getAppStateLollipopAndHigher", "getAppStateQAndHigher", "", "buildVersion", "getAppLifecycleStateFromActivityManager", "(ILandroid/content/Context;)Lcom/mapbox/common/LifecycleState;", "", "hasServiceRunningInForeground", "(Landroid/content/Context;)Z", "getLifecycleState", "Landroid/os/Looper;", "looper", "Lkotlin/Function1;", "Ll83/a0;", "callback", "(Landroid/content/Context;Landroid/os/Looper;Lkotlin/jvm/functions/Function1;)V", "", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/ExecutorService;", "threadPool", "Ljava/util/concurrent/ExecutorService;", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class LifecycleUtils {
    public static final LifecycleUtils INSTANCE = new LifecycleUtils();
    private static final String TAG = "LifecycleUtils";
    private static ExecutorService threadPool;

    static {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
        AbstractC22676k.m65749i(executorServiceNewFixedThreadPool, "newFixedThreadPool(1)");
        threadPool = executorServiceNewFixedThreadPool;
    }

    private LifecycleUtils() {
    }

    private final LifecycleState getAppStateLollipopAndHigher(Context context) {
        Object objM107888l;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return LifecycleState.UNKNOWN;
        }
        LifecycleState lifecycleState = LifecycleState.BACKGROUND;
        Iterator<ActivityManager.AppTask> it = activityManager.getAppTasks().iterator();
        while (it.hasNext()) {
            try {
                if (it.next().getTaskInfo().id != -1) {
                    lifecycleState = LifecycleState.FOREGROUND;
                }
                objM107888l = C23454a0.f92919a;
            } catch (Throwable th3) {
                objM107888l = AbstractC34132o.m107888l(th3);
            }
            Throwable thM68037a = C23468n.m68037a(objM107888l);
            if (thM68037a != null) {
                Log.error(AbstractC2875y.m8301n("Failed to get task properties: ", thM68037a), TAG);
            }
        }
        return lifecycleState;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    private final LifecycleState getAppStatePreLollipop(Context context) {
        Object objM107888l;
        String packageName;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return LifecycleState.UNKNOWN;
        }
        String packageName2 = context.getApplicationContext().getPackageName();
        LifecycleState lifecycleState = LifecycleState.UNKNOWN;
        List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(32);
        for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
            if (runningTaskInfo != null) {
                try {
                    ComponentName componentName = runningTaskInfo.topActivity;
                    if (componentName == null || (packageName = componentName.getPackageName()) == null) {
                        objM107888l = null;
                    } else {
                        if (packageName.equals(packageName2)) {
                            lifecycleState = LifecycleState.FOREGROUND;
                        }
                        objM107888l = C23454a0.f92919a;
                    }
                } catch (Throwable th3) {
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
            } else {
                objM107888l = null;
            }
            Throwable thM68037a = C23468n.m68037a(objM107888l);
            if (thM68037a != null) {
                Log.error(AbstractC2875y.m8301n("Failed to get task properties: ", thM68037a), TAG);
            }
        }
        return (runningTasks.size() >= 32 || lifecycleState != LifecycleState.UNKNOWN) ? lifecycleState : LifecycleState.BACKGROUND;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [com.mapbox.common.LifecycleState] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    private final LifecycleState getAppStateQAndHigher(Context context) {
        Object objM107888l;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return LifecycleState.UNKNOWN;
        }
        ?? it = activityManager.getAppTasks().iterator();
        while (it.hasNext()) {
            ActivityManager.AppTask appTask = (ActivityManager.AppTask) it.next();
            try {
                Log.info("Task: " + appTask.getTaskInfo(), TAG);
                if (appTask.getTaskInfo().isRunning) {
                    it = LifecycleState.FOREGROUND;
                    return it;
                }
                objM107888l = C23454a0.f92919a;
                it = it;
            } catch (Throwable th3) {
                objM107888l = AbstractC34132o.m107888l(th3);
                it = it;
            }
            Throwable thM68037a = C23468n.m68037a(objM107888l);
            if (thM68037a != null) {
                Log.error(AbstractC2875y.m8301n("Failed to get task properties: ", thM68037a), TAG);
            }
        }
        return LifecycleState.BACKGROUND;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$24(Context context, Looper looper, Function1 callback) {
        Object objM107888l;
        AbstractC22676k.m65750j(context, "$context");
        AbstractC22676k.m65750j(callback, "$callback");
        LifecycleUtils lifecycleUtils = INSTANCE;
        try {
            boolean zHasServiceRunningInForeground = lifecycleUtils.hasServiceRunningInForeground(context);
            objM107888l = C23454a0.f92919a;
            if (!zHasServiceRunningInForeground) {
                LifecycleState appLifecycleStateFromActivityManager = lifecycleUtils.getAppLifecycleStateFromActivityManager(context);
                if (looper != null) {
                    objM107888l = Boolean.valueOf(new Handler(looper).post(new RunnableC1605m(3, callback, appLifecycleStateFromActivityManager)));
                } else {
                    callback.invoke(appLifecycleStateFromActivityManager);
                }
            } else if (looper != null) {
                objM107888l = Boolean.valueOf(new Handler(looper).post(new RunnableC5413c(callback, 2)));
            } else {
                callback.invoke(LifecycleState.FOREGROUND);
            }
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            Log.error(AbstractC2875y.m8301n("Failed to get application state: ", thM68037a), TAG);
            if (looper != null) {
                new Handler(looper).post(new RunnableC5413c(callback, 3));
            } else {
                callback.invoke(LifecycleState.UNKNOWN);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$24$lambda$20$lambda$17$lambda$16(Function1 callback) {
        AbstractC22676k.m65750j(callback, "$callback");
        callback.invoke(LifecycleState.FOREGROUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$24$lambda$20$lambda$19$lambda$18(Function1 callback, LifecycleState state) {
        AbstractC22676k.m65750j(callback, "$callback");
        AbstractC22676k.m65750j(state, "$state");
        callback.invoke(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$24$lambda$23$lambda$22$lambda$21(Function1 callback) {
        AbstractC22676k.m65750j(callback, "$callback");
        callback.invoke(LifecycleState.UNKNOWN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hasServiceRunningInForeground$lambda$15(Context context, Looper looper, final Function1 callback) {
        AbstractC22676k.m65750j(context, "$context");
        AbstractC22676k.m65750j(callback, "$callback");
        final boolean zHasServiceRunningInForeground = INSTANCE.hasServiceRunningInForeground(context);
        if (looper != null) {
            new Handler(looper).post(new Runnable() { // from class: com.mapbox.common.e
                @Override // java.lang.Runnable
                public final void run() {
                    LifecycleUtils.hasServiceRunningInForeground$lambda$15$lambda$14$lambda$13(callback, zHasServiceRunningInForeground);
                }
            });
        } else {
            callback.invoke(Boolean.valueOf(zHasServiceRunningInForeground));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hasServiceRunningInForeground$lambda$15$lambda$14$lambda$13(Function1 callback, boolean z4) {
        AbstractC22676k.m65750j(callback, "$callback");
        callback.invoke(Boolean.valueOf(z4));
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public final LifecycleState getAppLifecycleStateFromActivityManager(int buildVersion, Context context) {
        AbstractC22676k.m65750j(context, "context");
        if (Build.VERSION.SDK_INT < 29 || buildVersion < 29) {
            return buildVersion >= 21 ? getAppStateLollipopAndHigher(context) : getAppStatePreLollipop(context);
        }
        return getAppStateQAndHigher(context);
    }

    @InterfaceC23457c
    public final LifecycleState getLifecycleState(Context context) {
        AbstractC22676k.m65750j(context, "context");
        try {
            return hasServiceRunningInForeground(context) ? LifecycleState.FOREGROUND : getAppLifecycleStateFromActivityManager(context);
        } catch (Throwable th3) {
            Throwable thM68037a = C23468n.m68037a(AbstractC34132o.m107888l(th3));
            if (thM68037a != null) {
                Log.error(AbstractC2875y.m8301n("Failed to get application state: ", thM68037a), TAG);
            }
            return LifecycleState.UNKNOWN;
        }
    }

    @InterfaceC23457c
    public final boolean hasServiceRunningInForeground(Context context) {
        List<ActivityManager.RunningServiceInfo> runningServices;
        AbstractC22676k.m65750j(context, "context");
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String packageName = context.getPackageName();
        if (activityManager != null && (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) != null) {
            List<ActivityManager.RunningServiceInfo> list = runningServices;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (ActivityManager.RunningServiceInfo runningServiceInfo : list) {
                if (runningServiceInfo != null && AbstractC22676k.m65745e(runningServiceInfo.service.getPackageName(), packageName) && runningServiceInfo.foreground) {
                    return true;
                }
            }
        }
        return false;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public final LifecycleState getAppLifecycleStateFromActivityManager(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return getAppLifecycleStateFromActivityManager(Build.VERSION.SDK_INT, context);
    }

    public final void hasServiceRunningInForeground(Context context, Looper looper, Function1 callback) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(callback, "callback");
        threadPool.submit(new RunnableC5416d(context, looper, callback, 0));
    }

    public final void getLifecycleState(Context context, Looper looper, Function1 callback) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(callback, "callback");
        threadPool.submit(new RunnableC5416d(context, looper, callback, 1));
    }
}
