package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal;

import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import java.util.Map;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.file.internal.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19682a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74530w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ FileAttachmentFragment f74531x;

    public /* synthetic */ C19682a(FileAttachmentFragment fileAttachmentFragment, int i13) {
        this.f74530w = i13;
        this.f74531x = fileAttachmentFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74530w) {
            case 0:
                FileAttachmentFragment.setupViews$lambda$9$lambda$8$lambda$7(this.f74531x, (Map) obj);
                break;
            case 1:
                FileAttachmentFragment.setupViews$lambda$9$lambda$3$lambda$2(this.f74531x, (Map) obj);
                break;
            case 2:
                FileAttachmentFragment.fileAttachmentsAdapter_delegate$lambda$1$lambda$0(this.f74531x, (AttachmentMetaData) obj);
                break;
            default:
                FileAttachmentFragment.setupViews$lambda$9$lambda$6$lambda$5(this.f74531x, (Map) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
