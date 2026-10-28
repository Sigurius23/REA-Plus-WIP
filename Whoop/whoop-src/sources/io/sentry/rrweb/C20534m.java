package io.sentry.rrweb;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import p088dc.AbstractC11894a;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.rrweb.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C20534m extends AbstractC20523b implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public long f76935E;

    /* JADX INFO: renamed from: F */
    public long f76936F;

    /* JADX INFO: renamed from: G */
    public String f76937G;

    /* JADX INFO: renamed from: H */
    public String f76938H;

    /* JADX INFO: renamed from: I */
    public int f76939I;

    /* JADX INFO: renamed from: J */
    public int f76940J;

    /* JADX INFO: renamed from: K */
    public int f76941K;

    /* JADX INFO: renamed from: L */
    public String f76942L;

    /* JADX INFO: renamed from: M */
    public int f76943M;

    /* JADX INFO: renamed from: N */
    public int f76944N;

    /* JADX INFO: renamed from: O */
    public int f76945O;

    /* JADX INFO: renamed from: P */
    public HashMap f76946P;

    /* JADX INFO: renamed from: Q */
    public ConcurrentHashMap f76947Q;

    /* JADX INFO: renamed from: R */
    public ConcurrentHashMap f76948R;

    /* JADX INFO: renamed from: y */
    public String f76949y;

    /* JADX INFO: renamed from: z */
    public int f76950z;

    public C20534m() {
        super(EnumC20524c.Custom);
        this.f76937G = "h264";
        this.f76938H = MimeType.MIME_TYPE_MP4;
        this.f76942L = "constant";
        this.f76949y = "video";
    }

    @Override // io.sentry.rrweb.AbstractC20523b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20534m.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C20534m c20534m = (C20534m) obj;
        return this.f76950z == c20534m.f76950z && this.f76935E == c20534m.f76935E && this.f76936F == c20534m.f76936F && this.f76939I == c20534m.f76939I && this.f76940J == c20534m.f76940J && this.f76941K == c20534m.f76941K && this.f76943M == c20534m.f76943M && this.f76944N == c20534m.f76944N && this.f76945O == c20534m.f76945O && AbstractC29125c.m88542s(this.f76949y, c20534m.f76949y) && AbstractC29125c.m88542s(this.f76937G, c20534m.f76937G) && AbstractC29125c.m88542s(this.f76938H, c20534m.f76938H) && AbstractC29125c.m88542s(this.f76942L, c20534m.f76942L);
    }

    @Override // io.sentry.rrweb.AbstractC20523b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f76949y, Integer.valueOf(this.f76950z), Long.valueOf(this.f76935E), Long.valueOf(this.f76936F), this.f76937G, this.f76938H, Integer.valueOf(this.f76939I), Integer.valueOf(this.f76940J), Integer.valueOf(this.f76941K), this.f76942L, Integer.valueOf(this.f76943M), Integer.valueOf(this.f76944N), Integer.valueOf(this.f76945O)});
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        AbstractC11894a.m31946N(this, c37199o, interfaceC20602v0);
        c37199o.m119207K("data");
        c37199o.m119227i();
        c37199o.m119207K("tag");
        c37199o.m119222b0(this.f76949y);
        c37199o.m119207K("payload");
        c37199o.m119227i();
        c37199o.m119207K("segmentId");
        c37199o.m119218X(this.f76950z);
        c37199o.m119207K("size");
        c37199o.m119218X(this.f76935E);
        c37199o.m119207K(AttachmentExtensionsKt.EXTRA_DURATION);
        c37199o.m119218X(this.f76936F);
        c37199o.m119207K("encoding");
        c37199o.m119222b0(this.f76937G);
        c37199o.m119207K("container");
        c37199o.m119222b0(this.f76938H);
        c37199o.m119207K("height");
        c37199o.m119218X(this.f76939I);
        c37199o.m119207K("width");
        c37199o.m119218X(this.f76940J);
        c37199o.m119207K("frameCount");
        c37199o.m119218X(this.f76941K);
        c37199o.m119207K("frameRate");
        c37199o.m119218X(this.f76943M);
        c37199o.m119207K("frameRateType");
        c37199o.m119222b0(this.f76942L);
        c37199o.m119207K("left");
        c37199o.m119218X(this.f76944N);
        c37199o.m119207K("top");
        c37199o.m119218X(this.f76945O);
        ConcurrentHashMap concurrentHashMap = this.f76947Q;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76947Q, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
        ConcurrentHashMap concurrentHashMap2 = this.f76948R;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                AbstractC18489d0.m53355A(this.f76948R, str2, c37199o, str2, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
        HashMap map = this.f76946P;
        if (map != null) {
            for (String str3 : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76946P, str3, c37199o, str3, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
