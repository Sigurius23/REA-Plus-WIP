package p00;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.C13045h2;
import l83.C23454a0;
import l83.C23468n;
import p505ts.AbstractC34132o;
import p547v8.AbstractC35785b;
import p631xz.C38747x;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: p00.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C28577n extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public int f115621w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C28578o f115622x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f115623y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28577n(C28578o c28578o, boolean z4, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f115622x = c28578o;
        this.f115623y = z4;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C28577n(this.f115622x, this.f115623y, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C28577n) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM124171w;
        Object value;
        C28580q c28580q;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f115621w;
        C28578o c28578o = this.f115622x;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C38747x c38747x = c28578o.f115638y;
            this.f115621w = 1;
            objM124171w = c38747x.m124171w(this.f115623y, this);
            if (objM124171w == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objM124171w = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objM124171w);
        C13045h2 c13045h2 = c28578o.f115631L;
        do {
            value = c13045h2.getValue();
            c28580q = (C28580q) value;
        } while (!c13045h2.m36569i(value, C28580q.m86911b(c28580q, false, thM68037a != null ? AbstractC35785b.m113429x(thM68037a) : null, false, c28580q.f115651z && thM68037a == null, 4067)));
        return C23454a0.f92919a;
    }
}
