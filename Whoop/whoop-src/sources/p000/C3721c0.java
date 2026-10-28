package p000;

import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import l83.C23454a0;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p390p1.C28617g1;
import p390p1.InterfaceC28690z0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: c0 */
/* JADX INFO: loaded from: classes10.dex */
public final class C3721c0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15197w;

    /* JADX INFO: renamed from: x */
    public int f15198x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C12476e0 f15199y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28690z0 f15200z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3721c0(C12476e0 c12476e0, InterfaceC28690z0 interfaceC28690z0, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f15197w = i13;
        this.f15199y = c12476e0;
        this.f15200z = interfaceC28690z0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f15197w) {
            case 0:
                return new C3721c0(this.f15199y, this.f15200z, interfaceC30057d, 0);
            default:
                return new C3721c0(this.f15199y, this.f15200z, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f15197w) {
            case 0:
                break;
        }
        return ((C3721c0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f15197w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f15198x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C12476e0 c12476e0 = this.f15199y;
                    float f13 = (c12476e0.f42595s * 3.0f) + 100.0f;
                    C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(c12476e0.f42593q, 0, null, 6);
                    final int i14 = 0;
                    final InterfaceC28690z0 interfaceC28690z0 = this.f15200z;
                    InterfaceC4351m interfaceC4351m = new InterfaceC4351m() { // from class: b0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj2, Object obj3) {
                            int i15 = i14;
                            float fFloatValue = ((Float) obj2).floatValue();
                            ((Float) obj3).getClass();
                            switch (i15) {
                                case 0:
                                    ((C28617g1) interfaceC28690z0).m87023y(fFloatValue);
                                    break;
                                default:
                                    ((C28617g1) interfaceC28690z0).m87023y(fFloatValue);
                                    break;
                            }
                            return C23454a0.f92919a;
                        }
                    };
                    this.f15198x = 1;
                    if (AbstractC11348f.m30557e(0.0f, f13, c11347e2M30574v, interfaceC4351m, this, 4) == enumC31071a) {
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
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i15 = this.f15198x;
                C12476e0 c12476e1 = this.f15199y;
                if (i15 != 0) {
                    if (i15 == 1) {
                        AbstractC34132o.m107864I(obj);
                    } else {
                        if (i15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                long j7 = c12476e1.f42594r;
                this.f15198x = 1;
                if (AbstractC3034m0.m8782b(j7, this) == enumC31071a2) {
                    return enumC31071a2;
                }
                float fM36283m = AbstractC12889b.m36283m(c12476e1.f42577a, 0.0f, 100.0f);
                C11347e2 c11347e2M30574v2 = AbstractC11348f.m30574v(c12476e1.f42592p, 0, null, 6);
                final int i16 = 1;
                final InterfaceC28690z0 interfaceC28690z1 = this.f15200z;
                InterfaceC4351m interfaceC4351m2 = new InterfaceC4351m() { // from class: b0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        int i17 = i16;
                        float fFloatValue = ((Float) obj2).floatValue();
                        ((Float) obj3).getClass();
                        switch (i17) {
                            case 0:
                                ((C28617g1) interfaceC28690z1).m87023y(fFloatValue);
                                break;
                            default:
                                ((C28617g1) interfaceC28690z1).m87023y(fFloatValue);
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                };
                this.f15198x = 2;
                if (AbstractC11348f.m30557e(0.0f, fM36283m, c11347e2M30574v2, interfaceC4351m2, this, 4) == enumC31071a2) {
                    return enumC31071a2;
                }
                return C23454a0.f92919a;
        }
    }
}
