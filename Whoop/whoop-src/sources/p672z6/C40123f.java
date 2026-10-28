package p672z6;

import p008a7.C0515f;
import p636y3.C39183o;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z6.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C40123f {

    /* JADX INFO: renamed from: a */
    public final C0515f f173170a;

    /* JADX INFO: renamed from: b */
    public final C39183o f173171b;

    /* JADX INFO: renamed from: c */
    public final C40119b f173172c;

    /* JADX INFO: renamed from: d */
    public final C40120c f173173d;

    public C40123f(C0515f c0515f, C39183o c39183o, C40119b c40119b, C40120c c40120c, int i13) {
        c39183o = (i13 & 2) != 0 ? null : c39183o;
        c40119b = (i13 & 4) != 0 ? null : c40119b;
        c40120c = (i13 & 16) != 0 ? null : c40120c;
        this.f173170a = c0515f;
        this.f173171b = c39183o;
        this.f173172c = c40119b;
        this.f173173d = c40120c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40123f)) {
            return false;
        }
        C40123f c40123f = (C40123f) obj;
        return AbstractC22676k.m65745e(this.f173170a, c40123f.f173170a) && AbstractC22676k.m65745e(this.f173171b, c40123f.f173171b) && AbstractC22676k.m65745e(this.f173172c, c40123f.f173172c) && AbstractC22676k.m65745e(this.f173173d, c40123f.f173173d);
    }

    public final int hashCode() {
        int iHashCode = this.f173170a.hashCode() * 31;
        C39183o c39183o = this.f173171b;
        int iHashCode2 = (iHashCode + (c39183o != null ? Long.hashCode(c39183o.f168429a) : 0)) * 31;
        C40119b c40119b = this.f173172c;
        int iHashCode3 = (iHashCode2 + (c40119b != null ? Integer.hashCode(c40119b.f173166a) : 0)) * 29791;
        C40120c c40120c = this.f173173d;
        return (iHashCode3 + (c40120c != null ? Integer.hashCode(c40120c.f173167a) : 0)) * 31;
    }

    public final String toString() {
        return "TextStyle(color=" + this.f173170a + ", fontSize=" + this.f173171b + ", fontWeight=" + this.f173172c + ", fontStyle=null, textDecoration=null, textAlign=" + this.f173173d + ", fontFamily=null)";
    }
}
