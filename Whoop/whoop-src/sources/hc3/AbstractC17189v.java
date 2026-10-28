package hc3;

import androidx.profileinstaller.ProfileVerifier;
import bc3.InterfaceC2988a2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: hc3.v */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17189v extends AbstractC17169c implements InterfaceC2988a2 {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f66006z = AtomicIntegerFieldUpdater.newUpdater(AbstractC17189v.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: y */
    public final long f66007y;

    public AbstractC17189v(long j7, AbstractC17189v abstractC17189v, int i13) {
        super(abstractC17189v);
        this.f66007y = j7;
        this.cleanedAndPointers$volatile = i13 << 16;
    }

    @Override // hc3.AbstractC17169c
    /* JADX INFO: renamed from: d */
    public final boolean mo48494d() {
        return f66006z.get(this) == mo32227g() && m48493c() != null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m48542f() {
        return f66006z.addAndGet(this, -65536) == mo32227g() && m48493c() != null;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo32227g();

    /* JADX INFO: renamed from: h */
    public abstract void mo32228h(int i13, InterfaceC30063j interfaceC30063j);

    /* JADX INFO: renamed from: i */
    public final void m48543i() {
        if (f66006z.incrementAndGet(this) == mo32227g()) {
            m48495e();
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m48544j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i13;
        do {
            atomicIntegerFieldUpdater = f66006z;
            i13 = atomicIntegerFieldUpdater.get(this);
            if (i13 == mo32227g() && m48493c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i13, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST + i13));
        return true;
    }
}
