package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.factory;

import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.AudioRecordPlayerView;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.preview.factory.AudioRecordAttachmentPreviewFactory$AudioRecordAttachmentPreviewViewHolder$registerStateChange$3 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class C19702x2104d570 extends C22672i implements Function1 {
    public C19702x2104d570(Object obj) {
        super(1, 0, AudioRecordPlayerView.class, obj, "setSpeedText", "setSpeedText(F)V");
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return C23454a0.f92919a;
    }

    public final void invoke(float f13) {
        ((AudioRecordPlayerView) this.receiver).setSpeedText(f13);
    }
}
