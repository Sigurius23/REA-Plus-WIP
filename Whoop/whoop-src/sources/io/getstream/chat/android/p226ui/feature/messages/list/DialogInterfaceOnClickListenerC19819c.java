package io.getstream.chat.android.p226ui.feature.messages.list;

import android.content.DialogInterface;
import c93.InterfaceC4339a;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC19819c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74732w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f74733x;

    public /* synthetic */ DialogInterfaceOnClickListenerC19819c(InterfaceC4339a interfaceC4339a, int i13) {
        this.f74732w = i13;
        this.f74733x = interfaceC4339a;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i13) {
        switch (this.f74732w) {
            case 0:
                MessageListView.confirmFlagMessageHandler$lambda$28$lambda$26(this.f74733x, dialogInterface, i13);
                break;
            default:
                MessageListView.confirmDeleteMessageHandler$lambda$25$lambda$23(this.f74733x, dialogInterface, i13);
                break;
        }
    }
}
