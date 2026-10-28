package p486sp;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: sp.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C32855f extends AbstractC36219a {
    public static final Parcelable.Creator<C32855f> CREATOR = new C32854e(1);

    /* JADX INFO: renamed from: w */
    public final PendingIntent f136884w;

    public C32855f(PendingIntent pendingIntent) {
        this.f136884w = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115331l(parcel, 1, this.f136884w, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
