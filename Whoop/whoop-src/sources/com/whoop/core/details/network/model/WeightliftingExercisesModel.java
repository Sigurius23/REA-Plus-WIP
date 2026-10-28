package com.whoop.core.details.network.model;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fBu\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b(\u0010#J\u0010\u0010)\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b)\u0010#Jp\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b,\u0010#J\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010#R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b9\u0010#R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b:\u0010#R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b;\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b<\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b=\u0010#R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b>\u0010#¨\u0006A"}, m65681d2 = {"Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;", "", "Lcom/whoop/core/details/network/model/ExerciseSummaryModel;", "exerciseSummary", "Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;", "exerciseSummaryCarousel", "", "repsTitleDisplay", "titleDisplay", "tonnageTitleDisplay", "tonnageUnitsDisplay", "intensityUnitsDisplay", "intensityTitleDisplay", "viewAllLabelDisplay", "<init>", "(Lcom/whoop/core/details/network/model/ExerciseSummaryModel;Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/core/details/network/model/ExerciseSummaryModel;Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/core/details/network/model/ExerciseSummaryModel;", "component2", "()Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/whoop/core/details/network/model/ExerciseSummaryModel;Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/core/details/network/model/ExerciseSummaryModel;", "getExerciseSummary", "Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;", "getExerciseSummaryCarousel", "Ljava/lang/String;", "getRepsTitleDisplay", "getTitleDisplay", "getTonnageTitleDisplay", "getTonnageUnitsDisplay", "getIntensityUnitsDisplay", "getIntensityTitleDisplay", "getViewAllLabelDisplay", "Companion", "$serializer", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WeightliftingExercisesModel {
    private final ExerciseSummaryModel exerciseSummary;
    private final ExerciseSummaryCarouselModel exerciseSummaryCarousel;
    private final String intensityTitleDisplay;
    private final String intensityUnitsDisplay;
    private final String repsTitleDisplay;
    private final String titleDisplay;
    private final String tonnageTitleDisplay;
    private final String tonnageUnitsDisplay;
    private final String viewAllLabelDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/WeightliftingExercisesModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WeightliftingExercisesModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WeightliftingExercisesModel(int i13, ExerciseSummaryModel exerciseSummaryModel, ExerciseSummaryCarouselModel exerciseSummaryCarouselModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, WeightliftingExercisesModel$$serializer.INSTANCE.getDescriptor());
        }
        this.exerciseSummary = exerciseSummaryModel;
        this.exerciseSummaryCarousel = exerciseSummaryCarouselModel;
        this.repsTitleDisplay = str;
        this.titleDisplay = str2;
        this.tonnageTitleDisplay = str3;
        this.tonnageUnitsDisplay = str4;
        this.intensityUnitsDisplay = str5;
        this.intensityTitleDisplay = str6;
        this.viewAllLabelDisplay = str7;
    }

    public static /* synthetic */ WeightliftingExercisesModel copy$default(WeightliftingExercisesModel weightliftingExercisesModel, ExerciseSummaryModel exerciseSummaryModel, ExerciseSummaryCarouselModel exerciseSummaryCarouselModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            exerciseSummaryModel = weightliftingExercisesModel.exerciseSummary;
        }
        if ((i13 & 2) != 0) {
            exerciseSummaryCarouselModel = weightliftingExercisesModel.exerciseSummaryCarousel;
        }
        if ((i13 & 4) != 0) {
            str = weightliftingExercisesModel.repsTitleDisplay;
        }
        if ((i13 & 8) != 0) {
            str2 = weightliftingExercisesModel.titleDisplay;
        }
        if ((i13 & 16) != 0) {
            str3 = weightliftingExercisesModel.tonnageTitleDisplay;
        }
        if ((i13 & 32) != 0) {
            str4 = weightliftingExercisesModel.tonnageUnitsDisplay;
        }
        if ((i13 & 64) != 0) {
            str5 = weightliftingExercisesModel.intensityUnitsDisplay;
        }
        if ((i13 & 128) != 0) {
            str6 = weightliftingExercisesModel.intensityTitleDisplay;
        }
        if ((i13 & 256) != 0) {
            str7 = weightliftingExercisesModel.viewAllLabelDisplay;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        String str12 = str3;
        String str13 = str;
        return weightliftingExercisesModel.copy(exerciseSummaryModel, exerciseSummaryCarouselModel, str13, str2, str12, str10, str11, str8, str9);
    }

    public static final /* synthetic */ void write$Self$core_details_release(WeightliftingExercisesModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, ExerciseSummaryModel$$serializer.INSTANCE, self.exerciseSummary);
        output.encodeSerializableElement(serialDesc, 1, ExerciseSummaryCarouselModel$$serializer.INSTANCE, self.exerciseSummaryCarousel);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.repsTitleDisplay);
        output.encodeStringElement(serialDesc, 3, self.titleDisplay);
        output.encodeStringElement(serialDesc, 4, self.tonnageTitleDisplay);
        output.encodeStringElement(serialDesc, 5, self.tonnageUnitsDisplay);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.intensityUnitsDisplay);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.intensityTitleDisplay);
        output.encodeStringElement(serialDesc, 8, self.viewAllLabelDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ExerciseSummaryModel getExerciseSummary() {
        return this.exerciseSummary;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ExerciseSummaryCarouselModel getExerciseSummaryCarousel() {
        return this.exerciseSummaryCarousel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRepsTitleDisplay() {
        return this.repsTitleDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTonnageTitleDisplay() {
        return this.tonnageTitleDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTonnageUnitsDisplay() {
        return this.tonnageUnitsDisplay;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIntensityUnitsDisplay() {
        return this.intensityUnitsDisplay;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIntensityTitleDisplay() {
        return this.intensityTitleDisplay;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getViewAllLabelDisplay() {
        return this.viewAllLabelDisplay;
    }

    public final WeightliftingExercisesModel copy(ExerciseSummaryModel exerciseSummary, ExerciseSummaryCarouselModel exerciseSummaryCarousel, String repsTitleDisplay, String titleDisplay, String tonnageTitleDisplay, String tonnageUnitsDisplay, String intensityUnitsDisplay, String intensityTitleDisplay, String viewAllLabelDisplay) {
        AbstractC22676k.m65750j(exerciseSummary, "exerciseSummary");
        AbstractC22676k.m65750j(exerciseSummaryCarousel, "exerciseSummaryCarousel");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(tonnageTitleDisplay, "tonnageTitleDisplay");
        AbstractC22676k.m65750j(tonnageUnitsDisplay, "tonnageUnitsDisplay");
        AbstractC22676k.m65750j(viewAllLabelDisplay, "viewAllLabelDisplay");
        return new WeightliftingExercisesModel(exerciseSummary, exerciseSummaryCarousel, repsTitleDisplay, titleDisplay, tonnageTitleDisplay, tonnageUnitsDisplay, intensityUnitsDisplay, intensityTitleDisplay, viewAllLabelDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeightliftingExercisesModel)) {
            return false;
        }
        WeightliftingExercisesModel weightliftingExercisesModel = (WeightliftingExercisesModel) other;
        return AbstractC22676k.m65745e(this.exerciseSummary, weightliftingExercisesModel.exerciseSummary) && AbstractC22676k.m65745e(this.exerciseSummaryCarousel, weightliftingExercisesModel.exerciseSummaryCarousel) && AbstractC22676k.m65745e(this.repsTitleDisplay, weightliftingExercisesModel.repsTitleDisplay) && AbstractC22676k.m65745e(this.titleDisplay, weightliftingExercisesModel.titleDisplay) && AbstractC22676k.m65745e(this.tonnageTitleDisplay, weightliftingExercisesModel.tonnageTitleDisplay) && AbstractC22676k.m65745e(this.tonnageUnitsDisplay, weightliftingExercisesModel.tonnageUnitsDisplay) && AbstractC22676k.m65745e(this.intensityUnitsDisplay, weightliftingExercisesModel.intensityUnitsDisplay) && AbstractC22676k.m65745e(this.intensityTitleDisplay, weightliftingExercisesModel.intensityTitleDisplay) && AbstractC22676k.m65745e(this.viewAllLabelDisplay, weightliftingExercisesModel.viewAllLabelDisplay);
    }

    public final ExerciseSummaryModel getExerciseSummary() {
        return this.exerciseSummary;
    }

    public final ExerciseSummaryCarouselModel getExerciseSummaryCarousel() {
        return this.exerciseSummaryCarousel;
    }

    public final String getIntensityTitleDisplay() {
        return this.intensityTitleDisplay;
    }

    public final String getIntensityUnitsDisplay() {
        return this.intensityUnitsDisplay;
    }

    public final String getRepsTitleDisplay() {
        return this.repsTitleDisplay;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public final String getTonnageTitleDisplay() {
        return this.tonnageTitleDisplay;
    }

    public final String getTonnageUnitsDisplay() {
        return this.tonnageUnitsDisplay;
    }

    public final String getViewAllLabelDisplay() {
        return this.viewAllLabelDisplay;
    }

    public int hashCode() {
        int iHashCode = (this.exerciseSummaryCarousel.hashCode() + (this.exerciseSummary.hashCode() * 31)) * 31;
        String str = this.repsTitleDisplay;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.titleDisplay), 31, this.tonnageTitleDisplay), 31, this.tonnageUnitsDisplay);
        String str2 = this.intensityUnitsDisplay;
        int iHashCode2 = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.intensityTitleDisplay;
        return this.viewAllLabelDisplay.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        ExerciseSummaryModel exerciseSummaryModel = this.exerciseSummary;
        ExerciseSummaryCarouselModel exerciseSummaryCarouselModel = this.exerciseSummaryCarousel;
        String str = this.repsTitleDisplay;
        String str2 = this.titleDisplay;
        String str3 = this.tonnageTitleDisplay;
        String str4 = this.tonnageUnitsDisplay;
        String str5 = this.intensityUnitsDisplay;
        String str6 = this.intensityTitleDisplay;
        String str7 = this.viewAllLabelDisplay;
        StringBuilder sb4 = new StringBuilder("WeightliftingExercisesModel(exerciseSummary=");
        sb4.append(exerciseSummaryModel);
        sb4.append(", exerciseSummaryCarousel=");
        sb4.append(exerciseSummaryCarouselModel);
        sb4.append(", repsTitleDisplay=");
        AbstractC11266d.m30444B(sb4, str, ", titleDisplay=", str2, ", tonnageTitleDisplay=");
        AbstractC11266d.m30444B(sb4, str3, ", tonnageUnitsDisplay=", str4, ", intensityUnitsDisplay=");
        AbstractC11266d.m30444B(sb4, str5, ", intensityTitleDisplay=", str6, ", viewAllLabelDisplay=");
        return AbstractC25012a.m73376i(str7, ")", sb4);
    }

    public WeightliftingExercisesModel(ExerciseSummaryModel exerciseSummary, ExerciseSummaryCarouselModel exerciseSummaryCarousel, String str, String titleDisplay, String tonnageTitleDisplay, String tonnageUnitsDisplay, String str2, String str3, String viewAllLabelDisplay) {
        AbstractC22676k.m65750j(exerciseSummary, "exerciseSummary");
        AbstractC22676k.m65750j(exerciseSummaryCarousel, "exerciseSummaryCarousel");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(tonnageTitleDisplay, "tonnageTitleDisplay");
        AbstractC22676k.m65750j(tonnageUnitsDisplay, "tonnageUnitsDisplay");
        AbstractC22676k.m65750j(viewAllLabelDisplay, "viewAllLabelDisplay");
        this.exerciseSummary = exerciseSummary;
        this.exerciseSummaryCarousel = exerciseSummaryCarousel;
        this.repsTitleDisplay = str;
        this.titleDisplay = titleDisplay;
        this.tonnageTitleDisplay = tonnageTitleDisplay;
        this.tonnageUnitsDisplay = tonnageUnitsDisplay;
        this.intensityUnitsDisplay = str2;
        this.intensityTitleDisplay = str3;
        this.viewAllLabelDisplay = viewAllLabelDisplay;
    }
}
