package io.sentry;

import ih0.AbstractC18489d0;
import io.sentry.protocol.C20501v;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import p249jc.AbstractC21598x;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.s6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20542s6 extends AbstractC20519r4 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: P */
    public File f76986P;

    /* JADX INFO: renamed from: T */
    public int f76990T;

    /* JADX INFO: renamed from: V */
    public Date f76992V;

    /* JADX INFO: renamed from: Z */
    public HashMap f76996Z;

    /* JADX INFO: renamed from: S */
    public C20501v f76989S = new C20501v();

    /* JADX INFO: renamed from: Q */
    public String f76987Q = "replay_event";

    /* JADX INFO: renamed from: R */
    public EnumC20521r6 f76988R = EnumC20521r6.SESSION;

    /* JADX INFO: renamed from: X */
    public List f76994X = new ArrayList();

    /* JADX INFO: renamed from: Y */
    public List f76995Y = new ArrayList();

    /* JADX INFO: renamed from: W */
    public List f76993W = new ArrayList();

    /* JADX INFO: renamed from: U */
    public Date f76991U = AbstractC21598x.m60659O();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20542s6.class == obj.getClass()) {
            C20542s6 c20542s6 = (C20542s6) obj;
            if (this.f76990T == c20542s6.f76990T && AbstractC29125c.m88542s(this.f76987Q, c20542s6.f76987Q) && this.f76988R == c20542s6.f76988R && AbstractC29125c.m88542s(this.f76989S, c20542s6.f76989S) && AbstractC29125c.m88542s(this.f76993W, c20542s6.f76993W) && AbstractC29125c.m88542s(this.f76994X, c20542s6.f76994X) && AbstractC29125c.m88542s(this.f76995Y, c20542s6.f76995Y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f76987Q, this.f76988R, this.f76989S, Integer.valueOf(this.f76990T), this.f76993W, this.f76994X, this.f76995Y});
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("type");
        c37199o.m119222b0(this.f76987Q);
        c37199o.m119207K("replay_type");
        c37199o.m119219Y(interfaceC20602v0, this.f76988R);
        c37199o.m119207K("segment_id");
        c37199o.m119218X(this.f76990T);
        c37199o.m119207K("timestamp");
        c37199o.m119219Y(interfaceC20602v0, this.f76991U);
        if (this.f76989S != null) {
            c37199o.m119207K("replay_id");
            c37199o.m119219Y(interfaceC20602v0, this.f76989S);
        }
        if (this.f76992V != null) {
            c37199o.m119207K("replay_start_timestamp");
            c37199o.m119219Y(interfaceC20602v0, this.f76992V);
        }
        if (this.f76993W != null) {
            c37199o.m119207K("urls");
            c37199o.m119219Y(interfaceC20602v0, this.f76993W);
        }
        if (this.f76994X != null) {
            c37199o.m119207K("error_ids");
            c37199o.m119219Y(interfaceC20602v0, this.f76994X);
        }
        if (this.f76995Y != null) {
            c37199o.m119207K("trace_ids");
            c37199o.m119219Y(interfaceC20602v0, this.f76995Y);
        }
        AbstractC29125c.m88512U(this, c37199o, interfaceC20602v0);
        HashMap map = this.f76996Z;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76996Z, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
