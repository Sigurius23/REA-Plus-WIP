package io.getstream.chat.android.client.api2.model.response;

import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/BlockUserResponse;", "", "blocked_by_user_id", "", "blocked_user_id", "created_at", "Ljava/util/Date;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V", "getBlocked_by_user_id", "()Ljava/lang/String;", "getBlocked_user_id", "getCreated_at", "()Ljava/util/Date;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class BlockUserResponse {
    private final String blocked_by_user_id;
    private final String blocked_user_id;
    private final Date created_at;

    public BlockUserResponse(String blocked_by_user_id, String blocked_user_id, Date created_at) {
        AbstractC22676k.m65750j(blocked_by_user_id, "blocked_by_user_id");
        AbstractC22676k.m65750j(blocked_user_id, "blocked_user_id");
        AbstractC22676k.m65750j(created_at, "created_at");
        this.blocked_by_user_id = blocked_by_user_id;
        this.blocked_user_id = blocked_user_id;
        this.created_at = created_at;
    }

    public static /* synthetic */ BlockUserResponse copy$default(BlockUserResponse blockUserResponse, String str, String str2, Date date, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = blockUserResponse.blocked_by_user_id;
        }
        if ((i13 & 2) != 0) {
            str2 = blockUserResponse.blocked_user_id;
        }
        if ((i13 & 4) != 0) {
            date = blockUserResponse.created_at;
        }
        return blockUserResponse.copy(str, str2, date);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBlocked_by_user_id() {
        return this.blocked_by_user_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBlocked_user_id() {
        return this.blocked_user_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    public final BlockUserResponse copy(String blocked_by_user_id, String blocked_user_id, Date created_at) {
        AbstractC22676k.m65750j(blocked_by_user_id, "blocked_by_user_id");
        AbstractC22676k.m65750j(blocked_user_id, "blocked_user_id");
        AbstractC22676k.m65750j(created_at, "created_at");
        return new BlockUserResponse(blocked_by_user_id, blocked_user_id, created_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockUserResponse)) {
            return false;
        }
        BlockUserResponse blockUserResponse = (BlockUserResponse) other;
        return AbstractC22676k.m65745e(this.blocked_by_user_id, blockUserResponse.blocked_by_user_id) && AbstractC22676k.m65745e(this.blocked_user_id, blockUserResponse.blocked_user_id) && AbstractC22676k.m65745e(this.created_at, blockUserResponse.created_at);
    }

    public final String getBlocked_by_user_id() {
        return this.blocked_by_user_id;
    }

    public final String getBlocked_user_id() {
        return this.blocked_user_id;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public int hashCode() {
        return this.created_at.hashCode() + AbstractC11266d.m30450d(this.blocked_by_user_id.hashCode() * 31, 31, this.blocked_user_id);
    }

    public String toString() {
        String str = this.blocked_by_user_id;
        String str2 = this.blocked_user_id;
        return AbstractC13673n.m38564k(AbstractC11895b.m32001t("BlockUserResponse(blocked_by_user_id=", str, ", blocked_user_id=", str2, ", created_at="), this.created_at, ")");
    }
}
