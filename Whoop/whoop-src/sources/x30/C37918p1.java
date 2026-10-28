package x30;

import com.stripe.android.uicore.elements.IdentifierSpec;
import g40.AbstractC15327b3;
import g40.C15413r0;
import g40.InterfaceC15379k1;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x30.p1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37918p1 extends AbstractC15327b3 {

    /* JADX INFO: renamed from: b */
    public final IdentifierSpec f162372b;

    /* JADX INFO: renamed from: c */
    public final C15413r0 f162373c;

    /* JADX INFO: renamed from: d */
    public final boolean f162374d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37918p1(IdentifierSpec identifier, C15413r0 c15413r0) {
        super(identifier);
        AbstractC22676k.m65750j(identifier, "identifier");
        this.f162372b = identifier;
        this.f162373c = c15413r0;
        this.f162374d = true;
    }

    @Override // g40.AbstractC15327b3, g40.InterfaceC15450y2
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43531a() {
        return this.f162372b;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c mo43532c() {
        return null;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: d */
    public final boolean mo43533d() {
        return this.f162374d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37918p1)) {
            return false;
        }
        C37918p1 c37918p1 = (C37918p1) obj;
        return AbstractC22676k.m65745e(this.f162372b, c37918p1.f162372b) && AbstractC22676k.m65745e(this.f162373c, c37918p1.f162373c);
    }

    public final int hashCode() {
        return this.f162373c.hashCode() + (this.f162372b.hashCode() * 31);
    }

    @Override // g40.AbstractC15327b3
    /* JADX INFO: renamed from: k */
    public final InterfaceC15379k1 mo43534k() {
        return this.f162373c;
    }

    public final String toString() {
        return "SimpleDropdownElement(identifier=" + this.f162372b + ", controller=" + this.f162373c + ")";
    }
}
