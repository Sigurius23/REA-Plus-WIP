package bt0;

import androidx.core.app.NotificationCompat;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: bt0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\n"}, m65681d2 = {"Lbt0/c;", "", "", NotificationCompat.CATEGORY_PROGRESS, "a", "(I)I", "", "d", "(I)Ljava/lang/String;", "c", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3619c {
    /* JADX INFO: renamed from: a */
    public static int m10981a(int i13) {
        return i13;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m10982b(int i13, int i14) {
        return i13 == i14;
    }

    /* JADX INFO: renamed from: c */
    public static int m10983c(int i13) {
        return Integer.hashCode(i13);
    }

    /* JADX INFO: renamed from: d */
    public static String m10984d(int i13) {
        return AbstractC2875y.m8296i(i13, "Progress(progress=", ")");
    }
}
