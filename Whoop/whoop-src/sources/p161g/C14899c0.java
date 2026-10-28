package p161g;

import android.content.res.Resources;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: g.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14899c0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C14899c0 f55570x;

    /* JADX INFO: renamed from: y */
    public static final C14899c0 f55571y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55572w;

    static {
        int i13 = 1;
        f55570x = new C14899c0(i13, 0);
        f55571y = new C14899c0(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14899c0(int i13, int i14) {
        super(i13);
        this.f55572w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f55572w) {
            case 0:
                Resources resources = (Resources) obj;
                AbstractC22676k.m65750j(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            default:
                AbstractC22676k.m65750j((Resources) obj, "<anonymous parameter 0>");
                return Boolean.TRUE;
        }
    }
}
