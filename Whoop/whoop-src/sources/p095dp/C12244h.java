package p095dp;

import android.os.Parcel;
import p072cp.BinderC10935b;
import p072cp.InterfaceC10934a;
import p229ip.AbstractC20790a;
import p310lp.AbstractC24629h;

/* JADX INFO: renamed from: dp.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C12244h extends AbstractC20790a {
    /* JADX INFO: renamed from: m0 */
    public final InterfaceC10934a m34094m0(BinderC10935b binderC10935b, String str, int i13, BinderC10935b binderC10935b2) {
        Parcel parcelM57322k0 = m57322k0();
        AbstractC24629h.m71963b(parcelM57322k0, binderC10935b);
        parcelM57322k0.writeString(str);
        parcelM57322k0.writeInt(i13);
        AbstractC24629h.m71963b(parcelM57322k0, binderC10935b2);
        Parcel parcelM57320c0 = m57320c0(parcelM57322k0, 2);
        InterfaceC10934a interfaceC10934aM28986X = BinderC10935b.m28986X(parcelM57320c0.readStrongBinder());
        parcelM57320c0.recycle();
        return interfaceC10934aM28986X;
    }

    /* JADX INFO: renamed from: n0 */
    public final InterfaceC10934a m34095n0(BinderC10935b binderC10935b, String str, int i13, BinderC10935b binderC10935b2) {
        Parcel parcelM57322k0 = m57322k0();
        AbstractC24629h.m71963b(parcelM57322k0, binderC10935b);
        parcelM57322k0.writeString(str);
        parcelM57322k0.writeInt(i13);
        AbstractC24629h.m71963b(parcelM57322k0, binderC10935b2);
        Parcel parcelM57320c0 = m57320c0(parcelM57322k0, 3);
        InterfaceC10934a interfaceC10934aM28986X = BinderC10935b.m28986X(parcelM57320c0.readStrongBinder());
        parcelM57320c0.recycle();
        return interfaceC10934aM28986X;
    }
}
