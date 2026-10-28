package androidx.health.platform.client.proto;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.n0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1499n0 {

    /* JADX INFO: renamed from: a */
    public static final C1494m0 f6070a = new C1494m0();

    /* JADX INFO: renamed from: b */
    public static final C1494m0 f6071b;

    static {
        C1494m0 c1494m0 = null;
        try {
            c1494m0 = (C1494m0) Class.forName("androidx.health.platform.client.proto.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f6071b = c1494m0;
    }
}
