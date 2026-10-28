package oq2;

import androidx.compose.runtime.Composer;
import ar2.C1931b;
import ar2.C1932c;
import aw0.C2108h;
import br2.C3567i;
import br2.C3568j;
import c93.InterfaceC4339a;
import cr2.C11087c;
import cr2.C11093i;
import er2.C13580b;
import er2.C13584f;
import fr2.C14717b;
import fr2.C14722g;
import gr2.C16114b;
import gr2.C16120h;
import hr2.C17582b;
import hr2.C17587g;
import ir2.C20863b;
import ir2.C20868g;
import j93.InterfaceC21461d;
import java.util.Map;
import l83.C23454a0;
import lr2.C24701b;
import lr2.InterfaceC24703d;
import no.nordicsemi.android.dfu.DfuBaseService;
import o72.C27644e;
import od2.C27864a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import rq2.C31713a;
import rq2.C31715b;
import rq2.C31720d0;
import rq2.C31722e0;
import rq2.C31723f;
import rq2.C31725g;
import rq2.C31732j0;
import rq2.C31734k0;
import rq2.C31735l;
import rq2.C31742o0;
import rq2.C31744p0;
import rq2.C31745q;
import rq2.C31747r;
import rq2.C31749s;
import rq2.C31756x;
import rq2.C31757y;
import sq2.C32886c;
import sq2.C32887d;
import tq2.C34089f;
import tq2.C34090g;
import uq2.C35167d;
import uq2.C35168e;
import vq2.C36285b;
import vq2.C36286c;
import wq2.C37512a;
import zq2.C40993f;
import zq2.C40999l;

