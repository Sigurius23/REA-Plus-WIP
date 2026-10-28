package io.sentry.android.replay;

import android.os.Build;
import android.util.Log;
import c93.InterfaceC4339a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: io.sentry.android.replay.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C20256z extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public static final C20256z f76077E;

    /* JADX INFO: renamed from: F */
    public static final C20256z f76078F;

    /* JADX INFO: renamed from: x */
    public static final C20256z f76079x;

    /* JADX INFO: renamed from: y */
    public static final C20256z f76080y;

    /* JADX INFO: renamed from: z */
    public static final C20256z f76081z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f76082w;

    static {
        int i13 = 0;
        f76079x = new C20256z(i13, 0);
        f76080y = new C20256z(i13, 1);
        f76081z = new C20256z(i13, 2);
        f76077E = new C20256z(i13, 3);
        f76078F = new C20256z(i13, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20256z(int i13, int i14) {
        super(i13);
        this.f76082w = i14;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, l83.h] */
    @Override // c93.InterfaceC4339a
    public final Object invoke() throws NoSuchFieldException {
        Method method;
        switch (this.f76082w) {
            case 0:
                Class cls = (Class) C20180a0.f75809a.getValue();
                if (cls == null) {
                    return null;
                }
                Field declaredField = cls.getDeclaredField("mViews");
                declaredField.setAccessible(true);
                return declaredField;
            case 1:
                try {
                    return Class.forName("android.view.WindowManagerGlobal");
                } catch (Throwable th3) {
                    Log.w("WindowManagerSpy", th3);
                    return null;
                }
            case 2:
                Class cls2 = (Class) C20180a0.f75809a.getValue();
                if (cls2 == null || (method = cls2.getMethod("getInstance", null)) == null) {
                    return null;
                }
                return method.invoke(null, null);
            case 3:
                try {
                    return Class.forName("com.android.internal.policy.DecorView");
                } catch (Throwable th4) {
                    Log.d("WindowSpy", "Unexpected exception loading DecorView on API " + Build.VERSION.SDK_INT, th4);
                    return null;
                }
            default:
                Class cls3 = (Class) AbstractC20205f0.f75905a.getValue();
                if (cls3 == null) {
                    return null;
                }
                try {
                    Field declaredField2 = cls3.getDeclaredField("mWindow");
                    declaredField2.setAccessible(true);
                    return declaredField2;
                } catch (NoSuchFieldException e5) {
                    Log.d("WindowSpy", "Unexpected exception retrieving " + cls3 + "#mWindow on API " + Build.VERSION.SDK_INT, e5);
                    return null;
                }
        }
    }
}
