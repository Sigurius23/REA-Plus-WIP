package p163g1;

import androidx.compose.material.AnchoredDragFinishedSignal;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: g1.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C15105p extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC2994c0 f56587E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56588w;

    /* JADX INFO: renamed from: x */
    public int f56589x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4351m f56590y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f56591z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15105p(InterfaceC4351m interfaceC4351m, Object obj, InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f56588w = i13;
        this.f56590y = interfaceC4351m;
        this.f56591z = obj;
        this.f56587E = interfaceC2994c0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f56588w) {
            case 0:
                return new C15105p(this.f56590y, this.f56591z, this.f56587E, interfaceC30057d, 0);
            default:
                return new C15105p(this.f56590y, this.f56591z, this.f56587E, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f56588w) {
            case 0:
                break;
        }
        return ((C15105p) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f56588w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f56589x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f56589x = 1;
                    if (this.f56590y.invoke(this.f56591z, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                AbstractC3006f0.m8714h(this.f56587E, new AnchoredDragFinishedSignal());
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f56589x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f56589x = 1;
                    if (this.f56590y.invoke(this.f56591z, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                AbstractC3006f0.m8714h(this.f56587E, new androidx.compose.material3.internal.AnchoredDragFinishedSignal());
                return C23454a0.f92919a;
        }
    }
}
