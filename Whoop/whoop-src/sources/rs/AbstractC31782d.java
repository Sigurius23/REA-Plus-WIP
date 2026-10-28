package rs;

import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5081b0;
import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5088f;
import com.google.crypto.tink.internal.C5098k;
import com.google.crypto.tink.internal.C5102m;
import p075ct.C11105a;
import p380os.C28301a;
import p436qs.C30564h;
import p436qs.C30566j;
import p436qs.C30567k;
import p436qs.C30568l;
import p560vs.EnumC36354g2;
import p560vs.EnumC36362h4;
import p581we.C37199o;

/* JADX INFO: renamed from: rs.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC31782d {

    /* JADX INFO: renamed from: a */
    public static final C37199o f131592a;

    /* JADX INFO: renamed from: b */
    public static final C37199o f131593b;

    /* JADX INFO: renamed from: c */
    public static final C5085d0 f131594c;

    /* JADX INFO: renamed from: d */
    public static final C5081b0 f131595d;

    /* JADX INFO: renamed from: e */
    public static final C5102m f131596e;

    /* JADX INFO: renamed from: f */
    public static final C5098k f131597f;

    static {
        C11105a c11105aM16079c = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.HmacKey");
        C5088f c5088fM119196j = C37199o.m119196j();
        c5088fM119196j.m15967a(EnumC36362h4.RAW, C30567k.f125787e);
        c5088fM119196j.m15967a(EnumC36362h4.TINK, C30567k.f125784b);
        c5088fM119196j.m15967a(EnumC36362h4.LEGACY, C30567k.f125786d);
        c5088fM119196j.m15967a(EnumC36362h4.CRUNCHY, C30567k.f125785c);
        f131592a = c5088fM119196j.m15968b();
        C5088f c5088fM119196j2 = C37199o.m119196j();
        c5088fM119196j2.m15967a(EnumC36354g2.SHA1, C30566j.f125778b);
        c5088fM119196j2.m15967a(EnumC36354g2.SHA224, C30566j.f125779c);
        c5088fM119196j2.m15967a(EnumC36354g2.SHA256, C30566j.f125780d);
        c5088fM119196j2.m15967a(EnumC36354g2.SHA384, C30566j.f125781e);
        c5088fM119196j2.m15967a(EnumC36354g2.SHA512, C30566j.f125782f);
        f131593b = c5088fM119196j2.m15968b();
        f131594c = new C5085d0(C30568l.class, new C28301a(19));
        f131595d = new C5081b0(c11105aM16079c, new C28301a(20));
        f131596e = new C5102m(C30564h.class, new C28301a(21));
        f131597f = new C5098k(c11105aM16079c, new C28301a(22));
    }
}
