package cu1;

import com.whoop.labrador.fragment.LabradorDeviceLocationFragment;
import com.whoop.labrador.fragment.LabradorReadingFragment;
import du1.C12375a;
import it1.InterfaceC20927a;
import p715kotlin.jvm.functions.Function1;
import rt1.InterfaceC31804b;

/* JADX INFO: renamed from: cu1.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C11118c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35337w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12375a f35338x;

    public /* synthetic */ C11118c(C12375a c12375a, int i13) {
        this.f35337w = i13;
        this.f35338x = c12375a;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f35337w) {
            case 0:
                return LabradorDeviceLocationFragment.m22487G(this.f35338x, (InterfaceC20927a.d) obj);
            default:
                return LabradorReadingFragment.m22504G(this.f35338x, (InterfaceC31804b.e) obj);
        }
    }
}
