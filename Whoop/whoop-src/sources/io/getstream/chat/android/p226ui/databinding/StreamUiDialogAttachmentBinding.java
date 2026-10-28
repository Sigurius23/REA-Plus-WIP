package io.getstream.chat.android.p226ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.card.MaterialCardView;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.C19469R;
import p507tx.AbstractC34235f;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamUiDialogAttachmentBinding implements InterfaceC13008a {
    public final ImageButton attachButton;
    public final LinearLayout attachmentButtonsContainer;
    public final ViewPager2 attachmentPager;
    public final ConstraintLayout container;
    public final MaterialCardView pagerContainer;
    private final ConstraintLayout rootView;

    private StreamUiDialogAttachmentBinding(ConstraintLayout constraintLayout, ImageButton imageButton, LinearLayout linearLayout, ViewPager2 viewPager2, ConstraintLayout constraintLayout2, MaterialCardView materialCardView) {
        this.rootView = constraintLayout;
        this.attachButton = imageButton;
        this.attachmentButtonsContainer = linearLayout;
        this.attachmentPager = viewPager2;
        this.container = constraintLayout2;
        this.pagerContainer = materialCardView;
    }

    public static StreamUiDialogAttachmentBinding bind(View view) {
        int i13 = C19469R.id.attachButton;
        ImageButton imageButton = (ImageButton) AbstractC34235f.m108203J(view, i13);
        if (imageButton != null) {
            i13 = C19469R.id.attachmentButtonsContainer;
            LinearLayout linearLayout = (LinearLayout) AbstractC34235f.m108203J(view, i13);
            if (linearLayout != null) {
                i13 = C19469R.id.attachmentPager;
                ViewPager2 viewPager2 = (ViewPager2) AbstractC34235f.m108203J(view, i13);
                if (viewPager2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i13 = C19469R.id.pagerContainer;
                    MaterialCardView materialCardView = (MaterialCardView) AbstractC34235f.m108203J(view, i13);
                    if (materialCardView != null) {
                        return new StreamUiDialogAttachmentBinding(constraintLayout, imageButton, linearLayout, viewPager2, constraintLayout, materialCardView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static StreamUiDialogAttachmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.rootView;
    }

    public static StreamUiDialogAttachmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(C19469R.layout.stream_ui_dialog_attachment, viewGroup, false);
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
