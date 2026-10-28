package t20;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.C13078q1;
import l83.C23454a0;
import n53.C26318e;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: t20.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C33331l extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139016w;

    /* JADX INFO: renamed from: x */
    public int f139017x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C33342w f139018y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C33333n f139019z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33331l(C33342w c33342w, C33333n c33333n, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f139016w = i13;
        this.f139018y = c33342w;
        this.f139019z = c33333n;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f139016w) {
            case 0:
                return new C33331l(this.f139018y, this.f139019z, interfaceC30057d, 0);
            case 1:
                return new C33331l(this.f139018y, this.f139019z, interfaceC30057d, 1);
            default:
                return new C33331l(this.f139018y, this.f139019z, interfaceC30057d, 2);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f139016w) {
            case 0:
                ((C33331l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                break;
            case 1:
                ((C33331l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                break;
            default:
                ((C33331l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                break;
        }
        return EnumC31071a.f128113w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f139016w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f139017x;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2875y.m8309v(obj);
                }
                AbstractC34132o.m107864I(obj);
                C26318e c26318e = this.f139018y.f139128c0;
                C33330k c33330k = new C33330k(this.f139019z, 0);
                this.f139017x = 1;
                c26318e.collect(c33330k, this);
                return enumC31071a;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f139017x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2875y.m8309v(obj);
                }
                AbstractC34132o.m107864I(obj);
                C26318e c26318e2 = this.f139018y.f139129d0;
                C33330k c33330k2 = new C33330k(this.f139019z, 1);
                this.f139017x = 1;
                c26318e2.collect(c33330k2, this);
                return enumC31071a2;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f139017x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C13078q1 c13078q1 = this.f139018y.f139127b0;
                    C33330k c33330k3 = new C33330k(this.f139019z, 2);
                    this.f139017x = 1;
                    if (c13078q1.f45191w.collect(c33330k3, this) == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                throw new KotlinNothingValueException();
        }
    }
}
