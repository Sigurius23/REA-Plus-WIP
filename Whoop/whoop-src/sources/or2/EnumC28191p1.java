package or2;

import com.whoop.data.repositories.LanguageRepositoryKt;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: or2.p1 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m65681d2 = {"Lor2/p1;", "", "", "slug", "longSlug", "region", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getSlug", "()Ljava/lang/String;", "getLongSlug", "getRegion", "GERMAN", "ENGLISH", "FRENCH", "SPANISH", "ITALIAN", "PORTUGUESE", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC28191p1 {
    GERMAN("de", "de-eu", "eu"),
    ENGLISH(LanguageRepositoryKt.DEFAULT_LANGUAGE, LanguageRepositoryKt.ENGLISH_LANGUAGE_WITH_LOCALE, "us"),
    FRENCH("fr", "fr-eu", "eu"),
    SPANISH("es", "es-eu", "eu"),
    ITALIAN("it", "it-eu", "eu"),
    PORTUGUESE("pt", "pt-eu", "eu");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String longSlug;
    private final String region;
    private final String slug;

    EnumC28191p1(String str, String str2, String str3) {
        this.slug = str;
        this.longSlug = str2;
        this.region = str3;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getLongSlug() {
        return this.longSlug;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getSlug() {
        return this.slug;
    }
}
