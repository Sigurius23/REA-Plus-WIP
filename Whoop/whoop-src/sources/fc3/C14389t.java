package fc3;

import bc3.AbstractC3006f0;
import c41.C4065l3;
import ec3.InterfaceC13062m;
import f91.C14284b;
import l83.C23454a0;
import l83.C23468n;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32270d;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: fc3.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C14389t extends AbstractC32269c implements InterfaceC13062m {

    /* JADX INFO: renamed from: E */
    public InterfaceC30057d f52527E;

    /* JADX INFO: renamed from: w */
    public final InterfaceC13062m f52528w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC30063j f52529x;

    /* JADX INFO: renamed from: y */
    public final int f52530y;

    /* JADX INFO: renamed from: z */
    public InterfaceC30063j f52531z;

    public C14389t(InterfaceC13062m interfaceC13062m, InterfaceC30063j interfaceC30063j) {
        super(C30064k.f122676w, C14387r.f52525w);
        this.f52528w = interfaceC13062m;
        this.f52529x = interfaceC30063j;
        this.f52530y = ((Number) interfaceC30063j.fold(0, new C14284b(7))).intValue();
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        try {
            Object objM41042f = m41042f(interfaceC30057d, obj);
            return objM41042f == EnumC31071a.f128113w ? objM41042f : C23454a0.f92919a;
        } catch (Throwable th3) {
            this.f52531z = new C14385p(interfaceC30057d.getContext(), th3);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: f */
    public final Object m41042f(InterfaceC30057d interfaceC30057d, Object obj) {
        InterfaceC30063j context = interfaceC30057d.getContext();
        AbstractC3006f0.m8721o(context);
        InterfaceC30063j interfaceC30063j = this.f52531z;
        if (interfaceC30063j != context) {
            if (interfaceC30063j instanceof C14385p) {
                throw new IllegalStateException(AbstractC39415s.m125909s("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C14385p) interfaceC30063j).f52524x + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new C4065l3(this, 2))).intValue() != this.f52530y) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f52529x + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f52531z = context;
        }
        this.f52527E = interfaceC30057d;
        Function3 function3 = AbstractC14391v.f52533a;
        InterfaceC13062m interfaceC13062m = this.f52528w;
        AbstractC22676k.m65748h(interfaceC13062m, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objInvoke = function3.invoke(interfaceC13062m, obj, this);
        if (!AbstractC22676k.m65745e(objInvoke, EnumC31071a.f128113w)) {
            this.f52527E = null;
        }
        return objInvoke;
    }

    @Override // s83.AbstractC32267a, s83.InterfaceC32270d
    public final InterfaceC32270d getCallerFrame() {
        InterfaceC30057d interfaceC30057d = this.f52527E;
        if (interfaceC30057d instanceof InterfaceC32270d) {
            return (InterfaceC32270d) interfaceC30057d;
        }
        return null;
    }

    @Override // s83.AbstractC32269c, q83.InterfaceC30057d
    public final InterfaceC30063j getContext() {
        InterfaceC30063j interfaceC30063j = this.f52531z;
        return interfaceC30063j == null ? C30064k.f122676w : interfaceC30063j;
    }

    @Override // s83.AbstractC32267a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Throwable thM68037a = C23468n.m68037a(obj);
        if (thM68037a != null) {
            this.f52531z = new C14385p(getContext(), thM68037a);
        }
        InterfaceC30057d interfaceC30057d = this.f52527E;
        if (interfaceC30057d != null) {
            interfaceC30057d.resumeWith(obj);
        }
        return EnumC31071a.f128113w;
    }
}
