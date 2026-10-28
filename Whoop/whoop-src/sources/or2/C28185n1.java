package or2;

import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.DurationKt;

/* JADX INFO: renamed from: or2.n1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Lor2/n1;", "", "<init>", "()V", "Ljava/io/File;", "path", "", "b", "(Ljava/io/File;)J", "a", "()J", "freeInternalStorage", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28185n1 {

    /* JADX INFO: renamed from: a */
    public static final C28185n1 f113906a = new C28185n1();

    private C28185n1() {
    }

    /* JADX INFO: renamed from: b */
    private final long m85307b(File path) {
        StatFs statFs = new StatFs(path.getAbsolutePath());
        return (statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / ((long) DurationKt.NANOS_IN_MILLIS);
    }

    /* JADX INFO: renamed from: a */
    public final long m85308a() {
        File dataDirectory = Environment.getDataDirectory();
        AbstractC22676k.m65749i(dataDirectory, "getDataDirectory(...)");
        return m85307b(dataDirectory);
    }
}
