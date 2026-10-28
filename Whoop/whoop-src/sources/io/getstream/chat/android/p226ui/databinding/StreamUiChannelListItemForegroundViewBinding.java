package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.widgets.avatar.ChannelAvatarView;
import io.getstream.chat.android.p226ui.widgets.typing.TypingIndicatorView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiChannelListItemForegroundViewBinding implements InterfaceC13008a {
    public final ChannelAvatarView channelAvatarView;
    public final TextView channelNameLabel;
    public final TextView draftMessageLabel;
    public final ConstraintLayout foregroundView;
    public final Guideline guideline;
    public final TextView lastMessageLabel;
    public final TextView lastMessageTimeLabel;
    public final ImageView messageStatusImageView;
    public final ImageView muteIcon;
    public final TextView readCountView;
    private final ConstraintLayout rootView;
    public final View spacer;
    public final TypingIndicatorView typingIndicatorView;
    public final TextView unreadCountBadge;

    private StreamUiChannelListItemForegroundViewBinding(ConstraintLayout constraintLayout, ChannelAvatarView channelAvatarView, TextView textView, TextView textView2, ConstraintLayout constraintLayout2, Guideline guideline, TextView textView3, TextView textView4, ImageView imageView, ImageView imageView2, TextView textView5, View view, TypingIndicatorView typingIndicatorView, TextView textView6) {
        this.rootView = constraintLayout;
        this.channelAvatarView = channelAvatarView;
        this.channelNameLabel = textView;
        this.draftMessageLabel = textView2;
        this.foregroundView = constraintLayout2;
        this.guideline = guideline;
        this.lastMessageLabel = textView3;
        this.lastMessageTimeLabel = textView4;
        this.messageStatusImageView = imageView;
        this.muteIcon = imageView2;
        this.readCountView = textView5;
        this.spacer = view;
        this.typingIndicatorView = typingIndicatorView;
        this.unreadCountBadge = textView6;
    }

    public static StreamUiChannelListItemForegroundViewBinding bind(View view) {
        View viewM108203J;
        int i13 = C19469R.id.channelAvatarView;
        ChannelAvatarView channelAvatarView = (ChannelAvatarView) AbstractC34235f.m108203J(view, i13);
        if (channelAvatarView != null) {
            i13 = C19469R.id.channelNameLabel;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView != null) {
                i13 = C19469R.id.draftMessageLabel;
                TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i13 = C19469R.id.guideline;
                    Guideline guideline = (Guideline) AbstractC34235f.m108203J(view, i13);
                    if (guideline != null) {
                        i13 = C19469R.id.lastMessageLabel;
                        TextView textView3 = (TextView) AbstractC34235f.m108203J(view, i13);
                        if (textView3 != null) {
                            i13 = C19469R.id.lastMessageTimeLabel;
                            TextView textView4 = (TextView) AbstractC34235f.m108203J(view, i13);
                            if (textView4 != null) {
                                i13 = C19469R.id.messageStatusImageView;
                                ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
                                if (imageView != null) {
                                    i13 = C19469R.id.muteIcon;
                                    ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
                                    if (imageView2 != null) {
                                        i13 = C19469R.id.readCountView;
                                        TextView textView5 = (TextView) AbstractC34235f.m108203J(view, i13);
                                        if (textView5 != null && (viewM108203J = AbstractC34235f.m108203J(view, (i13 = C19469R.id.spacer))) != null) {
                                            i13 = C19469R.id.typingIndicatorView;
                                            TypingIndicatorView typingIndicatorView = (TypingIndicatorView) AbstractC34235f.m108203J(view, i13);
                                            if (typingIndicatorView != null) {
                                                i13 = C19469R.id.unreadCountBadge;
                                                TextView textView6 = (TextView) AbstractC34235f.m108203J(view, i13);
                                                if (textView6 != null) {
                                                    return new StreamUiChannelListItemForegroundViewBinding(constraintLayout, channelAvatarView, textView, textView2, constraintLayout, guideline, textView3, textView4, imageView, imageView2, textView5, viewM108203J, typingIndicatorView, textView6);
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

    public static StreamUiChannelListItemForegroundViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiChannelListItemForegroundViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_channel_list_item_foreground_view, viewGroup, false);
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
