package p185h6;

import android.os.Build;
import androidx.room.AbstractC1772c1;
import java.util.ArrayList;
import p005a3.C0237p;
import p692zt.C41113q;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: h6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C16949d extends AbstractC37056f {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C16950e f65071c;

    public C16949d(C16950e c16950e) {
        this.f65071c = c16950e;
    }

    @Override // wb3.AbstractC37056f
    /* JADX INFO: renamed from: S */
    public final void mo47704S(Throwable th3) {
        this.f65071c.f65072a.m47713f(th3);
    }

    @Override // wb3.AbstractC37056f
    /* JADX INFO: renamed from: T */
    public final void mo47705T(C41113q c41113q) {
        C16950e c16950e = this.f65071c;
        c16950e.f65074c = c41113q;
        C41113q c41113q2 = c16950e.f65074c;
        C16955j c16955j = c16950e.f65072a;
        c16950e.f65073b = new C0237p(c41113q2, c16955j.f65085g, c16955j.f65087i, Build.VERSION.SDK_INT >= 34 ? AbstractC16960o.m47718a() : AbstractC1772c1.m5406x());
        C16955j c16955j2 = c16950e.f65072a;
        c16955j2.getClass();
        ArrayList arrayList = new ArrayList();
        c16955j2.f65079a.writeLock().lock();
        try {
            c16955j2.f65081c = 1;
            arrayList.addAll(c16955j2.f65080b);
            c16955j2.f65080b.clear();
            c16955j2.f65079a.writeLock().unlock();
            c16955j2.f65082d.post(new RunnableC16953h(arrayList, c16955j2.f65081c, null));
        } catch (Throwable th3) {
            c16955j2.f65079a.writeLock().unlock();
            throw th3;
        }
    }
}
