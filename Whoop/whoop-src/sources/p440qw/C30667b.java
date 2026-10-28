package p440qw;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import p133f1.C13968p1;
import p384ow.AbstractC28430z;
import p384ow.C28417m;
import p384ow.InterfaceC28405a0;
import p563vw.C36540a;
import p596ww.C37653a;
import p596ww.C37654b;
import pw.InterfaceC29582a;
import rw.C31867q;

/* JADX INFO: renamed from: qw.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C30667b extends AbstractC28430z {

    /* JADX INFO: renamed from: a */
    public volatile AbstractC28430z f126201a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f126202b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f126203c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C28417m f126204d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C36540a f126205e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C30668c f126206f;

    public C30667b(C30668c c30668c, boolean z4, boolean z13, C28417m c28417m, C36540a c36540a) {
        this.f126206f = c30668c;
        this.f126202b = z4;
        this.f126203c = z13;
        this.f126204d = c28417m;
        this.f126205e = c36540a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: b */
    public final Object mo86132b(C37653a c37653a) {
        if (this.f126202b) {
            c37653a.skipValue();
            return null;
        }
        AbstractC28430z abstractC28430zM86136c = this.f126201a;
        if (abstractC28430zM86136c == null) {
            C28417m c28417m = this.f126204d;
            InterfaceC28405a0 interfaceC28405a0 = this.f126206f;
            C36540a c36540a = this.f126205e;
            C31867q c31867q = c28417m.f114619d;
            c31867q.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c31867q.f132154y;
            if (interfaceC28405a0 == C31867q.f132151z) {
                interfaceC28405a0 = c31867q;
            } else {
                Class cls = c36540a.f156459a;
                InterfaceC28405a0 interfaceC28405a1 = (InterfaceC28405a0) concurrentHashMap.get(cls);
                if (interfaceC28405a1 == null) {
                    InterfaceC29582a interfaceC29582a = (InterfaceC29582a) cls.getAnnotation(InterfaceC29582a.class);
                    if (interfaceC29582a != null) {
                        Class clsValue = interfaceC29582a.value();
                        if (InterfaceC28405a0.class.isAssignableFrom(clsValue)) {
                            InterfaceC28405a0 interfaceC28405a2 = (InterfaceC28405a0) ((C13968p1) c31867q.f132153x).m39754j(new C36540a(clsValue), true).construct();
                            InterfaceC28405a0 interfaceC28405a3 = (InterfaceC28405a0) concurrentHashMap.putIfAbsent(cls, interfaceC28405a2);
                            if (interfaceC28405a3 != null) {
                                interfaceC28405a2 = interfaceC28405a3;
                            }
                            if (interfaceC28405a2 == interfaceC28405a0) {
                                interfaceC28405a0 = c31867q;
                            }
                        }
                    }
                } else if (interfaceC28405a1 == interfaceC28405a0) {
                    interfaceC28405a0 = c31867q;
                }
            }
            Iterator it = c28417m.f114620e.iterator();
            boolean z4 = false;
            while (true) {
                if (!it.hasNext()) {
                    if (!z4) {
                        abstractC28430zM86136c = c28417m.m86136c(c36540a);
                        break;
                    }
                    throw new IllegalArgumentException("GSON cannot serialize or deserialize " + c36540a);
                }
                InterfaceC28405a0 interfaceC28405a4 = (InterfaceC28405a0) it.next();
                if (z4) {
                    AbstractC28430z abstractC28430zMo86129a = interfaceC28405a4.mo86129a(c28417m, c36540a);
                    if (abstractC28430zMo86129a != null) {
                        abstractC28430zM86136c = abstractC28430zMo86129a;
                        break;
                    }
                } else if (interfaceC28405a4 == interfaceC28405a0) {
                    z4 = true;
                }
            }
            this.f126201a = abstractC28430zM86136c;
        }
        return abstractC28430zM86136c.mo86132b(c37653a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: c */
    public final void mo86133c(C37654b c37654b, Object obj) throws IOException {
        if (this.f126203c) {
            c37654b.m121076m();
            return;
        }
        AbstractC28430z abstractC28430zM86136c = this.f126201a;
        if (abstractC28430zM86136c == null) {
            C28417m c28417m = this.f126204d;
            InterfaceC28405a0 interfaceC28405a0 = this.f126206f;
            C36540a c36540a = this.f126205e;
            C31867q c31867q = c28417m.f114619d;
            c31867q.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c31867q.f132154y;
            if (interfaceC28405a0 == C31867q.f132151z) {
                interfaceC28405a0 = c31867q;
            } else {
                Class cls = c36540a.f156459a;
                InterfaceC28405a0 interfaceC28405a1 = (InterfaceC28405a0) concurrentHashMap.get(cls);
                if (interfaceC28405a1 == null) {
                    InterfaceC29582a interfaceC29582a = (InterfaceC29582a) cls.getAnnotation(InterfaceC29582a.class);
                    if (interfaceC29582a != null) {
                        Class clsValue = interfaceC29582a.value();
                        if (InterfaceC28405a0.class.isAssignableFrom(clsValue)) {
                            InterfaceC28405a0 interfaceC28405a2 = (InterfaceC28405a0) ((C13968p1) c31867q.f132153x).m39754j(new C36540a(clsValue), true).construct();
                            InterfaceC28405a0 interfaceC28405a3 = (InterfaceC28405a0) concurrentHashMap.putIfAbsent(cls, interfaceC28405a2);
                            if (interfaceC28405a3 != null) {
                                interfaceC28405a2 = interfaceC28405a3;
                            }
                            if (interfaceC28405a2 == interfaceC28405a0) {
                                interfaceC28405a0 = c31867q;
                            }
                        }
                    }
                } else if (interfaceC28405a1 == interfaceC28405a0) {
                    interfaceC28405a0 = c31867q;
                }
            }
            Iterator it = c28417m.f114620e.iterator();
            boolean z4 = false;
            while (true) {
                if (!it.hasNext()) {
                    if (!z4) {
                        abstractC28430zM86136c = c28417m.m86136c(c36540a);
                        break;
                    } else {
                        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + c36540a);
                    }
                }
                InterfaceC28405a0 interfaceC28405a4 = (InterfaceC28405a0) it.next();
                if (z4) {
                    AbstractC28430z abstractC28430zMo86129a = interfaceC28405a4.mo86129a(c28417m, c36540a);
                    if (abstractC28430zMo86129a != null) {
                        abstractC28430zM86136c = abstractC28430zMo86129a;
                        break;
                    }
                } else if (interfaceC28405a4 == interfaceC28405a0) {
                    z4 = true;
                }
            }
            this.f126201a = abstractC28430zM86136c;
        }
        abstractC28430zM86136c.mo86133c(c37654b, obj);
    }
}
