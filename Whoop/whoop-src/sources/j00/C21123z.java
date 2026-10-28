package j00;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import com.whoop.android.R;
import g00.AbstractC14936g;
import g00.C14934e;
import l83.C23454a0;
import p026b2.C2314t;
import p163g1.AbstractC15011f9;
import p208i2.C17903p;
import p291l0.InterfaceC22997s1;
import p292l1.AbstractC23112i3;
import p316m1.InterfaceC24926x;
import p330n1.AbstractC26108h;
import p330n1.C26115o;
import p331n2.AbstractC26165a;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: j00.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C21123z implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f80178w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f80179x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f80180y;

    public /* synthetic */ C21123z(long j7, Object obj, int i13) {
        this.f80178w = i13;
        this.f80179x = j7;
        this.f80180y = obj;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x012d  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f80178w) {
            case 0:
                String it = (String) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(it, "it");
                if ((iIntValue & 17) == 16) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        AbstractC29125c.m88522c((AbstractC26165a) this.f80180y, AbstractC30060g.m92103Y(composer, R.string.stripe_link), AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, null, 0.0f, new C17903p(this.f80179x, 5), composer, 384, 56);
                    }
                } else {
                    AbstractC29125c.m88522c((AbstractC26165a) this.f80180y, AbstractC30060g.m92103Y(composer, R.string.stripe_link), AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, null, 0.0f, new C17903p(this.f80179x, 5), composer, 384, 56);
                }
                break;
            case 1:
                InterfaceC22997s1 TextButton = (InterfaceC22997s1) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(TextButton, "$this$TextButton");
                if ((iIntValue2 & 17) == 16) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        C28655q c28655q3 = (C28655q) composer2;
                        c28655q3.m87150e0(-1418551394);
                        C14934e c14934e = (C14934e) c28655q3.m87161k(AbstractC14936g.f55705b);
                        c28655q3.m87173q(false);
                        AbstractC15011f9.m43114b((String) this.f80180y, null, this.f80179x, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c14934e.f55696c, composer2, 0, 0, 65530);
                    }
                } else {
                    C28655q c28655q4 = (C28655q) composer2;
                    c28655q4.m87150e0(-1418551394);
                    C14934e c14934e2 = (C14934e) c28655q4.m87161k(AbstractC14936g.f55705b);
                    c28655q4.m87173q(false);
                    AbstractC15011f9.m43114b((String) this.f80180y, null, this.f80179x, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c14934e2.f55696c, composer2, 0, 0, 65530);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                final C26115o c26115o = (C26115o) this.f80180y;
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((C28655q) composer3).m87155h(zBooleanValue) ? 4 : 2;
                }
                C28655q c28655q5 = (C28655q) composer3;
                if (!c28655q5.m87135U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    c28655q5.m87138X();
                } else if (zBooleanValue) {
                    c28655q5.m87150e0(-499784343);
                    AbstractC23112i3.m67090a(AbstractC1102d.m3419p(AbstractC26108h.f103437c, C2314t.f9131w), this.f80179x, AbstractC26108h.f103435a, 0L, 0, 0.0f, c28655q5, 390, 56);
                    c28655q5.m87173q(false);
                } else {
                    c28655q5.m87150e0(-499540745);
                    boolean zM87153g = c28655q5.m87153g(c26115o);
                    Object objM87133R = c28655q5.m87133R();
                    if (zM87153g || objM87133R == C28635l.f115821a) {
                        objM87133R = new InterfaceC24926x() { // from class: n1.f
                            @Override // p316m1.InterfaceC24926x
                            public final float invoke() {
                                return ((Number) c26115o.f103466a.m30549e()).floatValue();
                            }
                        };
                        c28655q5.m87172p0(objM87133R);
                    }
                    AbstractC26108h.m77670a((InterfaceC24926x) objM87133R, this.f80179x, c28655q5, 0);
                    c28655q5.m87173q(false);
                }
                break;
        }
        return C23454a0.f92919a;
    }

    public C21123z(String str, long j7) {
        this.f80178w = 1;
        this.f80180y = str;
        this.f80179x = j7;
    }
}
