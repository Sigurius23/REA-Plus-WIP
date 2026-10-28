package p529uo;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import p310lp.AbstractBinderC24628g;
import p310lp.AbstractC24629h;

/* JADX INFO: renamed from: uo.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractBinderC35103a extends AbstractBinderC24628g implements InterfaceC35119i {
    /* JADX INFO: renamed from: X */
    public static InterfaceC35119i m111054X(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return iInterfaceQueryLocalInterface instanceof InterfaceC35119i ? (InterfaceC35119i) iInterfaceQueryLocalInterface : new C35120i0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
    }

    /* JADX INFO: renamed from: c0 */
    public static Account m111055c0(InterfaceC35119i interfaceC35119i) {
        if (interfaceC35119i == null) {
            return null;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            C35120i0 c35120i0 = (C35120i0) interfaceC35119i;
            Parcel parcelM57320c0 = c35120i0.m57320c0(c35120i0.m57322k0(), 2);
            Account account = (Account) AbstractC24629h.m71962a(parcelM57320c0, Account.CREATOR);
            parcelM57320c0.recycle();
            return account;
        } catch (RemoteException unused) {
            Log.w("AccountAccessor", "Remote account accessor probably died");
            return null;
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }
}
