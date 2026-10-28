package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiChannelListHeaderViewBinding implements InterfaceC13008a {
    public final ImageView actionButton;
    public final ConstraintLayout channelListHeader;
    public final ProgressBar offlineProgressBar;
    public final TextView offlineTextView;
    public final LinearLayout offlineTitleContainer;
    public final TextView onlineTextView;
    private final ConstraintLayout rootView;
    public final View separator;
    public final UserAvatarView userAvatarView;

    private StreamUiChannelListHeaderViewBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, ProgressBar progressBar, TextView textView, LinearLayout linearLayout, TextView textView2, View view, UserAvatarView userAvatarView) {
        this.rootView = constraintLayout;
        this.actionButton = imageView;
        this.channelListHeader = constraintLayout2;
        this.offlineProgressBar = progressBar;
        this.offlineTextView = textView;
        this.offlineTitleContainer = linearLayout;
        this.onlineTextView = textView2;
        this.separator = view;
        this.userAvatarView = userAvatarView;
    }

    public static StreamUiChannelListHeaderViewBinding bind(View view) {
        View viewM108203J;
        int i13 = C19469R.id.actionButton;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i13 = C19469R.id.offlineProgressBar;
            ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i13);
            if (progressBar != null) {
                i13 = C19469R.id.offlineTextView;
                TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView != null) {
                    i13 = C19469R.id.offlineTitleContainer;
                    LinearLayout linearLayout = (LinearLayout) AbstractC34235f.m108203J(view, i13);
                    if (linearLayout != null) {
                        i13 = C19469R.id.onlineTextView;
                        TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                        if (textView2 != null && (viewM108203J = AbstractC34235f.m108203J(view, (i13 = C19469R.id.separator))) != null) {
                            i13 = C19469R.id.userAvatarView;
                            UserAvatarView userAvatarView = (UserAvatarView) AbstractC34235f.m108203J(view, i13);
                            if (userAvatarView != null) {
                                return new StreamUiChannelListHeaderViewBinding(constraintLayout, imageView, constraintLayout, progressBar, textView, linearLayout, textView2, viewM108203J, userAvatarView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiChannelListHeaderViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiChannelListHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_channel_list_header_view, viewGroup, false);
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
