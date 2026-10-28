package e43;

import c93.InterfaceC4339a;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: e43.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C12709a extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: x */
    public static final C12709a f43492x;

    /* JADX INFO: renamed from: y */
    public static final C12709a f43493y;

    /* JADX INFO: renamed from: z */
    public static final C12709a f43494z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f43495w;

    static {
        int i13 = 0;
        f43492x = new C12709a(i13, 0);
        f43493y = new C12709a(i13, 1);
        f43494z = new C12709a(i13, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12709a(int i13, int i14) {
        super(i13);
        this.f43495w = i14;
    }

    @Override // c93.InterfaceC4339a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f43495w) {
            case 0:
                return 201326592;
            case 1:
                return Boolean.TRUE;
            default:
                return Boolean.TRUE;
        }
    }
}
