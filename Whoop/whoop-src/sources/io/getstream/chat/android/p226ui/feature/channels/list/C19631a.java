package io.getstream.chat.android.p226ui.feature.channels.list;

import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.p226ui.common.state.channels.actions.ChannelAction;
import io.getstream.chat.android.p226ui.feature.channels.actions.internal.ChannelActionsDialogFragment;
import io.getstream.chat.android.p226ui.viewmodel.channels.ChannelListViewModel;
import java.util.List;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.channels.list.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19631a implements ChannelListView.ErrorEventHandler, ChannelListView.ChannelListUpdateListener, ChannelActionsDialogFragment.ChannelOptionClickListener, ChannelActionsDialogFragment.ChannelMemberClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ChannelListView f74480a;

    public /* synthetic */ C19631a(ChannelListView channelListView) {
        this.f74480a = channelListView;
    }

    @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.ChannelListUpdateListener
    public void onChannelListUpdate(List list) {
        ChannelListView.channelListUpdateListener$lambda$3(this.f74480a, list);
    }

    @Override // io.getstream.chat.android.ui.feature.channels.actions.internal.ChannelActionsDialogFragment.ChannelOptionClickListener
    public void onChannelOptionClick(ChannelAction channelAction) {
        ChannelListView.m55102xc3cf1fcb(this.f74480a, channelAction);
    }

    @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.ErrorEventHandler
    public void onErrorEvent(ChannelListViewModel.ErrorEvent errorEvent) {
        ChannelListView.errorEventHandler$lambda$1(this.f74480a, errorEvent);
    }

    @Override // io.getstream.chat.android.ui.feature.channels.actions.internal.ChannelActionsDialogFragment.ChannelMemberClickListener
    public void onMemberClick(Member member) {
        ChannelListView.m55103xc3cf1fcc(this.f74480a, member);
    }
}
