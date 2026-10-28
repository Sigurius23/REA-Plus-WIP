package be;

import ag.C0853c;
import ag.C0855e;
import ag.EnumC0856f;
import b30.C2570m;
import cf.AbstractC4537l;
import cf.C4528c;
import ge.C15716a;
import gf.C15768i;
import gm.C15990r;
import hm.C17417d;
import io.sentry.android.replay.video.C20245d;
import j93.AbstractC21478l0;
import j93.InterfaceC21461d;
import l83.C23454a0;
import m63.C25126d;
import mg.C25525g;
import mg.InterfaceC25526h;
import p091dg.C12002a;
import p326mf.C25501u;
import p459rf.C31344o;
import p459rf.C31346q;
import p459rf.C31347r;
import p460rg.EnumC31369d;
import p474s.AbstractC32004s;
import p522uf.C34884k;
import p522uf.C34893t;
import p522uf.C34895v;
import p550vd.AbstractC35903f;
import p647yf.AbstractC39497j;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import pf.C29141s;
import pf.InterfaceC29123a;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import ug.C34912a;
import vg.InterfaceC35967n;

/* JADX INFO: renamed from: be.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C3154g implements InterfaceC3160m {

    /* JADX INFO: renamed from: E */
    public final C17417d f12344E;

    /* JADX INFO: renamed from: F */
    public final C3158k f12345F;

    /* JADX INFO: renamed from: G */
    public final C3164q f12346G;

    /* JADX INFO: renamed from: w */
    public final C4528c f12347w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC29123a f12348x;

    /* JADX INFO: renamed from: y */
    public final C25501u f12349y;

    /* JADX INFO: renamed from: z */
    public final boolean f12350z;

    public C3154g(C3150c c3150c) {
        long j7 = c3150c.f12331a;
        C34912a c34912a = c3150c.f12334d;
        InterfaceC35967n interfaceC35967n = c3150c.f12335e;
        this.f12347w = c3150c.f12332b;
        InterfaceC29123a c31344o = c3150c.f12333c;
        this.f12350z = c31344o == null;
        if (c31344o == null) {
            int i13 = C31344o.f128974H;
            C31346q c31346q = new C31346q();
            Duration.Companion companion = Duration.INSTANCE;
            DurationUnit durationUnit = DurationUnit.SECONDS;
            c31346q.f117903c = DurationKt.toDuration(1, durationUnit);
            c31346q.f117901a = DurationKt.toDuration(1, durationUnit);
            c31346q.f117907g = C29141s.f117933w;
            c31344o = new C31344o(new C31347r(c31346q), null);
        }
        this.f12348x = c31344o;
        C25501u c25501u = new C25501u(c31344o);
        this.f12349y = c25501u;
        this.f12344E = new C17417d(AbstractC21478l0.m60451v(new C15716a("imds", "unknown"), null));
        C3158k c3158k = new C3158k(interfaceC35967n);
        this.f12345F = c3158k;
        this.f12346G = new C3164q(c25501u, c3158k, j7, c34912a);
    }

    /* JADX INFO: renamed from: b */
    public final Object m9054b(String str, InterfaceC30057d interfaceC30057d) {
        InterfaceC30063j context = interfaceC30057d.getContext();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        String qualifiedName = c22673i0.getOrCreateKotlinClass(C3154g.class).getQualifiedName();
        if (qualifiedName == null) {
            throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object");
        }
        C15990r c15990rM113984B = AbstractC35903f.m113984B(context, qualifiedName);
        InterfaceC21461d inputType = c22673i0.getOrCreateKotlinClass(C23454a0.class);
        InterfaceC21461d outputType = c22673i0.getOrCreateKotlinClass(String.class);
        AbstractC22676k.m65750j(inputType, "inputType");
        AbstractC22676k.m65750j(outputType, "outputType");
        C2570m c2570m = new C2570m(20);
        InterfaceC25526h.f99937a.getClass();
        c2570m.f9987x = C25525g.f99936b;
        c2570m.f9988y = EnumC31369d.f129030x;
        c2570m.f9989z = C15768i.f59433w;
        c2570m.f9984E = C34893t.f146944n;
        C20245d c20245d = new C20245d(4);
        C12002a c12002a = new C12002a();
        C3153f c3153f = new C3153f(c15990rM113984B);
        c12002a.mo33083c(AbstractC4537l.f18271d, this.f12347w);
        c20245d.f76050f = this.f12345F;
        if (str == null) {
            throw new IllegalArgumentException("operationName is a required HTTP execution attribute");
        }
        c12002a.mo33083c(AbstractC4537l.f18268a, str);
        c12002a.mo33083c(AbstractC4537l.f18269b, "IMDS");
        C25126d c25126d = new C25126d(c20245d, c12002a, C34884k.f146924a, c3153f, new C34895v(inputType, outputType), c2570m);
        c20245d.f76052h = new C3159l(interfaceC30057d.getContext());
        c25126d.m73684i(this.f12344E);
        c25126d.m73684i(this.f12346G);
        C0855e c0855e = (C0855e) c20245d.f76046b;
        EnumC0856f enumC0856f = EnumC0856f.f3061w;
        C3151d c3151d = new C3151d(str, (InterfaceC30057d) null, 0);
        c0855e.getClass();
        c0855e.m2064c(new C0853c(c3151d), enumC0856f);
        return AbstractC32004s.m99554w(c25126d, this.f12349y, C23454a0.f92919a, interfaceC30057d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12350z) {
            AbstractC39497j.m126157b(this.f12348x);
        }
    }

    public C3154g() {
        this(new C3150c());
    }
}
