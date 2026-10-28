package io.sentry;

import com.google.crypto.tink.internal.C5101l0;
import com.mapbox.common.location.C5432a;
import io.sentry.protocol.C20473d0;
import io.sentry.protocol.C20481h0;
import io.sentry.protocol.C20484j;
import io.sentry.protocol.C20501v;
import io.sentry.transport.C20567q;

/* JADX INFO: renamed from: io.sentry.i4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20371i4 implements InterfaceC20308d1 {

    /* JADX INFO: renamed from: a */
    public static final C20371i4 f76402a = new C20371i4();

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: A */
    public final InterfaceC20544t0 mo56416A() {
        return AbstractC20445o4.m56638b().mo56416A();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: B */
    public final C20501v mo56417B(Throwable th3, C20337g0 c20337g0) {
        return AbstractC20445o4.m56638b().mo56417B(th3, c20337g0);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: C */
    public final C20501v mo56418C(C20473d0 c20473d0, C20405k7 c20405k7, C20337g0 c20337g0, C20539s3 c20539s3) {
        return AbstractC20445o4.m56638b().mo56418C(c20473d0, c20405k7, c20337g0, c20539s3);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: D */
    public final InterfaceC20308d1 mo56419D(String str) {
        return AbstractC20445o4.m56638b().mo56419D("getCurrentScopes");
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: E */
    public final C20501v mo56420E(C20484j c20484j) {
        return AbstractC20445o4.m56638b().mo56416A().mo1858b(c20484j);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: a */
    public final void mo56421a(boolean z4) {
        AbstractC20445o4.m56637a();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: b */
    public final void mo56422b(String str) {
        AbstractC20445o4.m56644h(str);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: c */
    public final void mo56423c(String str, String str2) {
        AbstractC20445o4.m56645i(str, str2);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: d */
    public final void mo56424d(long j7) {
        AbstractC20445o4.m56638b().mo56424d(j7);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: e */
    public final void mo56425e(C20481h0 c20481h0) {
        AbstractC20445o4.m56646j(c20481h0);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: f */
    public final InterfaceC20408l1 mo56426f() {
        return AbstractC20445o4.m56638b().mo56426f();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: g */
    public final boolean mo56427g() {
        return AbstractC20445o4.m56638b().mo56427g();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: h */
    public final void mo56428h(C20315e c20315e) {
        mo56429i(c20315e, new C20337g0());
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: i */
    public final void mo56429i(C20315e c20315e, C20337g0 c20337g0) {
        AbstractC20445o4.m56638b().mo56429i(c20315e, c20337g0);
    }

    @Override // io.sentry.InterfaceC20308d1
    public final boolean isEnabled() {
        return AbstractC20445o4.m56643g();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: j */
    public final C20567q mo56430j() {
        return AbstractC20445o4.m56638b().mo56430j();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: l */
    public final C20513q6 mo56432l() {
        return AbstractC20445o4.m56638b().mo56432l();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: m */
    public final InterfaceC20432n1 mo56433m() {
        return AbstractC20445o4.m56638b().mo56433m();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: n */
    public final C20501v mo56434n(C20457p3 c20457p3) {
        return AbstractC20445o4.m56638b().mo56434n(c20457p3);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: o */
    public final void mo56435o() {
        AbstractC20445o4.m56638b().mo56435o();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: p */
    public final void mo56436p(Throwable th3, C20314d7 c20314d7, String str) {
        AbstractC20445o4.m56638b().mo56436p(th3, c20314d7, str);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: q */
    public final C20501v mo56437q(C5101l0 c5101l0, C20337g0 c20337g0) {
        return AbstractC20445o4.m56638b().mo56437q(c5101l0, c20337g0);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: r */
    public final C20501v mo56438r(Throwable th3, C20337g0 c20337g0, C5432a c5432a) {
        return AbstractC20445o4.m56638b().mo56438r(th3, c20337g0, c5432a);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: s */
    public final void mo56439s(InterfaceC20320e4 interfaceC20320e4) {
        AbstractC20445o4.m56638b().mo56439s(interfaceC20320e4);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: t */
    public final C20501v mo56440t(C20542s6 c20542s6, C20337g0 c20337g0) {
        return AbstractC20445o4.m56638b().mo56440t(c20542s6, c20337g0);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: u */
    public final void mo56441u() {
        AbstractC20445o4.m56638b().mo56441u();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: v */
    public final C20501v mo56442v(C20321e5 c20321e5, C20337g0 c20337g0) {
        return AbstractC20445o4.m56638b().mo56442v(c20321e5, c20337g0);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: w */
    public final C20501v mo56443w(C20484j c20484j) {
        return AbstractC20445o4.m56638b().mo56416A().mo1857a(c20484j);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: x */
    public final InterfaceC20432n1 mo56444x(C20426m7 c20426m7, C20438n7 c20438n7) {
        return AbstractC20445o4.m56638b().mo56444x(c20426m7, c20438n7);
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: y */
    public final Boolean mo56445y() {
        return AbstractC20445o4.m56642f();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: z */
    public final InterfaceC20259b1 mo56446z() {
        return AbstractC20445o4.m56638b().mo56446z();
    }

    @Override // io.sentry.InterfaceC20308d1
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final InterfaceC20572u0 m134237clone() {
        return AbstractC20445o4.m56638b().m134236clone();
    }
}
