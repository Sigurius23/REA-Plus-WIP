package to;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.C4986c;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.Objects;
import p073cq.C11040i;
import p073cq.C11052u;
import p249jc.C21567b;
import p478s3.AbstractC32098d;
import pg3.C29203o;
import so.C32800q;

/* JADX INFO: renamed from: to.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C33986m0 extends AbstractC33968d0 {

    /* JADX INFO: renamed from: b */
    public final AbstractC33993q f142461b;

    /* JADX INFO: renamed from: c */
    public final C11040i f142462c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC33989o f142463d;

    public C33986m0(int i13, AbstractC33993q abstractC33993q, C11040i c11040i, InterfaceC33989o interfaceC33989o) {
        super(i13);
        this.f142462c = c11040i;
        this.f142461b = abstractC33993q;
        this.f142463d = interfaceC33989o;
        if (i13 == 2 && abstractC33993q.f142473b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // to.AbstractC33988n0
    /* JADX INFO: renamed from: a */
    public final void mo107451a(Status status) {
        ((C21567b) this.f142463d).getClass();
        this.f142462c.m29688c(AbstractC32098d.m99841g(status));
    }

    @Override // to.AbstractC33988n0
    /* JADX INFO: renamed from: b */
    public final void mo107452b(Exception exc) {
        this.f142462c.m29688c(exc);
    }

    @Override // to.AbstractC33988n0
    /* JADX INFO: renamed from: c */
    public final void mo107453c(C29203o c29203o, boolean z4) {
        Boolean boolValueOf = Boolean.valueOf(z4);
        Map map = (Map) c29203o.f118199x;
        C11040i c11040i = this.f142462c;
        map.put(c11040i, boolValueOf);
        C11052u c11052u = c11040i.f34644a;
        C32800q c32800q = new C32800q();
        c32800q.f136504w = c11040i;
        Objects.requireNonNull(c29203o);
        c32800q.f136505x = c29203o;
        c11052u.addOnCompleteListener(c32800q);
    }

    @Override // to.AbstractC33988n0
    /* JADX INFO: renamed from: d */
    public final void mo107454d(C34003v c34003v) throws DeadObjectException {
        C11040i c11040i = this.f142462c;
        try {
            this.f142461b.mo107449b(c34003v.f142495g, c11040i);
        } catch (DeadObjectException e5) {
            throw e5;
        } catch (RemoteException e13) {
            mo107451a(AbstractC33988n0.m107461e(e13));
        } catch (RuntimeException e14) {
            c11040i.m29688c(e14);
        }
    }

    @Override // to.AbstractC33968d0
    /* JADX INFO: renamed from: f */
    public final C4986c[] mo107425f(C34003v c34003v) {
        return this.f142461b.f142472a;
    }

    @Override // to.AbstractC33968d0
    /* JADX INFO: renamed from: g */
    public final boolean mo107426g(C34003v c34003v) {
        return this.f142461b.f142473b;
    }
}
