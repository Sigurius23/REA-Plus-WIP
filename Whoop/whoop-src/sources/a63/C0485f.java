package a63;

import c93.InterfaceC4351m;
import f63.AbstractC14155c;
import io.ktor.client.plugins.ClientRequestException;
import io.ktor.client.plugins.RedirectResponseException;
import io.ktor.client.plugins.ResponseException;
import io.ktor.client.plugins.ServerResponseException;
import io.ktor.utils.p228io.charsets.MalformedInputException;
import j93.AbstractC21478l0;
import l83.C23454a0;
import o63.C27610a;
import o63.C27615f;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import v63.AbstractC35750h;
import w53.C36845b;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: a63.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C0485f extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public int f1642w;

    /* JADX INFO: renamed from: x */
    public int f1643x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f1644y;

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C0485f c0485f = new C0485f(2, interfaceC30057d);
        c0485f.f1644y = obj;
        return c0485f;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C0485f) create((AbstractC14155c) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i13;
        AbstractC14155c abstractC14155cM118140d;
        int i14;
        AbstractC14155c abstractC14155c;
        String str;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = this.f1643x;
        C23454a0 c23454a0 = C23454a0.f92919a;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC14155c abstractC14155c2 = (AbstractC14155c) this.f1644y;
                if (((Boolean) abstractC14155c2.mo13321a().m118139c().getAttributes().m83374b(AbstractC0499p.f1684a)).booleanValue()) {
                    i13 = abstractC14155c2.mo13325e().f70530a;
                    C36845b c36845bMo13321a = abstractC14155c2.mo13321a();
                    if (i13 >= 300) {
                        C27615f attributes = c36845bMo13321a.m118139c().getAttributes();
                        C27610a key = AbstractC0487g.f1648a;
                        attributes.getClass();
                        AbstractC22676k.m65750j(key, "key");
                        if (!attributes.m83375c().containsKey(key)) {
                            this.f1642w = i13;
                            this.f1643x = 1;
                            obj = AbstractC35750h.m113277f(c36845bMo13321a, this);
                            if (obj != enumC31071a) {
                            }
                            return enumC31071a;
                        }
                    }
                }
                return c23454a0;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i14 = this.f1642w;
                abstractC14155c = (AbstractC14155c) this.f1644y;
                try {
                    AbstractC34132o.m107864I(obj);
                    str = (String) obj;
                } catch (MalformedInputException unused) {
                    str = "<body failed decoding>";
                }
                if (300 > i14 && i14 < 400) {
                    throw new RedirectResponseException(abstractC14155c, str);
                }
                if (400 > i14 && i14 < 500) {
                    throw new ClientRequestException(abstractC14155c, str);
                }
                if (500 <= i14 || i14 >= 600) {
                    throw new ResponseException(abstractC14155c, str);
                }
                throw new ServerResponseException(abstractC14155c, str);
            }
            i13 = this.f1642w;
            AbstractC34132o.m107864I(obj);
            this.f1644y = abstractC14155cM118140d;
            this.f1642w = i13;
            this.f1643x = 2;
            Object objM60440k = AbstractC21478l0.m60440k(abstractC14155cM118140d, AbstractC39397a.f169546a, this);
            if (objM60440k != enumC31071a) {
                i14 = i13;
                abstractC14155c = abstractC14155cM118140d;
                obj = objM60440k;
                str = (String) obj;
                if (300 > i14) {
                }
                if (400 > i14) {
                }
                if (500 <= i14) {
                }
                throw new ResponseException(abstractC14155c, str);
            }
            return enumC31071a;
        } catch (MalformedInputException unused2) {
            i14 = i13;
            abstractC14155c = abstractC14155cM118140d;
            str = "<body failed decoding>";
        }
        C36845b c36845b = (C36845b) obj;
        c36845b.m118139c().getAttributes().m83377e(AbstractC0487g.f1648a, c23454a0);
        abstractC14155cM118140d = c36845b.m118140d();
    }
}
