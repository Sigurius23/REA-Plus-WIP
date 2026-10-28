package p163g1;

import com.squareup.wire.AbstractC5583n;
import l83.C23454a0;
import p077d0.InterfaceC11372l;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: g1.y3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15199y3 {

    /* JADX INFO: renamed from: a */
    public final boolean f57059a;

    /* JADX INFO: renamed from: b */
    public final C14947a0 f57060b;

    public C15199y3(EnumC15209z3 enumC15209z3, InterfaceC39171c interfaceC39171c, Function1 function1, InterfaceC11372l interfaceC11372l, boolean z4) {
        this.f57059a = z4;
        int i13 = 1;
        this.f57060b = new C14947a0(enumC15209z3, new C15116q0(i13, interfaceC39171c), new C15126r0(i13, interfaceC39171c), interfaceC11372l, function1);
        if (z4 && enumC15209z3 == EnumC15209z3.f57108y) {
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.");
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m43220a(C15199y3 c15199y3, EnumC15209z3 enumC15209z3, InterfaceC30057d interfaceC30057d) {
        Object objM16787m = AbstractC5583n.m16787m(c15199y3.f57060b, enumC15209z3, c15199y3.f57060b.f55775l.m87022x(), interfaceC30057d);
        return objM16787m == EnumC31071a.f128113w ? objM16787m : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final EnumC15209z3 m43221b() {
        return (EnumC15209z3) this.f57060b.f55770g.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final EnumC15209z3 m43222c() {
        return (EnumC15209z3) this.f57060b.f55771h.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final Object m43223d(InterfaceC30057d interfaceC30057d) {
        Object objM43220a = m43220a(this, EnumC15209z3.f57106w, interfaceC30057d);
        return objM43220a == EnumC31071a.f128113w ? objM43220a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m43224e() {
        return this.f57060b.f55770g.getValue() != EnumC15209z3.f57106w;
    }

    /* JADX INFO: renamed from: f */
    public final Object m43225f(InterfaceC30057d interfaceC30057d) {
        C14947a0 c14947a0 = this.f57060b;
        C15059k3 c15059k3M43070e = c14947a0.m43070e();
        EnumC15209z3 enumC15209z3 = EnumC15209z3.f57107x;
        boolean zContainsKey = c15059k3M43070e.f56384a.containsKey(enumC15209z3);
        if (AbstractC15189x3.f57005a[m43221b().ordinal()] == 1) {
            C15059k3 c15059k3M43070e2 = c14947a0.m43070e();
            EnumC15209z3 enumC15209z4 = EnumC15209z3.f57108y;
            if (c15059k3M43070e2.f56384a.containsKey(enumC15209z4)) {
                enumC15209z3 = enumC15209z4;
            }
        } else if (!zContainsKey) {
            enumC15209z3 = EnumC15209z3.f57106w;
        }
        Object objM43220a = m43220a(this, enumC15209z3, interfaceC30057d);
        return objM43220a == EnumC31071a.f128113w ? objM43220a : C23454a0.f92919a;
    }
}
