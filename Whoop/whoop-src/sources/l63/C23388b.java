package l63;

import b63.C2766d;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import i63.C18163d;
import io.ktor.serialization.JsonConvertException;
import io.ktor.serialization.gson.ExcludedTypeGsonException;
import io.ktor.utils.p228io.InterfaceC20024q;
import j63.C21388e;
import java.nio.charset.Charset;
import k63.InterfaceC22232b;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import p000.C11327d0;
import p505ts.AbstractC34132o;
import p558vp.AbstractC36259c;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: l63.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C23388b implements InterfaceC22232b {

    /* JADX INFO: renamed from: a */
    public final Gson f92690a;

    public C23388b(Gson gson) {
        this.f92690a = gson;
    }

    @Override // k63.InterfaceC22232b
    /* JADX INFO: renamed from: a */
    public final Object mo63739a(C18163d c18163d, Charset charset, C32236a c32236a, Object obj, C2766d c2766d) {
        String json = this.f92690a.toJson(obj);
        AbstractC22676k.m65749i(json, "gson.toJson(value)");
        return new C21388e(json, AbstractC29125c.m88527e0(c18163d, charset));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k63.InterfaceC22232b
    /* JADX INFO: renamed from: b */
    public final Object mo63740b(Charset charset, C32236a c32236a, InterfaceC20024q interfaceC20024q, AbstractC32269c abstractC32269c) throws Throwable {
        C23387a c23387a;
        if (abstractC32269c instanceof C23387a) {
            c23387a = (C23387a) abstractC32269c;
            int i13 = c23387a.f92689y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c23387a.f92689y = i13 - Integer.MIN_VALUE;
            } else {
                c23387a = new C23387a(this, abstractC32269c);
            }
        } else {
            c23387a = new C23387a(this, abstractC32269c);
        }
        Object obj = c23387a.f92687w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c23387a.f92689y;
        try {
            if (i14 != 0) {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC36259c.m115684c0(this.f92690a, c32236a.f133488a)) {
                throw new ExcludedTypeGsonException(c32236a.f133488a);
            }
            C22365e c22365e = AbstractC3050q0.f12077a;
            ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
            C11327d0 c11327d0 = new C11327d0(interfaceC20024q, charset, this, c32236a, null, 1);
            c23387a.f92689y = 1;
            Object objM8705K = AbstractC3006f0.m8705K(executorC22364d, c11327d0, c23387a);
            return objM8705K == enumC31071a ? enumC31071a : objM8705K;
        } catch (JsonSyntaxException e5) {
            throw new JsonConvertException(e5);
        }
    }
}
