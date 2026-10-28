package com.whoop.bot.settings;

import android.content.ComponentCallbacks;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import jf3.C21647a;
import p399pb.InterfaceC29049f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class CoachSettingsFragment$special$$inlined$viewModel$default$1 extends AbstractC22680m implements InterfaceC4339a {
    final /* synthetic */ ComponentCallbacks $this_viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoachSettingsFragment$special$$inlined$viewModel$default$1(ComponentCallbacks componentCallbacks) {
        super(0);
        this.$this_viewModel = componentCallbacks;
    }

    @Override // c93.InterfaceC4339a
    public final C21647a invoke() {
        ComponentCallbacks componentCallbacks = this.$this_viewModel;
        InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
        InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
        AbstractC22676k.m65750j(storeOwner, "storeOwner");
        C1579e2 viewModelStore = storeOwner.getViewModelStore();
        AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
        return new C21647a(viewModelStore, interfaceC29049f);
    }
}
