package gp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException;
import java.util.Arrays;
import mp.AbstractC25753b;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gp.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16020a0 extends AbstractC36219a {
    public static final Parcelable.Creator<C16020a0> CREATOR = new C16040k0(10);

    /* JADX INFO: renamed from: w */
    public final EnumC16063z f60616w;

    /* JADX INFO: renamed from: x */
    public final String f60617x;

    static {
        new C16020a0("supported", null);
        new C16020a0("not-supported", null);
    }

    public C16020a0(String str, String str2) {
        AbstractC35135w.m111094f(str);
        try {
            this.f60616w = EnumC16063z.m45358b(str);
            this.f60617x = str2;
        } catch (TokenBinding$UnsupportedTokenBindingStatusException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16020a0)) {
            return false;
        }
        C16020a0 c16020a0 = (C16020a0) obj;
        return AbstractC25753b.m75996h(this.f60616w, c16020a0.f60616w) && AbstractC25753b.m75996h(this.f60617x, c16020a0.f60617x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f60616w, this.f60617x});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 2, this.f60616w.f60746w);
        AbstractC36221c.m115332m(parcel, 3, this.f60617x);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
