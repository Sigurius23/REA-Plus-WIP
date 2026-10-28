package p401pj;

import java.util.ArrayList;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: pj.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C29259b extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: w */
    public int f118396w;

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C29259b(1, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C29259b) create((InterfaceC30057d) obj)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objInvoke;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f118396w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        }
        AbstractC34132o.m107864I(obj);
        C29263d c29263d = C29263d.f118419c;
        this.f118396w = 1;
        c29263d.f118420a = false;
        ArrayList arrayList = c29263d.f118421b;
        if (arrayList.isEmpty()) {
            objInvoke = c23454a0;
        } else {
            Function1 function1 = (Function1) arrayList.remove(0);
            if (c29263d.f118420a) {
                arrayList.add(function1);
            } else {
                c29263d.f118420a = true;
                objInvoke = function1.invoke(this);
                if (objInvoke != enumC31071a) {
                }
                if (objInvoke != enumC31071a) {
                    objInvoke = c23454a0;
                }
            }
            objInvoke = c23454a0;
            if (objInvoke != enumC31071a) {
                objInvoke = c23454a0;
            }
        }
        return objInvoke == enumC31071a ? enumC31071a : c23454a0;
    }
}
