package p615xh;

import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p461rh.InterfaceC31421j;
import p715kotlin.jvm.internal.AbstractC22676k;
import sh.EnumC32482h;

/* JADX INFO: renamed from: xh.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C38294a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC31421j f164095a;

    /* JADX INFO: renamed from: b */
    public final boolean f164096b;

    /* JADX INFO: renamed from: c */
    public final EnumC32482h f164097c;

    /* JADX INFO: renamed from: d */
    public final String f164098d;

    public C38294a(InterfaceC31421j interfaceC31421j, boolean z4, EnumC32482h enumC32482h, String str) {
        this.f164095a = interfaceC31421j;
        this.f164096b = z4;
        this.f164097c = enumC32482h;
        this.f164098d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38294a)) {
            return false;
        }
        C38294a c38294a = (C38294a) obj;
        return AbstractC22676k.m65745e(this.f164095a, c38294a.f164095a) && this.f164096b == c38294a.f164096b && this.f164097c == c38294a.f164097c && AbstractC22676k.m65745e(this.f164098d, c38294a.f164098d);
    }

    public final int hashCode() {
        int iHashCode = (this.f164097c.hashCode() + AbstractC2875y.m8289b(this.f164095a.hashCode() * 31, 31, this.f164096b)) * 31;
        String str = this.f164098d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ExecuteResult(image=");
        sb4.append(this.f164095a);
        sb4.append(", isSampled=");
        sb4.append(this.f164096b);
        sb4.append(", dataSource=");
        sb4.append(this.f164097c);
        sb4.append(", diskCacheKey=");
        return AbstractC25012a.m73377j(sb4, this.f164098d, ')');
    }
}
