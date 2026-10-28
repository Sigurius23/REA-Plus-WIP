package p316m1;

import a00.C0071f;
import a33.C0351c;
import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import e00.C12480c;
import e93.AbstractC12889b;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25272z;
import p132f0.EnumC13840z0;
import p163g1.C15185x;
import p163g1.C15205z;
import p180h0.C16416l0;
import p292l1.EnumC23202x3;
import p390p1.AbstractC28683x;
import p390p1.C28612f0;
import p390p1.C28617g1;
import p390p1.C28633k1;
import p390p1.C28676v0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: m1.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C24902g {

    /* JADX INFO: renamed from: a */
    public final C16416l0 f97541a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4339a f97542b;

    /* JADX INFO: renamed from: c */
    public final C19683b f97543c;

    /* JADX INFO: renamed from: d */
    public final Function1 f97544d;

    /* JADX INFO: renamed from: g */
    public final C28633k1 f97547g;

    /* JADX INFO: renamed from: k */
    public final C28617g1 f97551k;

    /* JADX INFO: renamed from: l */
    public final C28633k1 f97552l;

    /* JADX INFO: renamed from: m */
    public final C28633k1 f97553m;

    /* JADX INFO: renamed from: n */
    public final C24900f f97554n;

    /* JADX INFO: renamed from: e */
    public final C24891a0 f97545e = new C24891a0();

    /* JADX INFO: renamed from: f */
    public final C15205z f97546f = new C15205z(this);

    /* JADX INFO: renamed from: h */
    public final C28612f0 f97548h = AbstractC28683x.m87264r(new C24894c(this, 0));

    /* JADX INFO: renamed from: i */
    public final C28612f0 f97549i = AbstractC28683x.m87264r(new C24894c(this, 1));

    /* JADX INFO: renamed from: j */
    public final C28617g1 f97550j = new C28617g1(Float.NaN);

    public C24902g(EnumC23202x3 enumC23202x3, C16416l0 c16416l0, InterfaceC4339a interfaceC4339a, C19683b c19683b, Function1 function1) {
        this.f97541a = c16416l0;
        this.f97542b = interfaceC4339a;
        this.f97543c = c19683b;
        this.f97544d = function1;
        this.f97547g = AbstractC28683x.m87272z(enumC23202x3);
        AbstractC28683x.m87265s(new C24894c(this, 2), C28676v0.f115974F);
        this.f97551k = new C28617g1(0.0f);
        this.f97552l = AbstractC28683x.m87272z(null);
        this.f97553m = AbstractC28683x.m87272z(new C24893b0(C25272z.f99163w));
        this.f97554n = new C24900f(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m73005a(EnumC13840z0 enumC13840z0, C15185x c15185x, InterfaceC30057d interfaceC30057d) {
        C24896d c24896d;
        if (interfaceC30057d instanceof C24896d) {
            c24896d = (C24896d) interfaceC30057d;
            int i13 = c24896d.f97524y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c24896d.f97524y = i13 - Integer.MIN_VALUE;
            } else {
                c24896d = new C24896d(this, interfaceC30057d);
            }
        } else {
            c24896d = new C24896d(this, interfaceC30057d);
        }
        Object obj = c24896d.f97522w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c24896d.f97524y;
        C28617g1 c28617g1 = this.f97550j;
        Function1 function1 = this.f97544d;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C24891a0 c24891a0 = this.f97545e;
                C0351c c0351c = new C0351c(this, c15185x, null, 8);
                c24896d.f97524y = 1;
                c24891a0.getClass();
                if (AbstractC3006f0.m8719m(new C12480c(enumC13840z0, c24891a0, c0351c, (InterfaceC30057d) null), c24896d) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            Object objM72990a = m73008d().m72990a(c28617g1.m87022x());
            if (objM72990a != null && Math.abs(c28617g1.m87022x() - m73008d().m72993d(objM72990a)) <= 0.5f && ((Boolean) function1.invoke(objM72990a)).booleanValue()) {
                m73011g(objM72990a);
            }
            return C23454a0.f92919a;
        } catch (Throwable th3) {
            Object objM72990a2 = m73008d().m72990a(c28617g1.m87022x());
            if (objM72990a2 != null && Math.abs(c28617g1.m87022x() - m73008d().m72993d(objM72990a2)) <= 0.5f && ((Boolean) function1.invoke(objM72990a2)).booleanValue()) {
                m73011g(objM72990a2);
            }
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: b */
    public final Object m73006b(Object obj, EnumC13840z0 enumC13840z0, InterfaceC4352n interfaceC4352n, InterfaceC30057d interfaceC30057d) {
        C24898e c24898e;
        if (interfaceC30057d instanceof C24898e) {
            c24898e = (C24898e) interfaceC30057d;
            int i13 = c24898e.f97528y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c24898e.f97528y = i13 - Integer.MIN_VALUE;
            } else {
                c24898e = new C24898e(this, interfaceC30057d);
            }
        } else {
            c24898e = new C24898e(this, interfaceC30057d);
        }
        C24898e c24898e2 = c24898e;
        Object obj2 = c24898e2.f97526w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c24898e2.f97528y;
        C28617g1 c28617g1 = this.f97550j;
        Function1 function1 = this.f97544d;
        InterfaceC30057d interfaceC30057d2 = null;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj2);
                if (m73008d().f97517a.containsKey(obj)) {
                    C24891a0 c24891a0 = this.f97545e;
                    C0071f c0071f = new C0071f(this, obj, interfaceC4352n, interfaceC30057d2, 4);
                    c24898e2.f97528y = 1;
                    c24891a0.getClass();
                    if (AbstractC3006f0.m8719m(new C12480c(enumC13840z0, c24891a0, c0071f, (InterfaceC30057d) null), c24898e2) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    m73011g(obj);
                }
                return C23454a0.f92919a;
            }
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj2);
            m73012h(null);
            Object objM72990a = m73008d().m72990a(c28617g1.m87022x());
            if (objM72990a != null && Math.abs(c28617g1.m87022x() - m73008d().m72993d(objM72990a)) <= 0.5f && ((Boolean) function1.invoke(objM72990a)).booleanValue()) {
                m73011g(objM72990a);
            }
            return C23454a0.f92919a;
        } catch (Throwable th3) {
            m73012h(null);
            Object objM72990a2 = m73008d().m72990a(c28617g1.m87022x());
            if (objM72990a2 != null && Math.abs(c28617g1.m87022x() - m73008d().m72993d(objM72990a2)) <= 0.5f && ((Boolean) function1.invoke(objM72990a2)).booleanValue()) {
                m73011g(objM72990a2);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m73007c(float f13, float f14, Object obj) {
        C24893b0 c24893b0M73008d = m73008d();
        float fM72993d = c24893b0M73008d.m72993d(obj);
        float fFloatValue = ((Number) this.f97542b.invoke()).floatValue();
        if (fM72993d != f13 && !Float.isNaN(fM72993d)) {
            C16416l0 c16416l0 = this.f97541a;
            if (fM72993d < f13) {
                if (f14 >= fFloatValue) {
                    Object objM72991b = c24893b0M73008d.m72991b(f13, true);
                    AbstractC22676k.m65747g(objM72991b);
                    return objM72991b;
                }
                Object objM72991b2 = c24893b0M73008d.m72991b(f13, true);
                AbstractC22676k.m65747g(objM72991b2);
                if (f13 >= Math.abs(Math.abs(((Number) c16416l0.invoke(Float.valueOf(Math.abs(c24893b0M73008d.m72993d(objM72991b2) - fM72993d)))).floatValue()) + fM72993d)) {
                    return objM72991b2;
                }
            } else {
                if (f14 <= (-fFloatValue)) {
                    Object objM72991b3 = c24893b0M73008d.m72991b(f13, false);
                    AbstractC22676k.m65747g(objM72991b3);
                    return objM72991b3;
                }
                Object objM72991b4 = c24893b0M73008d.m72991b(f13, false);
                AbstractC22676k.m65747g(objM72991b4);
                float fAbs = Math.abs(fM72993d - Math.abs(((Number) c16416l0.invoke(Float.valueOf(Math.abs(fM72993d - c24893b0M73008d.m72993d(objM72991b4))))).floatValue()));
                if (f13 >= 0.0f ? f13 <= fAbs : Math.abs(f13) >= fAbs) {
                    return objM72991b4;
                }
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public final C24893b0 m73008d() {
        return (C24893b0) this.f97553m.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final float m73009e(float f13) {
        C28617g1 c28617g1 = this.f97550j;
        float fM87022x = (Float.isNaN(c28617g1.m87022x()) ? 0.0f : c28617g1.m87022x()) + f13;
        float fM72992c = m73008d().m72992c();
        Float fM74117U0 = AbstractC25265s.m74117U0(m73008d().f97517a.values());
        return AbstractC12889b.m36283m(fM87022x, fM72992c, fM74117U0 != null ? fM74117U0.floatValue() : Float.NaN);
    }

    /* JADX INFO: renamed from: f */
    public final float m73010f() {
        C28617g1 c28617g1 = this.f97550j;
        if (Float.isNaN(c28617g1.m87022x())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return c28617g1.m87022x();
    }

    /* JADX INFO: renamed from: g */
    public final void m73011g(Object obj) {
        this.f97547g.setValue(obj);
    }

    /* JADX INFO: renamed from: h */
    public final void m73012h(Object obj) {
        this.f97552l.setValue(obj);
    }
}
