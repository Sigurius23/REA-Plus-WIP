package p395p6;

import android.os.Bundle;
import c93.InterfaceC4352n;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: p6.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28874e0 extends AbstractC32275i implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f116862w;

    /* JADX INFO: renamed from: x */
    public int f116863x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ C28894l f116864y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f116865z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28874e0(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(4, interfaceC30057d);
        this.f116862w = i13;
        this.f116865z = obj;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i13 = this.f116862w;
        C28894l c28894l = (C28894l) obj2;
        ((Boolean) obj3).getClass();
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj4;
        switch (i13) {
            case 0:
                C28874e0 c28874e0 = new C28874e0((Bundle) this.f116865z, interfaceC30057d, 0);
                c28874e0.f116864y = c28894l;
                return c28874e0.invokeSuspend(C23454a0.f92919a);
            default:
                C28874e0 c28874e1 = new C28874e0((String) this.f116865z, interfaceC30057d, 1);
                c28874e1.f116864y = c28894l;
                return c28874e1.invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f116862w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f116863x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C28894l c28894l = this.f116864y;
                    Bundle bundle = (Bundle) this.f116865z;
                    this.f116863x = 1;
                    c28894l.getClass();
                    Object objM87816e = c28894l.m87816e(new C28873e(bundle), this);
                    if (objM87816e != enumC31071a) {
                        objM87816e = c23454a0;
                    }
                    if (objM87816e == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f116863x;
                C23454a0 c23454a1 = C23454a0.f92919a;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C28894l c28894l2 = this.f116864y;
                    String str = (String) this.f116865z;
                    this.f116863x = 1;
                    c28894l2.getClass();
                    Object objM87816e2 = c28894l2.m87816e(new C28870d(str), this);
                    if (objM87816e2 != enumC31071a2) {
                        objM87816e2 = c23454a1;
                    }
                    if (objM87816e2 == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a1;
        }
    }
}
