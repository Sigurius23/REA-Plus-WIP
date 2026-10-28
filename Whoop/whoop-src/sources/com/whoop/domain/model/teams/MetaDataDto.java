package com.whoop.domain.model.teams;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.profile.domain.ProfileApiKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J.\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u001a\u0010)\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010 ¨\u00062"}, m65681d2 = {"Lcom/whoop/domain/model/teams/MetaDataDto;", "Landroid/os/Parcelable;", "", ProfileApiKt.COMMUNITY_ID_PARAM, "memberCount", "", "deleted", "<init>", "(IIZ)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIIZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/domain/model/teams/MetaDataDto;Lzc3/c;Lyc3/g;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "component3", "()Z", "copy", "(IIZ)Lcom/whoop/domain/model/teams/MetaDataDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getCommunityId", "getMemberCount", "Z", "getDeleted", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MetaDataDto implements Parcelable {

    @SerializedName("community_id")
    private final int communityId;

    @SerializedName("deleted")
    private final boolean deleted;

    @SerializedName("member_count")
    private final int memberCount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<MetaDataDto> CREATOR = new Creator();

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/model/teams/MetaDataDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/domain/model/teams/MetaDataDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MetaDataDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<MetaDataDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MetaDataDto createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new MetaDataDto(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MetaDataDto[] newArray(int i13) {
            return new MetaDataDto[i13];
        }
    }

    public /* synthetic */ MetaDataDto(int i13, int i14, int i15, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, MetaDataDto$$serializer.INSTANCE.getDescriptor());
        }
        this.communityId = i14;
        this.memberCount = i15;
        this.deleted = z4;
    }

    public static /* synthetic */ MetaDataDto copy$default(MetaDataDto metaDataDto, int i13, int i14, boolean z4, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = metaDataDto.communityId;
        }
        if ((i15 & 2) != 0) {
            i14 = metaDataDto.memberCount;
        }
        if ((i15 & 4) != 0) {
            z4 = metaDataDto.deleted;
        }
        return metaDataDto.copy(i13, i14, z4);
    }

    public static final /* synthetic */ void write$Self$core_release(MetaDataDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.communityId);
        output.encodeIntElement(serialDesc, 1, self.memberCount);
        output.encodeBooleanElement(serialDesc, 2, self.deleted);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCommunityId() {
        return this.communityId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMemberCount() {
        return this.memberCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    public final MetaDataDto copy(int communityId, int memberCount, boolean deleted) {
        return new MetaDataDto(communityId, memberCount, deleted);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetaDataDto)) {
            return false;
        }
        MetaDataDto metaDataDto = (MetaDataDto) other;
        return this.communityId == metaDataDto.communityId && this.memberCount == metaDataDto.memberCount && this.deleted == metaDataDto.deleted;
    }

    public final int getCommunityId() {
        return this.communityId;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final int getMemberCount() {
        return this.memberCount;
    }

    public int hashCode() {
        return Boolean.hashCode(this.deleted) + AbstractC11266d.m30448b(this.memberCount, Integer.hashCode(this.communityId) * 31, 31);
    }

    public String toString() {
        int i13 = this.communityId;
        int i14 = this.memberCount;
        return AbstractC18489d0.m53372m(AbstractC11266d.m30465s(i13, i14, "MetaDataDto(communityId=", ", memberCount=", ", deleted="), this.deleted, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.communityId);
        dest.writeInt(this.memberCount);
        dest.writeInt(this.deleted ? 1 : 0);
    }

    public MetaDataDto(int i13, int i14, boolean z4) {
        this.communityId = i13;
        this.memberCount = i14;
        this.deleted = z4;
    }
}
