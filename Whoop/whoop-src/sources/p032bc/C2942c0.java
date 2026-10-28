package p032bc;

import a00.C0072g;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import bi.AbstractC3269g;
import java.util.ArrayList;
import java.util.Iterator;
import p108e4.AbstractC12682p;
import u00.C34377e;

/* JADX INFO: renamed from: bc.c0 */
/* JADX INFO: loaded from: classes5.dex */
public class C2942c0 extends AbstractC2974w {

    /* JADX INFO: renamed from: g0 */
    public int f11831g0;

    /* JADX INFO: renamed from: e0 */
    public ArrayList f11829e0 = new ArrayList();

    /* JADX INFO: renamed from: f0 */
    public boolean f11830f0 = true;

    /* JADX INFO: renamed from: h0 */
    public boolean f11832h0 = false;

    /* JADX INFO: renamed from: i0 */
    public int f11833i0 = 0;

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: A */
    public final void mo8574A(View view) {
        super.mo8574A(view);
        int size = this.f11829e0.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((AbstractC2974w) this.f11829e0.get(i13)).mo8574A(view);
        }
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: B */
    public final void mo8575B() {
        this.f11930X = 0L;
        int i13 = 0;
        C2940b0 c2940b0 = new C2940b0(this, i13);
        while (i13 < this.f11829e0.size()) {
            AbstractC2974w abstractC2974w = (AbstractC2974w) this.f11829e0.get(i13);
            abstractC2974w.m8646a(c2940b0);
            abstractC2974w.mo8575B();
            long j7 = abstractC2974w.f11930X;
            if (this.f11830f0) {
                this.f11930X = Math.max(this.f11930X, j7);
            } else {
                long j13 = this.f11930X;
                abstractC2974w.f11932Z = j13;
                this.f11930X = j13 + j7;
            }
            i13++;
        }
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: C */
    public final AbstractC2974w mo8576C(InterfaceC2972u interfaceC2972u) {
        super.mo8576C(interfaceC2972u);
        return this;
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: D */
    public final void mo8577D(View view) {
        for (int i13 = 0; i13 < this.f11829e0.size(); i13++) {
            ((AbstractC2974w) this.f11829e0.get(i13)).mo8577D(view);
        }
        this.f11912F.remove(view);
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: E */
    public final void mo8578E(View view) {
        super.mo8578E(view);
        int size = this.f11829e0.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((AbstractC2974w) this.f11829e0.get(i13)).mo8578E(view);
        }
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: F */
    public final void mo8579F() {
        if (this.f11829e0.isEmpty()) {
            m8645N();
            m8650n();
            return;
        }
        C2940b0 c2940b0 = new C2940b0();
        c2940b0.f11828b = this;
        Iterator it = this.f11829e0.iterator();
        while (it.hasNext()) {
            ((AbstractC2974w) it.next()).m8646a(c2940b0);
        }
        this.f11831g0 = this.f11829e0.size();
        if (this.f11830f0) {
            Iterator it3 = this.f11829e0.iterator();
            while (it3.hasNext()) {
                ((AbstractC2974w) it3.next()).mo8579F();
            }
            return;
        }
        for (int i13 = 1; i13 < this.f11829e0.size(); i13++) {
            ((AbstractC2974w) this.f11829e0.get(i13 - 1)).m8646a(new C2940b0((AbstractC2974w) this.f11829e0.get(i13), 2));
        }
        AbstractC2974w abstractC2974w = (AbstractC2974w) this.f11829e0.get(0);
        if (abstractC2974w != null) {
            abstractC2974w.mo8579F();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: G */
    public final void mo8580G(long j7, long j13) {
        long j14;
        long j15 = this.f11930X;
        long j16 = 0;
        if (this.f11915I != null) {
            if (j7 < 0 && j13 < 0) {
                return;
            }
            if (j7 > j15 && j13 > j15) {
                return;
            }
        }
        boolean z4 = j7 < j13;
        if ((j7 >= 0 && j13 < 0) || (j7 <= j15 && j13 > j15)) {
            this.f11924R = false;
            m8655z(this, InterfaceC2973v.f11902b, z4);
        }
        if (!this.f11830f0) {
            int size = 1;
            while (true) {
                if (size >= this.f11829e0.size()) {
                    size = this.f11829e0.size();
                    break;
                } else if (((AbstractC2974w) this.f11829e0.get(size)).f11932Z > j13) {
                    break;
                } else {
                    size++;
                }
            }
            int i13 = size - 1;
            if (j7 >= j13) {
                while (true) {
                    if (i13 < this.f11829e0.size()) {
                        AbstractC2974w abstractC2974w = (AbstractC2974w) this.f11829e0.get(i13);
                        long j17 = abstractC2974w.f11932Z;
                        j14 = j16;
                        long j18 = j7 - j17;
                        if (j18 < j14) {
                            break;
                        }
                        abstractC2974w.mo8580G(j18, j13 - j17);
                        i13++;
                        j16 = j14;
                    }
                }
            } else {
                j14 = 0;
                while (i13 >= 0) {
                    AbstractC2974w abstractC2974w2 = (AbstractC2974w) this.f11829e0.get(i13);
                    long j19 = abstractC2974w2.f11932Z;
                    long j24 = j7 - j19;
                    abstractC2974w2.mo8580G(j24, j13 - j19);
                    if (j24 >= 0) {
                        break;
                    } else {
                        i13--;
                    }
                }
            }
            if (this.f11915I != null) {
                if ((j7 > j15 || j13 > j15) && (j7 >= 0 || j13 < j14)) {
                    return;
                }
                if (j7 > j15) {
                    this.f11924R = true;
                }
                m8655z(this, InterfaceC2973v.f11903c, z4);
            }
        }
        for (int i14 = 0; i14 < this.f11829e0.size(); i14++) {
            ((AbstractC2974w) this.f11829e0.get(i14)).mo8580G(j7, j13);
        }
        j14 = j16;
        if (this.f11915I != null) {
            if (j7 > j15) {
                return;
            } else {
                return;
            }
            if (j7 > j15) {
                this.f11924R = true;
            }
            m8655z(this, InterfaceC2973v.f11903c, z4);
        }
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: I */
    public final void mo8582I(AbstractC3269g abstractC3269g) {
        this.f11928V = abstractC3269g;
        this.f11833i0 |= 8;
        int size = this.f11829e0.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((AbstractC2974w) this.f11829e0.get(i13)).mo8582I(abstractC3269g);
        }
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: J */
    public final void mo8583J(TimeInterpolator timeInterpolator) {
        this.f11833i0 |= 1;
        ArrayList arrayList = this.f11829e0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((AbstractC2974w) this.f11829e0.get(i13)).mo8583J(timeInterpolator);
            }
        }
        this.f11936z = timeInterpolator;
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: K */
    public final void mo8584K(C34377e c34377e) {
        super.mo8584K(c34377e);
        this.f11833i0 |= 4;
        if (this.f11829e0 != null) {
            for (int i13 = 0; i13 < this.f11829e0.size(); i13++) {
                ((AbstractC2974w) this.f11829e0.get(i13)).mo8584K(c34377e);
            }
        }
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: L */
    public final void mo8585L() {
        this.f11833i0 |= 2;
        int size = this.f11829e0.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((AbstractC2974w) this.f11829e0.get(i13)).mo8585L();
        }
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: M */
    public final void mo8586M(long j7) {
        this.f11934x = j7;
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: O */
    public final String mo8587O(String str) {
        String strMo8587O = super.mo8587O(str);
        for (int i13 = 0; i13 < this.f11829e0.size(); i13++) {
            StringBuilder sbM35484d = AbstractC12682p.m35484d(strMo8587O, "\n");
            sbM35484d.append(((AbstractC2974w) this.f11829e0.get(i13)).mo8587O(str + "  "));
            strMo8587O = sbM35484d.toString();
        }
        return strMo8587O;
    }

    /* JADX INFO: renamed from: P */
    public final void m8588P(AbstractC2974w abstractC2974w) {
        this.f11829e0.add(abstractC2974w);
        abstractC2974w.f11915I = this;
        long j7 = this.f11935y;
        if (j7 >= 0) {
            abstractC2974w.mo8581H(j7);
        }
        if ((this.f11833i0 & 1) != 0) {
            abstractC2974w.mo8583J(this.f11936z);
        }
        if ((this.f11833i0 & 2) != 0) {
            abstractC2974w.mo8585L();
        }
        if ((this.f11833i0 & 4) != 0) {
            abstractC2974w.mo8584K(this.f11929W);
        }
        if ((this.f11833i0 & 8) != 0) {
            abstractC2974w.mo8582I(this.f11928V);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final AbstractC2974w m8589Q(int i13) {
        if (i13 < 0 || i13 >= this.f11829e0.size()) {
            return null;
        }
        return (AbstractC2974w) this.f11829e0.get(i13);
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final void mo8581H(long j7) {
        ArrayList arrayList;
        this.f11935y = j7;
        if (j7 < 0 || (arrayList = this.f11829e0) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((AbstractC2974w) this.f11829e0.get(i13)).mo8581H(j7);
        }
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: b */
    public final void mo8591b(View view) {
        for (int i13 = 0; i13 < this.f11829e0.size(); i13++) {
            ((AbstractC2974w) this.f11829e0.get(i13)).mo8591b(view);
        }
        this.f11912F.add(view);
    }

    @Override // p032bc.AbstractC2974w
    public final void cancel() {
        super.cancel();
        int size = this.f11829e0.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((AbstractC2974w) this.f11829e0.get(i13)).cancel();
        }
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: d */
    public final void mo8592d(C2946e0 c2946e0) {
        View view = c2946e0.f11844b;
        if (m8654x(view)) {
            for (AbstractC2974w abstractC2974w : this.f11829e0) {
                if (abstractC2974w.m8654x(view)) {
                    abstractC2974w.mo8592d(c2946e0);
                    c2946e0.f11845c.add(abstractC2974w);
                }
            }
        }
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: f */
    public final void mo8593f(C2946e0 c2946e0) {
        int size = this.f11829e0.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((AbstractC2974w) this.f11829e0.get(i13)).mo8593f(c2946e0);
        }
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: g */
    public final void mo8594g(C2946e0 c2946e0) {
        View view = c2946e0.f11844b;
        if (m8654x(view)) {
            for (AbstractC2974w abstractC2974w : this.f11829e0) {
                if (abstractC2974w.m8654x(view)) {
                    abstractC2974w.mo8594g(c2946e0);
                    c2946e0.f11845c.add(abstractC2974w);
                }
            }
        }
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: j */
    public final AbstractC2974w clone() {
        C2942c0 c2942c0 = (C2942c0) super.clone();
        c2942c0.f11829e0 = new ArrayList();
        int size = this.f11829e0.size();
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC2974w abstractC2974wClone = ((AbstractC2974w) this.f11829e0.get(i13)).clone();
            c2942c0.f11829e0.add(abstractC2974wClone);
            abstractC2974wClone.f11915I = c2942c0;
        }
        return c2942c0;
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: l */
    public final void mo8596l(ViewGroup viewGroup, C0072g c0072g, C0072g c0072g2, ArrayList arrayList, ArrayList arrayList2) {
        long j7 = this.f11934x;
        int size = this.f11829e0.size();
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC2974w abstractC2974w = (AbstractC2974w) this.f11829e0.get(i13);
            if (j7 > 0 && (this.f11830f0 || i13 == 0)) {
                long j13 = abstractC2974w.f11934x;
                if (j13 > 0) {
                    abstractC2974w.mo8586M(j13 + j7);
                } else {
                    abstractC2974w.mo8586M(j7);
                }
            }
            abstractC2974w.mo8596l(viewGroup, c0072g, c0072g2, arrayList, arrayList2);
        }
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: o */
    public final void mo8597o(ViewGroup viewGroup) {
        super.mo8597o(viewGroup);
        int size = this.f11829e0.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((AbstractC2974w) this.f11829e0.get(i13)).mo8597o(viewGroup);
        }
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: u */
    public final boolean mo8598u() {
        for (int i13 = 0; i13 < this.f11829e0.size(); i13++) {
            if (((AbstractC2974w) this.f11829e0.get(i13)).mo8598u()) {
                return true;
            }
        }
        return false;
    }

    @Override // p032bc.AbstractC2974w
    /* JADX INFO: renamed from: v */
    public final boolean mo8599v() {
        int size = this.f11829e0.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (!((AbstractC2974w) this.f11829e0.get(i13)).mo8599v()) {
                return false;
            }
        }
        return true;
    }
}
