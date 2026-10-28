package com.whoop.design.models.items;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import w91.C36958e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0002YXBm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0012\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0010\u0010&\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b(\u0010)J\u008c\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001aJ\u0010\u0010-\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102J'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b9\u0010:R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010<\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010<\u0012\u0004\bA\u0010?\u001a\u0004\b@\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010<\u0012\u0004\bC\u0010?\u001a\u0004\bB\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010D\u0012\u0004\bF\u0010?\u001a\u0004\bE\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010<\u0012\u0004\bH\u0010?\u001a\u0004\bG\u0010\u001aR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010I\u0012\u0004\bK\u0010?\u001a\u0004\bJ\u0010!R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010<\u0012\u0004\bM\u0010?\u001a\u0004\bL\u0010\u001aR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010N\u0012\u0004\bO\u0010?\u001a\u0004\b\r\u0010$R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010<\u0012\u0004\bQ\u0010?\u001a\u0004\bP\u0010\u001aR \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010R\u0012\u0004\bT\u0010?\u001a\u0004\bS\u0010'R \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010U\u0012\u0004\bW\u0010?\u001a\u0004\bV\u0010)¨\u0006Z"}, m65681d2 = {"Lcom/whoop/design/models/items/GoalSettingsTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "subtitle", "icon", "Lcom/whoop/design/models/items/ImpactModel;", "trend", "backgroundImage", "", "selectedValue", "avoidTextDisplay", "", "isAvoidChecked", "id", "Lcom/whoop/design/models/items/GoalSettingsTileStyle;", "style", "Lcom/whoop/design/models/items/DayOptions;", "dayOptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/design/models/items/ImpactModel;", "component5", "component6", "()Ljava/lang/Integer;", "component7", "component8", "()Ljava/lang/Boolean;", "component9", "component10", "()Lcom/whoop/design/models/items/GoalSettingsTileStyle;", "component11", "()Lcom/whoop/design/models/items/DayOptions;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;)Lcom/whoop/design/models/items/GoalSettingsTileModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/GoalSettingsTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubtitle", "getSubtitle$annotations", "getIcon", "getIcon$annotations", "Lcom/whoop/design/models/items/ImpactModel;", "getTrend", "getTrend$annotations", "getBackgroundImage", "getBackgroundImage$annotations", "Ljava/lang/Integer;", "getSelectedValue", "getSelectedValue$annotations", "getAvoidTextDisplay", "getAvoidTextDisplay$annotations", "Ljava/lang/Boolean;", "isAvoidChecked$annotations", "getId", "getId$annotations", "Lcom/whoop/design/models/items/GoalSettingsTileStyle;", "getStyle", "getStyle$annotations", "Lcom/whoop/design/models/items/DayOptions;", "getDayOptions", "getDayOptions$annotations", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GoalSettingsTileModel implements DesignSystemModel {

    @SerializedName("avoid_text_display")
    private final String avoidTextDisplay;

    @SerializedName("background_image")
    private final String backgroundImage;

    @SerializedName("day_options")
    private final DayOptions dayOptions;

    @SerializedName("icon")
    private final String icon;

    @SerializedName("id")
    private final String id;

    @SerializedName("is_avoid_checked")
    private final Boolean isAvoidChecked;

    @SerializedName("selected_value")
    private final Integer selectedValue;

    @SerializedName("style")
    private final GoalSettingsTileStyle style;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;

    @SerializedName("trend")
    private final ImpactModel trend;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36958e(5)), null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/GoalSettingsTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/GoalSettingsTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GoalSettingsTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ GoalSettingsTileModel(int i13, String str, String str2, String str3, ImpactModel impactModel, String str4, Integer num, String str5, Boolean bool, String str6, GoalSettingsTileStyle goalSettingsTileStyle, DayOptions dayOptions, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i13 & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2047, GoalSettingsTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.icon = str3;
        this.trend = impactModel;
        this.backgroundImage = str4;
        this.selectedValue = num;
        this.avoidTextDisplay = str5;
        this.isAvoidChecked = bool;
        this.id = str6;
        this.style = goalSettingsTileStyle;
        this.dayOptions = dayOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.GoalSettingsTileStyle", GoalSettingsTileStyle.values());
    }

    public static /* synthetic */ GoalSettingsTileModel copy$default(GoalSettingsTileModel goalSettingsTileModel, String str, String str2, String str3, ImpactModel impactModel, String str4, Integer num, String str5, Boolean bool, String str6, GoalSettingsTileStyle goalSettingsTileStyle, DayOptions dayOptions, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = goalSettingsTileModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = goalSettingsTileModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            str3 = goalSettingsTileModel.icon;
        }
        if ((i13 & 8) != 0) {
            impactModel = goalSettingsTileModel.trend;
        }
        if ((i13 & 16) != 0) {
            str4 = goalSettingsTileModel.backgroundImage;
        }
        if ((i13 & 32) != 0) {
            num = goalSettingsTileModel.selectedValue;
        }
        if ((i13 & 64) != 0) {
            str5 = goalSettingsTileModel.avoidTextDisplay;
        }
        if ((i13 & 128) != 0) {
            bool = goalSettingsTileModel.isAvoidChecked;
        }
        if ((i13 & 256) != 0) {
            str6 = goalSettingsTileModel.id;
        }
        if ((i13 & 512) != 0) {
            goalSettingsTileStyle = goalSettingsTileModel.style;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            dayOptions = goalSettingsTileModel.dayOptions;
        }
        GoalSettingsTileStyle goalSettingsTileStyle2 = goalSettingsTileStyle;
        DayOptions dayOptions2 = dayOptions;
        Boolean bool2 = bool;
        String str7 = str6;
        Integer num2 = num;
        String str8 = str5;
        String str9 = str4;
        String str10 = str3;
        return goalSettingsTileModel.copy(str, str2, str10, impactModel, str9, num2, str8, bool2, str7, goalSettingsTileStyle2, dayOptions2);
    }

    @InterfaceC37143h("avoid_text_display")
    public static /* synthetic */ void getAvoidTextDisplay$annotations() {
    }

    @InterfaceC37143h("background_image")
    public static /* synthetic */ void getBackgroundImage$annotations() {
    }

    @InterfaceC37143h("day_options")
    public static /* synthetic */ void getDayOptions$annotations() {
    }

    @InterfaceC37143h("icon")
    public static /* synthetic */ void getIcon$annotations() {
    }

    @InterfaceC37143h("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC37143h("selected_value")
    public static /* synthetic */ void getSelectedValue$annotations() {
    }

    @InterfaceC37143h("style")
    public static /* synthetic */ void getStyle$annotations() {
    }

    @InterfaceC37143h("subtitle")
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @InterfaceC37143h("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @InterfaceC37143h("trend")
    public static /* synthetic */ void getTrend$annotations() {
    }

    @InterfaceC37143h("is_avoid_checked")
    public static /* synthetic */ void isAvoidChecked$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(GoalSettingsTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.icon);
        output.encodeNullableSerializableElement(serialDesc, 3, ImpactModel$$serializer.INSTANCE, self.trend);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.backgroundImage);
        output.encodeNullableSerializableElement(serialDesc, 5, IntSerializer.INSTANCE, self.selectedValue);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.avoidTextDisplay);
        output.encodeNullableSerializableElement(serialDesc, 7, BooleanSerializer.INSTANCE, self.isAvoidChecked);
        output.encodeStringElement(serialDesc, 8, self.id);
        output.encodeSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.style);
        output.encodeSerializableElement(serialDesc, 10, DayOptions$$serializer.INSTANCE, self.dayOptions);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final GoalSettingsTileStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final DayOptions getDayOptions() {
        return this.dayOptions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ImpactModel getTrend() {
        return this.trend;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getSelectedValue() {
        return this.selectedValue;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAvoidTextDisplay() {
        return this.avoidTextDisplay;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getIsAvoidChecked() {
        return this.isAvoidChecked;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final GoalSettingsTileModel copy(String title, String subtitle, String icon, ImpactModel trend, String backgroundImage, Integer selectedValue, String avoidTextDisplay, Boolean isAvoidChecked, String id4, GoalSettingsTileStyle style, DayOptions dayOptions) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(dayOptions, "dayOptions");
        return new GoalSettingsTileModel(title, subtitle, icon, trend, backgroundImage, selectedValue, avoidTextDisplay, isAvoidChecked, id4, style, dayOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoalSettingsTileModel)) {
            return false;
        }
        GoalSettingsTileModel goalSettingsTileModel = (GoalSettingsTileModel) other;
        return AbstractC22676k.m65745e(this.title, goalSettingsTileModel.title) && AbstractC22676k.m65745e(this.subtitle, goalSettingsTileModel.subtitle) && AbstractC22676k.m65745e(this.icon, goalSettingsTileModel.icon) && AbstractC22676k.m65745e(this.trend, goalSettingsTileModel.trend) && AbstractC22676k.m65745e(this.backgroundImage, goalSettingsTileModel.backgroundImage) && AbstractC22676k.m65745e(this.selectedValue, goalSettingsTileModel.selectedValue) && AbstractC22676k.m65745e(this.avoidTextDisplay, goalSettingsTileModel.avoidTextDisplay) && AbstractC22676k.m65745e(this.isAvoidChecked, goalSettingsTileModel.isAvoidChecked) && AbstractC22676k.m65745e(this.id, goalSettingsTileModel.id) && this.style == goalSettingsTileModel.style && AbstractC22676k.m65745e(this.dayOptions, goalSettingsTileModel.dayOptions);
    }

    public final String getAvoidTextDisplay() {
        return this.avoidTextDisplay;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final DayOptions getDayOptions() {
        return this.dayOptions;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getSelectedValue() {
        return this.selectedValue;
    }

    public final GoalSettingsTileStyle getStyle() {
        return this.style;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ImpactModel getTrend() {
        return this.trend;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ImpactModel impactModel = this.trend;
        int iHashCode4 = (iHashCode3 + (impactModel == null ? 0 : impactModel.hashCode())) * 31;
        String str3 = this.backgroundImage;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.selectedValue;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.avoidTextDisplay;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isAvoidChecked;
        return this.dayOptions.hashCode() + ((this.style.hashCode() + AbstractC11266d.m30450d((iHashCode7 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.id)) * 31);
    }

    public final Boolean isAvoidChecked() {
        return this.isAvoidChecked;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.icon;
        ImpactModel impactModel = this.trend;
        String str4 = this.backgroundImage;
        Integer num = this.selectedValue;
        String str5 = this.avoidTextDisplay;
        Boolean bool = this.isAvoidChecked;
        String str6 = this.id;
        GoalSettingsTileStyle goalSettingsTileStyle = this.style;
        DayOptions dayOptions = this.dayOptions;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("GoalSettingsTileModel(title=", str, ", subtitle=", str2, ", icon=");
        sbM32001t.append(str3);
        sbM32001t.append(", trend=");
        sbM32001t.append(impactModel);
        sbM32001t.append(", backgroundImage=");
        AbstractC30007c.m91853w(num, str4, ", selectedValue=", ", avoidTextDisplay=", sbM32001t);
        AbstractC36095b.m114692t(bool, str5, ", isAvoidChecked=", ", id=", sbM32001t);
        sbM32001t.append(str6);
        sbM32001t.append(", style=");
        sbM32001t.append(goalSettingsTileStyle);
        sbM32001t.append(", dayOptions=");
        sbM32001t.append(dayOptions);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public GoalSettingsTileModel(String title, String str, String str2, ImpactModel impactModel, String str3, Integer num, String str4, Boolean bool, String id4, GoalSettingsTileStyle style, DayOptions dayOptions) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(dayOptions, "dayOptions");
        this.title = title;
        this.subtitle = str;
        this.icon = str2;
        this.trend = impactModel;
        this.backgroundImage = str3;
        this.selectedValue = num;
        this.avoidTextDisplay = str4;
        this.isAvoidChecked = bool;
        this.id = id4;
        this.style = style;
        this.dayOptions = dayOptions;
    }
}
