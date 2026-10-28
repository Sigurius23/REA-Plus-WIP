package p525uj;

import c93.InterfaceC4339a;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p636y3.C39174f;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: uj.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C35025c extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public static final C35025c f148208E;

    /* JADX INFO: renamed from: F */
    public static final C35025c f148209F;

    /* JADX INFO: renamed from: x */
    public static final C35025c f148210x;

    /* JADX INFO: renamed from: y */
    public static final C35025c f148211y;

    /* JADX INFO: renamed from: z */
    public static final C35025c f148212z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f148213w;

    static {
        int i13 = 0;
        f148210x = new C35025c(i13, 0);
        f148211y = new C35025c(i13, 1);
        f148212z = new C35025c(i13, 2);
        f148208E = new C35025c(i13, 3);
        f148209F = new C35025c(i13, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C35025c(int i13, int i14) {
        super(i13);
        this.f148213w = i14;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f148213w) {
            case 0:
                long j7 = C17919x.f69637n;
                return new C35023a(j7, j7, j7, j7);
            case 1:
                return new C39174f(32);
            case 2:
                return new C39174f(8);
            case 3:
                return new C35024b(AbstractC17918w0.f69621a);
            default:
                return C35035m.f148302o0;
        }
    }
}
