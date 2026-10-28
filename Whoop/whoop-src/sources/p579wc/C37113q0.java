package p579wc;

import gf.C15768i;
import gf.InterfaceC15761b;
import jh3.AbstractC21702c;
import p319m4.AbstractC25012a;
import p613xf.InterfaceC38255a;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.C34913b;

/* JADX INFO: renamed from: wc.q0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37113q0 implements InterfaceC38255a {

    /* JADX INFO: renamed from: a */
    public final String f158772a;

    /* JADX INFO: renamed from: b */
    public final C34913b f158773b;

    /* JADX INFO: renamed from: c */
    public final String f158774c;

    /* JADX INFO: renamed from: d */
    public final String f158775d;

    /* JADX INFO: renamed from: e */
    public final String f158776e;

    /* JADX INFO: renamed from: f */
    public final C34913b f158777f;

    /* JADX INFO: renamed from: g */
    public final String f158778g;

    /* JADX INFO: renamed from: h */
    public final String f158779h;

    /* JADX INFO: renamed from: i */
    public final C15768i f158780i;

    public C37113q0(String token, C34913b c34913b, String str, String str2, String str3, C34913b c34913b2, String str4, String str5) {
        AbstractC22676k.m65750j(token, "token");
        this.f158772a = token;
        this.f158773b = c34913b;
        this.f158774c = str;
        this.f158775d = str2;
        this.f158776e = str3;
        this.f158777f = c34913b2;
        this.f158778g = str4;
        this.f158779h = str5;
        this.f158780i = C15768i.f59433w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37113q0)) {
            return false;
        }
        C37113q0 c37113q0 = (C37113q0) obj;
        return AbstractC22676k.m65745e(this.f158772a, c37113q0.f158772a) && AbstractC22676k.m65745e(this.f158773b, c37113q0.f158773b) && AbstractC22676k.m65745e(this.f158774c, c37113q0.f158774c) && AbstractC22676k.m65745e(this.f158775d, c37113q0.f158775d) && AbstractC22676k.m65745e(this.f158776e, c37113q0.f158776e) && AbstractC22676k.m65745e(this.f158777f, c37113q0.f158777f) && AbstractC22676k.m65745e(this.f158778g, c37113q0.f158778g) && AbstractC22676k.m65745e(this.f158779h, c37113q0.f158779h);
    }

    @Override // p613xf.InterfaceC38255a
    public final InterfaceC15761b getAttributes() {
        return this.f158780i;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f158773b.f147018w, this.f158772a.hashCode() * 31, 31);
        String str = this.f158774c;
        int iHashCode = (iM61131b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f158775d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f158776e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C34913b c34913b = this.f158777f;
        int iHashCode4 = (iHashCode3 + (c34913b == null ? 0 : c34913b.f147018w.hashCode())) * 31;
        String str4 = this.f158778g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f158779h;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SsoToken(token=");
        sb4.append(this.f158772a);
        sb4.append(", expiration=");
        sb4.append(this.f158773b);
        sb4.append(", refreshToken=");
        sb4.append(this.f158774c);
        sb4.append(", clientId=");
        sb4.append(this.f158775d);
        sb4.append(", clientSecret=");
        sb4.append(this.f158776e);
        sb4.append(", registrationExpiresAt=");
        sb4.append(this.f158777f);
        sb4.append(", region=");
        sb4.append(this.f158778g);
        sb4.append(", startUrl=");
        return AbstractC25012a.m73377j(sb4, this.f158779h, ')');
    }
}
