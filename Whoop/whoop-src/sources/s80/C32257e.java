package s80;

import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: s80.e */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Ls80/e;", "", "<init>", "()V", "", "millis", "Lorg/joda/time/LocalDate;", "a", "(J)Lorg/joda/time/LocalDate;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32257e {

    /* JADX INFO: renamed from: a */
    public static final C32257e f133518a = new C32257e();

    private C32257e() {
    }

    /* JADX INFO: renamed from: a */
    public final LocalDate m100390a(long millis) {
        return new LocalDate(millis, DateTimeZone.UTC);
    }
}
