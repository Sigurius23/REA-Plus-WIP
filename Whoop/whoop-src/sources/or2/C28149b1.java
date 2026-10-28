package or2;

import java.util.Locale;
import org.joda.time.DateTime;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: or2.b1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lor2/b1;", "", "Lor2/u0;", "localizedDateTimeFormatter", "<init>", "(Lor2/u0;)V", "Lorg/joda/time/DateTime;", "syncTime", "", "a", "(Lorg/joda/time/DateTime;)Ljava/lang/String;", "Lor2/u0;", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28149b1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28205u0 localizedDateTimeFormatter;

    public C28149b1(C28205u0 localizedDateTimeFormatter) {
        AbstractC22676k.m65750j(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        this.localizedDateTimeFormatter = localizedDateTimeFormatter;
    }

    /* JADX INFO: renamed from: a */
    public final String m85177a(DateTime syncTime) {
        AbstractC22676k.m65750j(syncTime, "syncTime");
        String lowerCase = C28205u0.m85378i(this.localizedDateTimeFormatter, syncTime, false, 2, null).toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        C28204u.Companion companion = C28204u.INSTANCE;
        return !companion.m85370m(syncTime.getMillis()) ? AbstractC2875y.m8299l(companion.m85366i().print(syncTime), lowerCase) : lowerCase;
    }
}
