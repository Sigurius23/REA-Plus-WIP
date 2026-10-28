package com.whoop.whooplabs.data.room.entity;

import ih0.AbstractC18489d0;
import org.joda.time.LocalDateTime;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J)\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;", "", "timestamp", "Lorg/joda/time/LocalDateTime;", "note", "", "campaignId", "", "<init>", "(Lorg/joda/time/LocalDateTime;Ljava/lang/String;I)V", "getTimestamp", "()Lorg/joda/time/LocalDateTime;", "getNote", "()Ljava/lang/String;", "getCampaignId", "()I", "id", "getId", "setId", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class WhoopLabsStudyTag {
    public static final int $stable = 8;
    private final int campaignId;
    private int id;
    private final String note;
    private final LocalDateTime timestamp;

    public WhoopLabsStudyTag(LocalDateTime timestamp, String str, int i13) {
        AbstractC22676k.m65750j(timestamp, "timestamp");
        this.timestamp = timestamp;
        this.note = str;
        this.campaignId = i13;
    }

    public static /* synthetic */ WhoopLabsStudyTag copy$default(WhoopLabsStudyTag whoopLabsStudyTag, LocalDateTime localDateTime, String str, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            localDateTime = whoopLabsStudyTag.timestamp;
        }
        if ((i14 & 2) != 0) {
            str = whoopLabsStudyTag.note;
        }
        if ((i14 & 4) != 0) {
            i13 = whoopLabsStudyTag.campaignId;
        }
        return whoopLabsStudyTag.copy(localDateTime, str, i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCampaignId() {
        return this.campaignId;
    }

    public final WhoopLabsStudyTag copy(LocalDateTime timestamp, String note, int campaignId) {
        AbstractC22676k.m65750j(timestamp, "timestamp");
        return new WhoopLabsStudyTag(timestamp, note, campaignId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhoopLabsStudyTag)) {
            return false;
        }
        WhoopLabsStudyTag whoopLabsStudyTag = (WhoopLabsStudyTag) other;
        return AbstractC22676k.m65745e(this.timestamp, whoopLabsStudyTag.timestamp) && AbstractC22676k.m65745e(this.note, whoopLabsStudyTag.note) && this.campaignId == whoopLabsStudyTag.campaignId;
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    public final int getId() {
        return this.id;
    }

    public final String getNote() {
        return this.note;
    }

    public final LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = this.timestamp.hashCode() * 31;
        String str = this.note;
        return Integer.hashCode(this.campaignId) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final void setId(int i13) {
        this.id = i13;
    }

    public String toString() {
        LocalDateTime localDateTime = this.timestamp;
        String str = this.note;
        int i13 = this.campaignId;
        StringBuilder sb4 = new StringBuilder("WhoopLabsStudyTag(timestamp=");
        sb4.append(localDateTime);
        sb4.append(", note=");
        sb4.append(str);
        sb4.append(", campaignId=");
        return AbstractC18489d0.m53371l(sb4, i13, ")");
    }
}
