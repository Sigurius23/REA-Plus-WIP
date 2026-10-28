package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import androidx.constraintlayout.widget.C1153p;
import io.getstream.chat.android.client.audio.AudioPlayer;
import io.getstream.chat.android.client.audio.AudioState;
import io.getstream.chat.android.p226ui.common.utils.GiphyInfo;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.view.internal.p */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19785p implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74651w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f74652x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f74653y;

    public /* synthetic */ C19785p(int i13, Object obj, Object obj2) {
        this.f74651w = i13;
        this.f74652x = obj;
        this.f74653y = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74651w) {
            case 0:
                RecordingFileAttachmentViewHolder.registerStateChange$lambda$8((RecordingFileAttachmentViewHolder) this.f74652x, (AudioRecordPlayerView) this.f74653y, (AudioState) obj);
                break;
            case 1:
                RecordingFileAttachmentViewHolder.registerButtonsListeners$lambda$14((RecordingFileAttachmentViewHolder) this.f74652x, (AudioPlayer) this.f74653y, ((Integer) obj).intValue());
                break;
            default:
                GiphyMediaAttachmentView.applyAdaptiveSizing$lambda$0((GiphyMediaAttachmentView) this.f74652x, (GiphyInfo) this.f74653y, (C1153p) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
