package i20;

import androidx.room.C1778e;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ch.C4588i;
import ec3.AbstractC13091v;
import l83.C23454a0;
import n53.C26318e;
import p000.C34292u;
import p114eb.C12982q;
import p114eb.C12991u0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: i20.e1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17939e1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69716w;

    /* JADX INFO: renamed from: x */
    public int f69717x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C17954j1 f69718y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17939e1(C17954j1 c17954j1, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f69716w = i13;
        this.f69718y = c17954j1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f69716w) {
            case 0:
                return new C17939e1(this.f69718y, interfaceC30057d, 0);
            default:
                return new C17939e1(this.f69718y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f69716w) {
            case 0:
                break;
        }
        return ((C17939e1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        C12982q c12982qM36393h;
        switch (this.f69716w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f69717x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C17954j1 c17954j1 = this.f69718y;
                    C17957k1 c17957k1 = c17954j1.f69757x;
                    c17957k1.getClass();
                    C12991u0 c12991u0 = c17957k1.f69766a;
                    C4588i c4588i = null;
                    if (c12991u0 != null && (c12982qM36393h = c12991u0.m36393h()) != null) {
                        c4588i = new C4588i(c12982qM36393h.m36480b().m5002c(null, "AutocompleteEvent"), 2);
                    }
                    if (c4588i != null) {
                        C34292u c34292u = new C34292u(c17954j1, 13);
                        this.f69717x = 1;
                        if (c4588i.collect(c34292u, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f69717x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C17954j1 c17954j2 = this.f69718y;
                    C26318e c26318e = (C26318e) c17954j2.f69751L.f98480F;
                    C1778e c1778e = new C1778e(c17954j2, null, 15);
                    this.f69717x = 1;
                    if (AbstractC13091v.m36604n(c26318e, c1778e, this) == enumC31071a2) {
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
