package mp;

import com.google.android.gms.internal.fido.zzho;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: mp.b1 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC25755b1 implements Comparable {
    /* JADX INFO: renamed from: d */
    public static int m76004d(byte b) {
        return (b >> 5) & 7;
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC25755b1 m76005e(byte... bArr) {
        bArr.getClass();
        C25761d1 c25761d1 = new C25761d1(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return AbstractC25753b.m75999k(c25761d1);
        } finally {
            try {
                c25761d1.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo75988a();

    /* JADX INFO: renamed from: b */
    public int mo76006b() {
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC25755b1 m76007c(Class cls) throws zzho {
        if (cls.isInstance(this)) {
            return (AbstractC25755b1) cls.cast(this);
        }
        throw new zzho(AbstractC31061c.m95640p("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }
}
