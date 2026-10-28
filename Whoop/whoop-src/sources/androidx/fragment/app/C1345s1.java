package androidx.fragment.app;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.InterfaceC1563a2;
import p114eb.C12942b0;
import p360o8.C27653e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.fragment.app.s1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1345s1 implements InterfaceC1563a2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5798a;

    public /* synthetic */ C1345s1(int i13) {
        this.f5798a = i13;
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final AbstractC1637w1 create(Class modelClass) {
        switch (this.f5798a) {
            case 0:
                return new C1348t1(true);
            case 1:
                AbstractC22676k.m65750j(modelClass, "modelClass");
                return new C12942b0();
            default:
                return new C27653e();
        }
    }
}
