package gp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;
import java.util.Arrays;
import p031b9.AbstractC2875y;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gp.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C16057t extends AbstractC36219a {
    public static final Parcelable.Creator<C16057t> CREATOR = new C16040k0(3);

    /* JADX INFO: renamed from: w */
    public final EnumC16059v f60729w;

    /* JADX INFO: renamed from: x */
    public final C16041l f60730x;

    public C16057t(String str, int i13) {
        AbstractC35135w.m111094f(str);
        try {
            this.f60729w = EnumC16059v.m45356b(str);
            try {
                this.f60730x = C16041l.m45352b(i13);
            } catch (COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException e5) {
                throw new IllegalArgumentException(e5);
            }
        } catch (PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16057t)) {
            return false;
        }
        C16057t c16057t = (C16057t) obj;
        return this.f60729w.equals(c16057t.f60729w) && this.f60730x.equals(c16057t.f60730x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f60729w, this.f60730x});
    }

    public final String toString() {
        return AbstractC2875y.m8300m("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f60729w), ", \n algorithm=", String.valueOf(this.f60730x), "\n }");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [gp.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        this.f60729w.getClass();
        AbstractC36221c.m115332m(parcel, 2, "public-key");
        AbstractC36221c.m115330k(parcel, 3, Integer.valueOf(this.f60730x.f60674w.mo45338a()));
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
