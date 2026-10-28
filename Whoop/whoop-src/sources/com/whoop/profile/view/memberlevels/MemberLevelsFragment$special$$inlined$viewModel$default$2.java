package com.whoop.profile.view.memberlevels;

import android.content.ComponentCallbacks;
import c93.InterfaceC4339a;
import com.whoop.profile.presentation.memberlevels.MemberLevelsViewModel;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22680m;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class MemberLevelsFragment$special$$inlined$viewModel$default$2 extends AbstractC22680m implements InterfaceC4339a {
    final /* synthetic */ InterfaceC4339a $owner;
    final /* synthetic */ InterfaceC4339a $parameters;
    final /* synthetic */ InterfaceC35951a $qualifier;
    final /* synthetic */ ComponentCallbacks $this_viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberLevelsFragment$special$$inlined$viewModel$default$2(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
        super(0);
        this.$this_viewModel = componentCallbacks;
        this.$qualifier = interfaceC35951a;
        this.$owner = interfaceC4339a;
        this.$parameters = interfaceC4339a2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, com.whoop.profile.presentation.memberlevels.MemberLevelsViewModel] */
    @Override // c93.InterfaceC4339a
    public final MemberLevelsViewModel invoke() {
        return AbstractC34132o.m107857B(this.$this_viewModel, this.$qualifier, AbstractC22671h0.f89337a.getOrCreateKotlinClass(MemberLevelsViewModel.class), this.$owner, this.$parameters);
    }
}
