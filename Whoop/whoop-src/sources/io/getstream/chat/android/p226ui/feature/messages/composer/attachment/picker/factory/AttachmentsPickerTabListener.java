package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory;

import io.getstream.chat.android.models.CreatePollParams;
import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import java.util.List;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/AttachmentsPickerTabListener;", "", "", "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "attachments", "Ll83/a0;", "onSelectedAttachmentsChanged", "(Ljava/util/List;)V", "onSelectedAttachmentsSubmitted", "()V", "Lio/getstream/chat/android/models/CreatePollParams;", "createPollParams", "onPollSubmitted", "(Lio/getstream/chat/android/models/CreatePollParams;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface AttachmentsPickerTabListener {
    void onPollSubmitted(CreatePollParams createPollParams);

    void onSelectedAttachmentsChanged(List<AttachmentMetaData> attachments);

    void onSelectedAttachmentsSubmitted();
}
