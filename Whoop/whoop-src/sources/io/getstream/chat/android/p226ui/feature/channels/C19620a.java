package io.getstream.chat.android.p226ui.feature.channels;

import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.feature.channels.header.ChannelListHeaderView;
import io.getstream.chat.android.p226ui.feature.search.SearchInputView;
import io.getstream.chat.android.p226ui.feature.search.list.SearchResultListView;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.channels.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19620a implements ChannelListHeaderView.ActionButtonClickListener, ChannelListHeaderView.UserAvatarClickListener, SearchResultListView.SearchResultSelectedListener, SearchInputView.InputChangedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ChannelListFragment f74474a;

    public /* synthetic */ C19620a(ChannelListFragment channelListFragment) {
        this.f74474a = channelListFragment;
    }

    @Override // io.getstream.chat.android.ui.feature.channels.header.ChannelListHeaderView.ActionButtonClickListener
    public void onClick() {
        ChannelListFragment.m55092y(this.f74474a);
    }

    @Override // io.getstream.chat.android.ui.feature.search.SearchInputView.InputChangedListener
    public void onInputChanged(String str) {
        ChannelListFragment.setupSearchInput$lambda$14$lambda$12(this.f74474a, str);
    }

    @Override // io.getstream.chat.android.ui.feature.search.list.SearchResultListView.SearchResultSelectedListener
    public void onSearchResultSelected(Message message) {
        ChannelListFragment.setupSearchResultList$lambda$16$lambda$15(this.f74474a, message);
    }

    @Override // io.getstream.chat.android.ui.feature.channels.header.ChannelListHeaderView.UserAvatarClickListener
    public void onUserAvatarClick() {
        ChannelListFragment.m55089B(this.f74474a);
    }
}
