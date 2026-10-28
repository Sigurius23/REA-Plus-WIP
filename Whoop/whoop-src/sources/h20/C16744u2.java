package h20;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.u2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16744u2 implements Parcelable {
    public static final Parcelable.Creator<C16744u2> CREATOR = new C16654f2(2);

    /* JADX INFO: renamed from: E */
    public final boolean f64306E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC16702n2 f64307F;

    /* JADX INFO: renamed from: w */
    public final AbstractC16726r2 f64308w;

    /* JADX INFO: renamed from: x */
    public final List f64309x;

    /* JADX INFO: renamed from: y */
    public final String f64310y;

    /* JADX INFO: renamed from: z */
    public final String f64311z;

    public C16744u2(AbstractC16726r2 mode, List paymentMethodTypes, String str, String str2, boolean z4, InterfaceC16702n2 intentBehavior) {
        AbstractC22676k.m65750j(mode, "mode");
        AbstractC22676k.m65750j(paymentMethodTypes, "paymentMethodTypes");
        AbstractC22676k.m65750j(intentBehavior, "intentBehavior");
        this.f64308w = mode;
        this.f64309x = paymentMethodTypes;
        this.f64310y = str;
        this.f64311z = str2;
        this.f64306E = z4;
        this.f64307F = intentBehavior;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16744u2)) {
            return false;
        }
        C16744u2 c16744u2 = (C16744u2) obj;
        return AbstractC22676k.m65745e(this.f64308w, c16744u2.f64308w) && AbstractC22676k.m65745e(this.f64309x, c16744u2.f64309x) && AbstractC22676k.m65745e(this.f64310y, c16744u2.f64310y) && AbstractC22676k.m65745e(this.f64311z, c16744u2.f64311z) && this.f64306E == c16744u2.f64306E && AbstractC22676k.m65745e(this.f64307F, c16744u2.f64307F);
    }

    public final int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.f64308w.hashCode() * 31, 31, this.f64309x);
        String str = this.f64310y;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f64311z;
        return this.f64307F.hashCode() + AbstractC2875y.m8289b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f64306E);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("IntentConfiguration(mode=");
        sb4.append(this.f64308w);
        sb4.append(", paymentMethodTypes=");
        sb4.append(this.f64309x);
        sb4.append(", paymentMethodConfigurationId=");
        AbstractC11266d.m30444B(sb4, this.f64310y, ", onBehalfOf=", this.f64311z, ", requireCvcRecollection=");
        sb4.append(this.f64306E);
        sb4.append(", intentBehavior=");
        sb4.append(this.f64307F);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f64308w, i13);
        dest.writeStringList(this.f64309x);
        dest.writeString(this.f64310y);
        dest.writeString(this.f64311z);
        dest.writeInt(this.f64306E ? 1 : 0);
        dest.writeParcelable(this.f64307F, i13);
    }

    public /* synthetic */ C16744u2(AbstractC16726r2 abstractC16726r2, List list, String str, int i13) {
        this(abstractC16726r2, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : str, null, false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16744u2(AbstractC16726r2 abstractC16726r2, List paymentMethodTypes, String str, String str2, boolean z4) {
        this(abstractC16726r2, paymentMethodTypes, str, str2, z4, C16690l2.f64193w);
        AbstractC22676k.m65750j(paymentMethodTypes, "paymentMethodTypes");
    }
}
