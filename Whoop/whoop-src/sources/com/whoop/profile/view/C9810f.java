package com.whoop.profile.view;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import ge0.AbstractC15730e;
import jp1.AbstractC21861m;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import qu2.AbstractC30640h;

/* JADX INFO: renamed from: com.whoop.profile.view.f */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9810f implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28555w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f28556x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f28557y;

    public /* synthetic */ C9810f(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        this.f28555w = 1;
        this.f28556x = function1;
        this.f28557y = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28555w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ProfileScreenKt.ProfileOverflowMenu$lambda$3$1(this.f28557y, this.f28556x, (Composer) obj, iIntValue);
            case 1:
                return AbstractC15730e.m44329n(this.f28556x, this.f28557y, (String) obj, (Long) obj2);
            case 2:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC21861m.m61923o(this.f28557y, this.f28556x, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC30640h.m94107Z0(this.f28557y, this.f28556x, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C9810f(InterfaceC28601c1 interfaceC28601c1, Function1 function1, int i13) {
        this.f28555w = i13;
        this.f28557y = interfaceC28601c1;
        this.f28556x = function1;
    }
}
