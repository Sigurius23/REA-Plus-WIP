package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiFragmentAttachmentSystemPickerBinding implements InterfaceC13008a {
    public final CardView buttonCapture;
    public final CardView buttonFiles;
    public final CardView buttonMedia;
    public final CardView buttonPolls;
    public final LinearLayout flow;
    private final ConstraintLayout rootView;
    public final HorizontalScrollView scrollView;
    public final TextView textCapture;
    public final TextView textFiles;
    public final TextView textMedia;
    public final TextView textPoll;

    private StreamUiFragmentAttachmentSystemPickerBinding(ConstraintLayout constraintLayout, CardView cardView, CardView cardView2, CardView cardView3, CardView cardView4, LinearLayout linearLayout, HorizontalScrollView horizontalScrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.buttonCapture = cardView;
        this.buttonFiles = cardView2;
        this.buttonMedia = cardView3;
        this.buttonPolls = cardView4;
        this.flow = linearLayout;
        this.scrollView = horizontalScrollView;
        this.textCapture = textView;
        this.textFiles = textView2;
        this.textMedia = textView3;
        this.textPoll = textView4;
    }

    public static StreamUiFragmentAttachmentSystemPickerBinding bind(View view) {
        int i13 = C19469R.id.button_capture;
        CardView cardView = (CardView) AbstractC34235f.m108203J(view, i13);
        if (cardView != null) {
            i13 = C19469R.id.button_files;
            CardView cardView2 = (CardView) AbstractC34235f.m108203J(view, i13);
            if (cardView2 != null) {
                i13 = C19469R.id.button_media;
                CardView cardView3 = (CardView) AbstractC34235f.m108203J(view, i13);
                if (cardView3 != null) {
                    i13 = C19469R.id.button_polls;
                    CardView cardView4 = (CardView) AbstractC34235f.m108203J(view, i13);
                    if (cardView4 != null) {
                        i13 = C19469R.id.flow;
                        LinearLayout linearLayout = (LinearLayout) AbstractC34235f.m108203J(view, i13);
                        if (linearLayout != null) {
                            i13 = C19469R.id.scrollView;
                            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) AbstractC34235f.m108203J(view, i13);
                            if (horizontalScrollView != null) {
                                i13 = C19469R.id.text_capture;
                                TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
                                if (textView != null) {
                                    i13 = C19469R.id.text_files;
                                    TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                                    if (textView2 != null) {
                                        i13 = C19469R.id.text_media;
                                        TextView textView3 = (TextView) AbstractC34235f.m108203J(view, i13);
                                        if (textView3 != null) {
                                            i13 = C19469R.id.text_poll;
                                            TextView textView4 = (TextView) AbstractC34235f.m108203J(view, i13);
                                            if (textView4 != null) {
                                                return new StreamUiFragmentAttachmentSystemPickerBinding((ConstraintLayout) view, cardView, cardView2, cardView3, cardView4, linearLayout, horizontalScrollView, textView, textView2, textView3, textView4);
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

    public static StreamUiFragmentAttachmentSystemPickerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiFragmentAttachmentSystemPickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_fragment_attachment_system_picker, viewGroup, false);
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
