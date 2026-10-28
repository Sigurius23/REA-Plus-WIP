package p591wp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import v00.C35467g0;

/* JADX INFO: renamed from: wp.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C37490k extends AbstractC36219a {
    public static final Parcelable.Creator<C37490k> CREATOR = new C35467g0(25);

    /* JADX INFO: renamed from: w */
    public final LatLng f160353w;

    /* JADX INFO: renamed from: x */
    public final String f160354x;

    /* JADX INFO: renamed from: y */
    public final String f160355y;

    public C37490k(LatLng latLng, String str, String str2) {
        this.f160353w = latLng;
        this.f160354x = str;
        this.f160355y = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115331l(parcel, 2, this.f160353w, i13);
        AbstractC36221c.m115332m(parcel, 3, this.f160354x);
        AbstractC36221c.m115332m(parcel, 4, this.f160355y);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
