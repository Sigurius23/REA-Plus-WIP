package io.getstream.chat.android.client.api2.model.response;

import io.getstream.chat.android.client.api2.model.dto.DownstreamPushPreferenceDto;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¨\u0006\u0007"}, m65681d2 = {"getUserPreference", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;", "Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;", "userId", "", "getUserChannelPreference", "cid", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PushPreferencesResponseKt {
    public static final DownstreamPushPreferenceDto getUserChannelPreference(PushPreferencesResponse pushPreferencesResponse, String userId, String cid) {
        AbstractC22676k.m65750j(pushPreferencesResponse, "<this>");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(cid, "cid");
        Map<String, DownstreamPushPreferenceDto> map = pushPreferencesResponse.getUser_channel_preferences().get(userId);
        if (map != null) {
            return map.get(cid);
        }
        return null;
    }

    public static final DownstreamPushPreferenceDto getUserPreference(PushPreferencesResponse pushPreferencesResponse, String userId) {
        AbstractC22676k.m65750j(pushPreferencesResponse, "<this>");
        AbstractC22676k.m65750j(userId, "userId");
        return pushPreferencesResponse.getUser_preferences().get(userId);
    }
}
