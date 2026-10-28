package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import io.getstream.chat.android.client.audio.ProgressData;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.q */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19786q implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74654w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AudioRecordPlayerView f74655x;

    public /* synthetic */ C19786q(AudioRecordPlayerView audioRecordPlayerView, int i13) {
        this.f74654w = i13;
        this.f74655x = audioRecordPlayerView;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74654w) {
            case 0:
                RecordingFileAttachmentViewHolder.registerStateChange$lambda$9(this.f74655x, (ProgressData) obj);
                break;
            default:
                AudioRecordingAttachmentsGroupView.registerStateChange$lambda$27(this.f74655x, (ProgressData) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
