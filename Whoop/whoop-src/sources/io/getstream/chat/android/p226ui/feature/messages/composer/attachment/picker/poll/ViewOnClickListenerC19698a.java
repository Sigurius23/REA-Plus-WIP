package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.poll;

import android.view.View;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC19698a implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74541w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CreatePollDialogFragment f74542x;

    public /* synthetic */ ViewOnClickListenerC19698a(CreatePollDialogFragment createPollDialogFragment, int i13) {
        this.f74541w = i13;
        this.f74542x = createPollDialogFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f74541w) {
            case 0:
                CreatePollDialogFragment.setupToolbar$lambda$12(this.f74542x, view);
                break;
            default:
                CreatePollDialogFragment.m55278G(this.f74542x, view);
                break;
        }
    }
}
