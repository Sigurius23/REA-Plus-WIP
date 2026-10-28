package p095dp;

import android.os.Parcel;
import p072cp.BinderC10935b;
import p072cp.InterfaceC10934a;
import p229ip.AbstractC20790a;
import p310lp.AbstractC24629h;

/* JADX INFO: renamed from: dp.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C12243g extends AbstractC20790a {
    /* JADX INFO: renamed from: m0 */
    public final InterfaceC10934a m34090m0(BinderC10935b binderC10935b, String str, int i13) {
        Parcel parcelM57322k0 = m57322k0();
        AbstractC24629h.m71963b(parcelM57322k0, binderC10935b);
        parcelM57322k0.writeString(str);
        parcelM57322k0.writeInt(i13);
        Parcel parcelM57320c0 = m57320c0(parcelM57322k0, 2);
        InterfaceC10934a interfaceC10934aM28986X = BinderC10935b.m28986X(parcelM57320c0.readStrongBinder());
        parcelM57320c0.recycle();
        return interfaceC10934aM28986X;
    }

    /* JADX INFO: renamed from: n0 */
    public final InterfaceC10934a m34091n0(BinderC10935b binderC10935b, String str, int i13) {
        Parcel parcelM57322k0 = m57322k0();
        AbstractC24629h.m71963b(parcelM57322k0, binderC10935b);
        parcelM57322k0.writeString(str);
        parcelM57322k0.writeInt(i13);
        Parcel parcelM57320c0 = m57320c0(parcelM57322k0, 4);
        InterfaceC10934a interfaceC10934aM28986X = BinderC10935b.m28986X(parcelM57320c0.readStrongBinder());
        parcelM57320c0.recycle();
        return interfaceC10934aM28986X;
    }

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC10934a m34092o0(BinderC10935b binderC10935b, String str, boolean z4, long j7) {
        Parcel parcelM57322k0 = m57322k0();
        AbstractC24629h.m71963b(parcelM57322k0, binderC10935b);
        parcelM57322k0.writeString(str);
        parcelM57322k0.writeInt(z4 ? 1 : 0);
        parcelM57322k0.writeLong(j7);
        Parcel parcelM57320c0 = m57320c0(parcelM57322k0, 7);
        InterfaceC10934a interfaceC10934aM28986X = BinderC10935b.m28986X(parcelM57320c0.readStrongBinder());
        parcelM57320c0.recycle();
        return interfaceC10934aM28986X;
    }

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC10934a m34093p0(BinderC10935b binderC10935b, String str, int i13, BinderC10935b binderC10935b2) {
        Parcel parcelM57322k0 = m57322k0();
        AbstractC24629h.m71963b(parcelM57322k0, binderC10935b);
        parcelM57322k0.writeString(str);
        parcelM57322k0.writeInt(i13);
        AbstractC24629h.m71963b(parcelM57322k0, binderC10935b2);
        Parcel parcelM57320c0 = m57320c0(parcelM57322k0, 8);
        InterfaceC10934a interfaceC10934aM28986X = BinderC10935b.m28986X(parcelM57320c0.readStrongBinder());
        parcelM57320c0.recycle();
        return interfaceC10934aM28986X;
    }
}
