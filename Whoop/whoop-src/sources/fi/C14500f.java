package fi;

import bc3.AbstractC3050q0;
import gi.C15874e;
import gi.EnumC15873d;
import gi.EnumC15876g;
import gi.InterfaceC15879j;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import ki.C22498j;
import ne3.AbstractC26632p;
import ne3.C26603a0;
import p000.AbstractC30802r;
import p461rh.C31420i;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: fi.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C14500f {

    /* JADX INFO: renamed from: o */
    public static final C14500f f52947o;

    /* JADX INFO: renamed from: a */
    public final AbstractC26632p f52948a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC30063j f52949b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC30063j f52950c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC30063j f52951d;

    /* JADX INFO: renamed from: e */
    public final EnumC14496b f52952e;

    /* JADX INFO: renamed from: f */
    public final EnumC14496b f52953f;

    /* JADX INFO: renamed from: g */
    public final EnumC14496b f52954g;

    /* JADX INFO: renamed from: h */
    public final Function1 f52955h;

    /* JADX INFO: renamed from: i */
    public final Function1 f52956i;

    /* JADX INFO: renamed from: j */
    public final Function1 f52957j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC15879j f52958k;

    /* JADX INFO: renamed from: l */
    public final EnumC15876g f52959l;

    /* JADX INFO: renamed from: m */
    public final EnumC15873d f52960m;

    /* JADX INFO: renamed from: n */
    public final C31420i f52961n;

    static {
        C26603a0 c26603a0 = AbstractC26632p.f105900w;
        C22365e c22365e = AbstractC3050q0.f12077a;
        ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
        EnumC14496b enumC14496b = EnumC14496b.ENABLED;
        C15874e c15874e = InterfaceC15879j.f59995a;
        EnumC15876g enumC15876g = EnumC15876g.f59985x;
        EnumC15873d enumC15873d = EnumC15873d.f59980w;
        C31420i c31420i = C31420i.f129286b;
        C30064k c30064k = C30064k.f122676w;
        C22498j c22498j = C22498j.f88197w;
        f52947o = new C14500f(c26603a0, c30064k, executorC22364d, executorC22364d, enumC14496b, enumC14496b, enumC14496b, c22498j, c22498j, c22498j, c15874e, enumC15876g, enumC15873d, c31420i);
    }

    public C14500f(AbstractC26632p abstractC26632p, InterfaceC30063j interfaceC30063j, InterfaceC30063j interfaceC30063j2, InterfaceC30063j interfaceC30063j3, EnumC14496b enumC14496b, EnumC14496b enumC14496b2, EnumC14496b enumC14496b3, Function1 function1, Function1 function2, Function1 function3, InterfaceC15879j interfaceC15879j, EnumC15876g enumC15876g, EnumC15873d enumC15873d, C31420i c31420i) {
        this.f52948a = abstractC26632p;
        this.f52949b = interfaceC30063j;
        this.f52950c = interfaceC30063j2;
        this.f52951d = interfaceC30063j3;
        this.f52952e = enumC14496b;
        this.f52953f = enumC14496b2;
        this.f52954g = enumC14496b3;
        this.f52955h = function1;
        this.f52956i = function2;
        this.f52957j = function3;
        this.f52958k = interfaceC15879j;
        this.f52959l = enumC15876g;
        this.f52960m = enumC15873d;
        this.f52961n = c31420i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14500f)) {
            return false;
        }
        C14500f c14500f = (C14500f) obj;
        return AbstractC22676k.m65745e(this.f52948a, c14500f.f52948a) && AbstractC22676k.m65745e(this.f52949b, c14500f.f52949b) && AbstractC22676k.m65745e(this.f52950c, c14500f.f52950c) && AbstractC22676k.m65745e(this.f52951d, c14500f.f52951d) && this.f52952e == c14500f.f52952e && this.f52953f == c14500f.f52953f && this.f52954g == c14500f.f52954g && AbstractC22676k.m65745e(this.f52955h, c14500f.f52955h) && AbstractC22676k.m65745e(this.f52956i, c14500f.f52956i) && AbstractC22676k.m65745e(this.f52957j, c14500f.f52957j) && AbstractC22676k.m65745e(this.f52958k, c14500f.f52958k) && this.f52959l == c14500f.f52959l && this.f52960m == c14500f.f52960m && AbstractC22676k.m65745e(this.f52961n, c14500f.f52961n);
    }

    public final int hashCode() {
        return this.f52961n.f129287a.hashCode() + ((this.f52960m.hashCode() + ((this.f52959l.hashCode() + ((this.f52958k.hashCode() + AbstractC30802r.m94756e(this.f52957j, AbstractC30802r.m94756e(this.f52956i, AbstractC30802r.m94756e(this.f52955h, (this.f52954g.hashCode() + ((this.f52953f.hashCode() + ((this.f52952e.hashCode() + ((this.f52951d.hashCode() + ((this.f52950c.hashCode() + ((this.f52949b.hashCode() + (this.f52948a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.f52948a + ", interceptorCoroutineContext=" + this.f52949b + ", fetcherCoroutineContext=" + this.f52950c + ", decoderCoroutineContext=" + this.f52951d + ", memoryCachePolicy=" + this.f52952e + ", diskCachePolicy=" + this.f52953f + ", networkCachePolicy=" + this.f52954g + ", placeholderFactory=" + this.f52955h + ", errorFactory=" + this.f52956i + ", fallbackFactory=" + this.f52957j + ", sizeResolver=" + this.f52958k + ", scale=" + this.f52959l + ", precision=" + this.f52960m + ", extras=" + this.f52961n + ')';
    }
}
