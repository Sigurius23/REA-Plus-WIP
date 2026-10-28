package cu1;

import be2.InterfaceC3175b;
import com.whoop.labrador.fragment.LabradorRegistrationFragment;
import com.whoop.shepherd.fragment.ShepherdRegistrationFragment;
import p114eb.AbstractC12939a0;
import p715kotlin.jvm.functions.Function1;
import vt1.InterfaceC36487a;

/* JADX INFO: renamed from: cu1.e */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C11120e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35341w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC12939a0 f35342x;

    public /* synthetic */ C11120e(AbstractC12939a0 abstractC12939a0, int i13) {
        this.f35341w = i13;
        this.f35342x = abstractC12939a0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f35341w) {
            case 0:
                return LabradorRegistrationFragment.m22510B(this.f35342x, (InterfaceC36487a.c) obj);
            default:
                return ShepherdRegistrationFragment.m25881B(this.f35342x, (InterfaceC3175b.c) obj);
        }
    }
}
