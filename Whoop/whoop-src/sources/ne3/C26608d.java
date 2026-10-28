package ne3;

import bd3.C3143v;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p249jc.C21565a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.d */
/* JADX INFO: loaded from: classes5.dex */
public class C26608d extends C26637r0 {

    /* JADX INFO: renamed from: h */
    public static final C3143v f105837h;

    /* JADX INFO: renamed from: i */
    public static C26608d f105838i;

    /* JADX INFO: renamed from: j */
    public static final ReentrantLock f105839j;

    /* JADX INFO: renamed from: k */
    public static final Condition f105840k;

    /* JADX INFO: renamed from: l */
    public static final long f105841l;

    /* JADX INFO: renamed from: m */
    public static final long f105842m;

    /* JADX INFO: renamed from: e */
    public int f105843e;

    /* JADX INFO: renamed from: f */
    public int f105844f = -1;

    /* JADX INFO: renamed from: g */
    public long f105845g;

    static {
        C3143v c3143v = new C3143v(7, (char) 0);
        c3143v.f12311y = new C26608d[8];
        f105837h = c3143v;
        ReentrantLock reentrantLock = new ReentrantLock();
        f105839j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        AbstractC22676k.m65749i(conditionNewCondition, "newCondition(...)");
        f105840k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f105841l = millis;
        f105842m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: renamed from: i */
    public final void m79170i() {
        long j7 = this.f105906c;
        boolean z4 = this.f105904a;
        if (j7 != 0 || z4) {
            ReentrantLock reentrantLock = f105839j;
            reentrantLock.lock();
            try {
                if (this.f105843e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f105843e = 1;
                C21565a.m60595e(this);
                reentrantLock.unlock();
            } catch (Throwable th3) {
                reentrantLock.unlock();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m79171j() {
        ReentrantLock reentrantLock = f105839j;
        reentrantLock.lock();
        try {
            int i13 = this.f105843e;
            this.f105843e = 0;
            if (i13 != 1) {
                return i13 == 2;
            }
            f105837h.m9043l(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo14147k() {
    }
}
