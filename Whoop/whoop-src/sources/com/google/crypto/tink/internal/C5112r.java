package com.google.crypto.tink.internal;

import java.util.Objects;
import p031b9.AbstractC2875y;
import p075ct.C11105a;
import p154fs.AbstractC14733k;
import p560vs.C36409p3;
import p560vs.EnumC36362h4;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.r */
/* JADX INFO: loaded from: classes.dex */
public final class C5112r extends AbstractC14733k {

    /* JADX INFO: renamed from: a */
    public final C5101l0 f21460a;

    public C5112r(C5101l0 c5101l0) {
        this.f21460a = c5101l0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5112r)) {
            return false;
        }
        C5101l0 c5101l0 = ((C5112r) obj).f21460a;
        C5101l0 c5101l1 = this.f21460a;
        EnumC36362h4 enumC36362h4M116533D = ((C36409p3) c5101l1.f21444y).m116533D();
        C36409p3 c36409p3 = (C36409p3) c5101l0.f21444y;
        C36409p3 c36409p4 = (C36409p3) c5101l0.f21444y;
        return enumC36362h4M116533D.equals(c36409p3.m116533D()) && ((C36409p3) c5101l1.f21444y).m116534E().equals(c36409p4.m116534E()) && ((C36409p3) c5101l1.f21444y).m116535F().equals(c36409p4.m116535F());
    }

    public final int hashCode() {
        C5101l0 c5101l0 = this.f21460a;
        return Objects.hash((C36409p3) c5101l0.f21444y, (C11105a) c5101l0.f21443x);
    }

    public final String toString() {
        String str;
        C5101l0 c5101l0 = this.f21460a;
        String strM116534E = ((C36409p3) c5101l0.f21444y).m116534E();
        int iOrdinal = ((C36409p3) c5101l0.f21444y).m116533D().ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return AbstractC2875y.m8300m("(typeUrl=", strM116534E, ", outputPrefixType=", str, ")");
    }
}
