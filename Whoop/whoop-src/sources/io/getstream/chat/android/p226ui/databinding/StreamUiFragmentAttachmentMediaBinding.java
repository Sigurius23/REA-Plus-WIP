package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiFragmentAttachmentMediaBinding implements InterfaceC13008a {
    public final TextView emptyPlaceholderTextView;
    public final ConstraintLayout galleryContainer;
    public final StreamUiAttachmentPermissionViewBinding grantPermissionsInclude;
    public final RecyclerView mediaFileRecyclerView;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;

    private StreamUiFragmentAttachmentMediaBinding(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, StreamUiAttachmentPermissionViewBinding streamUiAttachmentPermissionViewBinding, RecyclerView recyclerView, ProgressBar progressBar) {
        this.rootView = constraintLayout;
        this.emptyPlaceholderTextView = textView;
        this.galleryContainer = constraintLayout2;
        this.grantPermissionsInclude = streamUiAttachmentPermissionViewBinding;
        this.mediaFileRecyclerView = recyclerView;
        this.progressBar = progressBar;
    }

    public static StreamUiFragmentAttachmentMediaBinding bind(View view) {
        int i13 = C19469R.id.emptyPlaceholderTextView;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i13 = C19469R.id.grantPermissionsInclude;
            View viewM108203J = AbstractC34235f.m108203J(view, i13);
            if (viewM108203J != null) {
                StreamUiAttachmentPermissionViewBinding streamUiAttachmentPermissionViewBindingBind = StreamUiAttachmentPermissionViewBinding.bind(viewM108203J);
                i13 = C19469R.id.mediaFileRecyclerView;
                RecyclerView recyclerView = (RecyclerView) AbstractC34235f.m108203J(view, i13);
                if (recyclerView != null) {
                    i13 = C19469R.id.progressBar;
                    ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i13);
                    if (progressBar != null) {
                        return new StreamUiFragmentAttachmentMediaBinding(constraintLayout, textView, constraintLayout, streamUiAttachmentPermissionViewBindingBind, recyclerView, progressBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiFragmentAttachmentMediaBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiFragmentAttachmentMediaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_fragment_attachment_media, viewGroup, false);
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
