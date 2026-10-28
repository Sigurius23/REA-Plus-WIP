package com.whoop.design.models.items;

import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
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
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import w91.C36964k;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 n2\u00020\u0001:\u0002onBÇ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001e\u0010\u001fBß\u0001\b\u0010\u0012\u0006\u0010 \u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010%J\u0012\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010%J\u0012\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b3\u0010/J\u0012\u00104\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b4\u0010/J\u0010\u00105\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b9\u00102J\u0012\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b:\u0010/J\u0012\u0010;\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b?\u0010/Jò\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bB\u0010%J\u0010\u0010C\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\bC\u0010DJ\u001a\u0010G\u001a\u00020\f2\b\u0010F\u001a\u0004\u0018\u00010EHÖ\u0003¢\u0006\u0004\bG\u0010HJ'\u0010Q\u001a\u00020N2\u0006\u0010I\u001a\u00020\u00002\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020LH\u0001¢\u0006\u0004\bO\u0010PR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010R\u001a\u0004\bS\u0010%R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010R\u001a\u0004\bT\u0010%R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010R\u001a\u0004\bU\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010R\u001a\u0004\bV\u0010%R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010W\u001a\u0004\bX\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010R\u001a\u0004\bY\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010Z\u001a\u0004\b[\u0010-R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\\\u001a\u0004\b\r\u0010/R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010R\u001a\u0004\b]\u0010%R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010^\u001a\u0004\b_\u00102R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\\\u001a\u0004\b`\u0010/R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\\\u001a\u0004\b\u0012\u0010/R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010a\u001a\u0004\bb\u00106R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010c\u001a\u0004\bd\u00108R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010^\u001a\u0004\be\u00102R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\\\u001a\u0004\bf\u0010/R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010g\u0012\u0004\bi\u0010j\u001a\u0004\bh\u0010<R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010k\u001a\u0004\bl\u0010>R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\\\u001a\u0004\bm\u0010/¨\u0006p"}, m65681d2 = {"Lcom/whoop/design/models/items/TogglesModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "title", "icon", "subtitle", "", "categories", "avoidTextDisplay", "Lcom/whoop/design/models/items/ImpactModel;", "trend", "", "isToggled", "backgroundImage", "", "selectedValue", "selected", "isAvoidChecked", "Lcom/whoop/design/models/items/GoalSettingsTileStyle;", "style", "Lcom/whoop/design/models/items/DayOptions;", "dayOptions", "sortPriority", "weeklyPlanGoal", "Lcom/whoop/design/models/items/BottomSheetInfoModel;", "bottomSheetInfo", "Lcom/whoop/design/models/items/GoalSettingsTileTagModel;", "tag", "custom", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/design/models/items/GoalSettingsTileTagModel;Ljava/lang/Boolean;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/design/models/items/GoalSettingsTileTagModel;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "()Lcom/whoop/design/models/items/ImpactModel;", "component8", "()Ljava/lang/Boolean;", "component9", "component10", "()Ljava/lang/Integer;", "component11", "component12", "component13", "()Lcom/whoop/design/models/items/GoalSettingsTileStyle;", "component14", "()Lcom/whoop/design/models/items/DayOptions;", "component15", "component16", "component17", "()Lcom/whoop/design/models/items/BottomSheetInfoModel;", "component18", "()Lcom/whoop/design/models/items/GoalSettingsTileTagModel;", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/design/models/items/GoalSettingsTileTagModel;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/TogglesModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/TogglesModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getTitle", "getIcon", "getSubtitle", "Ljava/util/List;", "getCategories", "getAvoidTextDisplay", "Lcom/whoop/design/models/items/ImpactModel;", "getTrend", "Ljava/lang/Boolean;", "getBackgroundImage", "Ljava/lang/Integer;", "getSelectedValue", "getSelected", "Lcom/whoop/design/models/items/GoalSettingsTileStyle;", "getStyle", "Lcom/whoop/design/models/items/DayOptions;", "getDayOptions", "getSortPriority", "getWeeklyPlanGoal", "Lcom/whoop/design/models/items/BottomSheetInfoModel;", "getBottomSheetInfo", "getBottomSheetInfo$annotations", "()V", "Lcom/whoop/design/models/items/GoalSettingsTileTagModel;", "getTag", "getCustom", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TogglesModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("avoid_text_display")
    private final String avoidTextDisplay;

    @SerializedName("background_image")
    private final String backgroundImage;

    @SerializedName("bottom_info_sheet")
    private final BottomSheetInfoModel bottomSheetInfo;

    @SerializedName("categories")
    private final List<String> categories;

    @SerializedName("custom")
    private final Boolean custom;

    @SerializedName("day_options")
    private final DayOptions dayOptions;

    @SerializedName("icon")
    private final String icon;

    @SerializedName("id")
    private final String id;

    @SerializedName("is_avoid_checked")
    private final Boolean isAvoidChecked;

    @SerializedName("is_toggled")
    private final Boolean isToggled;

    @SerializedName("selected")
    private final Boolean selected;

    @SerializedName("selected_value")
    private final Integer selectedValue;

    @SerializedName("sort_priority")
    private final Integer sortPriority;

    @SerializedName("style")
    private final GoalSettingsTileStyle style;

    @SerializedName("subtitle")
    private final String subtitle;
    private final GoalSettingsTileTagModel tag;

    @SerializedName("title")
    private final String title;

    @SerializedName("trend")
    private final ImpactModel trend;

    @SerializedName("weekly_plan_goal")
    private final Boolean weeklyPlanGoal;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/TogglesModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/TogglesModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TogglesModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36964k(20)), null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36964k(21)), null, null, null, null, null, null};
    }

    public /* synthetic */ TogglesModel(int i13, String str, String str2, String str3, String str4, List list, String str5, ImpactModel impactModel, Boolean bool, String str6, Integer num, Boolean bool2, Boolean bool3, GoalSettingsTileStyle goalSettingsTileStyle, DayOptions dayOptions, Integer num2, Boolean bool4, BottomSheetInfoModel bottomSheetInfoModel, GoalSettingsTileTagModel goalSettingsTileTagModel, Boolean bool5, SerializationConstructorMarker serializationConstructorMarker) {
        if (131071 != (i13 & 131071)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 131071, TogglesModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = str2;
        this.icon = str3;
        this.subtitle = str4;
        this.categories = list;
        this.avoidTextDisplay = str5;
        this.trend = impactModel;
        this.isToggled = bool;
        this.backgroundImage = str6;
        this.selectedValue = num;
        this.selected = bool2;
        this.isAvoidChecked = bool3;
        this.style = goalSettingsTileStyle;
        this.dayOptions = dayOptions;
        this.sortPriority = num2;
        this.weeklyPlanGoal = bool4;
        this.bottomSheetInfo = bottomSheetInfoModel;
        if ((131072 & i13) == 0) {
            this.tag = null;
        } else {
            this.tag = goalSettingsTileTagModel;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
            this.custom = null;
        } else {
            this.custom = bool5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.GoalSettingsTileStyle", GoalSettingsTileStyle.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TogglesModel copy$default(TogglesModel togglesModel, String str, String str2, String str3, String str4, List list, String str5, ImpactModel impactModel, Boolean bool, String str6, Integer num, Boolean bool2, Boolean bool3, GoalSettingsTileStyle goalSettingsTileStyle, DayOptions dayOptions, Integer num2, Boolean bool4, BottomSheetInfoModel bottomSheetInfoModel, GoalSettingsTileTagModel goalSettingsTileTagModel, Boolean bool5, int i13, Object obj) {
        Boolean bool6;
        GoalSettingsTileTagModel goalSettingsTileTagModel2;
        String str7 = (i13 & 1) != 0 ? togglesModel.id : str;
        String str8 = (i13 & 2) != 0 ? togglesModel.title : str2;
        String str9 = (i13 & 4) != 0 ? togglesModel.icon : str3;
        String str10 = (i13 & 8) != 0 ? togglesModel.subtitle : str4;
        List list2 = (i13 & 16) != 0 ? togglesModel.categories : list;
        String str11 = (i13 & 32) != 0 ? togglesModel.avoidTextDisplay : str5;
        ImpactModel impactModel2 = (i13 & 64) != 0 ? togglesModel.trend : impactModel;
        Boolean bool7 = (i13 & 128) != 0 ? togglesModel.isToggled : bool;
        String str12 = (i13 & 256) != 0 ? togglesModel.backgroundImage : str6;
        Integer num3 = (i13 & 512) != 0 ? togglesModel.selectedValue : num;
        Boolean bool8 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? togglesModel.selected : bool2;
        Boolean bool9 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? togglesModel.isAvoidChecked : bool3;
        GoalSettingsTileStyle goalSettingsTileStyle2 = (i13 & 4096) != 0 ? togglesModel.style : goalSettingsTileStyle;
        DayOptions dayOptions2 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? togglesModel.dayOptions : dayOptions;
        String str13 = str7;
        Integer num4 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? togglesModel.sortPriority : num2;
        Boolean bool10 = (i13 & 32768) != 0 ? togglesModel.weeklyPlanGoal : bool4;
        BottomSheetInfoModel bottomSheetInfoModel2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? togglesModel.bottomSheetInfo : bottomSheetInfoModel;
        GoalSettingsTileTagModel goalSettingsTileTagModel3 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? togglesModel.tag : goalSettingsTileTagModel;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
            goalSettingsTileTagModel2 = goalSettingsTileTagModel3;
            bool6 = togglesModel.custom;
        } else {
            bool6 = bool5;
            goalSettingsTileTagModel2 = goalSettingsTileTagModel3;
        }
        return togglesModel.copy(str13, str8, str9, str10, list2, str11, impactModel2, bool7, str12, num3, bool8, bool9, goalSettingsTileStyle2, dayOptions2, num4, bool10, bottomSheetInfoModel2, goalSettingsTileTagModel2, bool6);
    }

    @InterfaceC37143h("bottom_info_sheet")
    public static /* synthetic */ void getBottomSheetInfo$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(TogglesModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.icon);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.subtitle);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.categories);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.avoidTextDisplay);
        output.encodeNullableSerializableElement(serialDesc, 6, ImpactModel$$serializer.INSTANCE, self.trend);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 7, booleanSerializer, self.isToggled);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.backgroundImage);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 9, intSerializer, self.selectedValue);
        output.encodeNullableSerializableElement(serialDesc, 10, booleanSerializer, self.selected);
        output.encodeNullableSerializableElement(serialDesc, 11, booleanSerializer, self.isAvoidChecked);
        output.encodeSerializableElement(serialDesc, 12, (InterfaceC37145j) interfaceC23462hArr[12].getValue(), self.style);
        output.encodeNullableSerializableElement(serialDesc, 13, DayOptions$$serializer.INSTANCE, self.dayOptions);
        output.encodeNullableSerializableElement(serialDesc, 14, intSerializer, self.sortPriority);
        output.encodeNullableSerializableElement(serialDesc, 15, booleanSerializer, self.weeklyPlanGoal);
        output.encodeNullableSerializableElement(serialDesc, 16, BottomSheetInfoModel$$serializer.INSTANCE, self.bottomSheetInfo);
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.tag != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, GoalSettingsTileTagModel$$serializer.INSTANCE, self.tag);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 18) && self.custom == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 18, booleanSerializer, self.custom);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getSelectedValue() {
        return this.selectedValue;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getIsAvoidChecked() {
        return this.isAvoidChecked;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final GoalSettingsTileStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final DayOptions getDayOptions() {
        return this.dayOptions;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getSortPriority() {
        return this.sortPriority;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getWeeklyPlanGoal() {
        return this.weeklyPlanGoal;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final BottomSheetInfoModel getBottomSheetInfo() {
        return this.bottomSheetInfo;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final GoalSettingsTileTagModel getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getCustom() {
        return this.custom;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<String> component5() {
        return this.categories;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAvoidTextDisplay() {
        return this.avoidTextDisplay;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ImpactModel getTrend() {
        return this.trend;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getIsToggled() {
        return this.isToggled;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final TogglesModel copy(String id4, String title, String icon, String subtitle, List<String> categories, String avoidTextDisplay, ImpactModel trend, Boolean isToggled, String backgroundImage, Integer selectedValue, Boolean selected, Boolean isAvoidChecked, GoalSettingsTileStyle style, DayOptions dayOptions, Integer sortPriority, Boolean weeklyPlanGoal, BottomSheetInfoModel bottomSheetInfo, GoalSettingsTileTagModel tag, Boolean custom) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(categories, "categories");
        AbstractC22676k.m65750j(style, "style");
        return new TogglesModel(id4, title, icon, subtitle, categories, avoidTextDisplay, trend, isToggled, backgroundImage, selectedValue, selected, isAvoidChecked, style, dayOptions, sortPriority, weeklyPlanGoal, bottomSheetInfo, tag, custom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TogglesModel)) {
            return false;
        }
        TogglesModel togglesModel = (TogglesModel) other;
        return AbstractC22676k.m65745e(this.id, togglesModel.id) && AbstractC22676k.m65745e(this.title, togglesModel.title) && AbstractC22676k.m65745e(this.icon, togglesModel.icon) && AbstractC22676k.m65745e(this.subtitle, togglesModel.subtitle) && AbstractC22676k.m65745e(this.categories, togglesModel.categories) && AbstractC22676k.m65745e(this.avoidTextDisplay, togglesModel.avoidTextDisplay) && AbstractC22676k.m65745e(this.trend, togglesModel.trend) && AbstractC22676k.m65745e(this.isToggled, togglesModel.isToggled) && AbstractC22676k.m65745e(this.backgroundImage, togglesModel.backgroundImage) && AbstractC22676k.m65745e(this.selectedValue, togglesModel.selectedValue) && AbstractC22676k.m65745e(this.selected, togglesModel.selected) && AbstractC22676k.m65745e(this.isAvoidChecked, togglesModel.isAvoidChecked) && this.style == togglesModel.style && AbstractC22676k.m65745e(this.dayOptions, togglesModel.dayOptions) && AbstractC22676k.m65745e(this.sortPriority, togglesModel.sortPriority) && AbstractC22676k.m65745e(this.weeklyPlanGoal, togglesModel.weeklyPlanGoal) && AbstractC22676k.m65745e(this.bottomSheetInfo, togglesModel.bottomSheetInfo) && AbstractC22676k.m65745e(this.tag, togglesModel.tag) && AbstractC22676k.m65745e(this.custom, togglesModel.custom);
    }

    public final String getAvoidTextDisplay() {
        return this.avoidTextDisplay;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final BottomSheetInfoModel getBottomSheetInfo() {
        return this.bottomSheetInfo;
    }

    public final List<String> getCategories() {
        return this.categories;
    }

    public final Boolean getCustom() {
        return this.custom;
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

    public final Boolean getSelected() {
        return this.selected;
    }

    public final Integer getSelectedValue() {
        return this.selectedValue;
    }

    public final Integer getSortPriority() {
        return this.sortPriority;
    }

    public final GoalSettingsTileStyle getStyle() {
        return this.style;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final GoalSettingsTileTagModel getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ImpactModel getTrend() {
        return this.trend;
    }

    public final Boolean getWeeklyPlanGoal() {
        return this.weeklyPlanGoal;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title);
        String str = this.icon;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.categories);
        String str3 = this.avoidTextDisplay;
        int iHashCode2 = (iM31983b + (str3 == null ? 0 : str3.hashCode())) * 31;
        ImpactModel impactModel = this.trend;
        int iHashCode3 = (iHashCode2 + (impactModel == null ? 0 : impactModel.hashCode())) * 31;
        Boolean bool = this.isToggled;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.backgroundImage;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.selectedValue;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.selected;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isAvoidChecked;
        int iHashCode8 = (this.style.hashCode() + ((iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31)) * 31;
        DayOptions dayOptions = this.dayOptions;
        int iHashCode9 = (iHashCode8 + (dayOptions == null ? 0 : dayOptions.hashCode())) * 31;
        Integer num2 = this.sortPriority;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.weeklyPlanGoal;
        int iHashCode11 = (iHashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        BottomSheetInfoModel bottomSheetInfoModel = this.bottomSheetInfo;
        int iHashCode12 = (iHashCode11 + (bottomSheetInfoModel == null ? 0 : bottomSheetInfoModel.hashCode())) * 31;
        GoalSettingsTileTagModel goalSettingsTileTagModel = this.tag;
        int iHashCode13 = (iHashCode12 + (goalSettingsTileTagModel == null ? 0 : goalSettingsTileTagModel.hashCode())) * 31;
        Boolean bool5 = this.custom;
        return iHashCode13 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final Boolean isAvoidChecked() {
        return this.isAvoidChecked;
    }

    public final Boolean isToggled() {
        return this.isToggled;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.icon;
        String str4 = this.subtitle;
        List<String> list = this.categories;
        String str5 = this.avoidTextDisplay;
        ImpactModel impactModel = this.trend;
        Boolean bool = this.isToggled;
        String str6 = this.backgroundImage;
        Integer num = this.selectedValue;
        Boolean bool2 = this.selected;
        Boolean bool3 = this.isAvoidChecked;
        GoalSettingsTileStyle goalSettingsTileStyle = this.style;
        DayOptions dayOptions = this.dayOptions;
        Integer num2 = this.sortPriority;
        Boolean bool4 = this.weeklyPlanGoal;
        BottomSheetInfoModel bottomSheetInfoModel = this.bottomSheetInfo;
        GoalSettingsTileTagModel goalSettingsTileTagModel = this.tag;
        Boolean bool5 = this.custom;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TogglesModel(id=", str, ", title=", str2, ", icon=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", subtitle=", str4, ", categories=");
        AbstractC17176i.m48511m(", avoidTextDisplay=", str5, ", trend=", sbM32001t, list);
        sbM32001t.append(impactModel);
        sbM32001t.append(", isToggled=");
        sbM32001t.append(bool);
        sbM32001t.append(", backgroundImage=");
        AbstractC30007c.m91853w(num, str6, ", selectedValue=", ", selected=", sbM32001t);
        AbstractC3855a.m11839w(sbM32001t, bool2, ", isAvoidChecked=", bool3, ", style=");
        sbM32001t.append(goalSettingsTileStyle);
        sbM32001t.append(", dayOptions=");
        sbM32001t.append(dayOptions);
        sbM32001t.append(", sortPriority=");
        sbM32001t.append(num2);
        sbM32001t.append(", weeklyPlanGoal=");
        sbM32001t.append(bool4);
        sbM32001t.append(", bottomSheetInfo=");
        sbM32001t.append(bottomSheetInfoModel);
        sbM32001t.append(", tag=");
        sbM32001t.append(goalSettingsTileTagModel);
        sbM32001t.append(", custom=");
        return AbstractC11478a.m30858j(sbM32001t, bool5, ")");
    }

    public TogglesModel(String id4, String title, String str, String str2, List<String> categories, String str3, ImpactModel impactModel, Boolean bool, String str4, Integer num, Boolean bool2, Boolean bool3, GoalSettingsTileStyle style, DayOptions dayOptions, Integer num2, Boolean bool4, BottomSheetInfoModel bottomSheetInfoModel, GoalSettingsTileTagModel goalSettingsTileTagModel, Boolean bool5) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(categories, "categories");
        AbstractC22676k.m65750j(style, "style");
        this.id = id4;
        this.title = title;
        this.icon = str;
        this.subtitle = str2;
        this.categories = categories;
        this.avoidTextDisplay = str3;
        this.trend = impactModel;
        this.isToggled = bool;
        this.backgroundImage = str4;
        this.selectedValue = num;
        this.selected = bool2;
        this.isAvoidChecked = bool3;
        this.style = style;
        this.dayOptions = dayOptions;
        this.sortPriority = num2;
        this.weeklyPlanGoal = bool4;
        this.bottomSheetInfo = bottomSheetInfoModel;
        this.tag = goalSettingsTileTagModel;
        this.custom = bool5;
    }

    public /* synthetic */ TogglesModel(String str, String str2, String str3, String str4, List list, String str5, ImpactModel impactModel, Boolean bool, String str6, Integer num, Boolean bool2, Boolean bool3, GoalSettingsTileStyle goalSettingsTileStyle, DayOptions dayOptions, Integer num2, Boolean bool4, BottomSheetInfoModel bottomSheetInfoModel, GoalSettingsTileTagModel goalSettingsTileTagModel, Boolean bool5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, str5, impactModel, bool, str6, num, bool2, bool3, goalSettingsTileStyle, dayOptions, num2, bool4, bottomSheetInfoModel, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : goalSettingsTileTagModel, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : bool5);
    }
}
