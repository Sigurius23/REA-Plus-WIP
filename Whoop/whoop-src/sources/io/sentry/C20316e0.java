package io.sentry;

import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: io.sentry.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20316e0 {

    /* JADX INFO: renamed from: a */
    public final String f76296a;

    /* JADX INFO: renamed from: b */
    public final Pattern f76297b;

    public C20316e0(String str) {
        Pattern patternCompile;
        this.f76296a = str;
        try {
            patternCompile = Pattern.compile(str);
        } catch (Throwable unused) {
            AbstractC20445o4.m56638b().mo56432l().getLogger().mo16066m(EnumC20436n5.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            patternCompile = null;
        }
        this.f76297b = patternCompile;
    }

    /* JADX INFO: renamed from: a */
    public final String m56471a() {
        return this.f76296a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m56472b(String str) {
        Pattern pattern = this.f76297b;
        if (pattern == null) {
            return false;
        }
        return pattern.matcher(str).matches();
    }

    public final boolean equals(Object obj) {
        if (obj == null || C20316e0.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f76296a, ((C20316e0) obj).f76296a);
    }

    public final int hashCode() {
        return Objects.hash(this.f76296a);
    }
}
