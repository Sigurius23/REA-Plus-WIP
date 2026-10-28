package t23;

import c43.C4185a;
import c43.C4207w;
import c93.InterfaceC4351m;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: t23.e2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33382e2 extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139365w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33392g2 f139366x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33382e2(C33392g2 c33392g2, int i13) {
        super(2);
        this.f139365w = i13;
        this.f139366x = c33392g2;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f139365w) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                return new C33364b2(this.f139366x.f139422a, (C4185a) obj, zBooleanValue);
            default:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                return new C33370c2(this.f139366x.f139422a, (C4207w) obj, zBooleanValue2);
        }
    }
}
