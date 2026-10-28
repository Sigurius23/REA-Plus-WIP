package p470rv;

import androidx.room.C1841x;
import c93.InterfaceC4339a;
import ch.C4594o;
import e33.C12659u;
import ec3.AbstractC13091v;
import ec3.C13036f1;
import ec3.C13045h2;
import ec3.C13054k;
import ec3.C13078q1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import m63.C25126d;
import p007a6.C0454t;
import p127ev.EnumC13677r;
import p505ts.AbstractC34132o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import w23.C36758p;

/* JADX INFO: renamed from: rv.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C31826f extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f131853E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f131854F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f131855w = 0;

    /* JADX INFO: renamed from: x */
    public int f131856x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ InterfaceC13062m f131857y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f131858z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31826f(InterfaceC30057d interfaceC30057d, C25126d c25126d, InterfaceC13058l interfaceC13058l) {
        super(3, interfaceC30057d);
        this.f131853E = c25126d;
        this.f131854F = interfaceC13058l;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [c93.a, kotlin.jvm.internal.m] */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC13062m interfaceC13062m = (InterfaceC13062m) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj3;
        switch (this.f131855w) {
            case 0:
                C31826f c31826f = new C31826f(interfaceC30057d, (C25126d) this.f131853E, (InterfaceC13058l) this.f131854F);
                c31826f.f131857y = interfaceC13062m;
                c31826f.f131858z = obj2;
                return c31826f.invokeSuspend(C23454a0.f92919a);
            default:
                C31826f c31826f2 = new C31826f(interfaceC30057d, (C36758p) this.f131853E, (InterfaceC4339a) this.f131854F);
                c31826f2.f131857y = interfaceC13062m;
                c31826f2.f131858z = obj2;
                return c31826f2.invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [c93.a, kotlin.jvm.internal.m] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC13058l c4594o;
        switch (this.f131855w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f131856x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = this.f131857y;
                    EnumC13677r enumC13677r = (EnumC13677r) this.f131858z;
                    int i14 = enumC13677r == null ? -1 : AbstractC31825e.f131852a[enumC13677r.ordinal()];
                    if (i14 == -1) {
                        c4594o = C13054k.f45116w;
                    } else if (i14 == 1) {
                        c4594o = (C13078q1) ((C25126d) this.f131853E).f98480F;
                    } else {
                        if (i14 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c4594o = new C4594o((InterfaceC13058l) this.f131854F, 6);
                    }
                    this.f131856x = 1;
                    if (AbstractC13091v.m36613w(interfaceC13062m, c4594o, this) == enumC31071a) {
                        return enumC31071a;
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
                int i15 = this.f131856x;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m2 = this.f131857y;
                C12659u c12659u = (C12659u) this.f131858z;
                C13045h2 c13045h2 = c12659u.f43278r;
                C36758p c36758p = (C36758p) this.f131853E;
                ?? r10 = (AbstractC22680m) this.f131854F;
                this.f131856x = 1;
                AbstractC13091v.m36615y(interfaceC13062m2);
                c13045h2.collect(new C1841x(20, new C0454t(new C13036f1(new C1841x(21, interfaceC13062m2, c12659u), r10, c36758p), 2), c36758p), this);
                return enumC31071a2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C31826f(InterfaceC30057d interfaceC30057d, C36758p c36758p, InterfaceC4339a interfaceC4339a) {
        super(3, interfaceC30057d);
        this.f131853E = c36758p;
        this.f131854F = (AbstractC22680m) interfaceC4339a;
    }
}
