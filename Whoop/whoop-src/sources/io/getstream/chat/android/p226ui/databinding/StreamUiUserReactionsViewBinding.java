package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiUserReactionsViewBinding implements InterfaceC13008a {
    public final RecyclerView recyclerView;
    private final CardView rootView;
    public final CardView userReactionsContainer;
    public final TextView userReactionsTitleTextView;

    private StreamUiUserReactionsViewBinding(CardView cardView, RecyclerView recyclerView, CardView cardView2, TextView textView) {
        this.rootView = cardView;
        this.recyclerView = recyclerView;
        this.userReactionsContainer = cardView2;
        this.userReactionsTitleTextView = textView;
    }

    public static StreamUiUserReactionsViewBinding bind(View view) {
        int i13 = C19469R.id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) AbstractC34235f.m108203J(view, i13);
        if (recyclerView != null) {
            CardView cardView = (CardView) view;
            int i14 = C19469R.id.userReactionsTitleTextView;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i14);
            if (textView != null) {
                return new StreamUiUserReactionsViewBinding(cardView, recyclerView, cardView, textView);
            }
            i13 = i14;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiUserReactionsViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiUserReactionsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_user_reactions_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final CardView getRoot() {
        return this.rootView;
    }
}
