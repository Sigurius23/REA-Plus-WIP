package g40;

import com.stripe.android.uicore.elements.IdentifierSpec;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C15412r extends AbstractC15327b3 {

    /* JADX INFO: renamed from: b */
    public final IdentifierSpec f57897b;

    /* JADX INFO: renamed from: c */
    public final C15413r0 f57898c;

    /* JADX INFO: renamed from: d */
    public final boolean f57899d;

    public C15412r(IdentifierSpec identifierSpec, C15413r0 c15413r0) {
        super(identifierSpec);
        this.f57897b = identifierSpec;
        this.f57898c = c15413r0;
        this.f57899d = true;
    }

    @Override // g40.AbstractC15327b3, g40.InterfaceC15450y2
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43531a() {
        return this.f57897b;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c mo43532c() {
        return null;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: d */
    public final boolean mo43533d() {
        return this.f57899d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15412r)) {
            return false;
        }
        C15412r c15412r = (C15412r) obj;
        return AbstractC22676k.m65745e(this.f57897b, c15412r.f57897b) && AbstractC22676k.m65745e(this.f57898c, c15412r.f57898c);
    }

    public final int hashCode() {
        return this.f57898c.hashCode() + (this.f57897b.hashCode() * 31);
    }

    @Override // g40.AbstractC15327b3
    /* JADX INFO: renamed from: k */
    public final InterfaceC15379k1 mo43534k() {
        return this.f57898c;
    }

    public final String toString() {
        return "AdministrativeAreaElement(identifier=" + this.f57897b + ", controller=" + this.f57898c + ")";
    }
}
