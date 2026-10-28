package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemPollOptionHeaderBinding implements InterfaceC13008a {
    public final ImageView award;
    private final ConstraintLayout rootView;
    public final AppCompatTextView voteCount;

    private StreamUiItemPollOptionHeaderBinding(ConstraintLayout constraintLayout, ImageView imageView, AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.award = imageView;
        this.voteCount = appCompatTextView;
    }

    public static StreamUiItemPollOptionHeaderBinding bind(View view) {
        int i13 = C19469R.id.award;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = C19469R.id.voteCount;
            AppCompatTextView appCompatTextView = (AppCompatTextView) AbstractC34235f.m108203J(view, i13);
            if (appCompatTextView != null) {
                return new StreamUiItemPollOptionHeaderBinding((ConstraintLayout) view, imageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemPollOptionHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemPollOptionHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_poll_option_header, viewGroup, false);
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
