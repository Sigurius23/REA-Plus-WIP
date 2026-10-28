package mh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import c13.AbstractC3855a;
import java.util.Arrays;
import p031b9.AbstractC2875y;
import p341nh.C26714h;
import p341nh.EnumC26713g;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34807d0;

/* JADX INFO: renamed from: mh.m */
/* JADX INFO: loaded from: classes.dex */
public final class C25545m {

    /* JADX INFO: renamed from: a */
    public final Context f100135a;

    /* JADX INFO: renamed from: b */
    public final Bitmap.Config f100136b;

    /* JADX INFO: renamed from: c */
    public final ColorSpace f100137c;

    /* JADX INFO: renamed from: d */
    public final C26714h f100138d;

    /* JADX INFO: renamed from: e */
    public final EnumC26713g f100139e;

    /* JADX INFO: renamed from: f */
    public final boolean f100140f;

    /* JADX INFO: renamed from: g */
    public final boolean f100141g;

    /* JADX INFO: renamed from: h */
    public final boolean f100142h;

    /* JADX INFO: renamed from: i */
    public final String f100143i;

    /* JADX INFO: renamed from: j */
    public final C34807d0 f100144j;

    /* JADX INFO: renamed from: k */
    public final C25548p f100145k;

    /* JADX INFO: renamed from: l */
    public final C25546n f100146l;

    /* JADX INFO: renamed from: m */
    public final EnumC25534b f100147m;

    /* JADX INFO: renamed from: n */
    public final EnumC25534b f100148n;

    /* JADX INFO: renamed from: o */
    public final EnumC25534b f100149o;

    public C25545m(Context context, Bitmap.Config config, ColorSpace colorSpace, C26714h c26714h, EnumC26713g enumC26713g, boolean z4, boolean z13, boolean z14, String str, C34807d0 c34807d0, C25548p c25548p, C25546n c25546n, EnumC25534b enumC25534b, EnumC25534b enumC25534b2, EnumC25534b enumC25534b3) {
        this.f100135a = context;
        this.f100136b = config;
        this.f100137c = colorSpace;
        this.f100138d = c26714h;
        this.f100139e = enumC26713g;
        this.f100140f = z4;
        this.f100141g = z13;
        this.f100142h = z14;
        this.f100143i = str;
        this.f100144j = c34807d0;
        this.f100145k = c25548p;
        this.f100146l = c25546n;
        this.f100147m = enumC25534b;
        this.f100148n = enumC25534b2;
        this.f100149o = enumC25534b3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25545m)) {
            return false;
        }
        C25545m c25545m = (C25545m) obj;
        return AbstractC22676k.m65745e(this.f100135a, c25545m.f100135a) && this.f100136b == c25545m.f100136b && AbstractC22676k.m65745e(this.f100137c, c25545m.f100137c) && AbstractC22676k.m65745e(this.f100138d, c25545m.f100138d) && this.f100139e == c25545m.f100139e && this.f100140f == c25545m.f100140f && this.f100141g == c25545m.f100141g && this.f100142h == c25545m.f100142h && AbstractC22676k.m65745e(this.f100143i, c25545m.f100143i) && AbstractC22676k.m65745e(this.f100144j, c25545m.f100144j) && AbstractC22676k.m65745e(this.f100145k, c25545m.f100145k) && AbstractC22676k.m65745e(this.f100146l, c25545m.f100146l) && this.f100147m == c25545m.f100147m && this.f100148n == c25545m.f100148n && this.f100149o == c25545m.f100149o;
    }

    public final int hashCode() {
        int iHashCode = (this.f100136b.hashCode() + (this.f100135a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f100137c;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.f100139e.hashCode() + ((this.f100138d.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f100140f), 31, this.f100141g), 31, this.f100142h);
        String str = this.f100143i;
        return this.f100149o.hashCode() + ((this.f100148n.hashCode() + ((this.f100147m.hashCode() + AbstractC3855a.m11821e(this.f100146l.f100151w, AbstractC3855a.m11821e(this.f100145k.f100160a, (((iM8289b + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f100144j.f146548w)) * 31, 31), 31)) * 31)) * 31);
    }
}
