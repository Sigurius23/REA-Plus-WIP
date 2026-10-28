package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiMediaAttachmentGridViewBinding implements InterfaceC13008a {
    public final FrameLayout dateContainer;
    public final TextView dateTextView;
    public final RecyclerView mediaRecyclerView;
    private final ConstraintLayout rootView;

    private StreamUiMediaAttachmentGridViewBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, TextView textView, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.dateContainer = frameLayout;
        this.dateTextView = textView;
        this.mediaRecyclerView = recyclerView;
    }

    public static StreamUiMediaAttachmentGridViewBinding bind(View view) {
        int i13 = C19469R.id.dateContainer;
        FrameLayout frameLayout = (FrameLayout) AbstractC34235f.m108203J(view, i13);
        if (frameLayout != null) {
            i13 = C19469R.id.dateTextView;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView != null) {
                i13 = C19469R.id.mediaRecyclerView;
                RecyclerView recyclerView = (RecyclerView) AbstractC34235f.m108203J(view, i13);
                if (recyclerView != null) {
                    return new StreamUiMediaAttachmentGridViewBinding((ConstraintLayout) view, frameLayout, textView, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiMediaAttachmentGridViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiMediaAttachmentGridViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_media_attachment_grid_view, viewGroup, false);
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
