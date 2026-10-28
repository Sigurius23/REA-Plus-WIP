package j00;

import androidx.room.C1844y;
import bc3.InterfaceC2994c0;
import bi.AbstractC3269g;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import g20.C15270p;
import io.getstream.chat.android.p226ui.viewmodel.typing.C19962a;
import iz0.C21045d;
import l83.C23454a0;
import m83.AbstractC25265s;
import n53.C26318e;
import p000.C34292u;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: j00.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C21099f extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f80007w;

    /* JADX INFO: renamed from: x */
    public int f80008x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C21103h f80009y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21099f(C21103h c21103h, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f80007w = i13;
        this.f80009y = c21103h;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f80007w) {
            case 0:
                return new C21099f(this.f80009y, interfaceC30057d, 0);
            default:
                return new C21099f(this.f80009y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f80007w) {
            case 0:
                break;
        }
        return ((C21099f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM36604n;
        switch (this.f80007w) {
            case 0:
                C21103h c21103h = this.f80009y;
                C26318e c26318e = c21103h.f80023P;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f80008x;
                InterfaceC30057d interfaceC30057d = null;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    if (AbstractC25265s.m74096F0(c21103h.f80014G.f80047d) == EnumC21094c0.f79981x) {
                        this.f80008x = 1;
                        if (C21103h.m58926j(c21103h, this) == enumC31071a) {
                            return enumC31071a;
                        }
                        this.f80008x = 2;
                        objM36604n = AbstractC13091v.m36604n(AbstractC13091v.m36612v(c26318e, 1), new C15270p(c21103h, new C19962a(c21103h, 3), interfaceC30057d, 19), this);
                        if (objM36604n != enumC31071a) {
                            objM36604n = c23454a0;
                        }
                        if (objM36604n == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        this.f80008x = 3;
                        Object objM36604n2 = AbstractC13091v.m36604n(AbstractC13091v.m36612v(c26318e, 0), new C15270p(c21103h, new C19962a(c21103h, 3), interfaceC30057d, 19), this);
                        if (objM36604n2 != enumC31071a) {
                            objM36604n2 = c23454a0;
                        }
                        if (objM36604n2 == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else if (i13 == 1) {
                    AbstractC34132o.m107864I(obj);
                    this.f80008x = 2;
                    objM36604n = AbstractC13091v.m36604n(AbstractC13091v.m36612v(c26318e, 1), new C15270p(c21103h, new C19962a(c21103h, 3), interfaceC30057d, 19), this);
                    if (objM36604n != enumC31071a) {
                        objM36604n = c23454a0;
                    }
                    if (objM36604n == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 2 && i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f80008x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C21103h c21103h2 = this.f80009y;
                    C1844y c1844yM36605o = AbstractC13091v.m36605o(c21103h2.f80023P, c21103h2.f80024Q, c21103h2.f80025R, AbstractC3269g.m9484M(c21103h2.f80015H, new C21045d(8)), new C21101g(5, 4, C21103h.class, c21103h2, "mapToUserInput", "mapToUserInput(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/stripe/android/link/ui/inline/UserInput;"));
                    C34292u c34292u = new C34292u(c21103h2, 15);
                    this.f80008x = 1;
                    if (c1844yM36605o.collect(c34292u, this) == enumC31071a2) {
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
