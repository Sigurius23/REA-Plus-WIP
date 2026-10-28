package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C38964u implements InterfaceC36562b {
    public static final Parcelable.Creator<C38964u> CREATOR = new C38873k(6);

    /* JADX INFO: renamed from: E */
    public final String f167709E;

    /* JADX INFO: renamed from: F */
    public final C38955t f167710F;

    /* JADX INFO: renamed from: G */
    public final String f167711G;

    /* JADX INFO: renamed from: H */
    public final EnumC38910o f167712H;

    /* JADX INFO: renamed from: I */
    public final String f167713I;

    /* JADX INFO: renamed from: J */
    public final C38860i6 f167714J;

    /* JADX INFO: renamed from: w */
    public final String f167715w;

    /* JADX INFO: renamed from: x */
    public final long f167716x;

    /* JADX INFO: renamed from: y */
    public final Long f167717y;

    /* JADX INFO: renamed from: z */
    public final boolean f167718z;

    public C38964u(String id4, long j7, Long l7, boolean z4, String str, C38955t c38955t, String str2, EnumC38910o enumC38910o, String str3, C38860i6 c38860i6) {
        AbstractC22676k.m65750j(id4, "id");
        this.f167715w = id4;
        this.f167716x = j7;
        this.f167717y = l7;
        this.f167718z = z4;
        this.f167709E = str;
        this.f167710F = c38955t;
        this.f167711G = str2;
        this.f167712H = enumC38910o;
        this.f167713I = str3;
        this.f167714J = c38860i6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38964u)) {
            return false;
        }
        C38964u c38964u = (C38964u) obj;
        return AbstractC22676k.m65745e(this.f167715w, c38964u.f167715w) && this.f167716x == c38964u.f167716x && AbstractC22676k.m65745e(this.f167717y, c38964u.f167717y) && this.f167718z == c38964u.f167718z && AbstractC22676k.m65745e(this.f167709E, c38964u.f167709E) && AbstractC22676k.m65745e(this.f167710F, c38964u.f167710F) && AbstractC22676k.m65745e(this.f167711G, c38964u.f167711G) && this.f167712H == c38964u.f167712H && AbstractC22676k.m65745e(this.f167713I, c38964u.f167713I) && AbstractC22676k.m65745e(this.f167714J, c38964u.f167714J);
    }

    public final int hashCode() {
        int iM30451e = AbstractC11266d.m30451e(this.f167715w.hashCode() * 31, this.f167716x, 31);
        Long l7 = this.f167717y;
        int iM8289b = AbstractC2875y.m8289b((iM30451e + (l7 == null ? 0 : l7.hashCode())) * 31, 31, this.f167718z);
        String str = this.f167709E;
        int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        C38955t c38955t = this.f167710F;
        int iHashCode2 = (iHashCode + (c38955t == null ? 0 : c38955t.hashCode())) * 31;
        String str2 = this.f167711G;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC38910o enumC38910o = this.f167712H;
        int iHashCode4 = (iHashCode3 + (enumC38910o == null ? 0 : enumC38910o.hashCode())) * 31;
        String str3 = this.f167713I;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C38860i6 c38860i6 = this.f167714J;
        return iHashCode5 + (c38860i6 != null ? c38860i6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32000s = AbstractC11895b.m32000s("ConfirmationToken(id=", this.f167715w, this.f167716x, ", created=");
        sbM32000s.append(", expiresAt=");
        sbM32000s.append(this.f167717y);
        sbM32000s.append(", liveMode=");
        sbM32000s.append(this.f167718z);
        sbM32000s.append(", paymentIntentId=");
        sbM32000s.append(this.f167709E);
        sbM32000s.append(", paymentMethodPreview=");
        sbM32000s.append(this.f167710F);
        sbM32000s.append(", returnUrl=");
        sbM32000s.append(this.f167711G);
        sbM32000s.append(", setupFutureUsage=");
        sbM32000s.append(this.f167712H);
        sbM32000s.append(", setupIntentId=");
        sbM32000s.append(this.f167713I);
        sbM32000s.append(", shipping=");
        sbM32000s.append(this.f167714J);
        sbM32000s.append(")");
        return sbM32000s.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167715w);
        dest.writeLong(this.f167716x);
        Long l7 = this.f167717y;
        if (l7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l7.longValue());
        }
        dest.writeInt(this.f167718z ? 1 : 0);
        dest.writeString(this.f167709E);
        C38955t c38955t = this.f167710F;
        if (c38955t == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38955t.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167711G);
        EnumC38910o enumC38910o = this.f167712H;
        if (enumC38910o == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38910o.name());
        }
        dest.writeString(this.f167713I);
        C38860i6 c38860i6 = this.f167714J;
        if (c38860i6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38860i6.writeToParcel(dest, i13);
        }
    }
}
