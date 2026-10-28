package g40;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import se.AbstractC32411b;
import sy0.AbstractC33092o;

/* JADX INFO: renamed from: g40.j3 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C15375j3 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f57798E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f57799F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC23459e f57800G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57801w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f57802x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f57803y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f57804z;

    public /* synthetic */ C15375j3(Modifier modifier, String str, long j7, boolean z4, Function1 function1, boolean z13) {
        this.f57799F = modifier;
        this.f57802x = str;
        this.f57803y = j7;
        this.f57804z = z4;
        this.f57800G = function1;
        this.f57798E = z13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f57801w) {
            case 0:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(1);
                AbstractC32411b.m101087c(this.f57802x, (Integer) this.f57799F, this.f57804z, this.f57803y, this.f57798E, (InterfaceC4339a) this.f57800G, (Composer) obj, iM87244L);
                return C23454a0.f92919a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC33092o.m104844e((Modifier) this.f57799F, this.f57802x, this.f57803y, this.f57804z, (Function1) this.f57800G, this.f57798E, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ C15375j3(String str, Integer num, boolean z4, long j7, boolean z13, InterfaceC4339a interfaceC4339a, int i13) {
        this.f57802x = str;
        this.f57799F = num;
        this.f57804z = z4;
        this.f57803y = j7;
        this.f57798E = z13;
        this.f57800G = interfaceC4339a;
    }
}
