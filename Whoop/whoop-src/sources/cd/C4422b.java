package cd;

import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cd.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C4422b {

    /* JADX INFO: renamed from: a */
    public final String f17888a;

    /* JADX INFO: renamed from: b */
    public final String f17889b;

    /* JADX INFO: renamed from: c */
    public final String f17890c;

    public C4422b(C4421a c4421a) {
        String str = c4421a.f17885b;
        if (str == null) {
            throw new IllegalArgumentException("A non-null value must be provided for accessKeyId");
        }
        this.f17888a = str;
        String str2 = c4421a.f17886c;
        if (str2 == null) {
            throw new IllegalArgumentException("A non-null value must be provided for secretAccessKey");
        }
        this.f17889b = str2;
        String str3 = c4421a.f17887d;
        if (str3 == null) {
            throw new IllegalArgumentException("A non-null value must be provided for sessionToken");
        }
        this.f17890c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4422b.class != obj.getClass()) {
            return false;
        }
        C4422b c4422b = (C4422b) obj;
        return AbstractC22676k.m65745e(this.f17888a, c4422b.f17888a) && AbstractC22676k.m65745e(this.f17889b, c4422b.f17889b) && AbstractC22676k.m65745e(this.f17890c, c4422b.f17890c);
    }

    public final int hashCode() {
        return this.f17890c.hashCode() + AbstractC11266d.m30450d(this.f17888a.hashCode() * 31, 31, this.f17889b);
    }

    public final String toString() {
        return "AccessToken(*** Sensitive Data Redacted ***)";
    }
}
