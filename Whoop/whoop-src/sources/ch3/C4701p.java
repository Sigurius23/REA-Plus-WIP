package ch3;

import java.util.Iterator;
import jh3.C21705f;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p471rx.exceptions.CompositeException;
import p471rx.exceptions.OnCompletedFailedException;
import p471rx.exceptions.OnErrorFailedException;
import p471rx.exceptions.OnErrorNotImplementedException;
import pg3.C29174b0;
import pg3.C29218v0;
import pg3.InterfaceC29182e;
import qg3.C30351c;
import xg3.AbstractC38292s;
import xg3.InterfaceC38278e;

/* JADX INFO: renamed from: ch3.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C4701p implements InterfaceC38278e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19249w;

    /* JADX INFO: renamed from: x */
    public final Object f19250x;

    public /* synthetic */ C4701p(Object obj, int i13) {
        this.f19249w = i13;
        this.f19250x = obj;
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        switch (this.f19249w) {
            case 0:
                AbstractC38292s abstractC38292s = (AbstractC38292s) obj;
                try {
                    Iterator it = ((Iterable) this.f19250x).iterator();
                    boolean zHasNext = it.hasNext();
                    if (abstractC38292s.mo14749a()) {
                        return;
                    }
                    if (zHasNext) {
                        abstractC38292s.mo14765f(new C4699o(abstractC38292s, it));
                        return;
                    } else {
                        abstractC38292s.onCompleted();
                        return;
                    }
                } catch (Throwable th3) {
                    AbstractC12350b.m34574W(th3, abstractC38292s);
                    return;
                }
            case 1:
                ((AbstractC38292s) obj).onError((Throwable) this.f19250x);
                return;
            default:
                AbstractC38292s abstractC38292s2 = (AbstractC38292s) obj;
                InterfaceC29182e interfaceC29182eClone = ((C29174b0) this.f19250x).clone();
                C30351c c30351c = new C30351c(interfaceC29182eClone, abstractC38292s2);
                abstractC38292s2.m122688c(c30351c);
                abstractC38292s2.mo14765f(c30351c);
                try {
                    C29218v0 c29218v0M88675b = ((C29174b0) interfaceC29182eClone).m88675b();
                    while (true) {
                        int i13 = c30351c.get();
                        if (i13 == 0) {
                            c30351c.f124533z = c29218v0M88675b;
                            if (c30351c.compareAndSet(0, 2)) {
                                return;
                            }
                        } else {
                            if (i13 != 1) {
                                if (i13 != 2 && i13 != 3) {
                                    throw new IllegalStateException(AbstractC2875y.m8295h(i13, "Unknown state: "));
                                }
                                throw new AssertionError();
                            }
                            if (c30351c.compareAndSet(1, 3)) {
                                c30351c.m92808c(c29218v0M88675b);
                                return;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    AbstractC12350b.m34573V(th4);
                    c30351c.set(3);
                    if (c30351c.f124532y) {
                        return;
                    }
                    try {
                        c30351c.f124531x.onError(th4);
                        return;
                    } catch (OnCompletedFailedException | OnErrorFailedException | OnErrorNotImplementedException unused) {
                        C21705f.f83334f.m61158b().getClass();
                        return;
                    } catch (Throwable th5) {
                        AbstractC12350b.m34573V(th5);
                        new CompositeException(th4, th5);
                        C21705f.f83334f.m61158b().getClass();
                        return;
                    }
                }
                break;
        }
    }

    public C4701p(Iterable iterable) {
        this.f19249w = 0;
        if (iterable == null) {
            throw new NullPointerException("iterable must not be null");
        }
        this.f19250x = iterable;
    }
}
