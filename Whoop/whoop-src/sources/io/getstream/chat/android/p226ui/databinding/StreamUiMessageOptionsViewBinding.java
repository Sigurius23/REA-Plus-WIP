package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiMessageOptionsViewBinding implements InterfaceC13008a {
    public final CardView messageOptionsContainer;
    public final LinearLayout optionListContainer;
    private final CardView rootView;

    private StreamUiMessageOptionsViewBinding(CardView cardView, CardView cardView2, LinearLayout linearLayout) {
        this.rootView = cardView;
        this.messageOptionsContainer = cardView2;
        this.optionListContainer = linearLayout;
    }

    public static StreamUiMessageOptionsViewBinding bind(View view) {
        CardView cardView = (CardView) view;
        int i13 = C19469R.id.optionListContainer;
        LinearLayout linearLayout = (LinearLayout) AbstractC34235f.m108203J(view, i13);
        if (linearLayout != null) {
            return new StreamUiMessageOptionsViewBinding(cardView, cardView, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiMessageOptionsViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiMessageOptionsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_message_options_view, viewGroup, false);
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
