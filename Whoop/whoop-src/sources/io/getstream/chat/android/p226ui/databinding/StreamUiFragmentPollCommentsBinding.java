package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiFragmentPollCommentsBinding implements InterfaceC13008a {
    public final RecyclerView commentList;
    public final AppCompatTextView ctaButton;
    public final FrameLayout ctaContainer;
    private final ConstraintLayout rootView;
    public final Toolbar toolbar;

    private StreamUiFragmentPollCommentsBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, AppCompatTextView appCompatTextView, FrameLayout frameLayout, Toolbar toolbar) {
        this.rootView = constraintLayout;
        this.commentList = recyclerView;
        this.ctaButton = appCompatTextView;
        this.ctaContainer = frameLayout;
        this.toolbar = toolbar;
    }

    public static StreamUiFragmentPollCommentsBinding bind(View view) {
        int i13 = C19469R.id.commentList;
        RecyclerView recyclerView = (RecyclerView) AbstractC34235f.m108203J(view, i13);
        if (recyclerView != null) {
            i13 = C19469R.id.ctaButton;
            AppCompatTextView appCompatTextView = (AppCompatTextView) AbstractC34235f.m108203J(view, i13);
            if (appCompatTextView != null) {
                i13 = C19469R.id.ctaContainer;
                FrameLayout frameLayout = (FrameLayout) AbstractC34235f.m108203J(view, i13);
                if (frameLayout != null) {
                    i13 = C19469R.id.toolbar;
                    Toolbar toolbar = (Toolbar) AbstractC34235f.m108203J(view, i13);
                    if (toolbar != null) {
                        return new StreamUiFragmentPollCommentsBinding((ConstraintLayout) view, recyclerView, appCompatTextView, frameLayout, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiFragmentPollCommentsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiFragmentPollCommentsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_fragment_poll_comments, viewGroup, false);
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
