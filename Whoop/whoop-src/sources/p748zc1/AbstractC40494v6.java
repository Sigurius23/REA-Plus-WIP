package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c41.C3990a5;
import c41.C4143w4;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import gz0.AbstractC16319p0;
import hy0.C17750h1;
import java.util.List;
import kd1.AbstractC22399k;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import y71.C39274g;

/* JADX INFO: renamed from: zc1.v6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "n", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40494v6 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m131033A(int i13, Composer composer, int i14) {
        m131047n(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static final void m131047n(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(302646228);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 1;
            Modifier modifierM3394p = AbstractC1099a.m3394p(8 * f13, AbstractC1102d.m3409f(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC22399k.m64473c("Schedule Tile With No Tag", c28655q, 6);
            float f14 = 4;
            float f15 = f13 * f14;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            C4143w4 c4143w4 = new C4143w4();
            List listM118958J = AbstractC37056f.m118958J(new TextResource.C8691e("Day"));
            TextResource.C8691e c8691e = new TextResource.C8691e("7:00am");
            TextResource.C8691e c8691e2 = new TextResource.C8691e("Edit");
            TextResource.C8691e c8691e3 = new TextResource.C8691e("Delete");
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C40348h6(10);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C40348h6(14);
                c28655q.m87172p0(objM87133R2);
            }
            C3990a5 c3990a5 = new C3990a5(null, listM118958J, c8691e, true, false, null, c8691e2, c8691e3, null, interfaceC4339a, (InterfaceC4339a) objM87133R2, 305, null);
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C40473t5(13);
                c28655q.m87172p0(objM87133R3);
            }
            int i14 = C3990a5.f16237l | 48 | (C4143w4.f16869a << 6);
            c4143w4.Compose(c3990a5, (Function1) objM87133R3, c28655q, i14);
            float f16 = 2 * f14;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t));
            C4143w4 c4143w5 = new C4143w4();
            List listM118959K = AbstractC37056f.m118959K(new TextResource.C8691e("Mon"), new TextResource.C8691e("Tue"), new TextResource.C8691e("Wed"), new TextResource.C8691e("Thu"), new TextResource.C8691e("Fri"), new TextResource.C8691e("Sat"), new TextResource.C8691e("Sun"));
            TextResource.C8691e c8691e4 = new TextResource.C8691e("7:00am");
            TextResource.C8691e c8691e5 = new TextResource.C8691e("Edit");
            TextResource.C8691e c8691e6 = new TextResource.C8691e("Delete");
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C40348h6(15);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C40348h6(16);
                c28655q.m87172p0(objM87133R5);
            }
            C3990a5 c3990a6 = new C3990a5(null, listM118959K, c8691e4, true, false, null, c8691e5, c8691e6, null, interfaceC4339a2, (InterfaceC4339a) objM87133R5, 305, null);
            Object objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = new C40473t5(14);
                c28655q.m87172p0(objM87133R6);
            }
            c4143w5.Compose(c3990a6, (Function1) objM87133R6, c28655q, i14);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t));
            AbstractC22399k.m64473c("Schedule Tile With Tag Expanded", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            C4143w4 c4143w6 = new C4143w4();
            List listM118959K2 = AbstractC37056f.m118959K(new TextResource.C8691e("Day"), new TextResource.C8691e("Day"), new TextResource.C8691e("Day"));
            TextResource.C8691e c8691e7 = new TextResource.C8691e("7:00am");
            TextResource.C8691e c8691e8 = new TextResource.C8691e("Alarm On");
            C39274g c39274g = new C39274g(AbstractC16319p0.m46430a().getTinyIcons().getCheckmark(), null, 2, 0 == true ? 1 : 0);
            EnumC39333f enumC39333f = EnumC39333f.RECOVERY_HIGH_RECOVERY;
            C17750h1 c17750h1 = new C17750h1(c8691e8, c39274g, enumC39333f, null, EnumC39333f.BLACK_50, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194280, null);
            TextResource.C8691e c8691e9 = new TextResource.C8691e("Edit");
            TextResource.C8691e c8691e10 = new TextResource.C8691e("Delete");
            Object objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = new C40348h6(17);
                c28655q.m87172p0(objM87133R7);
            }
            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R7;
            Object objM87133R8 = c28655q.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = new C40348h6(11);
                c28655q.m87172p0(objM87133R8);
            }
            C3990a5 c3990a7 = new C3990a5(null, listM118959K2, c8691e7, true, true, c17750h1, c8691e9, c8691e10, null, interfaceC4339a3, (InterfaceC4339a) objM87133R8, 257, null);
            Object objM87133R9 = c28655q.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = new C40473t5(11);
                c28655q.m87172p0(objM87133R9);
            }
            c4143w6.Compose(c3990a7, (Function1) objM87133R9, c28655q, i14);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t));
            AbstractC22399k.m64473c("Schedule Tile With Tag and Collapsed", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            C4143w4 c4143w7 = new C4143w4();
            List listM118958J2 = AbstractC37056f.m118958J(new TextResource.C8691e("Day"));
            TextResource.C8691e c8691e11 = new TextResource.C8691e("7:00am");
            C17750h1 c17750h2 = new C17750h1(new TextResource.C8691e("Alarm On"), new C39274g(AbstractC16319p0.m46430a().getStrap().getStrap(), null, 2, 0 == true ? 1 : 0), enumC39333f, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194296, null);
            TextResource.C8691e c8691e12 = new TextResource.C8691e("Edit");
            TextResource.C8691e c8691e13 = new TextResource.C8691e("Delete");
            Object objM87133R10 = c28655q.m87133R();
            if (objM87133R10 == c28676v0) {
                objM87133R10 = new C40348h6(12);
                c28655q.m87172p0(objM87133R10);
            }
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R10;
            Object objM87133R11 = c28655q.m87133R();
            if (objM87133R11 == c28676v0) {
                objM87133R11 = new C40348h6(13);
                c28655q.m87172p0(objM87133R11);
            }
            C3990a5 c3990a8 = new C3990a5(null, listM118958J2, c8691e11, false, true, c17750h2, c8691e12, c8691e13, null, interfaceC4339a4, (InterfaceC4339a) objM87133R11, 257, null);
            Object objM87133R12 = c28655q.m87133R();
            if (objM87133R12 == c28676v0) {
                objM87133R12 = new C40473t5(12);
                c28655q.m87172p0(objM87133R12);
            }
            c4143w7.Compose(c3990a8, (Function1) objM87133R12, c28655q, i14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40337g6(i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m131048o() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m131049p() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m131050q() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m131051r(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m131052s(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m131053t() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m131054u() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m131055v(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m131056w() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m131057x() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m131058y(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m131059z() {
        return C23454a0.f92919a;
    }
}
