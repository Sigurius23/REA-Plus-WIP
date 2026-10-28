package p004a2;

import android.util.Pair;
import c93.InterfaceC4339a;
import com.google.android.exoplayer2.IllegalSeekPositionException;
import fb3.InterfaceC14343d;
import fg3.InterfaceC14474b;
import gf.C15764e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import lb3.AbstractC23811y;
import live.hms.video.utils.HMSConstantsKt;
import m83.AbstractC25265s;
import p002a0.AbstractC0052t;
import p002a0.C0023g0;
import p031b9.C2822c1;
import p031b9.C2830f0;
import p031b9.C2837h1;
import p031b9.C2848l0;
import p076d.AbstractC11272b1;
import p076d.AbstractC11290h1;
import p076d.C11277d0;
import p076d.C11280e0;
import p076d.C11297l;
import p076d.C11321x;
import p299l9.C23489c1;
import p309lo.AbstractC24567y;
import p368og.EnumC27905b;
import p368og.InterfaceC27910g;
import p389p0.C28515d0;
import p389p0.InterfaceC28518e0;
import p390p1.AbstractC28644n0;
import p390p1.C28591a;
import p465rm.AbstractC31558o1;
import p465rm.C31528e1;
import p465rm.C31545k0;
import p465rm.C31552m1;
import p465rm.C31555n1;
import p465rm.C31569t;
import p465rm.C31570t0;
import p465rm.C31571u;
import p465rm.C31574v0;
import p465rm.C31575w;
import p465rm.InterfaceC31519b1;
import p516u8.AbstractC34609o0;
import p516u8.C34607n0;
import p516u8.InterfaceC34599j0;
import p607x8.AbstractC38065t;
import p607x8.C38062q;
import p607x8.C38063r;
import p635y2.InterfaceC39124q0;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import sn.AbstractC32721a;
import sn.C32762u0;
import sn.C32763v;

