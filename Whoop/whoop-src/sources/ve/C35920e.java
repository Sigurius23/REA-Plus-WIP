package ve;

import gf.InterfaceC15761b;
import p000.AbstractC11266d;
import p613xf.InterfaceC38255a;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.C34913b;

/* JADX INFO: renamed from: ve.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C35920e implements InterfaceC38255a {

    /* JADX INFO: renamed from: a */
    public final String f152982a;

    /* JADX INFO: renamed from: b */
    public final String f152983b;

    /* JADX INFO: renamed from: c */
    public final String f152984c;

    /* JADX INFO: renamed from: d */
    public final C34913b f152985d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC15761b f152986e;

    public C35920e(String accessKeyId, String secretAccessKey, String str, C34913b c34913b, InterfaceC15761b interfaceC15761b) {
        AbstractC22676k.m65750j(accessKeyId, "accessKeyId");
        AbstractC22676k.m65750j(secretAccessKey, "secretAccessKey");
        this.f152982a = accessKeyId;
        this.f152983b = secretAccessKey;
        this.f152984c = str;
        this.f152985d = c34913b;
        this.f152986e = interfaceC15761b;
    }

    /* JADX INFO: renamed from: a */
    public final C34913b m114099a() {
        return this.f152985d;
    }

    /* JADX INFO: renamed from: b */
    public final String m114100b() {
        return this.f152984c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35920e)) {
            return false;
        }
        C35920e c35920e = (C35920e) obj;
        return AbstractC22676k.m65745e(this.f152982a, c35920e.f152982a) && AbstractC22676k.m65745e(this.f152983b, c35920e.f152983b) && AbstractC22676k.m65745e(this.f152984c, c35920e.f152984c) && AbstractC22676k.m65745e(this.f152985d, c35920e.f152985d) && AbstractC22676k.m65745e(this.f152986e, c35920e.f152986e);
    }

    @Override // p613xf.InterfaceC38255a
    public final InterfaceC15761b getAttributes() {
        return this.f152986e;
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f152982a.hashCode() * 31, 31, this.f152983b);
        String str = this.f152984c;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        C34913b c34913b = this.f152985d;
        return this.f152986e.hashCode() + ((iHashCode + (c34913b != null ? c34913b.f147018w.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CredentialsImpl(accessKeyId=" + this.f152982a + ", secretAccessKey=" + this.f152983b + ", sessionToken=" + this.f152984c + ", expiration=" + this.f152985d + ", attributes=" + this.f152986e + ')';
    }
}
