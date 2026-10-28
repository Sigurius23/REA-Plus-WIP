package bm;

import java.util.List;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: bm.p */
/* JADX INFO: loaded from: classes.dex */
public final class C3392p extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C3392p f13238w = new C3392p(1);

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List it = (List) obj;
        AbstractC22676k.m65750j(it, "it");
        Object obj2 = it.get(0);
        AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.Int");
        return new C3396t(((Integer) obj2).intValue());
    }
}
