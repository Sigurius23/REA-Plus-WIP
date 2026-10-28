package qj0;

import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import mj0.InterfaceC25614c;
import nj0.InterfaceC26750f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qj0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lmj0/d;", "id", "Lnj0/f;", "protocol", "Lmj0/c;", "initialState", "Lbc3/z;", "threadSafeDispatcher", "Lqj0/h;", "a", "(Ljava/lang/String;Lnj0/f;Lmj0/c;Lbc3/z;)Lqj0/h;", "b", "()Lbc3/z;", "whoop-ble_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30427i {
    /* JADX INFO: renamed from: a */
    public static final AbstractC30426h m93039a(String id4, InterfaceC26750f protocol, InterfaceC25614c initialState, AbstractC3076z threadSafeDispatcher) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(protocol, "protocol");
        AbstractC22676k.m65750j(initialState, "initialState");
        AbstractC22676k.m65750j(threadSafeDispatcher, "threadSafeDispatcher");
        if (protocol instanceof InterfaceC26750f.b) {
            return new C30424f(id4, (InterfaceC26750f.b) protocol, initialState, threadSafeDispatcher, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC3076z m93040b() {
        return AbstractC3076z.limitedParallelism$default(AbstractC3050q0.f12077a, 1, null, 2, null);
    }
}
