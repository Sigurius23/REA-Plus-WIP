package p635y2;

import c93.InterfaceC4351m;
import java.util.List;
import p005a3.AbstractC0210i0;
import p636y3.C39169a;

/* JADX INFO: renamed from: y2.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C39106k0 extends AbstractC0210i0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39115n0 f168215b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC4351m f168216c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39106k0(C39115n0 c39115n0, InterfaceC4351m interfaceC4351m, String str) {
        super(str);
        this.f168215b = c39115n0;
        this.f168216c = interfaceC4351m;
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: a */
    public final InterfaceC39130s0 mo521a(InterfaceC39133t0 interfaceC39133t0, List list, long j7) {
        C39115n0 c39115n0 = this.f168215b;
        C39097h0 c39097h0 = c39115n0.f168231H;
        c39097h0.f168188w = interfaceC39133t0.getLayoutDirection();
        c39097h0.f168189x = interfaceC39133t0.getDensity();
        c39097h0.f168190y = interfaceC39133t0.getFontScale();
        boolean zMo781A = interfaceC39133t0.mo781A();
        InterfaceC4351m interfaceC4351m = this.f168216c;
        if (zMo781A || c39115n0.f168240w.f759G == null) {
            c39115n0.f168243z = 0;
            InterfaceC39130s0 interfaceC39130s0 = (InterfaceC39130s0) interfaceC4351m.invoke(c39097h0, new C39169a(j7));
            return new C39103j0(interfaceC39130s0, c39115n0, c39115n0.f168243z, interfaceC39130s0);
        }
        c39115n0.f168228E = 0;
        InterfaceC39130s0 interfaceC39130s1 = (InterfaceC39130s0) interfaceC4351m.invoke(c39115n0.f168232I, new C39169a(j7));
        return new C39100i0(interfaceC39130s1, c39115n0, c39115n0.f168228E, interfaceC39130s1);
    }
}
