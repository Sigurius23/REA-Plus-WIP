package p163g1;

import com.squareup.wire.AbstractC5583n;
import l83.C23454a0;
import p077d0.InterfaceC11372l;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: g1.s0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15136s0 {

    /* JADX INFO: renamed from: a */
    public final C14947a0 f56747a;

    /* JADX INFO: renamed from: b */
    public final C15098o2 f56748b;

    public C15136s0(EnumC15146t0 enumC15146t0, InterfaceC39171c interfaceC39171c, Function1 function1, InterfaceC11372l interfaceC11372l) {
        int i13 = 0;
        C14947a0 c14947a0 = new C14947a0(enumC15146t0, new C15116q0(i13, interfaceC39171c), new C15126r0(i13, interfaceC39171c), interfaceC11372l, function1);
        this.f56747a = c14947a0;
        float f13 = AbstractC15108p2.f56602a;
        this.f56748b = new C15098o2(c14947a0);
    }

    /* JADX INFO: renamed from: a */
    public final Object m43185a(AbstractC32275i abstractC32275i) {
        Object objM16788n = AbstractC5583n.m16788n(this.f56747a, EnumC15146t0.f56806w, abstractC32275i);
        return objM16788n == EnumC31071a.f128113w ? objM16788n : C23454a0.f92919a;
    }
}
