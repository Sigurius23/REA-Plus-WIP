package p218ic;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import m83.AbstractC25265s;
import p098dt.AbstractC12350b;
import p420qc.C30207q;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ic.q0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18379q0 {

    /* JADX INFO: renamed from: a */
    public boolean f71542a;

    /* JADX INFO: renamed from: b */
    public UUID f71543b;

    /* JADX INFO: renamed from: c */
    public C30207q f71544c;

    /* JADX INFO: renamed from: d */
    public final Set f71545d;

    public AbstractC18379q0(Class workerClass) {
        AbstractC22676k.m65750j(workerClass, "workerClass");
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC22676k.m65749i(uuidRandomUUID, "randomUUID(...)");
        this.f71543b = uuidRandomUUID;
        String string = this.f71543b.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        this.f71544c = new C30207q(string, (EnumC18371m0) null, workerClass.getName(), (String) null, (C18358g) null, (C18358g) null, 0L, 0L, 0L, (C18354e) null, 0, (EnumC18346a) null, 0L, 0L, 0L, 0L, false, (EnumC18363i0) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        this.f71545d = AbstractC12350b.m34552A(workerClass.getName());
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC18379q0 m52877a(String tag) {
        AbstractC22676k.m65750j(tag, "tag");
        this.f71545d.add(tag);
        return mo52870d();
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC18381r0 m52878b() {
        AbstractC18381r0 abstractC18381r0Mo52869c = mo52869c();
        C18354e c18354e = this.f71544c.f123643j;
        boolean z4 = c18354e.m52857b() || c18354e.f71469e || c18354e.f71467c || c18354e.f71468d;
        C30207q c30207q = this.f71544c;
        if (c30207q.f123650q) {
            if (z4) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (c30207q.f123640g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        String str = c30207q.f123657x;
        if (str == null) {
            List listM125906y0 = AbstractC39414r.m125906y0(c30207q.f123636c, new String[]{"."}, 6);
            String strM125866L0 = listM125906y0.size() == 1 ? (String) listM125906y0.get(0) : (String) AbstractC25265s.m74112P0(listM125906y0);
            if (strM125866L0.length() > 127) {
                strM125866L0 = AbstractC39414r.m125866L0(127, strM125866L0);
            }
            c30207q.f123657x = strM125866L0;
        } else if (str.length() > 127) {
            this.f71544c.f123657x = AbstractC39414r.m125866L0(127, str);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC22676k.m65749i(uuidRandomUUID, "randomUUID(...)");
        this.f71543b = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        C30207q other = this.f71544c;
        AbstractC22676k.m65750j(other, "other");
        this.f71544c = new C30207q(string, other.f123635b, other.f123636c, other.f123637d, new C18358g(other.f123638e), new C18358g(other.f123639f), other.f123640g, other.f123641h, other.f123642i, new C18354e(other.f123643j), other.f123644k, other.f123645l, other.f123646m, other.f123647n, other.f123648o, other.f123649p, other.f123650q, other.f123651r, other.f123652s, other.f123654u, other.f123655v, other.f123656w, other.f123657x, other.f123658y, 524288);
        return abstractC18381r0Mo52869c;
    }

    /* JADX INFO: renamed from: c */
    public abstract AbstractC18381r0 mo52869c();

    /* JADX INFO: renamed from: d */
    public abstract AbstractC18379q0 mo52870d();

    /* JADX INFO: renamed from: e */
    public final AbstractC18379q0 m52879e(EnumC18346a enumC18346a, long j7, TimeUnit timeUnit) {
        AbstractC22676k.m65750j(timeUnit, "timeUnit");
        this.f71542a = true;
        C30207q c30207q = this.f71544c;
        c30207q.f123645l = enumC18346a;
        c30207q.m92427d(timeUnit.toMillis(j7));
        return mo52870d();
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC18379q0 m52880f(C18354e constraints) {
        AbstractC22676k.m65750j(constraints, "constraints");
        this.f71544c.f123643j = constraints;
        return mo52870d();
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC18379q0 m52881g(long j7, TimeUnit timeUnit) {
        AbstractC22676k.m65750j(timeUnit, "timeUnit");
        this.f71544c.f123640g = timeUnit.toMillis(j7);
        if (Long.MAX_VALUE - System.currentTimeMillis() > this.f71544c.f123640g) {
            return mo52870d();
        }
        throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC18379q0 m52882h(C18358g inputData) {
        AbstractC22676k.m65750j(inputData, "inputData");
        this.f71544c.f123638e = inputData;
        return mo52870d();
    }
}
