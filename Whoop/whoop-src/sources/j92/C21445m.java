package j92;

import com.whoop.data.local.prefs.PreferenceHelper;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j92.m */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lj92/m;", "", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "<init>", "(Lcom/whoop/data/local/prefs/PreferenceHelper;)V", "", "a", "()Z", "", "delaySeconds", "Ll83/a0;", "b", "(I)V", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21445m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final PreferenceHelper preferenceHelper;

    public C21445m(PreferenceHelper preferenceHelper) {
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        this.preferenceHelper = preferenceHelper;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m60358a() {
        boolean z4;
        synchronized (this) {
            z4 = PreferenceHelper.getLongValueFromMainPrefs$default(this.preferenceHelper, "APIRateLimitUntilMillis", 0L, 2, null) > DateTime.now(DateTimeZone.UTC).getMillis();
        }
        return z4;
    }

    /* JADX INFO: renamed from: b */
    public final void m60359b(int delaySeconds) {
        synchronized (this) {
            this.preferenceHelper.putLongValueIntoMainPrefs("APIRateLimitUntilMillis", DateTime.now(DateTimeZone.UTC).plusSeconds(delaySeconds).getMillis());
        }
    }
}
