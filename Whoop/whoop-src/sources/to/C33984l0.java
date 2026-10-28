package to;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.C4986c;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import p073cq.C11040i;
import p503tp.C34047r;
import pg3.C29203o;

/* JADX INFO: renamed from: to.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C33984l0 extends AbstractC33968d0 {

    /* JADX INFO: renamed from: b */
    public final C11040i f142456b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f142457c;

    /* JADX INFO: renamed from: d */
    public final Object f142458d;

    public C33984l0(int i13, C11040i c11040i) {
        super(i13);
        this.f142456b = c11040i;
    }

    /* JADX INFO: renamed from: h */
    private final /* bridge */ /* synthetic */ void m107457h(C29203o c29203o, boolean z4) {
    }

    /* JADX INFO: renamed from: i */
    private final /* bridge */ /* synthetic */ void m107458i(C29203o c29203o, boolean z4) {
    }

    @Override // to.AbstractC33988n0
    /* JADX INFO: renamed from: a */
    public final void mo107451a(Status status) {
        this.f142456b.m29688c(new ApiException(status));
    }

    @Override // to.AbstractC33988n0
    /* JADX INFO: renamed from: b */
    public final void mo107452b(Exception exc) {
        this.f142456b.m29688c(exc);
    }

    @Override // to.AbstractC33988n0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo107453c(C29203o c29203o, boolean z4) {
        int i13 = this.f142457c;
    }

    @Override // to.AbstractC33988n0
    /* JADX INFO: renamed from: d */
    public final void mo107454d(C34003v c34003v) throws DeadObjectException {
        try {
            m107459j(c34003v);
        } catch (DeadObjectException e5) {
            mo107451a(AbstractC33988n0.m107461e(e5));
            throw e5;
        } catch (RemoteException e13) {
            mo107451a(AbstractC33988n0.m107461e(e13));
        } catch (RuntimeException e14) {
            this.f142456b.m29688c(e14);
        }
    }

    @Override // to.AbstractC33968d0
    /* JADX INFO: renamed from: f */
    public final C4986c[] mo107425f(C34003v c34003v) {
        switch (this.f142457c) {
            case 0:
                break;
            default:
                break;
        }
        return null;
    }

    @Override // to.AbstractC33968d0
    /* JADX INFO: renamed from: g */
    public final boolean mo107426g(C34003v c34003v) {
        switch (this.f142457c) {
            case 0:
                return true;
            default:
                return ((C33972f0) c34003v.f142499k.get((C33979j) this.f142458d)) != null;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m107459j(C34003v c34003v) {
        switch (this.f142457c) {
            case 0:
                C33972f0 c33972f0 = (C33972f0) this.f142458d;
                AbstractC33983l abstractC33983l = c33972f0.f142433a;
                abstractC33983l.mo107436b(c34003v.f142495g, this.f142456b);
                C33979j c33979j = abstractC33983l.f142454a.f142452b;
                if (c33979j != null) {
                    c34003v.f142499k.put(c33979j, c33972f0);
                }
                break;
            default:
                C33972f0 c33972f1 = (C33972f0) c34003v.f142499k.remove((C33979j) this.f142458d);
                if (c33972f1 == null) {
                    this.f142456b.m29689d(Boolean.FALSE);
                } else {
                    ((C34047r) ((C33976h0) c33972f1.f142434b).f142438b.f95856z).accept(c34003v.f142495g, this.f142456b);
                    c33972f1.f142433a.f142454a.f142452b = null;
                }
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C33984l0(C33979j c33979j, C11040i c11040i) {
        this(4, c11040i);
        this.f142457c = 1;
        this.f142458d = c33979j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C33984l0(C33972f0 c33972f0, C11040i c11040i) {
        this(3, c11040i);
        this.f142457c = 0;
        this.f142458d = c33972f0;
    }
}
