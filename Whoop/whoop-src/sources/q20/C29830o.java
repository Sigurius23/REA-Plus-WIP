package q20;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import pn.C29367a;
import y00.AbstractC38869j5;
import y00.AbstractC38970u5;
import y00.C38809d5;

/* JADX INFO: renamed from: q20.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C29830o extends AbstractC29835t {
    public static final Parcelable.Creator<C29830o> CREATOR = new C29367a(29);

    /* JADX INFO: renamed from: E */
    public final String f121925E;

    /* JADX INFO: renamed from: F */
    public final String f121926F;

    /* JADX INFO: renamed from: G */
    public final C38809d5 f121927G;

    /* JADX INFO: renamed from: H */
    public final EnumC29820h f121928H;

    /* JADX INFO: renamed from: I */
    public final AbstractC38970u5 f121929I;

    /* JADX INFO: renamed from: J */
    public final AbstractC38869j5 f121930J;

    /* JADX INFO: renamed from: x */
    public final InterfaceC41211c f121931x;

    /* JADX INFO: renamed from: y */
    public final int f121932y;

    /* JADX INFO: renamed from: z */
    public final Integer f121933z;

    public C29830o(InterfaceC41211c label, int i13, Integer num, String str, String str2, C38809d5 paymentMethodCreateParams, EnumC29820h customerRequestedSave, AbstractC38970u5 abstractC38970u5, AbstractC38869j5 abstractC38869j5) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(paymentMethodCreateParams, "paymentMethodCreateParams");
        AbstractC22676k.m65750j(customerRequestedSave, "customerRequestedSave");
        this.f121931x = label;
        this.f121932y = i13;
        this.f121933z = num;
        this.f121925E = str;
        this.f121926F = str2;
        this.f121927G = paymentMethodCreateParams;
        this.f121928H = customerRequestedSave;
        this.f121929I = abstractC38970u5;
        this.f121930J = abstractC38869j5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29830o)) {
            return false;
        }
        C29830o c29830o = (C29830o) obj;
        return AbstractC22676k.m65745e(this.f121931x, c29830o.f121931x) && this.f121932y == c29830o.f121932y && AbstractC22676k.m65745e(this.f121933z, c29830o.f121933z) && AbstractC22676k.m65745e(this.f121925E, c29830o.f121925E) && AbstractC22676k.m65745e(this.f121926F, c29830o.f121926F) && AbstractC22676k.m65745e(this.f121927G, c29830o.f121927G) && this.f121928H == c29830o.f121928H && AbstractC22676k.m65745e(this.f121929I, c29830o.f121929I) && AbstractC22676k.m65745e(this.f121930J, c29830o.f121930J);
    }

    @Override // q20.AbstractC29835t
    /* JADX INFO: renamed from: h */
    public final EnumC29820h mo91329h() {
        return this.f121928H;
    }

    public final int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.f121932y, this.f121931x.hashCode() * 31, 31);
        Integer num = this.f121933z;
        int iHashCode = (iM30448b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f121925E;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f121926F;
        int iHashCode3 = (this.f121928H.hashCode() + ((this.f121927G.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        AbstractC38970u5 abstractC38970u5 = this.f121929I;
        int iHashCode4 = (iHashCode3 + (abstractC38970u5 == null ? 0 : abstractC38970u5.hashCode())) * 31;
        AbstractC38869j5 abstractC38869j5 = this.f121930J;
        return iHashCode4 + (abstractC38869j5 != null ? abstractC38869j5.hashCode() : 0);
    }

    @Override // q20.AbstractC29835t
    /* JADX INFO: renamed from: i */
    public final C38809d5 mo91330i() {
        return this.f121927G;
    }

    @Override // q20.AbstractC29835t
    /* JADX INFO: renamed from: k */
    public final AbstractC38869j5 mo91331k() {
        return this.f121930J;
    }

    @Override // q20.AbstractC29835t
    /* JADX INFO: renamed from: s */
    public final AbstractC38970u5 mo91332s() {
        return this.f121929I;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("GenericPaymentMethod(label=");
        sb4.append(this.f121931x);
        sb4.append(", iconResource=");
        sb4.append(this.f121932y);
        sb4.append(", iconResourceNight=");
        AbstractC13673n.m38577x(this.f121933z, ", lightThemeIconUrl=", this.f121925E, ", darkThemeIconUrl=", sb4);
        sb4.append(this.f121926F);
        sb4.append(", paymentMethodCreateParams=");
        sb4.append(this.f121927G);
        sb4.append(", customerRequestedSave=");
        sb4.append(this.f121928H);
        sb4.append(", paymentMethodOptionsParams=");
        sb4.append(this.f121929I);
        sb4.append(", paymentMethodExtraParams=");
        sb4.append(this.f121930J);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f121931x, i13);
        dest.writeInt(this.f121932y);
        Integer num = this.f121933z;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        dest.writeString(this.f121925E);
        dest.writeString(this.f121926F);
        dest.writeParcelable(this.f121927G, i13);
        dest.writeString(this.f121928H.name());
        dest.writeParcelable(this.f121929I, i13);
        dest.writeParcelable(this.f121930J, i13);
    }
}
