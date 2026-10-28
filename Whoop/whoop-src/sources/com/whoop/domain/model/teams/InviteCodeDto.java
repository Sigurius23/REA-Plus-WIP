package com.whoop.domain.model.teams;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J.\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010\"J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u001a\u0010)\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010 R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\"¨\u00065"}, m65681d2 = {"Lcom/whoop/domain/model/teams/InviteCodeDto;", "Landroid/os/Parcelable;", "", "id", "", "deleted", "", "inviteCode", "<init>", "(IZLjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/domain/model/teams/InviteCodeDto;Lzc3/c;Lyc3/g;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Z", "component3", "()Ljava/lang/String;", "copy", "(IZLjava/lang/String;)Lcom/whoop/domain/model/teams/InviteCodeDto;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Z", "getDeleted", "Ljava/lang/String;", "getInviteCode", "getInviteCode$annotations", "()V", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class InviteCodeDto implements Parcelable {

    @SerializedName("deleted")
    private final boolean deleted;

    @SerializedName("id")
    private final int id;

    @SerializedName("code")
    private final String inviteCode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<InviteCodeDto> CREATOR = new Creator();

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/model/teams/InviteCodeDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/domain/model/teams/InviteCodeDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return InviteCodeDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<InviteCodeDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InviteCodeDto createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new InviteCodeDto(parcel.readInt(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InviteCodeDto[] newArray(int i13) {
            return new InviteCodeDto[i13];
        }
    }

    public /* synthetic */ InviteCodeDto(int i13, int i14, boolean z4, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, InviteCodeDto$$serializer.INSTANCE.getDescriptor());
        }
        this.id = i14;
        this.deleted = z4;
        this.inviteCode = str;
    }

    public static /* synthetic */ InviteCodeDto copy$default(InviteCodeDto inviteCodeDto, int i13, boolean z4, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = inviteCodeDto.id;
        }
        if ((i14 & 2) != 0) {
            z4 = inviteCodeDto.deleted;
        }
        if ((i14 & 4) != 0) {
            str = inviteCodeDto.inviteCode;
        }
        return inviteCodeDto.copy(i13, z4, str);
    }

    @InterfaceC37143h("code")
    public static /* synthetic */ void getInviteCode$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(InviteCodeDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.id);
        output.encodeBooleanElement(serialDesc, 1, self.deleted);
        output.encodeStringElement(serialDesc, 2, self.inviteCode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInviteCode() {
        return this.inviteCode;
    }

    public final InviteCodeDto copy(int id4, boolean deleted, String inviteCode) {
        AbstractC22676k.m65750j(inviteCode, "inviteCode");
        return new InviteCodeDto(id4, deleted, inviteCode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InviteCodeDto)) {
            return false;
        }
        InviteCodeDto inviteCodeDto = (InviteCodeDto) other;
        return this.id == inviteCodeDto.id && this.deleted == inviteCodeDto.deleted && AbstractC22676k.m65745e(this.inviteCode, inviteCodeDto.inviteCode);
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final int getId() {
        return this.id;
    }

    public final String getInviteCode() {
        return this.inviteCode;
    }

    public int hashCode() {
        return this.inviteCode.hashCode() + AbstractC2875y.m8289b(Integer.hashCode(this.id) * 31, 31, this.deleted);
    }

    public String toString() {
        int i13 = this.id;
        boolean z4 = this.deleted;
        String str = this.inviteCode;
        StringBuilder sb4 = new StringBuilder("InviteCodeDto(id=");
        sb4.append(i13);
        sb4.append(", deleted=");
        sb4.append(z4);
        sb4.append(", inviteCode=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.id);
        dest.writeInt(this.deleted ? 1 : 0);
        dest.writeString(this.inviteCode);
    }

    public InviteCodeDto(int i13, boolean z4, String inviteCode) {
        AbstractC22676k.m65750j(inviteCode, "inviteCode");
        this.id = i13;
        this.deleted = z4;
        this.inviteCode = inviteCode;
    }
}
