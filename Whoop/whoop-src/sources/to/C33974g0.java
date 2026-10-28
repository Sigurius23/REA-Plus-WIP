package to;

import a30.C0332w0;
import android.os.RemoteException;
import com.google.android.gms.common.api.InterfaceC4973d;
import p073cq.C11040i;
import p309lo.C24560r;

/* JADX INFO: renamed from: to.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C33974g0 extends AbstractC33983l {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C24560r f142436c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33974g0(C24560r c24560r, C33981k c33981k, int i13) {
        super(c33981k, i13);
        this.f142436c = c24560r;
    }

    @Override // to.AbstractC33983l
    /* JADX INFO: renamed from: b */
    public final void mo107436b(InterfaceC4973d interfaceC4973d, C11040i c11040i) throws RemoteException {
        ((C0332w0) this.f142436c.f95855y).accept(interfaceC4973d, c11040i);
    }
}
