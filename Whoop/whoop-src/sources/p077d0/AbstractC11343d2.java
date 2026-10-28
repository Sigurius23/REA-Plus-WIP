package p077d0;

import a13.C0148f;
import al.AbstractC0954a;
import androidx.compose.runtime.Composer;
import b61.C2749d;
import bp0.C3526n;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.C6659f;
import com.whoop.profile.view.edit.C9790n;
import l83.EnumC23463i;
import no.nordicsemi.android.dfu.DfuBaseService;
import p007a6.C0458v;
import p031b9.AbstractC2875y;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p652yl.C39615a;
import p668z1.AbstractC39957f;
import p715kotlin.jvm.functions.Function1;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: d0.d2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11343d2 {

    /* JADX INFO: renamed from: a */
    public static final C6659f f36339a = new C6659f(1);

    /* JADX INFO: renamed from: b */
    public static final Object f36340b = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C0148f(16));

    /* JADX INFO: renamed from: a */
    public static final void m30539a(C11421z1 c11421z1, C11409v1 c11409v1, Object obj, Object obj2, InterfaceC11337c0 interfaceC11337c0, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(867041821);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c11421z1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(c11409v1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(obj) : c28655q.m87157i(obj) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q.m87153g(obj2) : c28655q.m87157i(obj2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= (32768 & i13) == 0 ? c28655q.m87153g(interfaceC11337c0) : c28655q.m87157i(interfaceC11337c0) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            c28655q.m87138X();
        } else if (c11421z1.m30665g()) {
            c11409v1.m30644g(obj, obj2, interfaceC11337c0);
        } else {
            c11409v1.m30645j(obj2, interfaceC11337c0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2749d(c11421z1, c11409v1, obj, obj2, interfaceC11337c0, i13, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C11421z1 m30540b(C11421z1 c11421z1, Object obj, Object obj2, String str, Composer composer, int i13) {
        int i14 = (i13 & 14) ^ 6;
        boolean z4 = true;
        boolean z13 = (i14 > 4 && ((C28655q) composer).m87153g(c11421z1)) || (i13 & 6) == 4;
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (z13 || objM87133R == c28676v0) {
            objM87133R = new C11421z1(new C11393q0(obj), c11421z1, AbstractC2875y.m8304q(new StringBuilder(), c11421z1.f36632c, " > ", str));
            c28655q.m87172p0(objM87133R);
        }
        C11421z1 c11421z2 = (C11421z1) objM87133R;
        if ((i14 <= 4 || !c28655q.m87153g(c11421z1)) && (i13 & 6) != 4) {
            z4 = false;
        }
        boolean zM87153g = c28655q.m87153g(c11421z2) | z4;
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g || objM87133R2 == c28676v0) {
            objM87133R2 = new C3526n(10, c11421z1, c11421z2);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87251e(c11421z2, (Function1) objM87133R2, c28655q);
        if (c11421z1.m30665g()) {
            c11421z2.m30669k(obj, obj2);
            return c11421z2;
        }
        c11421z2.m30674p(obj2);
        c11421z2.f36640k.setValue(Boolean.FALSE);
        return c11421z2;
    }

    /* JADX INFO: renamed from: c */
    public static final C11400s1 m30541c(C11421z1 c11421z1, C11351f2 c11351f2, String str, Composer composer, int i13, int i14) {
        if ((i14 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zM87153g = ((C28655q) composer).m87153g(c11421z1);
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = new C11400s1(c11421z1, c11351f2, str);
            c28655q.m87172p0(objM87133R);
        }
        C11400s1 c11400s1 = (C11400s1) objM87133R;
        boolean zM87153g2 = c28655q.m87153g(c11421z1) | c28655q.m87157i(c11400s1);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C9790n(6, c11421z1, c11400s1);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87251e(c11400s1, (Function1) objM87133R2, c28655q);
        if (c11421z1.m30665g()) {
            c11400s1.m30632c();
        }
        return c11400s1;
    }

    /* JADX INFO: renamed from: d */
    public static final C11409v1 m30542d(C11421z1 c11421z1, Object obj, Object obj2, InterfaceC11337c0 interfaceC11337c0, C11351f2 c11351f2, Composer composer, int i13) {
        Object obj3;
        Object obj4;
        int i14 = i13 & 14;
        int i15 = i14 ^ 6;
        boolean z4 = true;
        boolean z13 = (i15 > 4 && ((C28655q) composer).m87153g(c11421z1)) || (i13 & 6) == 4;
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (z13 || objM87133R == c28676v0) {
            AbstractC39957f abstractC39957fM126587c = C39615a.m126587c();
            Function1 function1Mo128133e = abstractC39957fM126587c != null ? abstractC39957fM126587c.mo128133e() : null;
            AbstractC39957f abstractC39957fM126589e = C39615a.m126589e(abstractC39957fM126587c);
            try {
                obj3 = obj2;
                AbstractC11395r abstractC11395r = (AbstractC11395r) c11351f2.f36396a.invoke(obj3);
                abstractC11395r.mo30610d();
                obj4 = obj;
                C11409v1 c11409v1 = new C11409v1(c11421z1, obj4, abstractC11395r, c11351f2);
                C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
                c28655q.m87172p0(c11409v1);
                objM87133R = c11409v1;
            } catch (Throwable th3) {
                C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
                throw th3;
            }
        } else {
            obj4 = obj;
            obj3 = obj2;
        }
        C11409v1 c11409v2 = (C11409v1) objM87133R;
        int i16 = (i13 >> 3) & 8;
        int i17 = i13 << 3;
        m30539a(c11421z1, c11409v2, obj4, obj3, interfaceC11337c0, c28655q, i14 | (i16 << 6) | (i17 & 896) | (i16 << 9) | (i17 & 7168) | (57344 & i17));
        if ((i15 <= 4 || !c28655q.m87153g(c11421z1)) && (i13 & 6) != 4) {
            z4 = false;
        }
        boolean zM87153g = c28655q.m87153g(c11409v2) | z4;
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g || objM87133R2 == c28676v0) {
            objM87133R2 = new C3526n(11, c11421z1, c11409v2);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87251e(c11409v2, (Function1) objM87133R2, c28655q);
        return c11409v2;
    }

    /* JADX INFO: renamed from: e */
    public static final C11421z1 m30543e(AbstractC0954a abstractC0954a, String str, Composer composer, int i13) {
        int i14 = (i13 & 14) ^ 6;
        boolean z4 = true;
        boolean z13 = (i14 > 4 && ((C28655q) composer).m87153g(abstractC0954a)) || (i13 & 6) == 4;
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        Object obj = C28635l.f115821a;
        InterfaceC30057d interfaceC30057d = null;
        if (z13 || objM87133R == obj) {
            AbstractC39957f abstractC39957fM126587c = C39615a.m126587c();
            Function1 function1Mo128133e = abstractC39957fM126587c != null ? abstractC39957fM126587c.mo128133e() : null;
            AbstractC39957f abstractC39957fM126589e = C39615a.m126589e(abstractC39957fM126587c);
            try {
                Object c11421z1 = new C11421z1(abstractC0954a, null, str);
                C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
                c28655q.m87172p0(c11421z1);
                objM87133R = c11421z1;
            } catch (Throwable th3) {
                C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
                throw th3;
            }
        }
        C11421z1 c11421z2 = (C11421z1) objM87133R;
        if (abstractC0954a instanceof C11350f1) {
            c28655q.m87150e0(-1357588631);
            C11350f1 c11350f1 = (C11350f1) abstractC0954a;
            Object value = c11350f1.f36395z.getValue();
            Object value2 = c11350f1.f36394y.getValue();
            if ((i14 <= 4 || !c28655q.m87153g(abstractC0954a)) && (i13 & 6) != 4) {
                z4 = false;
            }
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == obj) {
                objM87133R2 = new C0458v(abstractC0954a, interfaceC30057d, 5);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87254h(value, value2, (InterfaceC4351m) objM87133R2, c28655q);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1357127072);
            c11421z2.m30659a(abstractC0954a.mo2429z0(), c28655q, 0);
            c28655q.m87173q(false);
        }
        boolean zM87153g = c28655q.m87153g(c11421z2);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87153g || objM87133R3 == obj) {
            objM87133R3 = new C11331a2(c11421z2, 0);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC28683x.m87251e(c11421z2, (Function1) objM87133R3, c28655q);
        return c11421z2;
    }

    /* JADX INFO: renamed from: f */
    public static final C11421z1 m30544f(Object obj, String str, Composer composer, int i13, int i14) {
        if ((i14 & 2) != 0) {
            str = null;
        }
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = new C11421z1(new C11393q0(obj), null, str);
            c28655q.m87172p0(objM87133R);
        }
        C11421z1 c11421z1 = (C11421z1) objM87133R;
        c11421z1.m30659a(obj, c28655q, (i13 & 8) | 48 | (i13 & 14));
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = new C11331a2(c11421z1, 1);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87251e(c11421z1, (Function1) objM87133R2, c28655q);
        return c11421z1;
    }
}
