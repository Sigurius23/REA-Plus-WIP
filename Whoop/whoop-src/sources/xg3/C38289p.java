package xg3;

import bh3.InterfaceC3255b;
import ch3.C4697n;
import ch3.C4707s;
import ch3.C4718x0;
import jh3.C21705f;
import jh3.C21707h;
import mh3.C25565b;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: xg3.p */
/* JADX INFO: loaded from: classes5.dex */
public class C38289p {

    /* JADX INFO: renamed from: a */
    public final InterfaceC38288o f164089a;

    public C38289p(InterfaceC38288o interfaceC38288o) {
        C21705f.f83334f.m61161f().getClass();
        this.f164089a = interfaceC38288o;
    }

    /* JADX INFO: renamed from: a */
    public static C38280g m122683a(C38289p c38289p) {
        return C38280g.m122636V(new C4697n(c38289p.f164089a, 1));
    }

    /* JADX INFO: renamed from: b */
    public static C38289p m122684b(InterfaceC3255b interfaceC3255b) {
        return new C38289p(new C4718x0(interfaceC3255b));
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC38293t m122685c(AbstractC38291r abstractC38291r) {
        try {
            InterfaceC38288o c4707s = this.f164089a;
            C21707h c21707hM61161f = C21705f.f83334f.m61161f();
            if (c21707hM61161f != C21707h.f83342a) {
                C4697n c4697n = new C4697n(c4707s, 1);
                c21707hM61161f.getClass();
                c4707s = new C4707s(c4697n, 2);
            }
            c4707s.mo9472b(abstractC38291r);
            C21705f.f83334f.m61161f().getClass();
            return abstractC38291r;
        } catch (Throwable th3) {
            AbstractC12350b.m34573V(th3);
            try {
                C21705f.f83334f.m61161f().getClass();
                abstractC38291r.mo14742d(th3);
                return new C25565b(0);
            } catch (Throwable th4) {
                AbstractC12350b.m34573V(th4);
                RuntimeException runtimeException = new RuntimeException("Error occurred attempting to subscribe [" + th3.getMessage() + "] and then again while trying to pass to onError.", th4);
                C21705f.f83334f.m61161f().getClass();
                throw runtimeException;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m122686d(InterfaceC3255b interfaceC3255b, InterfaceC3255b interfaceC3255b2) {
        m122685c(new C38285l(interfaceC3255b2, interfaceC3255b));
    }
}
