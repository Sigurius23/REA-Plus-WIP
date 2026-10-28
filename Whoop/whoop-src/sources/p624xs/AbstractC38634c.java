package p624xs;

import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5081b0;
import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5088f;
import com.google.crypto.tink.internal.C5098k;
import com.google.crypto.tink.internal.C5102m;
import p075ct.C11105a;
import p560vs.EnumC36362h4;
import p581we.C37199o;
import ws.C37585g;
import ws.C37586h;
import ws.C37587i;
import ws.C37589k;

/* JADX INFO: renamed from: xs.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC38634c {

    /* JADX INFO: renamed from: a */
    public static final C5085d0 f166149a;

    /* JADX INFO: renamed from: b */
    public static final C5081b0 f166150b;

    /* JADX INFO: renamed from: c */
    public static final C5102m f166151c;

    /* JADX INFO: renamed from: d */
    public static final C5098k f166152d;

    /* JADX INFO: renamed from: e */
    public static final C5102m f166153e;

    /* JADX INFO: renamed from: f */
    public static final C5098k f166154f;

    /* JADX INFO: renamed from: g */
    public static final C37199o f166155g;

    static {
        C11105a c11105aM16079c = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        C11105a c11105aM16079c2 = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        f166149a = new C5085d0(C37586h.class, new C38632a(4));
        f166150b = new C5081b0(c11105aM16079c, new C38632a(5));
        f166151c = new C5102m(C37589k.class, new C38632a(6));
        f166152d = new C5098k(c11105aM16079c2, new C38632a(7));
        f166153e = new C5102m(C37587i.class, new C38632a(8));
        f166154f = new C5098k(c11105aM16079c, new C38632a(9));
        C5088f c5088fM119196j = C37199o.m119196j();
        c5088fM119196j.m15967a(EnumC36362h4.RAW, C37585g.f160733e);
        c5088fM119196j.m15967a(EnumC36362h4.TINK, C37585g.f160730b);
        c5088fM119196j.m15967a(EnumC36362h4.CRUNCHY, C37585g.f160731c);
        c5088fM119196j.m15967a(EnumC36362h4.LEGACY, C37585g.f160732d);
        f166155g = c5088fM119196j.m15968b();
    }
}
