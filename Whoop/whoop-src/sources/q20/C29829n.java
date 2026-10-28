package q20;

import android.os.Parcel;
import android.os.Parcelable;
import j00.AbstractC21106i0;
import p715kotlin.jvm.internal.AbstractC22676k;
import pn.C29367a;
import y00.AbstractC38869j5;
import y00.AbstractC38970u5;
import y00.C38809d5;
import y00.EnumC38853i;

/* JADX INFO: renamed from: q20.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C29829n extends AbstractC29835t {
    public static final Parcelable.Creator<C29829n> CREATOR = new C29367a(28);

    /* JADX INFO: renamed from: E */
    public final AbstractC38970u5 f121918E;

    /* JADX INFO: renamed from: F */
    public final AbstractC38869j5 f121919F;

    /* JADX INFO: renamed from: G */
    public final AbstractC21106i0 f121920G;

    /* JADX INFO: renamed from: H */
    public final String f121921H;

    /* JADX INFO: renamed from: x */
    public final C38809d5 f121922x;

    /* JADX INFO: renamed from: y */
    public final EnumC38853i f121923y;

    /* JADX INFO: renamed from: z */
    public final EnumC29820h f121924z;

    public C29829n(C38809d5 paymentMethodCreateParams, EnumC38853i brand, EnumC29820h customerRequestedSave, AbstractC38970u5 abstractC38970u5, AbstractC38869j5 abstractC38869j5, AbstractC21106i0 abstractC21106i0) {
        AbstractC22676k.m65750j(paymentMethodCreateParams, "paymentMethodCreateParams");
        AbstractC22676k.m65750j(brand, "brand");
        AbstractC22676k.m65750j(customerRequestedSave, "customerRequestedSave");
        this.f121922x = paymentMethodCreateParams;
        this.f121923y = brand;
        this.f121924z = customerRequestedSave;
        this.f121918E = abstractC38970u5;
        this.f121919F = abstractC38869j5;
        this.f121920G = abstractC21106i0;
        String strM124341b = paymentMethodCreateParams.m124341b();
        this.f121921H = strM124341b == null ? "" : strM124341b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29829n)) {
            return false;
        }
        C29829n c29829n = (C29829n) obj;
        return AbstractC22676k.m65745e(this.f121922x, c29829n.f121922x) && this.f121923y == c29829n.f121923y && this.f121924z == c29829n.f121924z && AbstractC22676k.m65745e(this.f121918E, c29829n.f121918E) && AbstractC22676k.m65745e(this.f121919F, c29829n.f121919F) && AbstractC22676k.m65745e(this.f121920G, c29829n.f121920G);
    }

    @Override // q20.AbstractC29835t
    /* JADX INFO: renamed from: h */
    public final EnumC29820h mo91329h() {
        return this.f121924z;
    }

    public final int hashCode() {
        int iHashCode = (this.f121924z.hashCode() + ((this.f121923y.hashCode() + (this.f121922x.hashCode() * 31)) * 31)) * 31;
        AbstractC38970u5 abstractC38970u5 = this.f121918E;
        int iHashCode2 = (iHashCode + (abstractC38970u5 == null ? 0 : abstractC38970u5.hashCode())) * 31;
        AbstractC38869j5 abstractC38869j5 = this.f121919F;
        int iHashCode3 = (iHashCode2 + (abstractC38869j5 == null ? 0 : abstractC38869j5.hashCode())) * 31;
        AbstractC21106i0 abstractC21106i0 = this.f121920G;
        return iHashCode3 + (abstractC21106i0 != null ? abstractC21106i0.hashCode() : 0);
    }

    @Override // q20.AbstractC29835t
    /* JADX INFO: renamed from: i */
    public final C38809d5 mo91330i() {
        return this.f121922x;
    }

    @Override // q20.AbstractC29835t
    /* JADX INFO: renamed from: k */
    public final AbstractC38869j5 mo91331k() {
        return this.f121919F;
    }

    @Override // q20.AbstractC29835t
    /* JADX INFO: renamed from: s */
    public final AbstractC38970u5 mo91332s() {
        return this.f121918E;
    }

    public final String toString() {
        return "Card(paymentMethodCreateParams=" + this.f121922x + ", brand=" + this.f121923y + ", customerRequestedSave=" + this.f121924z + ", paymentMethodOptionsParams=" + this.f121918E + ", paymentMethodExtraParams=" + this.f121919F + ", linkInput=" + this.f121920G + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f121922x, i13);
        dest.writeString(this.f121923y.name());
        dest.writeString(this.f121924z.name());
        dest.writeParcelable(this.f121918E, i13);
        dest.writeParcelable(this.f121919F, i13);
        dest.writeParcelable(this.f121920G, i13);
    }
}
