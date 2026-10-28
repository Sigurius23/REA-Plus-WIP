package io.getstream.chat.android.p226ui.viewmodel.messages;

import c93.InterfaceC4339a;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import l83.C23454a0;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19938b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74865w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f74866x;

    public /* synthetic */ C19938b(Object obj, int i13) {
        this.f74865w = i13;
        this.f74866x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f74865w) {
            case 0:
                return ChannelViewModelFactory.m55714c((ChannelViewModelFactory) this.f74866x);
            case 1:
                ((InterfaceC4339a) this.f74866x).invoke();
                return C23454a0.f92919a;
            case 2:
                return MessageComposerViewModelBinder.m55717a((MessageComposerViewModelBinder) this.f74866x);
            default:
                MessageListViewModelBinding.bindView$lambda$20$lambda$19((MessageListView) this.f74866x);
                return C23454a0.f92919a;
        }
    }
}
