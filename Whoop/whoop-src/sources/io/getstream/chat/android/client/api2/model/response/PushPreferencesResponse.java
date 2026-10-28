package io.getstream.chat.android.client.api2.model.response;

import io.getstream.chat.android.client.api2.model.dto.DownstreamPushPreferenceDto;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u001e\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003HÆ\u0003JC\u0010\u000e\u001a\u00020\u00002 \b\u0002\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R)\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;", "", "user_channel_preferences", "", "", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;", "user_preferences", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "getUser_channel_preferences", "()Ljava/util/Map;", "getUser_preferences", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class PushPreferencesResponse {
    private final Map<String, Map<String, DownstreamPushPreferenceDto>> user_channel_preferences;
    private final Map<String, DownstreamPushPreferenceDto> user_preferences;

    /* JADX WARN: Multi-variable type inference failed */
    public PushPreferencesResponse(Map<String, ? extends Map<String, DownstreamPushPreferenceDto>> user_channel_preferences, Map<String, DownstreamPushPreferenceDto> user_preferences) {
        AbstractC22676k.m65750j(user_channel_preferences, "user_channel_preferences");
        AbstractC22676k.m65750j(user_preferences, "user_preferences");
        this.user_channel_preferences = user_channel_preferences;
        this.user_preferences = user_preferences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PushPreferencesResponse copy$default(PushPreferencesResponse pushPreferencesResponse, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = pushPreferencesResponse.user_channel_preferences;
        }
        if ((i13 & 2) != 0) {
            map2 = pushPreferencesResponse.user_preferences;
        }
        return pushPreferencesResponse.copy(map, map2);
    }

    public final Map<String, Map<String, DownstreamPushPreferenceDto>> component1() {
        return this.user_channel_preferences;
    }

    public final Map<String, DownstreamPushPreferenceDto> component2() {
        return this.user_preferences;
    }

    public final PushPreferencesResponse copy(Map<String, ? extends Map<String, DownstreamPushPreferenceDto>> user_channel_preferences, Map<String, DownstreamPushPreferenceDto> user_preferences) {
        AbstractC22676k.m65750j(user_channel_preferences, "user_channel_preferences");
        AbstractC22676k.m65750j(user_preferences, "user_preferences");
        return new PushPreferencesResponse(user_channel_preferences, user_preferences);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushPreferencesResponse)) {
            return false;
        }
        PushPreferencesResponse pushPreferencesResponse = (PushPreferencesResponse) other;
        return AbstractC22676k.m65745e(this.user_channel_preferences, pushPreferencesResponse.user_channel_preferences) && AbstractC22676k.m65745e(this.user_preferences, pushPreferencesResponse.user_preferences);
    }

    public final Map<String, Map<String, DownstreamPushPreferenceDto>> getUser_channel_preferences() {
        return this.user_channel_preferences;
    }

    public final Map<String, DownstreamPushPreferenceDto> getUser_preferences() {
        return this.user_preferences;
    }

    public int hashCode() {
        return this.user_preferences.hashCode() + (this.user_channel_preferences.hashCode() * 31);
    }

    public String toString() {
        return "PushPreferencesResponse(user_channel_preferences=" + this.user_channel_preferences + ", user_preferences=" + this.user_preferences + ")";
    }
}
