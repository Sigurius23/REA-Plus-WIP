package dn0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p745y81.InterfaceC39332e;
import qy0.AbstractC30773f;
import qy0.EnumC30774g;
import xo1.AbstractC38493b;

/* JADX INFO: renamed from: dn0.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C12202b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f40766E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40767w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC39332e f40768x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f40769y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ EnumC30774g f40770z;

    public /* synthetic */ C12202b(InterfaceC39332e interfaceC39332e, float f13, EnumC30774g enumC30774g, int i13, int i14) {
        this.f40767w = i14;
        this.f40768x = interfaceC39332e;
        this.f40769y = f13;
        this.f40770z = enumC30774g;
        this.f40766E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40767w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC12208h.m33818A(this.f40768x, this.f40769y, this.f40770z, this.f40766E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC30773f.m94543q(this.f40768x, this.f40769y, this.f40770z, this.f40766E, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC38493b.m123331A(this.f40768x, this.f40769y, this.f40770z, this.f40766E, (Composer) obj, iIntValue3);
        }
    }
}
