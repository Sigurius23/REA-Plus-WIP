package com.whoop.weeklyplan.hubandspoke.domain.api;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weeklyplan.customizeplan.domain.api.SmartAlarmOverrideV2;
import com.whoop.weeklyplan.customizeplan.domain.api.SmartAlarmOverrideV2$$serializer;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModelV2;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModelV2$$serializer;
import java.util.List;
import kg2.C22458d;
import kotlinx.serialization.internal.ArrayListSerializer;
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
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 n2\u00020\u0001:\u0002onB±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 BÛ\u0001\b\u0010\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b\u001f\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010'J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010'J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010'J\u0010\u0010.\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b4\u00105J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b8\u00109J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012HÆ\u0003¢\u0006\u0004\b:\u00107J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010'J\u0012\u0010<\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b>\u0010=J\u0012\u0010?\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b?\u0010@JÜ\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bC\u0010'J\u0010\u0010D\u001a\u00020!HÖ\u0001¢\u0006\u0004\bD\u0010EJ\u001a\u0010H\u001a\u00020G2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bH\u0010IJ'\u0010R\u001a\u00020O2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0001¢\u0006\u0004\bP\u0010QR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010S\u001a\u0004\bT\u0010'R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010S\u001a\u0004\bU\u0010'R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010S\u001a\u0004\bV\u0010'R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010S\u001a\u0004\bW\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010S\u001a\u0004\bX\u0010'R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010S\u001a\u0004\bY\u0010'R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010S\u001a\u0004\bZ\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010[\u001a\u0004\b\\\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010]\u001a\u0004\b^\u00101R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010_\u001a\u0004\b`\u00103R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010a\u001a\u0004\bb\u00105R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010c\u001a\u0004\bd\u00107R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010e\u001a\u0004\bf\u00109R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010c\u001a\u0004\bg\u00107R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010S\u001a\u0004\bh\u0010'R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010i\u001a\u0004\bj\u0010=R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010i\u001a\u0004\bk\u0010=R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010l\u001a\u0004\bm\u0010@¨\u0006p"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;", "", "", "planId", "currentPlanTitle", "navigationTitle", "headerDisplay", "headerImageUrl", "subtitle", "startPlanButtonText", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;", "initialSelection", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;", "metricSection", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;", "behaviorSection", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;", "activitiesSection", "", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;", "metricDetails", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;", "metricScreen", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;", "goalScreens", "endPlanButtonText", "Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;", "endPlanDialog", "unsavedChangesDialog", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;", "component9", "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;", "component10", "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;", "component11", "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;", "component12", "()Ljava/util/List;", "component13", "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;", "component14", "component15", "component16", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;", "component17", "component18", "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getPlanId", "getCurrentPlanTitle", "getNavigationTitle", "getHeaderDisplay", "getHeaderImageUrl", "getSubtitle", "getStartPlanButtonText", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;", "getInitialSelection", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;", "getMetricSection", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;", "getBehaviorSection", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;", "getActivitiesSection", "Ljava/util/List;", "getMetricDetails", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;", "getMetricScreen", "getGoalScreens", "getEndPlanButtonText", "Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;", "getEndPlanDialog", "getUnsavedChangesDialog", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;", "getMetadata", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HubAndSpokeResponseKotlinx {
    private static final InterfaceC23462h[] $childSerializers;
    private final ActivitiesSectionKotlinx activitiesSection;
    private final BehaviorSectionKotlinx behaviorSection;
    private final String currentPlanTitle;
    private final String endPlanButtonText;
    private final SmartAlarmOverrideV2 endPlanDialog;
    private final List<WeeklyPlanCustomizationScreenModelV2> goalScreens;
    private final String headerDisplay;
    private final String headerImageUrl;
    private final InitialSelectionKotlinx initialSelection;
    private final MetaDataKotlinx metadata;
    private final List<MetricDetailKotlinx> metricDetails;
    private final MetricScreenKotlinx metricScreen;
    private final MetricSectionKotlinx metricSection;
    private final String navigationTitle;
    private final String planId;
    private final String startPlanButtonText;
    private final String subtitle;
    private final SmartAlarmOverrideV2 unsavedChangesDialog;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HubAndSpokeResponseKotlinx$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C22458d(28)), null, AbstractC30060g.m92087G(enumC23463i, new C22458d(29)), null, null, null, null};
    }

    public /* synthetic */ HubAndSpokeResponseKotlinx(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, InitialSelectionKotlinx initialSelectionKotlinx, MetricSectionKotlinx metricSectionKotlinx, BehaviorSectionKotlinx behaviorSectionKotlinx, ActivitiesSectionKotlinx activitiesSectionKotlinx, List list, MetricScreenKotlinx metricScreenKotlinx, List list2, String str8, SmartAlarmOverrideV2 smartAlarmOverrideV2, SmartAlarmOverrideV2 smartAlarmOverrideV3, MetaDataKotlinx metaDataKotlinx, SerializationConstructorMarker serializationConstructorMarker) {
        if (131071 != (i13 & 131071)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 131071, HubAndSpokeResponseKotlinx$$serializer.INSTANCE.getDescriptor());
        }
        this.planId = str;
        this.currentPlanTitle = str2;
        this.navigationTitle = str3;
        this.headerDisplay = str4;
        this.headerImageUrl = str5;
        this.subtitle = str6;
        this.startPlanButtonText = str7;
        this.initialSelection = initialSelectionKotlinx;
        this.metricSection = metricSectionKotlinx;
        this.behaviorSection = behaviorSectionKotlinx;
        this.activitiesSection = activitiesSectionKotlinx;
        this.metricDetails = list;
        this.metricScreen = metricScreenKotlinx;
        this.goalScreens = list2;
        this.endPlanButtonText = str8;
        this.endPlanDialog = smartAlarmOverrideV2;
        this.unsavedChangesDialog = smartAlarmOverrideV3;
        this.metadata = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) == 0 ? null : metaDataKotlinx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(MetricDetailKotlinx$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(WeeklyPlanCustomizationScreenModelV2$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HubAndSpokeResponseKotlinx copy$default(HubAndSpokeResponseKotlinx hubAndSpokeResponseKotlinx, String str, String str2, String str3, String str4, String str5, String str6, String str7, InitialSelectionKotlinx initialSelectionKotlinx, MetricSectionKotlinx metricSectionKotlinx, BehaviorSectionKotlinx behaviorSectionKotlinx, ActivitiesSectionKotlinx activitiesSectionKotlinx, List list, MetricScreenKotlinx metricScreenKotlinx, List list2, String str8, SmartAlarmOverrideV2 smartAlarmOverrideV2, SmartAlarmOverrideV2 smartAlarmOverrideV3, MetaDataKotlinx metaDataKotlinx, int i13, Object obj) {
        MetaDataKotlinx metaDataKotlinx2;
        SmartAlarmOverrideV2 smartAlarmOverrideV4;
        String str9 = (i13 & 1) != 0 ? hubAndSpokeResponseKotlinx.planId : str;
        String str10 = (i13 & 2) != 0 ? hubAndSpokeResponseKotlinx.currentPlanTitle : str2;
        String str11 = (i13 & 4) != 0 ? hubAndSpokeResponseKotlinx.navigationTitle : str3;
        String str12 = (i13 & 8) != 0 ? hubAndSpokeResponseKotlinx.headerDisplay : str4;
        String str13 = (i13 & 16) != 0 ? hubAndSpokeResponseKotlinx.headerImageUrl : str5;
        String str14 = (i13 & 32) != 0 ? hubAndSpokeResponseKotlinx.subtitle : str6;
        String str15 = (i13 & 64) != 0 ? hubAndSpokeResponseKotlinx.startPlanButtonText : str7;
        InitialSelectionKotlinx initialSelectionKotlinx2 = (i13 & 128) != 0 ? hubAndSpokeResponseKotlinx.initialSelection : initialSelectionKotlinx;
        MetricSectionKotlinx metricSectionKotlinx2 = (i13 & 256) != 0 ? hubAndSpokeResponseKotlinx.metricSection : metricSectionKotlinx;
        BehaviorSectionKotlinx behaviorSectionKotlinx2 = (i13 & 512) != 0 ? hubAndSpokeResponseKotlinx.behaviorSection : behaviorSectionKotlinx;
        ActivitiesSectionKotlinx activitiesSectionKotlinx2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? hubAndSpokeResponseKotlinx.activitiesSection : activitiesSectionKotlinx;
        List list3 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? hubAndSpokeResponseKotlinx.metricDetails : list;
        MetricScreenKotlinx metricScreenKotlinx2 = (i13 & 4096) != 0 ? hubAndSpokeResponseKotlinx.metricScreen : metricScreenKotlinx;
        List list4 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? hubAndSpokeResponseKotlinx.goalScreens : list2;
        String str16 = str9;
        String str17 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? hubAndSpokeResponseKotlinx.endPlanButtonText : str8;
        SmartAlarmOverrideV2 smartAlarmOverrideV5 = (i13 & 32768) != 0 ? hubAndSpokeResponseKotlinx.endPlanDialog : smartAlarmOverrideV2;
        SmartAlarmOverrideV2 smartAlarmOverrideV6 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? hubAndSpokeResponseKotlinx.unsavedChangesDialog : smartAlarmOverrideV3;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            smartAlarmOverrideV4 = smartAlarmOverrideV6;
            metaDataKotlinx2 = hubAndSpokeResponseKotlinx.metadata;
        } else {
            metaDataKotlinx2 = metaDataKotlinx;
            smartAlarmOverrideV4 = smartAlarmOverrideV6;
        }
        return hubAndSpokeResponseKotlinx.copy(str16, str10, str11, str12, str13, str14, str15, initialSelectionKotlinx2, metricSectionKotlinx2, behaviorSectionKotlinx2, activitiesSectionKotlinx2, list3, metricScreenKotlinx2, list4, str17, smartAlarmOverrideV5, smartAlarmOverrideV4, metaDataKotlinx2);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(HubAndSpokeResponseKotlinx self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.planId);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.currentPlanTitle);
        output.encodeStringElement(serialDesc, 2, self.navigationTitle);
        output.encodeStringElement(serialDesc, 3, self.headerDisplay);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.headerImageUrl);
        output.encodeStringElement(serialDesc, 5, self.subtitle);
        output.encodeStringElement(serialDesc, 6, self.startPlanButtonText);
        output.encodeSerializableElement(serialDesc, 7, InitialSelectionKotlinx$$serializer.INSTANCE, self.initialSelection);
        output.encodeSerializableElement(serialDesc, 8, MetricSectionKotlinx$$serializer.INSTANCE, self.metricSection);
        output.encodeSerializableElement(serialDesc, 9, BehaviorSectionKotlinx$$serializer.INSTANCE, self.behaviorSection);
        output.encodeSerializableElement(serialDesc, 10, ActivitiesSectionKotlinx$$serializer.INSTANCE, self.activitiesSection);
        output.encodeSerializableElement(serialDesc, 11, (InterfaceC37145j) interfaceC23462hArr[11].getValue(), self.metricDetails);
        output.encodeSerializableElement(serialDesc, 12, MetricScreenKotlinx$$serializer.INSTANCE, self.metricScreen);
        output.encodeSerializableElement(serialDesc, 13, (InterfaceC37145j) interfaceC23462hArr[13].getValue(), self.goalScreens);
        output.encodeNullableSerializableElement(serialDesc, 14, stringSerializer, self.endPlanButtonText);
        SmartAlarmOverrideV2$$serializer smartAlarmOverrideV2$$serializer = SmartAlarmOverrideV2$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 15, smartAlarmOverrideV2$$serializer, self.endPlanDialog);
        output.encodeNullableSerializableElement(serialDesc, 16, smartAlarmOverrideV2$$serializer, self.unsavedChangesDialog);
        if (!output.shouldEncodeElementDefault(serialDesc, 17) && self.metadata == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 17, MetaDataKotlinx$$serializer.INSTANCE, self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BehaviorSectionKotlinx getBehaviorSection() {
        return this.behaviorSection;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final ActivitiesSectionKotlinx getActivitiesSection() {
        return this.activitiesSection;
    }

    public final List<MetricDetailKotlinx> component12() {
        return this.metricDetails;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final MetricScreenKotlinx getMetricScreen() {
        return this.metricScreen;
    }

    public final List<WeeklyPlanCustomizationScreenModelV2> component14() {
        return this.goalScreens;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getEndPlanButtonText() {
        return this.endPlanButtonText;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final SmartAlarmOverrideV2 getEndPlanDialog() {
        return this.endPlanDialog;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final SmartAlarmOverrideV2 getUnsavedChangesDialog() {
        return this.unsavedChangesDialog;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final MetaDataKotlinx getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrentPlanTitle() {
        return this.currentPlanTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHeaderDisplay() {
        return this.headerDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStartPlanButtonText() {
        return this.startPlanButtonText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final InitialSelectionKotlinx getInitialSelection() {
        return this.initialSelection;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final MetricSectionKotlinx getMetricSection() {
        return this.metricSection;
    }

    public final HubAndSpokeResponseKotlinx copy(String planId, String currentPlanTitle, String navigationTitle, String headerDisplay, String headerImageUrl, String subtitle, String startPlanButtonText, InitialSelectionKotlinx initialSelection, MetricSectionKotlinx metricSection, BehaviorSectionKotlinx behaviorSection, ActivitiesSectionKotlinx activitiesSection, List<MetricDetailKotlinx> metricDetails, MetricScreenKotlinx metricScreen, List<WeeklyPlanCustomizationScreenModelV2> goalScreens, String endPlanButtonText, SmartAlarmOverrideV2 endPlanDialog, SmartAlarmOverrideV2 unsavedChangesDialog, MetaDataKotlinx metadata) {
        AbstractC22676k.m65750j(planId, "planId");
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(headerDisplay, "headerDisplay");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(startPlanButtonText, "startPlanButtonText");
        AbstractC22676k.m65750j(initialSelection, "initialSelection");
        AbstractC22676k.m65750j(metricSection, "metricSection");
        AbstractC22676k.m65750j(behaviorSection, "behaviorSection");
        AbstractC22676k.m65750j(activitiesSection, "activitiesSection");
        AbstractC22676k.m65750j(metricDetails, "metricDetails");
        AbstractC22676k.m65750j(metricScreen, "metricScreen");
        AbstractC22676k.m65750j(goalScreens, "goalScreens");
        return new HubAndSpokeResponseKotlinx(planId, currentPlanTitle, navigationTitle, headerDisplay, headerImageUrl, subtitle, startPlanButtonText, initialSelection, metricSection, behaviorSection, activitiesSection, metricDetails, metricScreen, goalScreens, endPlanButtonText, endPlanDialog, unsavedChangesDialog, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HubAndSpokeResponseKotlinx)) {
            return false;
        }
        HubAndSpokeResponseKotlinx hubAndSpokeResponseKotlinx = (HubAndSpokeResponseKotlinx) other;
        return AbstractC22676k.m65745e(this.planId, hubAndSpokeResponseKotlinx.planId) && AbstractC22676k.m65745e(this.currentPlanTitle, hubAndSpokeResponseKotlinx.currentPlanTitle) && AbstractC22676k.m65745e(this.navigationTitle, hubAndSpokeResponseKotlinx.navigationTitle) && AbstractC22676k.m65745e(this.headerDisplay, hubAndSpokeResponseKotlinx.headerDisplay) && AbstractC22676k.m65745e(this.headerImageUrl, hubAndSpokeResponseKotlinx.headerImageUrl) && AbstractC22676k.m65745e(this.subtitle, hubAndSpokeResponseKotlinx.subtitle) && AbstractC22676k.m65745e(this.startPlanButtonText, hubAndSpokeResponseKotlinx.startPlanButtonText) && AbstractC22676k.m65745e(this.initialSelection, hubAndSpokeResponseKotlinx.initialSelection) && AbstractC22676k.m65745e(this.metricSection, hubAndSpokeResponseKotlinx.metricSection) && AbstractC22676k.m65745e(this.behaviorSection, hubAndSpokeResponseKotlinx.behaviorSection) && AbstractC22676k.m65745e(this.activitiesSection, hubAndSpokeResponseKotlinx.activitiesSection) && AbstractC22676k.m65745e(this.metricDetails, hubAndSpokeResponseKotlinx.metricDetails) && AbstractC22676k.m65745e(this.metricScreen, hubAndSpokeResponseKotlinx.metricScreen) && AbstractC22676k.m65745e(this.goalScreens, hubAndSpokeResponseKotlinx.goalScreens) && AbstractC22676k.m65745e(this.endPlanButtonText, hubAndSpokeResponseKotlinx.endPlanButtonText) && AbstractC22676k.m65745e(this.endPlanDialog, hubAndSpokeResponseKotlinx.endPlanDialog) && AbstractC22676k.m65745e(this.unsavedChangesDialog, hubAndSpokeResponseKotlinx.unsavedChangesDialog) && AbstractC22676k.m65745e(this.metadata, hubAndSpokeResponseKotlinx.metadata);
    }

    public final ActivitiesSectionKotlinx getActivitiesSection() {
        return this.activitiesSection;
    }

    public final BehaviorSectionKotlinx getBehaviorSection() {
        return this.behaviorSection;
    }

    public final String getCurrentPlanTitle() {
        return this.currentPlanTitle;
    }

    public final String getEndPlanButtonText() {
        return this.endPlanButtonText;
    }

    public final SmartAlarmOverrideV2 getEndPlanDialog() {
        return this.endPlanDialog;
    }

    public final List<WeeklyPlanCustomizationScreenModelV2> getGoalScreens() {
        return this.goalScreens;
    }

    public final String getHeaderDisplay() {
        return this.headerDisplay;
    }

    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    public final InitialSelectionKotlinx getInitialSelection() {
        return this.initialSelection;
    }

    public final MetaDataKotlinx getMetadata() {
        return this.metadata;
    }

    public final List<MetricDetailKotlinx> getMetricDetails() {
        return this.metricDetails;
    }

    public final MetricScreenKotlinx getMetricScreen() {
        return this.metricScreen;
    }

    public final MetricSectionKotlinx getMetricSection() {
        return this.metricSection;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final String getPlanId() {
        return this.planId;
    }

    public final String getStartPlanButtonText() {
        return this.startPlanButtonText;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final SmartAlarmOverrideV2 getUnsavedChangesDialog() {
        return this.unsavedChangesDialog;
    }

    public int hashCode() {
        int iHashCode = this.planId.hashCode() * 31;
        String str = this.currentPlanTitle;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.navigationTitle), 31, this.headerDisplay);
        String str2 = this.headerImageUrl;
        int iM31983b = AbstractC11895b.m31983b((this.metricScreen.hashCode() + AbstractC11895b.m31983b((this.activitiesSection.hashCode() + ((this.behaviorSection.hashCode() + ((this.metricSection.hashCode() + ((this.initialSelection.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.subtitle), 31, this.startPlanButtonText)) * 31)) * 31)) * 31)) * 31, 31, this.metricDetails)) * 31, 31, this.goalScreens);
        String str3 = this.endPlanButtonText;
        int iHashCode2 = (iM31983b + (str3 == null ? 0 : str3.hashCode())) * 31;
        SmartAlarmOverrideV2 smartAlarmOverrideV2 = this.endPlanDialog;
        int iHashCode3 = (iHashCode2 + (smartAlarmOverrideV2 == null ? 0 : smartAlarmOverrideV2.hashCode())) * 31;
        SmartAlarmOverrideV2 smartAlarmOverrideV3 = this.unsavedChangesDialog;
        int iHashCode4 = (iHashCode3 + (smartAlarmOverrideV3 == null ? 0 : smartAlarmOverrideV3.hashCode())) * 31;
        MetaDataKotlinx metaDataKotlinx = this.metadata;
        return iHashCode4 + (metaDataKotlinx != null ? metaDataKotlinx.hashCode() : 0);
    }

    public String toString() {
        String str = this.planId;
        String str2 = this.currentPlanTitle;
        String str3 = this.navigationTitle;
        String str4 = this.headerDisplay;
        String str5 = this.headerImageUrl;
        String str6 = this.subtitle;
        String str7 = this.startPlanButtonText;
        InitialSelectionKotlinx initialSelectionKotlinx = this.initialSelection;
        MetricSectionKotlinx metricSectionKotlinx = this.metricSection;
        BehaviorSectionKotlinx behaviorSectionKotlinx = this.behaviorSection;
        ActivitiesSectionKotlinx activitiesSectionKotlinx = this.activitiesSection;
        List<MetricDetailKotlinx> list = this.metricDetails;
        MetricScreenKotlinx metricScreenKotlinx = this.metricScreen;
        List<WeeklyPlanCustomizationScreenModelV2> list2 = this.goalScreens;
        String str8 = this.endPlanButtonText;
        SmartAlarmOverrideV2 smartAlarmOverrideV2 = this.endPlanDialog;
        SmartAlarmOverrideV2 smartAlarmOverrideV3 = this.unsavedChangesDialog;
        MetaDataKotlinx metaDataKotlinx = this.metadata;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HubAndSpokeResponseKotlinx(planId=", str, ", currentPlanTitle=", str2, ", navigationTitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", headerDisplay=", str4, ", headerImageUrl=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", subtitle=", str6, ", startPlanButtonText=");
        sbM32001t.append(str7);
        sbM32001t.append(", initialSelection=");
        sbM32001t.append(initialSelectionKotlinx);
        sbM32001t.append(", metricSection=");
        sbM32001t.append(metricSectionKotlinx);
        sbM32001t.append(", behaviorSection=");
        sbM32001t.append(behaviorSectionKotlinx);
        sbM32001t.append(", activitiesSection=");
        sbM32001t.append(activitiesSectionKotlinx);
        sbM32001t.append(", metricDetails=");
        sbM32001t.append(list);
        sbM32001t.append(", metricScreen=");
        sbM32001t.append(metricScreenKotlinx);
        sbM32001t.append(", goalScreens=");
        sbM32001t.append(list2);
        sbM32001t.append(", endPlanButtonText=");
        sbM32001t.append(str8);
        sbM32001t.append(", endPlanDialog=");
        sbM32001t.append(smartAlarmOverrideV2);
        sbM32001t.append(", unsavedChangesDialog=");
        sbM32001t.append(smartAlarmOverrideV3);
        sbM32001t.append(", metadata=");
        sbM32001t.append(metaDataKotlinx);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public HubAndSpokeResponseKotlinx(String planId, String str, String navigationTitle, String headerDisplay, String str2, String subtitle, String startPlanButtonText, InitialSelectionKotlinx initialSelection, MetricSectionKotlinx metricSection, BehaviorSectionKotlinx behaviorSection, ActivitiesSectionKotlinx activitiesSection, List<MetricDetailKotlinx> metricDetails, MetricScreenKotlinx metricScreen, List<WeeklyPlanCustomizationScreenModelV2> goalScreens, String str3, SmartAlarmOverrideV2 smartAlarmOverrideV2, SmartAlarmOverrideV2 smartAlarmOverrideV3, MetaDataKotlinx metaDataKotlinx) {
        AbstractC22676k.m65750j(planId, "planId");
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(headerDisplay, "headerDisplay");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(startPlanButtonText, "startPlanButtonText");
        AbstractC22676k.m65750j(initialSelection, "initialSelection");
        AbstractC22676k.m65750j(metricSection, "metricSection");
        AbstractC22676k.m65750j(behaviorSection, "behaviorSection");
        AbstractC22676k.m65750j(activitiesSection, "activitiesSection");
        AbstractC22676k.m65750j(metricDetails, "metricDetails");
        AbstractC22676k.m65750j(metricScreen, "metricScreen");
        AbstractC22676k.m65750j(goalScreens, "goalScreens");
        this.planId = planId;
        this.currentPlanTitle = str;
        this.navigationTitle = navigationTitle;
        this.headerDisplay = headerDisplay;
        this.headerImageUrl = str2;
        this.subtitle = subtitle;
        this.startPlanButtonText = startPlanButtonText;
        this.initialSelection = initialSelection;
        this.metricSection = metricSection;
        this.behaviorSection = behaviorSection;
        this.activitiesSection = activitiesSection;
        this.metricDetails = metricDetails;
        this.metricScreen = metricScreen;
        this.goalScreens = goalScreens;
        this.endPlanButtonText = str3;
        this.endPlanDialog = smartAlarmOverrideV2;
        this.unsavedChangesDialog = smartAlarmOverrideV3;
        this.metadata = metaDataKotlinx;
    }

    public /* synthetic */ HubAndSpokeResponseKotlinx(String str, String str2, String str3, String str4, String str5, String str6, String str7, InitialSelectionKotlinx initialSelectionKotlinx, MetricSectionKotlinx metricSectionKotlinx, BehaviorSectionKotlinx behaviorSectionKotlinx, ActivitiesSectionKotlinx activitiesSectionKotlinx, List list, MetricScreenKotlinx metricScreenKotlinx, List list2, String str8, SmartAlarmOverrideV2 smartAlarmOverrideV2, SmartAlarmOverrideV2 smartAlarmOverrideV3, MetaDataKotlinx metaDataKotlinx, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, initialSelectionKotlinx, metricSectionKotlinx, behaviorSectionKotlinx, activitiesSectionKotlinx, list, metricScreenKotlinx, list2, str8, smartAlarmOverrideV2, smartAlarmOverrideV3, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : metaDataKotlinx);
    }
}
