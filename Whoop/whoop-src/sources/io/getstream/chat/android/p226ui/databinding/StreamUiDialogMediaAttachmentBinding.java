package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.feature.gallery.overview.MediaAttachmentGridView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiDialogMediaAttachmentBinding implements InterfaceC13008a {
    public final ImageView closeButton;
    public final MediaAttachmentGridView mediaAttachmentGridView;
    private final LinearLayout rootView;
    public final TextView title;

    private StreamUiDialogMediaAttachmentBinding(LinearLayout linearLayout, ImageView imageView, MediaAttachmentGridView mediaAttachmentGridView, TextView textView) {
        this.rootView = linearLayout;
        this.closeButton = imageView;
        this.mediaAttachmentGridView = mediaAttachmentGridView;
        this.title = textView;
    }

    public static StreamUiDialogMediaAttachmentBinding bind(View view) {
        int i13 = C19469R.id.closeButton;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = C19469R.id.mediaAttachmentGridView;
            MediaAttachmentGridView mediaAttachmentGridView = (MediaAttachmentGridView) AbstractC34235f.m108203J(view, i13);
            if (mediaAttachmentGridView != null) {
                i13 = C19469R.id.title;
                TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
                if (textView != null) {
                    return new StreamUiDialogMediaAttachmentBinding((LinearLayout) view, imageView, mediaAttachmentGridView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiDialogMediaAttachmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiDialogMediaAttachmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_dialog_media_attachment, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final LinearLayout getRoot() {
        return this.rootView;
    }
}
