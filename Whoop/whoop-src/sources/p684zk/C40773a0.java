package p684zk;

import com.google.crypto.tink.internal.C5101l0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p002a0.C0022g;
import p005a3.C0223l1;
import p093dl.C12154s;
import p093dl.C12161z;
import p093dl.InterfaceC12155t;
import p581we.C37199o;
import p586wk.EnumC37323a;
import p586wk.InterfaceC37327e;
import p586wk.InterfaceC37334l;
import p618xk.InterfaceC38413d;
import p715kotlin.jvm.internal.C22677k0;
import tl.C33911j;

/* JADX INFO: renamed from: zk.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C40773a0 implements InterfaceC40781f, InterfaceC38413d {

    /* JADX INFO: renamed from: E */
    public InterfaceC37327e f175801E;

    /* JADX INFO: renamed from: F */
    public List f175802F;

    /* JADX INFO: renamed from: G */
    public int f175803G;

    /* JADX INFO: renamed from: H */
    public volatile C12154s f175804H;

    /* JADX INFO: renamed from: I */
    public File f175805I;

    /* JADX INFO: renamed from: J */
    public C40775b0 f175806J;

    /* JADX INFO: renamed from: w */
    public final RunnableC40784i f175807w;

    /* JADX INFO: renamed from: x */
    public final C40782g f175808x;

    /* JADX INFO: renamed from: y */
    public int f175809y;

    /* JADX INFO: renamed from: z */
    public int f175810z = -1;

    public C40773a0(C40782g c40782g, RunnableC40784i runnableC40784i) {
        this.f175808x = c40782g;
        this.f175807w = runnableC40784i;
    }

    @Override // p684zk.InterfaceC40781f
    /* JADX INFO: renamed from: b */
    public final boolean mo132263b() {
        List list;
        ArrayList arrayListM33623d;
        ArrayList arrayListM132266a = this.f175808x.m132266a();
        boolean z4 = false;
        if (!arrayListM132266a.isEmpty()) {
            C40782g c40782g = this.f175808x;
            C0223l1 c0223l1 = c40782g.f175840c.f20303b;
            Class<?> cls = c40782g.f175841d.getClass();
            Class cls2 = c40782g.f175844g;
            Class cls3 = c40782g.f175848k;
            C37199o c37199o = (C37199o) c0223l1.f745i;
            C33911j c33911j = (C33911j) ((AtomicReference) c37199o.f159040w).getAndSet(null);
            if (c33911j == null) {
                c33911j = new C33911j(cls, cls2, cls3);
            } else {
                c33911j.m107265a(cls, cls2, cls3);
            }
            synchronized (((C0022g) c37199o.f159041x)) {
                list = (List) ((C0022g) c37199o.f159041x).get(c33911j);
            }
            ((AtomicReference) c37199o.f159040w).set(c33911j);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                C37199o c37199o2 = (C37199o) c0223l1.f738b;
                synchronized (c37199o2) {
                    arrayListM33623d = ((C12161z) c37199o2.f159040w).m33623d(cls);
                }
                Iterator it = arrayListM33623d.iterator();
                while (it.hasNext()) {
                    for (Class cls4 : ((C5101l0) c0223l1.f740d).m16041U((Class) it.next(), cls2)) {
                        if (!((C22677k0) c0223l1.f743g).m65768i(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                C37199o c37199o3 = (C37199o) c0223l1.f745i;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((C0022g) c37199o3.f159041x)) {
                    ((C0022g) c37199o3.f159041x).put(new C33911j(cls, cls2, cls3), listUnmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.f175802F;
                    if (list3 != null && this.f175803G < list3.size()) {
                        this.f175804H = null;
                        while (!z4 && this.f175803G < this.f175802F.size()) {
                            List list4 = this.f175802F;
                            int i13 = this.f175803G;
                            this.f175803G = i13 + 1;
                            InterfaceC12155t interfaceC12155t = (InterfaceC12155t) list4.get(i13);
                            File file = this.f175805I;
                            C40782g c40782g2 = this.f175808x;
                            this.f175804H = interfaceC12155t.mo33591b(file, c40782g2.f175842e, c40782g2.f175843f, c40782g2.f175846i);
                            if (this.f175804H != null && this.f175808x.m132268c(this.f175804H.f40409c.mo33598b()) != null) {
                                this.f175804H.f40409c.mo33600e(this.f175808x.f175852o, this);
                                z4 = true;
                            }
                        }
                        return z4;
                    }
                    int i14 = this.f175810z + 1;
                    this.f175810z = i14;
                    if (i14 >= list2.size()) {
                        int i15 = this.f175809y + 1;
                        this.f175809y = i15;
                        if (i15 >= arrayListM132266a.size()) {
                            break;
                        }
                        this.f175810z = 0;
                    }
                    InterfaceC37327e interfaceC37327e = (InterfaceC37327e) arrayListM132266a.get(this.f175809y);
                    Class cls5 = (Class) list2.get(this.f175810z);
                    InterfaceC37334l interfaceC37334lM132270e = this.f175808x.m132270e(cls5);
                    C40782g c40782g3 = this.f175808x;
                    this.f175806J = new C40775b0(c40782g3.f175840c.f20302a, interfaceC37327e, c40782g3.f175851n, c40782g3.f175842e, c40782g3.f175843f, interfaceC37334lM132270e, cls5, c40782g3.f175846i);
                    File fileMo9711n = c40782g3.f175845h.m56071a().mo9711n(this.f175806J);
                    this.f175805I = fileMo9711n;
                    if (fileMo9711n != null) {
                        this.f175801E = interfaceC37327e;
                        this.f175802F = this.f175808x.f175840c.f20303b.m559i(fileMo9711n);
                        this.f175803G = 0;
                    }
                }
            } else if (!File.class.equals(this.f175808x.f175848k)) {
                throw new IllegalStateException("Failed to find any load path from " + this.f175808x.f175841d.getClass() + " to " + this.f175808x.f175848k);
            }
        }
        return false;
    }

    @Override // p618xk.InterfaceC38413d
    /* JADX INFO: renamed from: c */
    public final void mo33617c(Exception exc) {
        this.f175807w.mo132264a(this.f175806J, exc, this.f175804H.f40409c, EnumC37323a.f159584z);
    }

    @Override // p684zk.InterfaceC40781f
    public final void cancel() {
        C12154s c12154s = this.f175804H;
        if (c12154s != null) {
            c12154s.f40409c.cancel();
        }
    }

    @Override // p618xk.InterfaceC38413d
    /* JADX INFO: renamed from: f */
    public final void mo33618f(Object obj) {
        this.f175807w.mo132265c(this.f175801E, obj, this.f175804H.f40409c, EnumC37323a.f159584z, this.f175806J);
    }
}
