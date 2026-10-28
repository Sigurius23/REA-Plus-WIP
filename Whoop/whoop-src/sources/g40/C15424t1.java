package g40;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.p018ui.input.key.AbstractC1128a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import ec3.InterfaceC13037f2;
import j93.InterfaceC21467g;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import o73.C27648a;
import p003a1.C0106e;
import p026b2.C2314t;
import p042c2.EnumC3869n;
import p088dc.AbstractC11894a;
import p163g1.C15160u4;
import p164g2.C15247s;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15237i;
import p164g2.InterfaceC15250v;
import p209i3.AbstractC18032n;
import p294l3.C23285v0;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g40.t1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15424t1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C15247s f57965E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C23285v0 f57966F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ boolean f57967G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C15404p1 f57968H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ String f57969I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ InterfaceC28593a1 f57970J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C15399o1 f57971w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f57972x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f57973y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC15237i f57974z;

    public C15424t1(C15399o1 c15399o1, int i13, boolean z4, InterfaceC15237i interfaceC15237i, C15247s c15247s, C23285v0 c23285v0, boolean z13, C15404p1 c15404p1, String str, InterfaceC28593a1 interfaceC28593a1) {
        this.f57971w = c15399o1;
        this.f57972x = i13;
        this.f57973y = z4;
        this.f57974z = interfaceC15237i;
        this.f57965E = c15247s;
        this.f57966F = c23285v0;
        this.f57967G = z13;
        this.f57968H = c15404p1;
        this.f57969I = str;
        this.f57970J = interfaceC28593a1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0091  */
    /* JADX WARN: Code duplicated, block: B:18:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:21:0x00db  */
    /* JADX WARN: Code duplicated, block: B:24:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C15399o1 c15399o1;
        final int i13;
        InterfaceC28601c1 interfaceC28601c1M83597t;
        C28655q c28655q;
        final boolean z4;
        boolean zM87155h;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC15237i interfaceC15237i;
        boolean zM87157i;
        Object objM87133R2;
        Object objM87133R3;
        Modifier modifierM51775c;
        C15389m1 c15389m1;
        boolean zM87157i2;
        Object objM87133R4;
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                c15399o1 = this.f57971w;
                ArrayList arrayList = c15399o1.f57854b.f57834b;
                i13 = this.f57972x;
                interfaceC28601c1M83597t = C27648a.m83597t((InterfaceC13037f2) arrayList.get(i13), composer, 0);
                Modifier modifierM3411h = AbstractC1102d.m3411h(56, C2314t.f9131w);
                c28655q = (C28655q) composer;
                c28655q.m87150e0(448330171);
                boolean zM87149e = c28655q.m87149e(i13);
                z4 = this.f57973y;
                zM87155h = zM87149e | c28655q.m87155h(z4);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (zM87155h || objM87133R == c28676v0) {
                    final InterfaceC28593a1 interfaceC28593a1 = this.f57970J;
                    objM87133R = new Function1() { // from class: g40.r1
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            InterfaceC15250v focusState = (InterfaceC15250v) obj3;
                            AbstractC22676k.m65750j(focusState, "focusState");
                            EnumC15251w enumC15251w = (EnumC15251w) focusState;
                            boolean zM43354b = enumC15251w.m43354b();
                            InterfaceC28593a1 interfaceC28593a2 = interfaceC28593a1;
                            if (zM43354b) {
                                ((C28621h1) interfaceC28593a2).m87025y(i13);
                            } else if (!enumC15251w.m43354b() && z4) {
                                ((C28621h1) interfaceC28593a2).m87025y(-1);
                            }
                            return C23454a0.f92919a;
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                Modifier modifierM3484c = AbstractC1126a.m3484c(modifierM3411h, (Function1) objM87133R);
                c28655q.m87150e0(448341356);
                boolean zM87149e2 = c28655q.m87149e(i13) | c28655q.m87153g(interfaceC28601c1M83597t);
                interfaceC15237i = this.f57974z;
                zM87157i = zM87149e2 | c28655q.m87157i(interfaceC15237i) | c28655q.m87157i(c15399o1);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new C15419s1(i13, interfaceC15237i, c15399o1, interfaceC28601c1M83597t);
                    c28655q.m87172p0(objM87133R2);
                }
                c28655q.m87173q(false);
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1128a.m3494b(modifierM3484c, (Function1) objM87133R2), "OTP-" + i13);
                c28655q.m87150e0(448364464);
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C15160u4(25);
                    c28655q.m87172p0(objM87133R3);
                }
                c28655q.m87173q(false);
                modifierM51775c = AbstractC18032n.m51775c(modifierM3599a, false, (Function1) objM87133R3);
                c28655q.m87150e0(448366354);
                if (i13 == 0) {
                    Modifier modifierM3483b = AbstractC1126a.m3483b(modifierM51775c, this.f57965E);
                    List listM118958J = AbstractC37056f.m118958J(EnumC3869n.f15836j0);
                    c15389m1 = c15399o1.f57854b;
                    c28655q.m87150e0(448374772);
                    zM87157i2 = c28655q.m87157i(c15389m1);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i2 || objM87133R4 == c28676v0) {
                        C0106e c0106e = new C0106e(1, c15389m1, C15389m1.class, "onAutofillDigit", "onAutofillDigit(Ljava/lang/String;)V", 0, 27);
                        c28655q.m87172p0(c0106e);
                        objM87133R4 = c0106e;
                    }
                    c28655q.m87173q(false);
                    modifierM51775c = AbstractC34924m.m110153n(modifierM3483b, listM118958J, (Function1) ((InterfaceC21467g) objM87133R4), c28655q, 48);
                }
                c28655q.m87173q(false);
                AbstractC11894a.m31959h((String) interfaceC28601c1M83597t.getValue(), this.f57973y, this.f57966F, this.f57971w, this.f57972x, this.f57974z, modifierM51775c, this.f57967G, this.f57968H, this.f57969I, c28655q, 0);
            }
        } else {
            c15399o1 = this.f57971w;
            ArrayList arrayList2 = c15399o1.f57854b.f57834b;
            i13 = this.f57972x;
            interfaceC28601c1M83597t = C27648a.m83597t((InterfaceC13037f2) arrayList2.get(i13), composer, 0);
            Modifier modifierM3411h2 = AbstractC1102d.m3411h(56, C2314t.f9131w);
            c28655q = (C28655q) composer;
            c28655q.m87150e0(448330171);
            boolean zM87149e3 = c28655q.m87149e(i13);
            z4 = this.f57973y;
            zM87155h = zM87149e3 | c28655q.m87155h(z4);
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (zM87155h) {
                final InterfaceC28593a1 interfaceC28593a2 = this.f57970J;
                objM87133R = new Function1() { // from class: g40.r1
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        InterfaceC15250v focusState = (InterfaceC15250v) obj3;
                        AbstractC22676k.m65750j(focusState, "focusState");
                        EnumC15251w enumC15251w = (EnumC15251w) focusState;
                        boolean zM43354b = enumC15251w.m43354b();
                        InterfaceC28593a1 interfaceC28593a3 = interfaceC28593a2;
                        if (zM43354b) {
                            ((C28621h1) interfaceC28593a3).m87025y(i13);
                        } else if (!enumC15251w.m43354b() && z4) {
                            ((C28621h1) interfaceC28593a3).m87025y(-1);
                        }
                        return C23454a0.f92919a;
                    }
                };
                c28655q.m87172p0(objM87133R);
            } else {
                final InterfaceC28593a1 interfaceC28593a3 = this.f57970J;
                objM87133R = new Function1() { // from class: g40.r1
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        InterfaceC15250v focusState = (InterfaceC15250v) obj3;
                        AbstractC22676k.m65750j(focusState, "focusState");
                        EnumC15251w enumC15251w = (EnumC15251w) focusState;
                        boolean zM43354b = enumC15251w.m43354b();
                        InterfaceC28593a1 interfaceC28593a4 = interfaceC28593a3;
                        if (zM43354b) {
                            ((C28621h1) interfaceC28593a4).m87025y(i13);
                        } else if (!enumC15251w.m43354b() && z4) {
                            ((C28621h1) interfaceC28593a4).m87025y(-1);
                        }
                        return C23454a0.f92919a;
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            Modifier modifierM3484c2 = AbstractC1126a.m3484c(modifierM3411h2, (Function1) objM87133R);
            c28655q.m87150e0(448341356);
            boolean zM87149e4 = c28655q.m87149e(i13) | c28655q.m87153g(interfaceC28601c1M83597t);
            interfaceC15237i = this.f57974z;
            zM87157i = zM87149e4 | c28655q.m87157i(interfaceC15237i) | c28655q.m87157i(c15399o1);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new C15419s1(i13, interfaceC15237i, c15399o1, interfaceC28601c1M83597t);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C15419s1(i13, interfaceC15237i, c15399o1, interfaceC28601c1M83597t);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1128a.m3494b(modifierM3484c2, (Function1) objM87133R2), "OTP-" + i13);
            c28655q.m87150e0(448364464);
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C15160u4(25);
                c28655q.m87172p0(objM87133R3);
            }
            c28655q.m87173q(false);
            modifierM51775c = AbstractC18032n.m51775c(modifierM3599a2, false, (Function1) objM87133R3);
            c28655q.m87150e0(448366354);
            if (i13 == 0) {
                Modifier modifierM3483b2 = AbstractC1126a.m3483b(modifierM51775c, this.f57965E);
                List listM118958J2 = AbstractC37056f.m118958J(EnumC3869n.f15836j0);
                c15389m1 = c15399o1.f57854b;
                c28655q.m87150e0(448374772);
                zM87157i2 = c28655q.m87157i(c15389m1);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i2) {
                    C0106e c0106e2 = new C0106e(1, c15389m1, C15389m1.class, "onAutofillDigit", "onAutofillDigit(Ljava/lang/String;)V", 0, 27);
                    c28655q.m87172p0(c0106e2);
                    objM87133R4 = c0106e2;
                } else {
                    C0106e c0106e3 = new C0106e(1, c15389m1, C15389m1.class, "onAutofillDigit", "onAutofillDigit(Ljava/lang/String;)V", 0, 27);
                    c28655q.m87172p0(c0106e3);
                    objM87133R4 = c0106e3;
                }
                c28655q.m87173q(false);
                modifierM51775c = AbstractC34924m.m110153n(modifierM3483b2, listM118958J2, (Function1) ((InterfaceC21467g) objM87133R4), c28655q, 48);
            }
            c28655q.m87173q(false);
            AbstractC11894a.m31959h((String) interfaceC28601c1M83597t.getValue(), this.f57973y, this.f57966F, this.f57971w, this.f57972x, this.f57974z, modifierM51775c, this.f57967G, this.f57968H, this.f57969I, c28655q, 0);
        }
        return C23454a0.f92919a;
    }
}
