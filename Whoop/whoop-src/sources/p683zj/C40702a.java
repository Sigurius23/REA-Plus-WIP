package p683zj;

import java.util.Locale;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: zj.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C40702a extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C40702a f175607w = new C40702a(1);

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        AbstractC22676k.m65750j(it, "it");
        if (it.length() <= 0) {
            return it;
        }
        StringBuilder sb4 = new StringBuilder();
        String strValueOf = String.valueOf(it.charAt(0));
        AbstractC22676k.m65748h(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        sb4.append((Object) upperCase);
        String strSubstring = it.substring(1);
        AbstractC22676k.m65749i(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb4.append(strSubstring);
        return sb4.toString();
    }
}
