package j92;

import io.getstream.chat.android.client.api.QueryParams;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34810e0;
import wd3.AbstractC37171e;
import yb3.C39412p;

/* JADX INFO: renamed from: j92.t */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lj92/t;", "", "<init>", "()V", "Lud3/e0;", QueryParams.URL, "", "a", "(Lud3/e0;)Ljava/lang/String;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class C21452t {
    /* JADX INFO: renamed from: a */
    public String m60387a(C34810e0 url) {
        AbstractC22676k.m65750j(url, "url");
        String str = url.f146565d;
        C39412p c39412p = AbstractC37171e.f158957a;
        AbstractC22676k.m65750j(str, "<this>");
        if (AbstractC37171e.f158957a.m125851e(str)) {
            return null;
        }
        return PublicSuffixDatabase.f112935d.m84472a(str);
    }
}
