package p222ij;

import c93.InterfaceC4351m;
import com.amplitude.android.engagement.C4861a;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: ij.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C18578d extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public static final C18578d f72587w = new C18578d(2);

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Exception exc = (Exception) obj2;
        if (exc != null) {
            C4861a.f20259o.m16032K("AsyncNativeBridge", AbstractC2875y.m8298k(exc, new StringBuilder("Error sending error response: ")));
        }
        return C23454a0.f92919a;
    }
}
