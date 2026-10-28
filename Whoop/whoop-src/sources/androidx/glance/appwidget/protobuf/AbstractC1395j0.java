package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.j0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1395j0 {

    /* JADX INFO: renamed from: a */
    public static final C1392i0 f5915a;

    /* JADX INFO: renamed from: b */
    public static final C1392i0 f5916b;

    static {
        C1430y0 c1430y0 = C1430y0.f5993c;
        C1392i0 c1392i0 = null;
        try {
            c1392i0 = (C1392i0) Class.forName("androidx.glance.appwidget.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f5915a = c1392i0;
        f5916b = new C1392i0();
    }
}
