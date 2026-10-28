package t23;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ch.C4588i;
import ec3.AbstractC13091v;
import fc3.C14380k;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: t23.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C33464v extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public int f139731w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33368c0 f139732x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33464v(C33368c0 c33368c0, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f139732x = c33368c0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C33464v(this.f139732x, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C33464v) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f139731w;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C33368c0 c33368c0 = this.f139732x;
            int i14 = 3;
            InterfaceC30057d interfaceC30057d = null;
            C14380k c14380kM36590P = AbstractC13091v.m36590P(AbstractC13091v.m36590P(new C4588i(c33368c0.f139268C, 2), new C33361b(i14, 2, interfaceC30057d)), new C33361b(i14, 3, interfaceC30057d));
            C33454t c33454t = new C33454t(c33368c0);
            this.f139731w = 1;
            if (c14380kM36590P.collect(c33454t, this) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return C23454a0.f92919a;
    }
}
