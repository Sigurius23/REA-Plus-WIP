package q00;

import a00.C0073h;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import g40.InterfaceC15391m3;
import l83.C23454a0;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.InterfaceC23013y;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32417h;
import x30.C37884e0;
import y00.AbstractC38794c0;

/* JADX INFO: renamed from: q00.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29714f0 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f121498E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function1 f121499F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Function1 f121500G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC2994c0 f121501H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Function1 f121502I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Function1 f121503J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Function1 f121504K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Function1 f121505L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ InterfaceC4339a f121506M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ InterfaceC4339a f121507N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ InterfaceC4339a f121508O;

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ InterfaceC4339a f121509P;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C29720i0 f121510w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC15391m3 f121511x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37884e0 f121512y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f121513z;

    public C29714f0(C29720i0 c29720i0, InterfaceC15391m3 interfaceC15391m3, C37884e0 c37884e0, Function1 function1, Function1 function2, Function1 function3, Function1 function4, InterfaceC2994c0 interfaceC2994c0, Function1 function5, Function1 function6, Function1 function7, Function1 function8, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4) {
        this.f121510w = c29720i0;
        this.f121511x = interfaceC15391m3;
        this.f121512y = c37884e0;
        this.f121513z = function1;
        this.f121498E = function2;
        this.f121499F = function3;
        this.f121500G = function4;
        this.f121501H = interfaceC2994c0;
        this.f121502I = function5;
        this.f121503J = function6;
        this.f121504K = function7;
        this.f121505L = function8;
        this.f121506M = interfaceC4339a;
        this.f121507N = interfaceC4339a2;
        this.f121508O = interfaceC4339a3;
        this.f121509P = interfaceC4339a4;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:21:0x007c  */
    /* JADX WARN: Code duplicated, block: B:8:0x002c  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C29720i0 c29720i0;
        Boolean bool;
        AbstractC38794c0 abstractC38794c0M91175d;
        boolean zBooleanValue;
        C28655q c28655q;
        InterfaceC2994c0 interfaceC2994c0;
        boolean zM87157i;
        Object objM87133R;
        InterfaceC23013y ScrollableTopLevelColumn = (InterfaceC23013y) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC22676k.m65750j(ScrollableTopLevelColumn, "$this$ScrollableTopLevelColumn");
        if ((iIntValue & 17) == 16) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                c29720i0 = this.f121510w;
                bool = c29720i0.f121550o;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    abstractC38794c0M91175d = c29720i0.m91175d();
                    if (abstractC38794c0M91175d == null && c29720i0.m91176e(abstractC38794c0M91175d)) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = true;
                    }
                }
                c28655q = (C28655q) composer;
                c28655q.m87150e0(-1694704366);
                boolean zM87153g = c28655q.m87153g(c29720i0) | c28655q.m87153g(this.f121499F) | c28655q.m87153g(this.f121500G);
                interfaceC2994c0 = this.f121501H;
                zM87157i = zM87153g | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(this.f121502I);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    C0073h c0073h = new C0073h(this.f121510w, this.f121499F, this.f121500G, interfaceC2994c0, this.f121502I, 17);
                    c28655q.m87172p0(c0073h);
                    objM87133R = c0073h;
                }
                c28655q.m87173q(false);
                AbstractC32417h.m101205n(this.f121510w, zBooleanValue, this.f121511x, this.f121512y, this.f121513z, this.f121498E, (InterfaceC4339a) objM87133R, this.f121503J, this.f121504K, this.f121505L, this.f121506M, this.f121500G, this.f121502I, c28655q, 32774);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(16, C2314t.f9131w));
                AbstractC32417h.m101192a(this.f121510w, this.f121507N, this.f121508O, this.f121509P, c28655q, 0);
            }
        } else {
            c29720i0 = this.f121510w;
            bool = c29720i0.f121550o;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                abstractC38794c0M91175d = c29720i0.m91175d();
                if (abstractC38794c0M91175d == null) {
                    zBooleanValue = true;
                } else {
                    zBooleanValue = true;
                }
            }
            c28655q = (C28655q) composer;
            c28655q.m87150e0(-1694704366);
            boolean zM87153g2 = c28655q.m87153g(c29720i0) | c28655q.m87153g(this.f121499F) | c28655q.m87153g(this.f121500G);
            interfaceC2994c0 = this.f121501H;
            zM87157i = zM87153g2 | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(this.f121502I);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                C0073h c0073h2 = new C0073h(this.f121510w, this.f121499F, this.f121500G, interfaceC2994c0, this.f121502I, 17);
                c28655q.m87172p0(c0073h2);
                objM87133R = c0073h2;
            } else {
                C0073h c0073h3 = new C0073h(this.f121510w, this.f121499F, this.f121500G, interfaceC2994c0, this.f121502I, 17);
                c28655q.m87172p0(c0073h3);
                objM87133R = c0073h3;
            }
            c28655q.m87173q(false);
            AbstractC32417h.m101205n(this.f121510w, zBooleanValue, this.f121511x, this.f121512y, this.f121513z, this.f121498E, (InterfaceC4339a) objM87133R, this.f121503J, this.f121504K, this.f121505L, this.f121506M, this.f121500G, this.f121502I, c28655q, 32774);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(16, C2314t.f9131w));
            AbstractC32417h.m101192a(this.f121510w, this.f121507N, this.f121508O, this.f121509P, c28655q, 0);
        }
        return C23454a0.f92919a;
    }
}
