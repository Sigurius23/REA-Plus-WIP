package com.whoop.profile.view;

import com.whoop.profile.presentation.ProfileEvent;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* synthetic */ class ProfileScreenKt$ProfileScreen$5$1$1 extends C22672i implements Function1 {
    public ProfileScreenKt$ProfileScreen$5$1$1(Object obj) {
        super(1, 0, ProfileScreenEventRouter.class, obj, "onProfileScreenEvent", "onProfileScreenEvent(Lcom/whoop/profile/presentation/ProfileEvent;)V");
    }

    @Override // p715kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ProfileEvent) obj);
        return C23454a0.f92919a;
    }

    public final void invoke(ProfileEvent p13) {
        AbstractC22676k.m65750j(p13, "p0");
        ((ProfileScreenEventRouter) this.receiver).onProfileScreenEvent(p13);
    }
}
