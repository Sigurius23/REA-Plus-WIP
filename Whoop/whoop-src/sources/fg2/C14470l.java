package fg2;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import ch.C4592m;
import m83.C25272z;
import nl0.EnumC26811m;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p636y3.C39169a;
import p636y3.C39174f;
import p715kotlin.jvm.functions.Function3;
import y12.AbstractC39070c;

/* JADX INFO: renamed from: fg2.l */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C14470l implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f52819w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f52820x;

    public /* synthetic */ C14470l(InterfaceC4339a interfaceC4339a, int i13) {
        this.f52819w = i13;
        this.f52820x = interfaceC4339a;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f52819w) {
            case 0:
                return AbstractC14471m.m41291k(this.f52820x, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                InterfaceC39133t0 interfaceC39133t0 = (InterfaceC39133t0) obj;
                InterfaceC39124q0 interfaceC39124q0 = (InterfaceC39124q0) obj2;
                C39169a c39169a = (C39169a) obj3;
                float f13 = ((C39174f) this.f52820x.invoke()).f168413w;
                AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(C39169a.m124758b(c39169a.f168407a, 0, 0, AbstractC39170b.m124774f(!C39174f.m124782b(f13, Float.NaN) ? interfaceC39133t0.mo724F(f13) : 0, c39169a.f168407a), 0, 11));
                return interfaceC39133t0.mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C4592m(abstractC39104j1Mo448T, 5));
            default:
                return AbstractC39070c.m124607p(this.f52820x, (EnumC26811m) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
