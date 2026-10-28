package p179h;

import c93.InterfaceC4339a;
import java.util.UUID;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: h.c */
/* JADX INFO: loaded from: classes.dex */
public final class C16345c extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: x */
    public static final C16345c f62855x;

    /* JADX INFO: renamed from: y */
    public static final C16345c f62856y;

    /* JADX INFO: renamed from: z */
    public static final C16345c f62857z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f62858w;

    static {
        int i13 = 0;
        f62855x = new C16345c(i13, 0);
        f62856y = new C16345c(i13, 1);
        f62857z = new C16345c(i13, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16345c(int i13, int i14) {
        super(i13);
        this.f62858w = i14;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f62858w) {
            case 0:
                return UUID.randomUUID().toString();
            case 1:
                return null;
            default:
                return null;
        }
    }
}
