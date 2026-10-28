package p510u0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p026b2.C2314t;
import p133f1.AbstractC13923a2;
import p133f1.C13995y1;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p736sz0.C33209p1;

/* JADX INFO: renamed from: u0.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C34299a implements Function3 {

    /* JADX INFO: renamed from: x */
    public static final C34299a f144044x = new C34299a(0);

    /* JADX INFO: renamed from: y */
    public static final C34299a f144045y = new C34299a(1);

    /* JADX INFO: renamed from: z */
    public static final C34299a f144046z = new C34299a(2);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f144047w;

    public /* synthetic */ C34299a(int i13) {
        this.f144047w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f144047w) {
            case 0:
                Modifier modifier = (Modifier) obj;
                ((Number) obj3).intValue();
                C28655q c28655q = (C28655q) ((Composer) obj2);
                c28655q.m87150e0(-2126899193);
                long j7 = ((C13995y1) c28655q.m87161k(AbstractC13923a2.f49638a)).f49941a;
                boolean zM87151f = c28655q.m87151f(j7);
                Object objM87133R = c28655q.m87133R();
                if (zM87151f || objM87133R == C28635l.f115821a) {
                    objM87133R = new C33209p1(j7, 1);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierMo3471e = modifier.mo3471e(AbstractC1125a.m3479b(C2314t.f9131w, (Function1) objM87133R));
                c28655q.m87173q(false);
                return modifierMo3471e;
            case 1:
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C28655q) composer).m87157i(interfaceC4351m) ? 4 : 2;
                }
                C28655q c28655q2 = (C28655q) composer;
                if (c28655q2.m87135U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    interfaceC4351m.invoke(c28655q2, Integer.valueOf(iIntValue & 14));
                } else {
                    c28655q2.m87138X();
                }
                return C23454a0.f92919a;
            default:
                InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((C28655q) composer2).m87157i(interfaceC4351m2) ? 4 : 2;
                }
                C28655q c28655q3 = (C28655q) composer2;
                if (c28655q3.m87135U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    interfaceC4351m2.invoke(c28655q3, Integer.valueOf(iIntValue2 & 14));
                } else {
                    c28655q3.m87138X();
                }
                return C23454a0.f92919a;
        }
    }
}
