package tg;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tg.b */
/* JADX INFO: loaded from: classes.dex */
public final class C33770b {

    /* JADX INFO: renamed from: f */
    public static final C33770b f141347f;

    /* JADX INFO: renamed from: a */
    public final String f141348a;

    /* JADX INFO: renamed from: b */
    public final String f141349b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC33773e f141350c;

    /* JADX INFO: renamed from: d */
    public final boolean f141351d;

    /* JADX INFO: renamed from: e */
    public final boolean f141352e;

    static {
        InterfaceC33773e.f141355a.getClass();
        f141347f = new C33770b("", "", C33772d.f141354b);
    }

    public C33770b(String decoded, String encoded, InterfaceC33773e encoding) {
        AbstractC22676k.m65750j(decoded, "decoded");
        AbstractC22676k.m65750j(encoded, "encoded");
        AbstractC22676k.m65750j(encoding, "encoding");
        this.f141348a = decoded;
        this.f141349b = encoded;
        this.f141350c = encoding;
        boolean z4 = decoded.length() == 0 && encoded.length() == 0;
        this.f141351d = z4;
        this.f141352e = !z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33770b)) {
            return false;
        }
        C33770b c33770b = (C33770b) obj;
        return AbstractC22676k.m65745e(this.f141348a, c33770b.f141348a) && AbstractC22676k.m65745e(this.f141349b, c33770b.f141349b);
    }

    public final int hashCode() {
        return this.f141349b.hashCode() + (this.f141348a.hashCode() * 31);
    }

    public final String toString() {
        return "Encodable(decoded=" + this.f141348a + ", encoded=" + this.f141349b + ", encoding=" + this.f141350c.getName() + ")";
    }
}
