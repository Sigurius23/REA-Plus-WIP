package p529uo;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1337q1;
import com.google.android.gms.common.C4986c;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: uo.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C35110d0 extends AbstractC36219a {
    public static final Parcelable.Creator<C35110d0> CREATOR = new C1337q1(10);

    /* JADX INFO: renamed from: w */
    public Bundle f148988w;

    /* JADX INFO: renamed from: x */
    public C4986c[] f148989x;

    /* JADX INFO: renamed from: y */
    public int f148990y;

    /* JADX INFO: renamed from: z */
    public C35113f f148991z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115324e(parcel, 1, this.f148988w);
        AbstractC36221c.m115335p(parcel, 2, this.f148989x, i13);
        int i14 = this.f148990y;
        AbstractC36221c.m115337r(parcel, 3, 4);
        parcel.writeInt(i14);
        AbstractC36221c.m115331l(parcel, 4, this.f148991z, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
