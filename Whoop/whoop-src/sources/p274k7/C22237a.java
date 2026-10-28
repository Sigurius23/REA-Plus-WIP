package p274k7;

import androidx.health.platform.client.permission.Permission;
import androidx.health.platform.client.proto.C1540v1;
import androidx.health.platform.client.proto.C1545w1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: k7.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C22237a extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C22237a f86656x;

    /* JADX INFO: renamed from: y */
    public static final C22237a f86657y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f86658w;

    static {
        int i13 = 1;
        f86656x = new C22237a(i13, 0);
        f86657y = new C22237a(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22237a(int i13, int i14) {
        super(i13);
        this.f86658w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f86658w) {
            case 0:
                String it = (String) obj;
                AbstractC22676k.m65750j(it, "it");
                C1540v1 c1540v1M4925r = C1545w1.m4925r();
                c1540v1M4925r.m4815c();
                C1545w1.m4924p((C1545w1) c1540v1M4925r.f6114x, it);
                return new Permission((C1545w1) c1540v1M4925r.m4813a());
            default:
                return ((Permission) obj).f6011x.m4927q();
        }
    }
}
