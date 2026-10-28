package p048ce;

import java.util.Locale;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ce.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C4468i implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C4468i f17991w = new C4468i();

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Enum it = (Enum) obj;
        AbstractC22676k.m65750j(it, "it");
        String lowerCase = it.name().toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
