package bu2;

import androidx.compose.runtime.Composer;
import p040c0.InterfaceC3747i0;
import p291l0.InterfaceC23004v;
import p715kotlin.jvm.functions.Function3;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: bu2.f */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C3645f implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14840w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC25312u f14841x;

    public /* synthetic */ C3645f(int i13, InterfaceC25312u interfaceC25312u) {
        this.f14840w = i13;
        this.f14841x = interfaceC25312u;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f14840w) {
            case 0:
                return AbstractC3646g.m11247k((C3643d) this.f14841x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return AbstractC3649j.m11259e((C3647h) this.f14841x, (InterfaceC23004v) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
