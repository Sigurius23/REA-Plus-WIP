package p096dq;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p023ay.C2125b;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: dq.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C12274r extends AbstractC36219a {
    public static final Parcelable.Creator<C12274r> CREATOR = new C2125b(29);

    /* JADX INFO: renamed from: w */
    public ArrayList f41101w;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115334o(parcel, 1, this.f41101w);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
