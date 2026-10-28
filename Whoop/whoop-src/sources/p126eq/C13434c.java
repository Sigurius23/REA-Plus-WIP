package p126eq;

import android.os.Parcel;
import com.google.android.gms.wallet.button.ButtonOptions;
import p072cp.BinderC10935b;
import p072cp.InterfaceC10934a;
import p229ip.AbstractC20790a;
import p486sp.AbstractC32850a;

/* JADX INFO: renamed from: eq.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C13434c extends AbstractC20790a {
    /* JADX INFO: renamed from: m0 */
    public final InterfaceC10934a m38168m0(BinderC10935b binderC10935b, ButtonOptions buttonOptions) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f78074h);
        AbstractC32850a.m103120d(parcelObtain, binderC10935b);
        AbstractC32850a.m103119c(parcelObtain, buttonOptions);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                this.f78073g.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain.recycle();
                InterfaceC10934a interfaceC10934aM28986X = BinderC10935b.m28986X(parcelObtain2.readStrongBinder());
                parcelObtain2.recycle();
                return interfaceC10934aM28986X;
            } catch (RuntimeException e5) {
                parcelObtain2.recycle();
                throw e5;
            }
        } catch (Throwable th3) {
            parcelObtain.recycle();
            throw th3;
        }
    }
}
