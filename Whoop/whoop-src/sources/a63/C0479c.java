package a63;

import ad3.C0783z;
import b63.C2768f;
import bc3.C3004e2;
import bc3.C3023j1;
import bc3.C3072x1;
import bc3.InterfaceC3027k1;
import bc3.InterfaceC3061u;
import c63.C4277a;
import e63.C12775d;
import ec3.InterfaceC13062m;
import f63.AbstractC14155c;
import f63.C14156d;
import g63.AbstractC15538b;
import hc3.C17178k;
import i63.AbstractC18179r;
import i63.InterfaceC18174m;
import io.ktor.utils.p228io.InterfaceC20024q;
import io.ktor.utils.p228io.jvm.javaio.AbstractC20010d;
import java.io.InputStream;
import java.util.List;
import l83.C23454a0;
import mc.AbstractC25406c;
import mc.C25404a;
import p005a3.C0227m1;
import p505ts.AbstractC34132o;
import p547v8.AbstractC35785b;
import p63.C28949a;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30061h;
import q83.InterfaceC30063j;
import r63.AbstractC30993e;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32275i;
import ug.AbstractC34924m;
import v53.C35709c;
import w53.C36845b;

/* JADX INFO: renamed from: a63.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C0479c extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1626w;

    /* JADX INFO: renamed from: x */
    public int f1627x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f1628y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f1629z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0479c(int i13, int i14, InterfaceC30057d interfaceC30057d) {
        super(i13, interfaceC30057d);
        this.f1626w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f1626w) {
            case 0:
                C0479c c0479c = new C0479c(3, 0, (InterfaceC30057d) obj3);
                c0479c.f1628y = (AbstractC30993e) obj;
                c0479c.f1629z = (AbstractC14155c) obj2;
                return c0479c.invokeSuspend(C23454a0.f92919a);
            case 1:
                C0479c c0479c2 = new C0479c(3, 1, (InterfaceC30057d) obj3);
                c0479c2.f1628y = (AbstractC30993e) obj;
                c0479c2.f1629z = (C14156d) obj2;
                return c0479c2.invokeSuspend(C23454a0.f92919a);
            case 2:
                C0479c c0479c3 = new C0479c((C35709c) this.f1629z, (InterfaceC30057d) obj3, 2);
                c0479c3.f1628y = (AbstractC30993e) obj;
                return c0479c3.invokeSuspend(C23454a0.f92919a);
            case 3:
                C0479c c0479c4 = new C0479c((C2768f) this.f1629z, (InterfaceC30057d) obj3, 3);
                c0479c4.f1628y = (AbstractC30993e) obj;
                return c0479c4.invokeSuspend(C23454a0.f92919a);
            case 4:
                C0479c c0479c5 = new C0479c(3, 4, (InterfaceC30057d) obj3);
                c0479c5.f1628y = (InterfaceC13062m) obj;
                c0479c5.f1629z = (Object[]) obj2;
                return c0479c5.invokeSuspend(C23454a0.f92919a);
            default:
                C0479c c0479c6 = new C0479c((C35709c) this.f1629z, (InterfaceC30057d) obj3, 5);
                c0479c6.f1628y = (AbstractC30993e) obj;
                return c0479c6.invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC3061u interfaceC3061u;
        AbstractC30993e abstractC30993e;
        AbstractC25406c abstractC25406c;
        AbstractC30993e abstractC30993e2;
        Throwable th3;
        int i13 = this.f1626w;
        C3023j1 c3023j1 = C3023j1.f12041w;
        int i14 = 2;
        int i15 = 0;
        AbstractC25406c abstractC25406c2 = null;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i16 = this.f1627x;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                AbstractC30993e abstractC30993e3 = (AbstractC30993e) this.f1628y;
                AbstractC14155c abstractC14155c = (AbstractC14155c) this.f1629z;
                Function3 function3 = (Function3) abstractC14155c.mo13321a().m118139c().getAttributes().m83376d(AbstractC0483e.f1638b);
                if (function3 == null) {
                    return c23454a0;
                }
                InterfaceC20024q interfaceC20024qMo13322b = abstractC14155c.mo13322b();
                InterfaceC30063j coroutineContext = abstractC14155c.getCoroutineContext();
                InterfaceC18174m headers = abstractC14155c.getHeaders();
                List list = AbstractC18179r.f70507a;
                String str = headers.get("Content-Length");
                C4277a c4277aM113405a0 = AbstractC35785b.m113405a0(abstractC14155c, AbstractC34924m.m110127I(interfaceC20024qMo13322b, coroutineContext, str != null ? Long.valueOf(Long.parseLong(str)) : null, function3));
                this.f1628y = null;
                this.f1627x = 1;
                return abstractC30993e3.mo95526d(c4277aM113405a0, this) == enumC31071a ? enumC31071a : c23454a0;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i17 = this.f1627x;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                AbstractC30993e abstractC30993e4 = (AbstractC30993e) this.f1628y;
                C14156d c14156d = (C14156d) this.f1629z;
                C32236a c32236a = c14156d.f51005a;
                Object obj2 = c14156d.f51006b;
                if (!(obj2 instanceof InterfaceC20024q) || !AbstractC22676k.m65745e(c32236a.f133488a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InputStream.class))) {
                    return c23454a0;
                }
                C14156d c14156d2 = new C14156d(c32236a, new C0494k(AbstractC20010d.m55815a((InterfaceC3027k1) ((C36845b) abstractC30993e4.f127968w).getCoroutineContext().get(c3023j1), (InterfaceC20024q) obj2), abstractC30993e4));
                this.f1628y = null;
                this.f1627x = 1;
                return abstractC30993e4.mo95526d(c14156d2, this) == enumC31071a2 ? enumC31071a2 : c23454a0;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i18 = this.f1627x;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3061u = (InterfaceC3061u) this.f1628y;
                    try {
                        AbstractC34132o.m107864I(obj);
                        interfaceC3061u.complete();
                        return c23454a0;
                    } catch (Throwable th4) {
                        th = th4;
                        try {
                            interfaceC3061u.completeExceptionally(th);
                            throw th;
                        } catch (Throwable th5) {
                            interfaceC3061u.complete();
                            throw th5;
                        }
                    }
                }
                AbstractC34132o.m107864I(obj);
                AbstractC30993e abstractC30993e5 = (AbstractC30993e) this.f1628y;
                C3004e2 c3004e2 = new C3004e2(((C12775d) abstractC30993e5.f127968w).f43713e);
                InterfaceC30061h interfaceC30061h = ((C35709c) this.f1629z).f151935z.get(c3023j1);
                AbstractC22676k.m65747g(interfaceC30061h);
                c3004e2.invokeOnCompletion(new C0476a0(((InterfaceC3027k1) interfaceC30061h).invokeOnCompletion(new C0227m1(c3004e2, i14)), 0));
                try {
                    C12775d c12775d = (C12775d) abstractC30993e5.f127968w;
                    c12775d.getClass();
                    c12775d.f43713e = c3004e2;
                    this.f1628y = c3004e2;
                    this.f1627x = 1;
                    if (abstractC30993e5.mo95525c(this) == enumC31071a3) {
                        return enumC31071a3;
                    }
                    interfaceC3061u = c3004e2;
                    interfaceC3061u.complete();
                    return c23454a0;
                } catch (Throwable th6) {
                    th = th6;
                    interfaceC3061u = c3004e2;
                    interfaceC3061u.completeExceptionally(th);
                    throw th;
                }
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i19 = this.f1627x;
                if (i19 == 0) {
                    AbstractC34132o.m107864I(obj);
                    abstractC30993e = (AbstractC30993e) this.f1628y;
                    C2768f c2768f = (C2768f) this.f1629z;
                    C12775d c12775d2 = (C12775d) abstractC30993e.f127968w;
                    Object objMo95524b = abstractC30993e.mo95524b();
                    this.f1628y = abstractC30993e;
                    this.f1627x = 1;
                    obj = c2768f.m7832a(c12775d2, objMo95524b, this);
                    if (obj != enumC31071a4) {
                    }
                    return enumC31071a4;
                }
                if (i19 != 1) {
                    if (i19 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                abstractC30993e = (AbstractC30993e) this.f1628y;
                AbstractC34132o.m107864I(obj);
                if (obj == null) {
                    return c23454a0;
                }
                this.f1628y = null;
                this.f1627x = 2;
                if (abstractC30993e.mo95526d(obj, this) != enumC31071a4) {
                    return c23454a0;
                }
                return enumC31071a4;
            case 4:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i24 = this.f1627x;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f1628y;
                AbstractC25406c[] abstractC25406cArr = (AbstractC25406c[]) ((Object[]) this.f1629z);
                int length = abstractC25406cArr.length;
                while (true) {
                    abstractC25406c = C25404a.f99501a;
                    if (i15 < length) {
                        AbstractC25406c abstractC25406c3 = abstractC25406cArr[i15];
                        if (AbstractC22676k.m65745e(abstractC25406c3, abstractC25406c)) {
                            i15++;
                        } else {
                            abstractC25406c2 = abstractC25406c3;
                        }
                    }
                }
                if (abstractC25406c2 != null) {
                    abstractC25406c = abstractC25406c2;
                }
                this.f1627x = 1;
                return interfaceC13062m.emit(abstractC25406c, this) == enumC31071a5 ? enumC31071a5 : c23454a0;
            default:
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                int i25 = this.f1627x;
                if (i25 == 0) {
                    AbstractC34132o.m107864I(obj);
                    AbstractC30993e abstractC30993e6 = (AbstractC30993e) this.f1628y;
                    try {
                        this.f1628y = abstractC30993e6;
                        this.f1627x = 1;
                        return abstractC30993e6.mo95525c(this) == enumC31071a6 ? enumC31071a6 : c23454a0;
                    } catch (Throwable th7) {
                        abstractC30993e2 = abstractC30993e6;
                        th3 = th7;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC30993e2 = (AbstractC30993e) this.f1628y;
                    try {
                        AbstractC34132o.m107864I(obj);
                        return c23454a0;
                    } catch (Throwable th8) {
                        th3 = th8;
                    }
                }
                C0783z c0783z = ((C35709c) this.f1629z).f151930J;
                ((C36845b) abstractC30993e2.f127968w).m118140d();
                c0783z.getClass();
                C3072x1 c3072x1 = (C3072x1) ((C28949a) c0783z.f2818x).m87910a(AbstractC15538b.f58266d);
                if (c3072x1 != null) {
                    for (C17178k c17178kM48528f = (C17178k) C17178k.f65987w.get(c3072x1); !AbstractC22676k.m65745e(c17178kM48528f, c3072x1); c17178kM48528f = c17178kM48528f.m48528f()) {
                    }
                }
                throw th3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0479c(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(3, interfaceC30057d);
        this.f1626w = i13;
        this.f1629z = obj;
    }
}
