package p546v7;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.permission.Permission;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mp.AbstractC25780k;
import p031b9.AbstractC2875y;
import p073cq.C11040i;
import p097ds.C12320w;
import p140f8.C14238a;
import p140f8.C14239b;
import p140f8.C14240c;
import p140f8.C14241d;
import p478s3.AbstractC32098d;
import p497t7.C33562c;
import p606x7.AbstractC38035a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v7.a */
/* JADX INFO: loaded from: classes5.dex */
public final class BinderC35751a extends Binder implements IInterface {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f152036f;

    /* JADX INFO: renamed from: g */
    public final Object f152037g;

    public BinderC35751a(C11040i c11040i) {
        this.f152036f = 6;
        this.f152037g = c11040i;
        attachInterface(this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i13 = this.f152036f;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
        int i15 = this.f152036f;
        Object obj = this.f152037g;
        switch (i15) {
            case 0:
                C12320w c12320w = (C12320w) obj;
                if (i13 >= 1 && i13 <= 16777215) {
                    parcel.enforceInterface("androidx.health.platform.client.service.IDeleteDataCallback");
                }
                if (i13 == 1598968902) {
                    parcel2.writeString("androidx.health.platform.client.service.IDeleteDataCallback");
                    return true;
                }
                if (i13 == 1) {
                    c12320w.m34349l(C23454a0.f92919a);
                    return true;
                }
                if (i13 != 2) {
                    return super.onTransact(i13, parcel, parcel2, i14);
                }
                C33562c error = (C33562c) (parcel.readInt() != 0 ? C33562c.CREATOR.createFromParcel(parcel) : null);
                AbstractC22676k.m65750j(error, "error");
                c12320w.m34248k(AbstractC38035a.m121771a(error));
                return true;
            case 1:
                C12320w c12320w2 = (C12320w) obj;
                if (i13 >= 1 && i13 <= 16777215) {
                    parcel.enforceInterface("androidx.health.platform.client.service.IFilterGrantedPermissionsCallback");
                }
                if (i13 == 1598968902) {
                    parcel2.writeString("androidx.health.platform.client.service.IFilterGrantedPermissionsCallback");
                    return true;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        return super.onTransact(i13, parcel, parcel2, i14);
                    }
                    C33562c error2 = (C33562c) (parcel.readInt() != 0 ? C33562c.CREATOR.createFromParcel(parcel) : null);
                    AbstractC22676k.m65750j(error2, "error");
                    c12320w2.m34248k(AbstractC38035a.m121771a(error2));
                    return true;
                }
                ArrayList response = parcel.createTypedArrayList(Permission.CREATOR);
                AbstractC22676k.m65750j(response, "response");
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(response, 10));
                Iterator it = response.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Permission) it.next()).f6011x);
                }
                c12320w2.m34349l(AbstractC25265s.m74103I1(arrayList));
                return true;
            case 2:
                C12320w c12320w3 = (C12320w) obj;
                if (i13 >= 1 && i13 <= 16777215) {
                    parcel.enforceInterface("androidx.health.platform.client.service.IGetChangesCallback");
                }
                if (i13 == 1598968902) {
                    parcel2.writeString("androidx.health.platform.client.service.IGetChangesCallback");
                    return true;
                }
                if (i13 == 1) {
                    C14238a response2 = (C14238a) (parcel.readInt() != 0 ? C14238a.CREATOR.createFromParcel(parcel) : null);
                    AbstractC22676k.m65750j(response2, "response");
                    c12320w3.m34349l(response2.f52003x);
                    return true;
                }
                if (i13 != 2) {
                    return super.onTransact(i13, parcel, parcel2, i14);
                }
                C33562c error3 = (C33562c) (parcel.readInt() != 0 ? C33562c.CREATOR.createFromParcel(parcel) : null);
                AbstractC22676k.m65750j(error3, "error");
                c12320w3.m34248k(AbstractC38035a.m121771a(error3));
                return true;
            case 3:
                C12320w c12320w4 = (C12320w) obj;
                if (i13 >= 1 && i13 <= 16777215) {
                    parcel.enforceInterface("androidx.health.platform.client.service.IGetChangesTokenCallback");
                }
                if (i13 == 1598968902) {
                    parcel2.writeString("androidx.health.platform.client.service.IGetChangesTokenCallback");
                    return true;
                }
                if (i13 == 1) {
                    C14239b response3 = (C14239b) (parcel.readInt() != 0 ? C14239b.CREATOR.createFromParcel(parcel) : null);
                    AbstractC22676k.m65750j(response3, "response");
                    c12320w4.m34349l(response3.f52004x);
                    return true;
                }
                if (i13 != 2) {
                    return super.onTransact(i13, parcel, parcel2, i14);
                }
                C33562c error4 = (C33562c) (parcel.readInt() != 0 ? C33562c.CREATOR.createFromParcel(parcel) : null);
                AbstractC22676k.m65750j(error4, "error");
                c12320w4.m34248k(AbstractC38035a.m121771a(error4));
                return true;
            case 4:
                C12320w c12320w5 = (C12320w) obj;
                if (i13 >= 1 && i13 <= 16777215) {
                    parcel.enforceInterface("androidx.health.platform.client.service.IInsertDataCallback");
                }
                if (i13 == 1598968902) {
                    parcel2.writeString("androidx.health.platform.client.service.IInsertDataCallback");
                    return true;
                }
                if (i13 == 1) {
                    C14240c response4 = (C14240c) (parcel.readInt() != 0 ? C14240c.CREATOR.createFromParcel(parcel) : null);
                    AbstractC22676k.m65750j(response4, "response");
                    c12320w5.m34349l(response4.f52005x);
                    return true;
                }
                if (i13 != 2) {
                    return super.onTransact(i13, parcel, parcel2, i14);
                }
                C33562c error5 = (C33562c) (parcel.readInt() != 0 ? C33562c.CREATOR.createFromParcel(parcel) : null);
                AbstractC22676k.m65750j(error5, "error");
                c12320w5.m34248k(AbstractC38035a.m121771a(error5));
                return true;
            case 5:
                C12320w c12320w6 = (C12320w) obj;
                if (i13 >= 1 && i13 <= 16777215) {
                    parcel.enforceInterface("androidx.health.platform.client.service.IReadDataRangeCallback");
                }
                if (i13 == 1598968902) {
                    parcel2.writeString("androidx.health.platform.client.service.IReadDataRangeCallback");
                    return true;
                }
                if (i13 == 1) {
                    C14241d response5 = (C14241d) (parcel.readInt() != 0 ? C14241d.CREATOR.createFromParcel(parcel) : null);
                    AbstractC22676k.m65750j(response5, "response");
                    c12320w6.m34349l(response5.f52006x);
                    return true;
                }
                if (i13 != 2) {
                    return super.onTransact(i13, parcel, parcel2, i14);
                }
                C33562c error6 = (C33562c) (parcel.readInt() != 0 ? C33562c.CREATOR.createFromParcel(parcel) : null);
                AbstractC22676k.m65750j(error6, "error");
                c12320w6.m34248k(AbstractC38035a.m121771a(error6));
                return true;
            default:
                if (i13 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i13, parcel, parcel2, i14)) {
                    return true;
                }
                if (i13 != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i16 = AbstractC25780k.f101499a;
                Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                PendingIntent pendingIntent = (PendingIntent) (parcel.readInt() != 0 ? (Parcelable) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(AbstractC2875y.m8295h(iDataAvail, "Parcel data not fully consumed, unread size: "));
                }
                AbstractC32098d.m99850q(statusCreateFromParcel, pendingIntent, (C11040i) this.f152037g);
                return true;
        }
    }

    public BinderC35751a(C12320w c12320w, int i13) {
        this.f152036f = i13;
        switch (i13) {
            case 1:
                attachInterface(this, "androidx.health.platform.client.service.IFilterGrantedPermissionsCallback");
                this.f152037g = c12320w;
                break;
            case 2:
                attachInterface(this, "androidx.health.platform.client.service.IGetChangesCallback");
                this.f152037g = c12320w;
                break;
            case 3:
                attachInterface(this, "androidx.health.platform.client.service.IGetChangesTokenCallback");
                this.f152037g = c12320w;
                break;
            case 4:
                attachInterface(this, "androidx.health.platform.client.service.IInsertDataCallback");
                this.f152037g = c12320w;
                break;
            case 5:
                attachInterface(this, "androidx.health.platform.client.service.IReadDataRangeCallback");
                this.f152037g = c12320w;
                break;
            default:
                attachInterface(this, "androidx.health.platform.client.service.IDeleteDataCallback");
                this.f152037g = c12320w;
                break;
        }
    }
}
