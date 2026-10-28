package h01;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: h01.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16545l implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC28670t2 f63661E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC28601c1 f63662F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC28670t2 f63663G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC28601c1 f63664H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC28601c1 f63665I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ InterfaceC16556w f63666J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63667w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28670t2 f63668x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f63669y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f63670z;

    public /* synthetic */ C16545l(C16550q c16550q, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c1, Function1 function1, String str, InterfaceC28601c1 interfaceC28601c2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28601c1 interfaceC28601c3, InterfaceC28670t2 interfaceC28670t4) {
        this.f63666J = c16550q;
        this.f63668x = interfaceC28670t2;
        this.f63662F = interfaceC28601c1;
        this.f63669y = function1;
        this.f63670z = str;
        this.f63664H = interfaceC28601c2;
        this.f63661E = interfaceC28670t3;
        this.f63665I = interfaceC28601c3;
        this.f63663G = interfaceC28670t4;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f63667w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC16549p.m46754H((C16550q) this.f63666J, this.f63668x, this.f63662F, this.f63669y, this.f63670z, this.f63664H, this.f63661E, this.f63665I, this.f63663G, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC16559z.m46873o((C16534a0) this.f63666J, this.f63668x, this.f63669y, this.f63670z, this.f63661E, this.f63662F, this.f63663G, this.f63664H, this.f63665I, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C16545l(C16534a0 c16534a0, InterfaceC28670t2 interfaceC28670t2, Function1 function1, String str, InterfaceC28670t2 interfaceC28670t3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t4, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3) {
        this.f63666J = c16534a0;
        this.f63668x = interfaceC28670t2;
        this.f63669y = function1;
        this.f63670z = str;
        this.f63661E = interfaceC28670t3;
        this.f63662F = interfaceC28601c1;
        this.f63663G = interfaceC28670t4;
        this.f63664H = interfaceC28601c2;
        this.f63665I = interfaceC28601c3;
    }
}
