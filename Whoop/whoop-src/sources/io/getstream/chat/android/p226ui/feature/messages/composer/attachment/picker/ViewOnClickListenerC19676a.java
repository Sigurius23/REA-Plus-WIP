package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker;

import android.view.View;
import android.widget.CheckedTextView;
import sq0.C32881a;
import sq0.C32883c;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC19676a implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74526w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f74527x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f74528y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f74529z;

    public /* synthetic */ ViewOnClickListenerC19676a(Object obj, Object obj2, int i13, int i14) {
        this.f74526w = i14;
        this.f74528y = obj;
        this.f74529z = obj2;
        this.f74527x = i13;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f74526w) {
            case 0:
                AttachmentsPickerDialogFragment.setupTabs$lambda$2$lambda$1((AttachmentsPickerDialogFragment) this.f74528y, (CheckedTextView) this.f74529z, this.f74527x, view);
                break;
            default:
                C32883c.m103201k((C32881a) this.f74528y, (C32883c) this.f74529z, this.f74527x, view);
                break;
        }
    }
}
