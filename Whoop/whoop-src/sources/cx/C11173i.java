package cx;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: cx.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C11173i extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35761w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11174j f35762x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Boolean f35763y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11173i(C11174j c11174j, Boolean bool, int i13) {
        super(0);
        this.f35761w = i13;
        this.f35762x = c11174j;
        this.f35763y = bool;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f35761w) {
            case 0:
                Boolean granted = this.f35763y;
                AbstractC22676k.m65749i(granted, "$granted");
                boolean zBooleanValue = granted.booleanValue();
                C11174j c11174j = this.f35762x;
                if (c11174j.m30278y()) {
                    c11174j.m30276A(new C11170f(zBooleanValue, c11174j, 0));
                }
                break;
            default:
                Boolean granted2 = this.f35763y;
                AbstractC22676k.m65749i(granted2, "$granted");
                boolean zBooleanValue2 = granted2.booleanValue();
                C11174j c11174j2 = this.f35762x;
                if (c11174j2.m30278y()) {
                    c11174j2.m30276A(new C11170f(zBooleanValue2, c11174j2, 1));
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
