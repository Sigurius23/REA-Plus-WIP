package com.whoop.profile.view.edit.avatar;

import java.time.LocalDate;
import nw0.AbstractC27208o;
import p390p1.InterfaceC28601c1;
import p704dk2.AbstractC12123j;
import p715kotlin.jvm.functions.Function1;
import ve0.AbstractC35927e;

/* JADX INFO: renamed from: com.whoop.profile.view.edit.avatar.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9768a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28392w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f28393x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f28394y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28601c1 f28395z;

    public /* synthetic */ C9768a(Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f28392w = i13;
        this.f28393x = function1;
        this.f28394y = function2;
        this.f28395z = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f28392w) {
            case 0:
                return AvatarEditBottomSheetContentKt.AvatarEditBottomSheetContent$lambda$5$0(this.f28393x, this.f28394y, this.f28395z, ((Boolean) obj).booleanValue());
            case 1:
                return AbstractC12123j.m33533G(this.f28393x, this.f28394y, this.f28395z, (LocalDate) obj);
            case 2:
                return AbstractC27208o.m81906R(this.f28393x, this.f28394y, this.f28395z, obj);
            default:
                return AbstractC35927e.m114115N(this.f28393x, this.f28394y, this.f28395z, obj);
        }
    }
}
