package pg3;

import java.lang.reflect.Method;
import java.util.Objects;
import ne3.C26616h;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: pg3.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C29196k0 extends AbstractC29184e1 {

    /* JADX INFO: renamed from: c */
    public final Method f118189c;

    /* JADX INFO: renamed from: d */
    public final int f118190d;

    /* JADX INFO: renamed from: e */
    public final String f118191e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC29201n f118192f;

    /* JADX INFO: renamed from: g */
    public final boolean f118193g;

    public C29196k0(Method method, int i13, String str, InterfaceC29201n interfaceC29201n, boolean z4) {
        this.f118189c = method;
        this.f118190d = i13;
        Objects.requireNonNull(str, "name == null");
        this.f118191e = str;
        this.f118192f = interfaceC29201n;
        this.f118193g = z4;
    }

    @Override // pg3.AbstractC29184e1
    /* JADX INFO: renamed from: a */
    public final void mo88679a(C29212s0 c29212s0, Object obj) {
        String strM79194S0;
        String str = this.f118191e;
        if (obj == null) {
            throw AbstractC29184e1.m88692n(this.f118189c, this.f118190d, AbstractC11895b.m31996o("Path parameter \"", str, "\" value must not be null."), new Object[0]);
        }
        String str2 = (String) this.f118192f.convert(obj);
        if (c29212s0.f118216c == null) {
            throw new AssertionError();
        }
        int length = str2.length();
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                strM79194S0 = str2;
                break;
            }
            int iCodePointAt = str2.codePointAt(iCharCount);
            boolean z4 = this.f118193g;
            int i13 = 47;
            int i14 = -1;
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z4 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                C26616h c26616h = new C26616h();
                c26616h.m79231t1(0, iCharCount, str2);
                C26616h c26616h2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str2.codePointAt(iCharCount);
                    if (!z4 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 < 32 || iCodePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i14 || (!z4 && (iCodePointAt2 == i13 || iCodePointAt2 == 37))) {
                            if (c26616h2 == null) {
                                c26616h2 = new C26616h();
                            }
                            c26616h2.m79234v1(iCodePointAt2);
                            while (!c26616h2.mo79222o()) {
                                byte b = c26616h2.readByte();
                                c26616h.m79219m1(37);
                                char[] cArr = C29212s0.f118212l;
                                c26616h.m79219m1(cArr[((b & 255) >> 4) & 15]);
                                c26616h.m79219m1(cArr[b & 15]);
                            }
                        } else {
                            c26616h.m79234v1(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i13 = 47;
                    i14 = -1;
                }
                strM79194S0 = c26616h.m79194S0();
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strReplace = c29212s0.f118216c.replace("{" + str + "}", strM79194S0);
        if (C29212s0.f118213m.matcher(strReplace).matches()) {
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(str2));
        }
        c29212s0.f118216c = strReplace;
    }
}
