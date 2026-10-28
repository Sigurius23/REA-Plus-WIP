package p180h0;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p512u2.EnumC34466l;
import p512u2.InterfaceC34449b;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32274h;

/* JADX INFO: renamed from: h0.p1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16437p1 extends AbstractC32274h implements InterfaceC4351m {

    /* JADX INFO: renamed from: x */
    public int f63164x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f63165y;

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C16437p1 c16437p1 = new C16437p1(2, interfaceC30057d);
        c16437p1.f63165y = obj;
        return c16437p1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C16437p1) create((InterfaceC34449b) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f63164x;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC34449b interfaceC34449b = (InterfaceC34449b) this.f63165y;
            this.f63164x = 1;
            if (AbstractC16444q3.m46624f(interfaceC34449b, EnumC34466l.f144808y, this) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return C23454a0.f92919a;
    }
}
