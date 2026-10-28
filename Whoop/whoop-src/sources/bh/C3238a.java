package bh;

import android.content.Context;
import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: renamed from: bh.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3238a {

    /* JADX INFO: renamed from: a */
    public static final C3238a f12700a = new C3238a();

    /* JADX INFO: renamed from: b */
    public static InterfaceC3242e f12701b;

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3242e m9378a(Context context) {
        InterfaceC3242e interfaceC3242e = f12701b;
        if (interfaceC3242e != null) {
            return interfaceC3242e;
        }
        synchronized (f12700a) {
            try {
                InterfaceC3242e interfaceC3242e2 = f12701b;
                if (interfaceC3242e2 != null) {
                    return interfaceC3242e2;
                }
                Object applicationContext = context.getApplicationContext();
                InterfaceC3243f interfaceC3243f = applicationContext instanceof InterfaceC3243f ? (InterfaceC3243f) applicationContext : null;
                InterfaceC3242e interfaceC3242eMo9383a = interfaceC3243f != null ? interfaceC3243f.mo9383a() : AbstractC22674j.m65738x(context);
                f12701b = interfaceC3242eMo9383a;
                return interfaceC3242eMo9383a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
