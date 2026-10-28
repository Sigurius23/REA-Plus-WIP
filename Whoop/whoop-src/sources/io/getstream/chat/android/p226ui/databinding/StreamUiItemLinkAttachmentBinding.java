package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.MessageReplyView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.FootnoteView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.GapView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.LinkAttachmentView;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.view.internal.ViewReactionsView;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemLinkAttachmentBinding implements InterfaceC13008a {
    public final ImageView deliveryFailedIcon;
    public final FootnoteView footnote;
    public final GapView gapView;
    public final LinkAttachmentView linkAttachmentView;
    public final Guideline marginEnd;
    public final Guideline marginStart;
    public final LinearLayout messageContainer;
    public final TextView messageText;
    public final TextView pinIndicatorTextView;
    public final Space reactionsSpace;
    public final ViewReactionsView reactionsView;
    public final MessageReplyView replyView;
    private final ConstraintLayout rootView;
    public final TextView sentFiles;
    public final Space threadGuideline;
    public final UserAvatarView userAvatarMineView;
    public final UserAvatarView userAvatarView;

    private StreamUiItemLinkAttachmentBinding(ConstraintLayout constraintLayout, ImageView imageView, FootnoteView footnoteView, GapView gapView, LinkAttachmentView linkAttachmentView, Guideline guideline, Guideline guideline2, LinearLayout linearLayout, TextView textView, TextView textView2, Space space, ViewReactionsView viewReactionsView, MessageReplyView messageReplyView, TextView textView3, Space space2, UserAvatarView userAvatarView, UserAvatarView userAvatarView2) {
        this.rootView = constraintLayout;
        this.deliveryFailedIcon = imageView;
        this.footnote = footnoteView;
        this.gapView = gapView;
        this.linkAttachmentView = linkAttachmentView;
        this.marginEnd = guideline;
        this.marginStart = guideline2;
        this.messageContainer = linearLayout;
        this.messageText = textView;
        this.pinIndicatorTextView = textView2;
        this.reactionsSpace = space;
        this.reactionsView = viewReactionsView;
        this.replyView = messageReplyView;
        this.sentFiles = textView3;
        this.threadGuideline = space2;
        this.userAvatarMineView = userAvatarView;
        this.userAvatarView = userAvatarView2;
    }

    public static StreamUiItemLinkAttachmentBinding bind(View view) {
        int i13 = C19469R.id.deliveryFailedIcon;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = C19469R.id.footnote;
            FootnoteView footnoteView = (FootnoteView) AbstractC34235f.m108203J(view, i13);
            if (footnoteView != null) {
                i13 = C19469R.id.gapView;
                GapView gapView = (GapView) AbstractC34235f.m108203J(view, i13);
                if (gapView != null) {
                    i13 = C19469R.id.linkAttachmentView;
                    LinkAttachmentView linkAttachmentView = (LinkAttachmentView) AbstractC34235f.m108203J(view, i13);
                    if (linkAttachmentView != null) {
                        i13 = C19469R.id.marginEnd;
                        Guideline guideline = (Guideline) AbstractC34235f.m108203J(view, i13);
                        if (guideline != null) {
                            i13 = C19469R.id.marginStart;
                            Guideline guideline2 = (Guideline) AbstractC34235f.m108203J(view, i13);
                            if (guideline2 != null) {
                                i13 = C19469R.id.messageContainer;
                                LinearLayout linearLayout = (LinearLayout) AbstractC34235f.m108203J(view, i13);
                                if (linearLayout != null) {
                                    i13 = C19469R.id.messageText;
                                    TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
                                    if (textView != null) {
                                        i13 = C19469R.id.pinIndicatorTextView;
                                        TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                                        if (textView2 != null) {
                                            i13 = C19469R.id.reactionsSpace;
                                            Space space = (Space) AbstractC34235f.m108203J(view, i13);
                                            if (space != null) {
                                                i13 = C19469R.id.reactionsView;
                                                ViewReactionsView viewReactionsView = (ViewReactionsView) AbstractC34235f.m108203J(view, i13);
                                                if (viewReactionsView != null) {
                                                    i13 = C19469R.id.replyView;
                                                    MessageReplyView messageReplyView = (MessageReplyView) AbstractC34235f.m108203J(view, i13);
                                                    if (messageReplyView != null) {
                                                        i13 = C19469R.id.sentFiles;
                                                        TextView textView3 = (TextView) AbstractC34235f.m108203J(view, i13);
                                                        if (textView3 != null) {
                                                            i13 = C19469R.id.threadGuideline;
                                                            Space space2 = (Space) AbstractC34235f.m108203J(view, i13);
                                                            if (space2 != null) {
                                                                i13 = C19469R.id.userAvatarMineView;
                                                                UserAvatarView userAvatarView = (UserAvatarView) AbstractC34235f.m108203J(view, i13);
                                                                if (userAvatarView != null) {
                                                                    i13 = C19469R.id.userAvatarView;
                                                                    UserAvatarView userAvatarView2 = (UserAvatarView) AbstractC34235f.m108203J(view, i13);
                                                                    if (userAvatarView2 != null) {
                                                                        return new StreamUiItemLinkAttachmentBinding((ConstraintLayout) view, imageView, footnoteView, gapView, linkAttachmentView, guideline, guideline2, linearLayout, textView, textView2, space, viewReactionsView, messageReplyView, textView3, space2, userAvatarView, userAvatarView2);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemLinkAttachmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemLinkAttachmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_link_attachment, viewGroup, false);
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
