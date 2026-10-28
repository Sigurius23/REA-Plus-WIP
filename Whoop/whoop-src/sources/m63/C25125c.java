package m63;

import ad3.AbstractC0757c;
import b63.C2766d;
import i63.C18163d;
import io.ktor.serialization.JsonConvertException;
import io.ktor.utils.p228io.C20020m;
import io.ktor.utils.p228io.InterfaceC20024q;
import io.sentry.config.AbstractC20301a;
import java.nio.charset.Charset;
import k63.InterfaceC22232b;
import la.C23548b;
import p505ts.AbstractC34132o;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import v63.AbstractC35750h;
import v63.C35747e;
import wc3.InterfaceC37138c;

/* JADX INFO: renamed from: m63.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C25125c implements InterfaceC22232b {

    /* JADX INFO: renamed from: a */
    public final AbstractC0757c f98477a;

    /* JADX INFO: renamed from: b */
    public final C23548b f98478b;

    public C25125c(AbstractC0757c abstractC0757c) {
        this.f98477a = abstractC0757c;
        this.f98478b = new C23548b(this, abstractC0757c);
    }

    @Override // k63.InterfaceC22232b
    /* JADX INFO: renamed from: a */
    public final Object mo63739a(C18163d c18163d, Charset charset, C32236a c32236a, Object obj, C2766d c2766d) {
        return this.f98478b.m68165G(new C25126d(this.f98477a, obj, c32236a, charset, c18163d), c2766d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k63.InterfaceC22232b
    /* JADX INFO: renamed from: b */
    public final Object mo63740b(Charset charset, C32236a c32236a, InterfaceC20024q interfaceC20024q, AbstractC32269c abstractC32269c) throws JsonConvertException {
        C25124b c25124b;
        Charset charset2;
        InterfaceC37138c interfaceC37138c;
        C25125c c25125c;
        if (abstractC32269c instanceof C25124b) {
            c25124b = (C25124b) abstractC32269c;
            int i13 = c25124b.f98472F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c25124b.f98472F = i13 - Integer.MIN_VALUE;
            } else {
                c25124b = new C25124b(this, abstractC32269c);
            }
        } else {
            c25124b = new C25124b(this, abstractC32269c);
        }
        Object objM55857v = c25124b.f98476z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c25124b.f98472F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM55857v);
            InterfaceC37138c interfaceC37138cM56326Y = AbstractC20301a.m56326Y(c32236a, this.f98477a.f2764b);
            c25124b.f98473w = this;
            c25124b.f98474x = charset;
            c25124b.f98475y = interfaceC37138cM56326Y;
            c25124b.f98472F = 1;
            objM55857v = ((C20020m) interfaceC20024q).m55857v(c25124b);
            if (objM55857v == enumC31071a) {
                return enumC31071a;
            }
            charset2 = charset;
            interfaceC37138c = interfaceC37138cM56326Y;
            c25125c = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC37138c = c25124b.f98475y;
            charset2 = c25124b.f98474x;
            c25125c = c25124b.f98473w;
            AbstractC34132o.m107864I(objM55857v);
        }
        try {
            return c25125c.f98477a.m1831b(interfaceC37138c, AbstractC35750h.m113276e((C35747e) objM55857v, charset2));
        } catch (Throwable th3) {
            throw new JsonConvertException("Illegal input", th3);
        }
    }
}
