package io.getstream.chat.android.client.audio;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Attachment;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"audioHash", "", "Lio/getstream/chat/android/models/Attachment;", "getAudioHash$annotations", "(Lio/getstream/chat/android/models/Attachment;)V", "getAudioHash", "(Lio/getstream/chat/android/models/Attachment;)I", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AudioHashKt {
    public static final int getAudioHash(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        return attachment.hashCode();
    }

    @InternalStreamChatApi
    public static /* synthetic */ void getAudioHash$annotations(Attachment attachment) {
    }
}
