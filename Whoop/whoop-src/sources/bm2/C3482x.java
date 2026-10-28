package bm2;

import android.content.Context;
import java.util.Set;
import kd1.AbstractC22390d;
import p164g2.InterfaceC15250v;
import p390p1.InterfaceC28601c1;
import p708hb2.AbstractC42784j;
import p715kotlin.jvm.functions.Function1;
import w80.AbstractC36941b;

/* JADX INFO: renamed from: bm2.x */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3482x implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13667w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f13668x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f13669y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28601c1 f13670z;

    public /* synthetic */ C3482x(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, int i13) {
        this.f13667w = i13;
        this.f13668x = interfaceC28601c1;
        this.f13669y = interfaceC28601c2;
        this.f13670z = interfaceC28601c3;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f13667w) {
            case 0:
                return AbstractC3436e0.m9928C0(this.f13668x, this.f13669y, this.f13670z, (String) obj);
            case 1:
                return AbstractC3436e0.m10020v0(this.f13668x, this.f13669y, this.f13670z, (String) obj);
            case 2:
                return AbstractC3436e0.m10028z0(this.f13668x, this.f13669y, this.f13670z, (String) obj);
            case 3:
                return AbstractC42784j.m48349y(this.f13668x, this.f13669y, this.f13670z, (Set) obj);
            case 4:
                return AbstractC22390d.m64399J(this.f13668x, this.f13669y, this.f13670z, (Context) obj);
            default:
                return AbstractC36941b.m118594y(this.f13668x, this.f13669y, this.f13670z, (InterfaceC15250v) obj);
        }
    }
}
