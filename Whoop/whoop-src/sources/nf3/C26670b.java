package nf3;

import p320m5.C25067k;
import v63.AbstractC35744b;

/* JADX INFO: renamed from: nf3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C26670b {

    /* JADX INFO: renamed from: a */
    public final C26669a f106049a = new C26669a();

    /* JADX INFO: renamed from: b */
    public final boolean f106050b = true;

    /* JADX INFO: renamed from: a */
    public final void m79358a() {
        C26669a c26669a = this.f106049a;
        c26669a.f106048c.m92136C("create eager instances ...");
        if (!c26669a.f106048c.m92137D(1)) {
            c26669a.f106047b.m99481e();
            return;
        }
        double dM113233f = AbstractC35744b.m113233f(new C25067k(c26669a, 2));
        c26669a.f106048c.m92139r("eager instances created in " + dM113233f + " ms");
    }
}
