package pt2;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import ot2.AbstractC28344m;
import p291l0.InterfaceC23013y;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: pt2.q */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C29535q implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f120272w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f120273x;

    public /* synthetic */ C29535q(Object obj, int i13) {
        this.f120272w = i13;
        this.f120273x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f120272w) {
            case 0:
                return AbstractC29540v.m90438p0((InterfaceC28601c1) this.f120273x, (InterfaceC23013y) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return AbstractC29540v.m90448u0((AbstractC28344m.i) this.f120273x, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
