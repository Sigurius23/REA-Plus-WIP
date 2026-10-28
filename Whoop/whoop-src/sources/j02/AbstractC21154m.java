package j02;

import java.util.Locale;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: j02.m */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"", "deeplinkPath", "b", "(Ljava/lang/String;)Ljava/lang/String;", "a", "navigation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21154m {
    /* JADX INFO: renamed from: a */
    public static final String m59008a(String deeplinkPath) {
        AbstractC22676k.m65750j(deeplinkPath, "deeplinkPath");
        String strM125870P0 = AbstractC39414r.m125870P0(deeplinkPath, '/');
        Locale locale = Locale.US;
        return AbstractC39421y.m125927L(AbstractC39421y.m125927L(AbstractC31061c.m95641q(locale, "US", strM125870P0, locale, "toLowerCase(...)"), '_', '-'), '/', '-');
    }

    /* JADX INFO: renamed from: b */
    public static final String m59009b(String deeplinkPath) {
        AbstractC22676k.m65750j(deeplinkPath, "deeplinkPath");
        return AbstractC11266d.m30461o("deeplink-migration-", m59008a(deeplinkPath));
    }
}
