package p159fy;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.stripe.android.challenge.passive.warmer.activity.PassiveChallengeWarmerActivity;
import ec3.C13096w1;
import l83.C23454a0;
import p000.C34292u;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: fy.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C14856a extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55477w;

    /* JADX INFO: renamed from: x */
    public int f55478x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ PassiveChallengeWarmerActivity f55479y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14856a(PassiveChallengeWarmerActivity passiveChallengeWarmerActivity, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f55477w = i13;
        this.f55479y = passiveChallengeWarmerActivity;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f55477w) {
            case 0:
                return new C14856a(this.f55479y, interfaceC30057d, 0);
            default:
                return new C14856a(this.f55479y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f55477w) {
            case 0:
                break;
        }
        return ((C14856a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f55477w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f55478x;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                PassiveChallengeWarmerActivity passiveChallengeWarmerActivity = this.f55479y;
                C13096w1 c13096w1 = ((C14862g) passiveChallengeWarmerActivity.f22149x.getValue()).f55497z;
                C34292u c34292u = new C34292u(passiveChallengeWarmerActivity, 8);
                this.f55478x = 1;
                c13096w1.collect(c34292u, this);
                return enumC31071a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f55478x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    PassiveChallengeWarmerActivity passiveChallengeWarmerActivity2 = this.f55479y;
                    C14862g c14862g = (C14862g) passiveChallengeWarmerActivity2.f22149x.getValue();
                    this.f55478x = 1;
                    if (c14862g.m42885g(passiveChallengeWarmerActivity2, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }
}
