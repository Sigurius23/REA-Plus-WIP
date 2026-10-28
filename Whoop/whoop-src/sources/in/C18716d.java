package in;

import io.sentry.config.AbstractC20301a;
import mn.C25703a;
import p256jn.C21797b;
import p345nn.C26857h;
import p465rm.C31521c0;
import pn.C29370d;

/* JADX INFO: renamed from: in.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C18716d {

    /* JADX INFO: renamed from: a */
    public static final C18716d f73526a = new C18716d();

    /* JADX INFO: renamed from: a */
    public final AbstractC20301a m54417a(C31521c0 c31521c0) {
        String str = c31521c0.f130077L;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new C21797b(0);
                case "application/x-icy":
                    return new C25703a();
                case "application/id3":
                    return new C26857h(null);
                case "application/x-emsg":
                    return new C21797b(1);
                case "application/x-scte35":
                    return new C29370d();
            }
        }
        String strValueOf = String.valueOf(str);
        throw new IllegalArgumentException(strValueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(strValueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m54418b(C31521c0 c31521c0) {
        String str = c31521c0.f130077L;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
