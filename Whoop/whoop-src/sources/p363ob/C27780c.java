package p363ob;

import androidx.room.AbstractC1848z0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ob.c */
/* JADX INFO: loaded from: classes.dex */
public final class C27780c extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f111994E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function1 f111995F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f111996w = 0;

    /* JADX INFO: renamed from: x */
    public int f111997x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC1848z0 f111998y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f111999z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27780c(AbstractC1848z0 abstractC1848z0, boolean z4, boolean z13, Function1 function1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f111998y = abstractC1848z0;
        this.f111999z = z4;
        this.f111994E = z13;
        this.f111995F = function1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f111996w) {
            case 0:
                return new C27780c(this.f111998y, this.f111999z, this.f111994E, this.f111995F, interfaceC30057d);
            default:
                return new C27780c(interfaceC30057d, this.f111998y, this.f111999z, this.f111994E, this.f111995F);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f111996w) {
            case 0:
                break;
        }
        return ((C27780c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f111996w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f111997x;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AbstractC1848z0 abstractC1848z0 = this.f111998y;
                boolean z4 = !(abstractC1848z0.inCompatibilityMode() && abstractC1848z0.inTransaction()) && this.f111999z;
                boolean z13 = this.f111994E;
                AbstractC1848z0 abstractC1848z1 = this.f111998y;
                C27779b c27779b = new C27779b(z4, z13, abstractC1848z1, null, this.f111995F, 0);
                this.f111997x = 1;
                Object objUseConnection = abstractC1848z1.useConnection(z13, c27779b, this);
                return objUseConnection == enumC31071a ? enumC31071a : objUseConnection;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f111997x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                boolean z14 = this.f111994E;
                boolean z15 = this.f111999z;
                AbstractC1848z0 abstractC1848z2 = this.f111998y;
                C27779b c27779b2 = new C27779b(z14, z15, abstractC1848z2, null, this.f111995F, 1);
                this.f111997x = 1;
                Object objUseConnection2 = abstractC1848z2.useConnection(z15, c27779b2, this);
                return objUseConnection2 == enumC31071a2 ? enumC31071a2 : objUseConnection2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27780c(InterfaceC30057d interfaceC30057d, AbstractC1848z0 abstractC1848z0, boolean z4, boolean z13, Function1 function1) {
        super(2, interfaceC30057d);
        this.f111998y = abstractC1848z0;
        this.f111999z = z4;
        this.f111994E = z13;
        this.f111995F = function1;
    }
}
