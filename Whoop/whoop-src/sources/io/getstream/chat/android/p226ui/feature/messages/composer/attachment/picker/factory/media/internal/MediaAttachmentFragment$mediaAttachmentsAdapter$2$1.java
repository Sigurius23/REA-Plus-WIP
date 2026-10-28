package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.media.internal;

import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class MediaAttachmentFragment$mediaAttachmentsAdapter$2$1 extends C22672i implements Function1 {
    public MediaAttachmentFragment$mediaAttachmentsAdapter$2$1(Object obj) {
        super(1, 0, MediaAttachmentFragment.class, obj, "updateMediaAttachment", "updateMediaAttachment(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V");
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AttachmentMetaData) obj);
        return C23454a0.f92919a;
    }

    public final void invoke(AttachmentMetaData p13) {
        AbstractC22676k.m65750j(p13, "p0");
        ((MediaAttachmentFragment) this.receiver).updateMediaAttachment(p13);
    }
}
