package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.view.View;
import c93.InterfaceC4339a;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC19772c implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74624w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f74625x;

    public /* synthetic */ ViewOnClickListenerC19772c(InterfaceC4339a interfaceC4339a, int i13) {
        this.f74624w = i13;
        this.f74625x = interfaceC4339a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f74624w;
        InterfaceC4339a interfaceC4339a = this.f74625x;
        switch (i13) {
            case 0:
                int i14 = AudioRecordPlayerView.f74613w;
                interfaceC4339a.invoke();
                break;
            default:
                int i15 = AudioRecordPlayerView.f74613w;
                interfaceC4339a.invoke();
                break;
        }
    }
}
