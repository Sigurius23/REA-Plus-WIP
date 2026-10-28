package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.FootnoteView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.GapView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemMessageGiphyBinding implements InterfaceC13008a {
    public final TextView cancelButton;
    public final MaterialCardView cardView;
    public final FootnoteView footnote;
    public final GapView gapView;
    public final ImageView giphyIconImageView;
    public final TextView giphyLabelTextView;
    public final ShapeableImageView giphyPreview;
    public final TextView giphyQueryTextView;
    public final View horizontalDivider;
    public final ProgressBar loadingProgressBar;
    public final Guideline marginEnd;
    public final Guideline marginStart;
    private final ConstraintLayout rootView;
    public final TextView sendButton;
    public final TextView shuffleButton;
    public final View verticalDivider1;
    public final View verticalDivider2;

    private StreamUiItemMessageGiphyBinding(ConstraintLayout constraintLayout, TextView textView, MaterialCardView materialCardView, FootnoteView footnoteView, GapView gapView, ImageView imageView, TextView textView2, ShapeableImageView shapeableImageView, TextView textView3, View view, ProgressBar progressBar, Guideline guideline, Guideline guideline2, TextView textView4, TextView textView5, View view2, View view3) {
        this.rootView = constraintLayout;
        this.cancelButton = textView;
        this.cardView = materialCardView;
        this.footnote = footnoteView;
        this.gapView = gapView;
        this.giphyIconImageView = imageView;
        this.giphyLabelTextView = textView2;
        this.giphyPreview = shapeableImageView;
        this.giphyQueryTextView = textView3;
        this.horizontalDivider = view;
        this.loadingProgressBar = progressBar;
        this.marginEnd = guideline;
        this.marginStart = guideline2;
        this.sendButton = textView4;
        this.shuffleButton = textView5;
        this.verticalDivider1 = view2;
        this.verticalDivider2 = view3;
    }

    public static StreamUiItemMessageGiphyBinding bind(View view) {
        View viewM108203J;
        View viewM108203J2;
        View viewM108203J3;
        int i13 = C19469R.id.cancelButton;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            i13 = C19469R.id.cardView;
            MaterialCardView materialCardView = (MaterialCardView) AbstractC34235f.m108203J(view, i13);
            if (materialCardView != null) {
                i13 = C19469R.id.footnote;
                FootnoteView footnoteView = (FootnoteView) AbstractC34235f.m108203J(view, i13);
                if (footnoteView != null) {
                    i13 = C19469R.id.gapView;
                    GapView gapView = (GapView) AbstractC34235f.m108203J(view, i13);
                    if (gapView != null) {
                        i13 = C19469R.id.giphyIconImageView;
                        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
                        if (imageView != null) {
                            i13 = C19469R.id.giphyLabelTextView;
                            TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                            if (textView2 != null) {
                                i13 = C19469R.id.giphyPreview;
                                ShapeableImageView shapeableImageView = (ShapeableImageView) AbstractC34235f.m108203J(view, i13);
                                if (shapeableImageView != null) {
                                    i13 = C19469R.id.giphyQueryTextView;
                                    TextView textView3 = (TextView) AbstractC34235f.m108203J(view, i13);
                                    if (textView3 != null && (viewM108203J = AbstractC34235f.m108203J(view, (i13 = C19469R.id.horizontalDivider))) != null) {
                                        i13 = C19469R.id.loadingProgressBar;
                                        ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i13);
                                        if (progressBar != null) {
                                            i13 = C19469R.id.marginEnd;
                                            Guideline guideline = (Guideline) AbstractC34235f.m108203J(view, i13);
                                            if (guideline != null) {
                                                i13 = C19469R.id.marginStart;
                                                Guideline guideline2 = (Guideline) AbstractC34235f.m108203J(view, i13);
                                                if (guideline2 != null) {
                                                    i13 = C19469R.id.sendButton;
                                                    TextView textView4 = (TextView) AbstractC34235f.m108203J(view, i13);
                                                    if (textView4 != null) {
                                                        i13 = C19469R.id.shuffleButton;
                                                        TextView textView5 = (TextView) AbstractC34235f.m108203J(view, i13);
                                                        if (textView5 != null && (viewM108203J2 = AbstractC34235f.m108203J(view, (i13 = C19469R.id.verticalDivider1))) != null && (viewM108203J3 = AbstractC34235f.m108203J(view, (i13 = C19469R.id.verticalDivider2))) != null) {
                                                            return new StreamUiItemMessageGiphyBinding((ConstraintLayout) view, textView, materialCardView, footnoteView, gapView, imageView, textView2, shapeableImageView, textView3, viewM108203J, progressBar, guideline, guideline2, textView4, textView5, viewM108203J2, viewM108203J3);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemMessageGiphyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemMessageGiphyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_message_giphy, viewGroup, false);
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
