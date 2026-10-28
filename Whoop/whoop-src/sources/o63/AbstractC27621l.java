package o63;

/* JADX INFO: renamed from: o63.l */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC27621l {

    /* JADX INFO: renamed from: a */
    public static final boolean f111159a;

    static {
        String property = System.getProperty("io.ktor.development");
        boolean z4 = false;
        if (property != null && Boolean.parseBoolean(property)) {
            z4 = true;
        }
        f111159a = z4;
    }
}
