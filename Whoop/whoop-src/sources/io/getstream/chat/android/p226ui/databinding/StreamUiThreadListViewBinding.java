package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiThreadListViewBinding implements InterfaceC13008a {
    public final LinearLayout emptyContainer;
    public final ImageView emptyImage;
    public final TextView emptyTextView;
    public final ProgressBar progressBar;
    private final View rootView;
    public final RecyclerView threadListRecyclerView;
    public final TextView unreadThreadsBannerTextView;

    private StreamUiThreadListViewBinding(View view, LinearLayout linearLayout, ImageView imageView, TextView textView, ProgressBar progressBar, RecyclerView recyclerView, TextView textView2) {
        this.rootView = view;
        this.emptyContainer = linearLayout;
        this.emptyImage = imageView;
        this.emptyTextView = textView;
        this.progressBar = progressBar;
        this.threadListRecyclerView = recyclerView;
        this.unreadThreadsBannerTextView = textView2;
    }

    public static StreamUiThreadListViewBinding bind(View view) {
        int i13 = C19469R.id.emptyContainer;
        LinearLayout linearLayout = (LinearLayout) AbstractC34235f.m108203J(view, i13);
        if (linearLayout != null) {
            i13 = C19469R.id.emptyImage;
            ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
            if (imageView != null) {
                i13 = C19469R.id.emptyTextView;
                TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView != null) {
                    i13 = C19469R.id.progressBar;
                    ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i13);
                    if (progressBar != null) {
                        i13 = C19469R.id.threadListRecyclerView;
                        RecyclerView recyclerView = (RecyclerView) AbstractC34235f.m108203J(view, i13);
                        if (recyclerView != null) {
                            i13 = C19469R.id.unreadThreadsBannerTextView;
                            TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                            if (textView2 != null) {
                                return new StreamUiThreadListViewBinding(view, linearLayout, imageView, textView, progressBar, recyclerView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiThreadListViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C19469R.layout.stream_ui_thread_list_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }
}
