package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.feature.messages.preview.internal.MessagePreviewView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemThreadListBinding implements InterfaceC13008a {
    public final MessagePreviewView latestReplyMessageView;
    public final TextView replyToTextView;
    private final ConstraintLayout rootView;
    public final ImageView threadImage;
    public final TextView threadTitleTextView;
    public final TextView unreadCountBadge;

    private StreamUiItemThreadListBinding(ConstraintLayout constraintLayout, MessagePreviewView messagePreviewView, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.latestReplyMessageView = messagePreviewView;
        this.replyToTextView = textView;
        this.threadImage = imageView;
        this.threadTitleTextView = textView2;
        this.unreadCountBadge = textView3;
    }

    public static StreamUiItemThreadListBinding bind(View view) {
        int i13 = C19469R.id.latestReplyMessageView;
        MessagePreviewView messagePreviewView = (MessagePreviewView) AbstractC34235f.m108203J(view, i13);
        if (messagePreviewView != null) {
            i13 = C19469R.id.replyToTextView;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView != null) {
                i13 = C19469R.id.threadImage;
                ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
                if (imageView != null) {
                    i13 = C19469R.id.threadTitleTextView;
                    TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                    if (textView2 != null) {
                        i13 = C19469R.id.unreadCountBadge;
                        TextView textView3 = (TextView) AbstractC34235f.m108203J(view, i13);
                        if (textView3 != null) {
                            return new StreamUiItemThreadListBinding((ConstraintLayout) view, messagePreviewView, textView, imageView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemThreadListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemThreadListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_thread_list, viewGroup, false);
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
