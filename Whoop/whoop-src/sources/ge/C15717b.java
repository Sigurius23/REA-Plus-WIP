package ge;

import ke.C22416a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ge.b */
/* JADX INFO: loaded from: classes.dex */
public final class C15717b {

    /* JADX INFO: renamed from: a */
    public final C15725j f59216a;

    /* JADX INFO: renamed from: b */
    public final C15716a f59217b;

    /* JADX INFO: renamed from: c */
    public final C15724i f59218c;

    /* JADX INFO: renamed from: d */
    public final C15722g f59219d;

    /* JADX INFO: renamed from: e */
    public final C15720e f59220e;

    /* JADX INFO: renamed from: f */
    public final C15721f f59221f;

    /* JADX INFO: renamed from: g */
    public final String f59222g;

    /* JADX INFO: renamed from: h */
    public final C22416a f59223h;

    public C15717b(C15725j c15725j, C15716a c15716a, C15724i c15724i, C15722g c15722g, C15720e c15720e, C15721f c15721f, String str, C22416a c22416a) {
        this.f59216a = c15725j;
        this.f59217b = c15716a;
        this.f59218c = c15724i;
        this.f59219d = c15722g;
        this.f59220e = c15720e;
        this.f59221f = c15721f;
        this.f59222g = str;
        this.f59223h = c22416a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15717b)) {
            return false;
        }
        C15717b c15717b = (C15717b) obj;
        return AbstractC22676k.m65745e(this.f59216a, c15717b.f59216a) && AbstractC22676k.m65745e(this.f59217b, c15717b.f59217b) && AbstractC22676k.m65745e(this.f59218c, c15717b.f59218c) && AbstractC22676k.m65745e(this.f59219d, c15717b.f59219d) && AbstractC22676k.m65745e(this.f59220e, c15717b.f59220e) && AbstractC22676k.m65745e(this.f59221f, c15717b.f59221f) && AbstractC22676k.m65745e(this.f59222g, c15717b.f59222g) && AbstractC22676k.m65745e(this.f59223h, c15717b.f59223h);
    }

    public final int hashCode() {
        int iHashCode = (this.f59219d.hashCode() + ((this.f59218c.hashCode() + ((this.f59217b.hashCode() + (this.f59216a.hashCode() * 31)) * 31)) * 31)) * 31;
        C15720e c15720e = this.f59220e;
        int iHashCode2 = (iHashCode + (c15720e == null ? 0 : c15720e.hashCode())) * 31;
        C15721f c15721f = this.f59221f;
        int iHashCode3 = (iHashCode2 + (c15721f == null ? 0 : c15721f.hashCode())) * 31;
        String str = this.f59222g;
        return this.f59223h.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AwsUserAgentMetadata(sdkMetadata=" + this.f59216a + ", apiMetadata=" + this.f59217b + ", osMetadata=" + this.f59218c + ", languageMetadata=" + this.f59219d + ", execEnvMetadata=" + this.f59220e + ", frameworkMetadata=" + this.f59221f + ", appId=" + this.f59222g + ", customMetadata=" + this.f59223h + ')';
    }
}
