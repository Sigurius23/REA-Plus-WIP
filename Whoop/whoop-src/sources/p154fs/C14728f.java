package p154fs;

import com.google.crypto.tink.internal.AbstractC5113r0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Iterator;
import p560vs.C36391m3;
import p560vs.C36409p3;
import p560vs.C36421r3;
import p560vs.C36427s3;
import p560vs.C36433t3;
import p560vs.C36439u3;
import p560vs.EnumC36362h4;

/* JADX INFO: renamed from: fs.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C14728f {

    /* JADX INFO: renamed from: c */
    public static final C14728f f54464c;

    /* JADX INFO: renamed from: d */
    public static final C14728f f54465d;

    /* JADX INFO: renamed from: e */
    public static final C14728f f54466e;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54467a;

    /* JADX INFO: renamed from: b */
    public final Object f54468b;

    static {
        int i13 = 0;
        f54464c = new C14728f("ENABLED", i13);
        f54465d = new C14728f("DISABLED", i13);
        f54466e = new C14728f("DESTROYED", i13);
    }

    public /* synthetic */ C14728f(Object obj, int i13) {
        this.f54467a = i13;
        this.f54468b = obj;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m42227a(C36409p3 c36409p3) {
        C36433t3 c36433t3M42228b;
        synchronized (this) {
            c36433t3M42228b = m42228b(AbstractC14737o.m42242b(c36409p3), c36409p3.m116533D());
        }
        C36421r3 c36421r3 = (C36421r3) this.f54468b;
        c36421r3.m16350e();
        C36439u3.m116669A((C36439u3) c36421r3.f21594x, c36433t3M42228b);
    }

    /* JADX INFO: renamed from: b */
    public synchronized C36433t3 m42228b(C36391m3 c36391m3, EnumC36362h4 enumC36362h4) {
        int iM16078b;
        synchronized (this) {
            iM16078b = AbstractC5113r0.m16078b();
            while (m42230d(iM16078b)) {
                iM16078b = AbstractC5113r0.m16078b();
            }
        }
        return (C36433t3) c36427s3M116643I.m16347b();
        if (enumC36362h4 == EnumC36362h4.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        C36427s3 c36427s3M116643I = C36433t3.m116643I();
        c36427s3M116643I.m16350e();
        C36433t3.m116644z((C36433t3) c36427s3M116643I.f21594x, c36391m3);
        c36427s3M116643I.m16350e();
        C36433t3.m116642C((C36433t3) c36427s3M116643I.f21594x, iM16078b);
        c36427s3M116643I.m16350e();
        C36433t3.m116641B((C36433t3) c36427s3M116643I.f21594x);
        c36427s3M116643I.m16350e();
        C36433t3.m116640A((C36433t3) c36427s3M116643I.f21594x, enumC36362h4);
        return (C36433t3) c36427s3M116643I.m16347b();
    }

    /* JADX INFO: renamed from: c */
    public synchronized C14730h m42229c() {
        return C14730h.m42231a((C36439u3) ((C36421r3) this.f54468b).m16347b());
    }

    /* JADX INFO: renamed from: d */
    public synchronized boolean m42230d(int i13) {
        Iterator it = Collections.unmodifiableList(((C36439u3) ((C36421r3) this.f54468b).f21594x).m116676D()).iterator();
        while (it.hasNext()) {
            if (((C36433t3) it.next()).m116646E() == i13) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        switch (this.f54467a) {
            case 0:
                return (String) this.f54468b;
            default:
                return super.toString();
        }
    }
}
