package io.sentry;

import com.google.crypto.tink.internal.C5101l0;
import com.mapbox.common.location.C5432a;
import io.sentry.protocol.C20473d0;
import io.sentry.protocol.C20481h0;
import io.sentry.protocol.C20484j;
import io.sentry.protocol.C20501v;
import io.sentry.transport.C20567q;

/* JADX INFO: renamed from: io.sentry.m0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20419m0 implements InterfaceC20572u0 {

    /* JADX INFO: renamed from: a */
    public final C20350h4 f76496a;

    public C20419m0(C20350h4 c20350h4) {
        this.f76496a = c20350h4;
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: A */
    public final InterfaceC20544t0 mo56416A() {
        return this.f76496a.f76376f;
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: B */
    public final C20501v mo56417B(Throwable th3, C20337g0 c20337g0) {
        return this.f76496a.m56527F(th3, c20337g0, null);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: C */
    public final C20501v mo56418C(C20473d0 c20473d0, C20405k7 c20405k7, C20337g0 c20337g0, C20539s3 c20539s3) {
        return this.f76496a.mo56418C(c20473d0, c20405k7, c20337g0, c20539s3);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: D */
    public final InterfaceC20308d1 mo56419D(String str) {
        return this.f76496a.mo56419D("getCurrentScopes");
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: E */
    public final C20501v mo56420E(C20484j c20484j) {
        return this.f76496a.mo56420E(c20484j);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: a */
    public final void mo56421a(boolean z4) {
        this.f76496a.mo56421a(z4);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: b */
    public final void mo56422b(String str) {
        this.f76496a.mo56422b(str);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: c */
    public final void mo56423c(String str, String str2) {
        this.f76496a.mo56423c(str, str2);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: clone */
    public final InterfaceC20572u0 m134237clone() {
        return this.f76496a.m134237clone();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: d */
    public final void mo56424d(long j7) {
        this.f76496a.mo56424d(j7);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: e */
    public final void mo56425e(C20481h0 c20481h0) {
        this.f76496a.mo56425e(c20481h0);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: f */
    public final InterfaceC20408l1 mo56426f() {
        return this.f76496a.mo56426f();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: g */
    public final boolean mo56427g() {
        return this.f76496a.mo56427g();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: h */
    public final void mo56428h(C20315e c20315e) {
        this.f76496a.mo56428h(c20315e);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: i */
    public final void mo56429i(C20315e c20315e, C20337g0 c20337g0) {
        this.f76496a.mo56429i(c20315e, c20337g0);
    }

    @Override // io.sentry.InterfaceC20308d1
    public final boolean isEnabled() {
        return this.f76496a.isEnabled();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: j */
    public final C20567q mo56430j() {
        return this.f76496a.mo56430j();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: l */
    public final C20513q6 mo56432l() {
        return this.f76496a.mo56432l();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: m */
    public final InterfaceC20432n1 mo56433m() {
        return this.f76496a.mo56433m();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: n */
    public final C20501v mo56434n(C20457p3 c20457p3) {
        return this.f76496a.mo56434n(c20457p3);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: o */
    public final void mo56435o() {
        this.f76496a.mo56435o();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: p */
    public final void mo56436p(Throwable th3, C20314d7 c20314d7, String str) {
        this.f76496a.mo56436p(th3, c20314d7, str);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: q */
    public final C20501v mo56437q(C5101l0 c5101l0, C20337g0 c20337g0) {
        return this.f76496a.mo56437q(c5101l0, c20337g0);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: r */
    public final C20501v mo56438r(Throwable th3, C20337g0 c20337g0, C5432a c5432a) {
        return this.f76496a.m56527F(th3, c20337g0, c5432a);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: s */
    public final void mo56439s(InterfaceC20320e4 interfaceC20320e4) {
        this.f76496a.mo56439s(interfaceC20320e4);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: t */
    public final C20501v mo56440t(C20542s6 c20542s6, C20337g0 c20337g0) {
        return this.f76496a.mo56440t(c20542s6, c20337g0);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: u */
    public final void mo56441u() {
        this.f76496a.mo56441u();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: v */
    public final C20501v mo56442v(C20321e5 c20321e5, C20337g0 c20337g0) {
        return this.f76496a.mo56442v(c20321e5, c20337g0);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: x */
    public final InterfaceC20432n1 mo56444x(C20426m7 c20426m7, C20438n7 c20438n7) {
        return this.f76496a.mo56444x(c20426m7, c20438n7);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: y */
    public final Boolean mo56445y() {
        return this.f76496a.mo56445y();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: z */
    public final InterfaceC20259b1 mo56446z() {
        return this.f76496a.f76371a;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m134239clone() {
        return this.f76496a.m134237clone();
    }
}
