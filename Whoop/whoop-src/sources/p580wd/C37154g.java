package p580wd;

import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p470rv.AbstractC31834n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wd.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C37154g extends AbstractC31834n {

    /* JADX INFO: renamed from: b */
    public final String f158908b;

    /* JADX INFO: renamed from: c */
    public final String f158909c;

    /* JADX INFO: renamed from: d */
    public final String f158910d;

    public C37154g(String str, String str2, String str3) {
        this.f158908b = str;
        this.f158909c = str2;
        this.f158910d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37154g)) {
            return false;
        }
        C37154g c37154g = (C37154g) obj;
        return AbstractC22676k.m65745e(this.f158908b, c37154g.f158908b) && AbstractC22676k.m65745e(this.f158909c, c37154g.f158909c) && AbstractC22676k.m65745e(this.f158910d, c37154g.f158910d);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f158908b.hashCode() * 31, 31, this.f158909c);
        String str = this.f158910d;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: m */
    public final String m119077m() {
        return this.f158908b;
    }

    /* JADX INFO: renamed from: n */
    public final String m119078n() {
        return this.f158910d;
    }

    /* JADX INFO: renamed from: o */
    public final String m119079o() {
        return this.f158909c;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("WebIdentityTokenRole(roleArn=");
        sb4.append(this.f158908b);
        sb4.append(", webIdentityTokenFile=");
        sb4.append(this.f158909c);
        sb4.append(", sessionName=");
        return AbstractC25012a.m73377j(sb4, this.f158910d, ')');
    }
}
