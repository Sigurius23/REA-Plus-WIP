package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemResultBinding implements InterfaceC13008a {
    public final ImageView award;
    public final AppCompatTextView option;
    public final RecyclerView optionList;
    private final ConstraintLayout rootView;
    public final AppCompatButton showAll;
    public final AppCompatTextView votes;

    private StreamUiItemResultBinding(ConstraintLayout constraintLayout, ImageView imageView, AppCompatTextView appCompatTextView, RecyclerView recyclerView, AppCompatButton appCompatButton, AppCompatTextView appCompatTextView2) {
        this.rootView = constraintLayout;
        this.award = imageView;
        this.option = appCompatTextView;
        this.optionList = recyclerView;
        this.showAll = appCompatButton;
        this.votes = appCompatTextView2;
    }

    public static StreamUiItemResultBinding bind(View view) {
        int i13 = C19469R.id.award;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = C19469R.id.option;
            AppCompatTextView appCompatTextView = (AppCompatTextView) AbstractC34235f.m108203J(view, i13);
            if (appCompatTextView != null) {
                i13 = C19469R.id.optionList;
                RecyclerView recyclerView = (RecyclerView) AbstractC34235f.m108203J(view, i13);
                if (recyclerView != null) {
                    i13 = C19469R.id.showAll;
                    AppCompatButton appCompatButton = (AppCompatButton) AbstractC34235f.m108203J(view, i13);
                    if (appCompatButton != null) {
                        i13 = C19469R.id.votes;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) AbstractC34235f.m108203J(view, i13);
                        if (appCompatTextView2 != null) {
                            return new StreamUiItemResultBinding((ConstraintLayout) view, imageView, appCompatTextView, recyclerView, appCompatButton, appCompatTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemResultBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_result, viewGroup, false);
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
