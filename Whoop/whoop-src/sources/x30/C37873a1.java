package x30;

import com.stripe.android.uicore.elements.IdentifierSpec;
import g40.AbstractC15327b3;
import g40.C15351f3;
import g40.InterfaceC15379k1;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x30.a1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37873a1 extends AbstractC15327b3 {

    /* JADX INFO: renamed from: b */
    public final IdentifierSpec f162188b;

    /* JADX INFO: renamed from: c */
    public final C15351f3 f162189c;

    /* JADX INFO: renamed from: d */
    public final boolean f162190d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37873a1(IdentifierSpec identifier, C15351f3 c15351f3) {
        super(identifier);
        AbstractC22676k.m65750j(identifier, "identifier");
        this.f162188b = identifier;
        this.f162189c = c15351f3;
        this.f162190d = true;
    }

    @Override // g40.AbstractC15327b3, g40.InterfaceC15450y2
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43531a() {
        return this.f162188b;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c mo43532c() {
        return null;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: d */
    public final boolean mo43533d() {
        return this.f162190d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37873a1)) {
            return false;
        }
        C37873a1 c37873a1 = (C37873a1) obj;
        return AbstractC22676k.m65745e(this.f162188b, c37873a1.f162188b) && AbstractC22676k.m65745e(this.f162189c, c37873a1.f162189c);
    }

    public final int hashCode() {
        return this.f162189c.hashCode() + (this.f162188b.hashCode() * 31);
    }

    @Override // g40.AbstractC15327b3
    /* JADX INFO: renamed from: k */
    public final InterfaceC15379k1 mo43534k() {
        return this.f162189c;
    }

    public final String toString() {
        return "IbanElement(identifier=" + this.f162188b + ", controller=" + this.f162189c + ")";
    }
}
