package k63;

import bm.C3383g;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.ktor.utils.p228io.InterfaceC20024q;
import java.nio.charset.Charset;
import l83.C23454a0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;

/* JADX INFO: renamed from: k63.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C22235e implements InterfaceC13058l {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C3383g f86648w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Charset f86649x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C32236a f86650y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC20024q f86651z;

    public C22235e(C3383g c3383g, Charset charset, C32236a c32236a, InterfaceC20024q interfaceC20024q) {
        this.f86648w = c3383g;
        this.f86649x = charset;
        this.f86650y = c32236a;
        this.f86651z = interfaceC20024q;
    }

    @Override // ec3.InterfaceC13058l
    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
        Object objCollect = this.f86648w.collect(new C22234d(interfaceC13062m, this.f86649x, this.f86650y, this.f86651z, 0), interfaceC30057d);
        return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
    }
}
