package ec3;

import fc3.AbstractC14370a;
import fc3.AbstractC14371b;
import fc3.AbstractC14372c;
import java.util.concurrent.atomic.AtomicReference;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: ec3.i2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13049i2 extends AbstractC14372c {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f45101a = new AtomicReference(null);

    @Override // fc3.AbstractC14372c
    /* JADX INFO: renamed from: a */
    public final boolean mo36572a(AbstractC14370a abstractC14370a) {
        AtomicReference atomicReference = this.f45101a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(AbstractC13091v.f45234d);
        return true;
    }

    @Override // fc3.AbstractC14372c
    /* JADX INFO: renamed from: b */
    public final InterfaceC30057d[] mo36573b(AbstractC14370a abstractC14370a) {
        this.f45101a.set(null);
        return AbstractC14371b.f52476a;
    }
}
