package gp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mp.AbstractC25753b;
import mp.AbstractC25792p;
import mp.C25801t0;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import p687zo.AbstractC40909b;

/* JADX INFO: renamed from: gp.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C16055s extends AbstractC36219a {
    public static final Parcelable.Creator<C16055s> CREATOR;

    /* JADX INFO: renamed from: w */
    public final EnumC16059v f60725w;

    /* JADX INFO: renamed from: x */
    public final C25801t0 f60726x;

    /* JADX INFO: renamed from: y */
    public final List f60727y;

    static {
        AbstractC25792p.m76030g(2, AbstractC25753b.f101467y, AbstractC25753b.f101468z);
        CREATOR = new C16040k0(2);
    }

    public C16055s(String str, byte[] bArr, ArrayList arrayList) {
        C25801t0 c25801t0 = C25801t0.f101539y;
        C25801t0 c25801t0M76048l = C25801t0.m76048l(bArr.length, bArr);
        AbstractC35135w.m111094f(str);
        try {
            this.f60725w = EnumC16059v.m45356b(str);
            this.f60726x = c25801t0M76048l;
            this.f60727y = arrayList;
        } catch (PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16055s)) {
            return false;
        }
        C16055s c16055s = (C16055s) obj;
        List list = c16055s.f60727y;
        if (!this.f60725w.equals(c16055s.f60725w) || !AbstractC35135w.m111097i(this.f60726x, c16055s.f60726x)) {
            return false;
        }
        List list2 = this.f60727y;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f60725w, this.f60726x, this.f60727y});
    }

    public final String toString() {
        return AbstractC25012a.m73376i(String.valueOf(this.f60727y), "}", AbstractC11895b.m32001t("PublicKeyCredentialDescriptor{\n type=", String.valueOf(this.f60725w), ", \n id=", AbstractC40909b.m132600b(this.f60726x.m76050m()), ", \n transports="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        this.f60725w.getClass();
        AbstractC36221c.m115332m(parcel, 2, "public-key");
        AbstractC36221c.m115325f(parcel, 3, this.f60726x.m76050m());
        AbstractC36221c.m115336q(parcel, 4, this.f60727y);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
