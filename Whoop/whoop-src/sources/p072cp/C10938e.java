package p072cp;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.Objects;
import p127ev.C13668i;
import p558vp.C36262f;
import q30.C29938w0;

/* JADX INFO: renamed from: cp.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C10938e implements InterfaceC10939f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33832a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C13668i f33833b;

    public C10938e(C13668i c13668i, int i13) {
        this.f33832a = i13;
        switch (i13) {
            case 1:
                Objects.requireNonNull(c13668i);
                this.f33833b = c13668i;
                break;
            default:
                Objects.requireNonNull(c13668i);
                this.f33833b = c13668i;
                break;
        }
    }

    @Override // p072cp.InterfaceC10939f
    /* JADX INFO: renamed from: a */
    public final int mo28989a() {
        switch (this.f33832a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override // p072cp.InterfaceC10939f
    /* JADX INFO: renamed from: b */
    public final void mo28990b() {
        switch (this.f33832a) {
            case 0:
                C29938w0 c29938w0 = (C29938w0) this.f33833b.f48454a;
                c29938w0.getClass();
                try {
                    C36262f c36262f = (C36262f) c29938w0.f122261y;
                    c36262f.m57323l0(c36262f.m57322k0(), 12);
                    return;
                } catch (RemoteException e5) {
                    throw new RuntimeRemoteException(e5);
                }
            default:
                C29938w0 c29938w1 = (C29938w0) this.f33833b.f48454a;
                c29938w1.getClass();
                try {
                    C36262f c36262f2 = (C36262f) c29938w1.f122261y;
                    c36262f2.m57323l0(c36262f2.m57322k0(), 3);
                    return;
                } catch (RemoteException e13) {
                    throw new RuntimeRemoteException(e13);
                }
        }
    }
}
