package p580wd;

import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p470rv.AbstractC31834n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wd.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C37149b extends AbstractC31834n {

    /* JADX INFO: renamed from: b */
    public final String f158896b;

    /* JADX INFO: renamed from: c */
    public final String f158897c;

    /* JADX INFO: renamed from: d */
    public final String f158898d;

    /* JADX INFO: renamed from: e */
    public final String f158899e;

    public C37149b(String str, String str2, String str3, String str4) {
        this.f158896b = str;
        this.f158897c = str2;
        this.f158898d = str3;
        this.f158899e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37149b)) {
            return false;
        }
        C37149b c37149b = (C37149b) obj;
        return AbstractC22676k.m65745e(this.f158896b, c37149b.f158896b) && AbstractC22676k.m65745e(this.f158897c, c37149b.f158897c) && AbstractC22676k.m65745e(this.f158898d, c37149b.f158898d) && AbstractC22676k.m65745e(this.f158899e, c37149b.f158899e);
    }

    public final int hashCode() {
        return this.f158899e.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f158896b.hashCode() * 31, 31, this.f158897c), 31, this.f158898d);
    }

    /* JADX INFO: renamed from: m */
    public final String m119065m() {
        return this.f158898d;
    }

    /* JADX INFO: renamed from: n */
    public final String m119066n() {
        return this.f158897c;
    }

    /* JADX INFO: renamed from: o */
    public final String m119067o() {
        return this.f158899e;
    }

    /* JADX INFO: renamed from: p */
    public final String m119068p() {
        return this.f158896b;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("LegacySso(ssoStartUrl=");
        sb4.append(this.f158896b);
        sb4.append(", ssoRegion=");
        sb4.append(this.f158897c);
        sb4.append(", ssoAccountId=");
        sb4.append(this.f158898d);
        sb4.append(", ssoRoleName=");
        return AbstractC25012a.m73377j(sb4, this.f158899e, ')');
    }
}
