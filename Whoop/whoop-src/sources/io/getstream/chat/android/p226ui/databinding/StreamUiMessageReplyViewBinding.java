package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiMessageReplyViewBinding implements InterfaceC13008a {
    public final TextView additionalInfo;
    public final FrameLayout attachmentContainer;
    public final ConstraintLayout mediaAttachmentContent;
    public final UserAvatarView replyAvatarView;
    public final ConstraintLayout replyContainer;
    public final TextView replyText;
    private final ConstraintLayout rootView;

    private StreamUiMessageReplyViewBinding(ConstraintLayout constraintLayout, TextView textView, FrameLayout frameLayout, ConstraintLayout constraintLayout2, UserAvatarView userAvatarView, ConstraintLayout constraintLayout3, TextView textView2) {
        this.rootView = constraintLayout;
        this.additionalInfo = textView;
        this.attachmentContainer = frameLayout;
        this.mediaAttachmentContent = constraintLayout2;
        this.replyAvatarView = userAvatarView;
        this.replyContainer = constraintLayout3;
        this.replyText = textView2;
    }

    public static StreamUiMessageReplyViewBinding bind(View view) {
        int i13 = C19469R.id.additionalInfo;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            i13 = C19469R.id.attachmentContainer;
            FrameLayout frameLayout = (FrameLayout) AbstractC34235f.m108203J(view, i13);
            if (frameLayout != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i13 = C19469R.id.replyAvatarView;
                UserAvatarView userAvatarView = (UserAvatarView) AbstractC34235f.m108203J(view, i13);
                if (userAvatarView != null) {
                    i13 = C19469R.id.replyContainer;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) AbstractC34235f.m108203J(view, i13);
                    if (constraintLayout2 != null) {
                        i13 = C19469R.id.replyText;
                        TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                        if (textView2 != null) {
                            return new StreamUiMessageReplyViewBinding(constraintLayout, textView, frameLayout, constraintLayout, userAvatarView, constraintLayout2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiMessageReplyViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiMessageReplyViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_message_reply_view, viewGroup, false);
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
