package t20;

import f20.EnumC14023b;
import h20.EnumC16673i3;
import i20.C17928b;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29810c;
import q20.C29834s;
import s20.C32077a;
import y00.AbstractC38963t7;
import y00.C38901n;
import y00.EnumC38922p2;

/* JADX INFO: renamed from: t20.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C33341v {

    /* JADX INFO: renamed from: a */
    public final boolean f139084a;

    /* JADX INFO: renamed from: b */
    public final C29810c f139085b;

    /* JADX INFO: renamed from: c */
    public final EnumC38922p2 f139086c;

    /* JADX INFO: renamed from: d */
    public final C32077a f139087d;

    /* JADX INFO: renamed from: e */
    public final boolean f139088e;

    /* JADX INFO: renamed from: f */
    public final boolean f139089f;

    /* JADX INFO: renamed from: g */
    public final boolean f139090g;

    /* JADX INFO: renamed from: h */
    public final String f139091h;

    /* JADX INFO: renamed from: i */
    public final String f139092i;

    /* JADX INFO: renamed from: j */
    public final String f139093j;

    /* JADX INFO: renamed from: k */
    public final C29834s f139094k;

    /* JADX INFO: renamed from: l */
    public final C17928b f139095l;

    /* JADX INFO: renamed from: m */
    public final String f139096m;

    /* JADX INFO: renamed from: n */
    public final EnumC14023b f139097n;

    /* JADX INFO: renamed from: o */
    public final boolean f139098o;

    /* JADX INFO: renamed from: p */
    public final boolean f139099p;

    /* JADX INFO: renamed from: q */
    public final EnumC16673i3 f139100q;

    /* JADX INFO: renamed from: r */
    public final String f139101r;

    /* JADX INFO: renamed from: s */
    public final boolean f139102s;

    /* JADX INFO: renamed from: t */
    public final C38901n f139103t;

    public C33341v(boolean z4, C29810c c29810c, EnumC38922p2 enumC38922p2, C32077a formArgs, boolean z13, boolean z14, boolean z15, String str, String str2, String str3, C29834s c29834s, C17928b c17928b, String str4, EnumC14023b enumC14023b, boolean z16, boolean z17, EnumC16673i3 enumC16673i3, String str5, boolean z18, C38901n clientAttributionMetadata) {
        AbstractC22676k.m65750j(formArgs, "formArgs");
        AbstractC22676k.m65750j(clientAttributionMetadata, "clientAttributionMetadata");
        this.f139084a = z4;
        this.f139085b = c29810c;
        this.f139086c = enumC38922p2;
        this.f139087d = formArgs;
        this.f139088e = z13;
        this.f139089f = z14;
        this.f139090g = z15;
        this.f139091h = str;
        this.f139092i = str2;
        this.f139093j = str3;
        this.f139094k = c29834s;
        this.f139095l = c17928b;
        this.f139096m = str4;
        this.f139097n = enumC14023b;
        this.f139098o = z16;
        this.f139099p = z17;
        this.f139100q = enumC16673i3;
        this.f139101r = str5;
        this.f139102s = z18;
        this.f139103t = clientAttributionMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33341v)) {
            return false;
        }
        C33341v c33341v = (C33341v) obj;
        return this.f139084a == c33341v.f139084a && AbstractC22676k.m65745e(this.f139085b, c33341v.f139085b) && this.f139086c == c33341v.f139086c && AbstractC22676k.m65745e(this.f139087d, c33341v.f139087d) && this.f139088e == c33341v.f139088e && this.f139089f == c33341v.f139089f && this.f139090g == c33341v.f139090g && AbstractC22676k.m65745e(this.f139091h, c33341v.f139091h) && AbstractC22676k.m65745e(this.f139092i, c33341v.f139092i) && AbstractC22676k.m65745e(this.f139093j, c33341v.f139093j) && AbstractC22676k.m65745e(this.f139094k, c33341v.f139094k) && AbstractC22676k.m65745e(this.f139095l, c33341v.f139095l) && this.f139096m.equals(c33341v.f139096m) && this.f139097n == c33341v.f139097n && this.f139098o == c33341v.f139098o && this.f139099p == c33341v.f139099p && this.f139100q == c33341v.f139100q && AbstractC22676k.m65745e(this.f139101r, c33341v.f139101r) && this.f139102s == c33341v.f139102s && AbstractC22676k.m65745e(this.f139103t, c33341v.f139103t);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f139084a) * 31;
        C29810c c29810c = this.f139085b;
        int iHashCode2 = (iHashCode + (c29810c == null ? 0 : c29810c.hashCode())) * 31;
        EnumC38922p2 enumC38922p2 = this.f139086c;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.f139087d.hashCode() + ((iHashCode2 + (enumC38922p2 == null ? 0 : enumC38922p2.hashCode())) * 31)) * 31, 31, this.f139088e), 31, this.f139089f), 31, this.f139090g);
        String str = this.f139091h;
        int iHashCode3 = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f139092i;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f139093j;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C29834s c29834s = this.f139094k;
        int iHashCode6 = (iHashCode5 + (c29834s == null ? 0 : c29834s.hashCode())) * 31;
        C17928b c17928b = this.f139095l;
        int iM30450d = AbstractC11266d.m30450d((iHashCode6 + (c17928b == null ? 0 : c17928b.hashCode())) * 31, 31, this.f139096m);
        EnumC14023b enumC14023b = this.f139097n;
        int iHashCode7 = (this.f139100q.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30450d + (enumC14023b == null ? 0 : enumC14023b.hashCode())) * 31, 31, this.f139098o), 31, this.f139099p)) * 31;
        String str4 = this.f139101r;
        return this.f139103t.hashCode() + AbstractC2875y.m8289b((iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.f139102s);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Args(instantDebits=");
        sb4.append(this.f139084a);
        sb4.append(", incentive=");
        sb4.append(this.f139085b);
        sb4.append(", linkMode=");
        sb4.append(this.f139086c);
        sb4.append(", formArgs=");
        sb4.append(this.f139087d);
        sb4.append(", showCheckbox=");
        AbstractC38963t7.m124392v(sb4, this.f139088e, ", isCompleteFlow=", this.f139089f, ", isPaymentFlow=");
        AbstractC38963t7.m124391u(sb4, this.f139090g, ", stripeIntentId=", this.f139091h, ", clientSecret=");
        AbstractC11266d.m30444B(sb4, this.f139092i, ", onBehalfOf=", this.f139093j, ", savedPaymentMethod=");
        sb4.append(this.f139094k);
        sb4.append(", shippingDetails=");
        sb4.append(this.f139095l);
        sb4.append(", hostedSurface=");
        sb4.append(this.f139096m);
        sb4.append(", financialConnectionsAvailability=");
        sb4.append(this.f139097n);
        sb4.append(", setAsDefaultPaymentMethodEnabled=");
        AbstractC38963t7.m124392v(sb4, this.f139098o, ", setAsDefaultMatchesSaveForFutureUse=", this.f139099p, ", termsDisplay=");
        sb4.append(this.f139100q);
        sb4.append(", sellerBusinessName=");
        sb4.append(this.f139101r);
        sb4.append(", forceSetupFutureUseBehavior=");
        sb4.append(this.f139102s);
        sb4.append(", clientAttributionMetadata=");
        sb4.append(this.f139103t);
        sb4.append(")");
        return sb4.toString();
    }
}
