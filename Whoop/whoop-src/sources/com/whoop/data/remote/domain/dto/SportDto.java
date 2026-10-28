package com.whoop.data.remote.domain.dto;

import androidx.annotation.Keep;
import com.whoop.p069ui.activities.realtime.SportCategory;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.Sport;
import ih0.AbstractC18489d0;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eBc\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0010\u0010'\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0010\u0010(\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b(\u0010$J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010\"Jb\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010\"J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010 J\u001a\u0010/\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010$R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b7\u0010\"R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b8\u0010\"R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b\n\u0010$R \u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\b9\u0010:\u001a\u0004\b\u000b\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b;\u0010\"¨\u0006>"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/SportDto;", "", "", "id", "", "name", "", "hasGps", "iconUrl", "category", "isCurrent", "isHasSurvey", "activityTypeInternalName", "<init>", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/SportDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/service/network/model/Sport;", "toSport", "()Lcom/whoop/service/network/model/Sport;", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "component5", "component6", "component7", "component8", "copy", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)Lcom/whoop/data/remote/domain/dto/SportDto;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getName", "Z", "getHasGps", "getIconUrl", "getCategory", "isHasSurvey$annotations", "()V", "getActivityTypeInternalName", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SportDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String activityTypeInternalName;
    private final String category;
    private final boolean hasGps;
    private final String iconUrl;
    private final int id;
    private final boolean isCurrent;
    private final boolean isHasSurvey;
    private final String name;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/SportDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/SportDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SportDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SportDto() {
        this(0, (String) null, false, (String) null, (String) null, false, false, (String) null, 255, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SportDto copy$default(SportDto sportDto, int i13, String str, boolean z4, String str2, String str3, boolean z13, boolean z14, String str4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = sportDto.id;
        }
        if ((i14 & 2) != 0) {
            str = sportDto.name;
        }
        if ((i14 & 4) != 0) {
            z4 = sportDto.hasGps;
        }
        if ((i14 & 8) != 0) {
            str2 = sportDto.iconUrl;
        }
        if ((i14 & 16) != 0) {
            str3 = sportDto.category;
        }
        if ((i14 & 32) != 0) {
            z13 = sportDto.isCurrent;
        }
        if ((i14 & 64) != 0) {
            z14 = sportDto.isHasSurvey;
        }
        if ((i14 & 128) != 0) {
            str4 = sportDto.activityTypeInternalName;
        }
        boolean z15 = z14;
        String str5 = str4;
        String str6 = str3;
        boolean z16 = z13;
        return sportDto.copy(i13, str, z4, str2, str6, z16, z15, str5);
    }

    @InterfaceC37143h("has_survey")
    public static /* synthetic */ void isHasSurvey$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(SportDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != 0) {
            output.encodeIntElement(serialDesc, 0, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.name, "")) {
            output.encodeStringElement(serialDesc, 1, self.name);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.hasGps) {
            output.encodeBooleanElement(serialDesc, 2, self.hasGps);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.iconUrl, "")) {
            output.encodeStringElement(serialDesc, 3, self.iconUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.category, SportCategory.CARDIOVASCULAR.getValue())) {
            output.encodeStringElement(serialDesc, 4, self.category);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !self.isCurrent) {
            output.encodeBooleanElement(serialDesc, 5, self.isCurrent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.isHasSurvey) {
            output.encodeBooleanElement(serialDesc, 6, self.isHasSurvey);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.activityTypeInternalName == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.activityTypeInternalName);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasGps() {
        return this.hasGps;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsCurrent() {
        return this.isCurrent;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsHasSurvey() {
        return this.isHasSurvey;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getActivityTypeInternalName() {
        return this.activityTypeInternalName;
    }

    public final SportDto copy(int id4, String name, boolean hasGps, String iconUrl, String category, boolean isCurrent, boolean isHasSurvey, String activityTypeInternalName) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(category, "category");
        return new SportDto(id4, name, hasGps, iconUrl, category, isCurrent, isHasSurvey, activityTypeInternalName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportDto)) {
            return false;
        }
        SportDto sportDto = (SportDto) other;
        return this.id == sportDto.id && AbstractC22676k.m65745e(this.name, sportDto.name) && this.hasGps == sportDto.hasGps && AbstractC22676k.m65745e(this.iconUrl, sportDto.iconUrl) && AbstractC22676k.m65745e(this.category, sportDto.category) && this.isCurrent == sportDto.isCurrent && this.isHasSurvey == sportDto.isHasSurvey && AbstractC22676k.m65745e(this.activityTypeInternalName, sportDto.activityTypeInternalName);
    }

    public final String getActivityTypeInternalName() {
        return this.activityTypeInternalName;
    }

    public final String getCategory() {
        return this.category;
    }

    public final boolean getHasGps() {
        return this.hasGps;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.hasGps), 31, this.iconUrl), 31, this.category), 31, this.isCurrent), 31, this.isHasSurvey);
        String str = this.activityTypeInternalName;
        return iM8289b + (str == null ? 0 : str.hashCode());
    }

    public final boolean isCurrent() {
        return this.isCurrent;
    }

    public final boolean isHasSurvey() {
        return this.isHasSurvey;
    }

    public final Sport toSport() {
        return new Sport(this.id, this.name, this.hasGps, this.iconUrl, SportCategory.INSTANCE.m26715a(this.category), this.isCurrent, this.isHasSurvey, this.activityTypeInternalName);
    }

    public String toString() {
        int i13 = this.id;
        String str = this.name;
        boolean z4 = this.hasGps;
        String str2 = this.iconUrl;
        String str3 = this.category;
        boolean z13 = this.isCurrent;
        boolean z14 = this.isHasSurvey;
        String str4 = this.activityTypeInternalName;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "SportDto(id=", ", name=", str, ", hasGps=");
        AbstractC38963t7.m124391u(sbM53373n, z4, ", iconUrl=", str2, ", category=");
        AbstractC38963t7.m124390t(sbM53373n, str3, ", isCurrent=", z13, ", isHasSurvey=");
        return AbstractC21702c.m61139j(sbM53373n, z14, ", activityTypeInternalName=", str4, ")");
    }

    public /* synthetic */ SportDto(int i13, int i14, String str, boolean z4, String str2, String str3, boolean z13, boolean z14, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.id = 0;
        } else {
            this.id = i14;
        }
        if ((i13 & 2) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i13 & 4) == 0) {
            this.hasGps = false;
        } else {
            this.hasGps = z4;
        }
        if ((i13 & 8) == 0) {
            this.iconUrl = "";
        } else {
            this.iconUrl = str2;
        }
        if ((i13 & 16) == 0) {
            this.category = SportCategory.CARDIOVASCULAR.getValue();
        } else {
            this.category = str3;
        }
        if ((i13 & 32) == 0) {
            this.isCurrent = true;
        } else {
            this.isCurrent = z13;
        }
        if ((i13 & 64) == 0) {
            this.isHasSurvey = false;
        } else {
            this.isHasSurvey = z14;
        }
        if ((i13 & 128) == 0) {
            this.activityTypeInternalName = null;
        } else {
            this.activityTypeInternalName = str4;
        }
    }

    public SportDto(int i13, String name, boolean z4, String iconUrl, String category, boolean z13, boolean z14, String str) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(category, "category");
        this.id = i13;
        this.name = name;
        this.hasGps = z4;
        this.iconUrl = iconUrl;
        this.category = category;
        this.isCurrent = z13;
        this.isHasSurvey = z14;
        this.activityTypeInternalName = str;
    }

    public /* synthetic */ SportDto(int i13, String str, boolean z4, String str2, String str3, boolean z13, boolean z14, String str4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? false : z4, (i14 & 8) != 0 ? "" : str2, (i14 & 16) != 0 ? SportCategory.CARDIOVASCULAR.getValue() : str3, (i14 & 32) != 0 ? true : z13, (i14 & 64) != 0 ? false : z14, (i14 & 128) != 0 ? null : str4);
    }
}
