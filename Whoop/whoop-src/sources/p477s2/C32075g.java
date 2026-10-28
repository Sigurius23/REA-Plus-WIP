package p477s2;

import android.view.KeyEvent;
import p026b2.AbstractC2316v;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: s2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C32075g extends AbstractC2316v implements InterfaceC32074f {

    /* JADX INFO: renamed from: O */
    public Function1 f133020O;

    /* JADX INFO: renamed from: P */
    public Function1 f133021P;

    @Override // p477s2.InterfaceC32074f
    /* JADX INFO: renamed from: Q */
    public final boolean mo39148Q(KeyEvent keyEvent) {
        Function1 function1 = this.f133021P;
        if (function1 != null) {
            return ((Boolean) function1.invoke(C32071c.m99690a(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // p477s2.InterfaceC32074f
    /* JADX INFO: renamed from: Z */
    public final boolean mo39149Z(KeyEvent keyEvent) {
        Function1 function1 = this.f133020O;
        if (function1 != null) {
            return ((Boolean) function1.invoke(C32071c.m99690a(keyEvent))).booleanValue();
        }
        return false;
    }
}
