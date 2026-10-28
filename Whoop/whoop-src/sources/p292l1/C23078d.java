package p292l1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import ht2.C17632d;
import java.util.WeakHashMap;
import l83.C23454a0;
import p026b2.C2314t;
import p208i2.InterfaceC17869a1;
import p209i3.AbstractC18032n;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22951e1;
import p316m1.AbstractC24899e0;
import p354o1.AbstractC27383v;
import p354o1.EnumC27381t;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l1.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C23078d {

    /* JADX INFO: renamed from: a */
    public static final C23078d f91051a = new C23078d();

    /* JADX INFO: renamed from: b */
    public static final float f91052b;

    /* JADX INFO: renamed from: c */
    public static final float f91053c;

    /* JADX INFO: renamed from: d */
    public static final float f91054d;

    static {
        EnumC27381t enumC27381t = AbstractC27383v.f110056a;
        float f13 = AbstractC27383v.f110060e;
        f91052b = 640;
        f91053c = 56;
        f91054d = 125;
    }

    /* JADX INFO: renamed from: b */
    public static C22951e1 m67052b(C28655q c28655q) {
        WeakHashMap weakHashMap = C22944c2.f90553v;
        return new C22951e1(C22949e.m66712e(c28655q).f90564k, 48);
    }

    /* JADX INFO: renamed from: a */
    public final void m67053a(Modifier modifier, float f13, float f14, InterfaceC17869a1 interfaceC17869a1, long j7, Composer composer, final int i13) {
        C28655q c28655q;
        final Modifier modifier2;
        final float f15;
        final float f16;
        final InterfaceC17869a1 interfaceC17869a2;
        final long j13;
        InterfaceC17869a1 interfaceC17869a3;
        long jM67118d;
        float f17;
        float f18;
        Modifier modifier3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1364277227);
        int i14 = i13 | 9654;
        if (c28655q2.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            c28655q2.m87140Z();
            if ((i13 & 1) == 0 || c28655q2.m87118C()) {
                float f19 = AbstractC27383v.f110059d;
                float f24 = AbstractC27383v.f110058c;
                interfaceC17869a3 = ((C23154p3) c28655q2.m87161k(AbstractC23160q3.f91608a)).f91576e;
                jM67118d = AbstractC23138n.m67118d(AbstractC27383v.f110057b, c28655q2);
                f17 = f24;
                f18 = f19;
                modifier3 = C2314t.f9131w;
            } else {
                c28655q2.m87138X();
                modifier3 = modifier;
                f18 = f13;
                f17 = f14;
                interfaceC17869a3 = interfaceC17869a1;
                jM67118d = j7;
            }
            c28655q2.m87175r();
            String strM73002i = AbstractC24899e0.m73002i(c28655q2, R.string.m3c_bottom_sheet_drag_handle_description);
            Modifier modifierM3396r = AbstractC1099a.m3396r(modifier3, 0.0f, AbstractC23178t3.f91693a, 1);
            boolean zM87153g = c28655q2.m87153g(strM73002i);
            Object objM87133R = c28655q2.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C17632d(strM73002i, 11);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC23077c4.m67048a(AbstractC18032n.m51775c(modifierM3396r, false, (Function1) objM87133R), interfaceC17869a3, jM67118d, 0L, 0.0f, 0.0f, null, AbstractC37817c.m121344e(-1039573072, c28655q2, new C23072c(f18, f17)), c28655q, 12582912, 120);
            f16 = f17;
            interfaceC17869a2 = interfaceC17869a3;
            j13 = jM67118d;
            f15 = f18;
            modifier2 = modifier3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier2 = modifier;
            f15 = f13;
            f16 = f14;
            interfaceC17869a2 = interfaceC17869a1;
            j13 = j7;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m(modifier2, f15, f16, interfaceC17869a2, j13, i13) { // from class: l1.b

                /* JADX INFO: renamed from: E */
                public final /* synthetic */ InterfaceC17869a1 f90978E;

                /* JADX INFO: renamed from: F */
                public final /* synthetic */ long f90979F;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ Modifier f90981x;

                /* JADX INFO: renamed from: y */
                public final /* synthetic */ float f90982y;

                /* JADX INFO: renamed from: z */
                public final /* synthetic */ float f90983z;

                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(196609);
                    this.f90980w.m67053a(this.f90981x, this.f90982y, this.f90983z, this.f90978E, this.f90979F, (Composer) obj, iM87244L);
                    return C23454a0.f92919a;
                }
            };
        }
    }
}
