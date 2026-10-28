package p027b3;

import androidx.compose.p018ui.platform.AndroidComposeView;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: b3.u3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2450u3 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9556w;

    /* JADX INFO: renamed from: x */
    public int f9557x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C2460w3 f9558y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2450u3(C2460w3 c2460w3, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f9556w = i13;
        this.f9558y = c2460w3;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f9556w) {
            case 0:
                return new C2450u3(this.f9558y, interfaceC30057d, 0);
            default:
                return new C2450u3(this.f9558y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f9556w) {
            case 0:
                break;
        }
        return ((C2450u3) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f9556w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f9557x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    AndroidComposeView androidComposeView = this.f9558y.f9604w;
                    this.f9557x = 1;
                    Object objM7377l = androidComposeView.f4924S.m7377l(this);
                    if (objM7377l != enumC31071a) {
                        objM7377l = c23454a0;
                    }
                    if (objM7377l == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f9557x;
                C23454a0 c23454a1 = C23454a0.f92919a;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    AndroidComposeView androidComposeView2 = this.f9558y.f9604w;
                    this.f9557x = 1;
                    Object objM30896a = androidComposeView2.contentCaptureManager.m30896a(this);
                    if (objM30896a != enumC31071a2) {
                        objM30896a = c23454a1;
                    }
                    if (objM30896a == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a1;
        }
    }
}
