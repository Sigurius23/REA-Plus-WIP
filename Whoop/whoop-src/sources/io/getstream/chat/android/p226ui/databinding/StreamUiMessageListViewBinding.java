package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.ScrollButtonView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiMessageListViewBinding implements InterfaceC13008a {
    public final FrameLayout blurLayer;
    public final RecyclerView chatMessagesRV;
    public final TextView defaultEmptyStateView;
    public final ProgressBar defaultLoadingView;
    public final FrameLayout emptyStateViewContainer;
    public final FrameLayout loadingViewContainer;
    public final FrameLayout messageOptionsContainer;
    public final ScrollView messageOptionsScroll;
    private final View rootView;
    public final ScrollButtonView scrollToBottomButton;
    public final MaterialButton unreadLabelButton;

    private StreamUiMessageListViewBinding(View view, FrameLayout frameLayout, RecyclerView recyclerView, TextView textView, ProgressBar progressBar, FrameLayout frameLayout2, FrameLayout frameLayout3, FrameLayout frameLayout4, ScrollView scrollView, ScrollButtonView scrollButtonView, MaterialButton materialButton) {
        this.rootView = view;
        this.blurLayer = frameLayout;
        this.chatMessagesRV = recyclerView;
        this.defaultEmptyStateView = textView;
        this.defaultLoadingView = progressBar;
        this.emptyStateViewContainer = frameLayout2;
        this.loadingViewContainer = frameLayout3;
        this.messageOptionsContainer = frameLayout4;
        this.messageOptionsScroll = scrollView;
        this.scrollToBottomButton = scrollButtonView;
        this.unreadLabelButton = materialButton;
    }

    public static StreamUiMessageListViewBinding bind(View view) {
        int i13 = C19469R.id.blurLayer;
        FrameLayout frameLayout = (FrameLayout) AbstractC34235f.m108203J(view, i13);
        if (frameLayout != null) {
            i13 = C19469R.id.chatMessagesRV;
            RecyclerView recyclerView = (RecyclerView) AbstractC34235f.m108203J(view, i13);
            if (recyclerView != null) {
                i13 = C19469R.id.defaultEmptyStateView;
                TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView != null) {
                    i13 = C19469R.id.defaultLoadingView;
                    ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i13);
                    if (progressBar != null) {
                        i13 = C19469R.id.emptyStateViewContainer;
                        FrameLayout frameLayout2 = (FrameLayout) AbstractC34235f.m108203J(view, i13);
                        if (frameLayout2 != null) {
                            i13 = C19469R.id.loadingViewContainer;
                            FrameLayout frameLayout3 = (FrameLayout) AbstractC34235f.m108203J(view, i13);
                            if (frameLayout3 != null) {
                                i13 = C19469R.id.messageOptionsContainer;
                                FrameLayout frameLayout4 = (FrameLayout) AbstractC34235f.m108203J(view, i13);
                                if (frameLayout4 != null) {
                                    i13 = C19469R.id.messageOptionsScroll;
                                    ScrollView scrollView = (ScrollView) AbstractC34235f.m108203J(view, i13);
                                    if (scrollView != null) {
                                        i13 = C19469R.id.scrollToBottomButton;
                                        ScrollButtonView scrollButtonView = (ScrollButtonView) AbstractC34235f.m108203J(view, i13);
                                        if (scrollButtonView != null) {
                                            i13 = C19469R.id.unreadLabelButton;
                                            MaterialButton materialButton = (MaterialButton) AbstractC34235f.m108203J(view, i13);
                                            if (materialButton != null) {
                                                return new StreamUiMessageListViewBinding(view, frameLayout, recyclerView, textView, progressBar, frameLayout2, frameLayout3, frameLayout4, scrollView, scrollButtonView, materialButton);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiMessageListViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C19469R.layout.stream_ui_message_list_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }
}
