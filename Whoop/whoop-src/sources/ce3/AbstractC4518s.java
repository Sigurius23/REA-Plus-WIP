package ce3;

import java.io.IOException;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: ce3.s */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC4518s {
    /* JADX INFO: renamed from: a */
    public static int m14140a(int i13, int i14, int i15) throws IOException {
        if ((i14 & 8) != 0) {
            i13--;
        }
        if (i15 <= i13) {
            return i13 - i15;
        }
        throw new IOException(AbstractC2875y.m8294g(i15, i13, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
