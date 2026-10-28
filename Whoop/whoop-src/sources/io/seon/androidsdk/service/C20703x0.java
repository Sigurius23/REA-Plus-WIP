package io.seon.androidsdk.service;

import android.app.Instrumentation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: io.seon.androidsdk.service.x0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C20703x0 implements InterfaceC20695t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77516a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C20707z0 f77517b;

    public /* synthetic */ C20703x0(C20707z0 c20707z0, int i13) {
        this.f77516a = i13;
        this.f77517b = c20707z0;
    }

    @Override // io.seon.androidsdk.service.InterfaceC20695t0
    /* JADX INFO: renamed from: a */
    public final Object mo56800a() {
        Object objMo56800a;
        Instrumentation instrumentation;
        int i13 = this.f77516a;
        C20707z0 c20707z0 = this.f77517b;
        switch (i13) {
            case 0:
                c20707z0.getClass();
                boolean z4 = true;
                try {
                    try {
                        Class<?> cls = Class.forName("android.app.ActivityThread");
                        Field declaredField = cls.getDeclaredField("sCurrentActivityThread");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(null);
                        Field declaredField2 = cls.getDeclaredField("mInstrumentation");
                        declaredField2.setAccessible(true);
                        instrumentation = (Instrumentation) declaredField2.get(obj);
                        break;
                    } catch (Exception e5) {
                        AbstractC20684o.m56853f("Instr", e5);
                        instrumentation = null;
                    }
                    if (instrumentation == null || !instrumentation.getClass().getSimpleName().contains("JUnit")) {
                        z4 = false;
                    }
                    return Boolean.valueOf(z4);
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                try {
                    C20701w0 c20701w0 = new C20701w0(c20707z0, 27);
                    AtomicInteger atomicInteger = AbstractC20684o.f77414a;
                    try {
                        objMo56800a = c20701w0.mo56800a();
                        break;
                    } catch (Throwable unused2) {
                        objMo56800a = null;
                    }
                    if (!((Boolean) objMo56800a).booleanValue() && !c20707z0.m56895h().booleanValue()) {
                        Iterator it = c20707z0.m56893f().iterator();
                        while (it.hasNext()) {
                            if (((String) it.next()).contains("oasisfeng.island")) {
                            }
                        }
                        return Boolean.FALSE;
                    }
                    return Boolean.TRUE;
                } catch (Exception unused3) {
                    return null;
                }
            case 2:
                return (ArrayList) c20707z0.m56898l().f77276g.f98484x;
            case 3:
                return c20707z0.m56898l().f77281l;
            default:
                return (ArrayList) c20707z0.m56898l().f77276g.f98479E;
        }
    }
}
