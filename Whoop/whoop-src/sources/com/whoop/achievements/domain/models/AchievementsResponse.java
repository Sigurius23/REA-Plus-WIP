package com.whoop.achievements.domain.models;

import c13.AbstractC3855a;
import com.whoop.design.models.colortheme.ColorThemeModel;
import com.whoop.design.models.colortheme.ColorThemeModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import s51.C32219p;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010Bs\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u001e\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b)\u0010*Jr\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010#R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b;\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010(R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010*¨\u0006B"}, m65681d2 = {"Lcom/whoop/achievements/domain/models/AchievementsResponse;", "", "", "navigationTitle", "navigationIcon", "Lcom/whoop/navigation/e;", "navigationDestination", "", "analyticProperties", "backgroundStyle", "Lcom/whoop/design/models/colortheme/ColorThemeModel;", "colors", "", "Lcom/whoop/achievements/domain/models/AchievementsSectionModel;", "sections", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$achievements_release", "(Lcom/whoop/achievements/domain/models/AchievementsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/navigation/e;", "component4", "()Ljava/util/Map;", "component5", "component6", "()Lcom/whoop/design/models/colortheme/ColorThemeModel;", "component7", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/util/List;)Lcom/whoop/achievements/domain/models/AchievementsResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNavigationTitle", "getNavigationIcon", "Lcom/whoop/navigation/e;", "getNavigationDestination", "Ljava/util/Map;", "getAnalyticProperties", "getBackgroundStyle", "Lcom/whoop/design/models/colortheme/ColorThemeModel;", "getColors", "Ljava/util/List;", "getSections", "Companion", "$serializer", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AchievementsResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final Map<String, String> analyticProperties;
    private final String backgroundStyle;
    private final ColorThemeModel colors;
    private final C9598e navigationDestination;
    private final String navigationIcon;
    private final String navigationTitle;
    private final List<AchievementsSectionModel> sections;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/achievements/domain/models/AchievementsResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/achievements/domain/models/AchievementsResponse;", "serializer", "()Lwc3/c;", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AchievementsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C32219p(2)), AbstractC30060g.m92087G(enumC23463i, new C32219p(3)), null, null, AbstractC30060g.m92087G(enumC23463i, new C32219p(4))};
    }

    public /* synthetic */ AchievementsResponse(int i13, String str, String str2, C9598e c9598e, Map map, String str3, ColorThemeModel colorThemeModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, AchievementsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationTitle = str;
        if ((i13 & 2) == 0) {
            this.navigationIcon = null;
        } else {
            this.navigationIcon = str2;
        }
        if ((i13 & 4) == 0) {
            this.navigationDestination = null;
        } else {
            this.navigationDestination = c9598e;
        }
        if ((i13 & 8) == 0) {
            this.analyticProperties = null;
        } else {
            this.analyticProperties = map;
        }
        if ((i13 & 16) == 0) {
            this.backgroundStyle = null;
        } else {
            this.backgroundStyle = str3;
        }
        if ((i13 & 32) == 0) {
            this.colors = null;
        } else {
            this.colors = colorThemeModel;
        }
        if ((i13 & 64) == 0) {
            this.sections = C25271y.f99162w;
        } else {
            this.sections = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(AchievementsSectionModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AchievementsResponse copy$default(AchievementsResponse achievementsResponse, String str, String str2, C9598e c9598e, Map map, String str3, ColorThemeModel colorThemeModel, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = achievementsResponse.navigationTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = achievementsResponse.navigationIcon;
        }
        if ((i13 & 4) != 0) {
            c9598e = achievementsResponse.navigationDestination;
        }
        if ((i13 & 8) != 0) {
            map = achievementsResponse.analyticProperties;
        }
        if ((i13 & 16) != 0) {
            str3 = achievementsResponse.backgroundStyle;
        }
        if ((i13 & 32) != 0) {
            colorThemeModel = achievementsResponse.colors;
        }
        if ((i13 & 64) != 0) {
            list = achievementsResponse.sections;
        }
        ColorThemeModel colorThemeModel2 = colorThemeModel;
        List list2 = list;
        String str4 = str3;
        C9598e c9598e2 = c9598e;
        return achievementsResponse.copy(str, str2, c9598e2, map, str4, colorThemeModel2, list2);
    }

    public static final /* synthetic */ void write$Self$achievements_release(AchievementsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.navigationTitle);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.navigationIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.navigationIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.navigationDestination != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.navigationDestination);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.analyticProperties != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.analyticProperties);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.backgroundStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.backgroundStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.colors != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, ColorThemeModel$$serializer.INSTANCE, self.colors);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && AbstractC22676k.m65745e(self.sections, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.sections);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNavigationIcon() {
        return this.navigationIcon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C9598e getNavigationDestination() {
        return this.navigationDestination;
    }

    public final Map<String, String> component4() {
        return this.analyticProperties;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBackgroundStyle() {
        return this.backgroundStyle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ColorThemeModel getColors() {
        return this.colors;
    }

    public final List<AchievementsSectionModel> component7() {
        return this.sections;
    }

    public final AchievementsResponse copy(String navigationTitle, String navigationIcon, C9598e navigationDestination, Map<String, String> analyticProperties, String backgroundStyle, ColorThemeModel colors, List<AchievementsSectionModel> sections) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(sections, "sections");
        return new AchievementsResponse(navigationTitle, navigationIcon, navigationDestination, analyticProperties, backgroundStyle, colors, sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AchievementsResponse)) {
            return false;
        }
        AchievementsResponse achievementsResponse = (AchievementsResponse) other;
        return AbstractC22676k.m65745e(this.navigationTitle, achievementsResponse.navigationTitle) && AbstractC22676k.m65745e(this.navigationIcon, achievementsResponse.navigationIcon) && AbstractC22676k.m65745e(this.navigationDestination, achievementsResponse.navigationDestination) && AbstractC22676k.m65745e(this.analyticProperties, achievementsResponse.analyticProperties) && AbstractC22676k.m65745e(this.backgroundStyle, achievementsResponse.backgroundStyle) && AbstractC22676k.m65745e(this.colors, achievementsResponse.colors) && AbstractC22676k.m65745e(this.sections, achievementsResponse.sections);
    }

    public final Map<String, String> getAnalyticProperties() {
        return this.analyticProperties;
    }

    public final String getBackgroundStyle() {
        return this.backgroundStyle;
    }

    public final ColorThemeModel getColors() {
        return this.colors;
    }

    public final C9598e getNavigationDestination() {
        return this.navigationDestination;
    }

    public final String getNavigationIcon() {
        return this.navigationIcon;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final List<AchievementsSectionModel> getSections() {
        return this.sections;
    }

    public int hashCode() {
        int iHashCode = this.navigationTitle.hashCode() * 31;
        String str = this.navigationIcon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C9598e c9598e = this.navigationDestination;
        int iHashCode3 = (iHashCode2 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        Map<String, String> map = this.analyticProperties;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.backgroundStyle;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ColorThemeModel colorThemeModel = this.colors;
        return this.sections.hashCode() + ((iHashCode5 + (colorThemeModel != null ? colorThemeModel.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.navigationTitle;
        String str2 = this.navigationIcon;
        C9598e c9598e = this.navigationDestination;
        Map<String, String> map = this.analyticProperties;
        String str3 = this.backgroundStyle;
        ColorThemeModel colorThemeModel = this.colors;
        List<AchievementsSectionModel> list = this.sections;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AchievementsResponse(navigationTitle=", str, ", navigationIcon=", str2, ", navigationDestination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", analyticProperties=");
        sbM32001t.append(map);
        sbM32001t.append(", backgroundStyle=");
        sbM32001t.append(str3);
        sbM32001t.append(", colors=");
        sbM32001t.append(colorThemeModel);
        sbM32001t.append(", sections=");
        return AbstractC3855a.m11829m(sbM32001t, list, ")");
    }

    public AchievementsResponse(String navigationTitle, String str, C9598e c9598e, Map<String, String> map, String str2, ColorThemeModel colorThemeModel, List<AchievementsSectionModel> sections) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(sections, "sections");
        this.navigationTitle = navigationTitle;
        this.navigationIcon = str;
        this.navigationDestination = c9598e;
        this.analyticProperties = map;
        this.backgroundStyle = str2;
        this.colors = colorThemeModel;
        this.sections = sections;
    }

    public /* synthetic */ AchievementsResponse(String str, String str2, C9598e c9598e, Map map, String str3, ColorThemeModel colorThemeModel, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : c9598e, (i13 & 8) != 0 ? null : map, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : colorThemeModel, (i13 & 64) != 0 ? C25271y.f99162w : list);
    }
}
