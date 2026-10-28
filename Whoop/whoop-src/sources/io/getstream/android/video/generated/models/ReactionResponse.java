package io.getstream.android.video.generated.models;

import com.whoop.service.network.model.UserState;
import java.util.Map;
import m83.C25272z;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0003\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bHÆ\u0003JC\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0018\b\u0003\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R!\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/android/video/generated/models/ReactionResponse;", "", "type", "", UserState.Sources.USER, "Lio/getstream/android/video/generated/models/UserResponse;", "emojiCode", "custom", "", "(Ljava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;Ljava/util/Map;)V", "getCustom", "()Ljava/util/Map;", "getEmojiCode", "()Ljava/lang/String;", "getType", "getUser", "()Lio/getstream/android/video/generated/models/UserResponse;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class ReactionResponse {
    private final Map<String, Object> custom;
    private final String emojiCode;
    private final String type;
    private final UserResponse user;

    public ReactionResponse(@InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user, @InterfaceC30731q(name = "emoji_code") String str, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(user, "user");
        this.type = type;
        this.user = user;
        this.emojiCode = str;
        this.custom = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReactionResponse copy$default(ReactionResponse reactionResponse, String str, UserResponse userResponse, String str2, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = reactionResponse.type;
        }
        if ((i13 & 2) != 0) {
            userResponse = reactionResponse.user;
        }
        if ((i13 & 4) != 0) {
            str2 = reactionResponse.emojiCode;
        }
        if ((i13 & 8) != 0) {
            map = reactionResponse.custom;
        }
        return reactionResponse.copy(str, userResponse, str2, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UserResponse getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmojiCode() {
        return this.emojiCode;
    }

    public final Map<String, Object> component4() {
        return this.custom;
    }

    public final ReactionResponse copy(@InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user, @InterfaceC30731q(name = "emoji_code") String emojiCode, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(user, "user");
        return new ReactionResponse(type, user, emojiCode, custom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReactionResponse)) {
            return false;
        }
        ReactionResponse reactionResponse = (ReactionResponse) other;
        return AbstractC22676k.m65745e(this.type, reactionResponse.type) && AbstractC22676k.m65745e(this.user, reactionResponse.user) && AbstractC22676k.m65745e(this.emojiCode, reactionResponse.emojiCode) && AbstractC22676k.m65745e(this.custom, reactionResponse.custom);
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    public final String getEmojiCode() {
        return this.emojiCode;
    }

    public final String getType() {
        return this.type;
    }

    public final UserResponse getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = (this.user.hashCode() + (this.type.hashCode() * 31)) * 31;
        String str = this.emojiCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.custom;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        UserResponse userResponse = this.user;
        String str2 = this.emojiCode;
        Map<String, Object> map = this.custom;
        StringBuilder sb4 = new StringBuilder("ReactionResponse(type=");
        sb4.append(str);
        sb4.append(", user=");
        sb4.append(userResponse);
        sb4.append(", emojiCode=");
        return AbstractC30007c.m91842l(sb4, str2, ", custom=", map, ")");
    }

    public /* synthetic */ ReactionResponse(String str, UserResponse userResponse, String str2, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, userResponse, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? C25272z.f99163w : map);
    }
}
