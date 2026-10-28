package p093dl;

import com.bumptech.glide.Registry$NoModelLoaderAvailableException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p474s.C31983m2;

/* JADX INFO: renamed from: dl.z */
/* JADX INFO: loaded from: classes.dex */
public final class C12161z {

    /* JADX INFO: renamed from: e */
    public static final C12137e f40421e = new C12137e(4);

    /* JADX INFO: renamed from: f */
    public static final C12159x f40422f = new C12159x();

    /* JADX INFO: renamed from: d */
    public final C31983m2 f40426d;

    /* JADX INFO: renamed from: a */
    public final ArrayList f40423a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final HashSet f40425c = new HashSet();

    /* JADX INFO: renamed from: b */
    public final C12137e f40424b = f40421e;

    public C12161z(C31983m2 c31983m2) {
        this.f40426d = c31983m2;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m33620a(Class cls, Class cls2, InterfaceC12156u interfaceC12156u) {
        C12160y c12160y = new C12160y(cls, cls2, interfaceC12156u);
        ArrayList arrayList = this.f40423a;
        arrayList.add(arrayList.size(), c12160y);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized InterfaceC12155t m33621b(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f40423a.iterator();
            boolean z4 = false;
            while (true) {
                boolean z13 = true;
                if (!it.hasNext()) {
                    break;
                }
                C12160y c12160y = (C12160y) it.next();
                if (this.f40425c.contains(c12160y)) {
                    z4 = true;
                } else {
                    if (!c12160y.f40418a.isAssignableFrom(cls) || !c12160y.f40419b.isAssignableFrom(cls2)) {
                        z13 = false;
                    }
                    if (z13) {
                        this.f40425c.add(c12160y);
                        arrayList.add(c12160y.f40420c.mo33589a(this));
                        this.f40425c.remove(c12160y);
                    }
                }
            }
            if (arrayList.size() > 1) {
                C12137e c12137e = this.f40424b;
                C31983m2 c31983m2 = this.f40426d;
                c12137e.getClass();
                return new C12131b(1, arrayList, c31983m2);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC12155t) arrayList.get(0);
            }
            if (!z4) {
                throw new Registry$NoModelLoaderAvailableException(cls, cls2);
            }
            return f40422f;
        } catch (Throwable th3) {
            this.f40425c.clear();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized ArrayList m33622c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C12160y c12160y : this.f40423a) {
                if (!this.f40425c.contains(c12160y) && c12160y.f40418a.isAssignableFrom(cls)) {
                    this.f40425c.add(c12160y);
                    arrayList.add(c12160y.f40420c.mo33589a(this));
                    this.f40425c.remove(c12160y);
                }
            }
        } catch (Throwable th3) {
            this.f40425c.clear();
            throw th3;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized ArrayList m33623d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C12160y c12160y : this.f40423a) {
            if (!arrayList.contains(c12160y.f40419b) && c12160y.f40418a.isAssignableFrom(cls)) {
                arrayList.add(c12160y.f40419b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized ArrayList m33624e() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f40423a.iterator();
        while (it.hasNext()) {
            C12160y c12160y = (C12160y) it.next();
            if (c12160y.f40418a.isAssignableFrom(C12144i.class) && c12160y.f40419b.isAssignableFrom(InputStream.class)) {
                it.remove();
                arrayList.add(c12160y.f40420c);
            }
        }
        return arrayList;
    }
}
