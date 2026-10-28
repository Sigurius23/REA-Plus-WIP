package com.mapbox.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import c93.InterfaceC4339a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import l83.C23454a0;
import p644yb.C39376a;
import p644yb.InterfaceC39377b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u0012*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0012B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\f0\u000b¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0011\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m65681d2 = {"Lcom/mapbox/common/BaseMapboxInitializer;", "", "T", "Lyb/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)Ljava/lang/Boolean;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "getInitializerClass", "()Ljava/lang/Class;", "initializerClass", "Companion", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public abstract class BaseMapboxInitializer<T> implements InterfaceC39377b {
    private static final long LOCK_WAIT_TIME_MS = 50;
    private static final String TAG = "MapboxInitializer";
    private static Context appContext;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final HashMap<Class<? extends InterfaceC39377b>, InitializerData> initializersMap = new HashMap<>();
    private static final ReentrantLock globalLock = new ReentrantLock();

    @Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\n\"\b\b\u0001\u0010\u0004*\u00020\u00012\u0014\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0016\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u00052\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u00050\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001aH\u0082\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u0018H\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010\u000b\u001a\u00020\n\"\b\b\u0001\u0010\u0004*\u00020\u00012\u0014\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005H\u0007¢\u0006\u0004\b\u000b\u0010 RT\u0010#\u001a6\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0004\u0012\u00020\r0!j\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0004\u0012\u00020\r`\"8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u0003\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, m65681d2 = {"Lcom/mapbox/common/BaseMapboxInitializer$Companion;", "", "<init>", "()V", "T", "Ljava/lang/Class;", "Lyb/b;", "initializerClass", "", "calledFromCreate", "Ll83/a0;", "init", "(Ljava/lang/Class;Z)V", "Lcom/mapbox/common/InitializerData;", "initializerData", "Lcom/mapbox/common/InitializerState;", "state", "updateState", "(Ljava/lang/Class;Lcom/mapbox/common/InitializerData;Lcom/mapbox/common/InitializerState;)V", "parentInitializerClass", "", "dependencySet", "getAllDependencies", "(Ljava/lang/Class;Ljava/util/Set;)V", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "function", "runCatchingEnhanced", "(Landroid/content/Context;Lcom/mapbox/common/InitializerData;Lc93/a;)V", "getApplicationContextFromActivityThread", "()Landroid/content/Context;", "(Ljava/lang/Class;)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "initializersMap", "Ljava/util/HashMap;", "getInitializersMap", "()Ljava/util/HashMap;", "getInitializersMap$annotations", "", "LOCK_WAIT_TIME_MS", "J", "", "TAG", "Ljava/lang/String;", "appContext", "Landroid/content/Context;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void getAllDependencies(Class<? extends InterfaceC39377b> parentInitializerClass, Set<Class<? extends InterfaceC39377b>> dependencySet) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            InterfaceC39377b interfaceC39377bNewInstance = parentInitializerClass.getDeclaredConstructor(null).newInstance(null);
            AbstractC22676k.m65749i(interfaceC39377bNewInstance, "parentInitializerClass.g…nstructor().newInstance()");
            InterfaceC39377b interfaceC39377b = interfaceC39377bNewInstance;
            if (interfaceC39377b.dependencies().isEmpty()) {
                return;
            }
            List<Class<? extends InterfaceC39377b>> listDependencies = interfaceC39377b.dependencies();
            AbstractC22676k.m65749i(listDependencies, "instance.dependencies()");
            for (Class<? extends InterfaceC39377b> childInitializerClass : listDependencies) {
                AbstractC22676k.m65749i(childInitializerClass, "childInitializerClass");
                dependencySet.add(childInitializerClass);
                BaseMapboxInitializer.INSTANCE.getAllDependencies(childInitializerClass, dependencySet);
            }
        }

        @SuppressLint({"PrivateApi"})
        private final Context getApplicationContextFromActivityThread() {
            if ("robolectric".equals(Build.FINGERPRINT)) {
                return null;
            }
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getMethod("getApplication", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
                AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type android.content.Context");
                return (Context) objInvoke;
            } catch (Throwable th3) {
                try {
                    android.util.Log.w(BaseMapboxInitializer.TAG, "Unable to get application context from ActivityThread", th3);
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }

        public static /* synthetic */ void getInitializersMap$annotations() {
        }

        private final void runCatchingEnhanced(Context context, InitializerData initializerData, InterfaceC4339a function) throws MapboxInitializerException {
            try {
                function.invoke();
            } catch (Throwable th3) {
                throw new MapboxInitializerException(initializerData, context, th3);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void updateState(Class<? extends InterfaceC39377b> initializerClass, InitializerData initializerData, InitializerState state) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            InitializerState initializerState;
            C23454a0 c23454a0;
            LinkedHashSet<Class<? extends InterfaceC39377b>> linkedHashSet = new LinkedHashSet();
            getAllDependencies(initializerClass, linkedHashSet);
            for (Class<? extends InterfaceC39377b> cls : linkedHashSet) {
                Companion companion = BaseMapboxInitializer.INSTANCE;
                InitializerData initializerData2 = companion.getInitializersMap().get(cls);
                if (initializerData2 != null) {
                    if (initializerData2.getState() != InitializerState.SUCCESS) {
                        initializerState = state;
                        companion.getInitializersMap().put(cls, InitializerData.copy$default(initializerData2, 0L, initializerState, 0, 5, null));
                    } else {
                        initializerState = state;
                    }
                    c23454a0 = C23454a0.f92919a;
                } else {
                    initializerState = state;
                    c23454a0 = null;
                }
                if (c23454a0 == null) {
                    companion.getInitializersMap().put(cls, new InitializerData(initializerData.getFirstInitElapsedTimeMs(), initializerState, initializerData.getCurrentInitAttempt()));
                }
                state = initializerState;
            }
            getInitializersMap().put(initializerClass, InitializerData.copy$default(initializerData, 0L, state, 0, 5, null));
        }

        public final HashMap<Class<? extends InterfaceC39377b>, InitializerData> getInitializersMap() {
            return BaseMapboxInitializer.initializersMap;
        }

        public final <T> void init(Class<? extends InterfaceC39377b> initializerClass) {
            AbstractC22676k.m65750j(initializerClass, "initializerClass");
            init(initializerClass, false);
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> void init(Class<? extends InterfaceC39377b> initializerClass, boolean calledFromCreate) {
            InitializerData initializerDataCopy$default;
            if (BaseMapboxInitializerKt.skipFurtherInitialization(initializerClass)) {
                if (calledFromCreate) {
                    try {
                        android.util.Log.i(BaseMapboxInitializer.TAG, "Already initialized " + initializerClass.getSimpleName() + " before successfully");
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            }
            Context applicationContextFromActivityThread = BaseMapboxInitializer.appContext;
            if (applicationContextFromActivityThread == null) {
                try {
                    android.util.Log.w(BaseMapboxInitializer.TAG, "Trying to call static BaseMapboxInitializer.init() before running BaseMapboxInitializer.create()! Please make sure that Mapbox SDK is initialized before any APIs are called.");
                } catch (Throwable unused2) {
                }
                applicationContextFromActivityThread = getApplicationContextFromActivityThread();
                if (applicationContextFromActivityThread == null) {
                    return;
                }
            }
            while (!BaseMapboxInitializer.globalLock.tryLock(50L, TimeUnit.MILLISECONDS)) {
                if (BaseMapboxInitializerKt.skipFurtherInitialization(initializerClass)) {
                    return;
                }
            }
            try {
                InitializerData initializerData = getInitializersMap().get(initializerClass);
                if (!AbstractC22676k.m65745e(Looper.myLooper(), Looper.getMainLooper())) {
                    InitializerData initializerData2 = initializerData;
                    if ((initializerData2 != null ? initializerData2.getState() : null) != InitializerState.IN_PROGRESS) {
                        android.util.Log.w(BaseMapboxInitializer.TAG, "Init for " + initializerClass.getSimpleName() + " is happening from non-main thread!");
                    }
                }
                try {
                    if (initializerData != null) {
                        if (!BaseMapboxInitializerKt.skipFurtherInitialization(initializerClass)) {
                        }
                        BaseMapboxInitializer.globalLock.unlock();
                        return;
                    } else {
                        InitializerData initializerData3 = new InitializerData(0L, null, 0, 7, null);
                        getInitializersMap().put(initializerClass, initializerData3);
                        initializerData = initializerData3;
                    }
                    BaseMapboxInitializer.INSTANCE.updateState(initializerClass, initializerDataCopy$default, InitializerState.IN_PROGRESS);
                    C39376a.m125585c(applicationContextFromActivityThread).m125588d(initializerClass);
                    android.util.Log.i(BaseMapboxInitializer.TAG, "Initialized " + initializerClass.getSimpleName() + " successfully");
                    getInitializersMap().put(initializerClass, InitializerData.copy$default(initializerDataCopy$default, 0L, InitializerState.SUCCESS, 0, 5, null));
                    BaseMapboxInitializer.globalLock.unlock();
                    return;
                } catch (Throwable th3) {
                    throw new MapboxInitializerException(initializerDataCopy$default, applicationContextFromActivityThread, th3);
                }
                initializerDataCopy$default = InitializerData.copy$default(initializerData, 0L, null, initializerData.getCurrentInitAttempt() + 1, 3, null);
                getInitializersMap().put(initializerClass, initializerDataCopy$default);
                android.util.Log.i(BaseMapboxInitializer.TAG, "MapboxInitializer started " + initializerClass.getSimpleName() + " initialization, attempt " + initializerDataCopy$default.getCurrentInitAttempt());
            } catch (Throwable th4) {
                BaseMapboxInitializer.globalLock.unlock();
                throw th4;
            }
        }
    }

    public static final HashMap<Class<? extends InterfaceC39377b>, InitializerData> getInitializersMap() {
        return INSTANCE.getInitializersMap();
    }

    public static final <T> void init(Class<? extends InterfaceC39377b> cls) {
        INSTANCE.init(cls);
    }

    @Override // p644yb.InterfaceC39377b
    public final List<Class<? extends InterfaceC39377b>> dependencies() {
        return new ArrayList();
    }

    public abstract Class<? extends InterfaceC39377b> getInitializerClass();

    @Override // p644yb.InterfaceC39377b
    public final Boolean create(Context context) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        C23454a0 c23454a0;
        AbstractC22676k.m65750j(context, "context");
        android.util.Log.i(TAG, getClass().getSimpleName().concat(" create() is called"));
        appContext = context.getApplicationContext();
        try {
            INSTANCE.init(getInitializerClass(), true);
        } catch (Throwable th3) {
            android.util.Log.w(TAG, "Exception occurred when initializing " + getInitializerClass().getSimpleName() + ": " + th3.getMessage());
            InitializerData initializerData = initializersMap.get(getInitializerClass());
            if (initializerData != null) {
                INSTANCE.updateState(getInitializerClass(), initializerData, InitializerState.FAILURE);
                c23454a0 = C23454a0.f92919a;
            } else {
                c23454a0 = null;
            }
            if (c23454a0 == null) {
                throw th3;
            }
        }
        return Boolean.TRUE;
    }
}
