package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemChannelMemberBinding implements InterfaceC13008a {
    private final LinearLayout rootView;
    public final UserAvatarView userAvatarView;
    public final TextView userNameTextView;

    private StreamUiItemChannelMemberBinding(LinearLayout linearLayout, UserAvatarView userAvatarView, TextView textView) {
        this.rootView = linearLayout;
        this.userAvatarView = userAvatarView;
        this.userNameTextView = textView;
    }

    public static StreamUiItemChannelMemberBinding bind(View view) {
        int i13 = C19469R.id.userAvatarView;
        UserAvatarView userAvatarView = (UserAvatarView) AbstractC34235f.m108203J(view, i13);
        if (userAvatarView != null) {
            i13 = C19469R.id.userNameTextView;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView != null) {
                return new StreamUiItemChannelMemberBinding((LinearLayout) view, userAvatarView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemChannelMemberBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemChannelMemberBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_channel_member, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final LinearLayout getRoot() {
        return this.rootView;
    }
}
