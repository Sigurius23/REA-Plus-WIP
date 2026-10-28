package p197hj;

import c93.InterfaceC4351m;
import com.amplitude.android.engagement.C4861a;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: hj.i */
/* JADX INFO: loaded from: classes.dex */
public final class C17326i extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: x */
    public static final C17326i f67114x;

    /* JADX INFO: renamed from: y */
    public static final C17326i f67115y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67116w;

    static {
        int i13 = 2;
        f67114x = new C17326i(i13, 0);
        f67115y = new C17326i(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17326i(int i13, int i14) {
        super(i13);
        this.f67116w = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f67116w) {
            case 0:
                Exception exc = (Exception) obj2;
                if (exc != null) {
                    C4861a.f20259o.m16032K(AbstractC2875y.m8298k(exc, new StringBuilder("Failed to boot SDK: ")));
                }
                break;
            default:
                Exception exc2 = (Exception) obj2;
                if (exc2 != null) {
                    C4861a.f20259o.m16032K(AbstractC2875y.m8298k(exc2, new StringBuilder("Failed to forward event: ")));
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
