package q20;

import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import pg3.C29205p;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: q20.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C29816f extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ String f121880E;

    /* JADX INFO: renamed from: w */
    public int f121881w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C29205p f121882x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f121883y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f121884z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29816f(C29205p c29205p, int i13, String str, String str2, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f121882x = c29205p;
        this.f121883y = i13;
        this.f121884z = str;
        this.f121880E = str2;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C29816f(this.f121882x, this.f121883y, this.f121884z, this.f121880E, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C29816f) create((InterfaceC30057d) obj)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM91325b;
        String str;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f121881w;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        AbstractC34132o.m107864I(obj);
        C29827l c29827l = (C29827l) this.f121882x.f118204x;
        int i14 = this.f121883y;
        Integer num = new Integer(i14);
        this.f121881w = 1;
        if (!c29827l.m91327a() || (str = this.f121880E) == null) {
            String str2 = this.f121884z;
            objM91325b = str2 != null ? C29827l.m91325b(c29827l, i14, num, str2, this) : C29827l.m91326c(c29827l, i14, num);
        } else {
            objM91325b = C29827l.m91325b(c29827l, i14, num, str, this);
        }
        return objM91325b == enumC31071a ? enumC31071a : objM91325b;
    }
}
