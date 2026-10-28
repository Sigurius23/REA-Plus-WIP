package p270k2;

import p000.AbstractC11266d;
import p208i2.InterfaceC17912t0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: k2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C22135i extends AbstractC22132f {

    /* JADX INFO: renamed from: a */
    public final float f85858a;

    /* JADX INFO: renamed from: b */
    public final float f85859b;

    /* JADX INFO: renamed from: c */
    public final int f85860c;

    /* JADX INFO: renamed from: d */
    public final int f85861d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17912t0 f85862e;

    public C22135i(float f13, float f14, int i13, int i14, InterfaceC17912t0 interfaceC17912t0, int i15) {
        f14 = (i15 & 2) != 0 ? 4.0f : f14;
        i13 = (i15 & 4) != 0 ? 0 : i13;
        i14 = (i15 & 8) != 0 ? 0 : i14;
        interfaceC17912t0 = (i15 & 16) != 0 ? null : interfaceC17912t0;
        this.f85858a = f13;
        this.f85859b = f14;
        this.f85860c = i13;
        this.f85861d = i14;
        this.f85862e = interfaceC17912t0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22135i)) {
            return false;
        }
        C22135i c22135i = (C22135i) obj;
        return this.f85858a == c22135i.f85858a && this.f85859b == c22135i.f85859b && this.f85860c == c22135i.f85860c && this.f85861d == c22135i.f85861d && AbstractC22676k.m65745e(this.f85862e, c22135i.f85862e);
    }

    public final int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.f85861d, AbstractC11266d.m30448b(this.f85860c, AbstractC11266d.m30447a(this.f85859b, Float.hashCode(this.f85858a) * 31, 31), 31), 31);
        InterfaceC17912t0 interfaceC17912t0 = this.f85862e;
        return iM30448b + (interfaceC17912t0 != null ? interfaceC17912t0.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder("Stroke(width=");
        sb4.append(this.f85858a);
        sb4.append(", miter=");
        sb4.append(this.f85859b);
        sb4.append(", cap=");
        String str2 = "Unknown";
        int i13 = this.f85860c;
        if (i13 == 0) {
            str = "Butt";
        } else if (i13 == 1) {
            str = "Round";
        } else {
            str = i13 == 2 ? "Square" : "Unknown";
        }
        sb4.append((Object) str);
        sb4.append(", join=");
        int i14 = this.f85861d;
        if (i14 == 0) {
            str2 = "Miter";
        } else if (i14 == 1) {
            str2 = "Round";
        } else if (i14 == 2) {
            str2 = "Bevel";
        }
        sb4.append((Object) str2);
        sb4.append(", pathEffect=");
        sb4.append(this.f85862e);
        sb4.append(')');
        return sb4.toString();
    }
}
