package p292l1;

import androidx.compose.material3.AbstractC1123d;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p077d0.C11344e;
import p077d0.InterfaceC11372l;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: l1.p4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23155p4 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91580w;

    /* JADX INFO: renamed from: x */
    public int f91581x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C23161q4 f91582y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f91583z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23155p4(C23161q4 c23161q4, float f13, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f91580w = i13;
        this.f91582y = c23161q4;
        this.f91583z = f13;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f91580w) {
            case 0:
                return new C23155p4(this.f91582y, this.f91583z, interfaceC30057d, 0);
            default:
                return new C23155p4(this.f91582y, this.f91583z, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f91580w) {
            case 0:
                break;
        }
        return ((C23155p4) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f91580w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f91581x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C23161q4 c23161q4 = this.f91582y;
                    C11344e c11344e = c23161q4.f91614T;
                    if (c11344e != null) {
                        Float f13 = new Float(this.f91583z);
                        InterfaceC11372l interfaceC11372l = c23161q4.f91612R ? AbstractC1123d.f4760f : c23161q4.f91611Q;
                        this.f91581x = 1;
                        obj = C11344e.m30547d(c11344e, f13, interfaceC11372l, null, this, 12);
                        if (obj == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                    return C23454a0.f92919a;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f91581x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C23161q4 c23161q5 = this.f91582y;
                    C11344e c11344e2 = c23161q5.f91613S;
                    if (c11344e2 != null) {
                        Float f14 = new Float(this.f91583z);
                        InterfaceC11372l interfaceC11372l2 = c23161q5.f91612R ? AbstractC1123d.f4760f : c23161q5.f91611Q;
                        this.f91581x = 1;
                        obj = C11344e.m30547d(c11344e2, f14, interfaceC11372l2, null, this, 12);
                        if (obj == enumC31071a2) {
                            return enumC31071a2;
                        }
                    }
                    return C23454a0.f92919a;
                }
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return C23454a0.f92919a;
        }
    }
}
