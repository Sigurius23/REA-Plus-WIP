package cc;

import p463rj.AbstractC31484o;
import p543v4.C35645d;

/* JADX INFO: renamed from: cc.l */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC4405l extends AbstractC4404k {

    /* JADX INFO: renamed from: a */
    public C35645d[] f17778a;

    /* JADX INFO: renamed from: b */
    public String f17779b;

    /* JADX INFO: renamed from: c */
    public int f17780c;

    public AbstractC4405l() {
        this.f17778a = null;
        this.f17780c = 0;
    }

    public C35645d[] getPathData() {
        return this.f17778a;
    }

    public String getPathName() {
        return this.f17779b;
    }

    public void setPathData(C35645d[] c35645dArr) {
        C35645d[] c35645dArr2 = this.f17778a;
        boolean z4 = false;
        if (c35645dArr2 != null && c35645dArr != null && c35645dArr2.length == c35645dArr.length) {
            int i13 = 0;
            while (true) {
                if (i13 >= c35645dArr2.length) {
                    z4 = true;
                    break;
                }
                C35645d c35645d = c35645dArr2[i13];
                char c3 = c35645d.f151454a;
                C35645d c35645d2 = c35645dArr[i13];
                if (c3 != c35645d2.f151454a || c35645d.f151455b.length != c35645d2.f151455b.length) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        if (!z4) {
            this.f17778a = AbstractC31484o.m96965q(c35645dArr);
            return;
        }
        C35645d[] c35645dArr3 = this.f17778a;
        for (int i14 = 0; i14 < c35645dArr.length; i14++) {
            c35645dArr3[i14].f151454a = c35645dArr[i14].f151454a;
            int i15 = 0;
            while (true) {
                float[] fArr = c35645dArr[i14].f151455b;
                if (i15 < fArr.length) {
                    c35645dArr3[i14].f151455b[i15] = fArr[i15];
                    i15++;
                }
            }
        }
    }

    public AbstractC4405l(AbstractC4405l abstractC4405l) {
        this.f17778a = null;
        this.f17780c = 0;
        this.f17779b = abstractC4405l.f17779b;
        this.f17778a = AbstractC31484o.m96965q(abstractC4405l.f17778a);
    }
}
