package p580wd;

import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p470rv.AbstractC31834n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wd.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C37153f extends AbstractC31834n {

    /* JADX INFO: renamed from: b */
    public final String f158903b;

    /* JADX INFO: renamed from: c */
    public final String f158904c;

    /* JADX INFO: renamed from: d */
    public final String f158905d;

    /* JADX INFO: renamed from: e */
    public final String f158906e;

    /* JADX INFO: renamed from: f */
    public final String f158907f;

    public C37153f(String str, String str2, String str3, String str4, String str5) {
        this.f158903b = str;
        this.f158904c = str2;
        this.f158905d = str3;
        this.f158906e = str4;
        this.f158907f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37153f)) {
            return false;
        }
        C37153f c37153f = (C37153f) obj;
        return AbstractC22676k.m65745e(this.f158903b, c37153f.f158903b) && AbstractC22676k.m65745e(this.f158904c, c37153f.f158904c) && AbstractC22676k.m65745e(this.f158905d, c37153f.f158905d) && AbstractC22676k.m65745e(this.f158906e, c37153f.f158906e) && AbstractC22676k.m65745e(this.f158907f, c37153f.f158907f);
    }

    public final int hashCode() {
        return this.f158907f.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f158903b.hashCode() * 31, 31, this.f158904c), 31, this.f158905d), 31, this.f158906e);
    }

    /* JADX INFO: renamed from: m */
    public final String m119072m() {
        return this.f158906e;
    }

    /* JADX INFO: renamed from: n */
    public final String m119073n() {
        return this.f158905d;
    }

    /* JADX INFO: renamed from: o */
    public final String m119074o() {
        return this.f158907f;
    }

    /* JADX INFO: renamed from: p */
    public final String m119075p() {
        return this.f158903b;
    }

    /* JADX INFO: renamed from: q */
    public final String m119076q() {
        return this.f158904c;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SsoSession(ssoSessionName=");
        sb4.append(this.f158903b);
        sb4.append(", ssoStartUrl=");
        sb4.append(this.f158904c);
        sb4.append(", ssoRegion=");
        sb4.append(this.f158905d);
        sb4.append(", ssoAccountId=");
        sb4.append(this.f158906e);
        sb4.append(", ssoRoleName=");
        return AbstractC25012a.m73377j(sb4, this.f158907f, ')');
    }
}
