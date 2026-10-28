package p748zc1;

import al0.C0971f;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b11.AbstractC2280g;
import b11.AbstractC2282i;
import b11.AbstractC2283j;
import b11.AbstractC2284k;
import b11.C2281h;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16277f;
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
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;
import z72.C40160f;

/* JADX INFO: renamed from: zc1.m1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "p", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40398m1 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m130255A(Context context) {
        Toast.makeText(context, "Strap Icon Click", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m130256B(AbstractC2283j.a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m130257C(Context context) {
        Toast.makeText(context, "Strap Icon Click", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m130258D(AbstractC2283j.a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m130259E(int i13, Composer composer, int i14) {
        m130275p(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    public static final void m130275p(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-119035588);
        int i14 = 0;
        int i15 = 1;
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(1 * 8, AbstractC1102d.m3409f(1.0f, c2314t));
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
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            AbstractC22399k.m64473c("Ready and Data caught up", c28655q, 6);
            float f13 = 2 * 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC16277f.f62381t2, new TextResource.AbstractC8690d.a("100"));
            AbstractC2282i.d dVar = AbstractC2282i.d.f9059f;
            AbstractC2284k.a aVar = AbstractC2284k.a.f9068d;
            C2281h c2281h = new C2281h(c8688b, false, aVar, dVar, 2, null);
            boolean zM87157i = c28655q.m87157i(context);
            Object objM87133R = c28655q.m87133R();
            int i16 = 24;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C0971f(context, i16);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C40160f(i16);
                c28655q.m87172p0(objM87133R2);
            }
            int i17 = (C2281h.f9046e << 3) | 3072;
            AbstractC2280g.m7125o(null, c2281h, interfaceC4339a, (Function1) objM87133R2, c28655q, i17, 1);
            AbstractC22399k.m64473c("Ready and Data catching up", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC16277f.f62381t2, new TextResource.AbstractC8690d.a("100"));
            DefaultConstructorMarker defaultConstructorMarker = null;
            AbstractC2282i.c cVar = new AbstractC2282i.c(i14, i15, defaultConstructorMarker);
            AbstractC2284k.b bVar = AbstractC2284k.b.f9071d;
            C2281h c2281h2 = new C2281h(c8688b2, false, bVar, cVar, 2, null);
            boolean zM87157i2 = c28655q.m87157i(context);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C0971f(context, 29);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
            Object objM87133R4 = c28655q.m87133R();
            int i18 = 25;
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C40160f(i18);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC2280g.m7125o(null, c2281h2, interfaceC4339a2, (Function1) objM87133R4, c28655q, i17, 1);
            AbstractC22399k.m64473c("Low and Data caught up", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            C2281h c2281h3 = new C2281h(new TextResource.C8688b(AbstractC16277f.f62381t2, new TextResource.AbstractC8690d.a("19")), false, aVar, AbstractC2282i.g.f9062f, 2, null);
            boolean zM87157i3 = c28655q.m87157i(context);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i3 || objM87133R5 == c28676v0) {
                objM87133R5 = new C40387l1(context, i14);
                c28655q.m87172p0(objM87133R5);
            }
            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
            Object objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = new C40160f(19);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC2280g.m7125o(null, c2281h3, interfaceC4339a3, (Function1) objM87133R6, c28655q, i17, 1);
            AbstractC22399k.m64473c("Low and Data catching up", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            C2281h c2281h4 = new C2281h(new TextResource.C8688b(AbstractC16277f.f62381t2, new TextResource.AbstractC8690d.a("19")), false, bVar, new AbstractC2282i.f(i14, i15, defaultConstructorMarker), 2, null);
            boolean zM87157i4 = c28655q.m87157i(context);
            Object objM87133R7 = c28655q.m87133R();
            if (zM87157i4 || objM87133R7 == c28676v0) {
                objM87133R7 = new C0971f(context, 25);
                c28655q.m87172p0(objM87133R7);
            }
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R7;
            Object objM87133R8 = c28655q.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = new C40160f(20);
                c28655q.m87172p0(objM87133R8);
            }
            AbstractC2280g.m7125o(null, c2281h4, interfaceC4339a4, (Function1) objM87133R8, c28655q, i17, 1);
            AbstractC22399k.m64473c("Charging and Data caught up", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            C2281h c2281h5 = new C2281h(new TextResource.C8688b(AbstractC16277f.f62381t2, new TextResource.AbstractC8690d.a("19")), false, aVar, AbstractC2282i.b.f9057f, 2, null);
            boolean zM87157i5 = c28655q.m87157i(context);
            Object objM87133R9 = c28655q.m87133R();
            if (zM87157i5 || objM87133R9 == c28676v0) {
                objM87133R9 = new C0971f(context, 26);
                c28655q.m87172p0(objM87133R9);
            }
            InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R9;
            Object objM87133R10 = c28655q.m87133R();
            if (objM87133R10 == c28676v0) {
                objM87133R10 = new C40160f(21);
                c28655q.m87172p0(objM87133R10);
            }
            AbstractC2280g.m7125o(null, c2281h5, interfaceC4339a5, (Function1) objM87133R10, c28655q, i17, 1);
            AbstractC22399k.m64473c("Charging and Data catching up", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            C2281h c2281h6 = new C2281h(new TextResource.C8688b(AbstractC16277f.f62381t2, new TextResource.AbstractC8690d.a("19")), false, bVar, new AbstractC2282i.a(0, i15, defaultConstructorMarker), 2, null);
            boolean zM87157i6 = c28655q.m87157i(context);
            Object objM87133R11 = c28655q.m87133R();
            if (zM87157i6 || objM87133R11 == c28676v0) {
                objM87133R11 = new C0971f(context, 27);
                c28655q.m87172p0(objM87133R11);
            }
            InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R11;
            Object objM87133R12 = c28655q.m87133R();
            if (objM87133R12 == c28676v0) {
                objM87133R12 = new C40160f(22);
                c28655q.m87172p0(objM87133R12);
            }
            AbstractC2280g.m7125o(null, c2281h6, interfaceC4339a6, (Function1) objM87133R12, c28655q, i17, 1);
            AbstractC22399k.m64473c("Disconnected", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            C2281h c2281h7 = new C2281h(new TextResource.C8688b(AbstractC16277f.f62381t2, new TextResource.AbstractC8690d.a("--")), false, AbstractC2284k.c.f9074d, AbstractC2282i.e.f9060f, 2, null);
            boolean zM87157i7 = c28655q.m87157i(context);
            Object objM87133R13 = c28655q.m87133R();
            if (zM87157i7 || objM87133R13 == c28676v0) {
                objM87133R13 = new C0971f(context, 28);
                c28655q.m87172p0(objM87133R13);
            }
            InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R13;
            Object objM87133R14 = c28655q.m87133R();
            if (objM87133R14 == c28676v0) {
                objM87133R14 = new C40160f(23);
                c28655q.m87172p0(objM87133R14);
            }
            AbstractC2280g.m7125o(null, c2281h7, interfaceC4339a7, (Function1) objM87133R14, c28655q, i17, 1);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40498w0(i13, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m130276q(Context context) {
        Toast.makeText(context, "Strap Icon Click", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m130277r(AbstractC2283j.a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m130278s(Context context) {
        Toast.makeText(context, "Strap Icon Click", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m130279t(AbstractC2283j.a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m130280u(Context context) {
        Toast.makeText(context, "Strap Icon Click", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m130281v(AbstractC2283j.a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m130282w(Context context) {
        Toast.makeText(context, "Strap Icon Click", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m130283x(AbstractC2283j.a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m130284y(Context context) {
        Toast.makeText(context, "Strap Icon Click", 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m130285z(AbstractC2283j.a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }
}
