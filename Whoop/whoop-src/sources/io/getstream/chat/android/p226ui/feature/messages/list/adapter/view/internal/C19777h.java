package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import c93.InterfaceC4339a;
import l83.C23454a0;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.h */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19777h implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74636w;

    public /* synthetic */ C19777h(int i13) {
        this.f74636w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f74636w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                int i14 = AudioWavesSeekBar.f74614w;
                return c23454a0;
            case 1:
                return Integer.valueOf(MediaAttachmentsGroupView.maxMediaAttachmentHeight_delegate$lambda$0());
            default:
                int i15 = PollView.f74617w;
                return c23454a0;
        }
    }
}
