package d30;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import h20.C16659g1;
import j11.AbstractC21211n;
import j11.EnumC21212o;
import j11.EnumC21213p;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p602x1.C37816b;
import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: renamed from: d30.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C11539i0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f37206E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f37207F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f37208G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f37209H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f37210I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37211w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f37212x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f37213y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f37214z;

    public /* synthetic */ C11539i0(TextResource textResource, boolean z4, InterfaceC4339a interfaceC4339a, EnumC21212o enumC21212o, boolean z13, Integer num, EnumC21213p enumC21213p, InterfaceC4351m interfaceC4351m) {
        this.f37214z = textResource;
        this.f37212x = z4;
        this.f37206E = interfaceC4339a;
        this.f37207F = enumC21212o;
        this.f37213y = z13;
        this.f37208G = num;
        this.f37209H = enumC21213p;
        this.f37210I = interfaceC4351m;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37211w) {
            case 0:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(1);
                AbstractC22674j.m65726l(this.f37212x, this.f37213y, (C37816b) this.f37214z, (String) this.f37206E, (String) this.f37207F, (String) this.f37208G, (C16659g1) this.f37209H, (Modifier) this.f37210I, (Composer) obj, iM87244L);
                return C23454a0.f92919a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC21211n.m59504v((TextResource) this.f37214z, this.f37212x, (InterfaceC4339a) this.f37206E, (EnumC21212o) this.f37207F, this.f37213y, (Integer) this.f37208G, (EnumC21213p) this.f37209H, (InterfaceC4351m) this.f37210I, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ C11539i0(boolean z4, boolean z13, C37816b c37816b, String str, String str2, String str3, C16659g1 c16659g1, Modifier modifier, int i13) {
        this.f37212x = z4;
        this.f37213y = z13;
        this.f37214z = c37816b;
        this.f37206E = str;
        this.f37207F = str2;
        this.f37208G = str3;
        this.f37209H = c16659g1;
        this.f37210I = modifier;
    }
}
