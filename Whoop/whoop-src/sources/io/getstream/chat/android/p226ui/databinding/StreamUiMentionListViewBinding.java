package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiMentionListViewBinding implements InterfaceC13008a {
    public final LinearLayout emptyContainer;
    public final ImageView emptyImage;
    public final TextView emptyLabel;
    public final RecyclerView mentionListRecyclerView;
    private final View rootView;

    private StreamUiMentionListViewBinding(View view, LinearLayout linearLayout, ImageView imageView, TextView textView, RecyclerView recyclerView) {
        this.rootView = view;
        this.emptyContainer = linearLayout;
        this.emptyImage = imageView;
        this.emptyLabel = textView;
        this.mentionListRecyclerView = recyclerView;
    }

    public static StreamUiMentionListViewBinding bind(View view) {
        int i13 = C19469R.id.emptyContainer;
        LinearLayout linearLayout = (LinearLayout) AbstractC34235f.m108203J(view, i13);
        if (linearLayout != null) {
            i13 = C19469R.id.emptyImage;
            ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
            if (imageView != null) {
                i13 = C19469R.id.emptyLabel;
                TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView != null) {
                    i13 = C19469R.id.mentionListRecyclerView;
                    RecyclerView recyclerView = (RecyclerView) AbstractC34235f.m108203J(view, i13);
                    if (recyclerView != null) {
                        return new StreamUiMentionListViewBinding(view, linearLayout, imageView, textView, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiMentionListViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C19469R.layout.stream_ui_mention_list_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }
}
