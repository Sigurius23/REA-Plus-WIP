package v63;

import p715kotlin.jvm.internal.AbstractC22676k;
import w63.C36866a;
import x63.InterfaceC38034f;

/* JADX INFO: renamed from: v63.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C35747e extends AbstractC35749g {

    /* JADX INFO: renamed from: H */
    public static final C35747e f152026H = new C35747e(C36866a.f157703m, 0, C36866a.f157702l);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35747e(C36866a head, long j7, InterfaceC38034f pool) {
        super(head, j7, pool);
        AbstractC22676k.m65750j(head, "head");
        AbstractC22676k.m65750j(pool, "pool");
        if (this.f152031G) {
            return;
        }
        this.f152031G = true;
    }

    public final String toString() {
        return "ByteReadPacket(" + m113270s() + " bytes remaining)";
    }
}
