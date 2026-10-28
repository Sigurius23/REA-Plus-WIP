package p229ip;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;
import p073cq.C11040i;
import p532ur.BinderC35177f;
import p532ur.C35174c;
import p559vr.AbstractC36291a;
import p559vr.C36298h;
import p559vr.C36299i;
import p623xr.AbstractC38618n;
import sr.BinderC32898f;
import sr.C32900h;

/* JADX INFO: renamed from: ip.h */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractBinderC20797h extends Binder implements IInterface {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f78088f;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i13 = this.f78088f;
        return this;
    }

    /* JADX INFO: renamed from: j0 */
    public abstract boolean mo5672j0(int i13, Parcel parcel, Parcel parcel2);

    /* JADX INFO: renamed from: k0 */
    public abstract boolean mo57325k0(int i13, Parcel parcel, Parcel parcel2);

    /* JADX INFO: renamed from: l0 */
    public abstract boolean mo57332l0(int i13, Parcel parcel, Parcel parcel2);

    /* JADX INFO: renamed from: m0 */
    public abstract boolean mo57333m0(Parcel parcel, int i13);

    @Override // android.os.Binder
    public final boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
        int i15 = 0;
        switch (this.f78088f) {
            case 0:
                if (i13 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i13, parcel, parcel2, i14)) {
                    return true;
                }
                return mo57325k0(i13, parcel, parcel2);
            case 1:
                if (i13 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i13, parcel, parcel2, i14)) {
                    return true;
                }
                return mo5672j0(i13, parcel, parcel2);
            case 2:
                if (i13 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i13, parcel, parcel2, i14)) {
                    return true;
                }
                return mo57333m0(parcel, i13);
            case 3:
                if (i13 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i13, parcel, parcel2, i14)) {
                    return true;
                }
                return mo57332l0(i13, parcel, parcel2);
            case 4:
                if (i13 > 16777215) {
                    if (!super.onTransact(i13, parcel, parcel2, i14)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                BinderC35177f binderC35177f = (BinderC35177f) this;
                if (i13 != 2) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                int i16 = AbstractC36291a.f155530a;
                Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(AbstractC2875y.m8295h(iDataAvail, "Parcel data not fully consumed, unread size: "));
                }
                C36299i c36299i = binderC35177f.f149289i.f149291a;
                if (c36299i != null) {
                    C11040i c11040i = binderC35177f.f149288h;
                    synchronized (c36299i.f155547f) {
                        c36299i.f155546e.remove(c11040i);
                        break;
                    }
                    c36299i.m116021a().post(new C36298h(c36299i, i15));
                }
                binderC35177f.f149287g.m31831q("onGetLaunchReviewFlowInfo", new Object[0]);
                binderC35177f.f149288h.m29689d(new C35174c((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
                return true;
            default:
                if (i13 > 16777215) {
                    if (!super.onTransact(i13, parcel, parcel2, i14)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                BinderC32898f binderC32898f = (BinderC32898f) this;
                C11040i c11040i2 = binderC32898f.f137108g;
                C32900h c32900h = binderC32898f.f137109h;
                if (i13 == 2) {
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    Bundle bundle2 = (Bundle) AbstractC38618n.m123814a(parcel);
                    AbstractC38618n.m123815b(parcel);
                    binderC32898f.mo103290U(bundle2);
                } else if (i13 == 3) {
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    Bundle bundle3 = (Bundle) AbstractC38618n.m123814a(parcel);
                    AbstractC38618n.m123815b(parcel);
                    binderC32898f.mo103291b(bundle3);
                } else {
                    if (i13 != 4 && i13 != 5) {
                        return false;
                    }
                    Parcelable.Creator creator4 = Bundle.CREATOR;
                    AbstractC38618n.m123815b(parcel);
                    c32900h.f137118e.m123804c(c11040i2);
                }
                return true;
        }
    }

    public AbstractBinderC20797h(String str, int i13) {
        this.f78088f = i13;
        switch (i13) {
            case 1:
                attachInterface(this, str);
                break;
            case 2:
                attachInterface(this, str);
                break;
            case 3:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }
}
