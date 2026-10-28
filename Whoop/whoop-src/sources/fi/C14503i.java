package fi;

import android.content.Context;
import c13.AbstractC3855a;
import gi.EnumC15873d;
import gi.EnumC15876g;
import gi.InterfaceC15879j;
import java.util.Map;
import ne3.AbstractC26632p;
import p000.AbstractC30802r;
import p196hi.C17302a;
import p461rh.C31420i;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: fi.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C14503i {

    /* JADX INFO: renamed from: a */
    public final Context f52968a;

    /* JADX INFO: renamed from: b */
    public final Object f52969b;

    /* JADX INFO: renamed from: c */
    public final C17302a f52970c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC14502h f52971d;

    /* JADX INFO: renamed from: e */
    public final Map f52972e;

    /* JADX INFO: renamed from: f */
    public final AbstractC26632p f52973f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC30063j f52974g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC30063j f52975h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC30063j f52976i;

    /* JADX INFO: renamed from: j */
    public final EnumC14496b f52977j;

    /* JADX INFO: renamed from: k */
    public final EnumC14496b f52978k;

    /* JADX INFO: renamed from: l */
    public final EnumC14496b f52979l;

    /* JADX INFO: renamed from: m */
    public final Function1 f52980m;

    /* JADX INFO: renamed from: n */
    public final Function1 f52981n;

    /* JADX INFO: renamed from: o */
    public final Function1 f52982o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC15879j f52983p;

    /* JADX INFO: renamed from: q */
    public final EnumC15876g f52984q;

    /* JADX INFO: renamed from: r */
    public final EnumC15873d f52985r;

    /* JADX INFO: renamed from: s */
    public final C31420i f52986s;

    /* JADX INFO: renamed from: t */
    public final C14501g f52987t;

    /* JADX INFO: renamed from: u */
    public final C14500f f52988u;

    public C14503i(Context context, Object obj, C17302a c17302a, InterfaceC14502h interfaceC14502h, Map map, AbstractC26632p abstractC26632p, InterfaceC30063j interfaceC30063j, InterfaceC30063j interfaceC30063j2, InterfaceC30063j interfaceC30063j3, EnumC14496b enumC14496b, EnumC14496b enumC14496b2, EnumC14496b enumC14496b3, Function1 function1, Function1 function2, Function1 function3, InterfaceC15879j interfaceC15879j, EnumC15876g enumC15876g, EnumC15873d enumC15873d, C31420i c31420i, C14501g c14501g, C14500f c14500f) {
        this.f52968a = context;
        this.f52969b = obj;
        this.f52970c = c17302a;
        this.f52971d = interfaceC14502h;
        this.f52972e = map;
        this.f52973f = abstractC26632p;
        this.f52974g = interfaceC30063j;
        this.f52975h = interfaceC30063j2;
        this.f52976i = interfaceC30063j3;
        this.f52977j = enumC14496b;
        this.f52978k = enumC14496b2;
        this.f52979l = enumC14496b3;
        this.f52980m = function1;
        this.f52981n = function2;
        this.f52982o = function3;
        this.f52983p = interfaceC15879j;
        this.f52984q = enumC15876g;
        this.f52985r = enumC15873d;
        this.f52986s = c31420i;
        this.f52987t = c14501g;
        this.f52988u = c14500f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14503i)) {
            return false;
        }
        C14503i c14503i = (C14503i) obj;
        return AbstractC22676k.m65745e(this.f52968a, c14503i.f52968a) && this.f52969b.equals(c14503i.f52969b) && AbstractC22676k.m65745e(this.f52970c, c14503i.f52970c) && AbstractC22676k.m65745e(this.f52971d, c14503i.f52971d) && this.f52972e.equals(c14503i.f52972e) && AbstractC22676k.m65745e(this.f52973f, c14503i.f52973f) && AbstractC22676k.m65745e(this.f52974g, c14503i.f52974g) && AbstractC22676k.m65745e(this.f52975h, c14503i.f52975h) && AbstractC22676k.m65745e(this.f52976i, c14503i.f52976i) && this.f52977j == c14503i.f52977j && this.f52978k == c14503i.f52978k && this.f52979l == c14503i.f52979l && AbstractC22676k.m65745e(this.f52980m, c14503i.f52980m) && AbstractC22676k.m65745e(this.f52981n, c14503i.f52981n) && AbstractC22676k.m65745e(this.f52982o, c14503i.f52982o) && AbstractC22676k.m65745e(this.f52983p, c14503i.f52983p) && this.f52984q == c14503i.f52984q && this.f52985r == c14503i.f52985r && this.f52986s.equals(c14503i.f52986s) && this.f52987t.equals(c14503i.f52987t) && AbstractC22676k.m65745e(this.f52988u, c14503i.f52988u);
    }

    public final int hashCode() {
        int iM106644c = AbstractC33745d.m106644c(this.f52968a.hashCode() * 31, 31, this.f52969b);
        C17302a c17302a = this.f52970c;
        int iHashCode = (iM106644c + (c17302a == null ? 0 : c17302a.f66506x.hashCode())) * 31;
        InterfaceC14502h interfaceC14502h = this.f52971d;
        return this.f52988u.hashCode() + ((this.f52987t.hashCode() + AbstractC3855a.m11821e(this.f52986s.f129287a, (this.f52985r.hashCode() + ((this.f52984q.hashCode() + ((this.f52983p.hashCode() + AbstractC30802r.m94756e(this.f52982o, AbstractC30802r.m94756e(this.f52981n, AbstractC30802r.m94756e(this.f52980m, (this.f52979l.hashCode() + ((this.f52978k.hashCode() + ((this.f52977j.hashCode() + ((this.f52976i.hashCode() + ((this.f52975h.hashCode() + ((this.f52974g.hashCode() + ((this.f52973f.hashCode() + AbstractC3855a.m11821e(this.f52972e, (iHashCode + (interfaceC14502h != null ? interfaceC14502h.hashCode() : 0)) * 961, 961)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961, 31), 31), 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.f52968a + ", data=" + this.f52969b + ", target=" + this.f52970c + ", listener=" + this.f52971d + ", memoryCacheKey=null, memoryCacheKeyExtras=" + this.f52972e + ", diskCacheKey=null, fileSystem=" + this.f52973f + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.f52974g + ", fetcherCoroutineContext=" + this.f52975h + ", decoderCoroutineContext=" + this.f52976i + ", memoryCachePolicy=" + this.f52977j + ", diskCachePolicy=" + this.f52978k + ", networkCachePolicy=" + this.f52979l + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.f52980m + ", errorFactory=" + this.f52981n + ", fallbackFactory=" + this.f52982o + ", sizeResolver=" + this.f52983p + ", scale=" + this.f52984q + ", precision=" + this.f52985r + ", extras=" + this.f52986s + ", defined=" + this.f52987t + ", defaults=" + this.f52988u + ')';
    }
}
