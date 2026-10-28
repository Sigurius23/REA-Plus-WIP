package p614xg;

import at.C1969m;
import java.io.ByteArrayOutputStream;
import p031b9.AbstractC2875y;
import p039c.C3719c;
import p039c.C3720d;

/* JADX INFO: renamed from: xg.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC38267a {

    /* JADX INFO: renamed from: a */
    public static final C1969m f164067a = new C1969m();

    /* JADX INFO: renamed from: a */
    public static byte[] m122606a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            f164067a.m6014b(byteArrayOutputStream, str);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e5) {
            throw new C3719c(e5, AbstractC2875y.m8298k(e5, new StringBuilder("unable to decode base64 string: ")));
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m122607b(byte[] bArr) {
        int length = bArr.length;
        C1969m c1969m = f164067a;
        c1969m.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((length + 2) / 3) * 4);
        try {
            c1969m.m6015c(bArr, length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e5) {
            throw new C3720d(e5, AbstractC2875y.m8298k(e5, new StringBuilder("exception encoding base64 string: ")));
        }
    }
}
