package to;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import pg3.C29203o;

/* JADX INFO: renamed from: to.n0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC33988n0 {

    /* JADX INFO: renamed from: a */
    public final int f142464a;

    public AbstractC33988n0(int i13) {
        this.f142464a = i13;
    }

    /* JADX INFO: renamed from: e */
    public static Status m107461e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo107451a(Status status);

    /* JADX INFO: renamed from: b */
    public abstract void mo107452b(Exception exc);

    /* JADX INFO: renamed from: c */
    public abstract void mo107453c(C29203o c29203o, boolean z4);

    /* JADX INFO: renamed from: d */
    public abstract void mo107454d(C34003v c34003v);
}
