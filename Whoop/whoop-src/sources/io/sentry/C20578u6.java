package io.sentry;

import i63.AbstractC18171j;
import io.sentry.protocol.C20499t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import p249jc.AbstractC21598x;
import p505ts.AbstractC34132o;

/* JADX INFO: renamed from: io.sentry.u6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20578u6 extends AbstractC18171j {

    /* JADX INFO: renamed from: v */
    public static final List f77061v = Collections.unmodifiableList(Arrays.asList("Content-Type", "Content-Length", "Accept"));

    /* JADX INFO: renamed from: d */
    public volatile boolean f77062d;

    /* JADX INFO: renamed from: e */
    public Double f77063e;

    /* JADX INFO: renamed from: f */
    public Double f77064f;

    /* JADX INFO: renamed from: g */
    public EnumC20550t6 f77065g;

    /* JADX INFO: renamed from: h */
    public int f77066h;

    /* JADX INFO: renamed from: i */
    public long f77067i;

    /* JADX INFO: renamed from: j */
    public long f77068j;

    /* JADX INFO: renamed from: k */
    public long f77069k;

    /* JADX INFO: renamed from: l */
    public boolean f77070l;

    /* JADX INFO: renamed from: m */
    public C20499t f77071m;

    /* JADX INFO: renamed from: n */
    public boolean f77072n;

    /* JADX INFO: renamed from: o */
    public EnumC20393j4 f77073o;

    /* JADX INFO: renamed from: p */
    public boolean f77074p;

    /* JADX INFO: renamed from: q */
    public List f77075q;

    /* JADX INFO: renamed from: r */
    public List f77076r;

    /* JADX INFO: renamed from: s */
    public boolean f77077s;

    /* JADX INFO: renamed from: t */
    public List f77078t;

    /* JADX INFO: renamed from: u */
    public List f77079u;

    @Override // i63.AbstractC18171j
    /* JADX INFO: renamed from: c */
    public final void mo52170c(boolean z4) {
        if (!z4) {
            mo52172e();
        }
        super.mo52170c(z4);
    }

    @Override // i63.AbstractC18171j
    /* JADX INFO: renamed from: d */
    public final void mo52171d(boolean z4) {
        if (!z4) {
            mo52172e();
        }
        super.mo52171d(z4);
    }

    @Override // i63.AbstractC18171j
    /* JADX INFO: renamed from: e */
    public final void mo52172e() {
        if (this.f77062d) {
            return;
        }
        this.f77062d = true;
        AbstractC21598x.m60683i("ReplayCustomMasking");
    }

    /* JADX INFO: renamed from: f */
    public final List m56694f() {
        return this.f77075q;
    }

    /* JADX INFO: renamed from: g */
    public final List m56695g() {
        return this.f77076r;
    }

    /* JADX INFO: renamed from: h */
    public final List m56696h() {
        return this.f77078t;
    }

    /* JADX INFO: renamed from: i */
    public final List m56697i() {
        return this.f77079u;
    }

    /* JADX INFO: renamed from: j */
    public final Double m56698j() {
        return this.f77064f;
    }

    /* JADX INFO: renamed from: k */
    public final Double m56699k() {
        return this.f77063e;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m56700l() {
        return this.f77074p;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m56701m() {
        return this.f77077s;
    }

    /* JADX INFO: renamed from: n */
    public final void m56702n(boolean z4) {
        this.f77074p = z4;
    }

    /* JADX INFO: renamed from: o */
    public final void m56703o(boolean z4) {
        this.f77072n = z4;
    }

    /* JADX INFO: renamed from: p */
    public final void m56704p(boolean z4) {
        this.f77077s = z4;
    }

    /* JADX INFO: renamed from: q */
    public final void m56705q(ArrayList arrayList) {
        this.f77075q = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    /* JADX INFO: renamed from: r */
    public final void m56706r(ArrayList arrayList) {
        this.f77076r = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    /* JADX INFO: renamed from: s */
    public final void m56707s(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(f77061v);
        linkedHashSet.addAll(arrayList);
        this.f77078t = Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    /* JADX INFO: renamed from: t */
    public final void m56708t(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(f77061v);
        linkedHashSet.addAll(arrayList);
        this.f77079u = Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    /* JADX INFO: renamed from: u */
    public final void m56709u(Double d3) {
        if (AbstractC34132o.m107858C(d3, true)) {
            this.f77064f = d3;
            return;
        }
        throw new IllegalArgumentException("The value " + d3 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    /* JADX INFO: renamed from: v */
    public final void m56710v(Double d3) {
        if (AbstractC34132o.m107858C(d3, true)) {
            this.f77063e = d3;
            return;
        }
        throw new IllegalArgumentException("The value " + d3 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }
}
