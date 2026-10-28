package gb;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p077d0.C11350f1;
import p077d0.C11402t0;
import p077d0.C11420z0;
import p077d0.C11421z1;
import p114eb.C12982q;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: gb.y */
/* JADX INFO: loaded from: classes.dex */
public final class C15664y extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public int f58782w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f58783x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11350f1 f58784y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C12982q f58785z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15664y(float f13, C11350f1 c11350f1, C12982q c12982q, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f58783x = f13;
        this.f58784y = c11350f1;
        this.f58785z = c12982q;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C15664y(this.f58783x, this.f58784y, this.f58785z, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C15664y) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM30636a;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f58782w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C11350f1 c11350f1 = this.f58784y;
        float f13 = this.f58783x;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            if (f13 > 0.0f) {
                this.f58782w = 1;
                if (c11350f1.m30584O0(f13, c11350f1.f36394y.getValue(), this) != enumC31071a) {
                }
            }
            return enumC31071a;
        }
        if (i13 != 1) {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        }
        AbstractC34132o.m107864I(obj);
        if (f13 == 0.0f) {
            this.f58782w = 2;
            C11421z1 c11421z1 = c11350f1.f36381F;
            if (c11421z1 == null) {
                objM30636a = c23454a0;
            } else {
                Object value = c11350f1.f36395z.getValue();
                C12982q c12982q = this.f58785z;
                if ((AbstractC22676k.m65745e(value, c12982q) && AbstractC22676k.m65745e(c11350f1.f36394y.getValue(), c12982q)) || (objM30636a = C11402t0.m30636a(c11350f1.f36387L, new C11420z0(c11350f1, c12982q, c11421z1, (InterfaceC30057d) null), this)) != enumC31071a) {
                    objM30636a = c23454a0;
                }
            }
            if (objM30636a == enumC31071a) {
                return enumC31071a;
            }
        }
        return c23454a0;
    }
}
