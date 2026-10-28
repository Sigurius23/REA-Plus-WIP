package com.whoop.common.network.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BCBM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&Jd\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001dJ\u0010\u0010*\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00103\u0012\u0004\b5\u00102\u001a\u0004\b4\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\b8\u00102\u001a\u0004\b7\u0010!R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b:\u00102\u001a\u0004\b9\u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b<\u00102\u001a\u0004\b;\u0010\u001dR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010/\u0012\u0004\b>\u00102\u001a\u0004\b=\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010&¨\u0006D"}, m65681d2 = {"Lcom/whoop/common/network/model/GarmentItemDto;", "", "", "created_at", "", "deleted", "", "id", "name", "strap_location", "updated_at", "Lcom/whoop/common/network/model/StrapGenerationSupportInfo;", "strapGenerationSupportInfo", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/common/network/model/StrapGenerationSupportInfo;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/common/network/model/StrapGenerationSupportInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$add_activity_release", "(Lcom/whoop/common/network/model/GarmentItemDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "component7", "()Lcom/whoop/common/network/model/StrapGenerationSupportInfo;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/common/network/model/StrapGenerationSupportInfo;)Lcom/whoop/common/network/model/GarmentItemDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCreated_at", "getCreated_at$annotations", "()V", "Ljava/lang/Boolean;", "getDeleted", "getDeleted$annotations", "Ljava/lang/Integer;", "getId", "getId$annotations", "getName", "getName$annotations", "getStrap_location", "getStrap_location$annotations", "getUpdated_at", "getUpdated_at$annotations", "Lcom/whoop/common/network/model/StrapGenerationSupportInfo;", "getStrapGenerationSupportInfo", "Companion", "$serializer", "a", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GarmentItemDto {

    @SerializedName("created_at")
    private final String created_at;

    @SerializedName("deleted")
    private final Boolean deleted;

    @SerializedName("id")
    private final Integer id;

    @SerializedName("name")
    private final String name;

    @SerializedName("strap_generation_support_info")
    private final StrapGenerationSupportInfo strapGenerationSupportInfo;

    @SerializedName("strap_location")
    private final String strap_location;

    @SerializedName("updated_at")
    private final String updated_at;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.common.network.model.GarmentItemDto$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/common/network/model/GarmentItemDto$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/common/network/model/GarmentItemDto;", "serializer", "()Lwc3/c;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GarmentItemDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ GarmentItemDto(int i13, String str, Boolean bool, Integer num, String str2, String str3, String str4, StrapGenerationSupportInfo strapGenerationSupportInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, GarmentItemDto$$serializer.INSTANCE.getDescriptor());
        }
        this.created_at = str;
        this.deleted = bool;
        this.id = num;
        this.name = str2;
        this.strap_location = str3;
        this.updated_at = str4;
        this.strapGenerationSupportInfo = strapGenerationSupportInfo;
    }

    public static /* synthetic */ GarmentItemDto copy$default(GarmentItemDto garmentItemDto, String str, Boolean bool, Integer num, String str2, String str3, String str4, StrapGenerationSupportInfo strapGenerationSupportInfo, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = garmentItemDto.created_at;
        }
        if ((i13 & 2) != 0) {
            bool = garmentItemDto.deleted;
        }
        if ((i13 & 4) != 0) {
            num = garmentItemDto.id;
        }
        if ((i13 & 8) != 0) {
            str2 = garmentItemDto.name;
        }
        if ((i13 & 16) != 0) {
            str3 = garmentItemDto.strap_location;
        }
        if ((i13 & 32) != 0) {
            str4 = garmentItemDto.updated_at;
        }
        if ((i13 & 64) != 0) {
            strapGenerationSupportInfo = garmentItemDto.strapGenerationSupportInfo;
        }
        String str5 = str4;
        StrapGenerationSupportInfo strapGenerationSupportInfo2 = strapGenerationSupportInfo;
        String str6 = str3;
        Integer num2 = num;
        return garmentItemDto.copy(str, bool, num2, str2, str6, str5, strapGenerationSupportInfo2);
    }

    @InterfaceC37143h("created_at")
    public static /* synthetic */ void getCreated_at$annotations() {
    }

    @InterfaceC37143h("deleted")
    public static /* synthetic */ void getDeleted$annotations() {
    }

    @InterfaceC37143h("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC37143h("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @InterfaceC37143h("strap_location")
    public static /* synthetic */ void getStrap_location$annotations() {
    }

    @InterfaceC37143h("updated_at")
    public static /* synthetic */ void getUpdated_at$annotations() {
    }

    public static final /* synthetic */ void write$Self$add_activity_release(GarmentItemDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.created_at);
        output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.deleted);
        output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.id);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.name);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.strap_location);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.updated_at);
        output.encodeNullableSerializableElement(serialDesc, 6, StrapGenerationSupportInfo$$serializer.INSTANCE, self.strapGenerationSupportInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getDeleted() {
        return this.deleted;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStrap_location() {
        return this.strap_location;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final StrapGenerationSupportInfo getStrapGenerationSupportInfo() {
        return this.strapGenerationSupportInfo;
    }

    public final GarmentItemDto copy(String created_at, Boolean deleted, Integer id4, String name, String strap_location, String updated_at, StrapGenerationSupportInfo strapGenerationSupportInfo) {
        return new GarmentItemDto(created_at, deleted, id4, name, strap_location, updated_at, strapGenerationSupportInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GarmentItemDto)) {
            return false;
        }
        GarmentItemDto garmentItemDto = (GarmentItemDto) other;
        return AbstractC22676k.m65745e(this.created_at, garmentItemDto.created_at) && AbstractC22676k.m65745e(this.deleted, garmentItemDto.deleted) && AbstractC22676k.m65745e(this.id, garmentItemDto.id) && AbstractC22676k.m65745e(this.name, garmentItemDto.name) && AbstractC22676k.m65745e(this.strap_location, garmentItemDto.strap_location) && AbstractC22676k.m65745e(this.updated_at, garmentItemDto.updated_at) && AbstractC22676k.m65745e(this.strapGenerationSupportInfo, garmentItemDto.strapGenerationSupportInfo);
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final Boolean getDeleted() {
        return this.deleted;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final StrapGenerationSupportInfo getStrapGenerationSupportInfo() {
        return this.strapGenerationSupportInfo;
    }

    public final String getStrap_location() {
        return this.strap_location;
    }

    public final String getUpdated_at() {
        return this.updated_at;
    }

    public int hashCode() {
        String str = this.created_at;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.deleted;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.id;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.strap_location;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.updated_at;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        StrapGenerationSupportInfo strapGenerationSupportInfo = this.strapGenerationSupportInfo;
        return iHashCode6 + (strapGenerationSupportInfo != null ? strapGenerationSupportInfo.hashCode() : 0);
    }

    public String toString() {
        String str = this.created_at;
        Boolean bool = this.deleted;
        Integer num = this.id;
        String str2 = this.name;
        String str3 = this.strap_location;
        String str4 = this.updated_at;
        StrapGenerationSupportInfo strapGenerationSupportInfo = this.strapGenerationSupportInfo;
        StringBuilder sb4 = new StringBuilder("GarmentItemDto(created_at=");
        sb4.append(str);
        sb4.append(", deleted=");
        sb4.append(bool);
        sb4.append(", id=");
        AbstractC13673n.m38577x(num, ", name=", str2, ", strap_location=", sb4);
        AbstractC11266d.m30444B(sb4, str3, ", updated_at=", str4, ", strapGenerationSupportInfo=");
        sb4.append(strapGenerationSupportInfo);
        sb4.append(")");
        return sb4.toString();
    }

    public GarmentItemDto(String str, Boolean bool, Integer num, String str2, String str3, String str4, StrapGenerationSupportInfo strapGenerationSupportInfo) {
        this.created_at = str;
        this.deleted = bool;
        this.id = num;
        this.name = str2;
        this.strap_location = str3;
        this.updated_at = str4;
        this.strapGenerationSupportInfo = strapGenerationSupportInfo;
    }
}
