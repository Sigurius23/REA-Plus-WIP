package p402po;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import pn.C29367a;

/* JADX INFO: renamed from: po.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C29392i extends AbstractC36219a {
    public static final Parcelable.Creator<C29392i> CREATOR = new C29367a(13);

    /* JADX INFO: renamed from: w */
    public final PendingIntent f119229w;

    public C29392i(PendingIntent pendingIntent) {
        AbstractC35135w.m111094f(pendingIntent);
        this.f119229w = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C29392i) {
            return AbstractC35135w.m111097i(this.f119229w, ((C29392i) obj).f119229w);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f119229w});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115331l(parcel, 1, this.f119229w, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
