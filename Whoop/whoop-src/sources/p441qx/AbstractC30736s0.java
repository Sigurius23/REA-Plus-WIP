package p441qx;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: qx.s0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC30736s0 {

    /* JADX INFO: renamed from: a */
    public static final C30709f f126530a = new C30709f(5);

    /* JADX INFO: renamed from: b */
    public static final C30730p0 f126531b = new C30730p0(1);

    /* JADX INFO: renamed from: c */
    public static final C30730p0 f126532c = new C30730p0(2);

    /* JADX INFO: renamed from: d */
    public static final C30730p0 f126533d = new C30730p0(3);

    /* JADX INFO: renamed from: e */
    public static final C30730p0 f126534e = new C30730p0(4);

    /* JADX INFO: renamed from: f */
    public static final C30730p0 f126535f = new C30730p0(5);

    /* JADX INFO: renamed from: g */
    public static final C30730p0 f126536g = new C30730p0(6);

    /* JADX INFO: renamed from: h */
    public static final C30730p0 f126537h = new C30730p0(7);

    /* JADX INFO: renamed from: i */
    public static final C30730p0 f126538i = new C30730p0(8);

    /* JADX INFO: renamed from: j */
    public static final C30730p0 f126539j = new C30730p0(0);

    /* JADX INFO: renamed from: a */
    public static int m94402a(JsonReader jsonReader, String str, int i13, int i14) {
        int iNextInt = jsonReader.nextInt();
        if (iNextInt >= i13 && iNextInt <= i14) {
            return iNextInt;
        }
        String strM16727b = jsonReader.m16727b();
        StringBuilder sbM30467u = AbstractC11266d.m30467u(iNextInt, "Expected ", str, " but was ", " at path ");
        sbM30467u.append(strM16727b);
        throw new JsonDataException(sbM30467u.toString());
    }
}
