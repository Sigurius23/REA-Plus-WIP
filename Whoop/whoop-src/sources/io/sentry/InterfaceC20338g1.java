package io.sentry;

import com.google.crypto.tink.internal.C5101l0;
import io.sentry.protocol.C20473d0;
import io.sentry.protocol.C20484j;
import io.sentry.protocol.C20501v;
import io.sentry.transport.C20567q;

/* JADX INFO: renamed from: io.sentry.g1 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC20338g1 {
    /* JADX INFO: renamed from: a */
    void mo13940a(boolean z4);

    /* JADX INFO: renamed from: c */
    C20501v mo13942c(C20542s6 c20542s6, InterfaceC20259b1 interfaceC20259b1, C20337g0 c20337g0);

    /* JADX INFO: renamed from: d */
    void mo13943d(long j7);

    /* JADX INFO: renamed from: f */
    C20501v mo13944f(C20473d0 c20473d0, C20405k7 c20405k7, InterfaceC20259b1 interfaceC20259b1, C20337g0 c20337g0, C20539s3 c20539s3);

    /* JADX INFO: renamed from: g */
    default boolean mo13945g() {
        return true;
    }

    /* JADX INFO: renamed from: h */
    C20501v mo13946h(C20484j c20484j, InterfaceC20259b1 interfaceC20259b1);

    /* JADX INFO: renamed from: i */
    void mo13947i(C20265b7 c20265b7, C20337g0 c20337g0);

    boolean isEnabled();

    /* JADX INFO: renamed from: j */
    C20567q mo13948j();

    /* JADX INFO: renamed from: l */
    C20501v mo13949l(C20321e5 c20321e5, InterfaceC20259b1 interfaceC20259b1, C20337g0 c20337g0);

    /* JADX INFO: renamed from: n */
    C20501v mo13951n(C20457p3 c20457p3);

    /* JADX INFO: renamed from: q */
    C20501v mo13952q(C5101l0 c5101l0, C20337g0 c20337g0);
}
