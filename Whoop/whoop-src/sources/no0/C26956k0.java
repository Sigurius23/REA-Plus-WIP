package no0;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import lo0.C24571b0;
import n01.C26088e;
import p291l0.InterfaceC23013y;
import p292l1.C23104h1;
import p292l1.C23204y;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: no0.k0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C26956k0 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107519w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f107520x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f107521y;

    public /* synthetic */ C26956k0(int i13, Object obj, Object obj2) {
        this.f107519w = i13;
        this.f107520x = obj;
        this.f107521y = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f107519w) {
            case 0:
                return AbstractC26958l0.m80642e0((C23104h1) this.f107520x, (C23204y) this.f107521y, (InterfaceC23013y) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                return AbstractC26962n0.m80716r((C24571b0.b.e) this.f107520x, (InterfaceC28601c1) this.f107521y, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return AbstractC26934a1.m80422d((C26088e) this.f107520x, (Function1) this.f107521y, (String) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
