package p624xs;

import com.google.crypto.tink.internal.AbstractC5078a;
import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5081b0;
import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5088f;
import com.google.crypto.tink.internal.C5098k;
import com.google.crypto.tink.internal.C5102m;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.C5143h;
import java.math.BigInteger;
import p075ct.C11105a;
import p560vs.C36434t4;
import p560vs.C36440u4;
import p560vs.C36458x4;
import p560vs.C36464y4;
import p560vs.EnumC36354g2;
import p560vs.EnumC36362h4;
import p581we.C37199o;
import ro.C31624i;
import ws.C37600v;
import ws.C37601w;
import ws.C37602x;
import ws.C37603y;
import ws.C37604z;

/* JADX INFO: renamed from: xs.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC38636e {

    /* JADX INFO: renamed from: a */
    public static final C5085d0 f166164a;

    /* JADX INFO: renamed from: b */
    public static final C5081b0 f166165b;

    /* JADX INFO: renamed from: c */
    public static final C5102m f166166c;

    /* JADX INFO: renamed from: d */
    public static final C5098k f166167d;

    /* JADX INFO: renamed from: e */
    public static final C5102m f166168e;

    /* JADX INFO: renamed from: f */
    public static final C5098k f166169f;

    /* JADX INFO: renamed from: g */
    public static final C37199o f166170g;

    /* JADX INFO: renamed from: h */
    public static final C37199o f166171h;

    static {
        C11105a c11105aM16079c = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        C11105a c11105aM16079c2 = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        f166164a = new C5085d0(C37602x.class, new C38632a(16));
        f166165b = new C5081b0(c11105aM16079c, new C38632a(17));
        f166166c = new C5102m(C37604z.class, new C38632a(18));
        f166167d = new C5098k(c11105aM16079c2, new C38632a(19));
        f166168e = new C5102m(C37603y.class, new C38632a(20));
        f166169f = new C5098k(c11105aM16079c, new C38632a(21));
        C5088f c5088fM119196j = C37199o.m119196j();
        c5088fM119196j.m15967a(EnumC36362h4.RAW, C37601w.f160817e);
        c5088fM119196j.m15967a(EnumC36362h4.TINK, C37601w.f160814b);
        c5088fM119196j.m15967a(EnumC36362h4.CRUNCHY, C37601w.f160815c);
        c5088fM119196j.m15967a(EnumC36362h4.LEGACY, C37601w.f160816d);
        f166170g = c5088fM119196j.m15968b();
        C5088f c5088fM119196j2 = C37199o.m119196j();
        c5088fM119196j2.m15967a(EnumC36354g2.SHA256, C37600v.f160810b);
        c5088fM119196j2.m15967a(EnumC36354g2.SHA384, C37600v.f160811c);
        c5088fM119196j2.m15967a(EnumC36354g2.SHA512, C37600v.f160812d);
        f166171h = c5088fM119196j2.m15968b();
    }

    /* JADX INFO: renamed from: a */
    public static C31624i m123843a(AbstractC5146i abstractC5146i) {
        return C31624i.m97698s(AbstractC5078a.m15934g(abstractC5146i.m16174g()));
    }

    /* JADX INFO: renamed from: b */
    public static C5143h m123844b(BigInteger bigInteger) {
        byte[] bArrM15949v = AbstractC5078a.m15949v(bigInteger);
        C5143h c5143h = AbstractC5146i.f21514x;
        return AbstractC5146i.m16173d(bArrM15949v, 0, bArrM15949v.length);
    }

    /* JADX INFO: renamed from: c */
    public static C36440u4 m123845c(C37602x c37602x) {
        C36434t4 c36434t4M116681G = C36440u4.m116681G();
        C37600v c37600v = c37602x.f160823d;
        C37199o c37199o = f166171h;
        c36434t4M116681G.m116652i((EnumC36354g2) c37199o.m119215U(c37600v));
        c36434t4M116681G.m116650g((EnumC36354g2) c37199o.m119215U(c37602x.f160824e));
        c36434t4M116681G.m116651h(c37602x.f160825f);
        return (C36440u4) c36434t4M116681G.m16347b();
    }

    /* JADX INFO: renamed from: d */
    public static C36464y4 m123846d(C37604z c37604z) {
        C36458x4 c36458x4M116804J = C36464y4.m116804J();
        c36458x4M116804J.m116784i(m123845c(c37604z.f160833b));
        c36458x4M116804J.m116783h(m123844b(c37604z.f160834c));
        c36458x4M116804J.m116782g(m123844b(c37604z.f160833b.f160821b));
        c36458x4M116804J.m116785j();
        return (C36464y4) c36458x4M116804J.m16347b();
    }
}
