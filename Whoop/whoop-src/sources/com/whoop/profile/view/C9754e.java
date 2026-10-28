package com.whoop.profile.view;

import androidx.compose.runtime.Composer;
import p040c0.InterfaceC3747i0;
import p291l0.InterfaceC23013y;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import rm1.AbstractC31594h;

/* JADX INFO: renamed from: com.whoop.profile.view.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9754e implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28385w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f28386x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f28387y;

    public /* synthetic */ C9754e(Function1 function1, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f28385w = i13;
        this.f28386x = function1;
        this.f28387y = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f28385w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return ProfileScreenKt.ProfileOverflowMenu$lambda$3$1$1(this.f28386x, this.f28387y, (InterfaceC23013y) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC31594h.m97406I(this.f28386x, this.f28387y, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue2);
        }
    }
}
