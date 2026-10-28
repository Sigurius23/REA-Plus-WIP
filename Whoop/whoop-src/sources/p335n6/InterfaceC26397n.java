package p335n6;

import c93.InterfaceC4351m;
import ov2.C28402f;
import p395p6.AbstractC28869c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: n6.n */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC26397n extends InterfaceC26398o {
    @Override // p335n6.InterfaceC26398o
    /* JADX INFO: renamed from: a */
    default Object mo78097a(Object obj, InterfaceC4351m interfaceC4351m) {
        return interfaceC4351m.invoke(obj, this);
    }

    @Override // p335n6.InterfaceC26398o
    /* JADX INFO: renamed from: b */
    default boolean mo78098b(C28402f c28402f) {
        Object obj = AbstractC28869c1.f116844a;
        return Boolean.TRUE.booleanValue();
    }

    @Override // p335n6.InterfaceC26398o
    /* JADX INFO: renamed from: c */
    default boolean mo78099c(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }
}
