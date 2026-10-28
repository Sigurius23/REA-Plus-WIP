package ya3;

import lb3.InterfaceC23796q0;
import mb3.InterfaceC25386c;

/* JADX INFO: renamed from: ya3.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C39367j implements InterfaceC25386c {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m125546b(int i13) {
        Object[] objArr = new Object[3];
        if (i13 != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // mb3.InterfaceC25386c
    /* JADX INFO: renamed from: a */
    public final boolean mo39748a(InterfaceC23796q0 interfaceC23796q0, InterfaceC23796q0 interfaceC23796q1) {
        if (interfaceC23796q0 == null) {
            m125546b(0);
            throw null;
        }
        if (interfaceC23796q1 != null) {
            return interfaceC23796q0.equals(interfaceC23796q1);
        }
        m125546b(1);
        throw null;
    }
}
