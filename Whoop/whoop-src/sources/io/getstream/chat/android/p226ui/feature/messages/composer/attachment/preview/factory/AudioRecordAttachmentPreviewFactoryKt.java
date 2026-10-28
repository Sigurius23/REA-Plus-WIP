package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.factory;

import androidx.core.app.NotificationCompat;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001f\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0002\u0010\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m65681d2 = {"NULL_DURATION", "", "progressToDecimal", "", NotificationCompat.CATEGORY_PROGRESS, "totalDuration", "(ILjava/lang/Float;)I", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AudioRecordAttachmentPreviewFactoryKt {
    private static final float NULL_DURATION = 0.0f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int progressToDecimal(int i13, Float f13) {
        return (int) ((i13 * (f13 != null ? f13.floatValue() : 0.0f)) / 100);
    }
}
