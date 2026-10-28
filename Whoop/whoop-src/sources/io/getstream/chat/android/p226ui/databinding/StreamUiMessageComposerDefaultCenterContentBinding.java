package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.MessageReplyView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiMessageComposerDefaultCenterContentBinding implements InterfaceC13008a {
    public final RecyclerView attachmentsRecyclerView;
    public final AppCompatEditText messageEditText;
    public final ConstraintLayout messageInputContainer;
    public final MessageReplyView messageReplyView;
    private final View rootView;

    private StreamUiMessageComposerDefaultCenterContentBinding(View view, RecyclerView recyclerView, AppCompatEditText appCompatEditText, ConstraintLayout constraintLayout, MessageReplyView messageReplyView) {
        this.rootView = view;
        this.attachmentsRecyclerView = recyclerView;
        this.messageEditText = appCompatEditText;
        this.messageInputContainer = constraintLayout;
        this.messageReplyView = messageReplyView;
    }

    public static StreamUiMessageComposerDefaultCenterContentBinding bind(View view) {
        int i13 = C19469R.id.attachmentsRecyclerView;
        RecyclerView recyclerView = (RecyclerView) AbstractC34235f.m108203J(view, i13);
        if (recyclerView != null) {
            i13 = C19469R.id.messageEditText;
            AppCompatEditText appCompatEditText = (AppCompatEditText) AbstractC34235f.m108203J(view, i13);
            if (appCompatEditText != null) {
                i13 = C19469R.id.messageInputContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC34235f.m108203J(view, i13);
                if (constraintLayout != null) {
                    i13 = C19469R.id.messageReplyView;
                    MessageReplyView messageReplyView = (MessageReplyView) AbstractC34235f.m108203J(view, i13);
                    if (messageReplyView != null) {
                        return new StreamUiMessageComposerDefaultCenterContentBinding(view, recyclerView, appCompatEditText, constraintLayout, messageReplyView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiMessageComposerDefaultCenterContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C19469R.layout.stream_ui_message_composer_default_center_content, viewGroup);
        return bind(viewGroup);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }
}
