package p363ob;

import androidx.room.AbstractC1848z0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ob.d */
/* JADX INFO: loaded from: classes.dex */
public final class C27781d extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f112000E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function1 f112001F;

    /* JADX INFO: renamed from: w */
    public int f112002w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC30063j f112003x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC1848z0 f112004y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f112005z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27781d(InterfaceC30063j interfaceC30063j, AbstractC1848z0 abstractC1848z0, boolean z4, boolean z13, Function1 function1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f112003x = interfaceC30063j;
        this.f112004y = abstractC1848z0;
        this.f112005z = z4;
        this.f112000E = z13;
        this.f112001F = function1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C27781d(this.f112003x, this.f112004y, this.f112005z, this.f112000E, this.f112001F, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C27781d) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f112002w;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        AbstractC34132o.m107864I(obj);
        C27780c c27780c = new C27780c(this.f112004y, this.f112005z, this.f112000E, this.f112001F, (InterfaceC30057d) null);
        this.f112002w = 1;
        Object objM8705K = AbstractC3006f0.m8705K(this.f112003x, c27780c, this);
        return objM8705K == enumC31071a ? enumC31071a : objM8705K;
    }
}
