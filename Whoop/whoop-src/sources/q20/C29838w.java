package q20;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.android.R;
import m83.C25271y;
import p479s4.AbstractC32128i;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import s93.AbstractC32309k;
import y00.AbstractC38970u5;
import y00.C38889l5;
import y00.C38915o4;
import y00.EnumC38828f4;

/* JADX INFO: renamed from: q20.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C29838w extends AbstractC29840y {
    public static final Parcelable.Creator<C29838w> CREATOR = new C29831p(3);

    /* JADX INFO: renamed from: x */
    public final C38915o4 f121955x;

    /* JADX INFO: renamed from: y */
    public final EnumC29836u f121956y;

    /* JADX INFO: renamed from: z */
    public final AbstractC38970u5 f121957z;

    public C29838w(C38915o4 paymentMethod, EnumC29836u enumC29836u, AbstractC38970u5 abstractC38970u5) {
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        this.f121955x = paymentMethod;
        this.f121956y = enumC29836u;
        this.f121957z = abstractC38970u5;
    }

    /* JADX INFO: renamed from: h */
    public static C29838w m91333h(C29838w c29838w, C38915o4 paymentMethod, C38889l5 c38889l5, int i13) {
        if ((i13 & 1) != 0) {
            paymentMethod = c29838w.f121955x;
        }
        EnumC29836u enumC29836u = c29838w.f121956y;
        AbstractC38970u5 abstractC38970u5 = c38889l5;
        if ((i13 & 4) != 0) {
            abstractC38970u5 = c29838w.f121957z;
        }
        c29838w.getClass();
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        return new C29838w(paymentMethod, enumC29836u, abstractC38970u5);
    }

    @Override // q20.AbstractC29840y
    /* JADX INFO: renamed from: b */
    public final boolean mo91323b() {
        EnumC38828f4 enumC38828f4 = this.f121955x.f167511E;
        return enumC38828f4 == EnumC38828f4.f167119l0 || enumC38828f4 == EnumC38828f4.f167093L;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29838w)) {
            return false;
        }
        C29838w c29838w = (C29838w) obj;
        return AbstractC22676k.m65745e(this.f121955x, c29838w.f121955x) && this.f121956y == c29838w.f121956y && AbstractC22676k.m65745e(this.f121957z, c29838w.f121957z);
    }

    @Override // q20.AbstractC29840y
    /* JADX INFO: renamed from: f */
    public final InterfaceC41211c mo91324f(String merchantName, boolean z4) {
        AbstractC22676k.m65750j(merchantName, "merchantName");
        EnumC38828f4 enumC38828f4 = this.f121955x.f167511E;
        int i13 = enumC38828f4 == null ? -1 : AbstractC29837v.f121954a[enumC38828f4.ordinal()];
        if (i13 == 1) {
            return AbstractC32309k.m100573b(merchantName, null, false, false, false, false, z4);
        }
        if (i13 != 2) {
            return null;
        }
        return AbstractC32128i.m100064s(R.string.stripe_sepa_mandate, new Object[]{merchantName}, C25271y.f99162w);
    }

    public final int hashCode() {
        int iHashCode = this.f121955x.hashCode() * 31;
        EnumC29836u enumC29836u = this.f121956y;
        int iHashCode2 = (iHashCode + (enumC29836u == null ? 0 : enumC29836u.hashCode())) * 31;
        AbstractC38970u5 abstractC38970u5 = this.f121957z;
        return iHashCode2 + (abstractC38970u5 != null ? abstractC38970u5.hashCode() : 0);
    }

    public final String toString() {
        return "Saved(paymentMethod=" + this.f121955x + ", walletType=" + this.f121956y + ", paymentMethodOptionsParams=" + this.f121957z + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f121955x, i13);
        EnumC29836u enumC29836u = this.f121956y;
        if (enumC29836u == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC29836u.name());
        }
        dest.writeParcelable(this.f121957z, i13);
    }
}
