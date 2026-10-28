package p313lz;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lz.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C24806c {

    /* JADX INFO: renamed from: a */
    public final String f97123a;

    /* JADX INFO: renamed from: b */
    public final String f97124b;

    /* JADX INFO: renamed from: c */
    public final String f97125c;

    public C24806c(String str, String str2, String str3) {
        this.f97123a = str;
        this.f97124b = str2;
        this.f97125c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24806c)) {
            return false;
        }
        C24806c c24806c = (C24806c) obj;
        return AbstractC22676k.m65745e(this.f97123a, c24806c.f97123a) && AbstractC22676k.m65745e(this.f97124b, c24806c.f97124b) && AbstractC22676k.m65745e(this.f97125c, c24806c.f97125c);
    }

    public final int hashCode() {
        return this.f97125c.hashCode() + AbstractC11266d.m30450d(this.f97123a.hashCode() * 31, 31, this.f97124b);
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f97125c, ")", AbstractC11895b.m32001t("State(successUrl=", this.f97123a, ", cancelUrl=", this.f97124b, ", hostedAuthUrl="));
    }
}
