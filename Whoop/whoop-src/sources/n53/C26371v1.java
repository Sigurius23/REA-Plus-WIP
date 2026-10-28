package n53;

import bc3.C3058t;
import p000.AbstractC11266d;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: n53.v1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26371v1 {

    /* JADX INFO: renamed from: a */
    public final Function1 f104797a;

    /* JADX INFO: renamed from: b */
    public final C3058t f104798b;

    /* JADX INFO: renamed from: c */
    public final int f104799c;

    /* JADX INFO: renamed from: d */
    public final String f104800d;

    public C26371v1(Function1 block, C3058t c3058t, int i13, String jobName) {
        AbstractC22676k.m65750j(block, "block");
        AbstractC22676k.m65750j(jobName, "jobName");
        this.f104797a = block;
        this.f104798b = c3058t;
        this.f104799c = i13;
        this.f104800d = jobName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26371v1)) {
            return false;
        }
        C26371v1 c26371v1 = (C26371v1) obj;
        return AbstractC22676k.m65745e(this.f104797a, c26371v1.f104797a) && this.f104798b.equals(c26371v1.f104798b) && this.f104799c == c26371v1.f104799c && AbstractC22676k.m65745e(this.f104800d, c26371v1.f104800d);
    }

    public final int hashCode() {
        return this.f104800d.hashCode() + AbstractC11266d.m30448b(this.f104799c, (this.f104798b.hashCode() + (this.f104797a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("JobItem(block=");
        sb4.append(this.f104797a);
        sb4.append(", reply=");
        sb4.append(this.f104798b);
        sb4.append(", jobId=");
        return AbstractC38963t7.m124376f(this.f104799c, ", jobName=", this.f104800d, ")", sb4);
    }
}
