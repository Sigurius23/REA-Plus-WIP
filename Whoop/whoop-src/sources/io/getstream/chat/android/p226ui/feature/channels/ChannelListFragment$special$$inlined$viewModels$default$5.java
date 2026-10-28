package io.getstream.chat.android.p226ui.feature.channels;

import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.InterfaceC1563a2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1620r;
import c93.InterfaceC4339a;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "VM", "Landroidx/lifecycle/a2;", "invoke", "()Landroidx/lifecycle/a2;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class ChannelListFragment$special$$inlined$viewModels$default$5 extends AbstractC22680m implements InterfaceC4339a {
    final /* synthetic */ InterfaceC23462h $owner$delegate;
    final /* synthetic */ AbstractComponentCallbacksC1320m0 $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelListFragment$special$$inlined$viewModels$default$5(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC23462h interfaceC23462h) {
        super(0);
        this.$this_viewModels = abstractComponentCallbacksC1320m0;
        this.$owner$delegate = interfaceC23462h;
    }

    @Override // c93.InterfaceC4339a
    public final InterfaceC1563a2 invoke() {
        InterfaceC1563a2 defaultViewModelProviderFactory;
        InterfaceC1583f2 interfaceC1583f2 = (InterfaceC1583f2) this.$owner$delegate.getValue();
        InterfaceC1620r interfaceC1620r = interfaceC1583f2 instanceof InterfaceC1620r ? (InterfaceC1620r) interfaceC1583f2 : null;
        return (interfaceC1620r == null || (defaultViewModelProviderFactory = interfaceC1620r.getDefaultViewModelProviderFactory()) == null) ? this.$this_viewModels.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
    }
}
