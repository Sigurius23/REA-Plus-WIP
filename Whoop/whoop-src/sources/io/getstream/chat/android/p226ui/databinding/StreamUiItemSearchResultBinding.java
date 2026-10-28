package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemSearchResultBinding implements InterfaceC13008a {
    public final TextView mentionNameTextView;
    private final ConstraintLayout rootView;
    public final UserAvatarView userAvatarView;
    public final TextView usernameTextView;

    private StreamUiItemSearchResultBinding(ConstraintLayout constraintLayout, TextView textView, UserAvatarView userAvatarView, TextView textView2) {
        this.rootView = constraintLayout;
        this.mentionNameTextView = textView;
        this.userAvatarView = userAvatarView;
        this.usernameTextView = textView2;
    }

    public static StreamUiItemSearchResultBinding bind(View view) {
        int i13 = C19469R.id.mentionNameTextView;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            i13 = C19469R.id.userAvatarView;
            UserAvatarView userAvatarView = (UserAvatarView) AbstractC34235f.m108203J(view, i13);
            if (userAvatarView != null) {
                i13 = C19469R.id.usernameTextView;
                TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView2 != null) {
                    return new StreamUiItemSearchResultBinding((ConstraintLayout) view, textView, userAvatarView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemSearchResultBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemSearchResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_search_result, viewGroup, false);
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
