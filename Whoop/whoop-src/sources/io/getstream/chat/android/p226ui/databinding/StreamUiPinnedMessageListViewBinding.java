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
public final class StreamUiPinnedMessageListViewBinding implements InterfaceC13008a {
    public final LinearLayout emptyContainer;
    public final TextView emptyDescriptionTextView;
    public final ImageView emptyImage;
    public final TextView emptyTitleTextView;
    public final RecyclerView pinnedMessageListRecyclerView;
    private final View rootView;

    private StreamUiPinnedMessageListViewBinding(View view, LinearLayout linearLayout, TextView textView, ImageView imageView, TextView textView2, RecyclerView recyclerView) {
        this.rootView = view;
        this.emptyContainer = linearLayout;
        this.emptyDescriptionTextView = textView;
        this.emptyImage = imageView;
        this.emptyTitleTextView = textView2;
        this.pinnedMessageListRecyclerView = recyclerView;
    }

    public static StreamUiPinnedMessageListViewBinding bind(View view) {
        int i13 = C19469R.id.emptyContainer;
        LinearLayout linearLayout = (LinearLayout) AbstractC34235f.m108203J(view, i13);
        if (linearLayout != null) {
            i13 = C19469R.id.emptyDescriptionTextView;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView != null) {
                i13 = C19469R.id.emptyImage;
                ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
                if (imageView != null) {
                    i13 = C19469R.id.emptyTitleTextView;
                    TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                    if (textView2 != null) {
                        i13 = C19469R.id.pinnedMessageListRecyclerView;
                        RecyclerView recyclerView = (RecyclerView) AbstractC34235f.m108203J(view, i13);
                        if (recyclerView != null) {
                            return new StreamUiPinnedMessageListViewBinding(view, linearLayout, textView, imageView, textView2, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiPinnedMessageListViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C19469R.layout.stream_ui_pinned_message_list_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }
}
