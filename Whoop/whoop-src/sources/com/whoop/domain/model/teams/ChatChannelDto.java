package com.whoop.domain.model.teams;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\"J8\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\"J\u0010\u0010)\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b)\u0010\u001bJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\"¨\u00066"}, m65681d2 = {"Lcom/whoop/domain/model/teams/ChatChannelDto;", "Landroid/os/Parcelable;", "", "cid", "id", "type", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/domain/model/teams/ChatChannelDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/domain/model/teams/ChatChannel;", "toChatChannels", "()Lcom/whoop/domain/model/teams/ChatChannel;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/domain/model/teams/ChatChannelDto;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCid", "getId", "getType", "getName", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ChatChannelDto implements Parcelable {

    @SerializedName("cid")
    private final String cid;

    @SerializedName("id")
    private final String id;

    @SerializedName("name")
    private final String name;

    @SerializedName("type")
    private final String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ChatChannelDto> CREATOR = new Creator();

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/model/teams/ChatChannelDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/domain/model/teams/ChatChannelDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ChatChannelDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<ChatChannelDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChatChannelDto createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new ChatChannelDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChatChannelDto[] newArray(int i13) {
            return new ChatChannelDto[i13];
        }
    }

    public /* synthetic */ ChatChannelDto(int i13, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ChatChannelDto$$serializer.INSTANCE.getDescriptor());
        }
        this.cid = str;
        this.id = str2;
        this.type = str3;
        this.name = str4;
    }

    public static /* synthetic */ ChatChannelDto copy$default(ChatChannelDto chatChannelDto, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = chatChannelDto.cid;
        }
        if ((i13 & 2) != 0) {
            str2 = chatChannelDto.id;
        }
        if ((i13 & 4) != 0) {
            str3 = chatChannelDto.type;
        }
        if ((i13 & 8) != 0) {
            str4 = chatChannelDto.name;
        }
        return chatChannelDto.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$core_release(ChatChannelDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.cid);
        output.encodeStringElement(serialDesc, 1, self.id);
        output.encodeStringElement(serialDesc, 2, self.type);
        output.encodeStringElement(serialDesc, 3, self.name);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final ChatChannelDto copy(String cid, String id4, String type, String name) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(name, "name");
        return new ChatChannelDto(cid, id4, type, name);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatChannelDto)) {
            return false;
        }
        ChatChannelDto chatChannelDto = (ChatChannelDto) other;
        return AbstractC22676k.m65745e(this.cid, chatChannelDto.cid) && AbstractC22676k.m65745e(this.id, chatChannelDto.id) && AbstractC22676k.m65745e(this.type, chatChannelDto.type) && AbstractC22676k.m65745e(this.name, chatChannelDto.name);
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.name.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.cid.hashCode() * 31, 31, this.id), 31, this.type);
    }

    public final ChatChannel toChatChannels() {
        return new ChatChannel(this.cid, this.id, this.type, this.name);
    }

    public String toString() {
        String str = this.cid;
        String str2 = this.id;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("ChatChannelDto(cid=", str, ", id=", str2, ", type="), this.type, ", name=", this.name, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.cid);
        dest.writeString(this.id);
        dest.writeString(this.type);
        dest.writeString(this.name);
    }

    public ChatChannelDto(String cid, String id4, String type, String name) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(name, "name");
        this.cid = cid;
        this.id = id4;
        this.type = type;
        this.name = name;
    }
}
