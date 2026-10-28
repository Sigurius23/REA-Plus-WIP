package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.u */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1421u {

    /* JADX INFO: renamed from: a */
    public static final C1419t f5980a = new C1419t();

    /* JADX INFO: renamed from: b */
    public static final C1419t f5981b;

    static {
        C1430y0 c1430y0 = C1430y0.f5993c;
        C1419t c1419t = null;
        try {
            c1419t = (C1419t) Class.forName("androidx.glance.appwidget.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f5981b = c1419t;
    }
}
