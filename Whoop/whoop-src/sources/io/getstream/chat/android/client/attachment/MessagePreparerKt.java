package io.getstream.chat.android.client.attachment;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.models.Attachment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¨\u0006\u0003"}, m65681d2 = {"prepareForUpload", "", "Lio/getstream/chat/android/models/Attachment;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessagePreparerKt {
    public static final List<Attachment> prepareForUpload(List<Attachment> list) {
        Attachment attachmentCopy$default;
        AbstractC22676k.m65750j(list, "<this>");
        List<Attachment> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (Attachment attachment : list2) {
            if (attachment.getUpload() == null) {
                attachmentCopy$default = Attachment.copy$default(attachment, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, Attachment.UploadState.Success.INSTANCE, null, 786431, null);
            } else {
                Map<String, Object> extraData = attachment.getExtraData();
                String uploadId = AttachmentExtensionsKt.getUploadId(attachment);
                if (uploadId == null) {
                    uploadId = "upload_id_" + UUID.randomUUID();
                }
                attachmentCopy$default = Attachment.copy$default(attachment, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, Attachment.UploadState.Idle.INSTANCE, AbstractC25247g0.m73995d0(extraData, AbstractC25247g0.m73989X(new C23465k(AttachmentExtensionsKt.EXTRA_UPLOAD_ID, uploadId))), 262143, null);
            }
            arrayList.add(attachmentCopy$default);
        }
        return arrayList;
    }
}
