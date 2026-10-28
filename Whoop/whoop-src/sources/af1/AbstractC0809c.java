package af1;

import i11.C17863f;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeParseException;
import java.util.List;
import l83.C23465k;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: af1.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0007*\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"", "raw", "Ljava/time/LocalDate;", "a", "(Ljava/lang/String;)Ljava/time/LocalDate;", "Li11/f;", "fallbackAnchorDate", "Ll83/k;", "b", "(Li11/f;Ljava/lang/String;)Ll83/k;", "exercise-progress-mini-arch_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0809c {
    /* JADX INFO: renamed from: a */
    public static final LocalDate m1967a(String raw) {
        AbstractC22676k.m65750j(raw, "raw");
        String string = AbstractC39414r.m125869O0(raw).toString();
        if (string.length() == 0) {
            return null;
        }
        String strM125862H0 = AbstractC39414r.m125862H0(AbstractC39414r.m125862H0(string, 'T'), ' ');
        try {
            return strM125862H0.length() >= 10 ? LocalDate.parse(AbstractC39414r.m125866L0(10, strM125862H0)) : Instant.parse(string).atZone(ZoneOffset.UTC).toLocalDate();
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C23465k m1968b(C17863f c17863f, String str) {
        AbstractC22676k.m65750j(c17863f, "<this>");
        List listM74150t1 = AbstractC25265s.m74150t1(AbstractC25265s.m74159y0(AbstractC25265s.m74129g1(AbstractC25260n.m74077r0(new LocalDate[]{m1967a(c17863f.getBackDate()), m1967a(c17863f.getForwardDate())}), AbstractC37056f.m118960L(str != null ? m1967a(str) : null))));
        if (listM74150t1.size() >= 2) {
            String string = ((LocalDate) AbstractC25265s.m74096F0(listM74150t1)).toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            return new C23465k(string, ((LocalDate) AbstractC25265s.m74112P0(listM74150t1)).toString());
        }
        if (listM74150t1.size() != 1) {
            return new C23465k("", "");
        }
        String string2 = ((LocalDate) AbstractC25265s.m74096F0(listM74150t1)).toString();
        AbstractC22676k.m65749i(string2, "toString(...)");
        return new C23465k(string2, string2);
    }
}
