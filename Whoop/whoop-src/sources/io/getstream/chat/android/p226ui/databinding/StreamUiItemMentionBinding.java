package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemMentionBinding implements InterfaceC13008a {
    public final TextView mentionNameTextView;
    public final ImageView mentionsIcon;
    private final ConstraintLayout rootView;
    public final UserAvatarView userAvatarView;
    public final TextView usernameTextView;

    private StreamUiItemMentionBinding(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, UserAvatarView userAvatarView, TextView textView2) {
        this.rootView = constraintLayout;
        this.mentionNameTextView = textView;
        this.mentionsIcon = imageView;
        this.userAvatarView = userAvatarView;
        this.usernameTextView = textView2;
    }

    public static StreamUiItemMentionBinding bind(View view) {
        int i13 = C19469R.id.mentionNameTextView;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            i13 = C19469R.id.mentionsIcon;
            ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
            if (imageView != null) {
                i13 = C19469R.id.userAvatarView;
                UserAvatarView userAvatarView = (UserAvatarView) AbstractC34235f.m108203J(view, i13);
                if (userAvatarView != null) {
                    i13 = C19469R.id.usernameTextView;
                    TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                    if (textView2 != null) {
                        return new StreamUiItemMentionBinding((ConstraintLayout) view, textView, imageView, userAvatarView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemMentionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemMentionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_mention, viewGroup, false);
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
