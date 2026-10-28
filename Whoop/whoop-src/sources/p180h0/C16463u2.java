package p180h0;

import androidx.compose.foundation.gestures.AbstractC1097b;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.C13045h2;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p673z7.C40137a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.u2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16463u2 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f63246E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63247w;

    /* JADX INFO: renamed from: x */
    public int f63248x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f63249y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f63250z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16463u2(Object obj, float f13, float f14, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f63247w = i13;
        this.f63246E = obj;
        this.f63249y = f13;
        this.f63250z = f14;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f63247w) {
            case 0:
                return new C16463u2((C16473w2) this.f63246E, this.f63249y, this.f63250z, interfaceC30057d, 0);
            default:
                return new C16463u2((C40137a) this.f63246E, this.f63249y, this.f63250z, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f63247w) {
            case 0:
                break;
        }
        return ((C16463u2) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f63247w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f63248x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C16372c3 c16372c3 = ((C16473w2) this.f63246E).f63298e0;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f63249y)) << 32) | (((long) Float.floatToRawIntBits(this.f63250z)) & 4294967295L);
                    this.f63248x = 1;
                    if (AbstractC1097b.m3373a(c16372c3, jFloatToRawIntBits, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                C40137a c40137a = (C40137a) this.f63246E;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f63248x;
                float f13 = this.f63250z;
                if (i14 != 0) {
                    if (i14 == 1) {
                        AbstractC34132o.m107864I(obj);
                    } else if (i14 == 2) {
                        AbstractC34132o.m107864I(obj);
                        this.f63248x = 3;
                        if (C40137a.m128681a(c40137a, f13, 0.0f, this) == enumC31071a2) {
                            return enumC31071a2;
                        }
                    } else {
                        if (i14 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    C13045h2 c13045h2 = (C13045h2) c40137a.f173193b;
                    Float f14 = new Float(0.0f);
                    c13045h2.getClass();
                    c13045h2.m36571k(null, f14);
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                c40137a.f173192a = 0;
                this.f63248x = 1;
                if (C40137a.m128681a(c40137a, this.f63249y, f13, this) == enumC31071a2) {
                    return enumC31071a2;
                }
                this.f63248x = 2;
                if (AbstractC3034m0.m8782b(50L, this) == enumC31071a2) {
                    return enumC31071a2;
                }
                this.f63248x = 3;
                if (C40137a.m128681a(c40137a, f13, 0.0f, this) == enumC31071a2) {
                    return enumC31071a2;
                }
                C13045h2 c13045h3 = (C13045h2) c40137a.f173193b;
                Float f15 = new Float(0.0f);
                c13045h3.getClass();
                c13045h3.m36571k(null, f15);
                return C23454a0.f92919a;
        }
    }
}
