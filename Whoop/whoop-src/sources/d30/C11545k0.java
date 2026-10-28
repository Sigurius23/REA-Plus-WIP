package d30;

import androidx.compose.material3.AbstractC1123d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import o11.AbstractC27401g;
import p163g1.AbstractC15133r7;
import p163g1.InterfaceC15103o7;
import p238j0.InterfaceC21083i;
import p291l0.C22976l1;
import p291l0.InterfaceC22997s1;
import p292l1.C23083d4;
import p390p1.AbstractC28683x;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import s81.AbstractC32264g;
import s81.C32261d;

/* JADX INFO: renamed from: d30.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C11545k0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f37228E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f37229F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f37230G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37231w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f37232x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f37233y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f37234z;

    public /* synthetic */ C11545k0(Object obj, Object obj2, boolean z4, boolean z13, Function1 function1, int i13, int i14) {
        this.f37231w = i14;
        this.f37228E = obj;
        this.f37229F = obj2;
        this.f37232x = z4;
        this.f37233y = z13;
        this.f37230G = function1;
        this.f37234z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37231w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC22674j.m65725k(this.f37232x, this.f37233y, (C22976l1) this.f37228E, (Modifier) this.f37229F, (C37816b) this.f37230G, (Composer) obj, AbstractC28683x.m87244L(this.f37234z | 1));
                return C23454a0.f92919a;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC15133r7.m43184b(this.f37232x, this.f37233y, (InterfaceC15103o7) this.f37228E, (InterfaceC4339a) this.f37229F, (InterfaceC21083i) this.f37230G, (Composer) obj, AbstractC28683x.m87244L(this.f37234z | 1));
                return C23454a0.f92919a;
            case 2:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(1);
                AbstractC1123d.m3465a(this.f37232x, (Function1) this.f37228E, (Modifier) this.f37229F, this.f37233y, (C23083d4) this.f37230G, (Composer) obj, iM87244L, this.f37234z);
                return C23454a0.f92919a;
            case 3:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC27401g.m82595u(this.f37228E, this.f37229F, this.f37232x, this.f37233y, (Function1) this.f37230G, this.f37234z, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC32264g.m100404h((InterfaceC22997s1) this.f37228E, (C32261d) this.f37229F, this.f37232x, this.f37233y, (Function1) this.f37230G, this.f37234z, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C11545k0(boolean z4, Function1 function1, Modifier modifier, boolean z13, C23083d4 c23083d4, int i13, int i14) {
        this.f37231w = 2;
        this.f37232x = z4;
        this.f37228E = function1;
        this.f37229F = modifier;
        this.f37233y = z13;
        this.f37230G = c23083d4;
        this.f37234z = i14;
    }

    public /* synthetic */ C11545k0(boolean z4, boolean z13, Object obj, Object obj2, Object obj3, int i13, int i14) {
        this.f37231w = i14;
        this.f37232x = z4;
        this.f37233y = z13;
        this.f37228E = obj;
        this.f37229F = obj2;
        this.f37230G = obj3;
        this.f37234z = i13;
    }
}
