package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiFragmentPollResultsBinding implements InterfaceC13008a {
    public final FrameLayout loadingContainer;
    public final NestedScrollView nestedScrollView;
    public final RecyclerView optionList;
    public final AppCompatTextView question;
    private final ConstraintLayout rootView;
    public final Toolbar toolbar;

    private StreamUiFragmentPollResultsBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, NestedScrollView nestedScrollView, RecyclerView recyclerView, AppCompatTextView appCompatTextView, Toolbar toolbar) {
        this.rootView = constraintLayout;
        this.loadingContainer = frameLayout;
        this.nestedScrollView = nestedScrollView;
        this.optionList = recyclerView;
        this.question = appCompatTextView;
        this.toolbar = toolbar;
    }

    public static StreamUiFragmentPollResultsBinding bind(View view) {
        int i13 = C19469R.id.loadingContainer;
        FrameLayout frameLayout = (FrameLayout) AbstractC34235f.m108203J(view, i13);
        if (frameLayout != null) {
            i13 = C19469R.id.nestedScrollView;
            NestedScrollView nestedScrollView = (NestedScrollView) AbstractC34235f.m108203J(view, i13);
            if (nestedScrollView != null) {
                i13 = C19469R.id.optionList;
                RecyclerView recyclerView = (RecyclerView) AbstractC34235f.m108203J(view, i13);
                if (recyclerView != null) {
                    i13 = C19469R.id.question;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) AbstractC34235f.m108203J(view, i13);
                    if (appCompatTextView != null) {
                        i13 = C19469R.id.toolbar;
                        Toolbar toolbar = (Toolbar) AbstractC34235f.m108203J(view, i13);
                        if (toolbar != null) {
                            return new StreamUiFragmentPollResultsBinding((ConstraintLayout) view, frameLayout, nestedScrollView, recyclerView, appCompatTextView, toolbar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiFragmentPollResultsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiFragmentPollResultsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_fragment_poll_results, viewGroup, false);
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
