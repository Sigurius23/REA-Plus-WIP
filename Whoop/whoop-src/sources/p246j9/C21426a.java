package p246j9;

import ga.C15614a;
import p000.AbstractC11266d;
import p086da.C11827b;
import p188ha.C17040i;
import p247ja.C21496c;
import p516u8.C34610p;
import p550vd.AbstractC35903f;

/* JADX INFO: renamed from: j9.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C21426a {

    /* JADX INFO: renamed from: a */
    public static final C21426a f82244a = new C21426a();

    /* JADX INFO: renamed from: a */
    public final AbstractC35903f m60304a(C34610p c34610p) {
        String str = c34610p.f145783n;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new C11827b(0);
                case "application/x-icy":
                    return new C15614a();
                case "application/id3":
                    return new C17040i(null);
                case "application/x-emsg":
                    return new C11827b(1);
                case "application/x-scte35":
                    return new C21496c();
            }
        }
        throw new IllegalArgumentException(AbstractC11266d.m30461o("Attempted to create decoder for unsupported MIME type: ", str));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m60305b(C34610p c34610p) {
        String str = c34610p.f145783n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
