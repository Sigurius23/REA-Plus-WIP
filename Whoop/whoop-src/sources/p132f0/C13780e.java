package p132f0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p238j0.C21084j;
import p238j0.C21085k;
import p238j0.C21086l;
import p238j0.C21087m;
import p238j0.InterfaceC21083i;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: f0.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C13780e extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49166w;

    /* JADX INFO: renamed from: x */
    public int f49167x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C21086l f49168y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC21083i f49169z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13780e(InterfaceC21083i interfaceC21083i, C21086l c21086l, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f49166w = 2;
        this.f49169z = interfaceC21083i;
        this.f49168y = c21086l;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f49166w) {
            case 0:
                return new C13780e(this.f49168y, this.f49169z, interfaceC30057d, 0);
            case 1:
                return new C13780e(this.f49168y, this.f49169z, interfaceC30057d, 1);
            default:
                return new C13780e(this.f49169z, this.f49168y, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f49166w) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C13780e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f49166w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f49167x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C21085k c21085k = new C21085k(this.f49168y);
                    this.f49167x = 1;
                    if (((C21084j) this.f49169z).m58921a(c21085k, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f49167x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C21087m c21087m = new C21087m(this.f49168y);
                    this.f49167x = 1;
                    if (((C21084j) this.f49169z).m58921a(c21087m, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f49167x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f49167x = 1;
                    if (((C21084j) this.f49169z).m58921a(this.f49168y, this) == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13780e(C21086l c21086l, InterfaceC21083i interfaceC21083i, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f49166w = i13;
        this.f49168y = c21086l;
        this.f49169z = interfaceC21083i;
    }
}
