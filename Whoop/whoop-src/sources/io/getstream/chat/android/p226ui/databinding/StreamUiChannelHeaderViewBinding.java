package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.widgets.avatar.ChannelAvatarView;
import io.getstream.chat.android.p226ui.widgets.typing.TypingIndicatorView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiChannelHeaderViewBinding implements InterfaceC13008a {
    public final ImageView backButton;
    public final TextView backButtonBadge;
    public final ConstraintLayout backButtonContainer;
    public final ChannelAvatarView channelAvatarView;
    public final LinearLayout connectingContainer;
    public final ProgressBar connectingProgressBar;
    public final TextView connectingTextView;
    public final LinearLayout offlineContainer;
    public final TextView offlineRetryButton;
    public final TextView offlineTextView;
    public final TextView onlineTextView;
    private final ConstraintLayout rootView;
    public final View separator;
    public final FrameLayout subtitleContainer;
    public final TextView titleTextView;
    public final TypingIndicatorView typingIndicatorView;

    private StreamUiChannelHeaderViewBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ConstraintLayout constraintLayout2, ChannelAvatarView channelAvatarView, LinearLayout linearLayout, ProgressBar progressBar, TextView textView2, LinearLayout linearLayout2, TextView textView3, TextView textView4, TextView textView5, View view, FrameLayout frameLayout, TextView textView6, TypingIndicatorView typingIndicatorView) {
        this.rootView = constraintLayout;
        this.backButton = imageView;
        this.backButtonBadge = textView;
        this.backButtonContainer = constraintLayout2;
        this.channelAvatarView = channelAvatarView;
        this.connectingContainer = linearLayout;
        this.connectingProgressBar = progressBar;
        this.connectingTextView = textView2;
        this.offlineContainer = linearLayout2;
        this.offlineRetryButton = textView3;
        this.offlineTextView = textView4;
        this.onlineTextView = textView5;
        this.separator = view;
        this.subtitleContainer = frameLayout;
        this.titleTextView = textView6;
        this.typingIndicatorView = typingIndicatorView;
    }

    public static StreamUiChannelHeaderViewBinding bind(View view) {
        View viewM108203J;
        int i13 = C19469R.id.backButton;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = C19469R.id.backButtonBadge;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView != null) {
                i13 = C19469R.id.backButtonContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC34235f.m108203J(view, i13);
                if (constraintLayout != null) {
                    i13 = C19469R.id.channelAvatarView;
                    ChannelAvatarView channelAvatarView = (ChannelAvatarView) AbstractC34235f.m108203J(view, i13);
                    if (channelAvatarView != null) {
                        i13 = C19469R.id.connectingContainer;
                        LinearLayout linearLayout = (LinearLayout) AbstractC34235f.m108203J(view, i13);
                        if (linearLayout != null) {
                            i13 = C19469R.id.connectingProgressBar;
                            ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i13);
                            if (progressBar != null) {
                                i13 = C19469R.id.connectingTextView;
                                TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                                if (textView2 != null) {
                                    i13 = C19469R.id.offlineContainer;
                                    LinearLayout linearLayout2 = (LinearLayout) AbstractC34235f.m108203J(view, i13);
                                    if (linearLayout2 != null) {
                                        i13 = C19469R.id.offlineRetryButton;
                                        TextView textView3 = (TextView) AbstractC34235f.m108203J(view, i13);
                                        if (textView3 != null) {
                                            i13 = C19469R.id.offlineTextView;
                                            TextView textView4 = (TextView) AbstractC34235f.m108203J(view, i13);
                                            if (textView4 != null) {
                                                i13 = C19469R.id.onlineTextView;
                                                TextView textView5 = (TextView) AbstractC34235f.m108203J(view, i13);
                                                if (textView5 != null && (viewM108203J = AbstractC34235f.m108203J(view, (i13 = C19469R.id.separator))) != null) {
                                                    i13 = C19469R.id.subtitleContainer;
                                                    FrameLayout frameLayout = (FrameLayout) AbstractC34235f.m108203J(view, i13);
                                                    if (frameLayout != null) {
                                                        i13 = C19469R.id.titleTextView;
                                                        TextView textView6 = (TextView) AbstractC34235f.m108203J(view, i13);
                                                        if (textView6 != null) {
                                                            i13 = C19469R.id.typingIndicatorView;
                                                            TypingIndicatorView typingIndicatorView = (TypingIndicatorView) AbstractC34235f.m108203J(view, i13);
                                                            if (typingIndicatorView != null) {
                                                                return new StreamUiChannelHeaderViewBinding((ConstraintLayout) view, imageView, textView, constraintLayout, channelAvatarView, linearLayout, progressBar, textView2, linearLayout2, textView3, textView4, textView5, viewM108203J, frameLayout, textView6, typingIndicatorView);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiChannelHeaderViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiChannelHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_channel_header_view, viewGroup, false);
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
