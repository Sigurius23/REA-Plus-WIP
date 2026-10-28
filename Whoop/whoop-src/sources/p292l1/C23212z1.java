package p292l1;

import java.util.LinkedHashMap;
import java.util.Map;
import m83.C25272z;
import p005a3.AbstractC0201g;
import p005a3.InterfaceC0186c0;
import p005a3.InterfaceC0225m;
import p026b2.AbstractC2316v;
import p635y2.AbstractC39104j1;
import p635y2.C39111m;
import p635y2.C39149y1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39174f;

/* JADX INFO: renamed from: l1.z1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23212z1 extends AbstractC2316v implements InterfaceC0225m, InterfaceC0186c0 {

    /* JADX INFO: renamed from: O */
    public LinkedHashMap f91904O;

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        float f13 = ((C39174f) AbstractC0201g.m506f(this, AbstractC23194w1.f91763c)).f168413w;
        float f14 = 0;
        if (f13 < f14) {
            f13 = f14;
        }
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(j7);
        boolean z4 = this.f9141N && !Float.isNaN(f13) && Float.compare(f13, f14) > 0;
        int iMo724F = !Float.isNaN(f13) ? interfaceC39133t0.mo724F(f13) : 0;
        int iMax = z4 ? Math.max(abstractC39104j1Mo448T.f168211w, iMo724F) : abstractC39104j1Mo448T.f168211w;
        int iMax2 = z4 ? Math.max(abstractC39104j1Mo448T.f168212x, iMo724F) : abstractC39104j1Mo448T.f168212x;
        if (z4) {
            LinkedHashMap linkedHashMap = this.f91904O;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.f91904O = linkedHashMap;
            }
            C39149y1 c39149y1 = AbstractC23194w1.f91762b;
            int iRound = Math.round((iMo724F - abstractC39104j1Mo448T.f168211w) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(c39149y1, Integer.valueOf(iRound));
            C39111m c39111m = AbstractC23194w1.f91761a;
            int iRound2 = Math.round((iMo724F - abstractC39104j1Mo448T.f168212x) / 2.0f);
            linkedHashMap.put(c39111m, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.f91904O;
        if (map == null) {
            map = C25272z.f99163w;
        }
        return interfaceC39133t0.mo86822W(iMax, iMax2, map, new C23206y1(iMax, abstractC39104j1Mo448T, iMax2));
    }
}
