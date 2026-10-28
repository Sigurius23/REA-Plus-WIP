package t23;

import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: t23.f1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33386f1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139377w;

    /* JADX INFO: renamed from: x */
    public int f139378x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C33391g1 f139379y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C33368c0 f139380z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33386f1(C33391g1 c33391g1, C33368c0 c33368c0, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f139377w = i13;
        this.f139379y = c33391g1;
        this.f139380z = c33368c0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f139377w) {
            case 0:
                return new C33386f1(this.f139379y, this.f139380z, interfaceC30057d, 0);
            default:
                return new C33386f1(this.f139379y, this.f139380z, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f139377w) {
            case 0:
                break;
        }
        return ((C33386f1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f139377w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f139378x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f139378x = 1;
                    if (AbstractC3034m0.m8782b(500L, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.f139379y.m105846b(this.f139380z, "ongoing_call");
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f139378x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f139378x = 1;
                    if (AbstractC3034m0.m8782b(500L, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.f139379y.m105846b(this.f139380z, "ongoing_call");
                return C23454a0.f92919a;
        }
    }
}
