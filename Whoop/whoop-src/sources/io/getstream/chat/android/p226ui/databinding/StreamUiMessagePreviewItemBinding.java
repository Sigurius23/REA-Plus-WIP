package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiMessagePreviewItemBinding implements InterfaceC13008a {
    public final ConstraintLayout contentRoot;
    public final Guideline guideline;
    public final TextView messageLabel;
    public final TextView messageTimeLabel;
    private final ConstraintLayout rootView;
    public final TextView senderNameLabel;
    public final View spacer;
    public final UserAvatarView userAvatarView;

    private StreamUiMessagePreviewItemBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Guideline guideline, TextView textView, TextView textView2, TextView textView3, View view, UserAvatarView userAvatarView) {
        this.rootView = constraintLayout;
        this.contentRoot = constraintLayout2;
        this.guideline = guideline;
        this.messageLabel = textView;
        this.messageTimeLabel = textView2;
        this.senderNameLabel = textView3;
        this.spacer = view;
        this.userAvatarView = userAvatarView;
    }

    public static StreamUiMessagePreviewItemBinding bind(View view) {
        View viewM108203J;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i13 = C19469R.id.guideline;
        Guideline guideline = (Guideline) AbstractC34235f.m108203J(view, i13);
        if (guideline != null) {
            i13 = C19469R.id.messageLabel;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView != null) {
                i13 = C19469R.id.messageTimeLabel;
                TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView2 != null) {
                    i13 = C19469R.id.senderNameLabel;
                    TextView textView3 = (TextView) AbstractC34235f.m108203J(view, i13);
                    if (textView3 != null && (viewM108203J = AbstractC34235f.m108203J(view, (i13 = C19469R.id.spacer))) != null) {
                        i13 = C19469R.id.userAvatarView;
                        UserAvatarView userAvatarView = (UserAvatarView) AbstractC34235f.m108203J(view, i13);
                        if (userAvatarView != null) {
                            return new StreamUiMessagePreviewItemBinding(constraintLayout, constraintLayout, guideline, textView, textView2, textView3, viewM108203J, userAvatarView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiMessagePreviewItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiMessagePreviewItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_message_preview_item, viewGroup, false);
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
