package com.whoop.homecustomization.domain.legacy.models;

import androidx.core.app.FrameMetricsAggregator;
import c13.AbstractC3855a;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p133f1.C13998z1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCBU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010B{\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b \u0010!Jp\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u0010\u0010%\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b8\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b9\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b:\u0010\u0017R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010;\u0012\u0004\b=\u0010>\u001a\u0004\b<\u0010\u001eR \u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010;\u0012\u0004\b@\u0010>\u001a\u0004\b?\u0010\u001eR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010!¨\u0006E"}, m65681d2 = {"Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;", "", "", "defaultStatLeftName", "defaultStatRightName", "description", "errorMessage", "pinnedKeyStatsHeader", "unpinnedKeyStatsHeader", "Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;", "pinnedKeyStats", "unpinnedKeyStats", "", "Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;", "toggleKeyStats", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;", "component8", "component9", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Ljava/util/List;)Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_customization_release", "(Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getDefaultStatLeftName", "getDefaultStatRightName", "getDescription", "getErrorMessage", "getPinnedKeyStatsHeader", "getUnpinnedKeyStatsHeader", "Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;", "getPinnedKeyStats", "getPinnedKeyStats$annotations", "()V", "getUnpinnedKeyStats", "getUnpinnedKeyStats$annotations", "Ljava/util/List;", "getToggleKeyStats", "Companion", "$serializer", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HomeCustomizationResponse {

    @SerializedName("default_stat_left_name")
    private final String defaultStatLeftName;

    @SerializedName("default_stat_right_name")
    private final String defaultStatRightName;

    @SerializedName("description")
    private final String description;

    @SerializedName("error_message")
    private final String errorMessage;

    @SerializedName("pinned_key_stats_section")
    private final KeyStatSection pinnedKeyStats;

    @SerializedName("pinned_key_stats_header")
    private final String pinnedKeyStatsHeader;

    @SerializedName("toggle_key_stats")
    private final List<CustomizeableKeyStatModel> toggleKeyStats;

    @SerializedName("unpinned_key_stats_section")
    private final KeyStatSection unpinnedKeyStats;

    @SerializedName("unpinned_key_stats_header")
    private final String unpinnedKeyStatsHeader;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C13998z1(24))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;", "serializer", "()Lwc3/c;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HomeCustomizationResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HomeCustomizationResponse(int i13, String str, String str2, String str3, String str4, String str5, String str6, KeyStatSection keyStatSection, KeyStatSection keyStatSection2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, HomeCustomizationResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.defaultStatLeftName = str;
        this.defaultStatRightName = str2;
        this.description = str3;
        this.errorMessage = str4;
        this.pinnedKeyStatsHeader = str5;
        this.unpinnedKeyStatsHeader = str6;
        this.pinnedKeyStats = keyStatSection;
        this.unpinnedKeyStats = keyStatSection2;
        this.toggleKeyStats = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(CustomizeableKeyStatModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeCustomizationResponse copy$default(HomeCustomizationResponse homeCustomizationResponse, String str, String str2, String str3, String str4, String str5, String str6, KeyStatSection keyStatSection, KeyStatSection keyStatSection2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = homeCustomizationResponse.defaultStatLeftName;
        }
        if ((i13 & 2) != 0) {
            str2 = homeCustomizationResponse.defaultStatRightName;
        }
        if ((i13 & 4) != 0) {
            str3 = homeCustomizationResponse.description;
        }
        if ((i13 & 8) != 0) {
            str4 = homeCustomizationResponse.errorMessage;
        }
        if ((i13 & 16) != 0) {
            str5 = homeCustomizationResponse.pinnedKeyStatsHeader;
        }
        if ((i13 & 32) != 0) {
            str6 = homeCustomizationResponse.unpinnedKeyStatsHeader;
        }
        if ((i13 & 64) != 0) {
            keyStatSection = homeCustomizationResponse.pinnedKeyStats;
        }
        if ((i13 & 128) != 0) {
            keyStatSection2 = homeCustomizationResponse.unpinnedKeyStats;
        }
        if ((i13 & 256) != 0) {
            list = homeCustomizationResponse.toggleKeyStats;
        }
        KeyStatSection keyStatSection3 = keyStatSection2;
        List list2 = list;
        String str7 = str6;
        KeyStatSection keyStatSection4 = keyStatSection;
        String str8 = str5;
        String str9 = str3;
        return homeCustomizationResponse.copy(str, str2, str9, str4, str8, str7, keyStatSection4, keyStatSection3, list2);
    }

    @InterfaceC37143h("pinned_key_stats_section")
    public static /* synthetic */ void getPinnedKeyStats$annotations() {
    }

    @InterfaceC37143h("unpinned_key_stats_section")
    public static /* synthetic */ void getUnpinnedKeyStats$annotations() {
    }

    public static final /* synthetic */ void write$Self$home_customization_release(HomeCustomizationResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.defaultStatLeftName);
        output.encodeStringElement(serialDesc, 1, self.defaultStatRightName);
        output.encodeStringElement(serialDesc, 2, self.description);
        output.encodeStringElement(serialDesc, 3, self.errorMessage);
        output.encodeStringElement(serialDesc, 4, self.pinnedKeyStatsHeader);
        output.encodeStringElement(serialDesc, 5, self.unpinnedKeyStatsHeader);
        KeyStatSection$$serializer keyStatSection$$serializer = KeyStatSection$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 6, keyStatSection$$serializer, self.pinnedKeyStats);
        output.encodeSerializableElement(serialDesc, 7, keyStatSection$$serializer, self.unpinnedKeyStats);
        output.encodeSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.toggleKeyStats);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDefaultStatLeftName() {
        return this.defaultStatLeftName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDefaultStatRightName() {
        return this.defaultStatRightName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPinnedKeyStatsHeader() {
        return this.pinnedKeyStatsHeader;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUnpinnedKeyStatsHeader() {
        return this.unpinnedKeyStatsHeader;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final KeyStatSection getPinnedKeyStats() {
        return this.pinnedKeyStats;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final KeyStatSection getUnpinnedKeyStats() {
        return this.unpinnedKeyStats;
    }

    public final List<CustomizeableKeyStatModel> component9() {
        return this.toggleKeyStats;
    }

    public final HomeCustomizationResponse copy(String defaultStatLeftName, String defaultStatRightName, String description, String errorMessage, String pinnedKeyStatsHeader, String unpinnedKeyStatsHeader, KeyStatSection pinnedKeyStats, KeyStatSection unpinnedKeyStats, List<CustomizeableKeyStatModel> toggleKeyStats) {
        AbstractC22676k.m65750j(defaultStatLeftName, "defaultStatLeftName");
        AbstractC22676k.m65750j(defaultStatRightName, "defaultStatRightName");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        AbstractC22676k.m65750j(pinnedKeyStatsHeader, "pinnedKeyStatsHeader");
        AbstractC22676k.m65750j(unpinnedKeyStatsHeader, "unpinnedKeyStatsHeader");
        AbstractC22676k.m65750j(pinnedKeyStats, "pinnedKeyStats");
        AbstractC22676k.m65750j(unpinnedKeyStats, "unpinnedKeyStats");
        AbstractC22676k.m65750j(toggleKeyStats, "toggleKeyStats");
        return new HomeCustomizationResponse(defaultStatLeftName, defaultStatRightName, description, errorMessage, pinnedKeyStatsHeader, unpinnedKeyStatsHeader, pinnedKeyStats, unpinnedKeyStats, toggleKeyStats);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeCustomizationResponse)) {
            return false;
        }
        HomeCustomizationResponse homeCustomizationResponse = (HomeCustomizationResponse) other;
        return AbstractC22676k.m65745e(this.defaultStatLeftName, homeCustomizationResponse.defaultStatLeftName) && AbstractC22676k.m65745e(this.defaultStatRightName, homeCustomizationResponse.defaultStatRightName) && AbstractC22676k.m65745e(this.description, homeCustomizationResponse.description) && AbstractC22676k.m65745e(this.errorMessage, homeCustomizationResponse.errorMessage) && AbstractC22676k.m65745e(this.pinnedKeyStatsHeader, homeCustomizationResponse.pinnedKeyStatsHeader) && AbstractC22676k.m65745e(this.unpinnedKeyStatsHeader, homeCustomizationResponse.unpinnedKeyStatsHeader) && AbstractC22676k.m65745e(this.pinnedKeyStats, homeCustomizationResponse.pinnedKeyStats) && AbstractC22676k.m65745e(this.unpinnedKeyStats, homeCustomizationResponse.unpinnedKeyStats) && AbstractC22676k.m65745e(this.toggleKeyStats, homeCustomizationResponse.toggleKeyStats);
    }

    public final String getDefaultStatLeftName() {
        return this.defaultStatLeftName;
    }

    public final String getDefaultStatRightName() {
        return this.defaultStatRightName;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final KeyStatSection getPinnedKeyStats() {
        return this.pinnedKeyStats;
    }

    public final String getPinnedKeyStatsHeader() {
        return this.pinnedKeyStatsHeader;
    }

    public final List<CustomizeableKeyStatModel> getToggleKeyStats() {
        return this.toggleKeyStats;
    }

    public final KeyStatSection getUnpinnedKeyStats() {
        return this.unpinnedKeyStats;
    }

    public final String getUnpinnedKeyStatsHeader() {
        return this.unpinnedKeyStatsHeader;
    }

    public int hashCode() {
        return this.toggleKeyStats.hashCode() + ((this.unpinnedKeyStats.hashCode() + ((this.pinnedKeyStats.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.defaultStatLeftName.hashCode() * 31, 31, this.defaultStatRightName), 31, this.description), 31, this.errorMessage), 31, this.pinnedKeyStatsHeader), 31, this.unpinnedKeyStatsHeader)) * 31)) * 31);
    }

    public String toString() {
        String str = this.defaultStatLeftName;
        String str2 = this.defaultStatRightName;
        String str3 = this.description;
        String str4 = this.errorMessage;
        String str5 = this.pinnedKeyStatsHeader;
        String str6 = this.unpinnedKeyStatsHeader;
        KeyStatSection keyStatSection = this.pinnedKeyStats;
        KeyStatSection keyStatSection2 = this.unpinnedKeyStats;
        List<CustomizeableKeyStatModel> list = this.toggleKeyStats;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HomeCustomizationResponse(defaultStatLeftName=", str, ", defaultStatRightName=", str2, ", description=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", errorMessage=", str4, ", pinnedKeyStatsHeader=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", unpinnedKeyStatsHeader=", str6, ", pinnedKeyStats=");
        sbM32001t.append(keyStatSection);
        sbM32001t.append(", unpinnedKeyStats=");
        sbM32001t.append(keyStatSection2);
        sbM32001t.append(", toggleKeyStats=");
        return AbstractC3855a.m11829m(sbM32001t, list, ")");
    }

    public HomeCustomizationResponse(String defaultStatLeftName, String defaultStatRightName, String description, String errorMessage, String pinnedKeyStatsHeader, String unpinnedKeyStatsHeader, KeyStatSection pinnedKeyStats, KeyStatSection unpinnedKeyStats, List<CustomizeableKeyStatModel> toggleKeyStats) {
        AbstractC22676k.m65750j(defaultStatLeftName, "defaultStatLeftName");
        AbstractC22676k.m65750j(defaultStatRightName, "defaultStatRightName");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        AbstractC22676k.m65750j(pinnedKeyStatsHeader, "pinnedKeyStatsHeader");
        AbstractC22676k.m65750j(unpinnedKeyStatsHeader, "unpinnedKeyStatsHeader");
        AbstractC22676k.m65750j(pinnedKeyStats, "pinnedKeyStats");
        AbstractC22676k.m65750j(unpinnedKeyStats, "unpinnedKeyStats");
        AbstractC22676k.m65750j(toggleKeyStats, "toggleKeyStats");
        this.defaultStatLeftName = defaultStatLeftName;
        this.defaultStatRightName = defaultStatRightName;
        this.description = description;
        this.errorMessage = errorMessage;
        this.pinnedKeyStatsHeader = pinnedKeyStatsHeader;
        this.unpinnedKeyStatsHeader = unpinnedKeyStatsHeader;
        this.pinnedKeyStats = pinnedKeyStats;
        this.unpinnedKeyStats = unpinnedKeyStats;
        this.toggleKeyStats = toggleKeyStats;
    }
}
