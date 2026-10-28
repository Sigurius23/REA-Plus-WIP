package or2;

import com.whoop.data.repositories.LanguageRepositoryKt;
import java.util.List;
import java.util.Locale;
import n83.C26460c;
import p029b5.C2728g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: or2.t0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lb5/g;", "", "Ljava/util/Locale;", "a", "(Lb5/g;)Ljava/util/List;", "", "b", "(Ljava/util/Locale;)Ljava/lang/String;", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28202t0 {
    /* JADX INFO: renamed from: a */
    public static final List<Locale> m85350a(C2728g c2728g) {
        AbstractC22676k.m65750j(c2728g, "<this>");
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        int iM7702d = c2728g.m7702d();
        for (int i13 = 0; i13 < iM7702d; i13++) {
            Locale localeM7700b = c2728g.m7700b(i13);
            if (localeM7700b == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            c26460cM119000x.add(localeM7700b);
        }
        return AbstractC37056f.m118988k(c26460cM119000x);
    }

    /* JADX INFO: renamed from: b */
    public static final String m85351b(Locale locale) {
        AbstractC22676k.m65750j(locale, "<this>");
        String language = locale.getLanguage();
        if (language != null) {
            int iHashCode = language.hashCode();
            if (iHashCode != 3241) {
                if (iHashCode != 3246) {
                    if (iHashCode == 3588 && language.equals("pt")) {
                        return "pt_PT";
                    }
                } else if (language.equals("es")) {
                    return "es_MX";
                }
            } else if (language.equals(LanguageRepositoryKt.DEFAULT_LANGUAGE)) {
                return "en_US";
            }
        }
        String language2 = locale.getLanguage();
        AbstractC22676k.m65749i(language2, "getLanguage(...)");
        return language2;
    }
}
