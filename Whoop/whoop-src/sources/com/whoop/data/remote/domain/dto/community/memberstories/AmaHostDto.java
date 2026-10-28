package com.whoop.data.remote.domain.dto.community.memberstories;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import com.google.gson.annotations.SerializedName;
import com.whoop.data.local.room.entity.AmaHost;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 12\u00020\u0001:\u000221BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rBk\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b+\u0010*R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b,\u0010*R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b-\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b.\u0010*R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b/\u0010*R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b0\u0010*¨\u00063"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;", "Landroid/os/Parcelable;", "", "userId", "", "firstName", "lastName", "name", "username", "avatarUrl", "createdAt", "updatedAt", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/data/local/room/entity/AmaHost;", "toAmaHost", "()Lcom/whoop/data/local/room/entity/AmaHost;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getUserId", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getFirstName", "()Ljava/lang/String;", "getLastName", "getName", "getUsername", "getAvatarUrl", "getCreatedAt", "getUpdatedAt", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final class AmaHostDto implements Parcelable {

    @SerializedName("avatar_url")
    private final String avatarUrl;

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("first_name")
    private final String firstName;

    @SerializedName("last_name")
    private final String lastName;

    @SerializedName("name")
    private final String name;

    @SerializedName("updated_at")
    private final String updatedAt;

    @SerializedName("user_id")
    private final Integer userId;

    @SerializedName("username")
    private final String username;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<AmaHostDto> CREATOR = new Creator();

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AmaHostDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<AmaHostDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AmaHostDto createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new AmaHostDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AmaHostDto[] newArray(int i13) {
            return new AmaHostDto[i13];
        }
    }

    public /* synthetic */ AmaHostDto(int i13, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, AmaHostDto$$serializer.INSTANCE.getDescriptor());
        }
        this.userId = num;
        this.firstName = str;
        this.lastName = str2;
        this.name = str3;
        this.username = str4;
        this.avatarUrl = str5;
        this.createdAt = str6;
        this.updatedAt = str7;
    }

    public static final /* synthetic */ void write$Self$core_release(AmaHostDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.userId);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.firstName);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.lastName);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.name);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.username);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.avatarUrl);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.createdAt);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.updatedAt);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final Integer getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public final AmaHost toAmaHost() {
        String str;
        String str2;
        Integer num = this.userId;
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 0);
        String str3 = this.firstName;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.lastName;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = this.name;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = this.username;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = this.avatarUrl;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = this.createdAt;
        if (str8 == null) {
            str8 = "";
        }
        String str9 = this.updatedAt;
        if (str9 == null) {
            String str10 = str8;
            str2 = "";
            str = str10;
        } else {
            str = str8;
            str2 = str9;
        }
        return new AmaHost(numValueOf, str3, str4, str5, str6, str7, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        Integer num = this.userId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.name);
        dest.writeString(this.username);
        dest.writeString(this.avatarUrl);
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
    }

    public AmaHostDto(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.userId = num;
        this.firstName = str;
        this.lastName = str2;
        this.name = str3;
        this.username = str4;
        this.avatarUrl = str5;
        this.createdAt = str6;
        this.updatedAt = str7;
    }
}
