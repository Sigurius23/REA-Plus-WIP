package io.getstream.chat.android.p226ui.feature.messages.list.options.message;

import android.view.View;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.options.message.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC19872a implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74784w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MessageOptionsDialogFragment f74785x;

    public /* synthetic */ ViewOnClickListenerC19872a(MessageOptionsDialogFragment messageOptionsDialogFragment, int i13) {
        this.f74784w = i13;
        this.f74785x = messageOptionsDialogFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f74784w) {
            case 0:
                this.f74785x.dismiss();
                break;
            case 1:
                this.f74785x.dismiss();
                break;
            default:
                this.f74785x.dismiss();
                break;
        }
    }
}
