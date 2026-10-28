package ih0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import vy0.AbstractC36588p;

/* JADX INFO: renamed from: ih0.p */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C18506p implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f72103E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f72104F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f72105G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f72106w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f72107x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f72108y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f72109z;

    public /* synthetic */ C18506p(String str, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, boolean z4, boolean z13, int i13) {
        this.f72107x = str;
        this.f72108y = interfaceC4339a;
        this.f72109z = interfaceC4339a2;
        this.f72103E = z4;
        this.f72104F = z13;
        this.f72105G = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f72106w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                String str = this.f72107x;
                InterfaceC4339a interfaceC4339a = this.f72108y;
                InterfaceC4339a interfaceC4339a2 = this.f72109z;
                return AbstractC18491e0.m53450V0(str, this.f72103E, this.f72104F, interfaceC4339a, interfaceC4339a2, this.f72105G, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC36588p.m117492x0(this.f72107x, this.f72108y, this.f72109z, this.f72103E, this.f72104F, this.f72105G, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C18506p(String str, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13) {
        this.f72107x = str;
        this.f72103E = z4;
        this.f72104F = z13;
        this.f72108y = interfaceC4339a;
        this.f72109z = interfaceC4339a2;
        this.f72105G = i13;
    }
}
