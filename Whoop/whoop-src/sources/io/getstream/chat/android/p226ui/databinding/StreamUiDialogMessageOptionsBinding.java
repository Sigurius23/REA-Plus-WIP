package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.feature.messages.list.options.message.internal.MessageOptionsView;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.edit.internal.EditReactionsView;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.user.internal.UserReactionsView;
import io.getstream.chat.android.p226ui.widgets.internal.TouchInterceptingFrameLayout;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiDialogMessageOptionsBinding implements InterfaceC13008a {
    public final LinearLayout containerView;
    public final EditReactionsView editReactionsView;
    public final TouchInterceptingFrameLayout messageContainer;
    public final MessageOptionsView messageOptionsView;
    private final ScrollView rootView;
    public final UserReactionsView userReactionsView;

    private StreamUiDialogMessageOptionsBinding(ScrollView scrollView, LinearLayout linearLayout, EditReactionsView editReactionsView, TouchInterceptingFrameLayout touchInterceptingFrameLayout, MessageOptionsView messageOptionsView, UserReactionsView userReactionsView) {
        this.rootView = scrollView;
        this.containerView = linearLayout;
        this.editReactionsView = editReactionsView;
        this.messageContainer = touchInterceptingFrameLayout;
        this.messageOptionsView = messageOptionsView;
        this.userReactionsView = userReactionsView;
    }

    public static StreamUiDialogMessageOptionsBinding bind(View view) {
        int i13 = C19469R.id.containerView;
        LinearLayout linearLayout = (LinearLayout) AbstractC34235f.m108203J(view, i13);
        if (linearLayout != null) {
            i13 = C19469R.id.editReactionsView;
            EditReactionsView editReactionsView = (EditReactionsView) AbstractC34235f.m108203J(view, i13);
            if (editReactionsView != null) {
                i13 = C19469R.id.messageContainer;
                TouchInterceptingFrameLayout touchInterceptingFrameLayout = (TouchInterceptingFrameLayout) AbstractC34235f.m108203J(view, i13);
                if (touchInterceptingFrameLayout != null) {
                    i13 = C19469R.id.messageOptionsView;
                    MessageOptionsView messageOptionsView = (MessageOptionsView) AbstractC34235f.m108203J(view, i13);
                    if (messageOptionsView != null) {
                        i13 = C19469R.id.userReactionsView;
                        UserReactionsView userReactionsView = (UserReactionsView) AbstractC34235f.m108203J(view, i13);
                        if (userReactionsView != null) {
                            return new StreamUiDialogMessageOptionsBinding((ScrollView) view, linearLayout, editReactionsView, touchInterceptingFrameLayout, messageOptionsView, userReactionsView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiDialogMessageOptionsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiDialogMessageOptionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_dialog_message_options, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final ScrollView getRoot() {
        return this.rootView;
    }
}
