package a13;

import android.util.Log;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: a13.d */
/* JADX INFO: loaded from: classes11.dex */
public final class C0146d {

    /* JADX INFO: renamed from: a */
    public final C0151i f454a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4339a f455b;

    /* JADX INFO: renamed from: c */
    public final Function1 f456c;

    /* JADX INFO: renamed from: d */
    public boolean f457d;

    public C0146d(C0151i c0151i, InterfaceC4339a interfaceC4339a, Function1 function1) {
        this.f454a = c0151i;
        this.f455b = interfaceC4339a;
        this.f456c = function1;
    }

    /* JADX INFO: renamed from: a */
    public final void m361a() {
        Log.d("Push:Notifications-PM", "[onAppLaunched] no args");
        if (((Boolean) this.f455b.invoke()).booleanValue()) {
            m363c();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m362b(EnumC0147e enumC0147e) {
        this.f456c.invoke(enumC0147e);
    }

    /* JADX INFO: renamed from: c */
    public final void m363c() {
        if (!this.f457d) {
            C0151i c0151i = this.f454a;
            AbstractC3006f0.m8732z((InterfaceC2994c0) c0151i.f473z.getValue(), null, null, new C0150h(c0151i, null, 0), 3);
        }
        this.f457d = true;
    }
}
