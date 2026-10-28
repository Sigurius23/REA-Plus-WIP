package io.getstream.chat.android.p226ui.feature.channels.list;

import android.content.Context;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.p226ui.viewmodel.channels.ChannelListViewModel;
import io.getstream.chat.android.p226ui.viewmodel.channels.ChannelListViewModelBinding;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.channels.list.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19643b implements ChannelListView.ChannelClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f74497a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ChannelListView f74498b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f74499c;

    public /* synthetic */ C19643b(Context context, ChannelListView channelListView) {
        this.f74499c = context;
        this.f74498b = channelListView;
    }

    @Override // io.getstream.chat.android.ui.feature.channels.list.ChannelListView.ChannelClickListener
    public final void onClick(Channel channel) {
        switch (this.f74497a) {
            case 0:
                ChannelListView.configureDefaultMoreOptionsListener$lambda$14((Context) this.f74499c, this.f74498b, channel);
                break;
            default:
                ChannelListViewModelBinding.bindView$lambda$11(this.f74498b, (ChannelListViewModel) this.f74499c, channel);
                break;
        }
    }

    public /* synthetic */ C19643b(ChannelListView channelListView, ChannelListViewModel channelListViewModel) {
        this.f74498b = channelListView;
        this.f74499c = channelListViewModel;
    }
}
