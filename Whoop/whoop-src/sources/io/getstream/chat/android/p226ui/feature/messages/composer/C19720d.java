package io.getstream.chat.android.p226ui.feature.messages.composer;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19720d implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74583w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MessageComposerView f74584x;

    public /* synthetic */ C19720d(MessageComposerView messageComposerView, int i13) {
        this.f74583w = i13;
        this.f74584x = messageComposerView;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.f74583w) {
            case 0:
                MessageComposerView.m55233q(this.f74584x);
                break;
            default:
                MessageComposerView.m55240x(this.f74584x);
                break;
        }
    }
}
