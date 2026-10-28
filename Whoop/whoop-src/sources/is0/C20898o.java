package is0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.InterfaceC23459e;
import ny0.AbstractC27237a;
import p715kotlin.jvm.functions.Function1;
import p734sl0.AbstractC32699z0;

/* JADX INFO: renamed from: is0.o */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20898o implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ float f78692E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC23459e f78693F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f78694G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f78695H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f78696w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f78697x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f78698y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f78699z;

    public /* synthetic */ C20898o(int i13, String str, float f13, boolean z4, InterfaceC4339a interfaceC4339a, int i14, int i15) {
        this.f78697x = i13;
        this.f78698y = str;
        this.f78692E = f13;
        this.f78699z = z4;
        this.f78693F = interfaceC4339a;
        this.f78694G = i14;
        this.f78695H = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f78696w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC20900p.m57857l(this.f78697x, (String) this.f78698y, this.f78692E, this.f78699z, (InterfaceC4339a) this.f78693F, this.f78694G, this.f78695H, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                int i13 = this.f78697x;
                float f13 = this.f78692E;
                return AbstractC27237a.m82076f(i13, (String) this.f78698y, this.f78699z, f13, (InterfaceC4339a) this.f78693F, this.f78694G, this.f78695H, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC32699z0.m102610i((Modifier) this.f78698y, this.f78697x, this.f78692E, this.f78699z, (Function1) this.f78693F, this.f78694G, this.f78695H, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C20898o(int i13, String str, boolean z4, float f13, InterfaceC4339a interfaceC4339a, int i14, int i15) {
        this.f78697x = i13;
        this.f78698y = str;
        this.f78699z = z4;
        this.f78692E = f13;
        this.f78693F = interfaceC4339a;
        this.f78694G = i14;
        this.f78695H = i15;
    }

    public /* synthetic */ C20898o(Modifier modifier, int i13, float f13, boolean z4, Function1 function1, int i14, int i15) {
        this.f78698y = modifier;
        this.f78697x = i13;
        this.f78692E = f13;
        this.f78699z = z4;
        this.f78693F = function1;
        this.f78694G = i14;
        this.f78695H = i15;
    }
}
