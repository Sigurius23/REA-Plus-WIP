package io.getstream.chat.android.p226ui.feature.messages.list;

import android.content.DialogInterface;
import j93.InterfaceC21493z;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC19821d implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74736w;

    public /* synthetic */ DialogInterfaceOnClickListenerC19821d(int i13) {
        this.f74736w = i13;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i13) {
        switch (this.f74736w) {
            case 0:
                InterfaceC21493z[] interfaceC21493zArr = MessageListView.$$delegatedProperties;
                dialogInterface.dismiss();
                break;
            default:
                InterfaceC21493z[] interfaceC21493zArr2 = MessageListView.$$delegatedProperties;
                dialogInterface.dismiss();
                break;
        }
    }
}
