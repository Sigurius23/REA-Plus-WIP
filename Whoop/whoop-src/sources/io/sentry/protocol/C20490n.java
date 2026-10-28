package io.sentry.protocol;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C20490n implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public AbstractMap f76733E;

    /* JADX INFO: renamed from: F */
    public ConcurrentHashMap f76734F;

    /* JADX INFO: renamed from: G */
    public Boolean f76735G;

    /* JADX INFO: renamed from: H */
    public Integer f76736H;

    /* JADX INFO: renamed from: I */
    public Integer f76737I;

    /* JADX INFO: renamed from: J */
    public Boolean f76738J;

    /* JADX INFO: renamed from: K */
    public HashMap f76739K;

    /* JADX INFO: renamed from: w */
    public String f76740w;

    /* JADX INFO: renamed from: x */
    public String f76741x;

    /* JADX INFO: renamed from: y */
    public String f76742y;

    /* JADX INFO: renamed from: z */
    public Boolean f76743z;

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76740w != null) {
            c37199o.m119207K("type");
            c37199o.m119222b0(this.f76740w);
        }
        if (this.f76741x != null) {
            c37199o.m119207K("description");
            c37199o.m119222b0(this.f76741x);
        }
        if (this.f76742y != null) {
            c37199o.m119207K("help_link");
            c37199o.m119222b0(this.f76742y);
        }
        if (this.f76743z != null) {
            c37199o.m119207K("handled");
            c37199o.m119220Z(this.f76743z);
        }
        if (this.f76733E != null) {
            c37199o.m119207K("meta");
            c37199o.m119219Y(interfaceC20602v0, this.f76733E);
        }
        if (this.f76734F != null) {
            c37199o.m119207K("data");
            c37199o.m119219Y(interfaceC20602v0, this.f76734F);
        }
        if (this.f76735G != null) {
            c37199o.m119207K("synthetic");
            c37199o.m119220Z(this.f76735G);
        }
        if (this.f76736H != null) {
            c37199o.m119207K("exception_id");
            c37199o.m119219Y(interfaceC20602v0, this.f76736H);
        }
        if (this.f76737I != null) {
            c37199o.m119207K("parent_id");
            c37199o.m119219Y(interfaceC20602v0, this.f76737I);
        }
        if (this.f76738J != null) {
            c37199o.m119207K("is_exception_group");
            c37199o.m119220Z(this.f76738J);
        }
        HashMap map = this.f76739K;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76739K, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
