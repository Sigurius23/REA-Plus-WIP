package p256jn;

import ed3.C13117a;
import in.C18715c;
import in.C18717e;
import io.sentry.config.AbstractC20301a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import kn.C22597a;
import p309lo.C24561s;
import p658yr.AbstractC39717d;

/* JADX INFO: renamed from: jn.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C21797b extends AbstractC20301a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f83952b;

    /* JADX INFO: renamed from: f0 */
    public static C22597a m61677f0(C13117a c13117a) {
        String strM36708r = c13117a.m36708r();
        strM36708r.getClass();
        String strM36708r2 = c13117a.m36708r();
        strM36708r2.getClass();
        return new C22597a(strM36708r, strM36708r2, c13117a.m36706p(), c13117a.m36706p(), Arrays.copyOfRange(c13117a.f45381a, c13117a.f45382b, c13117a.f45383c));
    }

    @Override // io.sentry.config.AbstractC20301a
    /* JADX INFO: renamed from: t */
    public final C18715c mo56358t(C18717e c18717e, ByteBuffer byteBuffer) {
        switch (this.f83952b) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                C24561s c24561s = new C24561s(byteBuffer.array(), byteBuffer.limit(), 0, (byte) 0);
                int i13 = 12;
                c24561s.m71643t(12);
                int iM71629f = (c24561s.m71629f() + c24561s.m71632i(12)) - 4;
                c24561s.m71643t(44);
                c24561s.m71644u(c24561s.m71632i(12));
                c24561s.m71643t(16);
                ArrayList arrayList = new ArrayList();
                while (c24561s.m71629f() < iM71629f) {
                    c24561s.m71643t(48);
                    int iM71632i = c24561s.m71632i(8);
                    c24561s.m71643t(4);
                    int iM71629f2 = c24561s.m71629f() + c24561s.m71632i(i13);
                    String str = null;
                    String str2 = null;
                    while (c24561s.m71629f() < iM71629f2) {
                        int iM71632i2 = c24561s.m71632i(8);
                        int iM71632i3 = c24561s.m71632i(8);
                        int iM71629f3 = c24561s.m71629f() + iM71632i3;
                        if (iM71632i2 == 2) {
                            int iM71632i4 = c24561s.m71632i(16);
                            c24561s.m71643t(8);
                            if (iM71632i4 == 3) {
                                while (c24561s.m71629f() < iM71629f3) {
                                    int iM71632i5 = c24561s.m71632i(8);
                                    Charset charset = AbstractC39717d.f170956a;
                                    byte[] bArr = new byte[iM71632i5];
                                    c24561s.m71635l(iM71632i5, bArr);
                                    String str3 = new String(bArr, charset);
                                    int iM71632i6 = c24561s.m71632i(8);
                                    for (int i14 = 0; i14 < iM71632i6; i14++) {
                                        c24561s.m71644u(c24561s.m71632i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (iM71632i2 == 21) {
                            Charset charset2 = AbstractC39717d.f170956a;
                            byte[] bArr2 = new byte[iM71632i3];
                            c24561s.m71635l(iM71632i3, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        c24561s.m71640q(iM71629f3 * 8);
                    }
                    c24561s.m71640q(iM71629f2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new C21796a(iM71632i, str2.length() != 0 ? str.concat(str2) : new String(str)));
                    }
                    i13 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new C18715c(arrayList);
            default:
                return new C18715c(m61677f0(new C13117a(byteBuffer.array(), byteBuffer.limit(), 1, false)));
        }
    }
}
