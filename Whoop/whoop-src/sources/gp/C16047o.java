package gp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p319m4.AbstractC25012a;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gp.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C16047o extends AbstractC36219a {
    public static final Parcelable.Creator<C16047o> CREATOR = new C16054r0(0);

    /* JADX INFO: renamed from: w */
    public final String f60696w;

    public C16047o(String str) {
        AbstractC35135w.m111094f(str);
        this.f60696w = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16047o) {
            return this.f60696w.equals(((C16047o) obj).f60696w);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f60696w});
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f60696w, "'}", new StringBuilder("FidoAppIdExtension{appid='"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 2, this.f60696w);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
