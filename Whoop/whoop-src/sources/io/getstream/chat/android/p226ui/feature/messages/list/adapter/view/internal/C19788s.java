package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import c93.InterfaceC4339a;
import io.getstream.chat.android.client.audio.AudioPlayer;
import l83.C23454a0;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.s */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19788s implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74660w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f74661x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f74662y;

    public /* synthetic */ C19788s(int i13, Object obj, Object obj2) {
        this.f74660w = i13;
        this.f74661x = obj;
        this.f74662y = obj2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f74660w) {
            case 0:
                RecordingFileAttachmentViewHolder.registerButtonsListeners$lambda$12((RecordingFileAttachmentViewHolder) this.f74661x, (AudioPlayer) this.f74662y);
                break;
            case 1:
                RecordingFileAttachmentViewHolder.registerButtonsListeners$lambda$13((RecordingFileAttachmentViewHolder) this.f74661x, (AudioPlayer) this.f74662y);
                break;
            default:
                MediaAttachmentView.showMediaPreview$lambda$11((MediaAttachmentView) this.f74661x, (InterfaceC4339a) this.f74662y);
                break;
        }
        return C23454a0.f92919a;
    }
}
