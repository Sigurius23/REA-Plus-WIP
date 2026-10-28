package b30;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import d40.AbstractC11673r;
import java.util.List;
import l83.C23454a0;
import m40.C25046w;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p390p1.C28635l;
import p390p1.C28655q;
import p547v8.AbstractC35785b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;
import q20.C29810c;
import u00.C34378f;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: b30.c2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2493c2 extends AbstractC22680m implements InterfaceC4352n {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C25046w f9712E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f9713F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Function1 f9714G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ List f9715H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ List f9716w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f9717x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C29810c f9718y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f9719z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2493c2(List list, int i13, C29810c c29810c, float f13, C25046w c25046w, boolean z4, Function1 function1, List list2) {
        super(4);
        this.f9716w = list;
        this.f9717x = i13;
        this.f9718y = c29810c;
        this.f9719z = f13;
        this.f9712E = c25046w;
        this.f9713F = z4;
        this.f9714G = function1;
        this.f9715H = list2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:54:0x011d  */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x0056, please report this as an issue */
    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i13;
        C28655q c28655q;
        String str;
        String str2;
        boolean z4;
        boolean z13;
        C29810c c29810c;
        String str3;
        Function1 function1;
        List list;
        boolean zM87157i;
        Object objM87133R;
        C29810c c29810cM91320b;
        InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i13 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | iIntValue2;
        } else {
            i13 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i13 |= ((C28655q) composer).m87149e(iIntValue) ? 32 : 16;
        }
        if ((i13 & 147) == 146) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                C34378f c34378f = (C34378f) this.f9716w.get(iIntValue);
                c28655q = (C28655q) composer;
                c28655q.m87150e0(-1070367905);
                Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, "PaymentMethodsUITestTag" + c34378f.f144467a);
                c28655q.m87150e0(-2091678616);
                int iM121625H = AbstractC37978j.m121625H(c34378f.f144470d, c34378f.f144471e, c34378f.f144476j, c28655q);
                c28655q.m87173q(false);
                c28655q.m87150e0(-466345931);
                str = c34378f.f144472f;
                str2 = c34378f.f144473g;
                c28655q.m87150e0(-201455451);
                c28655q.m87150e0(-1529074886);
                z4 = true;
                if (AbstractC17918w0.m51536x(AbstractC11673r.m31082k(c28655q).f37668a) < 0.5d) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                c28655q.m87173q(false);
                if (z13 && str2 != null) {
                    str = str2;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(false);
                String strM113396S = AbstractC35785b.m113396S(c34378f.f144469c, c28655q);
                if (iIntValue == this.f9717x) {
                    z4 = false;
                }
                boolean z14 = c34378f.f144474h;
                c29810c = this.f9718y;
                if (c29810c != null || (c29810cM91320b = c29810c.m91320b(c34378f.f144467a)) == null) {
                    str3 = null;
                } else {
                    str3 = c29810cM91320b.f121867x;
                }
                String str4 = str3;
                c28655q.m87150e0(1073871629);
                function1 = this.f9714G;
                boolean zM87153g = c28655q.m87153g(function1);
                list = this.f9715H;
                zM87157i = ((((i13 & 112) ^ 48) <= 32 && c28655q.m87149e(iIntValue)) || (i13 & 48) == 32) | zM87153g | c28655q.m87157i(list);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C2477a2(function1, list, iIntValue, 0);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                AbstractC3269g.m9498c(this.f9719z, iM121625H, str, this.f9712E, strM113396S, z4, this.f9713F, z14, str4, modifierM3599a, (InterfaceC4339a) objM87133R, c28655q, 4096);
                c28655q.m87173q(false);
            }
        } else {
            C34378f c34378f2 = (C34378f) this.f9716w.get(iIntValue);
            c28655q = (C28655q) composer;
            c28655q.m87150e0(-1070367905);
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(C2314t.f9131w, "PaymentMethodsUITestTag" + c34378f2.f144467a);
            c28655q.m87150e0(-2091678616);
            int iM121625H2 = AbstractC37978j.m121625H(c34378f2.f144470d, c34378f2.f144471e, c34378f2.f144476j, c28655q);
            c28655q.m87173q(false);
            c28655q.m87150e0(-466345931);
            str = c34378f2.f144472f;
            str2 = c34378f2.f144473g;
            c28655q.m87150e0(-201455451);
            c28655q.m87150e0(-1529074886);
            z4 = true;
            if (AbstractC17918w0.m51536x(AbstractC11673r.m31082k(c28655q).f37668a) < 0.5d) {
                z13 = true;
            } else {
                z13 = false;
            }
            c28655q.m87173q(false);
            if (z13) {
                str = str2;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(false);
            String strM113396S2 = AbstractC35785b.m113396S(c34378f2.f144469c, c28655q);
            if (iIntValue == this.f9717x) {
                z4 = false;
            }
            boolean z15 = c34378f2.f144474h;
            c29810c = this.f9718y;
            if (c29810c != null) {
                str3 = null;
            } else {
                str3 = null;
            }
            String str5 = str3;
            c28655q.m87150e0(1073871629);
            function1 = this.f9714G;
            boolean zM87153g2 = c28655q.m87153g(function1);
            list = this.f9715H;
            zM87157i = ((((i13 & 112) ^ 48) <= 32 && c28655q.m87149e(iIntValue)) || (i13 & 48) == 32) | zM87153g2 | c28655q.m87157i(list);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new C2477a2(function1, list, iIntValue, 0);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C2477a2(function1, list, iIntValue, 0);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC3269g.m9498c(this.f9719z, iM121625H2, str, this.f9712E, strM113396S2, z4, this.f9713F, z15, str5, modifierM3599a2, (InterfaceC4339a) objM87133R, c28655q, 4096);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }
}
