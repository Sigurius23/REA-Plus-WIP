package fi;

import android.content.Context;
import gi.C15878i;
import gi.EnumC15873d;
import gi.EnumC15876g;
import ne3.AbstractC26632p;
import p461rh.C31420i;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fi.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C14509o {

    /* JADX INFO: renamed from: a */
    public final Context f53003a;

    /* JADX INFO: renamed from: b */
    public final C15878i f53004b;

    /* JADX INFO: renamed from: c */
    public final EnumC15876g f53005c;

    /* JADX INFO: renamed from: d */
    public final EnumC15873d f53006d;

    /* JADX INFO: renamed from: e */
    public final String f53007e;

    /* JADX INFO: renamed from: f */
    public final AbstractC26632p f53008f;

    /* JADX INFO: renamed from: g */
    public final EnumC14496b f53009g;

    /* JADX INFO: renamed from: h */
    public final EnumC14496b f53010h;

    /* JADX INFO: renamed from: i */
    public final EnumC14496b f53011i;

    /* JADX INFO: renamed from: j */
    public final C31420i f53012j;

    public C14509o(Context context, C15878i c15878i, EnumC15876g enumC15876g, EnumC15873d enumC15873d, String str, AbstractC26632p abstractC26632p, EnumC14496b enumC14496b, EnumC14496b enumC14496b2, EnumC14496b enumC14496b3, C31420i c31420i) {
        this.f53003a = context;
        this.f53004b = c15878i;
        this.f53005c = enumC15876g;
        this.f53006d = enumC15873d;
        this.f53007e = str;
        this.f53008f = abstractC26632p;
        this.f53009g = enumC14496b;
        this.f53010h = enumC14496b2;
        this.f53011i = enumC14496b3;
        this.f53012j = c31420i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14509o)) {
            return false;
        }
        C14509o c14509o = (C14509o) obj;
        return AbstractC22676k.m65745e(this.f53003a, c14509o.f53003a) && AbstractC22676k.m65745e(this.f53004b, c14509o.f53004b) && this.f53005c == c14509o.f53005c && this.f53006d == c14509o.f53006d && AbstractC22676k.m65745e(this.f53007e, c14509o.f53007e) && AbstractC22676k.m65745e(this.f53008f, c14509o.f53008f) && this.f53009g == c14509o.f53009g && this.f53010h == c14509o.f53010h && this.f53011i == c14509o.f53011i && AbstractC22676k.m65745e(this.f53012j, c14509o.f53012j);
    }

    public final int hashCode() {
        int iHashCode = (this.f53006d.hashCode() + ((this.f53005c.hashCode() + ((this.f53004b.hashCode() + (this.f53003a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.f53007e;
        return this.f53012j.f129287a.hashCode() + ((this.f53011i.hashCode() + ((this.f53010h.hashCode() + ((this.f53009g.hashCode() + ((this.f53008f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.f53003a + ", size=" + this.f53004b + ", scale=" + this.f53005c + ", precision=" + this.f53006d + ", diskCacheKey=" + this.f53007e + ", fileSystem=" + this.f53008f + ", memoryCachePolicy=" + this.f53009g + ", diskCachePolicy=" + this.f53010h + ", networkCachePolicy=" + this.f53011i + ", extras=" + this.f53012j + ')';
    }
}
