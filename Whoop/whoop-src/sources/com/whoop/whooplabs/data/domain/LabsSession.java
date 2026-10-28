package com.whoop.whooplabs.data.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.whooplabs.data.remote.domain.dto.SessionDto;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\nJ\u001a\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\n¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/whooplabs/data/domain/LabsSession;", "Landroid/os/Parcelable;", "", "campaignSessionId", "<init>", "(I)V", "Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;", "toDto", "()Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "copy", "(I)Lcom/whoop/whooplabs/data/domain/LabsSession;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCampaignSessionId", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class LabsSession implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<LabsSession> CREATOR = new Creator();
    private final int campaignSessionId;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<LabsSession> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LabsSession createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new LabsSession(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LabsSession[] newArray(int i13) {
            return new LabsSession[i13];
        }
    }

    public LabsSession(int i13) {
        this.campaignSessionId = i13;
    }

    public static /* synthetic */ LabsSession copy$default(LabsSession labsSession, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = labsSession.campaignSessionId;
        }
        return labsSession.copy(i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCampaignSessionId() {
        return this.campaignSessionId;
    }

    public final LabsSession copy(int campaignSessionId) {
        return new LabsSession(campaignSessionId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LabsSession) && this.campaignSessionId == ((LabsSession) other).campaignSessionId;
    }

    public final int getCampaignSessionId() {
        return this.campaignSessionId;
    }

    public int hashCode() {
        return Integer.hashCode(this.campaignSessionId);
    }

    public final SessionDto toDto() {
        return new SessionDto(Integer.valueOf(this.campaignSessionId));
    }

    public String toString() {
        return AbstractC2875y.m8296i(this.campaignSessionId, "LabsSession(campaignSessionId=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.campaignSessionId);
    }
}
