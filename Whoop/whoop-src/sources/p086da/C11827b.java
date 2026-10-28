package p086da;

import ca.C4358a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import p113ea.C12890a;
import p309lo.C24561s;
import p516u8.C34585c0;
import p550vd.AbstractC35903f;
import p607x8.C38059n;

/* JADX INFO: renamed from: da.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C11827b extends AbstractC35903f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38419a;

    @Override // p550vd.AbstractC35903f
    /* JADX INFO: renamed from: n */
    public final C34585c0 mo31690n(C4358a c4358a, ByteBuffer byteBuffer) {
        switch (this.f38419a) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                C24561s c24561s = new C24561s(byteBuffer.array(), byteBuffer.limit(), 5, (byte) 0);
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
                                    Charset charset = StandardCharsets.US_ASCII;
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
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[iM71632i3];
                            c24561s.m71635l(iM71632i3, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        c24561s.m71640q(iM71629f3 * 8);
                    }
                    c24561s.m71640q(iM71629f2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new C11826a(iM71632i, str.concat(str2)));
                    }
                    i13 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new C34585c0(arrayList);
            default:
                C38059n c38059n = new C38059n(byteBuffer.array(), byteBuffer.limit());
                String strM121862o = c38059n.m121862o();
                strM121862o.getClass();
                String strM121862o2 = c38059n.m121862o();
                strM121862o2.getClass();
                return new C34585c0(new C12890a(strM121862o, strM121862o2, c38059n.m121861n(), c38059n.m121861n(), Arrays.copyOfRange(c38059n.f163017a, c38059n.f163018b, c38059n.f163019c)));
        }
    }
}
