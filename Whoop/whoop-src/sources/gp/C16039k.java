package gp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment$UnsupportedAttachmentException;
import com.google.android.gms.fido.fido2.api.common.C5001x11efcb6;
import com.google.android.gms.fido.fido2.api.common.zzbc;
import ih0.AbstractC18489d0;
import java.util.Arrays;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gp.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C16039k extends AbstractC36219a {
    public static final Parcelable.Creator<C16039k> CREATOR = new C16040k0(24);

    /* JADX INFO: renamed from: w */
    public final EnumC16021b f60669w;

    /* JADX INFO: renamed from: x */
    public final Boolean f60670x;

    /* JADX INFO: renamed from: y */
    public final EnumC16024c0 f60671y;

    /* JADX INFO: renamed from: z */
    public final EnumC16062y f60672z;

    public C16039k(String str, String str2, Boolean bool, String str3) {
        EnumC16021b enumC16021bM45339b;
        EnumC16062y enumC16062yM45357b = null;
        if (str == null) {
            enumC16021bM45339b = null;
        } else {
            try {
                enumC16021bM45339b = EnumC16021b.m45339b(str);
            } catch (Attachment$UnsupportedAttachmentException | C5001x11efcb6 | zzbc e5) {
                throw new IllegalArgumentException(e5);
            }
        }
        this.f60669w = enumC16021bM45339b;
        this.f60670x = bool;
        this.f60671y = str2 == null ? null : EnumC16024c0.m45341b(str2);
        if (str3 != null) {
            enumC16062yM45357b = EnumC16062y.m45357b(str3);
        }
        this.f60672z = enumC16062yM45357b;
    }

    /* JADX INFO: renamed from: b */
    public final EnumC16062y m45351b() {
        EnumC16062y enumC16062y = this.f60672z;
        if (enumC16062y != null) {
            return enumC16062y;
        }
        Boolean bool = this.f60670x;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return EnumC16062y.RESIDENT_KEY_REQUIRED;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16039k)) {
            return false;
        }
        C16039k c16039k = (C16039k) obj;
        return AbstractC35135w.m111097i(this.f60669w, c16039k.f60669w) && AbstractC35135w.m111097i(this.f60670x, c16039k.f60670x) && AbstractC35135w.m111097i(this.f60671y, c16039k.f60671y) && AbstractC35135w.m111097i(m45351b(), c16039k.m45351b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f60669w, this.f60670x, this.f60671y, m45351b()});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f60669w);
        String strValueOf2 = String.valueOf(this.f60671y);
        String strValueOf3 = String.valueOf(this.f60672z);
        StringBuilder sbM53375p = AbstractC18489d0.m53375p("AuthenticatorSelectionCriteria{\n attachment=", strValueOf, ", \n requireResidentKey=");
        AbstractC13673n.m38576w(this.f60670x, ", \n requireUserVerification=", strValueOf2, ", \n residentKeyRequirement=", sbM53375p);
        return AbstractC25012a.m73376i(strValueOf3, "\n }", sbM53375p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        EnumC16021b enumC16021b = this.f60669w;
        AbstractC36221c.m115332m(parcel, 2, enumC16021b == null ? null : enumC16021b.f60619w);
        Boolean bool = this.f60670x;
        if (bool != null) {
            AbstractC36221c.m115337r(parcel, 3, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        EnumC16024c0 enumC16024c0 = this.f60671y;
        AbstractC36221c.m115332m(parcel, 4, enumC16024c0 == null ? null : enumC16024c0.f60625w);
        EnumC16062y enumC16062yM45351b = m45351b();
        AbstractC36221c.m115332m(parcel, 5, enumC16062yM45351b != null ? enumC16062yM45351b.f60744w : null);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
