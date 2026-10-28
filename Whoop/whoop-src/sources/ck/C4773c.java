package ck;

import com.google.crypto.tink.internal.C5101l0;
import fj.C14525a;
import fj.C14526b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import m83.AbstractC25247g0;
import p173gj.C15903d;
import p255jk.C21743a;
import p282kk.EnumC22535d;
import p282kk.InterfaceC22536e;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29203o;
import pk.C29327a;
import pk.C29328b;
import pk.C29329c;
import pk.EnumC29330d;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: ck.c */
/* JADX INFO: loaded from: classes.dex */
public final class C4773c implements InterfaceC22536e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19660w;

    /* JADX INFO: renamed from: x */
    public Object f19661x;

    public /* synthetic */ C4773c(int i13) {
        this.f19660w = i13;
    }

    @Override // p282kk.InterfaceC22536e
    /* JADX INFO: renamed from: a */
    public final C21743a mo15042a(C21743a c21743a) {
        C29328b c29328b;
        switch (this.f19660w) {
            case 0:
                LinkedHashMap linkedHashMap = c21743a.f83626O;
                if (linkedHashMap != null && !linkedHashMap.isEmpty() && !AbstractC22676k.m65745e(c21743a.mo61353a(), "$exposure")) {
                    HashMap map = new HashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof Map) {
                            try {
                                map.put(str, (Map) value);
                            } catch (ClassCastException e5) {
                                e5.printStackTrace();
                            }
                        }
                    }
                    C14525a c14525a = (C14525a) this.f19661x;
                    if (c14525a == null) {
                        AbstractC22676k.m65757q("connector");
                        throw null;
                    }
                    C41113q c41113q = c14525a.f53074a;
                    ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) c41113q.f177224x).readLock();
                    lock.lock();
                    try {
                        C14526b c14526b = (C14526b) c41113q.f177225y;
                        lock.unlock();
                        String str2 = c14526b.f53076a;
                        String str3 = c14526b.f53077b;
                        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(c14526b.f53078c);
                        for (Map.Entry entry2 : map.entrySet()) {
                            String str4 = (String) entry2.getKey();
                            Map map2 = (Map) entry2.getValue();
                            int iHashCode = str4.hashCode();
                            if (iHashCode != 1186238) {
                                if (iHashCode != 146417720) {
                                    if (iHashCode == 1142092165 && str4.equals("$unset")) {
                                        Iterator it = map2.entrySet().iterator();
                                        while (it.hasNext()) {
                                            linkedHashMapM74003l0.remove(((Map.Entry) it.next()).getKey());
                                        }
                                    }
                                } else if (str4.equals("$clearAll")) {
                                    linkedHashMapM74003l0.clear();
                                }
                            } else if (str4.equals("$set")) {
                                linkedHashMapM74003l0.putAll(map2);
                            }
                        }
                        c41113q.m133456H(new C14526b(str2, str3, linkedHashMapM74003l0));
                    } catch (Throwable th3) {
                        lock.unlock();
                        throw th3;
                    }
                }
                return c21743a;
            default:
                if (c21743a.f83626O != null) {
                    C29203o c29203o = (C29203o) this.f19661x;
                    if (c29203o == null) {
                        AbstractC22676k.m65757q("eventBridge");
                        throw null;
                    }
                    EnumC29330d enumC29330d = EnumC29330d.f118789w;
                    C29327a c29327a = new C29327a(c21743a.mo61353a(), c21743a.f83625N, c21743a.f83626O, c21743a.f83627P, c21743a.f83628Q);
                    synchronized (c29203o.f118198w) {
                        try {
                            LinkedHashMap linkedHashMap2 = (LinkedHashMap) c29203o.f118199x;
                            Object c29328b2 = linkedHashMap2.get(enumC29330d);
                            if (c29328b2 == null) {
                                c29328b2 = new C29328b();
                                linkedHashMap2.put(enumC29330d, c29328b2);
                            }
                            c29328b = (C29328b) c29328b2;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    synchronized (c29328b.f118784a) {
                        c29328b.f118785b.offer(c29327a);
                    }
                }
                return c21743a;
        }
    }

    @Override // p282kk.InterfaceC22536e
    /* JADX INFO: renamed from: b */
    public final void mo15043b(C15903d c15903d) {
        ArrayList arrayList;
        C29329c c29329c;
        switch (this.f19660w) {
            case 0:
                String str = c15903d.f60128a.f60156e;
                Object obj = C14525a.f53072c;
                C14525a c14525aM92135z = AbstractC30060g.m92135z(str);
                this.f19661x = c14525aM92135z;
                C5101l0 c5101l0 = c14525aM92135z.f53075b;
                C4772b c4772b = new C4772b(1);
                synchronized (c5101l0.f21443x) {
                    arrayList = new ArrayList();
                    ((ArrayBlockingQueue) c5101l0.f21444y).drainTo(arrayList);
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    c4772b.invoke(null);
                    throw null;
                }
                return;
            default:
                Object obj2 = C29329c.f118786b;
                String instanceName = c15903d.f60128a.f60156e;
                AbstractC22676k.m65750j(instanceName, "instanceName");
                synchronized (C29329c.f118786b) {
                    try {
                        LinkedHashMap linkedHashMap = C29329c.f118787c;
                        Object c29329c2 = linkedHashMap.get(instanceName);
                        if (c29329c2 == null) {
                            c29329c2 = new C29329c();
                            linkedHashMap.put(instanceName, c29329c2);
                        }
                        c29329c = (C29329c) c29329c2;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                this.f19661x = c29329c.f118788a;
                return;
        }
    }

    @Override // p282kk.InterfaceC22536e
    public final EnumC22535d getType() {
        switch (this.f19660w) {
            case 0:
                break;
        }
        return EnumC22535d.f88573w;
    }
}
