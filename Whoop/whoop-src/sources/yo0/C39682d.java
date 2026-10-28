package yo0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import p040c0.InterfaceC3747i0;
import p291l0.InterfaceC23004v;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: yo0.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C39682d implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f170800w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39684f f170801x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f170802y;

    public /* synthetic */ C39682d(C39684f c39684f, InterfaceC4339a interfaceC4339a, int i13) {
        this.f170800w = i13;
        this.f170801x = c39684f;
        this.f170802y = interfaceC4339a;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f170800w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC39683e.m126934V(this.f170801x, this.f170802y, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC39683e.m126925M(this.f170801x, this.f170802y, (InterfaceC23004v) obj, (Composer) obj2, iIntValue2);
        }
    }
}
