package d33;

import e33.C12662v0;
import ec3.C13045h2;
import ec3.InterfaceC13062m;
import java.util.Set;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: d33.b1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11584b1 implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C11602h1 f37366w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Set f37367x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Set f37368y;

    public C11584b1(C11602h1 c11602h1, Set set, Set set2) {
        this.f37366w = c11602h1;
        this.f37367x = set;
        this.f37368y = set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ec3.InterfaceC13062m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object emit(C12662v0 c12662v0, InterfaceC30057d interfaceC30057d) {
        C11581a1 c11581a1;
        C13045h2 c13045h2;
        if (interfaceC30057d instanceof C11581a1) {
            c11581a1 = (C11581a1) interfaceC30057d;
            int i13 = c11581a1.f37361y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11581a1.f37361y = i13 - Integer.MIN_VALUE;
            } else {
                c11581a1 = new C11581a1(this, interfaceC30057d);
            }
        } else {
            c11581a1 = new C11581a1(this, interfaceC30057d);
        }
        Object obj = c11581a1.f37359w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11581a1.f37361y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2875y.m8309v(obj);
        }
        AbstractC34132o.m107864I(obj);
        if (c12662v0 == null || (c13045h2 = c12662v0.f43279s) == null) {
            return C23454a0.f92919a;
        }
        C11641z0 c11641z0 = new C11641z0(this.f37366w, this.f37367x, this.f37368y);
        c11581a1.f37361y = 1;
        c13045h2.collect(c11641z0, c11581a1);
        return enumC31071a;
    }
}
