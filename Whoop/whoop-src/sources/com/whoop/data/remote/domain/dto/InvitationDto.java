package com.whoop.data.remote.domain.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.domain.model.Invitation;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
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
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u000eJ4\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u000eJ\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u0012\u0004\b)\u0010*R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u0012\u0004\b+\u0010*¨\u0006."}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/InvitationDto;", "", "", "type", "teamName", "teamIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component2", "()Ljava/lang/String;", "component3", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/InvitationDto;Lzc3/c;Lyc3/g;)V", "write$Self", "inviteCode", "Lcom/whoop/domain/model/Invitation;", "toInvitation", "(Ljava/lang/String;)Lcom/whoop/domain/model/Invitation;", "component1", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/InvitationDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getTeamName$annotations", "()V", "getTeamIcon$annotations", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class InvitationDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("teamIcon")
    private final String teamIcon;

    @SerializedName("teamName")
    private final String teamName;

    @SerializedName("type")
    private final String type;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/InvitationDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/InvitationDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return InvitationDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ InvitationDto(int i13, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i13 & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 6, InvitationDto$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        this.teamName = str2;
        this.teamIcon = str3;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getTeamName() {
        return this.teamName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final String getTeamIcon() {
        return this.teamIcon;
    }

    public static /* synthetic */ InvitationDto copy$default(InvitationDto invitationDto, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = invitationDto.type;
        }
        if ((i13 & 2) != 0) {
            str2 = invitationDto.teamName;
        }
        if ((i13 & 4) != 0) {
            str3 = invitationDto.teamIcon;
        }
        return invitationDto.copy(str, str2, str3);
    }

    @InterfaceC37143h("teamIcon")
    private static /* synthetic */ void getTeamIcon$annotations() {
    }

    @InterfaceC37143h("teamName")
    private static /* synthetic */ void getTeamName$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(InvitationDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.type != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.type);
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.teamName);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.teamIcon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final InvitationDto copy(String type, String teamName, String teamIcon) {
        return new InvitationDto(type, teamName, teamIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvitationDto)) {
            return false;
        }
        InvitationDto invitationDto = (InvitationDto) other;
        return AbstractC22676k.m65745e(this.type, invitationDto.type) && AbstractC22676k.m65745e(this.teamName, invitationDto.teamName) && AbstractC22676k.m65745e(this.teamIcon, invitationDto.teamIcon);
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.teamName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.teamIcon;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Invitation toInvitation(String inviteCode) {
        AbstractC22676k.m65750j(inviteCode, "inviteCode");
        return new Invitation(inviteCode, Invitation.Type.USER, this.teamName, this.teamIcon);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.teamIcon, ")", AbstractC11895b.m32001t("InvitationDto(type=", this.type, ", teamName=", this.teamName, ", teamIcon="));
    }

    public InvitationDto(String str, String str2, String str3) {
        this.type = str;
        this.teamName = str2;
        this.teamIcon = str3;
    }

    public /* synthetic */ InvitationDto(String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, str2, str3);
    }
}
