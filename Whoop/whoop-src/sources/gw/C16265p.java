package gw;

import java.text.ParseException;
import java.util.concurrent.atomic.AtomicReference;
import p628xw.AbstractC38676f;
import p628xw.C38672b;

/* JADX INFO: renamed from: gw.p */
/* JADX INFO: loaded from: classes6.dex */
public class C16265p extends AbstractC16256g {

    /* JADX INFO: renamed from: E */
    public final AtomicReference f61870E;

    /* JADX INFO: renamed from: x */
    public final C16263n f61871x;

    /* JADX INFO: renamed from: y */
    public final String f61872y;

    /* JADX INFO: renamed from: z */
    public final C38672b f61873z;

    public C16265p(C38672b c38672b, C38672b c38672b2, C38672b c38672b3) throws ParseException {
        String string;
        C38672b c38672b4;
        C16267r c16267r = new C16267r(c38672b2);
        AtomicReference atomicReference = new AtomicReference();
        this.f61870E = atomicReference;
        try {
            C16263n c16263nM46084c = C16263n.m46084c(c38672b);
            boolean z4 = c16263nM46084c.f61866O;
            this.f61871x = c16263nM46084c;
            this.f61804w = c16267r;
            byte[] bytes = null;
            if (z4) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(c16263nM46084c.m46075a().f166476w);
                sb4.append('.');
                C16267r c16267r2 = this.f61804w;
                C38672b c38672bM124049c = c16267r2.f61876y;
                if (c38672bM124049c == null) {
                    byte[] bytes2 = c16267r2.f61875x;
                    if (bytes2 == null) {
                        if (c38672bM124049c != null) {
                            bytes2 = c38672bM124049c.m124047a();
                        } else {
                            String string2 = c16267r2.toString();
                            bytes2 = string2 != null ? string2.getBytes(AbstractC38676f.f166480a) : null;
                        }
                    }
                    c38672bM124049c = C38672b.m124049c(bytes2);
                }
                sb4.append(c38672bM124049c.f166476w);
                string = sb4.toString();
            } else {
                string = c16263nM46084c.m46075a().f166476w + '.' + this.f61804w.toString();
            }
            this.f61872y = string;
            if (c38672b3.f166476w.trim().isEmpty()) {
                throw new ParseException("The signature must not be empty", 0);
            }
            this.f61873z = c38672b3;
            atomicReference.set(EnumC16264o.f61867w);
            if (z4 && (c38672b4 = c16267r.f61876y) == null) {
                if (c38672b4 != null) {
                    bytes = c38672b4.m124047a();
                } else {
                    String string3 = c16267r.toString();
                    if (string3 != null) {
                        bytes = string3.getBytes(AbstractC38676f.f166480a);
                    }
                }
                C38672b.m124049c(bytes);
            }
        } catch (ParseException e5) {
            throw new ParseException("Invalid JWS header: " + e5.getMessage(), 0);
        }
    }
}
