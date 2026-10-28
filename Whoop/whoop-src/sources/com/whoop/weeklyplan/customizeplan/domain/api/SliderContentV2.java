package com.whoop.weeklyplan.customizeplan.domain.api;

import com.whoop.design.models.modal.C8527a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.util.List;
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
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0002QPBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0014\u0010\u0015B\u008b\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0012\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010\"J\u0012\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b+\u0010\"J\u008e\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b.\u0010\"J\u0010\u0010/\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105J'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\bC\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bD\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bF\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\bH\u0010$R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bJ\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bK\u0010\"R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010L\u001a\u0004\bM\u0010)R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bN\u0010\"R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bO\u0010\"¨\u0006R"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContentV2;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;", "range", "", "increment", "usableRange", "value", "", "valueLabel", "Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeV2;", "recommendedRange", "", "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTipV2;", "rangeContent", "valueUnits", "Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLineV2;", "averageLine", "topText", "bottomText", "<init>", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;DLcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;DLjava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeV2;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLineV2;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;DLcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;DLjava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeV2;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLineV2;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;", "component2", "()D", "component3", "component4", "component5", "()Ljava/lang/String;", "component6", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeV2;", "component7", "()Ljava/util/List;", "component8", "component9", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLineV2;", "component10", "component11", "copy", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;DLcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;DLjava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeV2;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLineV2;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContentV2;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContentV2;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;", "getRange", "D", "getIncrement", "getUsableRange", "getValue", "Ljava/lang/String;", "getValueLabel", "Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeV2;", "getRecommendedRange", "Ljava/util/List;", "getRangeContent", "getValueUnits", "Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLineV2;", "getAverageLine", "getTopText", "getBottomText", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SliderContentV2 implements GoalScreenContent {
    private final AverageLineV2 averageLine;
    private final String bottomText;
    private final double increment;
    private final RangeV2 range;
    private final List<RangeWithTipV2> rangeContent;
    private final DisplayRangeV2 recommendedRange;
    private final String topText;
    private final RangeV2 usableRange;
    private final double value;
    private final String valueLabel;
    private final String valueUnits;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C8527a(29)), null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContentV2$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContentV2;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SliderContentV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SliderContentV2(int i13, RangeV2 rangeV2, double d3, RangeV2 rangeV3, double d14, String str, DisplayRangeV2 displayRangeV2, List list, String str2, AverageLineV2 averageLineV2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i13 & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2047, SliderContentV2$$serializer.INSTANCE.getDescriptor());
        }
        this.range = rangeV2;
        this.increment = d3;
        this.usableRange = rangeV3;
        this.value = d14;
        this.valueLabel = str;
        this.recommendedRange = displayRangeV2;
        this.rangeContent = list;
        this.valueUnits = str2;
        this.averageLine = averageLineV2;
        this.topText = str3;
        this.bottomText = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(RangeWithTipV2$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SliderContentV2 copy$default(SliderContentV2 sliderContentV2, RangeV2 rangeV2, double d3, RangeV2 rangeV3, double d14, String str, DisplayRangeV2 displayRangeV2, List list, String str2, AverageLineV2 averageLineV2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            rangeV2 = sliderContentV2.range;
        }
        return sliderContentV2.copy(rangeV2, (i13 & 2) != 0 ? sliderContentV2.increment : d3, (i13 & 4) != 0 ? sliderContentV2.usableRange : rangeV3, (i13 & 8) != 0 ? sliderContentV2.value : d14, (i13 & 16) != 0 ? sliderContentV2.valueLabel : str, (i13 & 32) != 0 ? sliderContentV2.recommendedRange : displayRangeV2, (i13 & 64) != 0 ? sliderContentV2.rangeContent : list, (i13 & 128) != 0 ? sliderContentV2.valueUnits : str2, (i13 & 256) != 0 ? sliderContentV2.averageLine : averageLineV2, (i13 & 512) != 0 ? sliderContentV2.topText : str3, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? sliderContentV2.bottomText : str4);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(SliderContentV2 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        RangeV2$$serializer rangeV2$$serializer = RangeV2$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, rangeV2$$serializer, self.range);
        output.encodeDoubleElement(serialDesc, 1, self.increment);
        output.encodeSerializableElement(serialDesc, 2, rangeV2$$serializer, self.usableRange);
        output.encodeDoubleElement(serialDesc, 3, self.value);
        output.encodeStringElement(serialDesc, 4, self.valueLabel);
        output.encodeNullableSerializableElement(serialDesc, 5, DisplayRangeV2$$serializer.INSTANCE, self.recommendedRange);
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.rangeContent);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.valueUnits);
        output.encodeNullableSerializableElement(serialDesc, 8, AverageLineV2$$serializer.INSTANCE, self.averageLine);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.topText);
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.bottomText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RangeV2 getRange() {
        return this.range;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTopText() {
        return this.topText;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBottomText() {
        return this.bottomText;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getIncrement() {
        return this.increment;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RangeV2 getUsableRange() {
        return this.usableRange;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getValueLabel() {
        return this.valueLabel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DisplayRangeV2 getRecommendedRange() {
        return this.recommendedRange;
    }

    public final List<RangeWithTipV2> component7() {
        return this.rangeContent;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getValueUnits() {
        return this.valueUnits;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final AverageLineV2 getAverageLine() {
        return this.averageLine;
    }

    public final SliderContentV2 copy(RangeV2 range, double increment, RangeV2 usableRange, double value, String valueLabel, DisplayRangeV2 recommendedRange, List<RangeWithTipV2> rangeContent, String valueUnits, AverageLineV2 averageLine, String topText, String bottomText) {
        AbstractC22676k.m65750j(range, "range");
        AbstractC22676k.m65750j(usableRange, "usableRange");
        AbstractC22676k.m65750j(valueLabel, "valueLabel");
        AbstractC22676k.m65750j(rangeContent, "rangeContent");
        return new SliderContentV2(range, increment, usableRange, value, valueLabel, recommendedRange, rangeContent, valueUnits, averageLine, topText, bottomText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliderContentV2)) {
            return false;
        }
        SliderContentV2 sliderContentV2 = (SliderContentV2) other;
        return AbstractC22676k.m65745e(this.range, sliderContentV2.range) && Double.compare(this.increment, sliderContentV2.increment) == 0 && AbstractC22676k.m65745e(this.usableRange, sliderContentV2.usableRange) && Double.compare(this.value, sliderContentV2.value) == 0 && AbstractC22676k.m65745e(this.valueLabel, sliderContentV2.valueLabel) && AbstractC22676k.m65745e(this.recommendedRange, sliderContentV2.recommendedRange) && AbstractC22676k.m65745e(this.rangeContent, sliderContentV2.rangeContent) && AbstractC22676k.m65745e(this.valueUnits, sliderContentV2.valueUnits) && AbstractC22676k.m65745e(this.averageLine, sliderContentV2.averageLine) && AbstractC22676k.m65745e(this.topText, sliderContentV2.topText) && AbstractC22676k.m65745e(this.bottomText, sliderContentV2.bottomText);
    }

    public final AverageLineV2 getAverageLine() {
        return this.averageLine;
    }

    public final String getBottomText() {
        return this.bottomText;
    }

    public final double getIncrement() {
        return this.increment;
    }

    public final RangeV2 getRange() {
        return this.range;
    }

    public final List<RangeWithTipV2> getRangeContent() {
        return this.rangeContent;
    }

    public final DisplayRangeV2 getRecommendedRange() {
        return this.recommendedRange;
    }

    public final String getTopText() {
        return this.topText;
    }

    public final RangeV2 getUsableRange() {
        return this.usableRange;
    }

    public final double getValue() {
        return this.value;
    }

    public final String getValueLabel() {
        return this.valueLabel;
    }

    public final String getValueUnits() {
        return this.valueUnits;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC17176i.m48499a((this.usableRange.hashCode() + AbstractC17176i.m48499a(this.range.hashCode() * 31, 31, this.increment)) * 31, 31, this.value), 31, this.valueLabel);
        DisplayRangeV2 displayRangeV2 = this.recommendedRange;
        int iM31983b = AbstractC11895b.m31983b((iM30450d + (displayRangeV2 == null ? 0 : displayRangeV2.hashCode())) * 31, 31, this.rangeContent);
        String str = this.valueUnits;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        AverageLineV2 averageLineV2 = this.averageLine;
        int iHashCode2 = (iHashCode + (averageLineV2 == null ? 0 : averageLineV2.hashCode())) * 31;
        String str2 = this.topText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bottomText;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        RangeV2 rangeV2 = this.range;
        double d3 = this.increment;
        RangeV2 rangeV3 = this.usableRange;
        double d14 = this.value;
        String str = this.valueLabel;
        DisplayRangeV2 displayRangeV2 = this.recommendedRange;
        List<RangeWithTipV2> list = this.rangeContent;
        String str2 = this.valueUnits;
        AverageLineV2 averageLineV2 = this.averageLine;
        String str3 = this.topText;
        String str4 = this.bottomText;
        StringBuilder sb4 = new StringBuilder("SliderContentV2(range=");
        sb4.append(rangeV2);
        sb4.append(", increment=");
        sb4.append(d3);
        sb4.append(", usableRange=");
        sb4.append(rangeV3);
        sb4.append(", value=");
        sb4.append(d14);
        sb4.append(", valueLabel=");
        sb4.append(str);
        sb4.append(", recommendedRange=");
        sb4.append(displayRangeV2);
        sb4.append(", rangeContent=");
        sb4.append(list);
        sb4.append(", valueUnits=");
        sb4.append(str2);
        sb4.append(", averageLine=");
        sb4.append(averageLineV2);
        AbstractC11266d.m30444B(sb4, ", topText=", str3, ", bottomText=", str4);
        sb4.append(")");
        return sb4.toString();
    }

    public SliderContentV2(RangeV2 range, double d3, RangeV2 usableRange, double d14, String valueLabel, DisplayRangeV2 displayRangeV2, List<RangeWithTipV2> rangeContent, String str, AverageLineV2 averageLineV2, String str2, String str3) {
        AbstractC22676k.m65750j(range, "range");
        AbstractC22676k.m65750j(usableRange, "usableRange");
        AbstractC22676k.m65750j(valueLabel, "valueLabel");
        AbstractC22676k.m65750j(rangeContent, "rangeContent");
        this.range = range;
        this.increment = d3;
        this.usableRange = usableRange;
        this.value = d14;
        this.valueLabel = valueLabel;
        this.recommendedRange = displayRangeV2;
        this.rangeContent = rangeContent;
        this.valueUnits = str;
        this.averageLine = averageLineV2;
        this.topText = str2;
        this.bottomText = str3;
    }
}
