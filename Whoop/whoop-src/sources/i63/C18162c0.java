package i63;

import l83.C23465k;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: i63.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18162c0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C18162c0 f70475w = new C18162c0(1);

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C23465k it = (C23465k) obj;
        AbstractC22676k.m65750j(it, "it");
        String str = (String) it.f92937w;
        Object obj2 = it.f92938x;
        return obj2 == null ? str : AbstractC11895b.m31992k('=', str, String.valueOf(obj2));
    }
}
