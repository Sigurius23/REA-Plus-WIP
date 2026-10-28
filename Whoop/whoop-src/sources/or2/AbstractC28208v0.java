package or2;

import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import ih0.AbstractC18489d0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35849g;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yb3.C39410n;

/* JADX INFO: renamed from: or2.v0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"", "Lor2/p1;", "toLanguage", "a", "(Ljava/lang/String;Lor2/p1;)Ljava/lang/String;", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "b", "(Ljava/lang/String;Lcom/whoop/data/repositories/FeatureFlagRepository;)Lor2/p1;", "feature_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28208v0 {
    /* JADX INFO: renamed from: a */
    public static final String m85385a(String str, EnumC28191p1 toLanguage) {
        EnumC28191p1 enumC28191p1;
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(toLanguage, "toLanguage");
        StringBuilder sb4 = new StringBuilder(str);
        if (AbstractC39414r.m125876U(str, "shop.whoop.com", true)) {
            if (toLanguage == EnumC28191p1.ENGLISH) {
                return str;
            }
            String string = sb4.insert(AbstractC39414r.m125888g0(str, ".whoop.com", 0, true, 2), "." + toLanguage.getSlug()).toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            return string;
        }
        if (AbstractC39414r.m125876U(str, "shop.qa.whoop.com", true)) {
            if (toLanguage == EnumC28191p1.ENGLISH) {
                return str;
            }
            String string2 = sb4.insert(AbstractC39414r.m125888g0(str, ".qa.", 0, true, 2), "-" + toLanguage.getSlug()).toString();
            AbstractC22676k.m65749i(string2, "toString(...)");
            return string2;
        }
        if (AbstractC39414r.m125876U(str, "login-token.html", true)) {
            if (toLanguage == EnumC28191p1.ENGLISH) {
                return str;
            }
            String string3 = sb4.insert(AbstractC39414r.m125888g0(str, "login-token.html", 0, true, 2), toLanguage.getLongSlug() + "/").toString();
            AbstractC22676k.m65749i(string3, "toString(...)");
            return string3;
        }
        if (AbstractC39414r.m125876U(str, "//whoop.com", true) || AbstractC39414r.m125876U(str, "www.whoop.com", true)) {
            if (toLanguage == EnumC28191p1.ENGLISH) {
                return str;
            }
            String string4 = sb4.insert(AbstractC39414r.m125888g0(str, "whoop.com", 0, true, 2) + 9, "/" + toLanguage.getSlug()).toString();
            AbstractC22676k.m65749i(string4, "toString(...)");
            return string4;
        }
        if (AbstractC39414r.m125876U(str, "orderstatus", true)) {
            return toLanguage != EnumC28191p1.ENGLISH ? AbstractC18489d0.m53370k(str, toLanguage.getLongSlug(), "/") : str;
        }
        Pattern patternCompile = Pattern.compile("app\\.(?:qa\\.whoop|whoop)");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        if (patternCompile.matcher(str).find()) {
            return toLanguage != EnumC28191p1.ENGLISH ? AbstractC18489d0.m53370k(str, toLanguage.getLongSlug(), "/") : str;
        }
        Pattern patternCompile2 = Pattern.compile("https://support\\.whoop\\.com/hc/(?:en|en-us)/(?:articles|sections)/[0-9]+");
        AbstractC22676k.m65749i(patternCompile2, "compile(...)");
        if (patternCompile2.matcher(str).find()) {
            Pattern patternCompile3 = Pattern.compile("https://support\\.whoop\\.com/hc/(?:en|en-us)/(?:articles|sections)/[0-9]+");
            AbstractC22676k.m65749i(patternCompile3, "compile(...)");
            Matcher matcher = patternCompile3.matcher(str);
            AbstractC22676k.m65749i(matcher, "matcher(...)");
            C39410n c39410nM113800b = AbstractC35849g.m113800b(matcher, 0, str);
            if (c39410nM113800b == null) {
                return str;
            }
            String strM125845c = c39410nM113800b.m125845c();
            Pattern patternCompile4 = Pattern.compile("en-us|en");
            AbstractC22676k.m65749i(patternCompile4, "compile(...)");
            String replacement = toLanguage.getSlug();
            AbstractC22676k.m65750j(replacement, "replacement");
            String strReplaceAll = patternCompile4.matcher(strM125845c).replaceAll(replacement);
            AbstractC22676k.m65749i(strReplaceAll, "replaceAll(...)");
            return strReplaceAll;
        }
        Pattern patternCompile5 = Pattern.compile("https://support\\.whoop\\.com/hc/(?:en|en-us)/");
        AbstractC22676k.m65749i(patternCompile5, "compile(...)");
        if (!patternCompile5.matcher(str).find()) {
            return (!AbstractC39414r.m125876U(str, "family", true) || toLanguage == (enumC28191p1 = EnumC28191p1.ENGLISH)) ? str : AbstractC39421y.m125926K(str, enumC28191p1.getLongSlug(), toLanguage.getLongSlug(), false);
        }
        if (toLanguage == EnumC28191p1.ENGLISH) {
            return str;
        }
        Pattern patternCompile6 = Pattern.compile("/(?:en|en-us)/");
        AbstractC22676k.m65749i(patternCompile6, "compile(...)");
        String replacement2 = "/" + toLanguage.getSlug() + "/";
        AbstractC22676k.m65750j(replacement2, "replacement");
        String strReplaceAll2 = patternCompile6.matcher(str).replaceAll(replacement2);
        AbstractC22676k.m65749i(strReplaceAll2, "replaceAll(...)");
        return strReplaceAll2;
    }

    /* JADX INFO: renamed from: b */
    public static final EnumC28191p1 m85386b(String str, FeatureFlagRepository featureFlagRepository) {
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        if (featureFlagRepository.isFeatureEnabled(FeatureFlagRepositoryKt.STOP_LINK_LOCALIZATION)) {
            return EnumC28191p1.ENGLISH;
        }
        EnumC28191p1 enumC28191p1 = EnumC28191p1.GERMAN;
        if (str.equals(enumC28191p1.getSlug())) {
            return enumC28191p1;
        }
        EnumC28191p1 enumC28191p2 = EnumC28191p1.FRENCH;
        if (str.equals(enumC28191p2.getSlug())) {
            return enumC28191p2;
        }
        EnumC28191p1 enumC28191p3 = EnumC28191p1.SPANISH;
        if (str.equals(enumC28191p3.getSlug())) {
            return enumC28191p3;
        }
        EnumC28191p1 enumC28191p4 = EnumC28191p1.ITALIAN;
        if (str.equals(enumC28191p4.getSlug())) {
            return enumC28191p4;
        }
        EnumC28191p1 enumC28191p5 = EnumC28191p1.PORTUGUESE;
        return str.equals(enumC28191p5.getSlug()) ? enumC28191p5 : EnumC28191p1.ENGLISH;
    }
}
