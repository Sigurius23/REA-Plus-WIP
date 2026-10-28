package com.whoop.hormonalinsights.settings.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ri2.C31469a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 ^2\u00020\u0001:\u0002_^B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aB£\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b*\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b/\u0010%J\u0012\u00100\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b4\u00105J¬\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b8\u0010!J\u0010\u00109\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b=\u0010>J'\u0010G\u001a\u00020D2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0001¢\u0006\u0004\bE\u0010FR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010H\u001a\u0004\bI\u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010J\u001a\u0004\bK\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010L\u001a\u0004\bM\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010L\u001a\u0004\bN\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010O\u001a\u0004\bP\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010O\u001a\u0004\bQ\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\r\u0010O\u001a\u0004\bR\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010S\u001a\u0004\bT\u0010,R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010U\u001a\u0004\bV\u0010.R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\bW\u0010%R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010X\u001a\u0004\bY\u00101R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010Z\u001a\u0004\b[\u00103R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\\\u001a\u0004\b]\u00105¨\u0006`"}, m65681d2 = {"Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;", "", "", "navigationBarTitle", "", "Lcom/whoop/design/models/DesignSystemModel;", "tiles", "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;", "hormonalInsightsModeDrawer", "contraceptionTypeDrawer", "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;", "disablingDialog", "switchingModeDialog", "switchingContraceptionTypeDialog", "Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;", "pregnancyDueDateDrawer", "Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;", "previousPregnancies", "disableFertilityInsightsSurveyDrawer", "Lcom/whoop/navigation/e;", "enableFertilityInsightsDestination", "Lcom/whoop/design/models/modal/AnyModal;", "enablePregnancyInsightsConfirmation", "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;", "goalsDrawer", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;", "component4", "component5", "()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;", "component6", "component7", "component8", "()Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;", "component9", "()Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;", "component10", "component11", "()Lcom/whoop/navigation/e;", "component12", "()Lcom/whoop/design/models/modal/AnyModal;", "component13", "()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;)Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getNavigationBarTitle", "Ljava/util/List;", "getTiles", "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;", "getHormonalInsightsModeDrawer", "getContraceptionTypeDrawer", "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;", "getDisablingDialog", "getSwitchingModeDialog", "getSwitchingContraceptionTypeDialog", "Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;", "getPregnancyDueDateDrawer", "Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;", "getPreviousPregnancies", "getDisableFertilityInsightsSurveyDrawer", "Lcom/whoop/navigation/e;", "getEnableFertilityInsightsDestination", "Lcom/whoop/design/models/modal/AnyModal;", "getEnablePregnancyInsightsConfirmation", "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;", "getGoalsDrawer", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HormonalInsightsSettingsResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final HormonalInsightsBottomSheet contraceptionTypeDrawer;
    private final HormonalInsightsBottomSheet disableFertilityInsightsSurveyDrawer;
    private final HormonalInsightsConfirmDialog disablingDialog;
    private final C9598e enableFertilityInsightsDestination;
    private final AnyModal enablePregnancyInsightsConfirmation;
    private final HormonalInsightsGoalsDrawer goalsDrawer;
    private final HormonalInsightsBottomSheet hormonalInsightsModeDrawer;
    private final String navigationBarTitle;
    private final DueDateDrawer pregnancyDueDateDrawer;
    private final PreviousPregnanciesModel previousPregnancies;
    private final HormonalInsightsConfirmDialog switchingContraceptionTypeDialog;
    private final HormonalInsightsConfirmDialog switchingModeDialog;
    private final List<DesignSystemModel> tiles;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HormonalInsightsSettingsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C31469a(13)), null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C31469a(14)), AbstractC30060g.m92087G(enumC23463i, new C31469a(15)), null};
    }

    public /* synthetic */ HormonalInsightsSettingsResponse(int i13, String str, List list, HormonalInsightsBottomSheet hormonalInsightsBottomSheet, HormonalInsightsBottomSheet hormonalInsightsBottomSheet2, HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog, HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog2, HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog3, DueDateDrawer dueDateDrawer, PreviousPregnanciesModel previousPregnanciesModel, HormonalInsightsBottomSheet hormonalInsightsBottomSheet3, C9598e c9598e, AnyModal anyModal, HormonalInsightsGoalsDrawer hormonalInsightsGoalsDrawer, SerializationConstructorMarker serializationConstructorMarker) {
        if (8191 != (i13 & 8191)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 8191, HormonalInsightsSettingsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationBarTitle = str;
        this.tiles = list;
        this.hormonalInsightsModeDrawer = hormonalInsightsBottomSheet;
        this.contraceptionTypeDrawer = hormonalInsightsBottomSheet2;
        this.disablingDialog = hormonalInsightsConfirmDialog;
        this.switchingModeDialog = hormonalInsightsConfirmDialog2;
        this.switchingContraceptionTypeDialog = hormonalInsightsConfirmDialog3;
        this.pregnancyDueDateDrawer = dueDateDrawer;
        this.previousPregnancies = previousPregnanciesModel;
        this.disableFertilityInsightsSurveyDrawer = hormonalInsightsBottomSheet3;
        this.enableFertilityInsightsDestination = c9598e;
        this.enablePregnancyInsightsConfirmation = anyModal;
        this.goalsDrawer = hormonalInsightsGoalsDrawer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return AnyModal.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HormonalInsightsSettingsResponse copy$default(HormonalInsightsSettingsResponse hormonalInsightsSettingsResponse, String str, List list, HormonalInsightsBottomSheet hormonalInsightsBottomSheet, HormonalInsightsBottomSheet hormonalInsightsBottomSheet2, HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog, HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog2, HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog3, DueDateDrawer dueDateDrawer, PreviousPregnanciesModel previousPregnanciesModel, HormonalInsightsBottomSheet hormonalInsightsBottomSheet3, C9598e c9598e, AnyModal anyModal, HormonalInsightsGoalsDrawer hormonalInsightsGoalsDrawer, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hormonalInsightsSettingsResponse.navigationBarTitle;
        }
        return hormonalInsightsSettingsResponse.copy(str, (i13 & 2) != 0 ? hormonalInsightsSettingsResponse.tiles : list, (i13 & 4) != 0 ? hormonalInsightsSettingsResponse.hormonalInsightsModeDrawer : hormonalInsightsBottomSheet, (i13 & 8) != 0 ? hormonalInsightsSettingsResponse.contraceptionTypeDrawer : hormonalInsightsBottomSheet2, (i13 & 16) != 0 ? hormonalInsightsSettingsResponse.disablingDialog : hormonalInsightsConfirmDialog, (i13 & 32) != 0 ? hormonalInsightsSettingsResponse.switchingModeDialog : hormonalInsightsConfirmDialog2, (i13 & 64) != 0 ? hormonalInsightsSettingsResponse.switchingContraceptionTypeDialog : hormonalInsightsConfirmDialog3, (i13 & 128) != 0 ? hormonalInsightsSettingsResponse.pregnancyDueDateDrawer : dueDateDrawer, (i13 & 256) != 0 ? hormonalInsightsSettingsResponse.previousPregnancies : previousPregnanciesModel, (i13 & 512) != 0 ? hormonalInsightsSettingsResponse.disableFertilityInsightsSurveyDrawer : hormonalInsightsBottomSheet3, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? hormonalInsightsSettingsResponse.enableFertilityInsightsDestination : c9598e, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? hormonalInsightsSettingsResponse.enablePregnancyInsightsConfirmation : anyModal, (i13 & 4096) != 0 ? hormonalInsightsSettingsResponse.goalsDrawer : hormonalInsightsGoalsDrawer);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(HormonalInsightsSettingsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.navigationBarTitle);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.tiles);
        HormonalInsightsBottomSheet$$serializer hormonalInsightsBottomSheet$$serializer = HormonalInsightsBottomSheet$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 2, hormonalInsightsBottomSheet$$serializer, self.hormonalInsightsModeDrawer);
        output.encodeNullableSerializableElement(serialDesc, 3, hormonalInsightsBottomSheet$$serializer, self.contraceptionTypeDrawer);
        HormonalInsightsConfirmDialog$$serializer hormonalInsightsConfirmDialog$$serializer = HormonalInsightsConfirmDialog$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 4, hormonalInsightsConfirmDialog$$serializer, self.disablingDialog);
        output.encodeNullableSerializableElement(serialDesc, 5, hormonalInsightsConfirmDialog$$serializer, self.switchingModeDialog);
        output.encodeNullableSerializableElement(serialDesc, 6, hormonalInsightsConfirmDialog$$serializer, self.switchingContraceptionTypeDialog);
        output.encodeNullableSerializableElement(serialDesc, 7, DueDateDrawer$$serializer.INSTANCE, self.pregnancyDueDateDrawer);
        output.encodeNullableSerializableElement(serialDesc, 8, PreviousPregnanciesModel$$serializer.INSTANCE, self.previousPregnancies);
        output.encodeNullableSerializableElement(serialDesc, 9, hormonalInsightsBottomSheet$$serializer, self.disableFertilityInsightsSurveyDrawer);
        output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.enableFertilityInsightsDestination);
        output.encodeNullableSerializableElement(serialDesc, 11, (InterfaceC37145j) interfaceC23462hArr[11].getValue(), self.enablePregnancyInsightsConfirmation);
        output.encodeNullableSerializableElement(serialDesc, 12, HormonalInsightsGoalsDrawer$$serializer.INSTANCE, self.goalsDrawer);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNavigationBarTitle() {
        return this.navigationBarTitle;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final HormonalInsightsBottomSheet getDisableFertilityInsightsSurveyDrawer() {
        return this.disableFertilityInsightsSurveyDrawer;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final C9598e getEnableFertilityInsightsDestination() {
        return this.enableFertilityInsightsDestination;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final AnyModal getEnablePregnancyInsightsConfirmation() {
        return this.enablePregnancyInsightsConfirmation;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final HormonalInsightsGoalsDrawer getGoalsDrawer() {
        return this.goalsDrawer;
    }

    public final List<DesignSystemModel> component2() {
        return this.tiles;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HormonalInsightsBottomSheet getHormonalInsightsModeDrawer() {
        return this.hormonalInsightsModeDrawer;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HormonalInsightsBottomSheet getContraceptionTypeDrawer() {
        return this.contraceptionTypeDrawer;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HormonalInsightsConfirmDialog getDisablingDialog() {
        return this.disablingDialog;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HormonalInsightsConfirmDialog getSwitchingModeDialog() {
        return this.switchingModeDialog;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final HormonalInsightsConfirmDialog getSwitchingContraceptionTypeDialog() {
        return this.switchingContraceptionTypeDialog;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DueDateDrawer getPregnancyDueDateDrawer() {
        return this.pregnancyDueDateDrawer;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final PreviousPregnanciesModel getPreviousPregnancies() {
        return this.previousPregnancies;
    }

    public final HormonalInsightsSettingsResponse copy(String navigationBarTitle, List<? extends DesignSystemModel> tiles, HormonalInsightsBottomSheet hormonalInsightsModeDrawer, HormonalInsightsBottomSheet contraceptionTypeDrawer, HormonalInsightsConfirmDialog disablingDialog, HormonalInsightsConfirmDialog switchingModeDialog, HormonalInsightsConfirmDialog switchingContraceptionTypeDialog, DueDateDrawer pregnancyDueDateDrawer, PreviousPregnanciesModel previousPregnancies, HormonalInsightsBottomSheet disableFertilityInsightsSurveyDrawer, C9598e enableFertilityInsightsDestination, AnyModal enablePregnancyInsightsConfirmation, HormonalInsightsGoalsDrawer goalsDrawer) {
        AbstractC22676k.m65750j(navigationBarTitle, "navigationBarTitle");
        AbstractC22676k.m65750j(tiles, "tiles");
        AbstractC22676k.m65750j(hormonalInsightsModeDrawer, "hormonalInsightsModeDrawer");
        return new HormonalInsightsSettingsResponse(navigationBarTitle, tiles, hormonalInsightsModeDrawer, contraceptionTypeDrawer, disablingDialog, switchingModeDialog, switchingContraceptionTypeDialog, pregnancyDueDateDrawer, previousPregnancies, disableFertilityInsightsSurveyDrawer, enableFertilityInsightsDestination, enablePregnancyInsightsConfirmation, goalsDrawer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HormonalInsightsSettingsResponse)) {
            return false;
        }
        HormonalInsightsSettingsResponse hormonalInsightsSettingsResponse = (HormonalInsightsSettingsResponse) other;
        return AbstractC22676k.m65745e(this.navigationBarTitle, hormonalInsightsSettingsResponse.navigationBarTitle) && AbstractC22676k.m65745e(this.tiles, hormonalInsightsSettingsResponse.tiles) && AbstractC22676k.m65745e(this.hormonalInsightsModeDrawer, hormonalInsightsSettingsResponse.hormonalInsightsModeDrawer) && AbstractC22676k.m65745e(this.contraceptionTypeDrawer, hormonalInsightsSettingsResponse.contraceptionTypeDrawer) && AbstractC22676k.m65745e(this.disablingDialog, hormonalInsightsSettingsResponse.disablingDialog) && AbstractC22676k.m65745e(this.switchingModeDialog, hormonalInsightsSettingsResponse.switchingModeDialog) && AbstractC22676k.m65745e(this.switchingContraceptionTypeDialog, hormonalInsightsSettingsResponse.switchingContraceptionTypeDialog) && AbstractC22676k.m65745e(this.pregnancyDueDateDrawer, hormonalInsightsSettingsResponse.pregnancyDueDateDrawer) && AbstractC22676k.m65745e(this.previousPregnancies, hormonalInsightsSettingsResponse.previousPregnancies) && AbstractC22676k.m65745e(this.disableFertilityInsightsSurveyDrawer, hormonalInsightsSettingsResponse.disableFertilityInsightsSurveyDrawer) && AbstractC22676k.m65745e(this.enableFertilityInsightsDestination, hormonalInsightsSettingsResponse.enableFertilityInsightsDestination) && AbstractC22676k.m65745e(this.enablePregnancyInsightsConfirmation, hormonalInsightsSettingsResponse.enablePregnancyInsightsConfirmation) && AbstractC22676k.m65745e(this.goalsDrawer, hormonalInsightsSettingsResponse.goalsDrawer);
    }

    public final HormonalInsightsBottomSheet getContraceptionTypeDrawer() {
        return this.contraceptionTypeDrawer;
    }

    public final HormonalInsightsBottomSheet getDisableFertilityInsightsSurveyDrawer() {
        return this.disableFertilityInsightsSurveyDrawer;
    }

    public final HormonalInsightsConfirmDialog getDisablingDialog() {
        return this.disablingDialog;
    }

    public final C9598e getEnableFertilityInsightsDestination() {
        return this.enableFertilityInsightsDestination;
    }

    public final AnyModal getEnablePregnancyInsightsConfirmation() {
        return this.enablePregnancyInsightsConfirmation;
    }

    public final HormonalInsightsGoalsDrawer getGoalsDrawer() {
        return this.goalsDrawer;
    }

    public final HormonalInsightsBottomSheet getHormonalInsightsModeDrawer() {
        return this.hormonalInsightsModeDrawer;
    }

    public final String getNavigationBarTitle() {
        return this.navigationBarTitle;
    }

    public final DueDateDrawer getPregnancyDueDateDrawer() {
        return this.pregnancyDueDateDrawer;
    }

    public final PreviousPregnanciesModel getPreviousPregnancies() {
        return this.previousPregnancies;
    }

    public final HormonalInsightsConfirmDialog getSwitchingContraceptionTypeDialog() {
        return this.switchingContraceptionTypeDialog;
    }

    public final HormonalInsightsConfirmDialog getSwitchingModeDialog() {
        return this.switchingModeDialog;
    }

    public final List<DesignSystemModel> getTiles() {
        return this.tiles;
    }

    public int hashCode() {
        int iHashCode = (this.hormonalInsightsModeDrawer.hashCode() + AbstractC11895b.m31983b(this.navigationBarTitle.hashCode() * 31, 31, this.tiles)) * 31;
        HormonalInsightsBottomSheet hormonalInsightsBottomSheet = this.contraceptionTypeDrawer;
        int iHashCode2 = (iHashCode + (hormonalInsightsBottomSheet == null ? 0 : hormonalInsightsBottomSheet.hashCode())) * 31;
        HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog = this.disablingDialog;
        int iHashCode3 = (iHashCode2 + (hormonalInsightsConfirmDialog == null ? 0 : hormonalInsightsConfirmDialog.hashCode())) * 31;
        HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog2 = this.switchingModeDialog;
        int iHashCode4 = (iHashCode3 + (hormonalInsightsConfirmDialog2 == null ? 0 : hormonalInsightsConfirmDialog2.hashCode())) * 31;
        HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog3 = this.switchingContraceptionTypeDialog;
        int iHashCode5 = (iHashCode4 + (hormonalInsightsConfirmDialog3 == null ? 0 : hormonalInsightsConfirmDialog3.hashCode())) * 31;
        DueDateDrawer dueDateDrawer = this.pregnancyDueDateDrawer;
        int iHashCode6 = (iHashCode5 + (dueDateDrawer == null ? 0 : dueDateDrawer.hashCode())) * 31;
        PreviousPregnanciesModel previousPregnanciesModel = this.previousPregnancies;
        int iHashCode7 = (iHashCode6 + (previousPregnanciesModel == null ? 0 : previousPregnanciesModel.hashCode())) * 31;
        HormonalInsightsBottomSheet hormonalInsightsBottomSheet2 = this.disableFertilityInsightsSurveyDrawer;
        int iHashCode8 = (iHashCode7 + (hormonalInsightsBottomSheet2 == null ? 0 : hormonalInsightsBottomSheet2.hashCode())) * 31;
        C9598e c9598e = this.enableFertilityInsightsDestination;
        int iHashCode9 = (iHashCode8 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        AnyModal anyModal = this.enablePregnancyInsightsConfirmation;
        int iHashCode10 = (iHashCode9 + (anyModal == null ? 0 : anyModal.hashCode())) * 31;
        HormonalInsightsGoalsDrawer hormonalInsightsGoalsDrawer = this.goalsDrawer;
        return iHashCode10 + (hormonalInsightsGoalsDrawer != null ? hormonalInsightsGoalsDrawer.hashCode() : 0);
    }

    public String toString() {
        String str = this.navigationBarTitle;
        List<DesignSystemModel> list = this.tiles;
        HormonalInsightsBottomSheet hormonalInsightsBottomSheet = this.hormonalInsightsModeDrawer;
        HormonalInsightsBottomSheet hormonalInsightsBottomSheet2 = this.contraceptionTypeDrawer;
        HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog = this.disablingDialog;
        HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog2 = this.switchingModeDialog;
        HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog3 = this.switchingContraceptionTypeDialog;
        DueDateDrawer dueDateDrawer = this.pregnancyDueDateDrawer;
        PreviousPregnanciesModel previousPregnanciesModel = this.previousPregnancies;
        HormonalInsightsBottomSheet hormonalInsightsBottomSheet3 = this.disableFertilityInsightsSurveyDrawer;
        C9598e c9598e = this.enableFertilityInsightsDestination;
        AnyModal anyModal = this.enablePregnancyInsightsConfirmation;
        HormonalInsightsGoalsDrawer hormonalInsightsGoalsDrawer = this.goalsDrawer;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("HormonalInsightsSettingsResponse(navigationBarTitle=", str, ", tiles=", ", hormonalInsightsModeDrawer=", list);
        sbM94766o.append(hormonalInsightsBottomSheet);
        sbM94766o.append(", contraceptionTypeDrawer=");
        sbM94766o.append(hormonalInsightsBottomSheet2);
        sbM94766o.append(", disablingDialog=");
        sbM94766o.append(hormonalInsightsConfirmDialog);
        sbM94766o.append(", switchingModeDialog=");
        sbM94766o.append(hormonalInsightsConfirmDialog2);
        sbM94766o.append(", switchingContraceptionTypeDialog=");
        sbM94766o.append(hormonalInsightsConfirmDialog3);
        sbM94766o.append(", pregnancyDueDateDrawer=");
        sbM94766o.append(dueDateDrawer);
        sbM94766o.append(", previousPregnancies=");
        sbM94766o.append(previousPregnanciesModel);
        sbM94766o.append(", disableFertilityInsightsSurveyDrawer=");
        sbM94766o.append(hormonalInsightsBottomSheet3);
        sbM94766o.append(", enableFertilityInsightsDestination=");
        sbM94766o.append(c9598e);
        sbM94766o.append(", enablePregnancyInsightsConfirmation=");
        sbM94766o.append(anyModal);
        sbM94766o.append(", goalsDrawer=");
        sbM94766o.append(hormonalInsightsGoalsDrawer);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HormonalInsightsSettingsResponse(String navigationBarTitle, List<? extends DesignSystemModel> tiles, HormonalInsightsBottomSheet hormonalInsightsModeDrawer, HormonalInsightsBottomSheet hormonalInsightsBottomSheet, HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog, HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog2, HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog3, DueDateDrawer dueDateDrawer, PreviousPregnanciesModel previousPregnanciesModel, HormonalInsightsBottomSheet hormonalInsightsBottomSheet2, C9598e c9598e, AnyModal anyModal, HormonalInsightsGoalsDrawer hormonalInsightsGoalsDrawer) {
        AbstractC22676k.m65750j(navigationBarTitle, "navigationBarTitle");
        AbstractC22676k.m65750j(tiles, "tiles");
        AbstractC22676k.m65750j(hormonalInsightsModeDrawer, "hormonalInsightsModeDrawer");
        this.navigationBarTitle = navigationBarTitle;
        this.tiles = tiles;
        this.hormonalInsightsModeDrawer = hormonalInsightsModeDrawer;
        this.contraceptionTypeDrawer = hormonalInsightsBottomSheet;
        this.disablingDialog = hormonalInsightsConfirmDialog;
        this.switchingModeDialog = hormonalInsightsConfirmDialog2;
        this.switchingContraceptionTypeDialog = hormonalInsightsConfirmDialog3;
        this.pregnancyDueDateDrawer = dueDateDrawer;
        this.previousPregnancies = previousPregnanciesModel;
        this.disableFertilityInsightsSurveyDrawer = hormonalInsightsBottomSheet2;
        this.enableFertilityInsightsDestination = c9598e;
        this.enablePregnancyInsightsConfirmation = anyModal;
        this.goalsDrawer = hormonalInsightsGoalsDrawer;
    }
}
