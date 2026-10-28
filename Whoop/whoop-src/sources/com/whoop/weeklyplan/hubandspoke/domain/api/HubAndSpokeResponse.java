package com.whoop.weeklyplan.hubandspoke.domain.api;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weeklyplan.customizeplan.domain.api.SmartAlarmOverride;
import com.whoop.weeklyplan.customizeplan.domain.api.SmartAlarmOverride$$serializer;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModel;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModel$$serializer;
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
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 n2\u00020\u0001:\u0002onB±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 BÛ\u0001\b\u0010\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b\u001f\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010'J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010'J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010'J\u0010\u0010.\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b4\u00105J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b8\u00109J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012HÆ\u0003¢\u0006\u0004\b:\u00107J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010'J\u0012\u0010<\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b>\u0010=J\u0012\u0010?\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b?\u0010@JÜ\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bC\u0010'J\u0010\u0010D\u001a\u00020!HÖ\u0001¢\u0006\u0004\bD\u0010EJ\u001a\u0010H\u001a\u00020G2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bH\u0010IJ'\u0010R\u001a\u00020O2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0001¢\u0006\u0004\bP\u0010QR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010S\u001a\u0004\bT\u0010'R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010S\u001a\u0004\bU\u0010'R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010S\u001a\u0004\bV\u0010'R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010S\u001a\u0004\bW\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010S\u001a\u0004\bX\u0010'R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010S\u001a\u0004\bY\u0010'R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010S\u001a\u0004\bZ\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010[\u001a\u0004\b\\\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010]\u001a\u0004\b^\u00101R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010_\u001a\u0004\b`\u00103R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010a\u001a\u0004\bb\u00105R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010c\u001a\u0004\bd\u00107R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010e\u001a\u0004\bf\u00109R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010c\u001a\u0004\bg\u00107R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010S\u001a\u0004\bh\u0010'R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010i\u001a\u0004\bj\u0010=R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010i\u001a\u0004\bk\u0010=R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010l\u001a\u0004\bm\u0010@¨\u0006p"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;", "", "", "planId", "currentPlanTitle", "navigationTitle", "headerDisplay", "headerImageUrl", "subtitle", "startPlanButtonText", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;", "initialSelection", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSection;", "metricSection", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSection;", "behaviorSection", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSection;", "activitiesSection", "", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;", "metricDetails", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;", "metricScreen", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;", "goalScreens", "endPlanButtonText", "Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;", "endPlanDialog", "unsavedChangesDialog", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaData;", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSection;Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSection;Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSection;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSection;Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSection;Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSection;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;", "component9", "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSection;", "component10", "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSection;", "component11", "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSection;", "component12", "()Ljava/util/List;", "component13", "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;", "component14", "component15", "component16", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;", "component17", "component18", "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaData;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSection;Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSection;Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSection;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaData;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getPlanId", "getCurrentPlanTitle", "getNavigationTitle", "getHeaderDisplay", "getHeaderImageUrl", "getSubtitle", "getStartPlanButtonText", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;", "getInitialSelection", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSection;", "getMetricSection", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSection;", "getBehaviorSection", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSection;", "getActivitiesSection", "Ljava/util/List;", "getMetricDetails", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;", "getMetricScreen", "getGoalScreens", "getEndPlanButtonText", "Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;", "getEndPlanDialog", "getUnsavedChangesDialog", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaData;", "getMetadata", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HubAndSpokeResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final ActivitiesSection activitiesSection;
    private final BehaviorSection behaviorSection;
    private final String currentPlanTitle;
    private final String endPlanButtonText;
    private final SmartAlarmOverride endPlanDialog;
    private final List<WeeklyPlanCustomizationScreenModel> goalScreens;
    private final String headerDisplay;
    private final String headerImageUrl;
    private final InitialSelection initialSelection;
    private final MetaData metadata;
    private final List<MetricDetail> metricDetails;
    private final MetricScreen metricScreen;
    private final MetricSection metricSection;
    private final String navigationTitle;
    private final String planId;
    private final String startPlanButtonText;
    private final String subtitle;
    private final SmartAlarmOverride unsavedChangesDialog;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HubAndSpokeResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C22458d(26)), null, AbstractC30060g.m92087G(enumC23463i, new C22458d(27)), null, null, null, null};
    }

    public /* synthetic */ HubAndSpokeResponse(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, InitialSelection initialSelection, MetricSection metricSection, BehaviorSection behaviorSection, ActivitiesSection activitiesSection, List list, MetricScreen metricScreen, List list2, String str8, SmartAlarmOverride smartAlarmOverride, SmartAlarmOverride smartAlarmOverride2, MetaData metaData, SerializationConstructorMarker serializationConstructorMarker) {
        if (131071 != (i13 & 131071)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 131071, HubAndSpokeResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.planId = str;
        this.currentPlanTitle = str2;
        this.navigationTitle = str3;
        this.headerDisplay = str4;
        this.headerImageUrl = str5;
        this.subtitle = str6;
        this.startPlanButtonText = str7;
        this.initialSelection = initialSelection;
        this.metricSection = metricSection;
        this.behaviorSection = behaviorSection;
        this.activitiesSection = activitiesSection;
        this.metricDetails = list;
        this.metricScreen = metricScreen;
        this.goalScreens = list2;
        this.endPlanButtonText = str8;
        this.endPlanDialog = smartAlarmOverride;
        this.unsavedChangesDialog = smartAlarmOverride2;
        this.metadata = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) == 0 ? null : metaData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(MetricDetail$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(WeeklyPlanCustomizationScreenModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HubAndSpokeResponse copy$default(HubAndSpokeResponse hubAndSpokeResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, InitialSelection initialSelection, MetricSection metricSection, BehaviorSection behaviorSection, ActivitiesSection activitiesSection, List list, MetricScreen metricScreen, List list2, String str8, SmartAlarmOverride smartAlarmOverride, SmartAlarmOverride smartAlarmOverride2, MetaData metaData, int i13, Object obj) {
        MetaData metaData2;
        SmartAlarmOverride smartAlarmOverride3;
        String str9 = (i13 & 1) != 0 ? hubAndSpokeResponse.planId : str;
        String str10 = (i13 & 2) != 0 ? hubAndSpokeResponse.currentPlanTitle : str2;
        String str11 = (i13 & 4) != 0 ? hubAndSpokeResponse.navigationTitle : str3;
        String str12 = (i13 & 8) != 0 ? hubAndSpokeResponse.headerDisplay : str4;
        String str13 = (i13 & 16) != 0 ? hubAndSpokeResponse.headerImageUrl : str5;
        String str14 = (i13 & 32) != 0 ? hubAndSpokeResponse.subtitle : str6;
        String str15 = (i13 & 64) != 0 ? hubAndSpokeResponse.startPlanButtonText : str7;
        InitialSelection initialSelection2 = (i13 & 128) != 0 ? hubAndSpokeResponse.initialSelection : initialSelection;
        MetricSection metricSection2 = (i13 & 256) != 0 ? hubAndSpokeResponse.metricSection : metricSection;
        BehaviorSection behaviorSection2 = (i13 & 512) != 0 ? hubAndSpokeResponse.behaviorSection : behaviorSection;
        ActivitiesSection activitiesSection2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? hubAndSpokeResponse.activitiesSection : activitiesSection;
        List list3 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? hubAndSpokeResponse.metricDetails : list;
        MetricScreen metricScreen2 = (i13 & 4096) != 0 ? hubAndSpokeResponse.metricScreen : metricScreen;
        List list4 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? hubAndSpokeResponse.goalScreens : list2;
        String str16 = str9;
        String str17 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? hubAndSpokeResponse.endPlanButtonText : str8;
        SmartAlarmOverride smartAlarmOverride4 = (i13 & 32768) != 0 ? hubAndSpokeResponse.endPlanDialog : smartAlarmOverride;
        SmartAlarmOverride smartAlarmOverride5 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? hubAndSpokeResponse.unsavedChangesDialog : smartAlarmOverride2;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            smartAlarmOverride3 = smartAlarmOverride5;
            metaData2 = hubAndSpokeResponse.metadata;
        } else {
            metaData2 = metaData;
            smartAlarmOverride3 = smartAlarmOverride5;
        }
        return hubAndSpokeResponse.copy(str16, str10, str11, str12, str13, str14, str15, initialSelection2, metricSection2, behaviorSection2, activitiesSection2, list3, metricScreen2, list4, str17, smartAlarmOverride4, smartAlarmOverride3, metaData2);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(HubAndSpokeResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.planId);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.currentPlanTitle);
        output.encodeStringElement(serialDesc, 2, self.navigationTitle);
        output.encodeStringElement(serialDesc, 3, self.headerDisplay);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.headerImageUrl);
        output.encodeStringElement(serialDesc, 5, self.subtitle);
        output.encodeStringElement(serialDesc, 6, self.startPlanButtonText);
        output.encodeSerializableElement(serialDesc, 7, InitialSelection$$serializer.INSTANCE, self.initialSelection);
        output.encodeSerializableElement(serialDesc, 8, MetricSection$$serializer.INSTANCE, self.metricSection);
        output.encodeSerializableElement(serialDesc, 9, BehaviorSection$$serializer.INSTANCE, self.behaviorSection);
        output.encodeSerializableElement(serialDesc, 10, ActivitiesSection$$serializer.INSTANCE, self.activitiesSection);
        output.encodeSerializableElement(serialDesc, 11, (InterfaceC37145j) interfaceC23462hArr[11].getValue(), self.metricDetails);
        output.encodeSerializableElement(serialDesc, 12, MetricScreen$$serializer.INSTANCE, self.metricScreen);
        output.encodeSerializableElement(serialDesc, 13, (InterfaceC37145j) interfaceC23462hArr[13].getValue(), self.goalScreens);
        output.encodeNullableSerializableElement(serialDesc, 14, stringSerializer, self.endPlanButtonText);
        SmartAlarmOverride$$serializer smartAlarmOverride$$serializer = SmartAlarmOverride$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 15, smartAlarmOverride$$serializer, self.endPlanDialog);
        output.encodeNullableSerializableElement(serialDesc, 16, smartAlarmOverride$$serializer, self.unsavedChangesDialog);
        if (!output.shouldEncodeElementDefault(serialDesc, 17) && self.metadata == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 17, MetaData$$serializer.INSTANCE, self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BehaviorSection getBehaviorSection() {
        return this.behaviorSection;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final ActivitiesSection getActivitiesSection() {
        return this.activitiesSection;
    }

    public final List<MetricDetail> component12() {
        return this.metricDetails;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final MetricScreen getMetricScreen() {
        return this.metricScreen;
    }

    public final List<WeeklyPlanCustomizationScreenModel> component14() {
        return this.goalScreens;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getEndPlanButtonText() {
        return this.endPlanButtonText;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final SmartAlarmOverride getEndPlanDialog() {
        return this.endPlanDialog;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final SmartAlarmOverride getUnsavedChangesDialog() {
        return this.unsavedChangesDialog;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final MetaData getMetadata() {
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
    public final InitialSelection getInitialSelection() {
        return this.initialSelection;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final MetricSection getMetricSection() {
        return this.metricSection;
    }

    public final HubAndSpokeResponse copy(String planId, String currentPlanTitle, String navigationTitle, String headerDisplay, String headerImageUrl, String subtitle, String startPlanButtonText, InitialSelection initialSelection, MetricSection metricSection, BehaviorSection behaviorSection, ActivitiesSection activitiesSection, List<MetricDetail> metricDetails, MetricScreen metricScreen, List<WeeklyPlanCustomizationScreenModel> goalScreens, String endPlanButtonText, SmartAlarmOverride endPlanDialog, SmartAlarmOverride unsavedChangesDialog, MetaData metadata) {
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
        return new HubAndSpokeResponse(planId, currentPlanTitle, navigationTitle, headerDisplay, headerImageUrl, subtitle, startPlanButtonText, initialSelection, metricSection, behaviorSection, activitiesSection, metricDetails, metricScreen, goalScreens, endPlanButtonText, endPlanDialog, unsavedChangesDialog, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HubAndSpokeResponse)) {
            return false;
        }
        HubAndSpokeResponse hubAndSpokeResponse = (HubAndSpokeResponse) other;
        return AbstractC22676k.m65745e(this.planId, hubAndSpokeResponse.planId) && AbstractC22676k.m65745e(this.currentPlanTitle, hubAndSpokeResponse.currentPlanTitle) && AbstractC22676k.m65745e(this.navigationTitle, hubAndSpokeResponse.navigationTitle) && AbstractC22676k.m65745e(this.headerDisplay, hubAndSpokeResponse.headerDisplay) && AbstractC22676k.m65745e(this.headerImageUrl, hubAndSpokeResponse.headerImageUrl) && AbstractC22676k.m65745e(this.subtitle, hubAndSpokeResponse.subtitle) && AbstractC22676k.m65745e(this.startPlanButtonText, hubAndSpokeResponse.startPlanButtonText) && AbstractC22676k.m65745e(this.initialSelection, hubAndSpokeResponse.initialSelection) && AbstractC22676k.m65745e(this.metricSection, hubAndSpokeResponse.metricSection) && AbstractC22676k.m65745e(this.behaviorSection, hubAndSpokeResponse.behaviorSection) && AbstractC22676k.m65745e(this.activitiesSection, hubAndSpokeResponse.activitiesSection) && AbstractC22676k.m65745e(this.metricDetails, hubAndSpokeResponse.metricDetails) && AbstractC22676k.m65745e(this.metricScreen, hubAndSpokeResponse.metricScreen) && AbstractC22676k.m65745e(this.goalScreens, hubAndSpokeResponse.goalScreens) && AbstractC22676k.m65745e(this.endPlanButtonText, hubAndSpokeResponse.endPlanButtonText) && AbstractC22676k.m65745e(this.endPlanDialog, hubAndSpokeResponse.endPlanDialog) && AbstractC22676k.m65745e(this.unsavedChangesDialog, hubAndSpokeResponse.unsavedChangesDialog) && AbstractC22676k.m65745e(this.metadata, hubAndSpokeResponse.metadata);
    }

    public final ActivitiesSection getActivitiesSection() {
        return this.activitiesSection;
    }

    public final BehaviorSection getBehaviorSection() {
        return this.behaviorSection;
    }

    public final String getCurrentPlanTitle() {
        return this.currentPlanTitle;
    }

    public final String getEndPlanButtonText() {
        return this.endPlanButtonText;
    }

    public final SmartAlarmOverride getEndPlanDialog() {
        return this.endPlanDialog;
    }

    public final List<WeeklyPlanCustomizationScreenModel> getGoalScreens() {
        return this.goalScreens;
    }

    public final String getHeaderDisplay() {
        return this.headerDisplay;
    }

    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    public final InitialSelection getInitialSelection() {
        return this.initialSelection;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final List<MetricDetail> getMetricDetails() {
        return this.metricDetails;
    }

    public final MetricScreen getMetricScreen() {
        return this.metricScreen;
    }

    public final MetricSection getMetricSection() {
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

    public final SmartAlarmOverride getUnsavedChangesDialog() {
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
        SmartAlarmOverride smartAlarmOverride = this.endPlanDialog;
        int iHashCode3 = (iHashCode2 + (smartAlarmOverride == null ? 0 : smartAlarmOverride.hashCode())) * 31;
        SmartAlarmOverride smartAlarmOverride2 = this.unsavedChangesDialog;
        int iHashCode4 = (iHashCode3 + (smartAlarmOverride2 == null ? 0 : smartAlarmOverride2.hashCode())) * 31;
        MetaData metaData = this.metadata;
        return iHashCode4 + (metaData != null ? metaData.hashCode() : 0);
    }

    public String toString() {
        String str = this.planId;
        String str2 = this.currentPlanTitle;
        String str3 = this.navigationTitle;
        String str4 = this.headerDisplay;
        String str5 = this.headerImageUrl;
        String str6 = this.subtitle;
        String str7 = this.startPlanButtonText;
        InitialSelection initialSelection = this.initialSelection;
        MetricSection metricSection = this.metricSection;
        BehaviorSection behaviorSection = this.behaviorSection;
        ActivitiesSection activitiesSection = this.activitiesSection;
        List<MetricDetail> list = this.metricDetails;
        MetricScreen metricScreen = this.metricScreen;
        List<WeeklyPlanCustomizationScreenModel> list2 = this.goalScreens;
        String str8 = this.endPlanButtonText;
        SmartAlarmOverride smartAlarmOverride = this.endPlanDialog;
        SmartAlarmOverride smartAlarmOverride2 = this.unsavedChangesDialog;
        MetaData metaData = this.metadata;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HubAndSpokeResponse(planId=", str, ", currentPlanTitle=", str2, ", navigationTitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", headerDisplay=", str4, ", headerImageUrl=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", subtitle=", str6, ", startPlanButtonText=");
        sbM32001t.append(str7);
        sbM32001t.append(", initialSelection=");
        sbM32001t.append(initialSelection);
        sbM32001t.append(", metricSection=");
        sbM32001t.append(metricSection);
        sbM32001t.append(", behaviorSection=");
        sbM32001t.append(behaviorSection);
        sbM32001t.append(", activitiesSection=");
        sbM32001t.append(activitiesSection);
        sbM32001t.append(", metricDetails=");
        sbM32001t.append(list);
        sbM32001t.append(", metricScreen=");
        sbM32001t.append(metricScreen);
        sbM32001t.append(", goalScreens=");
        sbM32001t.append(list2);
        sbM32001t.append(", endPlanButtonText=");
        sbM32001t.append(str8);
        sbM32001t.append(", endPlanDialog=");
        sbM32001t.append(smartAlarmOverride);
        sbM32001t.append(", unsavedChangesDialog=");
        sbM32001t.append(smartAlarmOverride2);
        sbM32001t.append(", metadata=");
        sbM32001t.append(metaData);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public HubAndSpokeResponse(String planId, String str, String navigationTitle, String headerDisplay, String str2, String subtitle, String startPlanButtonText, InitialSelection initialSelection, MetricSection metricSection, BehaviorSection behaviorSection, ActivitiesSection activitiesSection, List<MetricDetail> metricDetails, MetricScreen metricScreen, List<WeeklyPlanCustomizationScreenModel> goalScreens, String str3, SmartAlarmOverride smartAlarmOverride, SmartAlarmOverride smartAlarmOverride2, MetaData metaData) {
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
        this.endPlanDialog = smartAlarmOverride;
        this.unsavedChangesDialog = smartAlarmOverride2;
        this.metadata = metaData;
    }

    public /* synthetic */ HubAndSpokeResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, InitialSelection initialSelection, MetricSection metricSection, BehaviorSection behaviorSection, ActivitiesSection activitiesSection, List list, MetricScreen metricScreen, List list2, String str8, SmartAlarmOverride smartAlarmOverride, SmartAlarmOverride smartAlarmOverride2, MetaData metaData, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, initialSelection, metricSection, behaviorSection, activitiesSection, list, metricScreen, list2, str8, smartAlarmOverride, smartAlarmOverride2, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : metaData);
    }
}
