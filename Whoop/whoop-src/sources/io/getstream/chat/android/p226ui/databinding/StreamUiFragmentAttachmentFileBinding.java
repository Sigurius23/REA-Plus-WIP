package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiFragmentAttachmentFileBinding implements InterfaceC13008a {
    public final ImageView audioAccessImageView;
    public final TextView audioAccessTextView;
    public final ConstraintLayout dialogContainer;
    public final TextView emptyPlaceholderTextView;
    public final ImageView fileManagerImageView;
    public final StreamUiAttachmentPermissionViewBinding grantPermissionsInclude;
    public final ProgressBar progressBar;
    public final RecyclerView recentFilesRecyclerView;
    public final TextView recentFilesTextView;
    private final ConstraintLayout rootView;
    public final ImageView visualMediaAccessImageView;
    public final TextView visualMediaAccessTextView;

    private StreamUiFragmentAttachmentFileBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ConstraintLayout constraintLayout2, TextView textView2, ImageView imageView2, StreamUiAttachmentPermissionViewBinding streamUiAttachmentPermissionViewBinding, ProgressBar progressBar, RecyclerView recyclerView, TextView textView3, ImageView imageView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.audioAccessImageView = imageView;
        this.audioAccessTextView = textView;
        this.dialogContainer = constraintLayout2;
        this.emptyPlaceholderTextView = textView2;
        this.fileManagerImageView = imageView2;
        this.grantPermissionsInclude = streamUiAttachmentPermissionViewBinding;
        this.progressBar = progressBar;
        this.recentFilesRecyclerView = recyclerView;
        this.recentFilesTextView = textView3;
        this.visualMediaAccessImageView = imageView3;
        this.visualMediaAccessTextView = textView4;
    }

    public static StreamUiFragmentAttachmentFileBinding bind(View view) {
        View viewM108203J;
        int i13 = C19469R.id.audioAccessImageView;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = C19469R.id.audioAccessTextView;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i13 = C19469R.id.emptyPlaceholderTextView;
                TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView2 != null) {
                    i13 = C19469R.id.fileManagerImageView;
                    ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
                    if (imageView2 != null && (viewM108203J = AbstractC34235f.m108203J(view, (i13 = C19469R.id.grantPermissionsInclude))) != null) {
                        StreamUiAttachmentPermissionViewBinding streamUiAttachmentPermissionViewBindingBind = StreamUiAttachmentPermissionViewBinding.bind(viewM108203J);
                        i13 = C19469R.id.progressBar;
                        ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i13);
                        if (progressBar != null) {
                            i13 = C19469R.id.recentFilesRecyclerView;
                            RecyclerView recyclerView = (RecyclerView) AbstractC34235f.m108203J(view, i13);
                            if (recyclerView != null) {
                                i13 = C19469R.id.recentFilesTextView;
                                TextView textView3 = (TextView) AbstractC34235f.m108203J(view, i13);
                                if (textView3 != null) {
                                    i13 = C19469R.id.visualMediaAccessImageView;
                                    ImageView imageView3 = (ImageView) AbstractC34235f.m108203J(view, i13);
                                    if (imageView3 != null) {
                                        i13 = C19469R.id.visualMediaAccessTextView;
                                        TextView textView4 = (TextView) AbstractC34235f.m108203J(view, i13);
                                        if (textView4 != null) {
                                            return new StreamUiFragmentAttachmentFileBinding(constraintLayout, imageView, textView, constraintLayout, textView2, imageView2, streamUiAttachmentPermissionViewBindingBind, progressBar, recyclerView, textView3, imageView3, textView4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiFragmentAttachmentFileBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiFragmentAttachmentFileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_fragment_attachment_file, viewGroup, false);
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
