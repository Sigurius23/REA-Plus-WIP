package b30;

import androidx.compose.foundation.AbstractC1095d;
import androidx.compose.foundation.selection.AbstractC1112d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p132f0.InterfaceC13832v0;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p291l0.InterfaceC23001u;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.w4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2649w4 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f10349E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10350w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f10351x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f10352y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f10353z;

    public /* synthetic */ C2649w4(boolean z4, boolean z13, Object obj, Object obj2, int i13) {
        this.f10350w = i13;
        this.f10351x = z4;
        this.f10352y = z13;
        this.f10353z = obj;
        this.f10349E = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0084  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC21083i interfaceC21083i;
        switch (this.f10350w) {
            case 0:
                InterfaceC23001u BadgedBox = (InterfaceC23001u) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(BadgedBox, "$this$BadgedBox");
                if ((iIntValue & 17) == 16) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        AbstractC2480a5.m7450b(this.f10351x, this.f10352y, (InterfaceC4339a) this.f10353z, (String) this.f10349E, composer, 0);
                    }
                } else {
                    AbstractC2480a5.m7450b(this.f10351x, this.f10352y, (InterfaceC4339a) this.f10353z, (String) this.f10349E, composer, 0);
                }
                return C23454a0.f92919a;
            default:
                ((Number) obj3).intValue();
                C28655q c28655q2 = (C28655q) ((Composer) obj2);
                c28655q2.m87150e0(290332169);
                InterfaceC13832v0 interfaceC13832v0 = (InterfaceC13832v0) c28655q2.m87161k(AbstractC1095d.f4515a);
                if (interfaceC13832v0 instanceof InterfaceC13832v0) {
                    c28655q2.m87150e0(-778338818);
                    c28655q2.m87173q(false);
                    interfaceC21083i = null;
                } else {
                    c28655q2.m87150e0(-778206200);
                    Object objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    interfaceC21083i = (InterfaceC21083i) objM87133R;
                    c28655q2.m87173q(false);
                }
                InterfaceC21083i interfaceC21083i2 = interfaceC21083i;
                Modifier modifierM3447a = AbstractC1112d.m3447a(C2314t.f9131w, this.f10351x, interfaceC21083i2, interfaceC13832v0, this.f10352y, (C18027i) this.f10353z, (Function1) this.f10349E);
                c28655q2.m87173q(false);
                return modifierM3447a;
        }
    }
}
