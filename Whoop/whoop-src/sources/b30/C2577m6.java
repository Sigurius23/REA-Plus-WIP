package b30;

import a23.C0175b;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p026b2.C2314t;
import p209i3.AbstractC18032n;
import p292l1.AbstractC23149o4;
import p390p1.C28635l;
import p390p1.C28655q;
import p522uf.AbstractC34870c0;
import p715kotlin.jvm.functions.Function1;
import sb3.AbstractC32350a;

/* JADX INFO: renamed from: b30.m6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2577m6 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10016w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f10017x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f10018y;

    public /* synthetic */ C2577m6(String str, String str2, int i13) {
        this.f10016w = i13;
        this.f10017x = str;
        this.f10018y = str2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c7  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Exception {
        switch (this.f10016w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        AbstractC34870c0.m109998h(this.f10017x, this.f10018y, null, null, null, false, false, null, null, null, null, null, composer, 0, 4092);
                    }
                } else {
                    AbstractC34870c0.m109998h(this.f10017x, this.f10018y, null, null, null, false, false, null, null, null, null, null, composer, 0, 4092);
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (c28655q2.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str = this.f10017x;
                    boolean zM87153g = c28655q2.m87153g(str);
                    String str2 = this.f10018y;
                    boolean zM87153g2 = zM87153g | c28655q2.m87153g(str2);
                    Object objM87133R = c28655q2.m87133R();
                    if (zM87153g2 || objM87133R == C28635l.f115821a) {
                        objM87133R = new C0175b(this.f10017x, str2, 5);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC23149o4.m67128c(str, AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c28655q2, 0, 0, 262140);
                } else {
                    c28655q2.m87138X();
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q3 = (C28655q) composer3;
                if (c28655q3.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC32350a.m100704k(this.f10017x, this.f10018y, c28655q3, new Object[0]);
                } else {
                    c28655q3.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
