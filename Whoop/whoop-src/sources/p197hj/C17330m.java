package p197hj;

import c93.InterfaceC4351m;
import com.amplitude.android.engagement.C4861a;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: hj.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C17330m extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: x */
    public static final C17330m f67123x;

    /* JADX INFO: renamed from: y */
    public static final C17330m f67124y;

    /* JADX INFO: renamed from: z */
    public static final C17330m f67125z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67126w;

    static {
        int i13 = 2;
        f67123x = new C17330m(i13, 0);
        f67124y = new C17330m(i13, 1);
        f67125z = new C17330m(i13, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17330m(int i13, int i14) {
        super(i13);
        this.f67126w = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f67126w) {
            case 0:
                Exception exc = (Exception) obj2;
                if (exc != null) {
                    C4861a.f20259o.m16032K(AbstractC2875y.m8298k(exc, new StringBuilder("Failed to execute nudge action: ")));
                }
                break;
            case 1:
                Exception exc2 = (Exception) obj2;
                if (exc2 != null) {
                    C4861a.f20259o.m16032K(AbstractC2875y.m8298k(exc2, new StringBuilder("Failed to set location: ")));
                }
                break;
            default:
                Exception exc3 = (Exception) obj2;
                if (exc3 != null) {
                    C4861a.f20259o.m16032K(AbstractC2875y.m8298k(exc3, new StringBuilder("Failed to start nudge debug session: ")));
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
