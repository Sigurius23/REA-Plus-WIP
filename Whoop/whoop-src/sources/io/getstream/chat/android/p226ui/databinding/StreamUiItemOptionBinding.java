package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemOptionBinding implements InterfaceC13008a {
    public final AppCompatImageView check;
    public final AppCompatTextView option;
    private final ConstraintLayout rootView;
    public final AppCompatTextView votes;

    private StreamUiItemOptionBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = constraintLayout;
        this.check = appCompatImageView;
        this.option = appCompatTextView;
        this.votes = appCompatTextView2;
    }

    public static StreamUiItemOptionBinding bind(View view) {
        int i13 = C19469R.id.check;
        AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC34235f.m108203J(view, i13);
        if (appCompatImageView != null) {
            i13 = C19469R.id.option;
            AppCompatTextView appCompatTextView = (AppCompatTextView) AbstractC34235f.m108203J(view, i13);
            if (appCompatTextView != null) {
                i13 = C19469R.id.votes;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) AbstractC34235f.m108203J(view, i13);
                if (appCompatTextView2 != null) {
                    return new StreamUiItemOptionBinding((ConstraintLayout) view, appCompatImageView, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemOptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemOptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_option, viewGroup, false);
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
