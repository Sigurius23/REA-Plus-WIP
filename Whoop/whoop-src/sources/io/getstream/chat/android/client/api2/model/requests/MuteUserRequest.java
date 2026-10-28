package io.getstream.chat.android.client.api2.model.requests;

import d13.AbstractC11478a;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/MuteUserRequest;", "", "target_id", "", "user_id", "timeout", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getTarget_id", "()Ljava/lang/String;", "getUser_id", "getTimeout", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/getstream/chat/android/client/api2/model/requests/MuteUserRequest;", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MuteUserRequest {
    private final String target_id;
    private final Integer timeout;
    private final String user_id;

    public MuteUserRequest(String target_id, String user_id, Integer num) {
        AbstractC22676k.m65750j(target_id, "target_id");
        AbstractC22676k.m65750j(user_id, "user_id");
        this.target_id = target_id;
        this.user_id = user_id;
        this.timeout = num;
    }

    public static /* synthetic */ MuteUserRequest copy$default(MuteUserRequest muteUserRequest, String str, String str2, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = muteUserRequest.target_id;
        }
        if ((i13 & 2) != 0) {
            str2 = muteUserRequest.user_id;
        }
        if ((i13 & 4) != 0) {
            num = muteUserRequest.timeout;
        }
        return muteUserRequest.copy(str, str2, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTarget_id() {
        return this.target_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUser_id() {
        return this.user_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTimeout() {
        return this.timeout;
    }

    public final MuteUserRequest copy(String target_id, String user_id, Integer timeout) {
        AbstractC22676k.m65750j(target_id, "target_id");
        AbstractC22676k.m65750j(user_id, "user_id");
        return new MuteUserRequest(target_id, user_id, timeout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MuteUserRequest)) {
            return false;
        }
        MuteUserRequest muteUserRequest = (MuteUserRequest) other;
        return AbstractC22676k.m65745e(this.target_id, muteUserRequest.target_id) && AbstractC22676k.m65745e(this.user_id, muteUserRequest.user_id) && AbstractC22676k.m65745e(this.timeout, muteUserRequest.timeout);
    }

    public final String getTarget_id() {
        return this.target_id;
    }

    public final Integer getTimeout() {
        return this.timeout;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.target_id.hashCode() * 31, 31, this.user_id);
        Integer num = this.timeout;
        return iM30450d + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        String str = this.target_id;
        String str2 = this.user_id;
        return AbstractC11478a.m30859k(AbstractC11895b.m32001t("MuteUserRequest(target_id=", str, ", user_id=", str2, ", timeout="), this.timeout, ")");
    }
}
