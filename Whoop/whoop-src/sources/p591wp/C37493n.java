package p591wp;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p072cp.BinderC10935b;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import v00.C35467g0;

/* JADX INFO: renamed from: wp.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C37493n extends AbstractC36219a {
    public static final Parcelable.Creator<C37493n> CREATOR = new C35467g0(27);

    /* JADX INFO: renamed from: w */
    public final C37481b f160369w;

    public C37493n(IBinder iBinder) {
        this.f160369w = new C37481b(BinderC10935b.m28986X(iBinder));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115327h(parcel, 2, this.f160369w.f160319a.asBinder());
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
