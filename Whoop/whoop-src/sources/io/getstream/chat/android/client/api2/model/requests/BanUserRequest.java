package io.getstream.chat.android.client.api2.model.requests;

import jh3.AbstractC21702c;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JN\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/BanUserRequest;", "", "target_user_id", "", "timeout", "", "reason", "type", "id", "shadow", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getTarget_user_id", "()Ljava/lang/String;", "getTimeout", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getReason", "getType", "getId", "getShadow", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lio/getstream/chat/android/client/api2/model/requests/BanUserRequest;", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class BanUserRequest {
    private final String id;
    private final String reason;
    private final boolean shadow;
    private final String target_user_id;
    private final Integer timeout;
    private final String type;

    public BanUserRequest(String target_user_id, Integer num, String str, String type, String id4, boolean z4) {
        AbstractC22676k.m65750j(target_user_id, "target_user_id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(id4, "id");
        this.target_user_id = target_user_id;
        this.timeout = num;
        this.reason = str;
        this.type = type;
        this.id = id4;
        this.shadow = z4;
    }

    public static /* synthetic */ BanUserRequest copy$default(BanUserRequest banUserRequest, String str, Integer num, String str2, String str3, String str4, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = banUserRequest.target_user_id;
        }
        if ((i13 & 2) != 0) {
            num = banUserRequest.timeout;
        }
        if ((i13 & 4) != 0) {
            str2 = banUserRequest.reason;
        }
        if ((i13 & 8) != 0) {
            str3 = banUserRequest.type;
        }
        if ((i13 & 16) != 0) {
            str4 = banUserRequest.id;
        }
        if ((i13 & 32) != 0) {
            z4 = banUserRequest.shadow;
        }
        String str5 = str4;
        boolean z13 = z4;
        return banUserRequest.copy(str, num, str2, str3, str5, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTarget_user_id() {
        return this.target_user_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getTimeout() {
        return this.timeout;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getShadow() {
        return this.shadow;
    }

    public final BanUserRequest copy(String target_user_id, Integer timeout, String reason, String type, String id4, boolean shadow) {
        AbstractC22676k.m65750j(target_user_id, "target_user_id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(id4, "id");
        return new BanUserRequest(target_user_id, timeout, reason, type, id4, shadow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BanUserRequest)) {
            return false;
        }
        BanUserRequest banUserRequest = (BanUserRequest) other;
        return AbstractC22676k.m65745e(this.target_user_id, banUserRequest.target_user_id) && AbstractC22676k.m65745e(this.timeout, banUserRequest.timeout) && AbstractC22676k.m65745e(this.reason, banUserRequest.reason) && AbstractC22676k.m65745e(this.type, banUserRequest.type) && AbstractC22676k.m65745e(this.id, banUserRequest.id) && this.shadow == banUserRequest.shadow;
    }

    public final String getId() {
        return this.id;
    }

    public final String getReason() {
        return this.reason;
    }

    public final boolean getShadow() {
        return this.shadow;
    }

    public final String getTarget_user_id() {
        return this.target_user_id;
    }

    public final Integer getTimeout() {
        return this.timeout;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.target_user_id.hashCode() * 31;
        Integer num = this.timeout;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.reason;
        return Boolean.hashCode(this.shadow) + AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.type), 31, this.id);
    }

    public String toString() {
        String str = this.target_user_id;
        Integer num = this.timeout;
        String str2 = this.reason;
        String str3 = this.type;
        String str4 = this.id;
        boolean z4 = this.shadow;
        StringBuilder sb4 = new StringBuilder("BanUserRequest(target_user_id=");
        sb4.append(str);
        sb4.append(", timeout=");
        sb4.append(num);
        sb4.append(", reason=");
        AbstractC11266d.m30444B(sb4, str2, ", type=", str3, ", id=");
        return AbstractC21702c.m61137h(sb4, str4, ", shadow=", z4, ")");
    }
}
