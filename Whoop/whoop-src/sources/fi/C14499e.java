package fi;

import android.content.Context;
import gi.EnumC15873d;
import gi.EnumC15876g;
import gi.InterfaceC15879j;
import java.util.Map;
import ki.C22498j;
import m83.AbstractC25247g0;
import m83.C25272z;
import ne3.AbstractC26632p;
import p196hi.C17302a;
import p461rh.C31419h;
import p461rh.C31420i;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import q83.InterfaceC30063j;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: fi.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C14499e {

    /* JADX INFO: renamed from: a */
    public final Context f52933a;

    /* JADX INFO: renamed from: b */
    public C14500f f52934b;

    /* JADX INFO: renamed from: c */
    public Object f52935c;

    /* JADX INFO: renamed from: d */
    public C17302a f52936d;

    /* JADX INFO: renamed from: e */
    public InterfaceC14502h f52937e;

    /* JADX INFO: renamed from: f */
    public boolean f52938f;

    /* JADX INFO: renamed from: g */
    public Map f52939g;

    /* JADX INFO: renamed from: h */
    public Function1 f52940h;

    /* JADX INFO: renamed from: i */
    public Function1 f52941i;

    /* JADX INFO: renamed from: j */
    public Function1 f52942j;

    /* JADX INFO: renamed from: k */
    public InterfaceC15879j f52943k;

    /* JADX INFO: renamed from: l */
    public EnumC15876g f52944l;

    /* JADX INFO: renamed from: m */
    public EnumC15873d f52945m;

    /* JADX INFO: renamed from: n */
    public Object f52946n;

    public C14499e(Context context) {
        this.f52933a = context;
        this.f52934b = C14500f.f52947o;
        this.f52935c = null;
        this.f52936d = null;
        this.f52937e = null;
        this.f52939g = C25272z.f99163w;
        C22498j c22498j = C22498j.f88197w;
        this.f52940h = c22498j;
        this.f52941i = c22498j;
        this.f52942j = c22498j;
        this.f52943k = null;
        this.f52944l = null;
        this.f52945m = null;
        this.f52946n = C31420i.f129286b;
    }

    /* JADX INFO: renamed from: a */
    public final C14503i m41408a() {
        Map mapM121638W;
        C31420i c31420i;
        Object obj = this.f52935c;
        if (obj == null) {
            obj = C14508n.f53002a;
        }
        Object obj2 = obj;
        C17302a c17302a = this.f52936d;
        InterfaceC14502h interfaceC14502h = this.f52937e;
        Map map = this.f52939g;
        if (AbstractC22676k.m65745e(map, Boolean.valueOf(this.f52938f))) {
            AbstractC22676k.m65748h(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
            mapM121638W = AbstractC37978j.m121638W(AbstractC22681m0.m65772c(map));
        } else {
            if (!(map instanceof Map)) {
                throw new AssertionError();
            }
            mapM121638W = map;
        }
        Map map2 = mapM121638W;
        AbstractC22676k.m65748h(map2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        C14500f c14500f = this.f52934b;
        AbstractC26632p abstractC26632p = c14500f.f52948a;
        EnumC14496b enumC14496b = c14500f.f52952e;
        EnumC14496b enumC14496b2 = c14500f.f52953f;
        EnumC14496b enumC14496b3 = c14500f.f52954g;
        InterfaceC30063j interfaceC30063j = c14500f.f52949b;
        InterfaceC30063j interfaceC30063j2 = c14500f.f52950c;
        InterfaceC30063j interfaceC30063j3 = c14500f.f52951d;
        Function1 function1 = this.f52940h;
        if (function1 == null) {
            function1 = c14500f.f52955h;
        }
        Function1 function2 = function1;
        Function1 function3 = this.f52941i;
        if (function3 == null) {
            function3 = c14500f.f52956i;
        }
        Function1 function4 = function3;
        Function1 function5 = this.f52942j;
        if (function5 == null) {
            function5 = c14500f.f52957j;
        }
        Function1 function6 = function5;
        InterfaceC15879j interfaceC15879j = this.f52943k;
        if (interfaceC15879j == null) {
            interfaceC15879j = c14500f.f52958k;
        }
        InterfaceC15879j interfaceC15879j2 = interfaceC15879j;
        EnumC15876g enumC15876g = this.f52944l;
        if (enumC15876g == null) {
            enumC15876g = c14500f.f52959l;
        }
        EnumC15876g enumC15876g2 = enumC15876g;
        EnumC15873d enumC15873d = this.f52945m;
        if (enumC15873d == null) {
            enumC15873d = c14500f.f52960m;
        }
        EnumC15873d enumC15873d2 = enumC15873d;
        Object obj3 = this.f52946n;
        if (obj3 instanceof C31419h) {
            c31420i = new C31420i(AbstractC37978j.m121638W(((C31419h) obj3).f129285a));
        } else {
            if (!(obj3 instanceof C31420i)) {
                throw new AssertionError();
            }
            c31420i = (C31420i) obj3;
        }
        return new C14503i(this.f52933a, obj2, c17302a, interfaceC14502h, map2, abstractC26632p, interfaceC30063j, interfaceC30063j2, interfaceC30063j3, enumC14496b, enumC14496b2, enumC14496b3, function2, function4, function6, interfaceC15879j2, enumC15876g2, enumC15873d2, c31420i, new C14501g(this.f52940h, this.f52941i, this.f52942j, this.f52943k, this.f52944l, this.f52945m), this.f52934b);
    }

    /* JADX INFO: renamed from: b */
    public final C31419h m41409b() {
        Object obj = this.f52946n;
        if (obj instanceof C31419h) {
            return (C31419h) obj;
        }
        if (!(obj instanceof C31420i)) {
            throw new AssertionError();
        }
        C31419h c31419h = new C31419h((C31420i) obj);
        this.f52946n = c31419h;
        return c31419h;
    }

    /* JADX INFO: renamed from: c */
    public final Map m41410c() {
        Map mapM74003l0 = this.f52939g;
        if (!AbstractC22676k.m65745e(mapM74003l0, Boolean.valueOf(this.f52938f))) {
            if (!(mapM74003l0 instanceof Map)) {
                throw new AssertionError();
            }
            mapM74003l0 = AbstractC25247g0.m74003l0(mapM74003l0);
            this.f52939g = mapM74003l0;
            this.f52938f = true;
        }
        AbstractC22676k.m65748h(mapM74003l0, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.String>");
        return AbstractC22681m0.m65772c(mapM74003l0);
    }

    public C14499e(C14503i c14503i, Context context) {
        this.f52933a = context;
        this.f52934b = c14503i.f52988u;
        this.f52935c = c14503i.f52969b;
        this.f52936d = c14503i.f52970c;
        this.f52937e = c14503i.f52971d;
        this.f52939g = c14503i.f52972e;
        C14501g c14501g = c14503i.f52987t;
        this.f52940h = c14501g.f52962a;
        this.f52941i = c14501g.f52963b;
        this.f52942j = c14501g.f52964c;
        this.f52943k = c14501g.f52965d;
        this.f52944l = c14501g.f52966e;
        this.f52945m = c14501g.f52967f;
        this.f52946n = c14503i.f52986s;
    }
}
