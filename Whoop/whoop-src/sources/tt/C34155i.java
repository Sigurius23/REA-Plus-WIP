package tt;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p249jc.C21567b;
import p533ut.C35227a;

/* JADX INFO: renamed from: tt.i */
/* JADX INFO: loaded from: classes.dex */
public final class C34155i {

    /* JADX INFO: renamed from: b */
    public static final long f143155b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c */
    public static final Pattern f143156c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d */
    public static C34155i f143157d;

    /* JADX INFO: renamed from: a */
    public final C21567b f143158a;

    public C34155i(C21567b c21567b) {
        this.f143158a = c21567b;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m107932a(C35227a c35227a) {
        if (TextUtils.isEmpty(c35227a.f149825c)) {
            return true;
        }
        long j7 = c35227a.f149828f + c35227a.f149827e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f143158a.getClass();
        return j7 < timeUnit.toSeconds(System.currentTimeMillis()) + f143155b;
    }
}
