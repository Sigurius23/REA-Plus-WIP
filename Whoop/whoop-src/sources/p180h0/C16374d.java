package p180h0;

import bp0.C3529q;
import c93.InterfaceC4352n;
import l83.C23454a0;
import p077d0.AbstractC11348f;
import p077d0.InterfaceC11372l;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.C22663d0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C16374d extends AbstractC32275i implements InterfaceC4352n {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C16435p f62955E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC11372l f62956F;

    /* JADX INFO: renamed from: w */
    public int f62957w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ InterfaceC16356a f62958x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ InterfaceC16397h1 f62959y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f62960z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16374d(C16435p c16435p, InterfaceC11372l interfaceC11372l, InterfaceC30057d interfaceC30057d) {
        super(4, interfaceC30057d);
        this.f62955E = c16435p;
        this.f62956F = interfaceC11372l;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C16374d c16374d = new C16374d(this.f62955E, this.f62956F, (InterfaceC30057d) obj4);
        c16374d.f62958x = (InterfaceC16356a) obj;
        c16374d.f62959y = (InterfaceC16397h1) obj2;
        c16374d.f62960z = obj3;
        return c16374d.invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006d  */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM30555c;
        Object obj2 = EnumC31071a.f128113w;
        int i13 = this.f62957w;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC16356a interfaceC16356a = this.f62958x;
            InterfaceC16397h1 interfaceC16397h1 = this.f62959y;
            Object obj3 = this.f62960z;
            C16435p c16435p = this.f62955E;
            float fM87022x = c16435p.f63155g.m87022x();
            this.f62958x = null;
            this.f62959y = null;
            this.f62957w = 1;
            float fM46650e = ((C16475x) interfaceC16397h1).m46650e(obj3);
            C22663d0 c22663d0 = new C22663d0();
            c22663d0.f89331w = Float.isNaN(c16435p.f63154f.m87022x()) ? 0.0f : c16435p.f63154f.m87022x();
            if (Float.isNaN(fM46650e)) {
                objM30555c = C23454a0.f92919a;
            } else {
                float f13 = c22663d0.f89331w;
                if (f13 == fM46650e) {
                    objM30555c = C23454a0.f92919a;
                } else {
                    objM30555c = AbstractC11348f.m30555c(f13, fM46650e, fM87022x, this.f62956F, new C3529q(1, interfaceC16356a, c22663d0), this);
                    if (objM30555c != EnumC31071a.f128113w) {
                        objM30555c = C23454a0.f92919a;
                    }
                }
            }
            if (objM30555c == obj2) {
                return obj2;
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