/* JADX INFO: renamed from: a2.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC0152a implements InterfaceC14343d, InterfaceC27910g, InterfaceC31519b1, InterfaceC34599j0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f474w;

    /* JADX INFO: renamed from: x */
    public final Object f475x;

    public /* synthetic */ AbstractC0152a(Object obj, int i13) {
        this.f474w = i13;
        this.f475x = obj;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m366b(int i13) {
        String str = (i13 == 1 || i13 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 1 || i13 == 2) ? 2 : 3];
        if (i13 == 1 || i13 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i13 == 1) {
            objArr[1] = "getType";
        } else if (i13 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i13 != 1 && i13 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i13 != 1 && i13 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: A */
    public boolean m367A(int i13) {
        switch (this.f474w) {
            case 6:
                C31571u c31571u = (C31571u) this;
                c31571u.m97198B0();
                return c31571u.f130424o0.f130475w.f95817a.get(i13);
            default:
                C2830f0 c2830f0 = (C2830f0) this;
                c2830f0.m8091L0();
                return c2830f0.f11146p0.f145656a.f145698a.get(i13);
        }
    }

    /* JADX INFO: renamed from: B */
    public boolean m368B() {
        switch (this.f474w) {
            case 6:
                C31571u c31571u = (C31571u) this;
                AbstractC31558o1 abstractC31558o1M97209b0 = c31571u.m97209b0();
                return !abstractC31558o1M97209b0.m97175p() && abstractC31558o1M97209b0.mo97136m(c31571u.m97206Y(), (C31555n1) this.f475x, 0L).f130313I;
            default:
                C2830f0 c2830f0 = (C2830f0) this;
                AbstractC34609o0 abstractC34609o0M8104c0 = c2830f0.m8104c0();
                return !abstractC34609o0M8104c0.m109408p() && abstractC34609o0M8104c0.mo8129m(c2830f0.m8101Z(), (C34607n0) this.f475x, 0L).f145709i;
        }
    }

    /* JADX INFO: renamed from: C */
    public boolean m369C() {
        switch (this.f474w) {
            case 6:
                C31571u c31571u = (C31571u) this;
                AbstractC31558o1 abstractC31558o1M97209b0 = c31571u.m97209b0();
                return !abstractC31558o1M97209b0.m97175p() && abstractC31558o1M97209b0.mo97136m(c31571u.m97206Y(), (C31555n1) this.f475x, 0L).m97166a();
            default:
                C2830f0 c2830f0 = (C2830f0) this;
                AbstractC34609o0 abstractC34609o0M8104c0 = c2830f0.m8104c0();
                return !abstractC34609o0M8104c0.m109408p() && abstractC34609o0M8104c0.mo8129m(c2830f0.m8101Z(), (C34607n0) this.f475x, 0L).m109401a();
        }
    }

    /* JADX INFO: renamed from: D */
    public boolean m370D() {
        switch (this.f474w) {
            case 6:
                C31571u c31571u = (C31571u) this;
                AbstractC31558o1 abstractC31558o1M97209b0 = c31571u.m97209b0();
                return !abstractC31558o1M97209b0.m97175p() && abstractC31558o1M97209b0.mo97136m(c31571u.m97206Y(), (C31555n1) this.f475x, 0L).f130312H;
            default:
                C2830f0 c2830f0 = (C2830f0) this;
                AbstractC34609o0 abstractC34609o0M8104c0 = c2830f0.m8104c0();
                return !abstractC34609o0M8104c0.m109408p() && abstractC34609o0M8104c0.mo8129m(c2830f0.m8101Z(), (C34607n0) this.f475x, 0L).f145708h;
        }
    }

    /* JADX INFO: renamed from: E */
    public void m371E(AbstractC28644n0 abstractC28644n0, Object obj) {
    }

    /* JADX INFO: renamed from: F */
    public void m372F() {
        C2830f0 c2830f0 = (C2830f0) this;
        c2830f0.m8091L0();
        m377K(11, -c2830f0.f11127W);
    }

    /* JADX INFO: renamed from: G */
    public void m373G() {
        C2830f0 c2830f0 = (C2830f0) this;
        c2830f0.m8091L0();
        m377K(12, c2830f0.f11128X);
    }

    /* JADX INFO: renamed from: H */
    public abstract void mo374H(int i13, long j7, boolean z4);

    /* JADX INFO: renamed from: I */
    public void m375I(long j7) {
        mo374H(((C2830f0) this).m8101Z(), j7, false);
    }

    /* JADX INFO: renamed from: J */
    public void m376J() {
        int iMo97130e;
        int iMo97130e2;
        int iMo8134e;
        int iMo8134e2;
        switch (this.f474w) {
            case 6:
                C31571u c31571u = (C31571u) this;
                if (!c31571u.m97209b0().m97175p() && !c31571u.m97214i0()) {
                    AbstractC31558o1 abstractC31558o1M97209b0 = c31571u.m97209b0();
                    if (abstractC31558o1M97209b0.m97175p()) {
                        iMo97130e = -1;
                    } else {
                        int iM97206Y = c31571u.m97206Y();
                        c31571u.m97198B0();
                        int i13 = c31571u.f130416g0;
                        if (i13 == 1) {
                            i13 = 0;
                        }
                        c31571u.m97198B0();
                        iMo97130e = abstractC31558o1M97209b0.mo97130e(iM97206Y, i13, c31571u.f130417h0);
                    }
                    if (iMo97130e != -1) {
                        AbstractC31558o1 abstractC31558o1M97209b1 = c31571u.m97209b0();
                        if (abstractC31558o1M97209b1.m97175p()) {
                            iMo97130e2 = -1;
                        } else {
                            int iM97206Y2 = c31571u.m97206Y();
                            c31571u.m97198B0();
                            int i14 = c31571u.f130416g0;
                            int i15 = i14 != 1 ? i14 : 0;
                            c31571u.m97198B0();
                            iMo97130e2 = abstractC31558o1M97209b1.mo97130e(iM97206Y2, i15, c31571u.f130417h0);
                        }
                        if (iMo97130e2 != -1) {
                            c31571u.m97222q0(iMo97130e2, -9223372036854775807L);
                        }
                        break;
                    } else if (m369C() && m368B()) {
                        c31571u.m97222q0(c31571u.m97206Y(), -9223372036854775807L);
                        break;
                    }
                }
                break;
            default:
                C2830f0 c2830f0 = (C2830f0) this;
                if (c2830f0.m8104c0().m109408p() || c2830f0.m8112l0()) {
                    m401z();
                } else {
                    AbstractC34609o0 abstractC34609o0M8104c0 = c2830f0.m8104c0();
                    if (abstractC34609o0M8104c0.m109408p()) {
                        iMo8134e = -1;
                    } else {
                        int iM8101Z = c2830f0.m8101Z();
                        c2830f0.m8091L0();
                        int i16 = c2830f0.f11138h0;
                        if (i16 == 1) {
                            i16 = 0;
                        }
                        c2830f0.m8091L0();
                        iMo8134e = abstractC34609o0M8104c0.mo8134e(iM8101Z, i16, c2830f0.f11139i0);
                    }
                    if (iMo8134e != -1) {
                        AbstractC34609o0 abstractC34609o0M8104c1 = c2830f0.m8104c0();
                        if (abstractC34609o0M8104c1.m109408p()) {
                            iMo8134e2 = -1;
                        } else {
                            int iM8101Z2 = c2830f0.m8101Z();
                            c2830f0.m8091L0();
                            int i17 = c2830f0.f11138h0;
                            if (i17 == 1) {
                                i17 = 0;
                            }
                            c2830f0.m8091L0();
                            iMo8134e2 = abstractC34609o0M8104c1.mo8134e(iM8101Z2, i17, c2830f0.f11139i0);
                        }
                        if (iMo8134e2 == -1) {
                            m401z();
                        } else if (iMo8134e2 != c2830f0.m8101Z()) {
                            mo374H(iMo8134e2, -9223372036854775807L, false);
                        } else {
                            mo374H(c2830f0.m8101Z(), -9223372036854775807L, true);
                        }
                    } else if (m369C() && m368B()) {
                        mo374H(c2830f0.m8101Z(), -9223372036854775807L, false);
                    } else {
                        m401z();
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: K */
    public void m377K(int i13, long j7) {
        C2830f0 c2830f0 = (C2830f0) this;
        long jM8102a0 = c2830f0.m8102a0() + j7;
        long jM8107f0 = c2830f0.m8107f0();
        if (jM8107f0 != -9223372036854775807L) {
            jM8102a0 = Math.min(jM8102a0, jM8107f0);
        }
        mo374H(c2830f0.m8101Z(), Math.max(jM8102a0, 0L), false);
    }

    /* JADX INFO: renamed from: L */
    public void m378L(long j7) {
        long jM71669G;
        C31571u c31571u = (C31571u) this;
        long jM97207Z = c31571u.m97207Z() + j7;
        c31571u.m97198B0();
        if (c31571u.m97214i0()) {
            C31574v0 c31574v0 = c31571u.f130392K0;
            C32763v c32763v = c31574v0.f130442b;
            AbstractC31558o1 abstractC31558o1 = c31574v0.f130441a;
            Object obj = c32763v.f136238a;
            C31552m1 c31552m1 = c31571u.f130398O;
            abstractC31558o1.mo97132g(obj, c31552m1);
            jM71669G = AbstractC24567y.m71669G(c31552m1.m97150a(c32763v.f136239b, c32763v.f136240c));
        } else {
            AbstractC31558o1 abstractC31558o1M97209b0 = c31571u.m97209b0();
            jM71669G = abstractC31558o1M97209b0.m97175p() ? -9223372036854775807L : AbstractC24567y.m71669G(abstractC31558o1M97209b0.mo97136m(c31571u.m97206Y(), (C31555n1) c31571u.f475x, 0L).f130318N);
        }
        if (jM71669G != -9223372036854775807L) {
            jM97207Z = Math.min(jM97207Z, jM71669G);
        }
        c31571u.m97222q0(c31571u.m97206Y(), Math.max(jM97207Z, 0L));
    }

    /* JADX INFO: renamed from: M */
    public void m379M() {
        int iMo97134k;
        int i13;
        int iMo97134k2;
        int iMo97134k3;
        int iMo8137k;
        int iMo8137k2;
        int iMo8137k3;
        switch (this.f474w) {
            case 6:
                C31571u c31571u = (C31571u) this;
                if (!c31571u.m97209b0().m97175p() && !c31571u.m97214i0()) {
                    AbstractC31558o1 abstractC31558o1M97209b0 = c31571u.m97209b0();
                    if (abstractC31558o1M97209b0.m97175p()) {
                        iMo97134k = -1;
                    } else {
                        int iM97206Y = c31571u.m97206Y();
                        c31571u.m97198B0();
                        int i14 = c31571u.f130416g0;
                        if (i14 == 1) {
                            i14 = 0;
                        }
                        c31571u.m97198B0();
                        iMo97134k = abstractC31558o1M97209b0.mo97134k(iM97206Y, i14, c31571u.f130417h0);
                    }
                    boolean z4 = iMo97134k != -1;
                    if (!m369C() || m370D()) {
                        if (z4) {
                            long jM97207Z = c31571u.m97207Z();
                            c31571u.m97198B0();
                            if (jM97207Z <= HMSConstantsKt.TIMEOUT_FOR_LOW_SPEED_INDICATOR_MILLIS) {
                                AbstractC31558o1 abstractC31558o1M97209b1 = c31571u.m97209b0();
                                if (abstractC31558o1M97209b1.m97175p()) {
                                    iMo97134k2 = -1;
                                } else {
                                    int iM97206Y2 = c31571u.m97206Y();
                                    c31571u.m97198B0();
                                    int i15 = c31571u.f130416g0;
                                    i13 = i15 != 1 ? i15 : 0;
                                    c31571u.m97198B0();
                                    iMo97134k2 = abstractC31558o1M97209b1.mo97134k(iM97206Y2, i13, c31571u.f130417h0);
                                }
                                if (iMo97134k2 != -1) {
                                    c31571u.m97222q0(iMo97134k2, -9223372036854775807L);
                                }
                            }
                        }
                        c31571u.m97222q0(c31571u.m97206Y(), 0L);
                    } else if (z4) {
                        AbstractC31558o1 abstractC31558o1M97209b2 = c31571u.m97209b0();
                        if (abstractC31558o1M97209b2.m97175p()) {
                            iMo97134k3 = -1;
                        } else {
                            int iM97206Y3 = c31571u.m97206Y();
                            c31571u.m97198B0();
                            int i16 = c31571u.f130416g0;
                            i13 = i16 != 1 ? i16 : 0;
                            c31571u.m97198B0();
                            iMo97134k3 = abstractC31558o1M97209b2.mo97134k(iM97206Y3, i13, c31571u.f130417h0);
                        }
                        if (iMo97134k3 != -1) {
                            c31571u.m97222q0(iMo97134k3, -9223372036854775807L);
                        }
                    }
                    break;
                }
                break;
            default:
                C2830f0 c2830f0 = (C2830f0) this;
                if (c2830f0.m8104c0().m109408p() || c2830f0.m8112l0()) {
                    m401z();
                } else {
                    AbstractC34609o0 abstractC34609o0M8104c0 = c2830f0.m8104c0();
                    if (abstractC34609o0M8104c0.m109408p()) {
                        iMo8137k = -1;
                    } else {
                        int iM8101Z = c2830f0.m8101Z();
                        c2830f0.m8091L0();
                        int i17 = c2830f0.f11138h0;
                        if (i17 == 1) {
                            i17 = 0;
                        }
                        c2830f0.m8091L0();
                        iMo8137k = abstractC34609o0M8104c0.mo8137k(iM8101Z, i17, c2830f0.f11139i0);
                    }
                    boolean z13 = iMo8137k != -1;
                    if (!m369C() || m370D()) {
                        if (z13) {
                            long jM8102a0 = c2830f0.m8102a0();
                            c2830f0.m8091L0();
                            if (jM8102a0 <= c2830f0.f11129Y) {
                                AbstractC34609o0 abstractC34609o0M8104c1 = c2830f0.m8104c0();
                                if (abstractC34609o0M8104c1.m109408p()) {
                                    iMo8137k2 = -1;
                                } else {
                                    int iM8101Z2 = c2830f0.m8101Z();
                                    c2830f0.m8091L0();
                                    int i18 = c2830f0.f11138h0;
                                    if (i18 == 1) {
                                        i18 = 0;
                                    }
                                    c2830f0.m8091L0();
                                    iMo8137k2 = abstractC34609o0M8104c1.mo8137k(iM8101Z2, i18, c2830f0.f11139i0);
                                }
                                if (iMo8137k2 == -1) {
                                    m401z();
                                } else if (iMo8137k2 != c2830f0.m8101Z()) {
                                    mo374H(iMo8137k2, -9223372036854775807L, false);
                                } else {
                                    mo374H(c2830f0.m8101Z(), -9223372036854775807L, true);
                                }
                            }
                        }
                        mo374H(c2830f0.m8101Z(), 0L, false);
                    } else if (!z13) {
                        m401z();
                    } else {
                        AbstractC34609o0 abstractC34609o0M8104c2 = c2830f0.m8104c0();
                        if (abstractC34609o0M8104c2.m109408p()) {
                            iMo8137k3 = -1;
                        } else {
                            int iM8101Z3 = c2830f0.m8101Z();
                            c2830f0.m8091L0();
                            int i19 = c2830f0.f11138h0;
                            if (i19 == 1) {
                                i19 = 0;
                            }
                            c2830f0.m8091L0();
                            iMo8137k3 = abstractC34609o0M8104c2.mo8137k(iM8101Z3, i19, c2830f0.f11139i0);
                        }
                        if (iMo8137k3 == -1) {
                            m401z();
                        } else if (iMo8137k3 != c2830f0.m8101Z()) {
                            mo374H(iMo8137k3, -9223372036854775807L, false);
                        } else {
                            mo374H(c2830f0.m8101Z(), -9223372036854775807L, true);
                        }
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: N */
    public void m380N(Object obj, String name) {
        AbstractC22676k.m65750j(name, "name");
        List listM392q = m392q(1, name);
        listM392q.clear();
        listM392q.add(obj);
    }

    /* JADX INFO: renamed from: O */
    public void m381O(C31545k0 c31545k0) {
        List listSingletonList = Collections.singletonList(c31545k0);
        C31571u c31571u = (C31571u) this;
        c31571u.m97198B0();
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < listSingletonList.size(); i13++) {
            arrayList.add(c31571u.f130401R.mo15565a((C31545k0) listSingletonList.get(i13)));
        }
        c31571u.m97198B0();
        c31571u.m97210c0();
        c31571u.m97207Z();
        c31571u.f130418i0++;
        ArrayList arrayList2 = c31571u.f130399P;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i14 = size - 1; i14 >= 0; i14--) {
                arrayList2.remove(i14);
            }
            C32762u0 c32762u0 = c31571u.f130423n0;
            int[] iArr = c32762u0.f136244b;
            int[] iArr2 = new int[iArr.length - size];
            int i15 = 0;
            for (int i16 = 0; i16 < iArr.length; i16++) {
                int i17 = iArr[i16];
                if (i17 < 0 || i17 >= size) {
                    int i18 = i16 - i15;
                    if (i17 >= 0) {
                        i17 -= size;
                    }
                    iArr2[i18] = i17;
                } else {
                    i15++;
                }
            }
            c31571u.f130423n0 = new C32762u0(iArr2, new Random(c32762u0.f136243a.nextLong()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            C31570t0 c31570t0 = new C31570t0((AbstractC32721a) arrayList.get(i19), c31571u.f130400Q);
            arrayList3.add(c31570t0);
            arrayList2.add(i19, new C31569t(c31570t0.f130371b, c31570t0.f130370a.f136200o));
        }
        C32762u0 c32762u0M102754a = c31571u.f130423n0.m102754a(arrayList3.size());
        c31571u.f130423n0 = c32762u0M102754a;
        C31528e1 c31528e1 = new C31528e1(arrayList2, c32762u0M102754a);
        boolean zM97175p = c31528e1.m97175p();
        int i24 = c31528e1.f130138z;
        if (!zM97175p && -1 >= i24) {
            throw new IllegalSeekPositionException();
        }
        int iMo97127a = c31528e1.mo97127a(c31571u.f130417h0);
        C31574v0 c31574v0M97215j0 = c31571u.m97215j0(c31571u.f130392K0, c31528e1, c31571u.m97216k0(c31528e1, iMo97127a, -9223372036854775807L));
        int i25 = c31574v0M97215j0.f130445e;
        if (iMo97127a != -1 && i25 != 1) {
            i25 = (c31528e1.m97175p() || iMo97127a >= i24) ? 4 : 2;
        }
        C31574v0 c31574v0M97239g = c31574v0M97215j0.m97239g(i25);
        c31571u.f130393L.f130483H.m71649a(17, new C31575w(arrayList3, c31571u.f130423n0, iMo97127a, AbstractC24567y.m71695z(-9223372036854775807L))).m71647b();
        c31571u.m97231z0(c31574v0M97239g, 0, 1, false, (c31571u.f130392K0.f130442b.f136238a.equals(c31574v0M97239g.f130442b.f136238a) || c31571u.f130392K0.f130441a.m97175p()) ? false : true, 4, c31571u.m97208a0(c31574v0M97239g), -1);
    }

    /* JADX INFO: renamed from: P */
    public void m382P(String str) {
        if (((Map) this.f475x).containsKey("Content-Type")) {
            return;
        }
        m380N(str, "Content-Type");
    }

    /* JADX INFO: renamed from: c */
    public abstract AbstractC11272b1 mo383c(C11297l c11297l);

    /* JADX INFO: renamed from: d */
    public AbstractC11272b1 m384d(C11277d0 c11277d0) {
        String str;
        AbstractC11290h1 c11280e0;
        Class cls = (Class) this.f475x;
        int i13 = c11277d0.f36194b;
        int i14 = c11277d0.f36193a;
        if (i13 != 128) {
            if (i13 == 64) {
                str = "APPLICATION";
            } else if (i13 != 128) {
                str = i13 != 192 ? "UNIVERSAL" : "PRIVATE";
            } else {
                str = "CONTEXT";
            }
            throw new IllegalStateException("Expected CONTEXT tag but found ".concat(str));
        }
        if (1 == i14) {
            throw new IllegalStateException("object explicit - implicit expected.");
        }
        AbstractC11272b1 abstractC11272b1Mo30482d = c11277d0.f36196d.mo30482d();
        if (i14 == 3) {
            switch (c11277d0.f36197e) {
                case 0:
                    C11321x c11321x = new C11321x(abstractC11272b1Mo30482d, 0);
                    c11321x.f36274c = -1;
                    c11280e0 = c11321x;
                    break;
                case 1:
                    c11280e0 = new C11280e0(abstractC11272b1Mo30482d);
                    break;
                default:
                    C11321x c11321x2 = new C11321x(abstractC11272b1Mo30482d, 1);
                    c11321x2.f36274c = -1;
                    c11280e0 = c11321x2;
                    break;
            }
            abstractC11272b1Mo30482d = mo385e(c11280e0);
        } else if (i14 == 4) {
            abstractC11272b1Mo30482d = abstractC11272b1Mo30482d instanceof AbstractC11290h1 ? mo385e((AbstractC11290h1) abstractC11272b1Mo30482d) : mo383c((C11297l) abstractC11272b1Mo30482d);
        } else if (!cls.isInstance(abstractC11272b1Mo30482d)) {
            throw new IllegalStateException("unexpected object: ".concat(abstractC11272b1Mo30482d.getClass().getName()));
        }
        if (cls.isInstance(abstractC11272b1Mo30482d)) {
            return abstractC11272b1Mo30482d;
        }
        throw new IllegalStateException("unexpected object: ".concat(abstractC11272b1Mo30482d.getClass().getName()));
    }

    /* JADX INFO: renamed from: e */
    public abstract AbstractC11272b1 mo385e(AbstractC11290h1 abstractC11290h1);

    public boolean equals(Object obj) {
        switch (this.f474w) {
            case 1:
                return this == obj;
            default:
                return super.equals(obj);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m386f(Object obj, String name) {
        AbstractC22676k.m65750j(name, "name");
        m392q(1, name).add(obj);
    }

    @Override // fb3.InterfaceC14343d
    public AbstractC23811y getType() {
        AbstractC23811y abstractC23811y = (AbstractC23811y) this.f475x;
        if (abstractC23811y != null) {
            return abstractC23811y;
        }
        m366b(1);
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public void m387h(String name, Iterable values) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(values, "values");
        Collection collection = values instanceof Collection ? (Collection) values : null;
        List listM392q = m392q(collection != null ? collection.size() : 2, name);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            listM392q.add(it.next());
        }
    }

    /* JADX INFO: renamed from: i */
    public void m388i() {
        boolean z4;
        int i13;
        Pair pairM8114o0;
        C2830f0 c2830f0 = (C2830f0) this;
        c2830f0.m8091L0();
        ArrayList arrayList = c2830f0.f11121Q;
        int size = arrayList.size();
        int iMin = Math.min(Integer.MAX_VALUE, size);
        if (size <= 0 || iMin == 0) {
            return;
        }
        C2822c1 c2822c1 = c2830f0.f11111I0;
        int iM8106e0 = c2830f0.m8106e0(c2822c1);
        long jM8098W = c2830f0.m8098W(c2822c1);
        AbstractC34609o0 abstractC34609o0 = c2822c1.f11045a;
        int size2 = arrayList.size();
        c2830f0.f11140j0++;
        c2830f0.m8119t0(iMin);
        C2837h1 c2837h1 = new C2837h1(arrayList, c2830f0.f11144n0);
        if (abstractC34609o0.m109408p() || c2837h1.m109408p()) {
            z4 = true;
            i13 = 0;
            int i14 = -1;
            boolean z13 = !abstractC34609o0.m109408p() && c2837h1.m109408p();
            if (!z13) {
                i14 = iM8106e0;
            }
            if (z13) {
                jM8098W = -9223372036854775807L;
            }
            pairM8114o0 = c2830f0.m8114o0(c2837h1, i14, jM8098W);
        } else {
            Pair pairM109405i = abstractC34609o0.m109405i((C34607n0) c2830f0.f475x, c2830f0.f11120P, iM8106e0, AbstractC38065t.m121896J(jM8098W));
            Object obj = pairM109405i.first;
            if (c2837h1.mo8132b(obj) != -1) {
                pairM8114o0 = pairM109405i;
                z4 = true;
                i13 = 0;
            } else {
                z4 = true;
                i13 = 0;
                int iM8170Q = C2848l0.m8170Q((C34607n0) c2830f0.f475x, c2830f0.f11120P, c2830f0.f11138h0, c2830f0.f11139i0, obj, abstractC34609o0, c2837h1);
                if (iM8170Q != -1) {
                    C34607n0 c34607n0 = (C34607n0) c2830f0.f475x;
                    c2837h1.mo8129m(iM8170Q, c34607n0, 0L);
                    pairM8114o0 = c2830f0.m8114o0(c2837h1, iM8170Q, AbstractC38065t.m121907U(c34607n0.f145712l));
                } else {
                    pairM8114o0 = c2830f0.m8114o0(c2837h1, -1, -9223372036854775807L);
                }
            }
        }
        C2822c1 c2822c1M8113n0 = c2830f0.m8113n0(c2822c1, c2837h1, pairM8114o0);
        int i15 = c2822c1M8113n0.f11049e;
        if (i15 != z4 && i15 != 4 && iMin > 0 && iMin == size2 && iM8106e0 >= c2822c1M8113n0.f11045a.mo8139o()) {
            c2822c1M8113n0 = C2830f0.m8079m0(c2822c1M8113n0, 4);
        }
        C23489c1 c23489c1 = c2830f0.f11144n0;
        C38063r c38063r = c2830f0.f11117M.f11261H;
        c38063r.getClass();
        C38062q c38062qM121877b = C38063r.m121877b();
        c38062qM121877b.f163024a = c38063r.f163026a.obtainMessage(20, i13, iMin, c23489c1);
        c38062qM121877b.m121876b();
        c2830f0.m8089J0(c2822c1M8113n0, 0, c2822c1M8113n0.f11046b.f92976a.equals(c2830f0.f11111I0.f11046b.f92976a) ^ z4, 4, c2830f0.m8103b0(c2822c1M8113n0), -1, false);
    }

    @Override // p368og.InterfaceC27910g
    /* JADX INFO: renamed from: j */
    public boolean mo389j(EnumC27905b enumC27905b) {
        InterfaceC14474b interfaceC14474b = (InterfaceC14474b) this.f475x;
        int iOrdinal = enumC27905b.ordinal();
        if (iOrdinal == 0) {
            return interfaceC14474b.mo41330p();
        }
        if (iOrdinal == 1) {
            return interfaceC14474b.mo41315a();
        }
        if (iOrdinal == 2) {
            return interfaceC14474b.mo41318d();
        }
        if (iOrdinal == 3) {
            return interfaceC14474b.mo41316b();
        }
        if (iOrdinal == 4) {
            return interfaceC14474b.mo41319e();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p368og.InterfaceC27910g
    /* JADX INFO: renamed from: n */
    public void mo390n(Throwable th3, InterfaceC4339a msg) {
        InterfaceC14474b interfaceC14474b = (InterfaceC14474b) this.f475x;
        AbstractC22676k.m65750j(msg, "msg");
        if (mo389j(EnumC27905b.f112505x)) {
            if (th3 != null) {
                interfaceC14474b.mo41324j((String) msg.invoke(), th3);
            } else {
                interfaceC14474b.warn((String) msg.invoke());
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public boolean m391o(String name) {
        AbstractC22676k.m65750j(name, "name");
        return ((Map) this.f475x).containsKey(name);
    }

    /* JADX INFO: renamed from: q */
    public List m392q(int i13, String str) {
        Map map = (Map) this.f475x;
        List list = (List) map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(i13);
        map.put(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    public Set m393r() {
        return ((Map) this.f475x).entrySet();
    }

    @Override // p368og.InterfaceC27910g
    /* JADX INFO: renamed from: s */
    public void mo394s(Throwable th3, InterfaceC4339a msg) {
        InterfaceC14474b interfaceC14474b = (InterfaceC14474b) this.f475x;
        AbstractC22676k.m65750j(msg, "msg");
        if (mo389j(EnumC27905b.f112502E)) {
            if (th3 != null) {
                interfaceC14474b.mo41325k((String) msg.invoke(), th3);
            } else {
                interfaceC14474b.mo41333s((String) msg.invoke());
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m395t(AbstractC28644n0 abstractC28644n0, Object obj) {
        ArrayList arrayList = abstractC28644n0.f115850a;
        if (arrayList == null) {
            return true;
        }
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj2 = arrayList.get(i13);
            if (obj2 instanceof C28591a) {
                if (obj2.equals(obj)) {
                    return true;
                }
            } else {
                if (!(obj2 instanceof AbstractC28644n0)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                }
                if (m395t((AbstractC28644n0) obj2, obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p368og.InterfaceC27910g
    /* JADX INFO: renamed from: u */
    public void mo396u(Throwable th3, InterfaceC4339a msg) {
        InterfaceC14474b interfaceC14474b = (InterfaceC14474b) this.f475x;
        AbstractC22676k.m65750j(msg, "msg");
        if (mo389j(EnumC27905b.f112507z)) {
            if (th3 != null) {
                interfaceC14474b.mo41332r((String) msg.invoke(), th3);
            } else {
                interfaceC14474b.debug((String) msg.invoke());
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public Object m397v(String str) {
        List list = (List) ((Map) this.f475x).get(str);
        if (list != null) {
            return AbstractC25265s.m74100H0(list);
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public abstract InterfaceC28518e0 mo398w(int i13, int i14, long j7, int i15);

    /* JADX INFO: renamed from: x */
    public long m399x() {
        C2830f0 c2830f0 = (C2830f0) this;
        AbstractC34609o0 abstractC34609o0M8104c0 = c2830f0.m8104c0();
        if (abstractC34609o0M8104c0.m109408p()) {
            return -9223372036854775807L;
        }
        return AbstractC38065t.m121907U(abstractC34609o0M8104c0.mo8129m(c2830f0.m8101Z(), (C34607n0) this.f475x, 0L).f145713m);
    }

    /* JADX INFO: renamed from: y */
    public List m400y(C28515d0 c28515d0, int i13, long j7) {
        C0023g0 c0023g0 = (C0023g0) this.f475x;
        List list = (List) c0023g0.m121b(i13);
        if (list != null) {
            return list;
        }
        List listM86823a = c28515d0.m86823a(i13);
        int size = listM86823a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(((InterfaceC39124q0) listM86823a.get(i14)).mo448T(j7));
        }
        c0023g0.m51h(i13, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public void m401z() {
        ((C2830f0) this).m8091L0();
    }

    public AbstractC0152a(AbstractC23811y abstractC23811y) {
        this.f474w = 2;
        if (abstractC23811y != null) {
            this.f475x = abstractC23811y;
        } else {
            m366b(0);
            throw null;
        }
    }

    public AbstractC0152a(int i13) {
        this.f474w = i13;
        switch (i13) {
            case 3:
                this.f475x = new C15764e();
                break;
            case 4:
                C0023g0 c0023g0 = AbstractC0052t.f161a;
                this.f475x = new C0023g0();
                break;
            case 5:
            default:
                this.f475x = new ArrayList();
                break;
            case 6:
                this.f475x = new C31555n1();
                break;
            case 7:
                this.f475x = new C34607n0();
                break;
        }
    }
}
