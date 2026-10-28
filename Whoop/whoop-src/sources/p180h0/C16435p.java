package p180h0;

import a33.C0351c;
import androidx.lifecycle.C1586g1;
import bc3.AbstractC3006f0;
import c93.InterfaceC4352n;
import e93.AbstractC12889b;
import gm1.C15992b;
import l83.C23454a0;
import m83.C25271y;
import mc3.C25437c;
import p132f0.C13776c1;
import p132f0.EnumC13840z0;
import p268k0.AbstractC22086a;
import p390p1.AbstractC28683x;
import p390p1.C28612f0;
import p390p1.C28617g1;
import p390p1.C28633k1;
import p390p1.C28676v0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: h0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C16435p {

    /* JADX INFO: renamed from: c */
    public final C28633k1 f63151c;

    /* JADX INFO: renamed from: d */
    public final C28633k1 f63152d;

    /* JADX INFO: renamed from: g */
    public final C28617g1 f63155g;

    /* JADX INFO: renamed from: h */
    public final C28633k1 f63156h;

    /* JADX INFO: renamed from: i */
    public final C28633k1 f63157i;

    /* JADX INFO: renamed from: j */
    public final C16430o f63158j;

    /* JADX INFO: renamed from: a */
    public final C15992b f63149a = new C15992b(26);

    /* JADX INFO: renamed from: b */
    public final C13776c1 f63150b = new C13776c1();

    /* JADX INFO: renamed from: e */
    public final C28612f0 f63153e = AbstractC28683x.m87264r(new C16415l(this, 0));

    /* JADX INFO: renamed from: f */
    public final C28617g1 f63154f = new C28617g1(Float.NaN);

    public C16435p(Enum r10) {
        this.f63151c = AbstractC28683x.m87272z(r10);
        this.f63152d = AbstractC28683x.m87272z(r10);
        AbstractC28683x.m87265s(new C16415l(this, 1), C28676v0.f115974F);
        this.f63155g = new C28617g1(0.0f);
        this.f63156h = AbstractC28683x.m87272z(null);
        this.f63157i = AbstractC28683x.m87272z(new C16475x(C25271y.f99162w, new float[0]));
        this.f63158j = new C16430o(this);
    }

    /* JADX INFO: renamed from: b */
    public static Object m46611b(C16435p c16435p, Function3 function3, InterfaceC30057d interfaceC30057d) {
        EnumC13840z0 enumC13840z0 = EnumC13840z0.f49374w;
        C13776c1 c13776c1 = c16435p.f63150b;
        C0351c c0351c = new C0351c(c16435p, function3, (InterfaceC30057d) null);
        c13776c1.getClass();
        Object objM8719m = AbstractC3006f0.m8719m(new C1586g1(enumC13840z0, c13776c1, c0351c, null), interfaceC30057d);
        return objM8719m == EnumC31071a.f128113w ? objM8719m : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m46612a(Object obj, EnumC13840z0 enumC13840z0, InterfaceC4352n interfaceC4352n, InterfaceC30057d interfaceC30057d) {
        C16420m c16420m;
        if (interfaceC30057d instanceof C16420m) {
            c16420m = (C16420m) interfaceC30057d;
            int i13 = c16420m.f63105y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16420m.f63105y = i13 - Integer.MIN_VALUE;
            } else {
                c16420m = new C16420m(this, interfaceC30057d);
            }
        } else {
            c16420m = new C16420m(this, interfaceC30057d);
        }
        Object obj2 = c16420m.f63103w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16420m.f63105y;
        C28633k1 c28633k1 = this.f63156h;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj2);
                if (((C16475x) m46613c()).f63308a.indexOf(obj) != -1) {
                    C13776c1 c13776c1 = this.f63150b;
                    C16425n c16425n = new C16425n(this, obj, interfaceC4352n, (InterfaceC30057d) null);
                    c16420m.f63105y = 1;
                    c13776c1.getClass();
                    if (AbstractC3006f0.m8719m(new C1586g1(enumC13840z0, c13776c1, c16425n, null), c16420m) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    this.f63152d.setValue(obj);
                    m46617g(obj);
                }
                return C23454a0.f92919a;
            }
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj2);
            c28633k1.setValue(null);
            return C23454a0.f92919a;
        } catch (Throwable th3) {
            c28633k1.setValue(null);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC16397h1 m46613c() {
        return (InterfaceC16397h1) this.f63157i.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final float m46614d(float f13) {
        C28617g1 c28617g1 = this.f63154f;
        return AbstractC12889b.m36283m((Float.isNaN(c28617g1.m87022x()) ? 0.0f : c28617g1.m87022x()) + f13, ((C16475x) m46613c()).m46649d(), ((C16475x) m46613c()).m46648c());
    }

    /* JADX INFO: renamed from: e */
    public final float m46615e(Enum r10, Enum r14) {
        float fM46650e = ((C16475x) m46613c()).m46650e(r10);
        float fM46650e2 = ((C16475x) m46613c()).m46650e(r14);
        float fM36283m = (AbstractC12889b.m36283m(this.f63154f.m87022x(), Math.min(fM46650e, fM46650e2), Math.max(fM46650e, fM46650e2)) - fM46650e) / (fM46650e2 - fM46650e);
        if (Float.isNaN(fM36283m)) {
            return 1.0f;
        }
        if (fM36283m < 1.0E-6f) {
            return 0.0f;
        }
        if (fM36283m > 0.999999f) {
            return 1.0f;
        }
        return Math.abs(fM36283m);
    }

    /* JADX INFO: renamed from: f */
    public final float m46616f() {
        C28617g1 c28617g1 = this.f63154f;
        if (Float.isNaN(c28617g1.m87022x())) {
            AbstractC22086a.m63160c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return c28617g1.m87022x();
    }

    /* JADX INFO: renamed from: g */
    public final void m46617g(Object obj) {
        this.f63151c.setValue(obj);
    }

    /* JADX INFO: renamed from: h */
    public final void m46618h(C16475x c16475x, Object obj) {
        if (AbstractC22676k.m65745e(m46613c(), c16475x)) {
            return;
        }
        this.f63157i.setValue(c16475x);
        C13776c1 c13776c1 = this.f63150b;
        C25437c c25437c = c13776c1.f49150b;
        C25437c c25437c2 = c13776c1.f49150b;
        boolean zTryLock = c25437c.tryLock();
        C28633k1 c28633k1 = this.f63156h;
        if (zTryLock) {
            try {
                C16430o c16430o = this.f63158j;
                float fM46650e = ((C16475x) m46613c()).m46650e(obj);
                if (!Float.isNaN(fM46650e)) {
                    c16430o.m46600b(fM46650e, 0.0f);
                    c28633k1.setValue(null);
                }
                m46617g(obj);
                this.f63152d.setValue(obj);
                c25437c2.mo68214i(null);
            } catch (Throwable th3) {
                c25437c2.mo68214i(null);
                throw th3;
            }
        }
        if (zTryLock) {
            return;
        }
        c28633k1.setValue(obj);
    }
}
