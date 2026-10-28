package io.sentry.protocol;

import com.mapbox.maps.MapboxMap;
import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20487k0 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public Double f76708E;

    /* JADX INFO: renamed from: F */
    public Double f76709F;

    /* JADX INFO: renamed from: G */
    public Double f76710G;

    /* JADX INFO: renamed from: H */
    public Double f76711H;

    /* JADX INFO: renamed from: I */
    public String f76712I;

    /* JADX INFO: renamed from: J */
    public Double f76713J;

    /* JADX INFO: renamed from: K */
    public List f76714K;

    /* JADX INFO: renamed from: L */
    public HashMap f76715L;

    /* JADX INFO: renamed from: w */
    public String f76716w;

    /* JADX INFO: renamed from: x */
    public String f76717x;

    /* JADX INFO: renamed from: y */
    public String f76718y;

    /* JADX INFO: renamed from: z */
    public String f76719z;

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76716w != null) {
            c37199o.m119207K("rendering_system");
            c37199o.m119222b0(this.f76716w);
        }
        if (this.f76717x != null) {
            c37199o.m119207K("type");
            c37199o.m119222b0(this.f76717x);
        }
        if (this.f76718y != null) {
            c37199o.m119207K("identifier");
            c37199o.m119222b0(this.f76718y);
        }
        if (this.f76719z != null) {
            c37199o.m119207K("tag");
            c37199o.m119222b0(this.f76719z);
        }
        if (this.f76708E != null) {
            c37199o.m119207K("width");
            c37199o.m119221a0(this.f76708E);
        }
        if (this.f76709F != null) {
            c37199o.m119207K("height");
            c37199o.m119221a0(this.f76709F);
        }
        if (this.f76710G != null) {
            c37199o.m119207K("x");
            c37199o.m119221a0(this.f76710G);
        }
        if (this.f76711H != null) {
            c37199o.m119207K("y");
            c37199o.m119221a0(this.f76711H);
        }
        if (this.f76712I != null) {
            c37199o.m119207K("visibility");
            c37199o.m119222b0(this.f76712I);
        }
        if (this.f76713J != null) {
            c37199o.m119207K("alpha");
            c37199o.m119221a0(this.f76713J);
        }
        List list = this.f76714K;
        if (list != null && !list.isEmpty()) {
            c37199o.m119207K(MapboxMap.QFE_CHILDREN);
            c37199o.m119219Y(interfaceC20602v0, this.f76714K);
        }
        HashMap map = this.f76715L;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76715L, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
