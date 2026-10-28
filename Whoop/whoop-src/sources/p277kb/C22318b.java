package p277kb;

import g73.C15553a;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import qg3.C30352d;

/* JADX INFO: renamed from: kb.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C22318b {

    /* JADX INFO: renamed from: c */
    public static final C15553a f87090c = new C15553a(17);

    /* JADX INFO: renamed from: d */
    public static final LinkedHashMap f87091d = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final ReentrantLock f87092a;

    /* JADX INFO: renamed from: b */
    public final C30352d f87093b;

    public C22318b(String str, boolean z4) {
        ReentrantLock reentrantLock;
        synchronized (f87090c) {
            try {
                LinkedHashMap linkedHashMap = f87091d;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f87092a = reentrantLock;
        this.f87093b = z4 ? new C30352d(str) : null;
    }
}
