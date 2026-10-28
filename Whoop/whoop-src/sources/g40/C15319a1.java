package g40;

import com.stripe.android.uicore.elements.IdentifierSpec;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.a1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15319a1 extends AbstractC15327b3 {

    /* JADX INFO: renamed from: b */
    public final IdentifierSpec f57552b;

    /* JADX INFO: renamed from: c */
    public final String f57553c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC15391m3 f57554d;

    /* JADX INFO: renamed from: e */
    public final boolean f57555e;

    public C15319a1(IdentifierSpec identifier, String str, int i13) {
        if ((i13 & 1) != 0) {
            IdentifierSpec.Companion.getClass();
            identifier = IdentifierSpec.Email;
        }
        C15351f3 c15351f3 = new C15351f3(new C15453z0(false, 3), str, null, 4);
        AbstractC22676k.m65750j(identifier, "identifier");
        super(identifier);
        this.f57552b = identifier;
        this.f57553c = str;
        this.f57554d = c15351f3;
        this.f57555e = true;
    }

    @Override // g40.AbstractC15327b3, g40.InterfaceC15450y2
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43531a() {
        return this.f57552b;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c mo43532c() {
        return null;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: d */
    public final boolean mo43533d() {
        return this.f57555e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15319a1)) {
            return false;
        }
        C15319a1 c15319a1 = (C15319a1) obj;
        return AbstractC22676k.m65745e(this.f57552b, c15319a1.f57552b) && AbstractC22676k.m65745e(this.f57553c, c15319a1.f57553c) && AbstractC22676k.m65745e(this.f57554d, c15319a1.f57554d);
    }

    public final int hashCode() {
        int iHashCode = this.f57552b.hashCode() * 31;
        String str = this.f57553c;
        return this.f57554d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // g40.AbstractC15327b3
    /* JADX INFO: renamed from: k */
    public final InterfaceC15379k1 mo43534k() {
        return this.f57554d;
    }

    public final String toString() {
        return "EmailElement(identifier=" + this.f57552b + ", initialValue=" + this.f57553c + ", controller=" + this.f57554d + ")";
    }
}
