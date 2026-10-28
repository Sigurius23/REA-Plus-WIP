package sz;

import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.EnumC1635w;
import androidx.room.C1841x;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.stripe.android.googlepaylauncher.GooglePayLauncherActivity;
import ec3.C13078q1;
import l83.C23454a0;
import p236j.AbstractC21065d;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: sz.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C33153r extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138254w;

    /* JADX INFO: renamed from: x */
    public int f138255x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ GooglePayLauncherActivity f138256y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC21065d f138257z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33153r(GooglePayLauncherActivity googlePayLauncherActivity, AbstractC21065d abstractC21065d, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f138254w = i13;
        this.f138256y = googlePayLauncherActivity;
        this.f138257z = abstractC21065d;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f138254w) {
            case 0:
                return new C33153r(this.f138256y, this.f138257z, interfaceC30057d, 0);
            default:
                return new C33153r(this.f138256y, this.f138257z, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f138254w) {
            case 0:
                ((C33153r) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            default:
                return ((C33153r) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f138254w;
        AbstractC21065d abstractC21065d = this.f138257z;
        GooglePayLauncherActivity googlePayLauncherActivity = this.f138256y;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = this.f138255x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    int i15 = GooglePayLauncherActivity.f22184z;
                    C13078q1 c13078q1 = googlePayLauncherActivity.m16842p().f138289N;
                    C1841x c1841x = new C1841x(14, abstractC21065d, googlePayLauncherActivity);
                    this.f138255x = 1;
                    if (c13078q1.f45191w.collect(c1841x, this) == enumC31071a) {
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
                int i16 = this.f138255x;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj);
                    EnumC1635w enumC1635w = EnumC1635w.f6323E;
                    C33153r c33153r = new C33153r(googlePayLauncherActivity, abstractC21065d, null, 0);
                    this.f138255x = 1;
                    if (AbstractC1613o1.m5023m(googlePayLauncherActivity, enumC1635w, c33153r, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }
}
