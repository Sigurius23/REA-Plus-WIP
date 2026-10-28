package p684zk;

import com.bumptech.glide.C4961c;
import com.bumptech.glide.EnumC4962d;
import com.bumptech.glide.Registry$NoSourceEncoderAvailableException;
import com.google.crypto.tink.internal.C5101l0;
import io.sentry.android.core.util.C20162a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.AbstractC11266d;
import p005a3.C0223l1;
import p093dl.C12154s;
import p093dl.InterfaceC12155t;
import p150fl.C14555a;
import p306ll.C24499b;
import p306ll.C24500c;
import p306ll.InterfaceC24498a;
import p372ol.C28006a;
import p372ol.C28007b;
import p372ol.C28008c;
import p372ol.C28009d;
import p474s.C31983m2;
import p586wk.C37330h;
import p586wk.InterfaceC37325c;
import p586wk.InterfaceC37327e;
import p586wk.InterfaceC37334l;
import p715kotlin.jvm.internal.C22677k0;
import tl.C33911j;

/* JADX INFO: renamed from: zk.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C40782g {

    /* JADX INFO: renamed from: a */
    public final ArrayList f175838a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f175839b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public C4961c f175840c;

    /* JADX INFO: renamed from: d */
    public Object f175841d;

    /* JADX INFO: renamed from: e */
    public int f175842e;

    /* JADX INFO: renamed from: f */
    public int f175843f;

    /* JADX INFO: renamed from: g */
    public Class f175844g;

    /* JADX INFO: renamed from: h */
    public C20162a f175845h;

    /* JADX INFO: renamed from: i */
    public C37330h f175846i;

    /* JADX INFO: renamed from: j */
    public Map f175847j;

    /* JADX INFO: renamed from: k */
    public Class f175848k;

    /* JADX INFO: renamed from: l */
    public boolean f175849l;

    /* JADX INFO: renamed from: m */
    public boolean f175850m;

    /* JADX INFO: renamed from: n */
    public InterfaceC37327e f175851n;

    /* JADX INFO: renamed from: o */
    public EnumC4962d f175852o;

    /* JADX INFO: renamed from: p */
    public C40786k f175853p;

    /* JADX INFO: renamed from: q */
    public boolean f175854q;

    /* JADX INFO: renamed from: r */
    public boolean f175855r;

    /* JADX INFO: renamed from: a */
    public final ArrayList m132266a() {
        boolean z4 = this.f175850m;
        ArrayList arrayList = this.f175839b;
        if (!z4) {
            this.f175850m = true;
            arrayList.clear();
            ArrayList arrayListM132267b = m132267b();
            int size = arrayListM132267b.size();
            for (int i13 = 0; i13 < size; i13++) {
                C12154s c12154s = (C12154s) arrayListM132267b.get(i13);
                InterfaceC37327e interfaceC37327e = c12154s.f40407a;
                List list = c12154s.f40408b;
                if (!arrayList.contains(interfaceC37327e)) {
                    arrayList.add(c12154s.f40407a);
                }
                for (int i14 = 0; i14 < list.size(); i14++) {
                    if (!arrayList.contains(list.get(i14))) {
                        arrayList.add(list.get(i14));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m132267b() {
        boolean z4 = this.f175849l;
        ArrayList arrayList = this.f175838a;
        if (!z4) {
            this.f175849l = true;
            arrayList.clear();
            List listM559i = this.f175840c.f20303b.m559i(this.f175841d);
            int size = listM559i.size();
            for (int i13 = 0; i13 < size; i13++) {
                C12154s c12154sMo33591b = ((InterfaceC12155t) listM559i.get(i13)).mo33591b(this.f175841d, this.f175842e, this.f175843f, this.f175846i);
                if (c12154sMo33591b != null) {
                    arrayList.add(c12154sMo33591b);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final C40799x m132268c(Class cls) {
        C40799x c40799x;
        Class cls2;
        Class cls3;
        Class cls4;
        C40799x c40799x2;
        ArrayList arrayList;
        InterfaceC24498a interfaceC24498a;
        Class cls5 = cls;
        C0223l1 c0223l1 = this.f175840c.f20303b;
        Class cls6 = this.f175844g;
        Class cls7 = this.f175848k;
        C28008c c28008c = (C28008c) c0223l1.f746j;
        C33911j c33911j = (C33911j) c28008c.f112942b.getAndSet(null);
        if (c33911j == null) {
            c33911j = new C33911j();
        }
        c33911j.m107265a(cls5, cls6, cls7);
        synchronized (c28008c.f112941a) {
            c40799x = (C40799x) c28008c.f112941a.get(c33911j);
        }
        c28008c.f112942b.set(c33911j);
        ((C28008c) c0223l1.f746j).getClass();
        if (C28008c.f112940c.equals(c40799x)) {
            return null;
        }
        if (c40799x != null) {
            return c40799x;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls8 : ((C5101l0) c0223l1.f740d).m16041U(cls5, cls6)) {
            for (Class cls9 : ((C22677k0) c0223l1.f743g).m65768i(cls8, cls7)) {
                C5101l0 c5101l0 = (C5101l0) c0223l1.f740d;
                synchronized (c5101l0) {
                    arrayList = new ArrayList();
                    Iterator it = ((ArrayList) c5101l0.f21443x).iterator();
                    while (it.hasNext()) {
                        List<C28009d> list = (List) ((HashMap) c5101l0.f21444y).get((String) it.next());
                        if (list != null) {
                            for (C28009d c28009d : list) {
                                if (c28009d.f112943a.isAssignableFrom(cls5) && cls8.isAssignableFrom(c28009d.f112944b)) {
                                    arrayList.add(c28009d.f112945c);
                                }
                            }
                        }
                    }
                }
                C22677k0 c22677k0 = (C22677k0) c0223l1.f743g;
                synchronized (c22677k0) {
                    if (cls9.isAssignableFrom(cls8)) {
                        interfaceC24498a = C24500c.f95557x;
                    } else {
                        Iterator it3 = c22677k0.f89339a.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                            }
                            C24499b c24499b = (C24499b) it3.next();
                            if (c24499b.f95554a.isAssignableFrom(cls8) && cls9.isAssignableFrom(c24499b.f95555b)) {
                                interfaceC24498a = c24499b.f95556c;
                                break;
                            }
                            cls5 = cls;
                        }
                    }
                }
                arrayList2.add(new C40785j(cls5, cls8, cls9, arrayList, interfaceC24498a, (C31983m2) c0223l1.f747k));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList2.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c40799x2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c40799x2 = new C40799x(cls2, cls3, cls4, arrayList2, (C31983m2) c0223l1.f747k);
        }
        C28008c c28008c2 = (C28008c) c0223l1.f746j;
        synchronized (c28008c2.f112941a) {
            c28008c2.f112941a.put(new C33911j(cls2, cls3, cls4), c40799x2 != null ? c40799x2 : C28008c.f112940c);
        }
        return c40799x2;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC37325c m132269d(Object obj) {
        InterfaceC37325c interfaceC37325c;
        C28007b c28007b = (C28007b) this.f175840c.f20303b.f739c;
        Class<?> cls = obj.getClass();
        synchronized (c28007b) {
            for (C28006a c28006a : c28007b.f112939w) {
                if (c28006a.f112937a.isAssignableFrom(cls)) {
                    interfaceC37325c = c28006a.f112938b;
                }
            }
            interfaceC37325c = null;
        }
        if (interfaceC37325c != null) {
            return interfaceC37325c;
        }
        throw new Registry$NoSourceEncoderAvailableException(AbstractC11266d.m30459m(obj.getClass(), "Failed to find source encoder for data class: "));
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC37334l m132270e(Class cls) {
        InterfaceC37334l interfaceC37334l = (InterfaceC37334l) this.f175847j.get(cls);
        if (interfaceC37334l == null) {
            for (Map.Entry entry : this.f175847j.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC37334l = (InterfaceC37334l) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC37334l != null) {
            return interfaceC37334l;
        }
        if (!this.f175847j.isEmpty() || !this.f175854q) {
            return C14555a.f53195b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
