package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiChannelListItemViewBinding implements InterfaceC13008a {
    public final FrameLayout channelItemView;
    public final StreamUiChannelListItemBackgroundViewBinding itemBackgroundView;
    public final StreamUiChannelListItemForegroundViewBinding itemForegroundView;
    private final FrameLayout rootView;

    private StreamUiChannelListItemViewBinding(FrameLayout frameLayout, FrameLayout frameLayout2, StreamUiChannelListItemBackgroundViewBinding streamUiChannelListItemBackgroundViewBinding, StreamUiChannelListItemForegroundViewBinding streamUiChannelListItemForegroundViewBinding) {
        this.rootView = frameLayout;
        this.channelItemView = frameLayout2;
        this.itemBackgroundView = streamUiChannelListItemBackgroundViewBinding;
        this.itemForegroundView = streamUiChannelListItemForegroundViewBinding;
    }

    public static StreamUiChannelListItemViewBinding bind(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i13 = C19469R.id.itemBackgroundView;
        View viewM108203J = AbstractC34235f.m108203J(view, i13);
        if (viewM108203J != null) {
            StreamUiChannelListItemBackgroundViewBinding streamUiChannelListItemBackgroundViewBindingBind = StreamUiChannelListItemBackgroundViewBinding.bind(viewM108203J);
            int i14 = C19469R.id.itemForegroundView;
            View viewM108203J2 = AbstractC34235f.m108203J(view, i14);
            if (viewM108203J2 != null) {
                return new StreamUiChannelListItemViewBinding(frameLayout, frameLayout, streamUiChannelListItemBackgroundViewBindingBind, StreamUiChannelListItemForegroundViewBinding.bind(viewM108203J2));
            }
            i13 = i14;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiChannelListItemViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiChannelListItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_channel_list_item_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final FrameLayout getRoot() {
        return this.rootView;
    }
}
