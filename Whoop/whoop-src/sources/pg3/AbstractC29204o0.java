package pg3;

import p073cq.ExecutorC11050s;

/* JADX INFO: renamed from: pg3.o0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC29204o0 {

    /* JADX INFO: renamed from: a */
    public static final ExecutorC11050s f118200a;

    /* JADX INFO: renamed from: b */
    public static final C29173b f118201b;

    /* JADX INFO: renamed from: c */
    public static final C29173b f118202c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f118200a = null;
            f118201b = new C29173b(4);
            f118202c = new C29173b(3);
        } else if (property.equals("Dalvik")) {
            f118200a = new ExecutorC11050s(1);
            f118201b = new C29206p0(4);
            f118202c = new C29179d(3);
        } else {
            f118200a = null;
            f118201b = new C29208q0();
            f118202c = new C29179d(3);
        }
    }
}
