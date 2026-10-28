package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.user.internal.SingleReactionView;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemUserReactionBinding implements InterfaceC13008a {
    public final ConstraintLayout reactionContainer;
    private final ConstraintLayout rootView;
    public final UserAvatarView userAvatarView;
    public final TextView userNameTextView;
    public final SingleReactionView userReactionView;

    private StreamUiItemUserReactionBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, UserAvatarView userAvatarView, TextView textView, SingleReactionView singleReactionView) {
        this.rootView = constraintLayout;
        this.reactionContainer = constraintLayout2;
        this.userAvatarView = userAvatarView;
        this.userNameTextView = textView;
        this.userReactionView = singleReactionView;
    }

    public static StreamUiItemUserReactionBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i13 = C19469R.id.userAvatarView;
        UserAvatarView userAvatarView = (UserAvatarView) AbstractC34235f.m108203J(view, i13);
        if (userAvatarView != null) {
            i13 = C19469R.id.userNameTextView;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView != null) {
                i13 = C19469R.id.userReactionView;
                SingleReactionView singleReactionView = (SingleReactionView) AbstractC34235f.m108203J(view, i13);
                if (singleReactionView != null) {
                    return new StreamUiItemUserReactionBinding(constraintLayout, constraintLayout, userAvatarView, textView, singleReactionView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemUserReactionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemUserReactionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_user_reaction, viewGroup, false);
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
