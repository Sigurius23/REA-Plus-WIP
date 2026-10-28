package p026b2;

import androidx.compose.p018ui.Modifier;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: b2.u */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2315u extends Modifier {
    @Override // androidx.compose.p018ui.Modifier
    /* JADX INFO: renamed from: a */
    default Object mo3469a(Object obj, InterfaceC4351m interfaceC4351m) {
        return interfaceC4351m.invoke(obj, this);
    }

    @Override // androidx.compose.p018ui.Modifier
    /* JADX INFO: renamed from: c */
    default boolean mo3470c(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }
}
