package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiItemMessageFootnoteBinding implements InterfaceC13008a {
    public final ImageView deliveryStatusIcon;
    public final TextView editedInfo;
    public final TextView editedLabel;
    public final LinearLayoutCompat messageFooterContainer;
    public final LinearLayoutCompat messageFooterContainerInner;
    public final TextView messageFooterLabel;
    public final TextView readCount;
    private final LinearLayoutCompat rootView;
    public final TextView timeView;

    private StreamUiItemMessageFootnoteBinding(LinearLayoutCompat linearLayoutCompat, ImageView imageView, TextView textView, TextView textView2, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayoutCompat;
        this.deliveryStatusIcon = imageView;
        this.editedInfo = textView;
        this.editedLabel = textView2;
        this.messageFooterContainer = linearLayoutCompat2;
        this.messageFooterContainerInner = linearLayoutCompat3;
        this.messageFooterLabel = textView3;
        this.readCount = textView4;
        this.timeView = textView5;
    }

    public static StreamUiItemMessageFootnoteBinding bind(View view) {
        int i13 = C19469R.id.deliveryStatusIcon;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = C19469R.id.editedInfo;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView != null) {
                i13 = C19469R.id.editedLabel;
                TextView textView2 = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView2 != null) {
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                    i13 = C19469R.id.messageFooterContainerInner;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) AbstractC34235f.m108203J(view, i13);
                    if (linearLayoutCompat2 != null) {
                        i13 = C19469R.id.messageFooterLabel;
                        TextView textView3 = (TextView) AbstractC34235f.m108203J(view, i13);
                        if (textView3 != null) {
                            i13 = C19469R.id.readCount;
                            TextView textView4 = (TextView) AbstractC34235f.m108203J(view, i13);
                            if (textView4 != null) {
                                i13 = C19469R.id.timeView;
                                TextView textView5 = (TextView) AbstractC34235f.m108203J(view, i13);
                                if (textView5 != null) {
                                    return new StreamUiItemMessageFootnoteBinding(linearLayoutCompat, imageView, textView, textView2, linearLayoutCompat, linearLayoutCompat2, textView3, textView4, textView5);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiItemMessageFootnoteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiItemMessageFootnoteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_item_message_footnote, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}
