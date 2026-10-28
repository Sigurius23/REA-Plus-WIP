package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1255t0 {

    /* JADX INFO: renamed from: a */
    public static final C1252s0 f5476a;

    /* JADX INFO: renamed from: b */
    public static final C1252s0 f5477b;

    static {
        C1264w0 c1264w0 = C1264w0.f5502c;
        C1252s0 c1252s0 = null;
        try {
            c1252s0 = (C1252s0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f5476a = c1252s0;
        f5477b = new C1252s0();
    }
}
