package wa3;

import java.io.Serializable;
import java.util.Collections;

/* JADX INFO: renamed from: wa3.p */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC37012p extends AbstractC36984b implements Serializable {
    /* JADX INFO: renamed from: g */
    public static C37010o m118827g(InterfaceC37019v interfaceC37019v, InterfaceC37019v interfaceC37019v2, int i13, EnumC37011o0 enumC37011o0, Class cls) {
        return new C37010o(interfaceC37019v, Collections.EMPTY_LIST, interfaceC37019v2, new C37008n(i13, enumC37011o0, true), cls);
    }

    /* JADX INFO: renamed from: h */
    public static C37010o m118828h(InterfaceC37019v interfaceC37019v, Object obj, InterfaceC37019v interfaceC37019v2, int i13, EnumC37011o0 enumC37011o0, Class cls) {
        return new C37010o(interfaceC37019v, obj, interfaceC37019v2, new C37008n(i13, enumC37011o0, false), cls);
    }
}
