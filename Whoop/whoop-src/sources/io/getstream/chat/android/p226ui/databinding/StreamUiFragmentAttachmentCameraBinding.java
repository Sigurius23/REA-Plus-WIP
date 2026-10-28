package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiFragmentAttachmentCameraBinding implements InterfaceC13008a {
    public final StreamUiAttachmentPermissionViewBinding grantPermissionsInclude;
    private final ConstraintLayout rootView;

    private StreamUiFragmentAttachmentCameraBinding(ConstraintLayout constraintLayout, StreamUiAttachmentPermissionViewBinding streamUiAttachmentPermissionViewBinding) {
        this.rootView = constraintLayout;
        this.grantPermissionsInclude = streamUiAttachmentPermissionViewBinding;
    }

    public static StreamUiFragmentAttachmentCameraBinding bind(View view) {
        int i13 = C19469R.id.grantPermissionsInclude;
        View viewM108203J = AbstractC34235f.m108203J(view, i13);
        if (viewM108203J == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
        }
        return new StreamUiFragmentAttachmentCameraBinding((ConstraintLayout) view, StreamUiAttachmentPermissionViewBinding.bind(viewM108203J));
    }

    public static StreamUiFragmentAttachmentCameraBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiFragmentAttachmentCameraBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_fragment_attachment_camera, viewGroup, false);
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
