package com.whoop.weeklyplan.weeklyplan.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.DateSelectorModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ut2.C35231a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002TSBw\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u008b\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0090\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b1\u0010\"J\u0010\u00102\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107J'\u0010@\u001a\u00020=2\u0006\u00108\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0001¢\u0006\u0004\b>\u0010?R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bD\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bF\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bG\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010H\u001a\u0004\bI\u0010%R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010J\u001a\u0004\bK\u0010'R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010J\u001a\u0004\bL\u0010'R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010M\u001a\u0004\bN\u0010*R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010O\u001a\u0004\bP\u0010,R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010Q\u001a\u0004\bR\u0010.¨\u0006U"}, m65681d2 = {"Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;", "", "Lcom/whoop/design/models/items/DateSelectorModel;", "datePicker", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;", "titleDisplay", "", "subtitleDisplay", "descriptionDisplay", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;", "currentPlanTile", "", "Lcom/whoop/design/models/DesignSystemModel;", "headerItems", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;", "goalSection", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;", "bannerTile", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;", "progressBar", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;", "gradientStyle", "<init>", "(Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;Ljava/util/List;Ljava/util/List;Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;Ljava/util/List;Ljava/util/List;Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/models/items/DateSelectorModel;", "component2", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;", "component6", "()Ljava/util/List;", "component7", "component8", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;", "component9", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;", "component10", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;", "copy", "(Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;Ljava/util/List;Ljava/util/List;Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/models/items/DateSelectorModel;", "getDatePicker", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;", "getTitleDisplay", "Ljava/lang/String;", "getSubtitleDisplay", "getDescriptionDisplay", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;", "getCurrentPlanTile", "Ljava/util/List;", "getHeaderItems", "getGoalSection", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;", "getBannerTile", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;", "getProgressBar", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;", "getGradientStyle", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WeeklyPlanModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final BannerCalloutTile bannerTile;
    private final CurrentPlanTile currentPlanTile;
    private final DateSelectorModel datePicker;
    private final String descriptionDisplay;
    private final List<GoalSection> goalSection;
    private final GradientStyle gradientStyle;
    private final List<DesignSystemModel> headerItems;
    private final ProgressBarModel progressBar;
    private final String subtitleDisplay;
    private final StyledString titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WeeklyPlanModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C35231a(5)), AbstractC30060g.m92087G(enumC23463i, new C35231a(6)), null, null, AbstractC30060g.m92087G(enumC23463i, new C35231a(7))};
    }

    public /* synthetic */ WeeklyPlanModel(int i13, DateSelectorModel dateSelectorModel, StyledString styledString, String str, String str2, CurrentPlanTile currentPlanTile, List list, List list2, BannerCalloutTile bannerCalloutTile, ProgressBarModel progressBarModel, GradientStyle gradientStyle, SerializationConstructorMarker serializationConstructorMarker) {
        if (479 != (i13 & 479)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 479, WeeklyPlanModel$$serializer.INSTANCE.getDescriptor());
        }
        this.datePicker = dateSelectorModel;
        this.titleDisplay = styledString;
        this.subtitleDisplay = str;
        this.descriptionDisplay = str2;
        this.currentPlanTile = currentPlanTile;
        if ((i13 & 32) == 0) {
            this.headerItems = null;
        } else {
            this.headerItems = list;
        }
        this.goalSection = list2;
        this.bannerTile = bannerCalloutTile;
        this.progressBar = progressBarModel;
        if ((i13 & 512) == 0) {
            this.gradientStyle = null;
        } else {
            this.gradientStyle = gradientStyle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(GoalSection$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return GradientStyle.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WeeklyPlanModel copy$default(WeeklyPlanModel weeklyPlanModel, DateSelectorModel dateSelectorModel, StyledString styledString, String str, String str2, CurrentPlanTile currentPlanTile, List list, List list2, BannerCalloutTile bannerCalloutTile, ProgressBarModel progressBarModel, GradientStyle gradientStyle, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            dateSelectorModel = weeklyPlanModel.datePicker;
        }
        if ((i13 & 2) != 0) {
            styledString = weeklyPlanModel.titleDisplay;
        }
        if ((i13 & 4) != 0) {
            str = weeklyPlanModel.subtitleDisplay;
        }
        if ((i13 & 8) != 0) {
            str2 = weeklyPlanModel.descriptionDisplay;
        }
        if ((i13 & 16) != 0) {
            currentPlanTile = weeklyPlanModel.currentPlanTile;
        }
        if ((i13 & 32) != 0) {
            list = weeklyPlanModel.headerItems;
        }
        if ((i13 & 64) != 0) {
            list2 = weeklyPlanModel.goalSection;
        }
        if ((i13 & 128) != 0) {
            bannerCalloutTile = weeklyPlanModel.bannerTile;
        }
        if ((i13 & 256) != 0) {
            progressBarModel = weeklyPlanModel.progressBar;
        }
        if ((i13 & 512) != 0) {
            gradientStyle = weeklyPlanModel.gradientStyle;
        }
        ProgressBarModel progressBarModel2 = progressBarModel;
        GradientStyle gradientStyle2 = gradientStyle;
        List list3 = list2;
        BannerCalloutTile bannerCalloutTile2 = bannerCalloutTile;
        CurrentPlanTile currentPlanTile2 = currentPlanTile;
        List list4 = list;
        return weeklyPlanModel.copy(dateSelectorModel, styledString, str, str2, currentPlanTile2, list4, list3, bannerCalloutTile2, progressBarModel2, gradientStyle2);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(WeeklyPlanModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, DateSelectorModel$$serializer.INSTANCE, self.datePicker);
        output.encodeSerializableElement(serialDesc, 1, StyledString$$serializer.INSTANCE, self.titleDisplay);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.subtitleDisplay);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.descriptionDisplay);
        output.encodeNullableSerializableElement(serialDesc, 4, CurrentPlanTile$$serializer.INSTANCE, self.currentPlanTile);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.headerItems != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.headerItems);
        }
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.goalSection);
        output.encodeNullableSerializableElement(serialDesc, 7, BannerCalloutTile$$serializer.INSTANCE, self.bannerTile);
        output.encodeNullableSerializableElement(serialDesc, 8, ProgressBarModel$$serializer.INSTANCE, self.progressBar);
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.gradientStyle == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.gradientStyle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DateSelectorModel getDatePicker() {
        return this.datePicker;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final GradientStyle getGradientStyle() {
        return this.gradientStyle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StyledString getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CurrentPlanTile getCurrentPlanTile() {
        return this.currentPlanTile;
    }

    public final List<DesignSystemModel> component6() {
        return this.headerItems;
    }

    public final List<GoalSection> component7() {
        return this.goalSection;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BannerCalloutTile getBannerTile() {
        return this.bannerTile;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ProgressBarModel getProgressBar() {
        return this.progressBar;
    }

    public final WeeklyPlanModel copy(DateSelectorModel datePicker, StyledString titleDisplay, String subtitleDisplay, String descriptionDisplay, CurrentPlanTile currentPlanTile, List<? extends DesignSystemModel> headerItems, List<GoalSection> goalSection, BannerCalloutTile bannerTile, ProgressBarModel progressBar, GradientStyle gradientStyle) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(goalSection, "goalSection");
        return new WeeklyPlanModel(datePicker, titleDisplay, subtitleDisplay, descriptionDisplay, currentPlanTile, headerItems, goalSection, bannerTile, progressBar, gradientStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyPlanModel)) {
            return false;
        }
        WeeklyPlanModel weeklyPlanModel = (WeeklyPlanModel) other;
        return AbstractC22676k.m65745e(this.datePicker, weeklyPlanModel.datePicker) && AbstractC22676k.m65745e(this.titleDisplay, weeklyPlanModel.titleDisplay) && AbstractC22676k.m65745e(this.subtitleDisplay, weeklyPlanModel.subtitleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, weeklyPlanModel.descriptionDisplay) && AbstractC22676k.m65745e(this.currentPlanTile, weeklyPlanModel.currentPlanTile) && AbstractC22676k.m65745e(this.headerItems, weeklyPlanModel.headerItems) && AbstractC22676k.m65745e(this.goalSection, weeklyPlanModel.goalSection) && AbstractC22676k.m65745e(this.bannerTile, weeklyPlanModel.bannerTile) && AbstractC22676k.m65745e(this.progressBar, weeklyPlanModel.progressBar) && this.gradientStyle == weeklyPlanModel.gradientStyle;
    }

    public final BannerCalloutTile getBannerTile() {
        return this.bannerTile;
    }

    public final CurrentPlanTile getCurrentPlanTile() {
        return this.currentPlanTile;
    }

    public final DateSelectorModel getDatePicker() {
        return this.datePicker;
    }

    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final List<GoalSection> getGoalSection() {
        return this.goalSection;
    }

    public final GradientStyle getGradientStyle() {
        return this.gradientStyle;
    }

    public final List<DesignSystemModel> getHeaderItems() {
        return this.headerItems;
    }

    public final ProgressBarModel getProgressBar() {
        return this.progressBar;
    }

    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    public final StyledString getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        DateSelectorModel dateSelectorModel = this.datePicker;
        int iHashCode = (this.titleDisplay.hashCode() + ((dateSelectorModel == null ? 0 : dateSelectorModel.hashCode()) * 31)) * 31;
        String str = this.subtitleDisplay;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.descriptionDisplay;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CurrentPlanTile currentPlanTile = this.currentPlanTile;
        int iHashCode4 = (iHashCode3 + (currentPlanTile == null ? 0 : currentPlanTile.hashCode())) * 31;
        List<DesignSystemModel> list = this.headerItems;
        int iM31983b = AbstractC11895b.m31983b((iHashCode4 + (list == null ? 0 : list.hashCode())) * 31, 31, this.goalSection);
        BannerCalloutTile bannerCalloutTile = this.bannerTile;
        int iHashCode5 = (iM31983b + (bannerCalloutTile == null ? 0 : bannerCalloutTile.hashCode())) * 31;
        ProgressBarModel progressBarModel = this.progressBar;
        int iHashCode6 = (iHashCode5 + (progressBarModel == null ? 0 : progressBarModel.hashCode())) * 31;
        GradientStyle gradientStyle = this.gradientStyle;
        return iHashCode6 + (gradientStyle != null ? gradientStyle.hashCode() : 0);
    }

    public String toString() {
        DateSelectorModel dateSelectorModel = this.datePicker;
        StyledString styledString = this.titleDisplay;
        String str = this.subtitleDisplay;
        String str2 = this.descriptionDisplay;
        CurrentPlanTile currentPlanTile = this.currentPlanTile;
        List<DesignSystemModel> list = this.headerItems;
        List<GoalSection> list2 = this.goalSection;
        BannerCalloutTile bannerCalloutTile = this.bannerTile;
        ProgressBarModel progressBarModel = this.progressBar;
        GradientStyle gradientStyle = this.gradientStyle;
        StringBuilder sb4 = new StringBuilder("WeeklyPlanModel(datePicker=");
        sb4.append(dateSelectorModel);
        sb4.append(", titleDisplay=");
        sb4.append(styledString);
        sb4.append(", subtitleDisplay=");
        AbstractC11266d.m30444B(sb4, str, ", descriptionDisplay=", str2, ", currentPlanTile=");
        sb4.append(currentPlanTile);
        sb4.append(", headerItems=");
        sb4.append(list);
        sb4.append(", goalSection=");
        sb4.append(list2);
        sb4.append(", bannerTile=");
        sb4.append(bannerCalloutTile);
        sb4.append(", progressBar=");
        sb4.append(progressBarModel);
        sb4.append(", gradientStyle=");
        sb4.append(gradientStyle);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WeeklyPlanModel(DateSelectorModel dateSelectorModel, StyledString titleDisplay, String str, String str2, CurrentPlanTile currentPlanTile, List<? extends DesignSystemModel> list, List<GoalSection> goalSection, BannerCalloutTile bannerCalloutTile, ProgressBarModel progressBarModel, GradientStyle gradientStyle) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(goalSection, "goalSection");
        this.datePicker = dateSelectorModel;
        this.titleDisplay = titleDisplay;
        this.subtitleDisplay = str;
        this.descriptionDisplay = str2;
        this.currentPlanTile = currentPlanTile;
        this.headerItems = list;
        this.goalSection = goalSection;
        this.bannerTile = bannerCalloutTile;
        this.progressBar = progressBarModel;
        this.gradientStyle = gradientStyle;
    }

    public /* synthetic */ WeeklyPlanModel(DateSelectorModel dateSelectorModel, StyledString styledString, String str, String str2, CurrentPlanTile currentPlanTile, List list, List list2, BannerCalloutTile bannerCalloutTile, ProgressBarModel progressBarModel, GradientStyle gradientStyle, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(dateSelectorModel, styledString, str, str2, currentPlanTile, (i13 & 32) != 0 ? null : list, list2, bannerCalloutTile, progressBarModel, (i13 & 512) != 0 ? null : gradientStyle);
    }
}
