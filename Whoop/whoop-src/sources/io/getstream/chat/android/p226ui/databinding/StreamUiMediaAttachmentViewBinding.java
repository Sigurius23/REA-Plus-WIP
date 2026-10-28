package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiMediaAttachmentViewBinding implements InterfaceC13008a {
    public final ConstraintLayout imageAttachmentContent;
    public final ShapeableImageView imageView;
    public final FrameLayout loadImage;
    public final ProgressBar loadingProgressBar;
    public final FrameLayout moreCount;
    public final TextView moreCountLabel;
    public final CardView playIconCardView;
    public final ImageView playIconImageView;
    private final ConstraintLayout rootView;

    private StreamUiMediaAttachmentViewBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ShapeableImageView shapeableImageView, FrameLayout frameLayout, ProgressBar progressBar, FrameLayout frameLayout2, TextView textView, CardView cardView, ImageView imageView) {
        this.rootView = constraintLayout;
        this.imageAttachmentContent = constraintLayout2;
        this.imageView = shapeableImageView;
        this.loadImage = frameLayout;
        this.loadingProgressBar = progressBar;
        this.moreCount = frameLayout2;
        this.moreCountLabel = textView;
        this.playIconCardView = cardView;
        this.playIconImageView = imageView;
    }

    public static StreamUiMediaAttachmentViewBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i13 = C19469R.id.imageView;
        ShapeableImageView shapeableImageView = (ShapeableImageView) AbstractC34235f.m108203J(view, i13);
        if (shapeableImageView != null) {
            i13 = C19469R.id.loadImage;
            FrameLayout frameLayout = (FrameLayout) AbstractC34235f.m108203J(view, i13);
            if (frameLayout != null) {
                i13 = C19469R.id.loadingProgressBar;
                ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i13);
                if (progressBar != null) {
                    i13 = C19469R.id.moreCount;
                    FrameLayout frameLayout2 = (FrameLayout) AbstractC34235f.m108203J(view, i13);
                    if (frameLayout2 != null) {
                        i13 = C19469R.id.moreCountLabel;
                        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
                        if (textView != null) {
                            i13 = C19469R.id.playIconCardView;
                            CardView cardView = (CardView) AbstractC34235f.m108203J(view, i13);
                            if (cardView != null) {
                                i13 = C19469R.id.playIconImageView;
                                ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
                                if (imageView != null) {
                                    return new StreamUiMediaAttachmentViewBinding(constraintLayout, constraintLayout, shapeableImageView, frameLayout, progressBar, frameLayout2, textView, cardView, imageView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiMediaAttachmentViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiMediaAttachmentViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_media_attachment_view, viewGroup, false);
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
