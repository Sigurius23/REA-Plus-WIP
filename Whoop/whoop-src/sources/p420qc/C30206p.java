package p420qc;

import hc3.AbstractC17176i;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p218ic.C18354e;
import p218ic.C18358g;
import p218ic.EnumC18346a;
import p218ic.EnumC18371m0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qc.p */
/* JADX INFO: loaded from: classes.dex */
public final class C30206p {

    /* JADX INFO: renamed from: a */
    public final String f123615a;

    /* JADX INFO: renamed from: b */
    public final EnumC18371m0 f123616b;

    /* JADX INFO: renamed from: c */
    public final C18358g f123617c;

    /* JADX INFO: renamed from: d */
    public final long f123618d;

    /* JADX INFO: renamed from: e */
    public final long f123619e;

    /* JADX INFO: renamed from: f */
    public final long f123620f;

    /* JADX INFO: renamed from: g */
    public final C18354e f123621g;

    /* JADX INFO: renamed from: h */
    public final int f123622h;

    /* JADX INFO: renamed from: i */
    public final EnumC18346a f123623i;

    /* JADX INFO: renamed from: j */
    public final long f123624j;

    /* JADX INFO: renamed from: k */
    public final long f123625k;

    /* JADX INFO: renamed from: l */
    public final int f123626l;

    /* JADX INFO: renamed from: m */
    public final int f123627m;

    /* JADX INFO: renamed from: n */
    public final long f123628n;

    /* JADX INFO: renamed from: o */
    public final int f123629o;

    /* JADX INFO: renamed from: p */
    public final List f123630p;

    /* JADX INFO: renamed from: q */
    public final List f123631q;

    public C30206p(String id4, EnumC18371m0 enumC18371m0, C18358g output, long j7, long j13, long j14, C18354e c18354e, int i13, EnumC18346a enumC18346a, long j15, long j16, int i14, int i15, long j17, int i16, List list, List list2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(output, "output");
        this.f123615a = id4;
        this.f123616b = enumC18371m0;
        this.f123617c = output;
        this.f123618d = j7;
        this.f123619e = j13;
        this.f123620f = j14;
        this.f123621g = c18354e;
        this.f123622h = i13;
        this.f123623i = enumC18346a;
        this.f123624j = j15;
        this.f123625k = j16;
        this.f123626l = i14;
        this.f123627m = i15;
        this.f123628n = j17;
        this.f123629o = i16;
        this.f123630p = list;
        this.f123631q = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30206p)) {
            return false;
        }
        C30206p c30206p = (C30206p) obj;
        return AbstractC22676k.m65745e(this.f123615a, c30206p.f123615a) && this.f123616b == c30206p.f123616b && AbstractC22676k.m65745e(this.f123617c, c30206p.f123617c) && this.f123618d == c30206p.f123618d && this.f123619e == c30206p.f123619e && this.f123620f == c30206p.f123620f && AbstractC22676k.m65745e(this.f123621g, c30206p.f123621g) && this.f123622h == c30206p.f123622h && this.f123623i == c30206p.f123623i && this.f123624j == c30206p.f123624j && this.f123625k == c30206p.f123625k && this.f123626l == c30206p.f123626l && this.f123627m == c30206p.f123627m && this.f123628n == c30206p.f123628n && this.f123629o == c30206p.f123629o && AbstractC22676k.m65745e(this.f123630p, c30206p.f123630p) && AbstractC22676k.m65745e(this.f123631q, c30206p.f123631q);
    }

    public final int hashCode() {
        return this.f123631q.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.f123629o, AbstractC11266d.m30451e(AbstractC11266d.m30448b(this.f123627m, AbstractC11266d.m30448b(this.f123626l, AbstractC11266d.m30451e(AbstractC11266d.m30451e((this.f123623i.hashCode() + AbstractC11266d.m30448b(this.f123622h, (this.f123621g.hashCode() + AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e((this.f123617c.hashCode() + ((this.f123616b.hashCode() + (this.f123615a.hashCode() * 31)) * 31)) * 31, this.f123618d, 31), this.f123619e, 31), this.f123620f, 31)) * 31, 31)) * 31, this.f123624j, 31), this.f123625k, 31), 31), 31), this.f123628n, 31), 31), 31, this.f123630p);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("WorkInfoPojo(id=");
        sb4.append(this.f123615a);
        sb4.append(", state=");
        sb4.append(this.f123616b);
        sb4.append(", output=");
        sb4.append(this.f123617c);
        sb4.append(", initialDelay=");
        sb4.append(this.f123618d);
        sb4.append(", intervalDuration=");
        sb4.append(this.f123619e);
        sb4.append(", flexDuration=");
        sb4.append(this.f123620f);
        sb4.append(", constraints=");
        sb4.append(this.f123621g);
        sb4.append(", runAttemptCount=");
        sb4.append(this.f123622h);
        sb4.append(", backoffPolicy=");
        sb4.append(this.f123623i);
        sb4.append(", backoffDelayDuration=");
        sb4.append(this.f123624j);
        sb4.append(", lastEnqueueTime=");
        sb4.append(this.f123625k);
        sb4.append(", periodCount=");
        sb4.append(this.f123626l);
        sb4.append(", generation=");
        sb4.append(this.f123627m);
        sb4.append(", nextScheduleTimeOverride=");
        sb4.append(this.f123628n);
        sb4.append(", stopReason=");
        sb4.append(this.f123629o);
        sb4.append(", tags=");
        sb4.append(this.f123630p);
        sb4.append(", progress=");
        return AbstractC17176i.m48506h(sb4, this.f123631q, ')');
    }
}
