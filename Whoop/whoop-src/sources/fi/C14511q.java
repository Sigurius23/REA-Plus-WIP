package fi;

import ai.C0896b;
import p031b9.AbstractC2875y;
import p461rh.InterfaceC31421j;
import p715kotlin.jvm.internal.AbstractC22676k;
import sh.EnumC32482h;

/* JADX INFO: renamed from: fi.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C14511q implements InterfaceC14506l {

    /* JADX INFO: renamed from: a */
    public final InterfaceC31421j f53013a;

    /* JADX INFO: renamed from: b */
    public final C14503i f53014b;

    /* JADX INFO: renamed from: c */
    public final EnumC32482h f53015c;

    /* JADX INFO: renamed from: d */
    public final C0896b f53016d;

    /* JADX INFO: renamed from: e */
    public final String f53017e;

    /* JADX INFO: renamed from: f */
    public final boolean f53018f;

    /* JADX INFO: renamed from: g */
    public final boolean f53019g;

    public C14511q(InterfaceC31421j interfaceC31421j, C14503i c14503i, EnumC32482h enumC32482h, C0896b c0896b, String str, boolean z4, boolean z13) {
        this.f53013a = interfaceC31421j;
        this.f53014b = c14503i;
        this.f53015c = enumC32482h;
        this.f53016d = c0896b;
        this.f53017e = str;
        this.f53018f = z4;
        this.f53019g = z13;
    }

    @Override // fi.InterfaceC14506l
    /* JADX INFO: renamed from: d */
    public final C14503i mo41406d() {
        return this.f53014b;
    }

    @Override // fi.InterfaceC14506l
    /* JADX INFO: renamed from: e */
    public final InterfaceC31421j mo41407e() {
        return this.f53013a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14511q)) {
            return false;
        }
        C14511q c14511q = (C14511q) obj;
        return AbstractC22676k.m65745e(this.f53013a, c14511q.f53013a) && AbstractC22676k.m65745e(this.f53014b, c14511q.f53014b) && this.f53015c == c14511q.f53015c && AbstractC22676k.m65745e(this.f53016d, c14511q.f53016d) && AbstractC22676k.m65745e(this.f53017e, c14511q.f53017e) && this.f53018f == c14511q.f53018f && this.f53019g == c14511q.f53019g;
    }

    public final int hashCode() {
        int iHashCode = (this.f53015c.hashCode() + ((this.f53014b.hashCode() + (this.f53013a.hashCode() * 31)) * 31)) * 31;
        C0896b c0896b = this.f53016d;
        int iHashCode2 = (iHashCode + (c0896b == null ? 0 : c0896b.hashCode())) * 31;
        String str = this.f53017e;
        return Boolean.hashCode(this.f53019g) + AbstractC2875y.m8289b((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f53018f);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SuccessResult(image=");
        sb4.append(this.f53013a);
        sb4.append(", request=");
        sb4.append(this.f53014b);
        sb4.append(", dataSource=");
        sb4.append(this.f53015c);
        sb4.append(", memoryCacheKey=");
        sb4.append(this.f53016d);
        sb4.append(", diskCacheKey=");
        sb4.append(this.f53017e);
        sb4.append(", isSampled=");
        sb4.append(this.f53018f);
        sb4.append(", isPlaceholderCached=");
        return AbstractC2875y.m8305r(sb4, this.f53019g, ')');
    }
}
