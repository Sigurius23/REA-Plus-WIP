package io.getstream.chat.android.client.api2.model.requests;

import com.whoop.profile.domain.ProfileApiKt;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30731q;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/FlagUserRequest;", "Lio/getstream/chat/android/client/api2/model/requests/FlagRequest;", ProfileApiKt.TARGET_USER_ID_PARAM, "", "reason", "custom", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getTargetUserId", "()Ljava/lang/String;", "getReason", "getCustom", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class FlagUserRequest extends FlagRequest {
    private final Map<String, String> custom;
    private final String reason;
    private final String targetUserId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagUserRequest(@InterfaceC30731q(name = "target_user_id") String targetUserId, @InterfaceC30731q(name = "reason") String str, @InterfaceC30731q(name = "custom") Map<String, String> custom) {
        super(null);
        AbstractC22676k.m65750j(targetUserId, "targetUserId");
        AbstractC22676k.m65750j(custom, "custom");
        this.targetUserId = targetUserId;
        this.reason = str;
        this.custom = custom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlagUserRequest copy$default(FlagUserRequest flagUserRequest, String str, String str2, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = flagUserRequest.targetUserId;
        }
        if ((i13 & 2) != 0) {
            str2 = flagUserRequest.reason;
        }
        if ((i13 & 4) != 0) {
            map = flagUserRequest.custom;
        }
        return flagUserRequest.copy(str, str2, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTargetUserId() {
        return this.targetUserId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final Map<String, String> component3() {
        return this.custom;
    }

    public final FlagUserRequest copy(@InterfaceC30731q(name = "target_user_id") String targetUserId, @InterfaceC30731q(name = "reason") String reason, @InterfaceC30731q(name = "custom") Map<String, String> custom) {
        AbstractC22676k.m65750j(targetUserId, "targetUserId");
        AbstractC22676k.m65750j(custom, "custom");
        return new FlagUserRequest(targetUserId, reason, custom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlagUserRequest)) {
            return false;
        }
        FlagUserRequest flagUserRequest = (FlagUserRequest) other;
        return AbstractC22676k.m65745e(this.targetUserId, flagUserRequest.targetUserId) && AbstractC22676k.m65745e(this.reason, flagUserRequest.reason) && AbstractC22676k.m65745e(this.custom, flagUserRequest.custom);
    }

    @Override // io.getstream.chat.android.client.api2.model.requests.FlagRequest
    public Map<String, String> getCustom() {
        return this.custom;
    }

    @Override // io.getstream.chat.android.client.api2.model.requests.FlagRequest
    public String getReason() {
        return this.reason;
    }

    public final String getTargetUserId() {
        return this.targetUserId;
    }

    public int hashCode() {
        int iHashCode = this.targetUserId.hashCode() * 31;
        String str = this.reason;
        return this.custom.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.targetUserId;
        String str2 = this.reason;
        return AbstractC13673n.m38565l(AbstractC11895b.m32001t("FlagUserRequest(targetUserId=", str, ", reason=", str2, ", custom="), this.custom, ")");
    }
}
