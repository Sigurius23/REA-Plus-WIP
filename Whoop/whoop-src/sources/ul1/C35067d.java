package ul1;

import com.whoop.data.repositories.LanguageChecker;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import fl1.AbstractC14569b;
import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ul1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n¨\u0006\r"}, m65681d2 = {"Lul1/d;", "", "Lcom/whoop/data/repositories/LanguageChecker;", "languageRepository", "<init>", "(Lcom/whoop/data/repositories/LanguageChecker;)V", "a", "Lcom/whoop/data/repositories/LanguageChecker;", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "shortDisplayLanguage", "fullDisplayLanguage", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35067d {

    /* JADX INFO: renamed from: c */
    public static final int f148668c = 8;

    /* JADX INFO: renamed from: d */
    private static final String f148669d = Locale.FRENCH.getLanguage();

    /* JADX INFO: renamed from: e */
    private static final String f148670e = Locale.GERMAN.getLanguage();

    /* JADX INFO: renamed from: f */
    private static final String f148671f = Locale.ITALIAN.getLanguage();

    /* JADX INFO: renamed from: g */
    private static final String f148672g = new Locale("pt").getLanguage();

    /* JADX INFO: renamed from: h */
    private static final String f148673h = new Locale("es").getLanguage();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LanguageChecker languageRepository;

    public C35067d(LanguageChecker languageRepository) {
        AbstractC22676k.m65750j(languageRepository, "languageRepository");
        this.languageRepository = languageRepository;
    }

    /* JADX INFO: renamed from: a */
    public final TextResource m110895a() {
        String language = this.languageRepository.getAllowedLanguage().getLanguage();
        if (AbstractC22676k.m65745e(language, f148673h)) {
            return AbstractC8693b.m21277k(AbstractC14569b.f53584r);
        }
        return AbstractC22676k.m65745e(language, f148672g) ? AbstractC8693b.m21277k(AbstractC14569b.f53588v) : m110896b();
    }

    /* JADX INFO: renamed from: b */
    public final TextResource m110896b() {
        String language = this.languageRepository.getAllowedLanguage().getLanguage();
        if (AbstractC22676k.m65745e(language, f148669d)) {
            return AbstractC8693b.m21277k(AbstractC14569b.f53577k);
        }
        if (AbstractC22676k.m65745e(language, f148670e)) {
            return AbstractC8693b.m21277k(AbstractC14569b.f53578l);
        }
        if (AbstractC22676k.m65745e(language, f148671f)) {
            return AbstractC8693b.m21277k(AbstractC14569b.f53580n);
        }
        if (AbstractC22676k.m65745e(language, f148672g)) {
            return AbstractC8693b.m21277k(AbstractC14569b.f53589w);
        }
        return AbstractC22676k.m65745e(language, f148673h) ? AbstractC8693b.m21277k(AbstractC14569b.f53563E) : AbstractC8693b.m21277k(AbstractC14569b.f53573g);
    }
}
