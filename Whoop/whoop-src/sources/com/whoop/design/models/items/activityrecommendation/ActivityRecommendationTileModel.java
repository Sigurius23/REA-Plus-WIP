package com.whoop.design.models.items.activityrecommendation;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import wr1.C37572f;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u0000 `2\u00020\u0001:\u0002a`B\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B¥\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001cJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001cJ\u0012\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b,\u0010-J²\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u001cJ\u0010\u00101\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020\u00042\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106J'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b=\u0010>R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010@\u0012\u0004\bB\u0010C\u001a\u0004\bA\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010D\u0012\u0004\bE\u0010C\u001a\u0004\b\u0005\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010@\u0012\u0004\bG\u0010C\u001a\u0004\bF\u0010\u001cR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010@\u0012\u0004\bI\u0010C\u001a\u0004\bH\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010@\u0012\u0004\bK\u0010C\u001a\u0004\bJ\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010@\u0012\u0004\bM\u0010C\u001a\u0004\bL\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010@\u0012\u0004\bO\u0010C\u001a\u0004\bN\u0010\u001cR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010@\u0012\u0004\bQ\u0010C\u001a\u0004\bP\u0010\u001cR\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010@\u0012\u0004\bS\u0010C\u001a\u0004\bR\u0010\u001cR\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010@\u0012\u0004\bU\u0010C\u001a\u0004\bT\u0010\u001cR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010@\u0012\u0004\bW\u0010C\u001a\u0004\bV\u0010\u001cR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010X\u0012\u0004\bZ\u0010C\u001a\u0004\bY\u0010)R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010[\u001a\u0004\b\\\u0010+R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010]\u0012\u0004\b_\u0010C\u001a\u0004\b^\u0010-¨\u0006b"}, m65681d2 = {"Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "", "isSelected", "iconUrl", "activityTitle", "activityStrain", "activityDuration", "activityDurationUnit", "activityDurationLabel", "intensityStyle", "intensityTitle", "intensitySubtitle", "Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;", "targetZones", "content", "Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;", "buttonViewState", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;", "component13", "()Lcom/whoop/design/models/DesignSystemModel;", "component14", "()Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;)Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Z", "isSelected$annotations", "getIconUrl", "getIconUrl$annotations", "getActivityTitle", "getActivityTitle$annotations", "getActivityStrain", "getActivityStrain$annotations", "getActivityDuration", "getActivityDuration$annotations", "getActivityDurationUnit", "getActivityDurationUnit$annotations", "getActivityDurationLabel", "getActivityDurationLabel$annotations", "getIntensityStyle", "getIntensityStyle$annotations", "getIntensityTitle", "getIntensityTitle$annotations", "getIntensitySubtitle", "getIntensitySubtitle$annotations", "Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;", "getTargetZones", "getTargetZones$annotations", "Lcom/whoop/design/models/DesignSystemModel;", "getContent", "Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;", "getButtonViewState", "getButtonViewState$annotations", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActivityRecommendationTileModel implements DesignSystemModel {
    private final String activityDuration;
    private final String activityDurationLabel;
    private final String activityDurationUnit;
    private final String activityStrain;
    private final String activityTitle;
    private final ActivityRecommendationButtonModel buttonViewState;
    private final DesignSystemModel content;
    private final String iconUrl;
    private final String id;
    private final String intensityStyle;
    private final String intensitySubtitle;
    private final String intensityTitle;
    private final boolean isSelected;
    private final TargetZonesModel targetZones;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37572f(28)), null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActivityRecommendationTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ActivityRecommendationTileModel(int i13, String str, boolean z4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, TargetZonesModel targetZonesModel, DesignSystemModel designSystemModel, ActivityRecommendationButtonModel activityRecommendationButtonModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (12287 != (i13 & 12287)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 12287, ActivityRecommendationTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.isSelected = z4;
        this.iconUrl = str2;
        this.activityTitle = str3;
        this.activityStrain = str4;
        this.activityDuration = str5;
        this.activityDurationUnit = str6;
        this.activityDurationLabel = str7;
        this.intensityStyle = str8;
        this.intensityTitle = str9;
        this.intensitySubtitle = str10;
        this.targetZones = targetZonesModel;
        this.content = (i13 & 4096) == 0 ? null : designSystemModel;
        this.buttonViewState = activityRecommendationButtonModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    @InterfaceC37143h("activity_duration")
    public static /* synthetic */ void getActivityDuration$annotations() {
    }

    @InterfaceC37143h("activity_duration_label")
    public static /* synthetic */ void getActivityDurationLabel$annotations() {
    }

    @InterfaceC37143h("activity_duration_unit")
    public static /* synthetic */ void getActivityDurationUnit$annotations() {
    }

    @InterfaceC37143h("activity_strain")
    public static /* synthetic */ void getActivityStrain$annotations() {
    }

    @InterfaceC37143h("activity_title")
    public static /* synthetic */ void getActivityTitle$annotations() {
    }

    @InterfaceC37143h("button_view_state")
    public static /* synthetic */ void getButtonViewState$annotations() {
    }

    @InterfaceC37143h("icon_url")
    public static /* synthetic */ void getIconUrl$annotations() {
    }

    @InterfaceC37143h("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC37143h("intensity_style")
    public static /* synthetic */ void getIntensityStyle$annotations() {
    }

    @InterfaceC37143h("intensity_subtitle")
    public static /* synthetic */ void getIntensitySubtitle$annotations() {
    }

    @InterfaceC37143h("intensity_title")
    public static /* synthetic */ void getIntensityTitle$annotations() {
    }

    @InterfaceC37143h("target_zones")
    public static /* synthetic */ void getTargetZones$annotations() {
    }

    @InterfaceC37143h("is_selected")
    public static /* synthetic */ void isSelected$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(ActivityRecommendationTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeBooleanElement(serialDesc, 1, self.isSelected);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.iconUrl);
        output.encodeStringElement(serialDesc, 3, self.activityTitle);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.activityStrain);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.activityDuration);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.activityDurationUnit);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.activityDurationLabel);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.intensityStyle);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.intensityTitle);
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.intensitySubtitle);
        output.encodeNullableSerializableElement(serialDesc, 11, TargetZonesModel$$serializer.INSTANCE, self.targetZones);
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.content != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, (InterfaceC37145j) interfaceC23462hArr[12].getValue(), self.content);
        }
        output.encodeNullableSerializableElement(serialDesc, 13, ActivityRecommendationButtonModel$$serializer.INSTANCE, self.buttonViewState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getIntensityTitle() {
        return this.intensityTitle;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getIntensitySubtitle() {
        return this.intensitySubtitle;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final TargetZonesModel getTargetZones() {
        return this.targetZones;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final DesignSystemModel getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final ActivityRecommendationButtonModel getButtonViewState() {
        return this.buttonViewState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getActivityTitle() {
        return this.activityTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getActivityStrain() {
        return this.activityStrain;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getActivityDuration() {
        return this.activityDuration;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getActivityDurationUnit() {
        return this.activityDurationUnit;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getActivityDurationLabel() {
        return this.activityDurationLabel;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIntensityStyle() {
        return this.intensityStyle;
    }

    public final ActivityRecommendationTileModel copy(String id4, boolean isSelected, String iconUrl, String activityTitle, String activityStrain, String activityDuration, String activityDurationUnit, String activityDurationLabel, String intensityStyle, String intensityTitle, String intensitySubtitle, TargetZonesModel targetZones, DesignSystemModel content, ActivityRecommendationButtonModel buttonViewState) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(activityTitle, "activityTitle");
        return new ActivityRecommendationTileModel(id4, isSelected, iconUrl, activityTitle, activityStrain, activityDuration, activityDurationUnit, activityDurationLabel, intensityStyle, intensityTitle, intensitySubtitle, targetZones, content, buttonViewState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityRecommendationTileModel)) {
            return false;
        }
        ActivityRecommendationTileModel activityRecommendationTileModel = (ActivityRecommendationTileModel) other;
        return AbstractC22676k.m65745e(this.id, activityRecommendationTileModel.id) && this.isSelected == activityRecommendationTileModel.isSelected && AbstractC22676k.m65745e(this.iconUrl, activityRecommendationTileModel.iconUrl) && AbstractC22676k.m65745e(this.activityTitle, activityRecommendationTileModel.activityTitle) && AbstractC22676k.m65745e(this.activityStrain, activityRecommendationTileModel.activityStrain) && AbstractC22676k.m65745e(this.activityDuration, activityRecommendationTileModel.activityDuration) && AbstractC22676k.m65745e(this.activityDurationUnit, activityRecommendationTileModel.activityDurationUnit) && AbstractC22676k.m65745e(this.activityDurationLabel, activityRecommendationTileModel.activityDurationLabel) && AbstractC22676k.m65745e(this.intensityStyle, activityRecommendationTileModel.intensityStyle) && AbstractC22676k.m65745e(this.intensityTitle, activityRecommendationTileModel.intensityTitle) && AbstractC22676k.m65745e(this.intensitySubtitle, activityRecommendationTileModel.intensitySubtitle) && AbstractC22676k.m65745e(this.targetZones, activityRecommendationTileModel.targetZones) && AbstractC22676k.m65745e(this.content, activityRecommendationTileModel.content) && AbstractC22676k.m65745e(this.buttonViewState, activityRecommendationTileModel.buttonViewState);
    }

    public final String getActivityDuration() {
        return this.activityDuration;
    }

    public final String getActivityDurationLabel() {
        return this.activityDurationLabel;
    }

    public final String getActivityDurationUnit() {
        return this.activityDurationUnit;
    }

    public final String getActivityStrain() {
        return this.activityStrain;
    }

    public final String getActivityTitle() {
        return this.activityTitle;
    }

    public final ActivityRecommendationButtonModel getButtonViewState() {
        return this.buttonViewState;
    }

    public final DesignSystemModel getContent() {
        return this.content;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getIntensityStyle() {
        return this.intensityStyle;
    }

    public final String getIntensitySubtitle() {
        return this.intensitySubtitle;
    }

    public final String getIntensityTitle() {
        return this.intensityTitle;
    }

    public final TargetZonesModel getTargetZones() {
        return this.targetZones;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.id.hashCode() * 31, 31, this.isSelected);
        String str = this.iconUrl;
        int iM30450d = AbstractC11266d.m30450d((iM8289b + (str == null ? 0 : str.hashCode())) * 31, 31, this.activityTitle);
        String str2 = this.activityStrain;
        int iHashCode = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.activityDuration;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.activityDurationUnit;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.activityDurationLabel;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.intensityStyle;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.intensityTitle;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.intensitySubtitle;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        TargetZonesModel targetZonesModel = this.targetZones;
        int iHashCode8 = (iHashCode7 + (targetZonesModel == null ? 0 : targetZonesModel.hashCode())) * 31;
        DesignSystemModel designSystemModel = this.content;
        int iHashCode9 = (iHashCode8 + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        ActivityRecommendationButtonModel activityRecommendationButtonModel = this.buttonViewState;
        return iHashCode9 + (activityRecommendationButtonModel != null ? activityRecommendationButtonModel.hashCode() : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        String str = this.id;
        boolean z4 = this.isSelected;
        String str2 = this.iconUrl;
        String str3 = this.activityTitle;
        String str4 = this.activityStrain;
        String str5 = this.activityDuration;
        String str6 = this.activityDurationUnit;
        String str7 = this.activityDurationLabel;
        String str8 = this.intensityStyle;
        String str9 = this.intensityTitle;
        String str10 = this.intensitySubtitle;
        TargetZonesModel targetZonesModel = this.targetZones;
        DesignSystemModel designSystemModel = this.content;
        ActivityRecommendationButtonModel activityRecommendationButtonModel = this.buttonViewState;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("ActivityRecommendationTileModel(id=", str, ", isSelected=", ", iconUrl=", z4);
        AbstractC11266d.m30444B(sbM73379l, str2, ", activityTitle=", str3, ", activityStrain=");
        AbstractC11266d.m30444B(sbM73379l, str4, ", activityDuration=", str5, ", activityDurationUnit=");
        AbstractC11266d.m30444B(sbM73379l, str6, ", activityDurationLabel=", str7, ", intensityStyle=");
        AbstractC11266d.m30444B(sbM73379l, str8, ", intensityTitle=", str9, ", intensitySubtitle=");
        sbM73379l.append(str10);
        sbM73379l.append(", targetZones=");
        sbM73379l.append(targetZonesModel);
        sbM73379l.append(", content=");
        sbM73379l.append(designSystemModel);
        sbM73379l.append(", buttonViewState=");
        sbM73379l.append(activityRecommendationButtonModel);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }

    public ActivityRecommendationTileModel(String id4, boolean z4, String str, String activityTitle, String str2, String str3, String str4, String str5, String str6, String str7, String str8, TargetZonesModel targetZonesModel, DesignSystemModel designSystemModel, ActivityRecommendationButtonModel activityRecommendationButtonModel) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(activityTitle, "activityTitle");
        this.id = id4;
        this.isSelected = z4;
        this.iconUrl = str;
        this.activityTitle = activityTitle;
        this.activityStrain = str2;
        this.activityDuration = str3;
        this.activityDurationUnit = str4;
        this.activityDurationLabel = str5;
        this.intensityStyle = str6;
        this.intensityTitle = str7;
        this.intensitySubtitle = str8;
        this.targetZones = targetZonesModel;
        this.content = designSystemModel;
        this.buttonViewState = activityRecommendationButtonModel;
    }

    public /* synthetic */ ActivityRecommendationTileModel(String str, boolean z4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, TargetZonesModel targetZonesModel, DesignSystemModel designSystemModel, ActivityRecommendationButtonModel activityRecommendationButtonModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z4, str2, str3, str4, str5, str6, str7, str8, str9, str10, targetZonesModel, (i13 & 4096) != 0 ? null : designSystemModel, activityRecommendationButtonModel);
    }
}
