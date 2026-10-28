package p076d;

import java.io.ByteArrayOutputStream;
import ro.C31624i;

/* JADX INFO: renamed from: d.b1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC11272b1 implements InterfaceC11307q {
    /* JADX INFO: renamed from: c */
    public abstract int mo30479c(boolean z4);

    @Override // p076d.InterfaceC11307q
    /* JADX INFO: renamed from: d */
    public final AbstractC11272b1 mo30482d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC11307q) && mo30474g(((InterfaceC11307q) obj).mo30482d());
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo30480f(C31624i c31624i, boolean z4);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo30474g(AbstractC11272b1 abstractC11272b1);

    /* JADX INFO: renamed from: h */
    public abstract boolean mo30475h();

    public abstract int hashCode();

    /* JADX INFO: renamed from: i */
    public final byte[] m30483i() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mo30476j().mo30480f(new C11309r(byteArrayOutputStream, 19), true);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: j */
    public AbstractC11272b1 mo30476j() {
        return this;
    }

    /* JADX INFO: renamed from: k */
    public AbstractC11272b1 mo30477k() {
        return this;
    }
}
