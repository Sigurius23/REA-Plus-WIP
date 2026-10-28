package com.whoop.core.details.network.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFBu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u0099\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0092\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u0010\u0010)\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b;\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b<\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b=\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b>\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b?\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b@\u0010\u0019R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\bA\u0010\u0019R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\bB\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\bC\u0010\u0019R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\bD\u0010\u0019R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\bE\u0010\u0019¨\u0006H"}, m65681d2 = {"Lcom/whoop/core/details/network/model/ExerciseSummaryModel;", "", "", "avgHrTitleDisplay", "", "Lcom/whoop/core/details/network/model/ExerciseCardGroupModel;", "exerciseCardGroups", "hrUnitsDisplay", "mskIntensityPercentTitleDisplay", "mskIntensityPercentValueDisplay", "oneRepMaxIntensityTitleDisplay", "oneRepMaxIntensityUnitDisplay", "repsDisplay", "repsTitleDisplay", "titleDisplay", "tonnageDisplay", "weightTitleDisplay", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/core/details/network/model/ExerciseSummaryModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/network/model/ExerciseSummaryModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getAvgHrTitleDisplay", "Ljava/util/List;", "getExerciseCardGroups", "getHrUnitsDisplay", "getMskIntensityPercentTitleDisplay", "getMskIntensityPercentValueDisplay", "getOneRepMaxIntensityTitleDisplay", "getOneRepMaxIntensityUnitDisplay", "getRepsDisplay", "getRepsTitleDisplay", "getTitleDisplay", "getTonnageDisplay", "getWeightTitleDisplay", "Companion", "$serializer", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExerciseSummaryModel {
    private final String avgHrTitleDisplay;
    private final List<ExerciseCardGroupModel> exerciseCardGroups;
    private final String hrUnitsDisplay;
    private final String mskIntensityPercentTitleDisplay;
    private final String mskIntensityPercentValueDisplay;
    private final String oneRepMaxIntensityTitleDisplay;
    private final String oneRepMaxIntensityUnitDisplay;
    private final String repsDisplay;
    private final String repsTitleDisplay;
    private final String titleDisplay;
    private final String tonnageDisplay;
    private final String weightTitleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C6451a(10)), null, null, null, null, null, null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/ExerciseSummaryModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/ExerciseSummaryModel;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ExerciseSummaryModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ExerciseSummaryModel(int i13, String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if (3999 != (i13 & 3999)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3999, ExerciseSummaryModel$$serializer.INSTANCE.getDescriptor());
        }
        this.avgHrTitleDisplay = str;
        this.exerciseCardGroups = list;
        this.hrUnitsDisplay = str2;
        this.mskIntensityPercentTitleDisplay = str3;
        this.mskIntensityPercentValueDisplay = str4;
        if ((i13 & 32) == 0) {
            this.oneRepMaxIntensityTitleDisplay = null;
        } else {
            this.oneRepMaxIntensityTitleDisplay = str5;
        }
        if ((i13 & 64) == 0) {
            this.oneRepMaxIntensityUnitDisplay = null;
        } else {
            this.oneRepMaxIntensityUnitDisplay = str6;
        }
        this.repsDisplay = str7;
        this.repsTitleDisplay = str8;
        this.titleDisplay = str9;
        this.tonnageDisplay = str10;
        this.weightTitleDisplay = str11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ExerciseCardGroupModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExerciseSummaryModel copy$default(ExerciseSummaryModel exerciseSummaryModel, String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = exerciseSummaryModel.avgHrTitleDisplay;
        }
        if ((i13 & 2) != 0) {
            list = exerciseSummaryModel.exerciseCardGroups;
        }
        if ((i13 & 4) != 0) {
            str2 = exerciseSummaryModel.hrUnitsDisplay;
        }
        if ((i13 & 8) != 0) {
            str3 = exerciseSummaryModel.mskIntensityPercentTitleDisplay;
        }
        if ((i13 & 16) != 0) {
            str4 = exerciseSummaryModel.mskIntensityPercentValueDisplay;
        }
        if ((i13 & 32) != 0) {
            str5 = exerciseSummaryModel.oneRepMaxIntensityTitleDisplay;
        }
        if ((i13 & 64) != 0) {
            str6 = exerciseSummaryModel.oneRepMaxIntensityUnitDisplay;
        }
        if ((i13 & 128) != 0) {
            str7 = exerciseSummaryModel.repsDisplay;
        }
        if ((i13 & 256) != 0) {
            str8 = exerciseSummaryModel.repsTitleDisplay;
        }
        if ((i13 & 512) != 0) {
            str9 = exerciseSummaryModel.titleDisplay;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str10 = exerciseSummaryModel.tonnageDisplay;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            str11 = exerciseSummaryModel.weightTitleDisplay;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        String str17 = str7;
        String str18 = str4;
        String str19 = str5;
        return exerciseSummaryModel.copy(str, list, str2, str3, str18, str19, str16, str17, str14, str15, str12, str13);
    }

    public static final /* synthetic */ void write$Self$core_details_release(ExerciseSummaryModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.avgHrTitleDisplay);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.exerciseCardGroups);
        output.encodeStringElement(serialDesc, 2, self.hrUnitsDisplay);
        output.encodeStringElement(serialDesc, 3, self.mskIntensityPercentTitleDisplay);
        output.encodeStringElement(serialDesc, 4, self.mskIntensityPercentValueDisplay);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.oneRepMaxIntensityTitleDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.oneRepMaxIntensityTitleDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.oneRepMaxIntensityUnitDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.oneRepMaxIntensityUnitDisplay);
        }
        output.encodeStringElement(serialDesc, 7, self.repsDisplay);
        output.encodeStringElement(serialDesc, 8, self.repsTitleDisplay);
        output.encodeStringElement(serialDesc, 9, self.titleDisplay);
        output.encodeStringElement(serialDesc, 10, self.tonnageDisplay);
        output.encodeStringElement(serialDesc, 11, self.weightTitleDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAvgHrTitleDisplay() {
        return this.avgHrTitleDisplay;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTonnageDisplay() {
        return this.tonnageDisplay;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getWeightTitleDisplay() {
        return this.weightTitleDisplay;
    }

    public final List<ExerciseCardGroupModel> component2() {
        return this.exerciseCardGroups;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHrUnitsDisplay() {
        return this.hrUnitsDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMskIntensityPercentTitleDisplay() {
        return this.mskIntensityPercentTitleDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMskIntensityPercentValueDisplay() {
        return this.mskIntensityPercentValueDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOneRepMaxIntensityTitleDisplay() {
        return this.oneRepMaxIntensityTitleDisplay;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOneRepMaxIntensityUnitDisplay() {
        return this.oneRepMaxIntensityUnitDisplay;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRepsDisplay() {
        return this.repsDisplay;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRepsTitleDisplay() {
        return this.repsTitleDisplay;
    }

    public final ExerciseSummaryModel copy(String avgHrTitleDisplay, List<ExerciseCardGroupModel> exerciseCardGroups, String hrUnitsDisplay, String mskIntensityPercentTitleDisplay, String mskIntensityPercentValueDisplay, String oneRepMaxIntensityTitleDisplay, String oneRepMaxIntensityUnitDisplay, String repsDisplay, String repsTitleDisplay, String titleDisplay, String tonnageDisplay, String weightTitleDisplay) {
        AbstractC22676k.m65750j(avgHrTitleDisplay, "avgHrTitleDisplay");
        AbstractC22676k.m65750j(exerciseCardGroups, "exerciseCardGroups");
        AbstractC22676k.m65750j(hrUnitsDisplay, "hrUnitsDisplay");
        AbstractC22676k.m65750j(mskIntensityPercentTitleDisplay, "mskIntensityPercentTitleDisplay");
        AbstractC22676k.m65750j(mskIntensityPercentValueDisplay, "mskIntensityPercentValueDisplay");
        AbstractC22676k.m65750j(repsDisplay, "repsDisplay");
        AbstractC22676k.m65750j(repsTitleDisplay, "repsTitleDisplay");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(tonnageDisplay, "tonnageDisplay");
        AbstractC22676k.m65750j(weightTitleDisplay, "weightTitleDisplay");
        return new ExerciseSummaryModel(avgHrTitleDisplay, exerciseCardGroups, hrUnitsDisplay, mskIntensityPercentTitleDisplay, mskIntensityPercentValueDisplay, oneRepMaxIntensityTitleDisplay, oneRepMaxIntensityUnitDisplay, repsDisplay, repsTitleDisplay, titleDisplay, tonnageDisplay, weightTitleDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExerciseSummaryModel)) {
            return false;
        }
        ExerciseSummaryModel exerciseSummaryModel = (ExerciseSummaryModel) other;
        return AbstractC22676k.m65745e(this.avgHrTitleDisplay, exerciseSummaryModel.avgHrTitleDisplay) && AbstractC22676k.m65745e(this.exerciseCardGroups, exerciseSummaryModel.exerciseCardGroups) && AbstractC22676k.m65745e(this.hrUnitsDisplay, exerciseSummaryModel.hrUnitsDisplay) && AbstractC22676k.m65745e(this.mskIntensityPercentTitleDisplay, exerciseSummaryModel.mskIntensityPercentTitleDisplay) && AbstractC22676k.m65745e(this.mskIntensityPercentValueDisplay, exerciseSummaryModel.mskIntensityPercentValueDisplay) && AbstractC22676k.m65745e(this.oneRepMaxIntensityTitleDisplay, exerciseSummaryModel.oneRepMaxIntensityTitleDisplay) && AbstractC22676k.m65745e(this.oneRepMaxIntensityUnitDisplay, exerciseSummaryModel.oneRepMaxIntensityUnitDisplay) && AbstractC22676k.m65745e(this.repsDisplay, exerciseSummaryModel.repsDisplay) && AbstractC22676k.m65745e(this.repsTitleDisplay, exerciseSummaryModel.repsTitleDisplay) && AbstractC22676k.m65745e(this.titleDisplay, exerciseSummaryModel.titleDisplay) && AbstractC22676k.m65745e(this.tonnageDisplay, exerciseSummaryModel.tonnageDisplay) && AbstractC22676k.m65745e(this.weightTitleDisplay, exerciseSummaryModel.weightTitleDisplay);
    }

    public final String getAvgHrTitleDisplay() {
        return this.avgHrTitleDisplay;
    }

    public final List<ExerciseCardGroupModel> getExerciseCardGroups() {
        return this.exerciseCardGroups;
    }

    public final String getHrUnitsDisplay() {
        return this.hrUnitsDisplay;
    }

    public final String getMskIntensityPercentTitleDisplay() {
        return this.mskIntensityPercentTitleDisplay;
    }

    public final String getMskIntensityPercentValueDisplay() {
        return this.mskIntensityPercentValueDisplay;
    }

    public final String getOneRepMaxIntensityTitleDisplay() {
        return this.oneRepMaxIntensityTitleDisplay;
    }

    public final String getOneRepMaxIntensityUnitDisplay() {
        return this.oneRepMaxIntensityUnitDisplay;
    }

    public final String getRepsDisplay() {
        return this.repsDisplay;
    }

    public final String getRepsTitleDisplay() {
        return this.repsTitleDisplay;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public final String getTonnageDisplay() {
        return this.tonnageDisplay;
    }

    public final String getWeightTitleDisplay() {
        return this.weightTitleDisplay;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(this.avgHrTitleDisplay.hashCode() * 31, 31, this.exerciseCardGroups), 31, this.hrUnitsDisplay), 31, this.mskIntensityPercentTitleDisplay), 31, this.mskIntensityPercentValueDisplay);
        String str = this.oneRepMaxIntensityTitleDisplay;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.oneRepMaxIntensityUnitDisplay;
        return this.weightTitleDisplay.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.repsDisplay), 31, this.repsTitleDisplay), 31, this.titleDisplay), 31, this.tonnageDisplay);
    }

    public String toString() {
        String str = this.avgHrTitleDisplay;
        List<ExerciseCardGroupModel> list = this.exerciseCardGroups;
        String str2 = this.hrUnitsDisplay;
        String str3 = this.mskIntensityPercentTitleDisplay;
        String str4 = this.mskIntensityPercentValueDisplay;
        String str5 = this.oneRepMaxIntensityTitleDisplay;
        String str6 = this.oneRepMaxIntensityUnitDisplay;
        String str7 = this.repsDisplay;
        String str8 = this.repsTitleDisplay;
        String str9 = this.titleDisplay;
        String str10 = this.tonnageDisplay;
        String str11 = this.weightTitleDisplay;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("ExerciseSummaryModel(avgHrTitleDisplay=", str, ", exerciseCardGroups=", ", hrUnitsDisplay=", list);
        AbstractC11266d.m30444B(sbM94766o, str2, ", mskIntensityPercentTitleDisplay=", str3, ", mskIntensityPercentValueDisplay=");
        AbstractC11266d.m30444B(sbM94766o, str4, ", oneRepMaxIntensityTitleDisplay=", str5, ", oneRepMaxIntensityUnitDisplay=");
        AbstractC11266d.m30444B(sbM94766o, str6, ", repsDisplay=", str7, ", repsTitleDisplay=");
        AbstractC11266d.m30444B(sbM94766o, str8, ", titleDisplay=", str9, ", tonnageDisplay=");
        return AbstractC11266d.m30464r(sbM94766o, str10, ", weightTitleDisplay=", str11, ")");
    }

    public ExerciseSummaryModel(String avgHrTitleDisplay, List<ExerciseCardGroupModel> exerciseCardGroups, String hrUnitsDisplay, String mskIntensityPercentTitleDisplay, String mskIntensityPercentValueDisplay, String str, String str2, String repsDisplay, String repsTitleDisplay, String titleDisplay, String tonnageDisplay, String weightTitleDisplay) {
        AbstractC22676k.m65750j(avgHrTitleDisplay, "avgHrTitleDisplay");
        AbstractC22676k.m65750j(exerciseCardGroups, "exerciseCardGroups");
        AbstractC22676k.m65750j(hrUnitsDisplay, "hrUnitsDisplay");
        AbstractC22676k.m65750j(mskIntensityPercentTitleDisplay, "mskIntensityPercentTitleDisplay");
        AbstractC22676k.m65750j(mskIntensityPercentValueDisplay, "mskIntensityPercentValueDisplay");
        AbstractC22676k.m65750j(repsDisplay, "repsDisplay");
        AbstractC22676k.m65750j(repsTitleDisplay, "repsTitleDisplay");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(tonnageDisplay, "tonnageDisplay");
        AbstractC22676k.m65750j(weightTitleDisplay, "weightTitleDisplay");
        this.avgHrTitleDisplay = avgHrTitleDisplay;
        this.exerciseCardGroups = exerciseCardGroups;
        this.hrUnitsDisplay = hrUnitsDisplay;
        this.mskIntensityPercentTitleDisplay = mskIntensityPercentTitleDisplay;
        this.mskIntensityPercentValueDisplay = mskIntensityPercentValueDisplay;
        this.oneRepMaxIntensityTitleDisplay = str;
        this.oneRepMaxIntensityUnitDisplay = str2;
        this.repsDisplay = repsDisplay;
        this.repsTitleDisplay = repsTitleDisplay;
        this.titleDisplay = titleDisplay;
        this.tonnageDisplay = tonnageDisplay;
        this.weightTitleDisplay = weightTitleDisplay;
    }

    public /* synthetic */ ExerciseSummaryModel(String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2, str3, str4, (i13 & 32) != 0 ? null : str5, (i13 & 64) != 0 ? null : str6, str7, str8, str9, str10, str11);
    }
}
