package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiSuggestionListViewBinding implements InterfaceC13008a {
    public final TextView commandsTitleTextView;
    private final View rootView;
    public final MaterialCardView suggestionsCardView;
    public final RecyclerView suggestionsRecyclerView;

    private StreamUiSuggestionListViewBinding(View view, TextView textView, MaterialCardView materialCardView, RecyclerView recyclerView) {
        this.rootView = view;
        this.commandsTitleTextView = textView;
        this.suggestionsCardView = materialCardView;
        this.suggestionsRecyclerView = recyclerView;
    }

    public static StreamUiSuggestionListViewBinding bind(View view) {
        int i13 = C19469R.id.commandsTitleTextView;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            i13 = C19469R.id.suggestionsCardView;
            MaterialCardView materialCardView = (MaterialCardView) AbstractC34235f.m108203J(view, i13);
            if (materialCardView != null) {
                i13 = C19469R.id.suggestionsRecyclerView;
                RecyclerView recyclerView = (RecyclerView) AbstractC34235f.m108203J(view, i13);
                if (recyclerView != null) {
                    return new StreamUiSuggestionListViewBinding(view, textView, materialCardView, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiSuggestionListViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C19469R.layout.stream_ui_suggestion_list_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }
}
