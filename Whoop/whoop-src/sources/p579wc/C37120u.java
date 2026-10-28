package p579wc;

import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p463rj.AbstractC31479j;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.C34913b;

/* JADX INFO: renamed from: wc.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C37120u extends AbstractC31479j {

    /* JADX INFO: renamed from: c */
    public final String f158803c;

    /* JADX INFO: renamed from: d */
    public final String f158804d;

    /* JADX INFO: renamed from: e */
    public final String f158805e;

    /* JADX INFO: renamed from: f */
    public final C34913b f158806f;

    /* JADX INFO: renamed from: g */
    public final String f158807g;

    public C37120u(String str, String str2, String str3, C34913b c34913b, String str4) {
        this.f158803c = str;
        this.f158804d = str2;
        this.f158805e = str3;
        this.f158806f = c34913b;
        this.f158807g = str4;
    }

    /* JADX INFO: renamed from: B */
    public final String m119035B() {
        return this.f158803c;
    }

    /* JADX INFO: renamed from: C */
    public final C34913b m119036C() {
        return this.f158806f;
    }

    /* JADX INFO: renamed from: D */
    public final String m119037D() {
        return this.f158804d;
    }

    /* JADX INFO: renamed from: E */
    public final String m119038E() {
        return this.f158805e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37120u)) {
            return false;
        }
        C37120u c37120u = (C37120u) obj;
        return AbstractC22676k.m65745e(this.f158803c, c37120u.f158803c) && AbstractC22676k.m65745e(this.f158804d, c37120u.f158804d) && AbstractC22676k.m65745e(this.f158805e, c37120u.f158805e) && AbstractC22676k.m65745e(this.f158806f, c37120u.f158806f) && AbstractC22676k.m65745e(this.f158807g, c37120u.f158807g);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f158803c.hashCode() * 31, 31, this.f158804d), 31, this.f158805e);
        C34913b c34913b = this.f158806f;
        int iHashCode = (iM30450d + (c34913b == null ? 0 : c34913b.f147018w.hashCode())) * 31;
        String str = this.f158807g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SessionCredentials(accessKeyId=");
        sb4.append(this.f158803c);
        sb4.append(", secretAccessKey=");
        sb4.append(this.f158804d);
        sb4.append(", sessionToken=");
        sb4.append(this.f158805e);
        sb4.append(", expiration=");
        sb4.append(this.f158806f);
        sb4.append(", accountId=");
        return AbstractC25012a.m73377j(sb4, this.f158807g, ')');
    }
}