/* JADX INFO: renamed from: oq2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001aI\u0010\u000b\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f\"\u0017\u0010\u0011\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Llr2/d;", "T", "step", "Loq2/a;", "factory", "", "isCurrentStep", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "y", "(Llr2/d;Loq2/a;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "a", "Loq2/a;", "getStepViewFactory", "()Loq2/a;", "stepViewFactory", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28126d {

    /* JADX INFO: renamed from: a */
    private static final C28123a f113764a;

    static {
        C28124b c28124b = new C28124b();
        C27864a c27864a = new C27864a(16);
        Map<InterfaceC21461d, InterfaceC4339a> mapM85068b = c28124b.m85068b();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        mapM85068b.put(c22673i0.getOrCreateKotlinClass(C32887d.class), c27864a);
        c28124b.m85068b().put(c22673i0.getOrCreateKotlinClass(C35167d.class), new C27864a(5));
        c28124b.m85068b().put(c22673i0.getOrCreateKotlinClass(C31713a.class), new C27864a(8));
        c28124b.m85068b().put(c22673i0.getOrCreateKotlinClass(C36286c.class), new C27864a(9));
        c28124b.m85068b().put(c22673i0.getOrCreateKotlinClass(C31723f.class), new C27864a(10));
        c28124b.m85068b().put(c22673i0.getOrCreateKotlinClass(C31745q.class), new C27864a(11));
        c28124b.m85068b().put(c22673i0.getOrCreateKotlinClass(C31749s.class), new C27864a(12));
        c28124b.m85068b().put(c22673i0.getOrCreateKotlinClass(C31757y.class), new C27864a(13));
        c28124b.m85068b().put(c22673i0.getOrCreateKotlinClass(C31722e0.class), new C27864a(14));
        c28124b.m85068b().put(c22673i0.getOrCreateKotlinClass(C40993f.class), new C27864a(15));
        c28124b.m85068b().put(c22673i0.getOrCreateKotlinClass(C1932c.class), new C27864a(17));
        c28124b.m85068b().put(c22673i0.getOrCreateKotlinClass(C31734k0.class), new C27864a(18));
        c28124b.m85068b().put(c22673i0.getOrCreateKotlinClass(C3568j.class), new C27864a(19));
        c28124b.m85068b().put(c22673i0.getOrCreateKotlinClass(C11087c.class), new C27864a(20));
        c28124b.m85068b().put(c22673i0.getOrCreateKotlinClass(C31744p0.class), new C27864a(21));
        c28124b.m85068b().put(c22673i0.getOrCreateKotlinClass(C34090g.class), new C27864a(22));
        c28124b.m85068b().put(c22673i0.getOrCreateKotlinClass(C24701b.class), new C27864a(23));
        c28124b.m85068b().put(c22673i0.getOrCreateKotlinClass(C13580b.class), new C27864a(2));
        c28124b.m85068b().put(c22673i0.getOrCreateKotlinClass(C16114b.class), new C27864a(3));
        c28124b.m85068b().put(c22673i0.getOrCreateKotlinClass(C14717b.class), new C27864a(4));
        c28124b.m85068b().put(c22673i0.getOrCreateKotlinClass(C17582b.class), new C27864a(6));
        c28124b.m85068b().put(c22673i0.getOrCreateKotlinClass(C20863b.class), new C27864a(7));
        f113764a = c28124b.m85067a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m85069A(InterfaceC24703d interfaceC24703d, C28123a c28123a, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m85116y(interfaceC24703d, c28123a, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final InterfaceC28125c m85070B() {
        return new C32886c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final InterfaceC28125c m85071C() {
        return new C35168e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final InterfaceC28125c m85072D() {
        return new C1931b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final InterfaceC28125c m85073E() {
        return new C31732j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final InterfaceC28125c m85074F() {
        return new C3567i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final InterfaceC28125c m85075G() {
        return new C11093i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final InterfaceC28125c m85076H() {
        return new C31742o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final InterfaceC28125c m85077I() {
        return new C34089f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final InterfaceC28125c m85078J() {
        return new C37512a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final InterfaceC28125c m85079K() {
        return new C13584f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final InterfaceC28125c m85080L() {
        return new C16120h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final InterfaceC28125c m85081M() {
        return new C14722g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final InterfaceC28125c m85082N() {
        return new C31715b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final InterfaceC28125c m85083O() {
        return new C17587g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final InterfaceC28125c m85084P() {
        return new C20868g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final InterfaceC28125c m85085Q() {
        return new C36285b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final InterfaceC28125c m85086R() {
        return new C31725g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final InterfaceC28125c m85087S() {
        return new C31735l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final InterfaceC28125c m85088T() {
        return new C31747r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final InterfaceC28125c m85089U() {
        return new C31756x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final InterfaceC28125c m85090V() {
        return new C31720d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final InterfaceC28125c m85091W() {
        return new C40999l();
    }

    /* JADX INFO: renamed from: y */
    public static final <T extends InterfaceC24703d> void m85116y(T step, C28123a c28123a, boolean z4, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        C28123a c28123a2;
        Function1 function2;
        C28123a c28123a3;
        int i16;
        C28123a c28123a4;
        Function1 function3;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1756363900);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(step) : c28655q.m87157i(step) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= ((i14 & 2) == 0 && c28655q.m87157i(c28123a)) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                if ((i14 & 2) != 0) {
                    c28123a3 = f113764a;
                    i15 &= -113;
                } else {
                    c28123a3 = c28123a;
                }
                if (i17 != 0) {
                    Object objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C27644e(24);
                        c28655q.m87172p0(objM87133R);
                    }
                    C28123a c28123a5 = c28123a3;
                    i16 = i15;
                    c28123a4 = c28123a5;
                    function3 = (Function1) objM87133R;
                } else {
                    C28123a c28123a6 = c28123a3;
                    i16 = i15;
                    c28123a4 = c28123a6;
                    function3 = function1;
                }
            } else {
                c28655q.m87138X();
                if ((i14 & 2) != 0) {
                    i15 &= -113;
                }
                function3 = function1;
                i16 = i15;
                c28123a4 = c28123a;
            }
            c28655q.m87175r();
            int i18 = i16 >> 3;
            c28123a4.m85066b(step, z4, function3, c28655q, (i16 & 14) | (i18 & 112) | (i18 & 896) | ((i16 << 6) & 7168));
            c28123a2 = c28123a4;
            function2 = function3;
        } else {
            c28655q.m87138X();
            c28123a2 = c28123a;
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(step, c28123a2, z4, function2, i13, i14, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m85117z(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }
}
