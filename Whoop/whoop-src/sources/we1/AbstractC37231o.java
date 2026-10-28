package we1;

import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: we1.o */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"", "Lwe1/n;", "a", "(Ljava/lang/String;)Lwe1/n;", "entitlements_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37231o {
    /* JADX INFO: renamed from: a */
    public static final AbstractC37230n m119323a(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        if (str.equals("NO_DEVICE")) {
            return AbstractC37230n.a.f159218a;
        }
        Locale locale = Locale.ROOT;
        return new AbstractC37230n.b(AbstractC31061c.m95641q(locale, "ROOT", str, locale, "toLowerCase(...)"));
    }
}
