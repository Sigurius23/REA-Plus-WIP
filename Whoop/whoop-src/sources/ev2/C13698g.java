package ev2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.data.local.room.dao.wipeable.C6516c;
import ez0.AbstractC13758b;
import m83.C25272z;
import mi2.AbstractC25589l;
import p040c0.InterfaceC3747i0;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p636y3.C39169a;
import p710im1.AbstractC18661c;
import p715kotlin.jvm.functions.Function3;
import p720m91.InterfaceC25312u;
import p739ui0.AbstractC35014p;
import r71.AbstractC31052b;
import sj1.AbstractC32563a;

/* JADX INFO: renamed from: ev2.g */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C13698g implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48533w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f48534x;

    public /* synthetic */ C13698g(float f13, int i13) {
        this.f48533w = i13;
        this.f48534x = f13;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f48533w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC13705n.m38684M(this.f48534x, (Modifier) obj, (Composer) obj2, iIntValue);
            case 1:
                return AbstractC13758b.m39111g(this.f48534x, (InterfaceC39133t0) obj, (InterfaceC39124q0) obj2, (C39169a) obj3);
            case 2:
                InterfaceC39133t0 interfaceC39133t0 = (InterfaceC39133t0) obj;
                int iMo724F = interfaceC39133t0.mo724F(this.f48534x);
                long j7 = ((C39169a) obj3).f168407a;
                int i13 = iMo724F * 2;
                AbstractC39104j1 abstractC39104j1Mo448T = ((InterfaceC39124q0) obj2).mo448T(AbstractC39170b.m124777i(0, j7, i13));
                int i14 = abstractC39104j1Mo448T.f168212x - i13;
                return interfaceC39133t0.mo86822W(abstractC39104j1Mo448T.f168211w, i14, C25272z.f99163w, new C6516c(abstractC39104j1Mo448T, iMo724F, 5));
            case 3:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC18661c.m54140m(this.f48534x, (InterfaceC25312u) obj, (Composer) obj2, iIntValue2);
            case 4:
                return AbstractC25589l.m75286A(this.f48534x, (InterfaceC39133t0) obj, (InterfaceC39124q0) obj2, (C39169a) obj3);
            case 5:
                return AbstractC31052b.m95596w(this.f48534x, (InterfaceC39133t0) obj, (InterfaceC39124q0) obj2, (C39169a) obj3);
            case 6:
                return AbstractC32563a.m101599k(this.f48534x, (InterfaceC39133t0) obj, (InterfaceC39124q0) obj2, (C39169a) obj3);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                return AbstractC35014p.m110622m(this.f48534x, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue3);
        }
    }
}
