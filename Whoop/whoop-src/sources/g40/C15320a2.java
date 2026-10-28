package g40;

import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.InterfaceC13037f2;
import ej1.C13242h;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.a2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15320a2 extends AbstractC15327b3 {

    /* JADX INFO: renamed from: b */
    public final IdentifierSpec f57556b;

    /* JADX INFO: renamed from: c */
    public final C15454z1 f57557c;

    /* JADX INFO: renamed from: d */
    public final boolean f57558d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15320a2(IdentifierSpec identifier, C15454z1 c15454z1) {
        super(identifier);
        AbstractC22676k.m65750j(identifier, "identifier");
        this.f57556b = identifier;
        this.f57557c = c15454z1;
        this.f57558d = true;
    }

    @Override // g40.AbstractC15327b3, g40.InterfaceC15450y2
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43531a() {
        return this.f57556b;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c mo43532c() {
        return null;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: d */
    public final boolean mo43533d() {
        return this.f57558d;
    }

    @Override // g40.AbstractC15327b3, g40.InterfaceC15450y2
    /* JADX INFO: renamed from: e */
    public final InterfaceC13037f2 mo43535e() {
        C15454z1 c15454z1 = this.f57557c;
        return AbstractC3269g.m9509p(c15454z1.f58058m, c15454z1.f58056k, new C13242h(this, 18));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15320a2)) {
            return false;
        }
        C15320a2 c15320a2 = (C15320a2) obj;
        return AbstractC22676k.m65745e(this.f57556b, c15320a2.f57556b) && AbstractC22676k.m65745e(this.f57557c, c15320a2.f57557c);
    }

    public final int hashCode() {
        return this.f57557c.hashCode() + (this.f57556b.hashCode() * 31);
    }

    @Override // g40.AbstractC15327b3
    /* JADX INFO: renamed from: k */
    public final InterfaceC15379k1 mo43534k() {
        return this.f57557c;
    }

    public final String toString() {
        return "PhoneNumberElement(identifier=" + this.f57556b + ", controller=" + this.f57557c + ")";
    }
}
