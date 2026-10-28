package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiAttachmentGalleryOptionsViewBinding implements InterfaceC13008a {
    public final TextView delete;
    public final CardView optionsContainer;
    public final TextView reply;
    private final CardView rootView;
    public final TextView saveMedia;
    public final TextView showInChat;

    private StreamUiAttachmentGalleryOptionsViewBinding(CardView cardView, TextView textView, CardView cardView2, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = cardView;
        this.delete = textView;
        this.optionsContainer = cardView2;
        this.reply = textView2;
        this.saveMedia = textView3;
        this.showInChat = textView4;
    }

    public static StreamUiAttachmentGalleryOptionsViewBinding bind(View view) {
        int i13 = C19469R.id.delete;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            CardView cardView = (CardView) view;
            i13 = C19469R.id.reply;
            TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView2 != null) {
                i13 = C19469R.id.saveMedia;
                TextView textView3 = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView3 != null) {
                    i13 = C19469R.id.showInChat;
                    TextView textView4 = (TextView) AbstractC34235f.m108203J(view, i13);
                    if (textView4 != null) {
                        return new StreamUiAttachmentGalleryOptionsViewBinding(cardView, textView, cardView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiAttachmentGalleryOptionsViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiAttachmentGalleryOptionsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_attachment_gallery_options_view, viewGroup, false);
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
