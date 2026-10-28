package p076d;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import ro.C31624i;

/* JADX INFO: renamed from: d.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C11301n extends AbstractC11272b1 {

    /* JADX INFO: renamed from: b */
    public static final C11301n f36227b = new C11301n((byte) 0);

    /* JADX INFO: renamed from: c */
    public static final C11301n f36228c = new C11301n((byte) -1);

    /* JADX INFO: renamed from: a */
    public final byte f36229a;

    public C11301n(byte b) {
        this.f36229a = b;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: c */
    public final int mo30479c(boolean z4) {
        return C31624i.m97696b(1, z4);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: f */
    public final void mo30480f(C31624i c31624i, boolean z4) throws IOException {
        c31624i.m97709n(1, z4);
        c31624i.m97705d(1);
        ((ByteArrayOutputStream) c31624i.f130665x).write(this.f36229a);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: g */
    public final boolean mo30474g(AbstractC11272b1 abstractC11272b1) {
        return (abstractC11272b1 instanceof C11301n) && m30512l() == ((C11301n) abstractC11272b1).m30512l();
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: h */
    public final boolean mo30475h() {
        return false;
    }

    @Override // p076d.AbstractC11272b1
    public final int hashCode() {
        return m30512l() ? 1 : 0;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: j */
    public final AbstractC11272b1 mo30476j() {
        return m30512l() ? f36228c : f36227b;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m30512l() {
        return this.f36229a != 0;
    }

    public final String toString() {
        return m30512l() ? "TRUE" : "FALSE";
    }
}
