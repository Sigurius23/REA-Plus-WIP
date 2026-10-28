package g40;

import com.stripe.android.uicore.elements.IdentifierSpec;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15366i0 extends AbstractC15327b3 {

    /* JADX INFO: renamed from: b */
    public final IdentifierSpec f57765b;

    /* JADX INFO: renamed from: c */
    public final C15413r0 f57766c;

    /* JADX INFO: renamed from: d */
    public final boolean f57767d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15366i0(IdentifierSpec identifier, C15413r0 c15413r0) {
        super(identifier);
        AbstractC22676k.m65750j(identifier, "identifier");
        this.f57765b = identifier;
        this.f57766c = c15413r0;
        this.f57767d = true;
    }

    @Override // g40.AbstractC15327b3, g40.InterfaceC15450y2
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43531a() {
        return this.f57765b;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c mo43532c() {
        return null;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: d */
    public final boolean mo43533d() {
        return this.f57767d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15366i0)) {
            return false;
        }
        C15366i0 c15366i0 = (C15366i0) obj;
        return AbstractC22676k.m65745e(this.f57765b, c15366i0.f57765b) && AbstractC22676k.m65745e(this.f57766c, c15366i0.f57766c);
    }

    public final int hashCode() {
        return this.f57766c.hashCode() + (this.f57765b.hashCode() * 31);
    }

    @Override // g40.AbstractC15327b3
    /* JADX INFO: renamed from: k */
    public final InterfaceC15379k1 mo43534k() {
        return this.f57766c;
    }

    public final String toString() {
        return "CountryElement(identifier=" + this.f57765b + ", controller=" + this.f57766c + ")";
    }
}
