package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1251s {

    /* JADX INFO: renamed from: a */
    public static final C1248r f5471a = new C1248r();

    /* JADX INFO: renamed from: b */
    public static final C1248r f5472b;

    static {
        C1264w0 c1264w0 = C1264w0.f5502c;
        C1248r c1248r = null;
        try {
            c1248r = (C1248r) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f5472b = c1248r;
    }
}
