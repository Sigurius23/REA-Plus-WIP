package gp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p126eq.C13433b;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gp.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C16049p extends AbstractC36219a {
    public static final Parcelable.Creator<C16049p> CREATOR = new C13433b(26);

    /* JADX INFO: renamed from: w */
    public final boolean f60701w;

    public C16049p(boolean z4) {
        this.f60701w = z4;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C16049p) && this.f60701w == ((C16049p) obj).f60701w;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f60701w)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f60701w ? 1 : 0);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
