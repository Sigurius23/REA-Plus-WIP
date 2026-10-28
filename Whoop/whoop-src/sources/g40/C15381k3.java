package g40;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import java.util.List;
import l83.C23454a0;
import p026b2.C2314t;
import p133f1.C13989w1;
import p163g1.AbstractC15011f9;
import p291l0.InterfaceC23013y;
import p390p1.C28635l;
import p390p1.C28655q;
import p547v8.AbstractC35785b;
import p696zy.C41210b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32411b;

/* JADX INFO: renamed from: g40.k3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15381k3 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f57815E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function1 f57816F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C41210b f57817w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f57818x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f57819y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC15357g3 f57820z;

    public C15381k3(C41210b c41210b, long j7, List list, InterfaceC15357g3 interfaceC15357g3, long j13, Function1 function1) {
        this.f57817w = c41210b;
        this.f57818x = j7;
        this.f57819y = list;
        this.f57820z = interfaceC15357g3;
        this.f57815E = j13;
        this.f57816F = function1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0073  */
    /* JADX WARN: Code duplicated, block: B:15:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:8:0x002c  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C28655q c28655q;
        Function1 function1;
        boolean zM87153g;
        Object objM87133R;
        InterfaceC23013y DropdownMenu = (InterfaceC23013y) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC22676k.m65750j(DropdownMenu, "$this$DropdownMenu");
        if ((iIntValue & 17) == 16) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                AbstractC15011f9.m43114b(AbstractC35785b.m113396S(this.f57817w, composer), AbstractC1099a.m3395q(C2314t.f9131w, 13, 5), this.f57818x, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131064);
                for (InterfaceC15357g3 interfaceC15357g3 : (Iterable) this.f57819y) {
                    String strM113396S = AbstractC35785b.m113396S(interfaceC15357g3.getLabel(), composer);
                    Integer icon = interfaceC15357g3.getIcon();
                    boolean zEquals = interfaceC15357g3.equals(this.f57820z);
                    boolean zMo7513a = interfaceC15357g3.mo7513a();
                    c28655q = (C28655q) composer;
                    c28655q.m87150e0(-2060554105);
                    function1 = this.f57816F;
                    zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(interfaceC15357g3);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g || objM87133R == C28635l.f115821a) {
                        objM87133R = new C13989w1(12, function1, interfaceC15357g3);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    AbstractC32411b.m101087c(strM113396S, icon, zEquals, this.f57815E, zMo7513a, (InterfaceC4339a) objM87133R, c28655q, 0);
                }
            }
        } else {
            AbstractC15011f9.m43114b(AbstractC35785b.m113396S(this.f57817w, composer), AbstractC1099a.m3395q(C2314t.f9131w, 13, 5), this.f57818x, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131064);
            while (r2.hasNext()) {
                String strM113396S2 = AbstractC35785b.m113396S(interfaceC15357g3.getLabel(), composer);
                Integer icon2 = interfaceC15357g3.getIcon();
                boolean zEquals2 = interfaceC15357g3.equals(this.f57820z);
                boolean zMo7513a2 = interfaceC15357g3.mo7513a();
                c28655q = (C28655q) composer;
                c28655q.m87150e0(-2060554105);
                function1 = this.f57816F;
                zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(interfaceC15357g3);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R = new C13989w1(12, function1, interfaceC15357g3);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C13989w1(12, function1, interfaceC15357g3);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                AbstractC32411b.m101087c(strM113396S2, icon2, zEquals2, this.f57815E, zMo7513a2, (InterfaceC4339a) objM87133R, c28655q, 0);
            }
        }
        return C23454a0.f92919a;
    }
}
