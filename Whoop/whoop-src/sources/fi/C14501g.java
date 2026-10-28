package fi;

import gi.EnumC15873d;
import gi.EnumC15876g;
import gi.InterfaceC15879j;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fi.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C14501g {

    /* JADX INFO: renamed from: a */
    public final Function1 f52962a;

    /* JADX INFO: renamed from: b */
    public final Function1 f52963b;

    /* JADX INFO: renamed from: c */
    public final Function1 f52964c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC15879j f52965d;

    /* JADX INFO: renamed from: e */
    public final EnumC15876g f52966e;

    /* JADX INFO: renamed from: f */
    public final EnumC15873d f52967f;

    public C14501g(Function1 function1, Function1 function2, Function1 function3, InterfaceC15879j interfaceC15879j, EnumC15876g enumC15876g, EnumC15873d enumC15873d) {
        this.f52962a = function1;
        this.f52963b = function2;
        this.f52964c = function3;
        this.f52965d = interfaceC15879j;
        this.f52966e = enumC15876g;
        this.f52967f = enumC15873d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14501g)) {
            return false;
        }
        C14501g c14501g = (C14501g) obj;
        return AbstractC22676k.m65745e(this.f52962a, c14501g.f52962a) && AbstractC22676k.m65745e(this.f52963b, c14501g.f52963b) && AbstractC22676k.m65745e(this.f52964c, c14501g.f52964c) && AbstractC22676k.m65745e(this.f52965d, c14501g.f52965d) && this.f52966e == c14501g.f52966e && this.f52967f == c14501g.f52967f;
    }

    public final int hashCode() {
        Function1 function1 = this.f52962a;
        int iHashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function1 function2 = this.f52963b;
        int iHashCode2 = (iHashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function1 function3 = this.f52964c;
        int iHashCode3 = (iHashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        InterfaceC15879j interfaceC15879j = this.f52965d;
        int iHashCode4 = (iHashCode3 + (interfaceC15879j == null ? 0 : interfaceC15879j.hashCode())) * 31;
        EnumC15876g enumC15876g = this.f52966e;
        int iHashCode5 = (iHashCode4 + (enumC15876g == null ? 0 : enumC15876g.hashCode())) * 31;
        EnumC15873d enumC15873d = this.f52967f;
        return iHashCode5 + (enumC15873d != null ? enumC15873d.hashCode() : 0);
    }

    public final String toString() {
        return "Defined(fileSystem=null, interceptorCoroutineContext=null, fetcherCoroutineContext=null, decoderCoroutineContext=null, memoryCachePolicy=null, diskCachePolicy=null, networkCachePolicy=null, placeholderFactory=" + this.f52962a + ", errorFactory=" + this.f52963b + ", fallbackFactory=" + this.f52964c + ", sizeResolver=" + this.f52965d + ", scale=" + this.f52966e + ", precision=" + this.f52967f + ')';
    }
}
