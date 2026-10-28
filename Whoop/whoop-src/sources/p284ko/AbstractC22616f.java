package p284ko;

import android.os.SystemClock;
import java.util.ArrayList;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p690zr.C41060w0;

/* JADX INFO: renamed from: ko.f */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC22616f implements InterfaceC22628l {

    /* JADX INFO: renamed from: w */
    public final boolean f88967w;

    /* JADX INFO: renamed from: x */
    public final ArrayList f88968x = new ArrayList(1);

    /* JADX INFO: renamed from: y */
    public int f88969y;

    /* JADX INFO: renamed from: z */
    public C22630n f88970z;

    public AbstractC22616f(boolean z4) {
        this.f88967w = z4;
    }

    /* JADX INFO: renamed from: a */
    public final void m65557a(int i13) {
        C22630n c22630n = this.f88970z;
        int i14 = AbstractC24567y.f95875a;
        for (int i15 = 0; i15 < this.f88969y; i15++) {
            InterfaceC22625j0 interfaceC22625j0 = (InterfaceC22625j0) this.f88968x.get(i15);
            boolean z4 = this.f88967w;
            C22633q c22633q = (C22633q) interfaceC22625j0;
            synchronized (c22633q) {
                C41060w0 c41060w0 = C22633q.f89034n;
                if (z4 && (c22630n.f89025g & 8) != 8) {
                    c22633q.f89048h += (long) i13;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m65558b() {
        C22630n c22630n = this.f88970z;
        int i13 = AbstractC24567y.f95875a;
        for (int i14 = 0; i14 < this.f88969y; i14++) {
            InterfaceC22625j0 interfaceC22625j0 = (InterfaceC22625j0) this.f88968x.get(i14);
            boolean z4 = this.f88967w;
            C22633q c22633q = (C22633q) interfaceC22625j0;
            synchronized (c22633q) {
                try {
                    C41060w0 c41060w0 = C22633q.f89034n;
                    if (z4 && (c22630n.f89025g & 8) != 8) {
                        AbstractC24543a.m71573i(c22633q.f89046f > 0);
                        c22633q.f89044d.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i15 = (int) (jElapsedRealtime - c22633q.f89047g);
                        c22633q.f89050j += (long) i15;
                        long j7 = c22633q.f89051k;
                        long j13 = c22633q.f89048h;
                        c22633q.f89051k = j7 + j13;
                        if (i15 > 0) {
                            c22633q.f89043c.m65563a((j13 * 8000.0f) / i15, (int) Math.sqrt(j13));
                            if (c22633q.f89050j >= 2000 || c22633q.f89051k >= 524288) {
                                c22633q.f89052l = (long) c22633q.f89043c.m65564b();
                            }
                            c22633q.m65570b(i15, c22633q.f89048h, c22633q.f89052l);
                            c22633q.f89047g = jElapsedRealtime;
                            c22633q.f89048h = 0L;
                        }
                        c22633q.f89046f--;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        this.f88970z = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m65559d() {
        for (int i13 = 0; i13 < this.f88969y; i13++) {
            ((InterfaceC22625j0) this.f88968x.get(i13)).getClass();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m65560h(C22630n c22630n) {
        this.f88970z = c22630n;
        for (int i13 = 0; i13 < this.f88969y; i13++) {
            InterfaceC22625j0 interfaceC22625j0 = (InterfaceC22625j0) this.f88968x.get(i13);
            boolean z4 = this.f88967w;
            C22633q c22633q = (C22633q) interfaceC22625j0;
            synchronized (c22633q) {
                try {
                    C41060w0 c41060w0 = C22633q.f89034n;
                    if (z4 && (c22630n.f89025g & 8) != 8) {
                        if (c22633q.f89046f == 0) {
                            c22633q.f89044d.getClass();
                            c22633q.f89047g = SystemClock.elapsedRealtime();
                        }
                        c22633q.f89046f++;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // p284ko.InterfaceC22628l
    /* JADX INFO: renamed from: y */
    public final void mo65561y(InterfaceC22625j0 interfaceC22625j0) {
        interfaceC22625j0.getClass();
        ArrayList arrayList = this.f88968x;
        if (arrayList.contains(interfaceC22625j0)) {
            return;
        }
        arrayList.add(interfaceC22625j0);
        this.f88969y++;
    }
}
