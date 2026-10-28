package b30;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import ld0.EnumC23855n;
import lf0.AbstractC23899b0;
import o73.C27648a;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import sy0.AbstractC33088k;
import sy0.AbstractC33093p;

/* JADX INFO: renamed from: b30.r1 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2611r1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f10166E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f10167F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f10168G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f10169H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f10170I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10171w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f10172x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f10173y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f10174z;

    public /* synthetic */ C2611r1(Modifier modifier, String str, long j7, boolean z4, boolean z13, EnumC23855n enumC23855n, int i13, int i14) {
        this.f10172x = modifier;
        this.f10173y = str;
        this.f10174z = j7;
        this.f10166E = z4;
        this.f10167F = z13;
        this.f10170I = enumC23855n;
        this.f10168G = i13;
        this.f10169H = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10171w) {
            case 0:
                ((Integer) obj2).getClass();
                C27648a.m83584g((Integer) this.f10170I, (String) this.f10173y, this.f10174z, (Modifier) this.f10172x, this.f10166E, this.f10167F, (Composer) obj, AbstractC28683x.m87244L(this.f10168G | 1), this.f10169H);
                return C23454a0.f92919a;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC23899b0.m70210F((Modifier) this.f10172x, (String) this.f10173y, this.f10174z, this.f10166E, this.f10167F, (EnumC23855n) this.f10170I, this.f10168G, this.f10169H, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC33093p.m104851e((TextResource) this.f10170I, (AbstractC33088k) this.f10173y, this.f10166E, this.f10167F, this.f10174z, (Function1) this.f10172x, this.f10168G, this.f10169H, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C2611r1(TextResource textResource, AbstractC33088k abstractC33088k, boolean z4, boolean z13, long j7, Function1 function1, int i13, int i14) {
        this.f10170I = textResource;
        this.f10173y = abstractC33088k;
        this.f10166E = z4;
        this.f10167F = z13;
        this.f10174z = j7;
        this.f10172x = function1;
        this.f10168G = i13;
        this.f10169H = i14;
    }

    public /* synthetic */ C2611r1(Integer num, String str, long j7, Modifier modifier, boolean z4, boolean z13, int i13, int i14) {
        this.f10170I = num;
        this.f10173y = str;
        this.f10174z = j7;
        this.f10172x = modifier;
        this.f10166E = z4;
        this.f10167F = z13;
        this.f10168G = i13;
        this.f10169H = i14;
    }
}
