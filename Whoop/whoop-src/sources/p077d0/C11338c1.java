package p077d0;

import bc3.AbstractC3006f0;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: d0.c1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11338c1 extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C11421z1 f36325E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ float f36326F;

    /* JADX INFO: renamed from: w */
    public int f36327w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f36328x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f36329y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C11350f1 f36330z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11338c1(Object obj, Object obj2, C11350f1 c11350f1, C11421z1 c11421z1, float f13, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f36328x = obj;
        this.f36329y = obj2;
        this.f36330z = c11350f1;
        this.f36325E = c11421z1;
        this.f36326F = f13;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C11338c1(this.f36328x, this.f36329y, this.f36330z, this.f36325E, this.f36326F, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C11338c1) create((InterfaceC30057d) obj)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f36327w;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C11334b1 c11334b1 = new C11334b1(this.f36328x, this.f36329y, this.f36330z, this.f36325E, this.f36326F, null);
            this.f36327w = 1;
            if (AbstractC3006f0.m8719m(c11334b1, this) == enumC31071a) {
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
