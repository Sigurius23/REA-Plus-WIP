package w23;

import bc3.InterfaceC2994c0;
import be.C3151d;
import c93.InterfaceC4351m;
import ch.C4588i;
import ec3.AbstractC13091v;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import io.sentry.android.replay.video.C20245d;
import l83.C23454a0;
import p000.C34292u;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import t23.C33361b;

/* JADX INFO: renamed from: w23.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C36748f extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public int f157276w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC13037f2 f157277x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC13037f2 f157278y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C20245d f157279z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36748f(InterfaceC13037f2 interfaceC13037f2, InterfaceC13037f2 interfaceC13037f3, C20245d c20245d, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f157277x = interfaceC13037f2;
        this.f157278y = interfaceC13037f3;
        this.f157279z = c20245d;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C36748f(this.f157277x, this.f157278y, this.f157279z, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C36748f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f157276w;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            int i14 = 3;
            InterfaceC30057d interfaceC30057d = null;
            InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(AbstractC13091v.m36590P(AbstractC13091v.m36590P(AbstractC13091v.m36590P(new C4588i(this.f157277x, 2), new C33361b(i14, 4, interfaceC30057d)), new C33361b(i14, 5, interfaceC30057d)), new C3151d(interfaceC30057d, this.f157278y, 8)));
            C34292u c34292u = new C34292u(this.f157279z, 27);
            this.f157276w = 1;
            if (interfaceC13058lM36610t.collect(c34292u, this) == enumC31071a) {
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
