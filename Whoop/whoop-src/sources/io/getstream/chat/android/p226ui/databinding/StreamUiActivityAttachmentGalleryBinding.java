package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiActivityAttachmentGalleryBinding implements InterfaceC13008a {
    public final ImageView attachmentActionsButton;
    public final TextView attachmentDateTextView;
    public final ConstraintLayout bottomBar;
    public final ConstraintLayout centerContent;
    public final ImageView closeButton;
    public final ImageView galleryOverviewButton;
    public final ViewPager2 galleryViewPager;
    public final TextView mediaInformationTextView;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;
    public final ImageView shareMediaButton;
    public final ConstraintLayout toolbar;
    public final TextView userTextView;

    private StreamUiActivityAttachmentGalleryBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ImageView imageView2, ImageView imageView3, ViewPager2 viewPager2, TextView textView2, ProgressBar progressBar, ImageView imageView4, ConstraintLayout constraintLayout4, TextView textView3) {
        this.rootView = constraintLayout;
        this.attachmentActionsButton = imageView;
        this.attachmentDateTextView = textView;
        this.bottomBar = constraintLayout2;
        this.centerContent = constraintLayout3;
        this.closeButton = imageView2;
        this.galleryOverviewButton = imageView3;
        this.galleryViewPager = viewPager2;
        this.mediaInformationTextView = textView2;
        this.progressBar = progressBar;
        this.shareMediaButton = imageView4;
        this.toolbar = constraintLayout4;
        this.userTextView = textView3;
    }

    public static StreamUiActivityAttachmentGalleryBinding bind(View view) {
        int i13 = C19469R.id.attachmentActionsButton;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = C19469R.id.attachmentDateTextView;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView != null) {
                i13 = C19469R.id.bottomBar;
                ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC34235f.m108203J(view, i13);
                if (constraintLayout != null) {
                    i13 = C19469R.id.centerContent;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) AbstractC34235f.m108203J(view, i13);
                    if (constraintLayout2 != null) {
                        i13 = C19469R.id.closeButton;
                        ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(view, i13);
                        if (imageView2 != null) {
                            i13 = C19469R.id.galleryOverviewButton;
                            ImageView imageView3 = (ImageView) AbstractC34235f.m108203J(view, i13);
                            if (imageView3 != null) {
                                i13 = C19469R.id.galleryViewPager;
                                ViewPager2 viewPager2 = (ViewPager2) AbstractC34235f.m108203J(view, i13);
                                if (viewPager2 != null) {
                                    i13 = C19469R.id.mediaInformationTextView;
                                    TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                                    if (textView2 != null) {
                                        i13 = C19469R.id.progressBar;
                                        ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i13);
                                        if (progressBar != null) {
                                            i13 = C19469R.id.shareMediaButton;
                                            ImageView imageView4 = (ImageView) AbstractC34235f.m108203J(view, i13);
                                            if (imageView4 != null) {
                                                i13 = C19469R.id.toolbar;
                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) AbstractC34235f.m108203J(view, i13);
                                                if (constraintLayout3 != null) {
                                                    i13 = C19469R.id.userTextView;
                                                    TextView textView3 = (TextView) AbstractC34235f.m108203J(view, i13);
                                                    if (textView3 != null) {
                                                        return new StreamUiActivityAttachmentGalleryBinding((ConstraintLayout) view, imageView, textView, constraintLayout, constraintLayout2, imageView2, imageView3, viewPager2, textView2, progressBar, imageView4, constraintLayout3, textView3);
                                                    }
                                                }
                                            }
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

    public static StreamUiActivityAttachmentGalleryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiActivityAttachmentGalleryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_activity_attachment_gallery, viewGroup, false);
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
