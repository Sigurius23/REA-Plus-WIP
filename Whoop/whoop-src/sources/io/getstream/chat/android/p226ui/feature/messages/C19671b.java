package io.getstream.chat.android.p226ui.feature.messages;

import io.getstream.chat.android.p226ui.common.state.messages.MessageMode;
import io.getstream.chat.android.p226ui.viewmodel.messages.MessageListViewModel;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19671b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74520w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ChannelFragment f74521x;

    public /* synthetic */ C19671b(ChannelFragment channelFragment, int i13) {
        this.f74520w = i13;
        this.f74521x = channelFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74520w) {
            case 0:
                ChannelFragment.setupMessageList$lambda$13(this.f74521x, (MessageListViewModel.State) obj);
                break;
            default:
                ChannelFragment.setupMessageComposer$lambda$15(this.f74521x, (MessageMode) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
