package sz;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity;
import ec3.C13081r1;
import l83.C23454a0;
import p000.C34292u;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: sz.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C33138j0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138206w;

    /* JADX INFO: renamed from: x */
    public int f138207x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ GooglePayPaymentMethodLauncherActivity f138208y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33138j0(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f138206w = i13;
        this.f138208y = googlePayPaymentMethodLauncherActivity;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f138206w) {
            case 0:
                return new C33138j0(this.f138208y, interfaceC30057d, 0);
            default:
                return new C33138j0(this.f138208y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f138206w) {
            case 0:
                ((C33138j0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            default:
                return ((C33138j0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f138206w;
        GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = this.f138208y;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = this.f138207x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    int i15 = GooglePayPaymentMethodLauncherActivity.f22188z;
                    C13081r1 c13081r1 = googlePayPaymentMethodLauncherActivity.m16844p().f138246I;
                    C34292u c34292u = new C34292u(googlePayPaymentMethodLauncherActivity, 24);
                    this.f138207x = 1;
                    if (c13081r1.f45200w.collect(c34292u, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                throw new KotlinNothingValueException();
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i16 = this.f138207x;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                int i17 = GooglePayPaymentMethodLauncherActivity.f22188z;
                C33150p0 c33150p0M16844p = googlePayPaymentMethodLauncherActivity.m16844p();
                this.f138207x = 1;
                Object objM105018j = c33150p0M16844p.m105018j(this);
                return objM105018j == enumC31071a2 ? enumC31071a2 : objM105018j;
        }
    }
}
