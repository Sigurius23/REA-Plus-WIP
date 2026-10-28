package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import i40.EnumC18075i;
import p026b2.C2314t;
import p077d0.C11412w1;
import p088dc.AbstractC11895b;
import p132f0.C13825t;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p390p1.C28655q;
import p522uf.AbstractC34870c0;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g1.h8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15032h8 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC21083i f56269E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56270w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC14999e8 f56271x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f56272y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f56273z;

    public /* synthetic */ C15032h8(InterfaceC14999e8 interfaceC14999e8, boolean z4, boolean z13, InterfaceC21083i interfaceC21083i, int i13) {
        this.f56270w = i13;
        this.f56271x = interfaceC14999e8;
        this.f56272y = z4;
        this.f56273z = z13;
        this.f56269E = interfaceC21083i;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f56270w;
        InterfaceC21083i interfaceC21083i = this.f56269E;
        boolean z4 = this.f56273z;
        boolean z13 = this.f56272y;
        InterfaceC14999e8 interfaceC14999e8 = this.f56271x;
        switch (i13) {
            case 0:
                ((Number) obj3).intValue();
                C28655q c28655q = (C28655q) ((Composer) obj2);
                c28655q.m87150e0(1398930845);
                C13825t c13825t = (C13825t) AbstractC34870c0.m110023y(this.f56272y, this.f56273z, this.f56269E, this.f56271x, C15043i8.f56317e, C15043i8.f56316d, c28655q, 0).getValue();
                float f13 = AbstractC15164u8.f56885a;
                Modifier modifierM3480c = AbstractC1125a.m3480c(C2314t.f9131w, new C11412w1(c13825t.f49345a, c13825t, 2));
                c28655q.m87173q(false);
                return modifierM3480c;
            case 1:
                EnumC15016g3 enumC15016g3 = (EnumC15016g3) obj;
                ((Number) obj3).intValue();
                C28655q c28655q2 = (C28655q) ((Composer) obj2);
                c28655q2.m87150e0(1423138213);
                if (enumC15016g3 == EnumC15016g3.f56186x) {
                    z4 = false;
                }
                return AbstractC11895b.m31989h(c28655q2, false, ((C17919x) ((C15197y1) interfaceC14999e8).m43216c(z13, z4, interfaceC21083i, c28655q2).getValue()).f69639a);
            default:
                EnumC18075i it = (EnumC18075i) obj;
                ((Number) obj3).intValue();
                AbstractC22676k.m65750j(it, "it");
                C28655q c28655q3 = (C28655q) ((Composer) obj2);
                c28655q3.m87150e0(1194596618);
                if (it == EnumC18075i.f70276x) {
                    z4 = false;
                }
                return AbstractC11895b.m31989h(c28655q3, false, ((C17919x) ((C15197y1) interfaceC14999e8).m43216c(z13, z4, interfaceC21083i, c28655q3).getValue()).f69639a);
        }
    }

    public C15032h8(boolean z4, boolean z13, InterfaceC21083i interfaceC21083i, InterfaceC14999e8 interfaceC14999e8) {
        this.f56270w = 0;
        C15043i8 c15043i8 = C15043i8.f56313a;
        C15043i8 c15043i9 = C15043i8.f56313a;
        this.f56272y = z4;
        this.f56273z = z13;
        this.f56269E = interfaceC21083i;
        this.f56271x = interfaceC14999e8;
    }
}
