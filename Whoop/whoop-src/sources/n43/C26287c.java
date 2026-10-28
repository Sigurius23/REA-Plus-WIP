package n43;

import a30.C0332w0;
import android.content.Context;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import t23.C33366b4;
import t23.C33368c0;
import t23.C33450s0;

/* JADX INFO: renamed from: n43.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C26287c extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f104499w;

    /* JADX INFO: renamed from: x */
    public int f104500x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0332w0 f104501y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Context f104502z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26287c(C0332w0 c0332w0, Context context, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f104499w = i13;
        this.f104501y = c0332w0;
        this.f104502z = context;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f104499w) {
            case 0:
                return new C26287c(this.f104501y, this.f104502z, interfaceC30057d, 0);
            default:
                return new C26287c(this.f104501y, this.f104502z, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f104499w) {
            case 0:
                return ((C26287c) create(obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C26287c) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f104499w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f104500x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f104500x = 1;
                    if (C0332w0.m831c(this.f104501y, this.f104502z, this) == enumC31071a) {
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
                C0332w0 c0332w0 = this.f104501y;
                C33368c0 c33368c0 = (C33368c0) c0332w0.f1168x;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f104500x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C2345k c2345kM862r = c0332w0.m862r();
                    InterfaceC2339e interfaceC2339e = c2345kM862r.f9275c;
                    String str = c2345kM862r.f9273a;
                    EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                    InterfaceC30057d interfaceC30057d = null;
                    if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                        c2345kM862r.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("Observing notification updates for call: ", c33368c0.f139308v), null);
                    }
                    Function1 function1 = ((C33366b4) c0332w0.f1169y).f139235H.f64767x.f43511i;
                    C33450s0 c33450s0 = c33368c0.f139302p;
                    InterfaceC13058l interfaceC13058lM36610t = (InterfaceC13058l) function1.invoke(c33368c0);
                    if (interfaceC13058lM36610t == null) {
                        interfaceC13058lM36610t = AbstractC13091v.m36610t(AbstractC13091v.m36605o(c33450s0.f139618G, c33450s0.f139684x, (InterfaceC13037f2) c33450s0.f139666o.getValue(), c33450s0.f139628Q, new C26286b(5, null)));
                    }
                    C26287c c26287c = new C26287c(c0332w0, this.f104502z, interfaceC30057d, 0);
                    this.f104500x = 1;
                    if (AbstractC13091v.m36604n(interfaceC13058lM36610t, c26287c, this) == enumC31071a2) {
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
