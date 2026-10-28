package p335n6;

import c93.InterfaceC4351m;
import ov2.C28402f;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: n6.o */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC26398o {
    /* JADX INFO: renamed from: a */
    Object mo78097a(Object obj, InterfaceC4351m interfaceC4351m);

    /* JADX INFO: renamed from: b */
    boolean mo78098b(C28402f c28402f);

    /* JADX INFO: renamed from: c */
    boolean mo78099c(Function1 function1);

    /* JADX INFO: renamed from: d */
    default InterfaceC26398o mo78107d(InterfaceC26398o interfaceC26398o) {
        return interfaceC26398o == C26396m.f104850a ? this : new C26390g(this, interfaceC26398o);
    }
}
