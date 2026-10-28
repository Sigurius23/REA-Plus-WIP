package gh3;

/* JADX INFO: renamed from: gh3.f */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15861f {

    /* JADX INFO: renamed from: a */
    public static final int f59959a;

    /* JADX INFO: renamed from: b */
    public static final boolean f59960b;

    static {
        int iIntValue;
        try {
            iIntValue = ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue();
        } catch (Exception unused) {
            iIntValue = 0;
        }
        f59959a = iIntValue;
        f59960b = iIntValue != 0;
    }
}
