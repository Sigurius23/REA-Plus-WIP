package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.feature.gallery.options.internal.AttachmentGalleryOptionsView;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiFragmentAttachmentOptionsBinding implements InterfaceC13008a {
    public final AttachmentGalleryOptionsView attachmentOptionsMenu;
    private final FrameLayout rootView;

    private StreamUiFragmentAttachmentOptionsBinding(FrameLayout frameLayout, AttachmentGalleryOptionsView attachmentGalleryOptionsView) {
        this.rootView = frameLayout;
        this.attachmentOptionsMenu = attachmentGalleryOptionsView;
    }

    public static StreamUiFragmentAttachmentOptionsBinding bind(View view) {
        int i13 = C19469R.id.attachmentOptionsMenu;
        AttachmentGalleryOptionsView attachmentGalleryOptionsView = (AttachmentGalleryOptionsView) AbstractC34235f.m108203J(view, i13);
        if (attachmentGalleryOptionsView != null) {
            return new StreamUiFragmentAttachmentOptionsBinding((FrameLayout) view, attachmentGalleryOptionsView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiFragmentAttachmentOptionsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiFragmentAttachmentOptionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_fragment_attachment_options, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    public final FrameLayout getRoot() {
        return this.rootView;
    }
}
