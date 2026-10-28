package p486sp;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.health.platform.client.proto.C1533u;
import com.google.android.gms.common.api.Status;
import p073cq.C11040i;
import p096dq.AbstractC12257a;
import p096dq.C12266j;
import p096dq.C12268l;
import p478s3.AbstractC32098d;

/* JADX INFO: renamed from: sp.j */
/* JADX INFO: loaded from: classes6.dex */
public final class BinderC32859j extends Binder implements InterfaceC32858i, IInterface {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f136889f;

    /* JADX INFO: renamed from: g */
    public final C11040i f136890g;

    public BinderC32859j(int i13, C11040i c11040i) {
        this.f136889f = i13;
        attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        this.f136890g = c11040i;
    }

    @Override // p486sp.InterfaceC32858i
    /* JADX INFO: renamed from: K */
    public void mo103121K(int i13, boolean z4) {
        switch (this.f136889f) {
            case 0:
                AbstractC32098d.m99850q(new Status(i13, null, null, null), Boolean.valueOf(z4), this.f136890g);
                break;
        }
    }

    @Override // p486sp.InterfaceC32858i
    /* JADX INFO: renamed from: R */
    public void mo103122R(Status status, C12268l c12268l) {
        switch (this.f136889f) {
            case 2:
                int i13 = AbstractC12257a.f41026a;
                boolean zM15593b = status.m15593b();
                C11040i c11040i = this.f136890g;
                if (!zM15593b) {
                    c11040i.m29686a(AbstractC32098d.m99841g(status));
                } else {
                    c11040i.m29687b(c12268l);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m103125X(Status status, C12266j c12266j) {
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m103126c0(Status status, C12268l c12268l) {
    }

    /* JADX INFO: renamed from: j0 */
    public final void m103127j0(int i13, boolean z4) {
    }

    @Override // p486sp.InterfaceC32858i
    /* JADX INFO: renamed from: o */
    public void mo103123o(Status status, boolean z4) {
        switch (this.f136889f) {
            case 0:
                AbstractC32098d.m99850q(status, Boolean.valueOf(z4), this.f136890g);
                break;
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
        boolean z4;
        if (i13 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i13, parcel, parcel2, i14)) {
            return true;
        }
        switch (i13) {
            case 1:
                parcel.readInt();
                AbstractC32850a.m103118b(parcel);
                return true;
            case 2:
                parcel.readInt();
                AbstractC32850a.m103118b(parcel);
                return true;
            case 3:
                int i15 = parcel.readInt();
                int i16 = AbstractC32850a.f136879a;
                z4 = parcel.readInt() != 0;
                AbstractC32850a.m103118b(parcel);
                mo103121K(i15, z4);
                return true;
            case 4:
                parcel.readInt();
                AbstractC32850a.m103118b(parcel);
                return true;
            case 5:
            default:
                return false;
            case 6:
                parcel.readInt();
                int i17 = AbstractC32850a.f136879a;
                parcel.readInt();
                AbstractC32850a.m103118b(parcel);
                return true;
            case 7:
                AbstractC32850a.m103118b(parcel);
                return true;
            case 8:
                AbstractC32850a.m103118b(parcel);
                return true;
            case 9:
                Status status = (Status) AbstractC32850a.m103117a(parcel, Status.CREATOR);
                z4 = parcel.readInt() != 0;
                AbstractC32850a.m103118b(parcel);
                mo103123o(status, z4);
                return true;
            case 10:
                AbstractC32850a.m103118b(parcel);
                return true;
            case 11:
                AbstractC32850a.m103118b(parcel);
                return true;
            case 12:
                AbstractC32850a.m103118b(parcel);
                return true;
            case 13:
                AbstractC32850a.m103118b(parcel);
                return true;
            case 14:
                Status status2 = (Status) AbstractC32850a.m103117a(parcel, Status.CREATOR);
                C12268l c12268l = (C12268l) AbstractC32850a.m103117a(parcel, C12268l.CREATOR);
                AbstractC32850a.m103118b(parcel);
                mo103122R(status2, c12268l);
                return true;
            case 15:
                AbstractC32850a.m103118b(parcel);
                return true;
            case 16:
                AbstractC32850a.m103118b(parcel);
                return true;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC32850a.m103118b(parcel);
                return true;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                parcel.readInt();
                AbstractC32850a.m103118b(parcel);
                return true;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                Status status3 = (Status) AbstractC32850a.m103117a(parcel, Status.CREATOR);
                C12266j c12266j = (C12266j) AbstractC32850a.m103117a(parcel, C12266j.CREATOR);
                AbstractC32850a.m103118b(parcel);
                mo103124q(status3, c12266j);
                return true;
            case 20:
                AbstractC32850a.m103118b(parcel);
                return true;
        }
    }

    @Override // p486sp.InterfaceC32858i
    /* JADX INFO: renamed from: q */
    public void mo103124q(Status status, C12266j c12266j) {
        switch (this.f136889f) {
            case 1:
                int i13 = AbstractC12257a.f41026a;
                boolean zM15593b = status.m15593b();
                C11040i c11040i = this.f136890g;
                if (!zM15593b) {
                    c11040i.m29686a(AbstractC32098d.m99841g(status));
                } else {
                    c11040i.m29687b(c12266j);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m103128s(Status status, boolean z4) {
    }
}
