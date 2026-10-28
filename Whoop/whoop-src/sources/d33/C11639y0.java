package d33;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.C13045h2;
import java.util.Set;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: d33.y0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11639y0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public int f37595w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11602h1 f37596x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Set f37597y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Set f37598z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11639y0(C11602h1 c11602h1, Set set, Set set2, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f37596x = c11602h1;
        this.f37597y = set;
        this.f37598z = set2;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C11639y0(this.f37596x, this.f37597y, this.f37598z, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ((C11639y0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        return EnumC31071a.f128113w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f37595w;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2875y.m8309v(obj);
        }
        AbstractC34132o.m107864I(obj);
        C11602h1 c11602h1 = this.f37596x;
        C13045h2 c13045h2 = c11602h1.f37421A;
        C11637x0 c11637x0 = new C11637x0(c11602h1, this.f37597y, this.f37598z);
        this.f37595w = 1;
        c13045h2.collect(c11637x0, this);
        return enumC31071a;
    }
}
