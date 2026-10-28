package io.sentry;

import com.google.crypto.tink.internal.C5101l0;
import com.mapbox.common.location.C5432a;
import io.sentry.protocol.C20473d0;
import io.sentry.protocol.C20481h0;
import io.sentry.protocol.C20484j;
import io.sentry.protocol.C20501v;
import io.sentry.transport.C20567q;

/* JADX INFO: renamed from: io.sentry.d1 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC20308d1 {
    /* JADX INFO: renamed from: A */
    InterfaceC20544t0 mo56416A();

    /* JADX INFO: renamed from: B */
    C20501v mo56417B(Throwable th3, C20337g0 c20337g0);

    /* JADX INFO: renamed from: C */
    C20501v mo56418C(C20473d0 c20473d0, C20405k7 c20405k7, C20337g0 c20337g0, C20539s3 c20539s3);

    /* JADX INFO: renamed from: D */
    InterfaceC20308d1 mo56419D(String str);

    /* JADX INFO: renamed from: E */
    C20501v mo56420E(C20484j c20484j);

    /* JADX INFO: renamed from: a */
    void mo56421a(boolean z4);

    /* JADX INFO: renamed from: b */
    void mo56422b(String str);

    /* JADX INFO: renamed from: c */
    void mo56423c(String str, String str2);

    InterfaceC20572u0 clone();

    /* JADX INFO: renamed from: d */
    void mo56424d(long j7);

    /* JADX INFO: renamed from: e */
    void mo56425e(C20481h0 c20481h0);

    /* JADX INFO: renamed from: f */
    InterfaceC20408l1 mo56426f();

    /* JADX INFO: renamed from: g */
    boolean mo56427g();

    /* JADX INFO: renamed from: h */
    void mo56428h(C20315e c20315e);

    /* JADX INFO: renamed from: i */
    void mo56429i(C20315e c20315e, C20337g0 c20337g0);

    boolean isEnabled();

    /* JADX INFO: renamed from: j */
    C20567q mo56430j();

    /* JADX INFO: renamed from: k */
    default boolean mo56431k() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    C20513q6 mo56432l();

    /* JADX INFO: renamed from: m */
    InterfaceC20432n1 mo56433m();

    /* JADX INFO: renamed from: n */
    C20501v mo56434n(C20457p3 c20457p3);

    /* JADX INFO: renamed from: o */
    void mo56435o();

    /* JADX INFO: renamed from: p */
    void mo56436p(Throwable th3, C20314d7 c20314d7, String str);

    /* JADX INFO: renamed from: q */
    C20501v mo56437q(C5101l0 c5101l0, C20337g0 c20337g0);

    /* JADX INFO: renamed from: r */
    C20501v mo56438r(Throwable th3, C20337g0 c20337g0, C5432a c5432a);

    /* JADX INFO: renamed from: s */
    void mo56439s(InterfaceC20320e4 interfaceC20320e4);

    /* JADX INFO: renamed from: t */
    C20501v mo56440t(C20542s6 c20542s6, C20337g0 c20337g0);

    /* JADX INFO: renamed from: u */
    void mo56441u();

    /* JADX INFO: renamed from: v */
    C20501v mo56442v(C20321e5 c20321e5, C20337g0 c20337g0);

    /* JADX INFO: renamed from: w */
    default C20501v mo56443w(C20484j c20484j) {
        return mo56420E(c20484j);
    }

    /* JADX INFO: renamed from: x */
    InterfaceC20432n1 mo56444x(C20426m7 c20426m7, C20438n7 c20438n7);

    /* JADX INFO: renamed from: y */
    Boolean mo56445y();

    /* JADX INFO: renamed from: z */
    InterfaceC20259b1 mo56446z();
}
