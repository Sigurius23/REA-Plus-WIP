package p441qx;

import java.io.IOException;
import ne3.AbstractC26604b;
import ne3.C26607c0;
import ne3.C26616h;
import ne3.C26624l;

/* JADX INFO: renamed from: qx.v */
/* JADX INFO: loaded from: classes.dex */
public final class C30740v {

    /* JADX INFO: renamed from: a */
    public final String[] f126540a;

    /* JADX INFO: renamed from: b */
    public final C26607c0 f126541b;

    public C30740v(String[] strArr, C26607c0 c26607c0) {
        this.f126540a = strArr;
        this.f126541b = c26607c0;
    }

    /* JADX INFO: renamed from: a */
    public static C30740v m94403a(String... strArr) {
        try {
            C26624l[] c26624lArr = new C26624l[strArr.length];
            C26616h c26616h = new C26616h();
            for (int i13 = 0; i13 < strArr.length; i13++) {
                C30743y.m94414j1(c26616h, strArr[i13]);
                c26616h.readByte();
                c26624lArr[i13] = c26616h.mo79218m0(c26616h.f105866x);
            }
            return new C30740v((String[]) strArr.clone(), AbstractC26604b.m79161f(c26624lArr));
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }
}
