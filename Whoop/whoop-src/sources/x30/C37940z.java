package x30;

import com.stripe.android.uicore.elements.IdentifierSpec;
import g40.AbstractC15327b3;
import g40.InterfaceC15379k1;
import java.util.Map;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x30.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C37940z extends AbstractC15327b3 {

    /* JADX INFO: renamed from: b */
    public final IdentifierSpec f162418b;

    /* JADX INFO: renamed from: c */
    public final C37917p0 f162419c;

    /* JADX INFO: renamed from: d */
    public final boolean f162420d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37940z(IdentifierSpec _identifier, C37917p0 c37917p0) {
        super(_identifier);
        AbstractC22676k.m65750j(_identifier, "_identifier");
        this.f162418b = _identifier;
        this.f162419c = c37917p0;
        this.f162420d = true;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c mo43532c() {
        return null;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: d */
    public final boolean mo43533d() {
        return this.f162420d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37940z)) {
            return false;
        }
        C37940z c37940z = (C37940z) obj;
        return AbstractC22676k.m65745e(this.f162418b, c37940z.f162418b) && AbstractC22676k.m65745e(this.f162419c, c37940z.f162419c);
    }

    @Override // g40.AbstractC15327b3, g40.InterfaceC15450y2
    /* JADX INFO: renamed from: h */
    public final void mo43539h(Map rawValuesMap) {
        AbstractC22676k.m65750j(rawValuesMap, "rawValuesMap");
    }

    public final int hashCode() {
        return this.f162419c.hashCode() + (this.f162418b.hashCode() * 31);
    }

    @Override // g40.AbstractC15327b3
    /* JADX INFO: renamed from: k */
    public final InterfaceC15379k1 mo43534k() {
        return this.f162419c;
    }

    public final String toString() {
        return "CardNumberElement(_identifier=" + this.f162418b + ", controller=" + this.f162419c + ")";
    }
}
