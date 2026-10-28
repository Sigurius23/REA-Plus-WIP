package p500tb;

/* JADX INFO: renamed from: tb.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC33689c extends AutoCloseable {
    /* JADX INFO: renamed from: B0 */
    default boolean mo5352B0() {
        return getLong(0) != 0;
    }

    /* JADX INFO: renamed from: J0 */
    String mo5353J0(int i13);

    /* JADX INFO: renamed from: L */
    void mo5354L(int i13, String str);

    /* JADX INFO: renamed from: e1 */
    boolean mo5355e1();

    byte[] getBlob(int i13);

    int getColumnCount();

    String getColumnName(int i13);

    double getDouble(int i13);

    long getLong(int i13);

    boolean isNull(int i13);

    /* JADX INFO: renamed from: p */
    void mo5356p(int i13, long j7);

    /* JADX INFO: renamed from: q */
    void mo5357q(int i13, byte[] bArr);

    void reset();

    /* JADX INFO: renamed from: t */
    void mo5358t(double d3, int i13);

    /* JADX INFO: renamed from: u */
    void mo5359u(int i13);

    /* JADX INFO: renamed from: w */
    void mo5360w();
}
