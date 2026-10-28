package com.whoop.domain.model.teams;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import com.google.gson.annotations.SerializedName;
import com.whoop.data.remote.domain.dto.community.memberstories.AmaHostDto;
import com.whoop.data.remote.domain.dto.community.memberstories.AmaHostDto$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.api.QueryParams;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\b\u0007\u0018\u0000 O2\u00020\u0001:\u0002POB§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019BÅ\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ'\u0010&\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+J\u001d\u0010/\u001a\u00020#2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0002¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010+R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b6\u00105R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b7\u00105R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b8\u00105R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b9\u00105R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00103\u0012\u0004\b;\u0010<\u001a\u0004\b:\u00105R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b=\u00105R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b>\u00105R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b?\u00105R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b@\u00105R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bD\u0010CR\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bE\u0010CR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bF\u0010CR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00103\u001a\u0004\bJ\u00105R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010K\u0012\u0004\bN\u0010<\u001a\u0004\bL\u0010M¨\u0006Q"}, m65681d2 = {"Lcom/whoop/domain/model/teams/MemberStoryDto;", "Landroid/os/Parcelable;", "", "id", "", "createdAt", "updatedAt", "title", "publishDate", QueryParams.URL, "image", "urlText", "ctaText", "contentType", "description", "", "deleted", "featured", "live", "archived", "hostId", "liveTime", "Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;", "hostDto", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/Integer;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/Integer;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/domain/model/teams/MemberStoryDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/domain/model/teams/MemberStory;", "toMemoryStory", "()Lcom/whoop/domain/model/teams/MemberStory;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "Ljava/lang/String;", "getCreatedAt", "()Ljava/lang/String;", "getUpdatedAt", "getTitle", "getPublishDate", "getUrl", "getImage", "getImage$annotations", "()V", "getUrlText", "getCtaText", "getContentType", "getDescription", "Z", "getDeleted", "()Z", "getFeatured", "getLive", "getArchived", "Ljava/lang/Integer;", "getHostId", "()Ljava/lang/Integer;", "getLiveTime", "Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;", "getHostDto", "()Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;", "getHostDto$annotations", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final class MemberStoryDto implements Parcelable {

    @SerializedName("archived")
    private final boolean archived;

    @SerializedName("content_type")
    private final String contentType;

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("cta_text")
    private final String ctaText;

    @SerializedName("deleted")
    private final boolean deleted;

    @SerializedName("description")
    private final String description;

    @SerializedName("featured")
    private final boolean featured;

    @SerializedName("host")
    private final AmaHostDto hostDto;

    @SerializedName("host_id")
    private final Integer hostId;

    @SerializedName("id")
    private final int id;

    @SerializedName("image_url")
    private final String image;

    @SerializedName("live")
    private final boolean live;

    @SerializedName("live_time")
    private final String liveTime;

    @SerializedName("publish_date")
    private final String publishDate;

    @SerializedName("title")
    private final String title;

    @SerializedName("updated_at")
    private final String updatedAt;

    @SerializedName(QueryParams.URL)
    private final String url;

    @SerializedName("url_text")
    private final String urlText;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<MemberStoryDto> CREATOR = new Creator();

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/model/teams/MemberStoryDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/domain/model/teams/MemberStoryDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MemberStoryDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<MemberStoryDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemberStoryDto createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            int i13 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            boolean z4 = false;
            boolean z13 = true;
            if (parcel.readInt() != 0) {
                z4 = true;
            }
            if (parcel.readInt() == 0) {
                z13 = z4;
            }
            if (parcel.readInt() == 0) {
                z13 = z4;
            }
            return new MemberStoryDto(i13, string, string2, string3, string4, string5, string6, string7, string8, string9, string10, z4, z13, z13, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : AmaHostDto.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemberStoryDto[] newArray(int i13) {
            return new MemberStoryDto[i13];
        }
    }

    public /* synthetic */ MemberStoryDto(int i13, int i14, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z4, boolean z13, boolean z14, boolean z15, Integer num, String str11, AmaHostDto amaHostDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (262143 != (i13 & 262143)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 262143, MemberStoryDto$$serializer.INSTANCE.getDescriptor());
        }
        this.id = i14;
        this.createdAt = str;
        this.updatedAt = str2;
        this.title = str3;
        this.publishDate = str4;
        this.url = str5;
        this.image = str6;
        this.urlText = str7;
        this.ctaText = str8;
        this.contentType = str9;
        this.description = str10;
        this.deleted = z4;
        this.featured = z13;
        this.live = z14;
        this.archived = z15;
        this.hostId = num;
        this.liveTime = str11;
        this.hostDto = amaHostDto;
    }

    @InterfaceC37143h("host")
    public static /* synthetic */ void getHostDto$annotations() {
    }

    @InterfaceC37143h("image_url")
    public static /* synthetic */ void getImage$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(MemberStoryDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.createdAt);
        output.encodeStringElement(serialDesc, 2, self.updatedAt);
        output.encodeStringElement(serialDesc, 3, self.title);
        output.encodeStringElement(serialDesc, 4, self.publishDate);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.url);
        output.encodeStringElement(serialDesc, 6, self.image);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.urlText);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.ctaText);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.contentType);
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.description);
        output.encodeBooleanElement(serialDesc, 11, self.deleted);
        output.encodeBooleanElement(serialDesc, 12, self.featured);
        output.encodeBooleanElement(serialDesc, 13, self.live);
        output.encodeBooleanElement(serialDesc, 14, self.archived);
        output.encodeNullableSerializableElement(serialDesc, 15, IntSerializer.INSTANCE, self.hostId);
        output.encodeNullableSerializableElement(serialDesc, 16, stringSerializer, self.liveTime);
        output.encodeNullableSerializableElement(serialDesc, 17, AmaHostDto$$serializer.INSTANCE, self.hostDto);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean getArchived() {
        return this.archived;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getFeatured() {
        return this.featured;
    }

    public final AmaHostDto getHostDto() {
        return this.hostDto;
    }

    public final Integer getHostId() {
        return this.hostId;
    }

    public final int getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final boolean getLive() {
        return this.live;
    }

    public final String getLiveTime() {
        return this.liveTime;
    }

    public final String getPublishDate() {
        return this.publishDate;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUrlText() {
        return this.urlText;
    }

    public final MemberStory toMemoryStory() {
        int i13 = this.id;
        String str = this.title;
        String str2 = this.createdAt;
        String str3 = this.updatedAt;
        String str4 = this.url;
        String str5 = str4 == null ? "" : str4;
        String str6 = this.contentType;
        String str7 = str6 == null ? "" : str6;
        String str8 = this.image;
        String str9 = this.publishDate;
        boolean z4 = this.deleted;
        String str10 = this.description;
        String str11 = str10 == null ? "" : str10;
        boolean z13 = this.featured;
        boolean z14 = this.live;
        Integer num = this.hostId;
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z15 = this.archived;
        String str12 = this.liveTime;
        String str13 = str12 == null ? "" : str12;
        String str14 = this.urlText;
        String str15 = str14 == null ? "" : str14;
        String str16 = this.ctaText;
        if (str16 == null) {
            str16 = "Join the discussion";
        }
        String str17 = str16;
        AmaHostDto amaHostDto = this.hostDto;
        return new MemberStory(i13, str2, str3, str, str9, str5, str8, str7, false, str11, z4, z13, z14, z15, str13, iIntValue, str15, str17, amaHostDto != null ? amaHostDto.toAmaHost() : null, 256, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
        dest.writeString(this.title);
        dest.writeString(this.publishDate);
        dest.writeString(this.url);
        dest.writeString(this.image);
        dest.writeString(this.urlText);
        dest.writeString(this.ctaText);
        dest.writeString(this.contentType);
        dest.writeString(this.description);
        dest.writeInt(this.deleted ? 1 : 0);
        dest.writeInt(this.featured ? 1 : 0);
        dest.writeInt(this.live ? 1 : 0);
        dest.writeInt(this.archived ? 1 : 0);
        Integer num = this.hostId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        dest.writeString(this.liveTime);
        AmaHostDto amaHostDto = this.hostDto;
        if (amaHostDto == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            amaHostDto.writeToParcel(dest, flags);
        }
    }

    public MemberStoryDto(int i13, String createdAt, String updatedAt, String title, String publishDate, String str, String image, String str2, String str3, String str4, String str5, boolean z4, boolean z13, boolean z14, boolean z15, Integer num, String str6, AmaHostDto amaHostDto) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(publishDate, "publishDate");
        AbstractC22676k.m65750j(image, "image");
        this.id = i13;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.title = title;
        this.publishDate = publishDate;
        this.url = str;
        this.image = image;
        this.urlText = str2;
        this.ctaText = str3;
        this.contentType = str4;
        this.description = str5;
        this.deleted = z4;
        this.featured = z13;
        this.live = z14;
        this.archived = z15;
        this.hostId = num;
        this.liveTime = str6;
        this.hostDto = amaHostDto;
    }
}
