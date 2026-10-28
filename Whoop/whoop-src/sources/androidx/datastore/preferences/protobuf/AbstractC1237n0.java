package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1237n0 {

    /* JADX INFO: renamed from: a */
    public static final C1234m0 f5445a;

    /* JADX INFO: renamed from: b */
    public static final C1234m0 f5446b;

    static {
        C1264w0 c1264w0 = C1264w0.f5502c;
        C1234m0 c1234m0 = null;
        try {
            c1234m0 = (C1234m0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f5445a = c1234m0;
        f5446b = new C1234m0();
    }
}
