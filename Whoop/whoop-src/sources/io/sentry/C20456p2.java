package io.sentry;

import com.google.crypto.tink.internal.C5101l0;
import io.sentry.android.replay.C20200d;
import io.sentry.protocol.C20501v;
import io.sentry.transport.C20553c;
import io.sentry.transport.C20567q;
import io.sentry.transport.InterfaceC20557g;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.p2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20456p2 implements InterfaceC20515r0, InterfaceC20605v3, InterfaceC20442o1, InterfaceC20455p1 {

    /* JADX INFO: renamed from: w */
    public static final C20456p2 f76553w = new C20456p2();

    /* JADX INFO: renamed from: x */
    public static final C20456p2 f76554x = new C20456p2();

    /* JADX INFO: renamed from: y */
    public static final C20456p2 f76555y = new C20456p2();

    @Override // io.sentry.InterfaceC20605v3
    /* JADX INFO: renamed from: J */
    public InterfaceC20575u3 getF75797N() {
        return C20604v2.f77114a;
    }

    @Override // io.sentry.InterfaceC20442o1
    /* JADX INFO: renamed from: a */
    public void mo56065a(InterfaceC20432n1 interfaceC20432n1) {
    }

    @Override // io.sentry.InterfaceC20455p1
    /* JADX INFO: renamed from: b */
    public InterfaceC20557g mo56526b(C20513q6 c20513q6, C5101l0 c5101l0) {
        return new C20553c(c20513q6, new C20567q(c20513q6), c20513q6.getTransportGate(), c5101l0);
    }

    @Override // io.sentry.InterfaceC20442o1
    /* JADX INFO: renamed from: c */
    public C20539s3 mo56067c(C20645z6 c20645z6, List list, C20513q6 c20513q6) {
        return null;
    }

    @Override // io.sentry.InterfaceC20442o1
    public void close() {
    }

    @Override // io.sentry.InterfaceC20605v3
    /* JADX INFO: renamed from: h */
    public void mo56097h(C20200d c20200d) {
    }

    @Override // io.sentry.InterfaceC20605v3
    /* JADX INFO: renamed from: i */
    public void mo56098i(Boolean bool) {
    }

    @Override // io.sentry.InterfaceC20442o1
    public boolean isRunning() {
        return false;
    }

    @Override // io.sentry.InterfaceC20605v3
    public void pause() {
    }

    @Override // io.sentry.InterfaceC20605v3
    public void resume() {
    }

    @Override // io.sentry.InterfaceC20605v3
    /* JADX INFO: renamed from: s */
    public C20501v mo56101s() {
        return C20501v.f76802x;
    }

    @Override // io.sentry.InterfaceC20442o1
    public void start() {
    }

    @Override // io.sentry.InterfaceC20605v3
    public void stop() {
    }

    @Override // io.sentry.InterfaceC20605v3
    /* JADX INFO: renamed from: x */
    public void mo56102x() {
    }
}
