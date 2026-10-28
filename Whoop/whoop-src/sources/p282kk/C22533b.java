package p282kk;

import bc3.InterfaceC2994c0;
import bd3.C3143v;
import dc3.C11923h;
import dc3.InterfaceC11927l;
import java.util.concurrent.atomic.AtomicInteger;
import l83.C23470p;
import p005a3.C0222l0;
import p014aj.C0929d;
import p173gj.C15902c;
import p173gj.C15903d;
import p173gj.C15906g;
import p223ik.InterfaceC18598b;
import p255jk.C21743a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: kk.b */
/* JADX INFO: loaded from: classes.dex */
public final class C22533b {

    /* JADX INFO: renamed from: a */
    public final C15903d f88558a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f88559b;

    /* JADX INFO: renamed from: c */
    public final C0929d f88560c;

    /* JADX INFO: renamed from: d */
    public final C3143v f88561d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC18598b f88562e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2994c0 f88563f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC11927l f88564g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC11927l f88565h;

    /* JADX INFO: renamed from: i */
    public boolean f88566i;

    /* JADX INFO: renamed from: j */
    public boolean f88567j;

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f88568k;

    /* JADX INFO: renamed from: l */
    public final C23470p f88569l;

    public C22533b(C15903d c15903d) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        C15906g c15906g = c15903d.f60128a;
        C0929d c0929d = new C0929d(c15906g);
        C3143v c3143v = new C3143v(c15906g.f60159h, 8);
        InterfaceC18598b interfaceC18598bM44885f = c15903d.m44885f();
        InterfaceC2994c0 interfaceC2994c0 = c15903d.f60130c;
        C11923h c11923hM92111d = AbstractC30060g.m92111d(Integer.MAX_VALUE, 6, null);
        C11923h c11923hM92111d2 = AbstractC30060g.m92111d(Integer.MAX_VALUE, 6, null);
        this.f88558a = c15903d;
        this.f88559b = atomicInteger;
        this.f88560c = c0929d;
        this.f88561d = c3143v;
        this.f88562e = interfaceC18598bM44885f;
        this.f88563f = interfaceC2994c0;
        this.f88564g = c11923hM92111d;
        this.f88565h = c11923hM92111d2;
        this.f88568k = new AtomicInteger(1);
        this.f88569l = AbstractC30060g.m92088H(new C0222l0(this, 15));
        this.f88566i = false;
        this.f88567j = false;
        try {
            Runtime.getRuntime().addShutdownHook(new C15902c(this, 1));
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m65128a(C21743a event) {
        AbstractC22676k.m65750j(event, "event");
        event.f83623L++;
        this.f88564g.mo32218s(new C22537f(1, event));
    }
}
