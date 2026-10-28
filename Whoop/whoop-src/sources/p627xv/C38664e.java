package p627xv;

import android.content.Context;
import l83.C23454a0;
import p661yv.C39796a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: xv.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C38664e extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C38664e f166409x;

    /* JADX INFO: renamed from: y */
    public static final C38664e f166410y;

    /* JADX INFO: renamed from: z */
    public static final C38664e f166411z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f166412w;

    static {
        int i13 = 1;
        f166409x = new C38664e(i13, 0);
        f166410y = new C38664e(i13, 1);
        f166411z = new C38664e(i13, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38664e(int i13, int i14) {
        super(i13);
        this.f166412w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f166412w) {
            case 0:
                C39796a ScaleBarSettings = (C39796a) obj;
                AbstractC22676k.m65750j(ScaleBarSettings, "$this$ScaleBarSettings");
                return C23454a0.f92919a;
            case 1:
                Context it = (Context) obj;
                AbstractC22676k.m65750j(it, "it");
                return new C38665f(it);
            default:
                C39796a ScaleBarSettings2 = (C39796a) obj;
                AbstractC22676k.m65750j(ScaleBarSettings2, "$this$ScaleBarSettings");
                return C23454a0.f92919a;
        }
    }
}
