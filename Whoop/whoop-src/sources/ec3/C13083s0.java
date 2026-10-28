package ec3;

import kotlinx.coroutines.flow.internal.AbortFlowException;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ec3.s0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13083s0 implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractC32275i f45209w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC13062m f45210x;

    /* JADX WARN: Multi-variable type inference failed */
    public C13083s0(Function3 function3, InterfaceC13062m interfaceC13062m) {
        this.f45209w = (AbstractC32275i) function3;
        this.f45210x = interfaceC13062m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.jvm.functions.Function3, s83.i] */
    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        C13080r0 c13080r0;
        C13083s0 c13083s0;
        if (interfaceC30057d instanceof C13080r0) {
            c13080r0 = (C13080r0) interfaceC30057d;
            int i13 = c13080r0.f45198y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13080r0.f45198y = i13 - Integer.MIN_VALUE;
            } else {
                c13080r0 = new C13080r0(this, interfaceC30057d);
            }
        } else {
            c13080r0 = new C13080r0(this, interfaceC30057d);
        }
        Object objInvoke = c13080r0.f45197x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c13080r0.f45198y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objInvoke);
            c13080r0.f45196w = this;
            c13080r0.f45198y = 1;
            objInvoke = this.f45209w.invoke(this.f45210x, obj, c13080r0);
            if (objInvoke == enumC31071a) {
                return enumC31071a;
            }
            c13083s0 = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c13083s0 = c13080r0.f45196w;
            AbstractC34132o.m107864I(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            return C23454a0.f92919a;
        }
        throw new AbortFlowException(c13083s0);
    }
}
