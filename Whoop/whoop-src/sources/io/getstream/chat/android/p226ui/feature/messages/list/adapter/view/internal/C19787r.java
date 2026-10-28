package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import c93.InterfaceC4339a;
import io.getstream.chat.android.client.audio.AudioPlayer;
import io.getstream.chat.android.models.Attachment;
import l83.C23454a0;
import p133f1.C13990x;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.r */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19787r implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74656w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f74657x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f74658y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f74659z;

    public /* synthetic */ C19787r(Object obj, Object obj2, Object obj3, int i13) {
        this.f74656w = i13;
        this.f74657x = obj;
        this.f74658y = obj2;
        this.f74659z = obj3;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f74656w) {
            case 0:
                RecordingFileAttachmentViewHolder.registerButtonsListeners$lambda$11((RecordingFileAttachmentViewHolder) this.f74657x, (AudioPlayer) this.f74658y, (AudioRecordPlayerView) this.f74659z);
                break;
            default:
                MediaAttachmentView.showAttachment$lambda$6((C13990x) this.f74657x, (MediaAttachmentView) this.f74658y, (Attachment) this.f74659z);
                break;
        }
        return C23454a0.f92919a;
    }
}
