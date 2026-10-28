package a63;

import e63.C12775d;
import f63.C14156d;
import i63.AbstractC18161c;
import i63.AbstractC18179r;
import i63.C18163d;
import i63.C18175n;
import i63.InterfaceC18174m;
import io.ktor.utils.p228io.C20020m;
import io.ktor.utils.p228io.InterfaceC20024q;
import j63.C21388e;
import java.nio.charset.Charset;
import java.util.List;
import l83.C23454a0;
import p249jc.AbstractC21598x;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import r63.AbstractC30993e;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32275i;
import u63.AbstractC34560a;
import v63.AbstractC35750h;
import v63.C35747e;
import w53.C36845b;

/* JADX INFO: renamed from: a63.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C0502s extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C0504u f1686E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1687w;

    /* JADX INFO: renamed from: x */
    public int f1688x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ AbstractC30993e f1689y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f1690z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0502s(C0504u c0504u, InterfaceC30057d interfaceC30057d, int i13) {
        super(3, interfaceC30057d);
        this.f1687w = i13;
        this.f1686E = c0504u;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC30993e abstractC30993e = (AbstractC30993e) obj;
        switch (this.f1687w) {
            case 0:
                C0502s c0502s = new C0502s(this.f1686E, (InterfaceC30057d) obj3, 0);
                c0502s.f1689y = abstractC30993e;
                c0502s.f1690z = obj2;
                return c0502s.invokeSuspend(C23454a0.f92919a);
            default:
                C0502s c0502s2 = new C0502s(this.f1686E, (InterfaceC30057d) obj3, 1);
                c0502s2.f1689y = abstractC30993e;
                c0502s2.f1690z = (C14156d) obj2;
                return c0502s2.invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Charset charset;
        AbstractC30993e abstractC30993e;
        C32236a c32236a;
        C18163d c18163dM60682h0;
        int i13 = this.f1687w;
        C0504u c0504u = this.f1686E;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = this.f1688x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                AbstractC30993e abstractC30993e2 = this.f1689y;
                Object obj2 = this.f1690z;
                C12775d context = (C12775d) abstractC30993e2.f127968w;
                c0504u.getClass();
                AbstractC22676k.m65750j(context, "context");
                C18175n c18175n = context.f43711c;
                List list = AbstractC18179r.f70507a;
                if (c18175n.m2426w0("Accept-Charset") == null) {
                    String value = c0504u.f1696c;
                    AbstractC22676k.m65750j(value, "value");
                    c18175n.mo2418F0(value);
                    List listM2425v0 = c18175n.m2425v0("Accept-Charset");
                    listM2425v0.clear();
                    listM2425v0.add(value);
                }
                if (!(obj2 instanceof String)) {
                    return c23454a0;
                }
                C18163d c18163dM107885i = AbstractC34132o.m107885i((C12775d) abstractC30993e2.f127968w);
                if (c18163dM107885i != null && !AbstractC22676k.m65745e(c18163dM107885i.f70477d, AbstractC18161c.m52162a().f70477d)) {
                    return c23454a0;
                }
                String str = (String) obj2;
                C18163d c18163dM52162a = c18163dM107885i == null ? AbstractC18161c.m52162a() : c18163dM107885i;
                if (c18163dM107885i == null || (charset = AbstractC29125c.m88536m(c18163dM107885i)) == null) {
                    charset = c0504u.f1695b;
                }
                AbstractC22676k.m65750j(c18163dM52162a, "<this>");
                AbstractC22676k.m65750j(charset, "charset");
                C21388e c21388e = new C21388e(str, c18163dM52162a.m52164g(AbstractC34560a.m109275c(charset)));
                this.f1689y = null;
                this.f1688x = 1;
                return abstractC30993e2.mo95526d(c21388e, this) == enumC31071a ? enumC31071a : c23454a0;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i15 = this.f1688x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    AbstractC30993e abstractC30993e3 = this.f1689y;
                    C14156d c14156d = (C14156d) this.f1690z;
                    C32236a c32236a2 = c14156d.f51005a;
                    Object obj3 = c14156d.f51006b;
                    if (!AbstractC22676k.m65745e(c32236a2.f133488a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(String.class)) || !(obj3 instanceof InterfaceC20024q)) {
                        return c23454a0;
                    }
                    this.f1689y = abstractC30993e3;
                    this.f1690z = c32236a2;
                    this.f1688x = 1;
                    Object objM55857v = ((C20020m) ((InterfaceC20024q) obj3)).m55857v(this);
                    if (objM55857v != enumC31071a2) {
                        abstractC30993e = abstractC30993e3;
                        obj = objM55857v;
                        c32236a = c32236a2;
                    }
                    return enumC31071a2;
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                c32236a = (C32236a) this.f1690z;
                abstractC30993e = this.f1689y;
                AbstractC34132o.m107864I(obj);
                C35747e body = (C35747e) obj;
                C36845b call = (C36845b) abstractC30993e.f127968w;
                c0504u.getClass();
                AbstractC22676k.m65750j(call, "call");
                AbstractC22676k.m65750j(body, "body");
                InterfaceC18174m headers = call.m118140d().getHeaders();
                List list2 = AbstractC18179r.f70507a;
                String str2 = headers.get("Content-Type");
                if (str2 != null) {
                    C18163d c18163d = C18163d.f70476f;
                    c18163dM60682h0 = AbstractC21598x.m60682h0(str2);
                } else {
                    c18163dM60682h0 = null;
                }
                Charset charsetM88536m = c18163dM60682h0 != null ? AbstractC29125c.m88536m(c18163dM60682h0) : null;
                if (charsetM88536m == null) {
                    charsetM88536m = c0504u.f1694a;
                }
                C14156d c14156d2 = new C14156d(c32236a, AbstractC35750h.m113276e(body, charsetM88536m));
                this.f1689y = null;
                this.f1690z = null;
                this.f1688x = 2;
                if (abstractC30993e.mo95526d(c14156d2, this) != enumC31071a2) {
                    return c23454a0;
                }
                return enumC31071a2;
        }
    }
}
