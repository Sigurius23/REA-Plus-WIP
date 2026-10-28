package ss;

import java.util.Objects;
import p000.AbstractC11266d;
import p154fs.C14728f;

/* JADX INFO: renamed from: ss.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C32946b {

    /* JADX INFO: renamed from: a */
    public final C14728f f137239a;

    /* JADX INFO: renamed from: b */
    public final int f137240b;

    /* JADX INFO: renamed from: c */
    public final String f137241c;

    /* JADX INFO: renamed from: d */
    public final String f137242d;

    public C32946b(C14728f c14728f, int i13, String str, String str2) {
        this.f137239a = c14728f;
        this.f137240b = i13;
        this.f137241c = str;
        this.f137242d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C32946b)) {
            return false;
        }
        C32946b c32946b = (C32946b) obj;
        return this.f137239a == c32946b.f137239a && this.f137240b == c32946b.f137240b && this.f137241c.equals(c32946b.f137241c) && this.f137242d.equals(c32946b.f137242d);
    }

    public final int hashCode() {
        return Objects.hash(this.f137239a, Integer.valueOf(this.f137240b), this.f137241c, this.f137242d);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("(status=");
        sb4.append(this.f137239a);
        sb4.append(", keyId=");
        sb4.append(this.f137240b);
        sb4.append(", keyType='");
        return AbstractC11266d.m30464r(sb4, this.f137241c, "', keyPrefix='", this.f137242d, "')");
    }
}
