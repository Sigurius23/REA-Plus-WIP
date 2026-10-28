package b30;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import d40.AbstractC11673r;
import g40.C15404p1;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.C15043i8;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC22997s1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p412q3.C29871f0;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: b30.z3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2669z3 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f10447E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f10448F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10449w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f10450x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f10451y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f10452z;

    public C2669z3(String str, InterfaceC2527g4 interfaceC2527g4, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a) {
        this.f10450x = str;
        this.f10451y = interfaceC2527g4;
        this.f10452z = z4;
        this.f10447E = z13;
        this.f10448F = interfaceC4339a;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:34:0x0104  */
    /* JADX WARN: Code duplicated, block: B:50:0x0156  */
    /* JADX WARN: Code duplicated, block: B:52:0x0192  */
    /* JADX WARN: Code duplicated, block: B:53:0x0196  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:63:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:64:0x01da  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:68:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:69:0x01fd  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC4339a interfaceC4339a;
        InterfaceC2527g4 interfaceC2527g4;
        int iM87266t;
        C28655q c28655q;
        C0213j c0213j;
        C0209i c0209i;
        boolean z4;
        String strM92103Y;
        C28655q c28655q2;
        Object objM87133R;
        boolean z13;
        long j7;
        switch (this.f10449w) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C28655q) composer).m87155h(zBooleanValue) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18) {
                    C28655q c28655q3 = (C28655q) composer;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), 8, 0.0f, 2);
                        interfaceC4339a = (InterfaceC4339a) this.f10448F;
                        interfaceC2527g4 = (InterfaceC2527g4) this.f10451y;
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iM87266t = AbstractC28683x.m87266t(composer);
                        c28655q = (C28655q) composer;
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3396r);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iM87266t))) {
                            AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                        }
                        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
                        if (zBooleanValue) {
                            c28655q.m87150e0(-576054830);
                            if (this.f10452z) {
                                c28655q.m87150e0(-576014964);
                                AbstractC2495c4.m7458e(interfaceC4339a, composer, 6);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(-575922646);
                                AbstractC2495c4.m7454a(interfaceC4339a, composer, 6);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-575803327);
                            c28655q.m87150e0(2059637786);
                            z4 = interfaceC2527g4 instanceof C2511e4;
                            if (z4) {
                                strM92103Y = this.f10450x;
                            } else {
                                strM92103Y = AbstractC30060g.m92103Y(composer, R.string.stripe_paymentsheet_primary_button_processing);
                            }
                            c28655q.m87173q(false);
                            AbstractC2495c4.m7459f(strM92103Y, !z4, this.f10447E, composer, 6);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                    }
                } else {
                    Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), 8, 0.0f, 2);
                    interfaceC4339a = (InterfaceC4339a) this.f10448F;
                    interfaceC2527g4 = (InterfaceC2527g4) this.f10451y;
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iM87266t = AbstractC28683x.m87266t(composer);
                    c28655q = (C28655q) composer;
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer, modifierM3396r2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(composer, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                    }
                    AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N2);
                    if (zBooleanValue) {
                        c28655q.m87150e0(-576054830);
                        if (this.f10452z) {
                            c28655q.m87150e0(-576014964);
                            AbstractC2495c4.m7458e(interfaceC4339a, composer, 6);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-575922646);
                            AbstractC2495c4.m7454a(interfaceC4339a, composer, 6);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-575803327);
                        c28655q.m87150e0(2059637786);
                        z4 = interfaceC2527g4 instanceof C2511e4;
                        if (z4) {
                            strM92103Y = this.f10450x;
                        } else {
                            strM92103Y = AbstractC30060g.m92103Y(composer, R.string.stripe_paymentsheet_primary_button_processing);
                        }
                        c28655q.m87173q(false);
                        AbstractC2495c4.m7459f(strM92103Y, !z4, this.f10447E, composer, 6);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                }
                break;
            case 1:
                InterfaceC22997s1 TextButton = (InterfaceC22997s1) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(TextButton, "$this$TextButton");
                if ((iIntValue2 & 17) == 16) {
                    C28655q c28655q4 = (C28655q) composer2;
                    if (c28655q4.m87121F()) {
                        c28655q4.m87138X();
                    } else {
                        AbstractC2495c4.m7455b(this.f10450x, (InterfaceC2527g4) this.f10451y, this.f10452z, this.f10447E, (InterfaceC4339a) this.f10448F, composer2, 0);
                    }
                } else {
                    AbstractC2495c4.m7455b(this.f10450x, (InterfaceC2527g4) this.f10451y, this.f10452z, this.f10447E, (InterfaceC4339a) this.f10448F, composer2, 0);
                }
                break;
            default:
                InterfaceC4351m innerTextField = (InterfaceC4351m) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                C15404p1 c15404p1 = (C15404p1) this.f10448F;
                AbstractC22676k.m65750j(innerTextField, "innerTextField");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((C28655q) composer3).m87157i(innerTextField) ? 4 : 2;
                }
                if ((iIntValue3 & 19) == 18) {
                    C28655q c28655q5 = (C28655q) composer3;
                    if (c28655q5.m87121F()) {
                        c28655q5.m87138X();
                    } else {
                        int i13 = iIntValue3;
                        C15043i8 c15043i8 = C15043i8.f56313a;
                        c28655q2 = (C28655q) composer3;
                        c28655q2.m87150e0(-1549839245);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = AbstractC11266d.m30453g(c28655q2);
                        }
                        InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                        c28655q2.m87173q(false);
                        long j13 = AbstractC11673r.m31082k(c28655q2).f37671d;
                        z13 = this.f10452z;
                        if (z13) {
                            j7 = c15404p1.f57865d;
                        } else {
                            j7 = c15404p1.f57864c;
                        }
                        long j14 = j7;
                        long j15 = AbstractC11673r.m31082k(c28655q2).f37673f;
                        long j16 = c15404p1.f57864c;
                        long j17 = c15404p1.f57863b;
                        c15043i8.m43133c(this.f10450x, innerTextField, this.f10447E, true, C29871f0.f122092w, interfaceC21083i, null, AbstractC37817c.m121344e(-1472332780, c28655q2, new C2654x2(z13, (String) this.f10451y, 1)), null, null, C15043i8.m43130h(j13, 0L, j14, j15, 0L, j16, j16, j16, 0L, 0L, 0L, j17, j17, c28655q2, 524050), AbstractC1099a.m3379a(0.0f, 0.0f, 3), c28655q2, ((i13 << 3) & 112) | 100887552, 27648, 3776);
                    }
                } else {
                    int i14 = iIntValue3;
                    C15043i8 c15043i9 = C15043i8.f56313a;
                    c28655q2 = (C28655q) composer3;
                    c28655q2.m87150e0(-1549839245);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
                    c28655q2.m87173q(false);
                    long j18 = AbstractC11673r.m31082k(c28655q2).f37671d;
                    z13 = this.f10452z;
                    if (z13) {
                        j7 = c15404p1.f57865d;
                    } else {
                        j7 = c15404p1.f57864c;
                    }
                    long j19 = j7;
                    long j110 = AbstractC11673r.m31082k(c28655q2).f37673f;
                    long j111 = c15404p1.f57864c;
                    long j112 = c15404p1.f57863b;
                    c15043i9.m43133c(this.f10450x, innerTextField, this.f10447E, true, C29871f0.f122092w, interfaceC21083i2, null, AbstractC37817c.m121344e(-1472332780, c28655q2, new C2654x2(z13, (String) this.f10451y, 1)), null, null, C15043i8.m43130h(j18, 0L, j19, j110, 0L, j111, j111, j111, 0L, 0L, 0L, j112, j112, c28655q2, 524050), AbstractC1099a.m3379a(0.0f, 0.0f, 3), c28655q2, ((i14 << 3) & 112) | 100887552, 27648, 3776);
                }
                break;
        }
        return C23454a0.f92919a;
    }

    public C2669z3(boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC2527g4 interfaceC2527g4, String str, boolean z13) {
        this.f10452z = z4;
        this.f10448F = interfaceC4339a;
        this.f10451y = interfaceC2527g4;
        this.f10450x = str;
        this.f10447E = z13;
    }

    public C2669z3(boolean z4, C15404p1 c15404p1, String str, boolean z13, String str2) {
        this.f10452z = z4;
        this.f10448F = c15404p1;
        this.f10450x = str;
        this.f10447E = z13;
        this.f10451y = str2;
    }
}
