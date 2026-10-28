package p384ow;

import java.io.IOException;
import java.io.StringWriter;
import p596ww.C37654b;
import rw.AbstractC31869s;
import rw.C31857g;

/* JADX INFO: renamed from: ow.p */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC28420p {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C37654b c37654b = new C37654b(stringWriter);
            c37654b.f161383H = 1;
            AbstractC31869s.f132185z.getClass();
            C31857g.m99045e(c37654b, this);
            return stringWriter.toString();
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }
}
