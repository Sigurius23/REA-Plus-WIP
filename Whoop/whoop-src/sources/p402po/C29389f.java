package p402po;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import pn.C29367a;

/* JADX INFO: renamed from: po.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C29389f extends AbstractC36219a {
    public static final Parcelable.Creator<C29389f> CREATOR = new C29367a(6);

    /* JADX INFO: renamed from: w */
    public final PendingIntent f119219w;

    public C29389f(PendingIntent pendingIntent) {
        AbstractC35135w.m111094f(pendingIntent);
        this.f119219w = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115331l(parcel, 1, this.f119219w, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
