package p096dq;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: dq.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C12266j extends AbstractC36219a {
    public static final Parcelable.Creator<C12266j> CREATOR = new C12280x(14);

    /* JADX INFO: renamed from: w */
    public PendingIntent f41073w;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115331l(parcel, 1, this.f41073w, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
