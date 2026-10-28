package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.feature.channels.header.ChannelListHeaderView;
import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListView;
import io.getstream.chat.android.p226ui.feature.search.SearchInputView;
import io.getstream.chat.android.p226ui.feature.search.list.SearchResultListView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiFragmentChannelListBinding implements InterfaceC13008a {
    public final ChannelListHeaderView channelListHeaderView;
    public final ChannelListView channelListView;
    private final ConstraintLayout rootView;
    public final SearchInputView searchInputView;
    public final SearchResultListView searchResultListView;

    private StreamUiFragmentChannelListBinding(ConstraintLayout constraintLayout, ChannelListHeaderView channelListHeaderView, ChannelListView channelListView, SearchInputView searchInputView, SearchResultListView searchResultListView) {
        this.rootView = constraintLayout;
        this.channelListHeaderView = channelListHeaderView;
        this.channelListView = channelListView;
        this.searchInputView = searchInputView;
        this.searchResultListView = searchResultListView;
    }

    public static StreamUiFragmentChannelListBinding bind(View view) {
        int i13 = C19469R.id.channelListHeaderView;
        ChannelListHeaderView channelListHeaderView = (ChannelListHeaderView) AbstractC34235f.m108203J(view, i13);
        if (channelListHeaderView != null) {
            i13 = C19469R.id.channelListView;
            ChannelListView channelListView = (ChannelListView) AbstractC34235f.m108203J(view, i13);
            if (channelListView != null) {
                i13 = C19469R.id.searchInputView;
                SearchInputView searchInputView = (SearchInputView) AbstractC34235f.m108203J(view, i13);
                if (searchInputView != null) {
                    i13 = C19469R.id.searchResultListView;
                    SearchResultListView searchResultListView = (SearchResultListView) AbstractC34235f.m108203J(view, i13);
                    if (searchResultListView != null) {
                        return new StreamUiFragmentChannelListBinding((ConstraintLayout) view, channelListHeaderView, channelListView, searchInputView, searchResultListView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiFragmentChannelListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiFragmentChannelListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_fragment_channel_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }
}
