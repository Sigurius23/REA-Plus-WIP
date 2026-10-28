package p343nk;

import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONObject;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: nk.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C26787h extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C26787h f106690w = new C26787h(1);

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JSONObject it = (JSONObject) obj;
        AbstractC22676k.m65750j(it, "it");
        String string = it.toString();
        AbstractC22676k.m65749i(string, "it.toString()");
        return AbstractC39421y.m125926K(string, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "", false);
    }
}
