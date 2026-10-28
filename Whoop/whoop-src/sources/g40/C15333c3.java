package g40;

import com.stripe.android.uicore.elements.IdentifierSpec;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.c3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15333c3 extends AbstractC15327b3 {

    /* JADX INFO: renamed from: b */
    public final IdentifierSpec f57609b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC15391m3 f57610c;

    /* JADX INFO: renamed from: d */
    public final boolean f57611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15333c3(IdentifierSpec identifier, InterfaceC15391m3 controller) {
        super(identifier);
        AbstractC22676k.m65750j(identifier, "identifier");
        AbstractC22676k.m65750j(controller, "controller");
        this.f57609b = identifier;
        this.f57610c = controller;
        this.f57611d = true;
    }

    @Override // g40.AbstractC15327b3, g40.InterfaceC15450y2
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43531a() {
        return this.f57609b;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c mo43532c() {
        return null;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: d */
    public final boolean mo43533d() {
        return this.f57611d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15333c3)) {
            return false;
        }
        C15333c3 c15333c3 = (C15333c3) obj;
        return AbstractC22676k.m65745e(this.f57609b, c15333c3.f57609b) && AbstractC22676k.m65745e(this.f57610c, c15333c3.f57610c);
    }

    public final int hashCode() {
        return this.f57610c.hashCode() + (this.f57609b.hashCode() * 31);
    }

    @Override // g40.AbstractC15327b3
    /* JADX INFO: renamed from: k */
    public final InterfaceC15379k1 mo43534k() {
        return this.f57610c;
    }

    public final String toString() {
        return "SimpleTextElement(identifier=" + this.f57609b + ", controller=" + this.f57610c + ")";
    }
}
