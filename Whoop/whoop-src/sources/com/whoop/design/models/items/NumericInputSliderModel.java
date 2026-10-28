package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import java.util.Map;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import w91.C36961h;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \\2\u00020\u00012\u00020\u0002:\u0005]^_`\\BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u0097\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0015\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0012\u0010\u001cJ#\u0010\u001f\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d0\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b)\u0010\"J\u0012\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b.\u0010/Jp\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b4\u0010%J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b7\u00108J'\u0010A\u001a\u00020>2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0001¢\u0006\u0004\b?\u0010@R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010B\u001a\u0004\bC\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010B\u001a\u0004\bD\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bF\u0010%R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bG\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010H\u001a\u0004\bI\u0010(R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bJ\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bL\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010M\u001a\u0004\bN\u0010-R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010O\u001a\u0004\bP\u0010/R0\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010URE\u0010\u0019\u001a%\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0015j\u0004\u0018\u0001`V¢\u0006\f\bW\u0012\b\bX\u0012\u0004\b\t0Y8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010Q\u001a\u0004\bZ\u0010S\"\u0004\b[\u0010U¨\u0006a"}, m65681d2 = {"Lcom/whoop/design/models/items/NumericInputSliderModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "upperBound", "lowerBound", "", "stepSize", "barThickness", "Ly81/f;", "barColor", "sliderValue", "Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;", "startLabel", "Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;", "endLabel", "Lcom/whoop/design/models/items/MultiWheelPickerModel;", "picker", "<init>", "(FFIILy81/f;FLcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;Lcom/whoop/design/models/items/MultiWheelPickerModel;)V", "seen0", "", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFFIILy81/f;FLcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;Lcom/whoop/design/models/items/MultiWheelPickerModel;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/items/NumericInputSliderModel;", "component1", "()F", "component2", "component3", "()I", "component4", "component5", "()Ly81/f;", "component6", "component7", "()Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;", "component8", "()Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;", "component9", "()Lcom/whoop/design/models/items/MultiWheelPickerModel;", "copy", "(FFIILy81/f;FLcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;Lcom/whoop/design/models/items/MultiWheelPickerModel;)Lcom/whoop/design/models/items/NumericInputSliderModel;", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/NumericInputSliderModel;Lzc3/c;Lyc3/g;)V", "write$Self", "F", "getUpperBound", "getLowerBound", "I", "getStepSize", "getBarThickness", "Ly81/f;", "getBarColor", "getSliderValue", "Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;", "getStartLabel", "Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;", "getEndLabel", "Lcom/whoop/design/models/items/MultiWheelPickerModel;", "getPicker", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "StartLabel", "EndLabel", "EndLabelFormat", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NumericInputSliderModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private final EnumC39333f barColor;
    private final int barThickness;
    private Map<String, String> bindings;
    private final EndLabel endLabel;
    private final float lowerBound;
    private final MultiWheelPickerModel picker;
    private final float sliderValue;
    private final StartLabel startLabel;
    private final int stepSize;
    private final float upperBound;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/NumericInputSliderModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/NumericInputSliderModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NumericInputSliderModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, m65681d2 = {"Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;", "", "", "unit", "", "sliderValue", "Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabelFormat;", "format", "<init>", "(Ljava/lang/String;FLcom/whoop/design/models/items/NumericInputSliderModel$EndLabelFormat;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;FLcom/whoop/design/models/items/NumericInputSliderModel$EndLabelFormat;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()F", "component3", "()Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabelFormat;", "copy", "(Ljava/lang/String;FLcom/whoop/design/models/items/NumericInputSliderModel$EndLabelFormat;)Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUnit", "F", "getSliderValue", "Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabelFormat;", "getFormat", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class EndLabel {
        public static final int $stable = 0;
        private final EndLabelFormat format;
        private final float sliderValue;
        private final String unit;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36961h(12))};

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return NumericInputSliderModel$EndLabel$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ EndLabel(int i13, String str, float f13, EndLabelFormat endLabelFormat, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i13 & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 7, NumericInputSliderModel$EndLabel$$serializer.INSTANCE.getDescriptor());
            }
            this.unit = str;
            this.sliderValue = f13;
            this.format = endLabelFormat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
            return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.NumericInputSliderModel.EndLabelFormat", EndLabelFormat.values());
        }

        public static /* synthetic */ EndLabel copy$default(EndLabel endLabel, String str, float f13, EndLabelFormat endLabelFormat, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = endLabel.unit;
            }
            if ((i13 & 2) != 0) {
                f13 = endLabel.sliderValue;
            }
            if ((i13 & 4) != 0) {
                endLabelFormat = endLabel.format;
            }
            return endLabel.copy(str, f13, endLabelFormat);
        }

        public static final /* synthetic */ void write$Self$design_models_release(EndLabel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.unit);
            output.encodeFloatElement(serialDesc, 1, self.sliderValue);
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.format);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUnit() {
            return this.unit;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getSliderValue() {
            return this.sliderValue;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final EndLabelFormat getFormat() {
            return this.format;
        }

        public final EndLabel copy(String unit, float sliderValue, EndLabelFormat format) {
            AbstractC22676k.m65750j(unit, "unit");
            AbstractC22676k.m65750j(format, "format");
            return new EndLabel(unit, sliderValue, format);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EndLabel)) {
                return false;
            }
            EndLabel endLabel = (EndLabel) other;
            return AbstractC22676k.m65745e(this.unit, endLabel.unit) && Float.compare(this.sliderValue, endLabel.sliderValue) == 0 && this.format == endLabel.format;
        }

        public final EndLabelFormat getFormat() {
            return this.format;
        }

        public final float getSliderValue() {
            return this.sliderValue;
        }

        public final String getUnit() {
            return this.unit;
        }

        public int hashCode() {
            return this.format.hashCode() + AbstractC11266d.m30447a(this.sliderValue, this.unit.hashCode() * 31, 31);
        }

        public String toString() {
            return "EndLabel(unit=" + this.unit + ", sliderValue=" + this.sliderValue + ", format=" + this.format + ")";
        }

        public EndLabel(String unit, float f13, EndLabelFormat format) {
            AbstractC22676k.m65750j(unit, "unit");
            AbstractC22676k.m65750j(format, "format");
            this.unit = unit;
            this.sliderValue = f13;
            this.format = format;
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabelFormat;", "", "<init>", "(Ljava/lang/String;I)V", "DISTANCE", "TIME", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum EndLabelFormat {
        DISTANCE,
        TIME;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ2\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006,"}, m65681d2 = {"Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;", "", "", "title", "subtitle", "Ly81/f;", "bannerColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ly81/f;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ly81/f;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ly81/f;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ly81/f;)Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Ly81/f;", "getBannerColor", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class StartLabel {
        public static final int $stable = 0;
        private final EnumC39333f bannerColor;
        private final String subtitle;
        private final String title;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36961h(13))};

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return NumericInputSliderModel$StartLabel$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ StartLabel(int i13, String str, String str2, EnumC39333f enumC39333f, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i13 & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 7, NumericInputSliderModel$StartLabel$$serializer.INSTANCE.getDescriptor());
            }
            this.title = str;
            this.subtitle = str2;
            this.bannerColor = enumC39333f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
            return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
        }

        public static /* synthetic */ StartLabel copy$default(StartLabel startLabel, String str, String str2, EnumC39333f enumC39333f, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = startLabel.title;
            }
            if ((i13 & 2) != 0) {
                str2 = startLabel.subtitle;
            }
            if ((i13 & 4) != 0) {
                enumC39333f = startLabel.bannerColor;
            }
            return startLabel.copy(str, str2, enumC39333f);
        }

        public static final /* synthetic */ void write$Self$design_models_release(StartLabel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.title);
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.subtitle);
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.bannerColor);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final EnumC39333f getBannerColor() {
            return this.bannerColor;
        }

        public final StartLabel copy(String title, String subtitle, EnumC39333f bannerColor) {
            AbstractC22676k.m65750j(title, "title");
            return new StartLabel(title, subtitle, bannerColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartLabel)) {
                return false;
            }
            StartLabel startLabel = (StartLabel) other;
            return AbstractC22676k.m65745e(this.title, startLabel.title) && AbstractC22676k.m65745e(this.subtitle, startLabel.subtitle) && this.bannerColor == startLabel.bannerColor;
        }

        public final EnumC39333f getBannerColor() {
            return this.bannerColor;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            EnumC39333f enumC39333f = this.bannerColor;
            return iHashCode2 + (enumC39333f != null ? enumC39333f.hashCode() : 0);
        }

        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            return AbstractC21702c.m61138i(AbstractC11895b.m32001t("StartLabel(title=", str, ", subtitle=", str2, ", bannerColor="), this.bannerColor, ")");
        }

        public StartLabel(String title, String str, EnumC39333f enumC39333f) {
            AbstractC22676k.m65750j(title, "title");
            this.title = title;
            this.subtitle = str;
            this.bannerColor = enumC39333f;
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36961h(10)), null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36961h(11)), null};
    }

    public NumericInputSliderModel(float f13, float f14, int i13, int i14, EnumC39333f barColor, float f15, StartLabel startLabel, EndLabel endLabel, MultiWheelPickerModel multiWheelPickerModel) {
        AbstractC22676k.m65750j(barColor, "barColor");
        this.upperBound = f13;
        this.lowerBound = f14;
        this.stepSize = i13;
        this.barThickness = i14;
        this.barColor = barColor;
        this.sliderValue = f15;
        this.startLabel = startLabel;
        this.endLabel = endLabel;
        this.picker = multiWheelPickerModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    public static /* synthetic */ NumericInputSliderModel copy$default(NumericInputSliderModel numericInputSliderModel, float f13, float f14, int i13, int i14, EnumC39333f enumC39333f, float f15, StartLabel startLabel, EndLabel endLabel, MultiWheelPickerModel multiWheelPickerModel, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f13 = numericInputSliderModel.upperBound;
        }
        if ((i15 & 2) != 0) {
            f14 = numericInputSliderModel.lowerBound;
        }
        if ((i15 & 4) != 0) {
            i13 = numericInputSliderModel.stepSize;
        }
        if ((i15 & 8) != 0) {
            i14 = numericInputSliderModel.barThickness;
        }
        if ((i15 & 16) != 0) {
            enumC39333f = numericInputSliderModel.barColor;
        }
        if ((i15 & 32) != 0) {
            f15 = numericInputSliderModel.sliderValue;
        }
        if ((i15 & 64) != 0) {
            startLabel = numericInputSliderModel.startLabel;
        }
        if ((i15 & 128) != 0) {
            endLabel = numericInputSliderModel.endLabel;
        }
        if ((i15 & 256) != 0) {
            multiWheelPickerModel = numericInputSliderModel.picker;
        }
        EndLabel endLabel2 = endLabel;
        MultiWheelPickerModel multiWheelPickerModel2 = multiWheelPickerModel;
        float f16 = f15;
        StartLabel startLabel2 = startLabel;
        EnumC39333f enumC39333f2 = enumC39333f;
        int i16 = i13;
        return numericInputSliderModel.copy(f13, f14, i16, i14, enumC39333f2, f16, startLabel2, endLabel2, multiWheelPickerModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(NumericInputSliderModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeFloatElement(serialDesc, 0, self.upperBound);
        output.encodeFloatElement(serialDesc, 1, self.lowerBound);
        output.encodeIntElement(serialDesc, 2, self.stepSize);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.barThickness != 4) {
            output.encodeIntElement(serialDesc, 3, self.barThickness);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.barColor != EnumC39333f.SUFFICIENT_TREND) {
            output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.barColor);
        }
        output.encodeFloatElement(serialDesc, 5, self.sliderValue);
        output.encodeNullableSerializableElement(serialDesc, 6, NumericInputSliderModel$StartLabel$$serializer.INSTANCE, self.startLabel);
        output.encodeNullableSerializableElement(serialDesc, 7, NumericInputSliderModel$EndLabel$$serializer.INSTANCE, self.endLabel);
        output.encodeNullableSerializableElement(serialDesc, 8, MultiWheelPickerModel$$serializer.INSTANCE, self.picker);
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public /* bridge */ /* synthetic */ WithGeneratedBindings bind(Map map) {
        return bind((Map<String, ? extends Object>) map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getUpperBound() {
        return this.upperBound;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getLowerBound() {
        return this.lowerBound;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStepSize() {
        return this.stepSize;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBarThickness() {
        return this.barThickness;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EnumC39333f getBarColor() {
        return this.barColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getSliderValue() {
        return this.sliderValue;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final StartLabel getStartLabel() {
        return this.startLabel;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final EndLabel getEndLabel() {
        return this.endLabel;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final MultiWheelPickerModel getPicker() {
        return this.picker;
    }

    public final NumericInputSliderModel copy(float upperBound, float lowerBound, int stepSize, int barThickness, EnumC39333f barColor, float sliderValue, StartLabel startLabel, EndLabel endLabel, MultiWheelPickerModel picker) {
        AbstractC22676k.m65750j(barColor, "barColor");
        return new NumericInputSliderModel(upperBound, lowerBound, stepSize, barThickness, barColor, sliderValue, startLabel, endLabel, picker);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NumericInputSliderModel)) {
            return false;
        }
        NumericInputSliderModel numericInputSliderModel = (NumericInputSliderModel) other;
        return Float.compare(this.upperBound, numericInputSliderModel.upperBound) == 0 && Float.compare(this.lowerBound, numericInputSliderModel.lowerBound) == 0 && this.stepSize == numericInputSliderModel.stepSize && this.barThickness == numericInputSliderModel.barThickness && this.barColor == numericInputSliderModel.barColor && Float.compare(this.sliderValue, numericInputSliderModel.sliderValue) == 0 && AbstractC22676k.m65745e(this.startLabel, numericInputSliderModel.startLabel) && AbstractC22676k.m65745e(this.endLabel, numericInputSliderModel.endLabel) && AbstractC22676k.m65745e(this.picker, numericInputSliderModel.picker);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    public final EnumC39333f getBarColor() {
        return this.barColor;
    }

    public final int getBarThickness() {
        return this.barThickness;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final EndLabel getEndLabel() {
        return this.endLabel;
    }

    public final float getLowerBound() {
        return this.lowerBound;
    }

    public final MultiWheelPickerModel getPicker() {
        return this.picker;
    }

    public final float getSliderValue() {
        return this.sliderValue;
    }

    public final StartLabel getStartLabel() {
        return this.startLabel;
    }

    public final int getStepSize() {
        return this.stepSize;
    }

    public final float getUpperBound() {
        return this.upperBound;
    }

    public int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.sliderValue, AbstractC21702c.m61132c(this.barColor, AbstractC11266d.m30448b(this.barThickness, AbstractC11266d.m30448b(this.stepSize, AbstractC11266d.m30447a(this.lowerBound, Float.hashCode(this.upperBound) * 31, 31), 31), 31), 31), 31);
        StartLabel startLabel = this.startLabel;
        int iHashCode = (iM30447a + (startLabel == null ? 0 : startLabel.hashCode())) * 31;
        EndLabel endLabel = this.endLabel;
        int iHashCode2 = (iHashCode + (endLabel == null ? 0 : endLabel.hashCode())) * 31;
        MultiWheelPickerModel multiWheelPickerModel = this.picker;
        return iHashCode2 + (multiWheelPickerModel != null ? multiWheelPickerModel.hashCode() : 0);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setAggregateBindings(Map<String, AggregateBinding> map) {
        this.aggregateBindings = map;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setBindings(Map<String, String> map) {
        this.bindings = map;
    }

    public String toString() {
        float f13 = this.upperBound;
        float f14 = this.lowerBound;
        int i13 = this.stepSize;
        int i14 = this.barThickness;
        EnumC39333f enumC39333f = this.barColor;
        float f15 = this.sliderValue;
        StartLabel startLabel = this.startLabel;
        EndLabel endLabel = this.endLabel;
        MultiWheelPickerModel multiWheelPickerModel = this.picker;
        StringBuilder sbM8307t = AbstractC2875y.m8307t("NumericInputSliderModel(upperBound=", f13, ", lowerBound=", f14, ", stepSize=");
        AbstractC30802r.m94773v(sbM8307t, i13, ", barThickness=", i14, ", barColor=");
        sbM8307t.append(enumC39333f);
        sbM8307t.append(", sliderValue=");
        sbM8307t.append(f15);
        sbM8307t.append(", startLabel=");
        sbM8307t.append(startLabel);
        sbM8307t.append(", endLabel=");
        sbM8307t.append(endLabel);
        sbM8307t.append(", picker=");
        sbM8307t.append(multiWheelPickerModel);
        sbM8307t.append(")");
        return sbM8307t.toString();
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public NumericInputSliderModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return NumericInputSliderModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    public /* synthetic */ NumericInputSliderModel(int i13, float f13, float f14, int i14, int i15, EnumC39333f enumC39333f, float f15, StartLabel startLabel, EndLabel endLabel, MultiWheelPickerModel multiWheelPickerModel, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (487 != (i13 & 487)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 487, NumericInputSliderModel$$serializer.INSTANCE.getDescriptor());
        }
        this.upperBound = f13;
        this.lowerBound = f14;
        this.stepSize = i14;
        if ((i13 & 8) == 0) {
            this.barThickness = 4;
        } else {
            this.barThickness = i15;
        }
        if ((i13 & 16) == 0) {
            this.barColor = EnumC39333f.SUFFICIENT_TREND;
        } else {
            this.barColor = enumC39333f;
        }
        this.sliderValue = f15;
        this.startLabel = startLabel;
        this.endLabel = endLabel;
        this.picker = multiWheelPickerModel;
        if ((i13 & 512) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    public /* synthetic */ NumericInputSliderModel(float f13, float f14, int i13, int i14, EnumC39333f enumC39333f, float f15, StartLabel startLabel, EndLabel endLabel, MultiWheelPickerModel multiWheelPickerModel, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, i13, (i15 & 8) != 0 ? 4 : i14, (i15 & 16) != 0 ? EnumC39333f.SUFFICIENT_TREND : enumC39333f, f15, startLabel, endLabel, multiWheelPickerModel);
    }
}
