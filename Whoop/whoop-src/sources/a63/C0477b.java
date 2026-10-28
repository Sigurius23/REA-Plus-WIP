package a63;

import e63.C12775d;
import i63.AbstractC18161c;
import i63.AbstractC18179r;
import i63.C18163d;
import i63.C18175n;
import io.ktor.utils.p228io.InterfaceC20024q;
import j63.AbstractC21387d;
import j63.C21388e;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r63.AbstractC30993e;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import x53.C37995a;

/* JADX INFO: renamed from: a63.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C0477b extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1618w;

    /* JADX INFO: renamed from: x */
    public int f1619x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ AbstractC30993e f1620y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f1621z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0477b(int i13, int i14, InterfaceC30057d interfaceC30057d) {
        super(i13, interfaceC30057d);
        this.f1618w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC30993e abstractC30993e = (AbstractC30993e) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj3;
        switch (this.f1618w) {
            case 0:
                C0477b c0477b = new C0477b(3, 0, interfaceC30057d);
                c0477b.f1620y = abstractC30993e;
                c0477b.f1621z = obj2;
                return c0477b.invokeSuspend(C23454a0.f92919a);
            default:
                C0477b c0477b2 = new C0477b(3, 1, interfaceC30057d);
                c0477b2.f1620y = abstractC30993e;
                c0477b2.f1621z = obj2;
                return c0477b2.invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        AbstractC21387d c0491i;
        int i13 = this.f1618w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = this.f1619x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                AbstractC30993e abstractC30993e = this.f1620y;
                Object obj2 = this.f1621z;
                Function3 function3 = (Function3) ((C12775d) abstractC30993e.f127968w).f43714f.m83376d(AbstractC0483e.f1637a);
                if (function3 == null) {
                    return c23454a0;
                }
                AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
                C37995a c37995a = new C37995a((AbstractC21387d) obj2, ((C12775d) abstractC30993e.f127968w).f43713e, function3);
                this.f1620y = null;
                this.f1619x = 1;
                return abstractC30993e.mo95526d(c37995a, this) == enumC31071a ? enumC31071a : c23454a0;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i15 = this.f1619x;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                AbstractC30993e abstractC30993e2 = this.f1620y;
                Object body = this.f1621z;
                Object obj3 = abstractC30993e2.f127968w;
                C18175n c18175n = ((C12775d) obj3).f43711c;
                List list = AbstractC18179r.f70507a;
                if (c18175n.m2426w0("Accept") == null) {
                    ((C12775d) obj3).f43711c.m2422s0("Accept", "*/*");
                }
                C18163d c18163dM107885i = AbstractC34132o.m107885i((C12775d) obj3);
                if (body instanceof String) {
                    String str = (String) body;
                    if (c18163dM107885i == null) {
                        c18163dM107885i = AbstractC18161c.m52162a();
                    }
                    c0491i = new C21388e(str, c18163dM107885i);
                } else if (body instanceof byte[]) {
                    c0491i = new C0489h(c18163dM107885i, body);
                } else if (body instanceof InterfaceC20024q) {
                    c0491i = new C0491i(abstractC30993e2, c18163dM107885i, body);
                } else if (body instanceof AbstractC21387d) {
                    c0491i = (AbstractC21387d) body;
                } else {
                    C12775d context = (C12775d) obj3;
                    AbstractC22676k.m65750j(context, "context");
                    AbstractC22676k.m65750j(body, "body");
                    c0491i = body instanceof InputStream ? new C0491i(context, c18163dM107885i, body) : null;
                }
                if ((c0491i != null ? c0491i.mo1202b() : null) == null) {
                    return c23454a0;
                }
                ((Map) ((C12775d) obj3).f43711c.f3536x).remove("Content-Type");
                this.f1620y = null;
                this.f1619x = 1;
                return abstractC30993e2.mo95526d(c0491i, this) == enumC31071a2 ? enumC31071a2 : c23454a0;
        }
    }
}
