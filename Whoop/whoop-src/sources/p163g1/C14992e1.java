package p163g1;

import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p077d0.InterfaceC11403t1;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function3;
import se.AbstractC32416g;

/* JADX INFO: renamed from: g1.e1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14992e1 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56066w;

    /* JADX INFO: renamed from: x */
    public static final C14992e1 f56063x = new C14992e1(0);

    /* JADX INFO: renamed from: y */
    public static final C14992e1 f56064y = new C14992e1(1);

    /* JADX INFO: renamed from: z */
    public static final C14992e1 f56065z = new C14992e1(2);

    /* JADX INFO: renamed from: E */
    public static final C14992e1 f56060E = new C14992e1(3);

    /* JADX INFO: renamed from: F */
    public static final C14992e1 f56061F = new C14992e1(4);

    /* JADX INFO: renamed from: G */
    public static final C14992e1 f56062G = new C14992e1(5);

    public /* synthetic */ C14992e1(int i13) {
        this.f56066w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object c11347e2;
        switch (this.f56066w) {
            case 0:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                C28655q c28655q = (C28655q) composer;
                if (!c28655q.m87135U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    c28655q.m87138X();
                }
                return C23454a0.f92919a;
            case 1:
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (!c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    c28655q2.m87138X();
                }
                return C23454a0.f92919a;
            case 2:
                C15092n6 c15092n6 = (C15092n6) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((C28655q) composer3).m87153g(c15092n6) ? 4 : 2;
                }
                C28655q c28655q3 = (C28655q) composer3;
                if (c28655q3.m87135U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    AbstractC32416g.m101151h(c15092n6, null, null, c28655q3, iIntValue3 & 14, 6);
                } else {
                    c28655q3.m87138X();
                }
                return C23454a0.f92919a;
            case 3:
                C15092n6 c15092n7 = (C15092n6) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((C28655q) composer4).m87153g(c15092n7) ? 4 : 2;
                }
                C28655q c28655q4 = (C28655q) composer4;
                if (c28655q4.m87135U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    AbstractC32416g.m101151h(c15092n7, null, null, c28655q4, iIntValue4 & 14, 6);
                } else {
                    c28655q4.m87138X();
                }
                return C23454a0.f92919a;
            case 4:
                C15072l6 c15072l6 = (C15072l6) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= (iIntValue5 & 8) == 0 ? ((C28655q) composer5).m87153g(c15072l6) : ((C28655q) composer5).m87157i(c15072l6) ? 4 : 2;
                }
                C28655q c28655q5 = (C28655q) composer5;
                if (c28655q5.m87135U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    AbstractC15142s6.m43189c(c15072l6, null, null, 0L, 0L, 0L, 0.0f, c28655q5, iIntValue5 & 14);
                } else {
                    c28655q5.m87138X();
                }
                return C23454a0.f92919a;
            default:
                InterfaceC11403t1 interfaceC11403t1 = (InterfaceC11403t1) obj;
                ((Number) obj3).intValue();
                C28655q c28655q6 = (C28655q) ((Composer) obj2);
                c28655q6.m87150e0(1849239065);
                EnumC15016g3 enumC15016g3 = EnumC15016g3.f56185w;
                EnumC15016g3 enumC15016g4 = EnumC15016g3.f56186x;
                if (interfaceC11403t1.m30637d(enumC15016g3, enumC15016g4)) {
                    c11347e2 = AbstractC11348f.m30574v(67, 0, AbstractC11333b0.f36312c, 2);
                } else {
                    c11347e2 = (interfaceC11403t1.m30637d(enumC15016g4, enumC15016g3) || interfaceC11403t1.m30637d(EnumC15016g3.f56187y, enumC15016g4)) ? new C11347e2(83, 67, AbstractC11333b0.f36312c) : AbstractC11348f.m30573u(0.0f, 0.0f, 7, null);
                }
                c28655q6.m87173q(false);
                return c11347e2;
        }
    }
}
