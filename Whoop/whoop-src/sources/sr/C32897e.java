package sr;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.integrity.StandardIntegrityException;
import p073cq.C11040i;
import p623xr.AbstractC38618n;
import p623xr.C38620p;
import p623xr.InterfaceC38622r;

/* JADX INFO: renamed from: sr.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C32897e extends AbstractC32899g {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f137103E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C11040i f137104F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C32900h f137105G;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C32907o f137106y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f137107z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32897e(C32900h c32900h, C11040i c11040i, C32907o c32907o, long j7, long j13, C11040i c11040i2) {
        super(c32900h, c11040i);
        this.f137106y = c32907o;
        this.f137107z = j7;
        this.f137103E = j13;
        this.f137104F = c11040i2;
        this.f137105G = c32900h;
    }

    @Override // p623xr.AbstractRunnableC38625u
    /* JADX INFO: renamed from: b */
    public final void mo103289b() {
        C32907o c32907o = this.f137106y;
        C11040i c11040i = this.f137104F;
        C32900h c32900h = this.f137105G;
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
            Bundle bundleM103295a = C32900h.m103295a(c32900h, c32907o, this.f137107z, this.f137103E);
            BinderC32898f binderC32898f = new BinderC32898f(c32900h, c11040i, 0);
            C38620p c38620p = (C38620p) interfaceC38622r;
            c38620p.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            int i13 = AbstractC38618n.f166128a;
            parcelObtain.writeInt(1);
            bundleM103295a.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(binderC32898f);
            try {
                c38620p.f166131f.transact(3, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (RemoteException e5) {
            c32900h.f137114a.m123817a(e5, "requestExpressIntegrityToken(%s, %s, %s)", c32907o.f137127a, c32907o.f137128b, Long.valueOf(this.f137107z));
            c11040i.m29688c(new StandardIntegrityException(-100, e5));
        }
    }
}
