package sr;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.integrity.StandardIntegrityException;
import p073cq.C11040i;
import p623xr.AbstractC38618n;
import p623xr.C38620p;
import p623xr.InterfaceC38622r;

/* JADX INFO: renamed from: sr.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C32896d extends AbstractC32899g {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C32900h f137100E;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f137101y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C11040i f137102z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32896d(C32900h c32900h, C11040i c11040i, long j7, C11040i c11040i2) {
        super(c32900h, c11040i);
        this.f137101y = j7;
        this.f137102z = c11040i2;
        this.f137100E = c32900h;
    }

    @Override // p623xr.AbstractRunnableC38625u
    /* JADX INFO: renamed from: b */
    public final void mo103289b() {
        C11040i c11040i = this.f137102z;
        long j7 = this.f137101y;
        C32900h c32900h = this.f137100E;
        if (C32900h.m103298d(c32900h)) {
            mo103294a(new StandardIntegrityException(-2, null));
            return;
        }
        if (C32900h.m103297c(c32900h)) {
            mo103294a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            InterfaceC38622r interfaceC38622r = c32900h.f137118e.f166107n;
            Bundle bundleM103296b = C32900h.m103296b(c32900h, j7);
            BinderC32898f binderC32898f = new BinderC32898f(c32900h, c11040i, 1);
            C38620p c38620p = (C38620p) interfaceC38622r;
            c38620p.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            int i13 = AbstractC38618n.f166128a;
            parcelObtain.writeInt(1);
            bundleM103296b.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(binderC32898f);
            try {
                c38620p.f166131f.transact(2, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (RemoteException e5) {
            c32900h.f137114a.m123817a(e5, "warmUpIntegrityToken(%s)", Long.valueOf(j7));
            c11040i.m29688c(new StandardIntegrityException(-100, e5));
        }
    }
}
