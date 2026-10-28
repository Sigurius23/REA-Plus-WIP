package p102dy;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.stripe.android.challenge.passive.PassiveChallengeActivity;
import ec3.C13096w1;
import l83.C23454a0;
import p000.C34292u;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: dy.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C12432a extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42360w;

    /* JADX INFO: renamed from: x */
    public int f42361x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ PassiveChallengeActivity f42362y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12432a(PassiveChallengeActivity passiveChallengeActivity, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f42360w = i13;
        this.f42362y = passiveChallengeActivity;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f42360w) {
            case 0:
                return new C12432a(this.f42362y, interfaceC30057d, 0);
            default:
                return new C12432a(this.f42362y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f42360w) {
            case 0:
                break;
        }
        return ((C12432a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f42360w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f42361x;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                PassiveChallengeActivity passiveChallengeActivity = this.f42362y;
                C13096w1 c13096w1 = ((C12441j) passiveChallengeActivity.f22146x.getValue()).f42383z;
                C34292u c34292u = new C34292u(passiveChallengeActivity, 7);
                this.f42361x = 1;
                c13096w1.collect(c34292u, this);
                return enumC31071a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f42361x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    PassiveChallengeActivity passiveChallengeActivity2 = this.f42362y;
                    C12441j c12441j = (C12441j) passiveChallengeActivity2.f22146x.getValue();
                    this.f42361x = 1;
                    if (c12441j.m34996g(passiveChallengeActivity2, this) == enumC31071a2) {
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
