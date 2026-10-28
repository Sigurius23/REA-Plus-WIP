package p389p0;

import p268k0.AbstractC22086a;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;

/* JADX INFO: renamed from: p0.g0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28524g0 {

    /* JADX INFO: renamed from: a */
    public final Object f115425a;

    /* JADX INFO: renamed from: b */
    public final C28527h0 f115426b;

    /* JADX INFO: renamed from: d */
    public int f115428d;

    /* JADX INFO: renamed from: e */
    public C28524g0 f115429e;

    /* JADX INFO: renamed from: f */
    public boolean f115430f;

    /* JADX INFO: renamed from: c */
    public int f115427c = -1;

    /* JADX INFO: renamed from: g */
    public final C28633k1 f115431g = AbstractC28683x.m87272z(null);

    public C28524g0(Object obj, C28527h0 c28527h0) {
        this.f115425a = obj;
        this.f115426b = c28527h0;
    }

    /* JADX INFO: renamed from: a */
    public final C28524g0 m86827a() {
        if (this.f115430f) {
            AbstractC22086a.m63160c("Pin should not be called on an already disposed item ");
        }
        if (this.f115428d == 0) {
            this.f115426b.f115436w.add(this);
            C28524g0 c28524g0 = (C28524g0) this.f115431g.getValue();
            if (c28524g0 != null) {
                c28524g0.m86827a();
            } else {
                c28524g0 = null;
            }
            this.f115429e = c28524g0;
        }
        this.f115428d++;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m86828b() {
        if (this.f115430f) {
            return;
        }
        if (this.f115428d <= 0) {
            AbstractC22086a.m63160c("Release should only be called once");
        }
        int i13 = this.f115428d - 1;
        this.f115428d = i13;
        if (i13 == 0) {
            this.f115426b.f115436w.remove(this);
            C28524g0 c28524g0 = this.f115429e;
            if (c28524g0 != null) {
                c28524g0.m86828b();
            }
            this.f115429e = null;
        }
    }
}
