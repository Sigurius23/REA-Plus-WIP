package io.getstream.chat.android.models;

import java.util.Map;
import live.hms.video.utils.HMSConstantsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u0002H\bH\u0016¢\u0006\u0002\u0010\u000bR\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/models/CustomObject;", "", "extraData", "", "", "getExtraData", "()Ljava/util/Map;", "getExtraValue", "T", "key", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Attachment;", "Lio/getstream/chat/android/models/Channel;", "Lio/getstream/chat/android/models/DraftMessage;", "Lio/getstream/chat/android/models/Member;", "Lio/getstream/chat/android/models/MemberData;", "Lio/getstream/chat/android/models/Message;", "Lio/getstream/chat/android/models/Reaction;", "Lio/getstream/chat/android/models/Thread;", "Lio/getstream/chat/android/models/ThreadInfo;", "Lio/getstream/chat/android/models/User;", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface CustomObject {

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static <T> T getExtraValue(CustomObject customObject, String key, T t14) {
            AbstractC22676k.m65750j(key, "key");
            return (T) CustomObject.super.getExtraValue(key, t14);
        }
    }

    Map<String, Object> getExtraData();

    default <T> T getExtraValue(String key, T t14) {
        AbstractC22676k.m65750j(key, "key");
        return getExtraData().containsKey(key) ? (T) getExtraData().get(key) : t14;
    }
}
