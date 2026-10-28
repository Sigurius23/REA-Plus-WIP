package zd3;

import fe3.AbstractC14421e;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.AbstractC37174h;
import yd3.C39471b;
import yd3.C39472c;
import yd3.C39473d;

/* JADX INFO: renamed from: zd3.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C40573q {

    /* JADX INFO: renamed from: a */
    public final long f174742a;

    /* JADX INFO: renamed from: b */
    public final C39472c f174743b;

    /* JADX INFO: renamed from: c */
    public final C39471b f174744c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentLinkedQueue f174745d;

    public C40573q(C39473d taskRunner, long j7, TimeUnit timeUnit) {
        AbstractC22676k.m65750j(taskRunner, "taskRunner");
        AbstractC22676k.m65750j(timeUnit, "timeUnit");
        this.f174742a = timeUnit.toNanos(j7);
        this.f174743b = taskRunner.m126126d();
        this.f174744c = new C39471b(this, AbstractC25012a.m73376i(AbstractC37174h.f158963b, " ConnectionPool connection closer", new StringBuilder()));
        this.f174745d = new ConcurrentLinkedQueue();
        if (j7 <= 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "keepAliveDuration <= 0: ").toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m131559a(C40572p c40572p, long j7) {
        TimeZone timeZone = AbstractC37174h.f158962a;
        ArrayList arrayList = c40572p.f174740q;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i13);
            if (reference.get() != null) {
                i13++;
            } else {
                String str = "A connection to " + c40572p.f174726c.f146527a.f146519h + " was leaked. Did you forget to close a response body?";
                AbstractC14421e abstractC14421e = AbstractC14421e.f52594a;
                AbstractC14421e.f52594a.mo41122k(((C40569m) reference).f174703a, str);
                arrayList.remove(i13);
                if (arrayList.isEmpty()) {
                    c40572p.f174741r = j7 - this.f174742a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
