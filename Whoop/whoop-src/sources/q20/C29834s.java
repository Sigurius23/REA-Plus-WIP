package q20;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import t20.C33321b;
import t20.C33326g;
import y00.AbstractC38869j5;
import y00.AbstractC38970u5;
import y00.C38809d5;

/* JADX INFO: renamed from: q20.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C29834s extends AbstractC29835t {
    public static final Parcelable.Creator<C29834s> CREATOR = new C29831p(0);

    /* JADX INFO: renamed from: E */
    public final C33326g f121942E;

    /* JADX INFO: renamed from: F */
    public final C29833r f121943F;

    /* JADX INFO: renamed from: G */
    public final C38809d5 f121944G;

    /* JADX INFO: renamed from: H */
    public final EnumC29820h f121945H;

    /* JADX INFO: renamed from: I */
    public final AbstractC38970u5 f121946I;

    /* JADX INFO: renamed from: J */
    public final AbstractC38869j5 f121947J;

    /* JADX INFO: renamed from: x */
    public final String f121948x;

    /* JADX INFO: renamed from: y */
    public final int f121949y;

    /* JADX INFO: renamed from: z */
    public final C29832q f121950z;

    public C29834s(String label, int i13, C29832q input, C33326g screenState, C29833r c29833r, C38809d5 paymentMethodCreateParams, EnumC29820h customerRequestedSave, AbstractC38970u5 abstractC38970u5, AbstractC38869j5 abstractC38869j5) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(input, "input");
        AbstractC22676k.m65750j(screenState, "screenState");
        AbstractC22676k.m65750j(paymentMethodCreateParams, "paymentMethodCreateParams");
        AbstractC22676k.m65750j(customerRequestedSave, "customerRequestedSave");
        this.f121948x = label;
        this.f121949y = i13;
        this.f121950z = input;
        this.f121942E = screenState;
        this.f121943F = c29833r;
        this.f121944G = paymentMethodCreateParams;
        this.f121945H = customerRequestedSave;
        this.f121946I = abstractC38970u5;
        this.f121947J = abstractC38869j5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29834s)) {
            return false;
        }
        C29834s c29834s = (C29834s) obj;
        return AbstractC22676k.m65745e(this.f121948x, c29834s.f121948x) && this.f121949y == c29834s.f121949y && AbstractC22676k.m65745e(this.f121950z, c29834s.f121950z) && AbstractC22676k.m65745e(this.f121942E, c29834s.f121942E) && AbstractC22676k.m65745e(this.f121943F, c29834s.f121943F) && AbstractC22676k.m65745e(this.f121944G, c29834s.f121944G) && this.f121945H == c29834s.f121945H && AbstractC22676k.m65745e(this.f121946I, c29834s.f121946I) && AbstractC22676k.m65745e(this.f121947J, c29834s.f121947J);
    }

    @Override // q20.AbstractC29835t, q20.AbstractC29840y
    /* JADX INFO: renamed from: f */
    public final InterfaceC41211c mo91324f(String merchantName, boolean z4) {
        AbstractC22676k.m65750j(merchantName, "merchantName");
        C33321b c33321b = this.f121942E.f139011z;
        if (c33321b != null) {
            return c33321b.f138996F;
        }
        return null;
    }

    @Override // q20.AbstractC29835t
    /* JADX INFO: renamed from: h */
    public final EnumC29820h mo91329h() {
        return this.f121945H;
    }

    public final int hashCode() {
        int iHashCode = (this.f121942E.hashCode() + ((this.f121950z.hashCode() + AbstractC11266d.m30448b(this.f121949y, this.f121948x.hashCode() * 31, 31)) * 31)) * 31;
        C29833r c29833r = this.f121943F;
        int iHashCode2 = (this.f121945H.hashCode() + ((this.f121944G.hashCode() + ((iHashCode + (c29833r == null ? 0 : c29833r.hashCode())) * 31)) * 31)) * 31;
        AbstractC38970u5 abstractC38970u5 = this.f121946I;
        int iHashCode3 = (iHashCode2 + (abstractC38970u5 == null ? 0 : abstractC38970u5.hashCode())) * 31;
        AbstractC38869j5 abstractC38869j5 = this.f121947J;
        return iHashCode3 + (abstractC38869j5 != null ? abstractC38869j5.hashCode() : 0);
    }

    @Override // q20.AbstractC29835t
    /* JADX INFO: renamed from: i */
    public final C38809d5 mo91330i() {
        return this.f121944G;
    }

    @Override // q20.AbstractC29835t
    /* JADX INFO: renamed from: k */
    public final AbstractC38869j5 mo91331k() {
        return this.f121947J;
    }

    @Override // q20.AbstractC29835t
    /* JADX INFO: renamed from: s */
    public final AbstractC38970u5 mo91332s() {
        return this.f121946I;
    }

    public final String toString() {
        StringBuilder sbM30467u = AbstractC11266d.m30467u(this.f121949y, "USBankAccount(label=", this.f121948x, ", iconResource=", ", input=");
        sbM30467u.append(this.f121950z);
        sbM30467u.append(", screenState=");
        sbM30467u.append(this.f121942E);
        sbM30467u.append(", instantDebits=");
        sbM30467u.append(this.f121943F);
        sbM30467u.append(", paymentMethodCreateParams=");
        sbM30467u.append(this.f121944G);
        sbM30467u.append(", customerRequestedSave=");
        sbM30467u.append(this.f121945H);
        sbM30467u.append(", paymentMethodOptionsParams=");
        sbM30467u.append(this.f121946I);
        sbM30467u.append(", paymentMethodExtraParams=");
        sbM30467u.append(this.f121947J);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f121948x);
        dest.writeInt(this.f121949y);
        this.f121950z.writeToParcel(dest, i13);
        dest.writeParcelable(this.f121942E, i13);
        C29833r c29833r = this.f121943F;
        if (c29833r == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c29833r.writeToParcel(dest, i13);
        }
        dest.writeParcelable(this.f121944G, i13);
        dest.writeString(this.f121945H.name());
        dest.writeParcelable(this.f121946I, i13);
        dest.writeParcelable(this.f121947J, i13);
    }
}
