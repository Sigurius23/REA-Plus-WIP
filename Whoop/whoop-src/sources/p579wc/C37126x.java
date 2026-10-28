package p579wc;

import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.C34913b;

/* JADX INFO: renamed from: wc.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C37126x {

    /* JADX INFO: renamed from: a */
    public final String f158829a;

    /* JADX INFO: renamed from: b */
    public final String f158830b;

    /* JADX INFO: renamed from: c */
    public final String f158831c;

    /* JADX INFO: renamed from: d */
    public final String f158832d;

    /* JADX INFO: renamed from: e */
    public final String f158833e;

    /* JADX INFO: renamed from: f */
    public final C34913b f158834f;

    /* JADX INFO: renamed from: g */
    public final String f158835g;

    /* JADX INFO: renamed from: h */
    public final String f158836h;

    /* JADX INFO: renamed from: i */
    public final String f158837i;

    /* JADX INFO: renamed from: j */
    public final String f158838j;

    public C37126x(String str, String str2, String str3, String str4, String str5, C34913b c34913b, String str6, String str7, String str8, String str9) {
        this.f158829a = str;
        this.f158830b = str2;
        this.f158831c = str3;
        this.f158832d = str4;
        this.f158833e = str5;
        this.f158834f = c34913b;
        this.f158835g = str6;
        this.f158836h = str7;
        this.f158837i = str8;
        this.f158838j = str9;
    }

    /* JADX INFO: renamed from: a */
    public static C37126x m119039a(C37126x c37126x, String accessKeyId, String secretAccessKey, String sessionToken, C34913b c34913b, String refreshToken) {
        String str = c37126x.f158832d;
        String str2 = c37126x.f158833e;
        String str3 = c37126x.f158836h;
        String str4 = c37126x.f158837i;
        String str5 = c37126x.f158838j;
        c37126x.getClass();
        AbstractC22676k.m65750j(accessKeyId, "accessKeyId");
        AbstractC22676k.m65750j(secretAccessKey, "secretAccessKey");
        AbstractC22676k.m65750j(sessionToken, "sessionToken");
        AbstractC22676k.m65750j(refreshToken, "refreshToken");
        return new C37126x(accessKeyId, secretAccessKey, sessionToken, str, str2, c34913b, refreshToken, str3, str4, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37126x)) {
            return false;
        }
        C37126x c37126x = (C37126x) obj;
        return AbstractC22676k.m65745e(this.f158829a, c37126x.f158829a) && AbstractC22676k.m65745e(this.f158830b, c37126x.f158830b) && AbstractC22676k.m65745e(this.f158831c, c37126x.f158831c) && AbstractC22676k.m65745e(this.f158832d, c37126x.f158832d) && AbstractC22676k.m65745e(this.f158833e, c37126x.f158833e) && AbstractC22676k.m65745e(this.f158834f, c37126x.f158834f) && AbstractC22676k.m65745e(this.f158835g, c37126x.f158835g) && AbstractC22676k.m65745e(this.f158836h, c37126x.f158836h) && AbstractC22676k.m65745e(this.f158837i, c37126x.f158837i) && AbstractC22676k.m65745e(this.f158838j, c37126x.f158838j);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f158829a.hashCode() * 31, 31, this.f158830b), 31, this.f158831c), 31, this.f158832d);
        String str = this.f158833e;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC21702c.m61131b(this.f158834f.f147018w, (iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f158835g);
        String str2 = this.f158836h;
        return this.f158838j.hashCode() + AbstractC11266d.m30450d((iM30450d2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f158837i);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("LoginToken(accessKeyId=");
        sb4.append(this.f158829a);
        sb4.append(", secretAccessKey=");
        sb4.append(this.f158830b);
        sb4.append(", sessionToken=");
        sb4.append(this.f158831c);
        sb4.append(", accountId=");
        sb4.append(this.f158832d);
        sb4.append(", tokenType=");
        sb4.append(this.f158833e);
        sb4.append(", expiresAt=");
        sb4.append(this.f158834f);
        sb4.append(", refreshToken=");
        sb4.append(this.f158835g);
        sb4.append(", idToken=");
        sb4.append(this.f158836h);
        sb4.append(", clientId=");
        sb4.append(this.f158837i);
        sb4.append(", dpopKey=");
        return AbstractC25012a.m73377j(sb4, this.f158838j, ')');
    }
}
