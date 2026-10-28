package p429ql;

import ih0.AbstractC18489d0;
import pl.C29342e;
import tl.AbstractC33913l;

/* JADX INFO: renamed from: ql.g */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC30461g extends AbstractC30455a {

    /* JADX INFO: renamed from: x */
    private final int f125170x = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: y */
    private final int f125171y = Integer.MIN_VALUE;

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: a */
    public void mo15539a(InterfaceC30462h interfaceC30462h) {
    }

    @Override // p429ql.InterfaceC30463i
    /* JADX INFO: renamed from: h */
    public final void mo15544h(InterfaceC30462h interfaceC30462h) throws Throwable {
        if (AbstractC33913l.m107273h(this.f125170x, this.f125171y)) {
            ((C29342e) interfaceC30462h).m89342l(this.f125170x, this.f125171y);
        } else {
            StringBuilder sb4 = new StringBuilder("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
            sb4.append(this.f125170x);
            sb4.append(" and height: ");
            throw new IllegalArgumentException(AbstractC18489d0.m53371l(sb4, this.f125171y, ", either provide dimensions in the constructor or call override()"));
        }
    }
}
