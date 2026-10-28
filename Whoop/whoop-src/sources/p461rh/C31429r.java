package p461rh;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import fi.C14503i;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: rh.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C31429r extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f129306w;

    /* JADX INFO: renamed from: x */
    public int f129307x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C31431t f129308y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C14503i f129309z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C31429r(C31431t c31431t, C14503i c14503i, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f129306w = i13;
        this.f129308y = c31431t;
        this.f129309z = c14503i;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f129306w) {
            case 0:
                return new C31429r(this.f129308y, this.f129309z, interfaceC30057d, 0);
            default:
                return new C31429r(this.f129308y, this.f129309z, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f129306w) {
            case 0:
                break;
        }
        return ((C31429r) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f129306w;
        C14503i c14503i = this.f129309z;
        C31431t c31431t = this.f129308y;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = this.f129307x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                this.f129307x = 1;
                int i15 = C31431t.f129318f;
                Object objM96748b = c31431t.m96748b(c14503i, 0, this);
                return objM96748b == enumC31071a ? enumC31071a : objM96748b;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i16 = this.f129307x;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                this.f129307x = 1;
                int i17 = C31431t.f129318f;
                Object objM96748b2 = c31431t.m96748b(c14503i, 1, this);
                return objM96748b2 == enumC31071a2 ? enumC31071a2 : objM96748b2;
        }
    }
}
