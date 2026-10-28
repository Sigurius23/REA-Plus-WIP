package p291l0;

import java.util.List;
import m83.C25272z;
import p026b2.InterfaceC2301g;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39126r;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p636y3.C39169a;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: l0.r1 */
/* JADX INFO: loaded from: classes.dex */
public final class C22994r1 implements InterfaceC39127r0, InterfaceC22982n1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC22965i f90716a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2301g f90717b;

    public C22994r1(InterfaceC22965i interfaceC22965i, InterfaceC2301g interfaceC2301g) {
        this.f90716a = interfaceC22965i;
        this.f90717b = interfaceC2301g;
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: a */
    public final InterfaceC39130s0 mo521a(InterfaceC39133t0 interfaceC39133t0, List list, long j7) {
        return AbstractC22953f.m66721j(this, C39169a.m124767k(j7), C39169a.m124766j(j7), C39169a.m124765i(j7), C39169a.m124764h(j7), interfaceC39133t0.mo724F(this.f90716a.mo66735a()), interfaceC39133t0, list, new AbstractC39104j1[list.size()], 0, list.size(), null, 0);
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: b */
    public final int mo537b(InterfaceC39126r interfaceC39126r, List list, int i13) {
        int iMo724F = interfaceC39126r.mo724F(this.f90716a.mo66735a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo724F, i13);
        List list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f13 = 0.0f;
        for (int i14 = 0; i14 < size; i14++) {
            InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) list.get(i14);
            float fM66719h = AbstractC22953f.m66719h(AbstractC22953f.m66718g(interfaceC39124q0));
            if (fM66719h == 0.0f) {
                int iMin2 = Math.min(interfaceC39124q0.mo447Q(Integer.MAX_VALUE), i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i13 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC39124q0.mo438C(iMin2));
            } else if (fM66719h > 0.0f) {
                f13 += fM66719h;
            }
        }
        int iRound = f13 == 0.0f ? 0 : i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i13 - iMin, 0) / f13);
        int size2 = list2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            InterfaceC39124q0 interfaceC39124q1 = (InterfaceC39124q0) list.get(i15);
            float fM66719h2 = AbstractC22953f.m66719h(AbstractC22953f.m66718g(interfaceC39124q1));
            if (fM66719h2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC39124q1.mo438C(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM66719h2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: c */
    public final int mo538c(InterfaceC39126r interfaceC39126r, List list, int i13) {
        int iMo724F = interfaceC39126r.mo724F(this.f90716a.mo66735a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i14 = 0;
        float f13 = 0.0f;
        for (int i15 = 0; i15 < size; i15++) {
            InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) list.get(i15);
            float fM66719h = AbstractC22953f.m66719h(AbstractC22953f.m66718g(interfaceC39124q0));
            int iMo447Q = interfaceC39124q0.mo447Q(i13);
            if (fM66719h == 0.0f) {
                i14 += iMo447Q;
            } else if (fM66719h > 0.0f) {
                f13 += fM66719h;
                iMax = Math.max(iMax, Math.round(iMo447Q / fM66719h));
            }
        }
        return ((list.size() - 1) * iMo724F) + Math.round(iMax * f13) + i14;
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: d */
    public final int mo539d(InterfaceC39126r interfaceC39126r, List list, int i13) {
        int iMo724F = interfaceC39126r.mo724F(this.f90716a.mo66735a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo724F, i13);
        List list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f13 = 0.0f;
        for (int i14 = 0; i14 < size; i14++) {
            InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) list.get(i14);
            float fM66719h = AbstractC22953f.m66719h(AbstractC22953f.m66718g(interfaceC39124q0));
            if (fM66719h == 0.0f) {
                int iMin2 = Math.min(interfaceC39124q0.mo447Q(Integer.MAX_VALUE), i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i13 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC39124q0.mo449b(iMin2));
            } else if (fM66719h > 0.0f) {
                f13 += fM66719h;
            }
        }
        int iRound = f13 == 0.0f ? 0 : i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i13 - iMin, 0) / f13);
        int size2 = list2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            InterfaceC39124q0 interfaceC39124q1 = (InterfaceC39124q0) list.get(i15);
            float fM66719h2 = AbstractC22953f.m66719h(AbstractC22953f.m66718g(interfaceC39124q1));
            if (fM66719h2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC39124q1.mo449b(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM66719h2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: e */
    public final int mo540e(InterfaceC39126r interfaceC39126r, List list, int i13) {
        int iMo724F = interfaceC39126r.mo724F(this.f90716a.mo66735a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i14 = 0;
        float f13 = 0.0f;
        for (int i15 = 0; i15 < size; i15++) {
            InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) list.get(i15);
            float fM66719h = AbstractC22953f.m66719h(AbstractC22953f.m66718g(interfaceC39124q0));
            int iMo446O = interfaceC39124q0.mo446O(i13);
            if (fM66719h == 0.0f) {
                i14 += iMo446O;
            } else if (fM66719h > 0.0f) {
                f13 += fM66719h;
                iMax = Math.max(iMax, Math.round(iMo446O / fM66719h));
            }
        }
        return ((list.size() - 1) * iMo724F) + Math.round(iMax * f13) + i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22994r1)) {
            return false;
        }
        C22994r1 c22994r1 = (C22994r1) obj;
        return AbstractC22676k.m65745e(this.f90716a, c22994r1.f90716a) && AbstractC22676k.m65745e(this.f90717b, c22994r1.f90717b);
    }

    @Override // p291l0.InterfaceC22982n1
    /* JADX INFO: renamed from: f */
    public final int mo66753f(AbstractC39104j1 abstractC39104j1) {
        return abstractC39104j1.f168212x;
    }

    @Override // p291l0.InterfaceC22982n1
    /* JADX INFO: renamed from: g */
    public final long mo66754g(int i13, int i14, int i15, boolean z4) {
        return !z4 ? AbstractC39170b.m124769a(i13, i14, 0, i15) : AbstractC35854l.m113834n(i13, i14, 0, i15);
    }

    @Override // p291l0.InterfaceC22982n1
    /* JADX INFO: renamed from: h */
    public final int mo66755h(AbstractC39104j1 abstractC39104j1) {
        return abstractC39104j1.f168211w;
    }

    public final int hashCode() {
        return this.f90717b.hashCode() + (this.f90716a.hashCode() * 31);
    }

    @Override // p291l0.InterfaceC22982n1
    /* JADX INFO: renamed from: i */
    public final InterfaceC39130s0 mo66756i(AbstractC39104j1[] abstractC39104j1Arr, InterfaceC39133t0 interfaceC39133t0, int i13, int[] iArr, int i14, int i15, int[] iArr2, int i16, int i17, int i18) {
        return interfaceC39133t0.mo86822W(i14, i15, C25272z.f99163w, new C22991q1(abstractC39104j1Arr, this, i15, i13, iArr));
    }

    @Override // p291l0.InterfaceC22982n1
    /* JADX INFO: renamed from: j */
    public final void mo66757j(int i13, int[] iArr, int[] iArr2, InterfaceC39133t0 interfaceC39133t0) {
        this.f90716a.mo66713c(interfaceC39133t0, i13, iArr, interfaceC39133t0.getLayoutDirection(), iArr2);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f90716a + ", verticalAlignment=" + this.f90717b + ')';
    }
}
