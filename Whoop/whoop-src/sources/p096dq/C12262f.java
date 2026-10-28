package p096dq;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: dq.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C12262f extends AbstractC36219a {
    public static final Parcelable.Creator<C12262f> CREATOR = new C12280x(8);

    /* JADX INFO: renamed from: E */
    public boolean f41041E;

    /* JADX INFO: renamed from: F */
    public String f41042F;

    /* JADX INFO: renamed from: w */
    public ArrayList f41043w;

    /* JADX INFO: renamed from: x */
    public String f41044x;

    /* JADX INFO: renamed from: y */
    public String f41045y;

    /* JADX INFO: renamed from: z */
    public ArrayList f41046z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115329j(parcel, 2, this.f41043w);
        AbstractC36221c.m115332m(parcel, 4, this.f41044x);
        AbstractC36221c.m115332m(parcel, 5, this.f41045y);
        AbstractC36221c.m115329j(parcel, 6, this.f41046z);
        boolean z4 = this.f41041E;
        AbstractC36221c.m115337r(parcel, 7, 4);
        parcel.writeInt(z4 ? 1 : 0);
        AbstractC36221c.m115332m(parcel, 8, this.f41042F);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
