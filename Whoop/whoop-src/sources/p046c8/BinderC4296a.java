package p046c8;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.fragment.app.RunnableC1283d;
import androidx.fragment.app.RunnableC1319m;
import aq0.C1898i;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p009a8.RunnableC0533c;

/* JADX INFO: renamed from: c8.a */
/* JADX INFO: loaded from: classes5.dex */
public final class BinderC4296a extends Binder implements IInterface {

    /* JADX INFO: renamed from: f */
    public final Context f17415f;

    /* JADX INFO: renamed from: g */
    public final Executor f17416g;

    public BinderC4296a(Context context, ExecutorService executorService) {
        attachInterface(this, "androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService");
        this.f17415f = context;
        this.f17416g = executorService;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i13, Parcel parcel, Parcel parcel2, int i14) {
        if (i13 >= 1 && i13 <= 16777215) {
            parcel.enforceInterface("androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService");
        }
        if (i13 == 1598968902) {
            parcel2.writeString("androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService");
            return true;
        }
        C4299d c4299d = null;
        C4297b c4297b = null;
        C4298c c4298c = null;
        if (i13 == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.health.platform.client.impl.sdkservice.ISetPermissionTokenCallback");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof C4299d)) {
                    c4299d = new C4299d();
                    c4299d.f17419f = strongBinder;
                } else {
                    c4299d = (C4299d) iInterfaceQueryLocalInterface;
                }
            }
            m13541s(string);
            this.f17416g.execute(new RunnableC1283d(this, string2, c4299d, 3));
            return true;
        }
        if (i13 == 2) {
            String string3 = parcel.readString();
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.health.platform.client.impl.sdkservice.IGetPermissionTokenCallback");
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof C4298c)) {
                    c4298c = new C4298c();
                    c4298c.f17418f = strongBinder2;
                } else {
                    c4298c = (C4298c) iInterfaceQueryLocalInterface2;
                }
            }
            m13541s(string3);
            this.f17416g.execute(new RunnableC0533c(4, this, c4298c));
            return true;
        }
        if (i13 != 3) {
            return super.onTransact(i13, parcel, parcel2, i14);
        }
        String string4 = parcel.readString();
        IBinder strongBinder3 = parcel.readStrongBinder();
        if (strongBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("androidx.health.platform.client.impl.sdkservice.IGetIsInForegroundCallback");
            if (iInterfaceQueryLocalInterface3 == null || !(iInterfaceQueryLocalInterface3 instanceof C4297b)) {
                c4297b = new C4297b();
                c4297b.f17417f = strongBinder3;
            } else {
                c4297b = (C4297b) iInterfaceQueryLocalInterface3;
            }
        }
        m13541s(string4);
        this.f17416g.execute(new RunnableC1319m(c4297b, 10));
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final void m13541s(String str) {
        String[] packagesForUid = this.f17415f.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (str == null || packagesForUid == null || Arrays.stream(packagesForUid).noneMatch(new C1898i(str, 1))) {
            throw new SecurityException("Invalid package name!");
        }
        if (!"com.google.android.apps.healthdata".equals(str)) {
            throw new SecurityException("Not allowed!");
        }
    }
}
