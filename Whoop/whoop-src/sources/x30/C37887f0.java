package x30;

import com.stripe.android.uicore.elements.IdentifierSpec;
import g40.AbstractC15327b3;
import g40.InterfaceC15379k1;
import java.util.Map;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x30.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37887f0 extends AbstractC15327b3 {

    /* JADX INFO: renamed from: b */
    public final IdentifierSpec f162234b;

    /* JADX INFO: renamed from: c */
    public final C37884e0 f162235c;

    /* JADX INFO: renamed from: d */
    public final boolean f162236d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37887f0(IdentifierSpec _identifier, C37884e0 controller) {
        super(_identifier);
        AbstractC22676k.m65750j(_identifier, "_identifier");
        AbstractC22676k.m65750j(controller, "controller");
        this.f162234b = _identifier;
        this.f162235c = controller;
        this.f162236d = true;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c mo43532c() {
        return null;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: d */
    public final boolean mo43533d() {
        return this.f162236d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37887f0)) {
            return false;
        }
        C37887f0 c37887f0 = (C37887f0) obj;
        return AbstractC22676k.m65745e(this.f162234b, c37887f0.f162234b) && AbstractC22676k.m65745e(this.f162235c, c37887f0.f162235c);
    }

    @Override // g40.AbstractC15327b3, g40.InterfaceC15450y2
    /* JADX INFO: renamed from: h */
    public final void mo43539h(Map rawValuesMap) {
        AbstractC22676k.m65750j(rawValuesMap, "rawValuesMap");
    }

    public final int hashCode() {
        return this.f162235c.hashCode() + (this.f162234b.hashCode() * 31);
    }

    @Override // g40.AbstractC15327b3
    /* JADX INFO: renamed from: k */
    public final InterfaceC15379k1 mo43534k() {
        return this.f162235c;
    }

    public final String toString() {
        return "CvcElement(_identifier=" + this.f162234b + ", controller=" + this.f162235c + ")";
    }
}
