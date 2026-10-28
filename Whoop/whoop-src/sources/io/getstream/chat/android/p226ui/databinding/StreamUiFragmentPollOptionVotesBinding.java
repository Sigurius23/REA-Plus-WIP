package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiFragmentPollOptionVotesBinding implements InterfaceC13008a {
    public final FrameLayout loadingContainer;
    public final ProgressBar loadingMoreProgress;
    private final ConstraintLayout rootView;
    public final Toolbar toolbar;
    public final RecyclerView voteList;

    private StreamUiFragmentPollOptionVotesBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ProgressBar progressBar, Toolbar toolbar, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.loadingContainer = frameLayout;
        this.loadingMoreProgress = progressBar;
        this.toolbar = toolbar;
        this.voteList = recyclerView;
    }

    public static StreamUiFragmentPollOptionVotesBinding bind(View view) {
        int i13 = C19469R.id.loadingContainer;
        FrameLayout frameLayout = (FrameLayout) AbstractC34235f.m108203J(view, i13);
        if (frameLayout != null) {
            i13 = C19469R.id.loadingMoreProgress;
            ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i13);
            if (progressBar != null) {
                i13 = C19469R.id.toolbar;
                Toolbar toolbar = (Toolbar) AbstractC34235f.m108203J(view, i13);
                if (toolbar != null) {
                    i13 = C19469R.id.voteList;
                    RecyclerView recyclerView = (RecyclerView) AbstractC34235f.m108203J(view, i13);
                    if (recyclerView != null) {
                        return new StreamUiFragmentPollOptionVotesBinding((ConstraintLayout) view, frameLayout, progressBar, toolbar, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiFragmentPollOptionVotesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiFragmentPollOptionVotesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_fragment_poll_option_votes, viewGroup, false);
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
