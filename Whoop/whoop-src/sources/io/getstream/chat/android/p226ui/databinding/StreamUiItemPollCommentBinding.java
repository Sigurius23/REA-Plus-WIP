package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemPollCommentBinding implements InterfaceC13008a {
    public final AppCompatTextView answerText;
    public final AppCompatTextView date;
    public final AppCompatTextView name;
    private final ConstraintLayout rootView;
    public final AppCompatTextView time;
    public final UserAvatarView userAvatarView;

    private StreamUiItemPollCommentBinding(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, UserAvatarView userAvatarView) {
        this.rootView = constraintLayout;
        this.answerText = appCompatTextView;
        this.date = appCompatTextView2;
        this.name = appCompatTextView3;
        this.time = appCompatTextView4;
        this.userAvatarView = userAvatarView;
    }

    public static StreamUiItemPollCommentBinding bind(View view) {
        int i13 = C19469R.id.answerText;
        AppCompatTextView appCompatTextView = (AppCompatTextView) AbstractC34235f.m108203J(view, i13);
        if (appCompatTextView != null) {
            i13 = C19469R.id.date;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) AbstractC34235f.m108203J(view, i13);
            if (appCompatTextView2 != null) {
                i13 = C19469R.id.name;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) AbstractC34235f.m108203J(view, i13);
                if (appCompatTextView3 != null) {
                    i13 = C19469R.id.time;
                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) AbstractC34235f.m108203J(view, i13);
                    if (appCompatTextView4 != null) {
                        i13 = C19469R.id.userAvatarView;
                        UserAvatarView userAvatarView = (UserAvatarView) AbstractC34235f.m108203J(view, i13);
                        if (userAvatarView != null) {
                            return new StreamUiItemPollCommentBinding((ConstraintLayout) view, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, userAvatarView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemPollCommentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemPollCommentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_poll_comment, viewGroup, false);
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
