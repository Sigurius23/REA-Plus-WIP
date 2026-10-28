package j92;

import com.iterable.iterableapi.C5378v;
import io.getstream.chat.android.client.api.QueryParams;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34810e0;

/* JADX INFO: renamed from: j92.u */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lj92/t;", "", QueryParams.URL, "", "a", "(Lj92/t;Ljava/lang/String;)Z", "Lud3/e0;", "b", "(Lj92/t;Lud3/e0;)Z", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21453u {
    /* JADX INFO: renamed from: a */
    public static final boolean m60388a(C21452t c21452t, String url) {
        AbstractC22676k.m65750j(c21452t, "<this>");
        AbstractC22676k.m65750j(url, "url");
        C34810e0 c34810e0M16526b = null;
        try {
            C5378v c5378v = new C5378v(1);
            c5378v.m16528d(null, url);
            c34810e0M16526b = c5378v.m16526b();
        } catch (IllegalArgumentException unused) {
        }
        if (c34810e0M16526b != null) {
            return AbstractC22676k.m65745e(c21452t.m60387a(c34810e0M16526b), "whoop.com");
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m60389b(C21452t c21452t, C34810e0 url) {
        AbstractC22676k.m65750j(c21452t, "<this>");
        AbstractC22676k.m65750j(url, "url");
        return AbstractC22676k.m65745e(c21452t.m60387a(url), "whoop.com");
    }
}
