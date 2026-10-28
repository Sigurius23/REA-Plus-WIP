package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiDialogAttachmentTabBinding implements InterfaceC13008a {
    public final CheckedTextView checkedTextView;
    private final FrameLayout rootView;

    private StreamUiDialogAttachmentTabBinding(FrameLayout frameLayout, CheckedTextView checkedTextView) {
        this.rootView = frameLayout;
        this.checkedTextView = checkedTextView;
    }

    public static StreamUiDialogAttachmentTabBinding bind(View view) {
        int i13 = C19469R.id.checkedTextView;
        CheckedTextView checkedTextView = (CheckedTextView) AbstractC34235f.m108203J(view, i13);
        if (checkedTextView != null) {
            return new StreamUiDialogAttachmentTabBinding((FrameLayout) view, checkedTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiDialogAttachmentTabBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiDialogAttachmentTabBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_dialog_attachment_tab, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final FrameLayout getRoot() {
        return this.rootView;
    }
}
