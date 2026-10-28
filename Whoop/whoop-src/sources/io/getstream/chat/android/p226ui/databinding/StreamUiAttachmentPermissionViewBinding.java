package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiAttachmentPermissionViewBinding implements InterfaceC13008a {
    public final LinearLayout grantPermissionsContainer;
    public final ImageView grantPermissionsImageView;
    public final TextView grantPermissionsTextView;
    private final LinearLayout rootView;

    private StreamUiAttachmentPermissionViewBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, TextView textView) {
        this.rootView = linearLayout;
        this.grantPermissionsContainer = linearLayout2;
        this.grantPermissionsImageView = imageView;
        this.grantPermissionsTextView = textView;
    }

    public static StreamUiAttachmentPermissionViewBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i13 = C19469R.id.grantPermissionsImageView;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(view, i13);
        if (imageView != null) {
            i13 = C19469R.id.grantPermissionsTextView;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView != null) {
                return new StreamUiAttachmentPermissionViewBinding(linearLayout, linearLayout, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiAttachmentPermissionViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiAttachmentPermissionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_attachment_permission_view, viewGroup, false);
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
