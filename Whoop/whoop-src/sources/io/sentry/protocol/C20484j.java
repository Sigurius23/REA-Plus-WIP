package io.sentry.protocol;

import io.getstream.chat.android.client.api.QueryParams;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.protocol.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C20484j implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public C20501v f76694E;

    /* JADX INFO: renamed from: F */
    public String f76695F;

    /* JADX INFO: renamed from: G */
    public AbstractMap f76696G;

    /* JADX INFO: renamed from: w */
    public String f76697w;

    /* JADX INFO: renamed from: x */
    public String f76698x;

    /* JADX INFO: renamed from: y */
    public String f76699y;

    /* JADX INFO: renamed from: z */
    public C20501v f76700z;

    public C20484j(String str) {
        if (str.length() > 4096) {
            this.f76697w = str.substring(0, 4096);
        } else {
            this.f76697w = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20484j)) {
            return false;
        }
        C20484j c20484j = (C20484j) obj;
        return AbstractC29125c.m88542s(this.f76697w, c20484j.f76697w) && AbstractC29125c.m88542s(this.f76698x, c20484j.f76698x) && AbstractC29125c.m88542s(this.f76699y, c20484j.f76699y) && AbstractC29125c.m88542s(this.f76700z, c20484j.f76700z) && AbstractC29125c.m88542s(this.f76694E, c20484j.f76694E) && AbstractC29125c.m88542s(this.f76695F, c20484j.f76695F) && AbstractC29125c.m88542s(this.f76696G, c20484j.f76696G);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f76697w, this.f76698x, this.f76699y, this.f76700z, this.f76694E, this.f76695F, this.f76696G});
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("message");
        c37199o.m119222b0(this.f76697w);
        if (this.f76698x != null) {
            c37199o.m119207K("contact_email");
            c37199o.m119222b0(this.f76698x);
        }
        if (this.f76699y != null) {
            c37199o.m119207K("name");
            c37199o.m119222b0(this.f76699y);
        }
        if (this.f76700z != null) {
            c37199o.m119207K("associated_event_id");
            this.f76700z.serialize(c37199o, interfaceC20602v0);
        }
        if (this.f76694E != null) {
            c37199o.m119207K("replay_id");
            this.f76694E.serialize(c37199o, interfaceC20602v0);
        }
        if (this.f76695F != null) {
            c37199o.m119207K(QueryParams.URL);
            c37199o.m119222b0(this.f76695F);
        }
        AbstractMap abstractMap = this.f76696G;
        if (abstractMap != null) {
            for (String str : abstractMap.keySet()) {
                Object obj = this.f76696G.get(str);
                c37199o.m119207K(str);
                c37199o.m119219Y(interfaceC20602v0, obj);
            }
        }
        c37199o.m119200C();
    }

    public final String toString() {
        return "Feedback{message='" + this.f76697w + "', contactEmail='" + this.f76698x + "', name='" + this.f76699y + "', associatedEventId=" + this.f76700z + ", replayId=" + this.f76694E + ", url='" + this.f76695F + "', unknown=" + this.f76696G + '}';
    }
}
