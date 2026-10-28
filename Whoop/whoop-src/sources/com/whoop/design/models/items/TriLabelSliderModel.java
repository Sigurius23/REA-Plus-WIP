package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36964k;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 S2\u00020\u00012\u00020\u0002:\u0002TSBW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010B\u0099\u0001\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u000f\u0010\u0018J#\u0010\u001b\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00190\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0010\u0010&\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b)\u0010#Jn\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b,\u0010#J\u0010\u0010-\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b-\u0010(J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b0\u00101J'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b8\u00109R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b<\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010 R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b?\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bA\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bB\u0010#R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bC\u0010#R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\bD\u0010\u001eR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010(R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bG\u0010#R0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LRE\u0010\u0015\u001a%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012j\u0004\u0018\u0001`M¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\t0P8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010H\u001a\u0004\bQ\u0010J\"\u0004\bR\u0010L¨\u0006U"}, m65681d2 = {"Lcom/whoop/design/models/items/TriLabelSliderModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "lowerBound", "centerBound", "upperBound", "", "startLabel", "centerLabel", "endLabel", "sliderValue", "", "barThickness", "barStyle", "<init>", "(FLjava/lang/Float;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;)V", "seen0", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFLjava/lang/Float;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/items/TriLabelSliderModel;", "component1", "()F", "component2", "()Ljava/lang/Float;", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "component8", "()I", "component9", "copy", "(FLjava/lang/Float;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;)Lcom/whoop/design/models/items/TriLabelSliderModel;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/TriLabelSliderModel;Lzc3/c;Lyc3/g;)V", "write$Self", "F", "getLowerBound", "Ljava/lang/Float;", "getCenterBound", "getUpperBound", "Ljava/lang/String;", "getStartLabel", "getCenterLabel", "getEndLabel", "getSliderValue", "I", "getBarThickness", "getBarStyle", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TriLabelSliderModel implements DesignSystemModel, WithGeneratedBindings {
    private Map<String, AggregateBinding> aggregateBindings;
    private final String barStyle;
    private final int barThickness;
    private Map<String, String> bindings;
    private final Float centerBound;
    private final String centerLabel;
    private final String endLabel;
    private final float lowerBound;
    private final float sliderValue;
    private final String startLabel;
    private final float upperBound;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36964k(28)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/TriLabelSliderModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/TriLabelSliderModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TriLabelSliderModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TriLabelSliderModel(float f13, Float f14, float f15, String startLabel, String str, String endLabel, float f16, int i13, String barStyle) {
        AbstractC22676k.m65750j(startLabel, "startLabel");
        AbstractC22676k.m65750j(endLabel, "endLabel");
        AbstractC22676k.m65750j(barStyle, "barStyle");
        this.lowerBound = f13;
        this.centerBound = f14;
        this.upperBound = f15;
        this.startLabel = startLabel;
        this.centerLabel = str;
        this.endLabel = endLabel;
        this.sliderValue = f16;
        this.barThickness = i13;
        this.barStyle = barStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    public static /* synthetic */ TriLabelSliderModel copy$default(TriLabelSliderModel triLabelSliderModel, float f13, Float f14, float f15, String str, String str2, String str3, float f16, int i13, String str4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            f13 = triLabelSliderModel.lowerBound;
        }
        if ((i14 & 2) != 0) {
            f14 = triLabelSliderModel.centerBound;
        }
        if ((i14 & 4) != 0) {
            f15 = triLabelSliderModel.upperBound;
        }
        if ((i14 & 8) != 0) {
            str = triLabelSliderModel.startLabel;
        }
        if ((i14 & 16) != 0) {
            str2 = triLabelSliderModel.centerLabel;
        }
        if ((i14 & 32) != 0) {
            str3 = triLabelSliderModel.endLabel;
        }
        if ((i14 & 64) != 0) {
            f16 = triLabelSliderModel.sliderValue;
        }
        if ((i14 & 128) != 0) {
            i13 = triLabelSliderModel.barThickness;
        }
        if ((i14 & 256) != 0) {
            str4 = triLabelSliderModel.barStyle;
        }
        int i15 = i13;
        String str5 = str4;
        String str6 = str3;
        float f17 = f16;
        String str7 = str2;
        float f18 = f15;
        return triLabelSliderModel.copy(f13, f14, f18, str, str7, str6, f17, i15, str5);
    }

    public static final /* synthetic */ void write$Self$design_models_release(TriLabelSliderModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeFloatElement(serialDesc, 0, self.lowerBound);
        output.encodeNullableSerializableElement(serialDesc, 1, FloatSerializer.INSTANCE, self.centerBound);
        output.encodeFloatElement(serialDesc, 2, self.upperBound);
        output.encodeStringElement(serialDesc, 3, self.startLabel);
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.centerLabel);
        output.encodeStringElement(serialDesc, 5, self.endLabel);
        output.encodeFloatElement(serialDesc, 6, self.sliderValue);
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.barThickness != 8) {
            output.encodeIntElement(serialDesc, 7, self.barThickness);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !AbstractC22676k.m65745e(self.barStyle, "STRAIN_GRADIENT")) {
            output.encodeStringElement(serialDesc, 8, self.barStyle);
        }
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
    public final float getLowerBound() {
        return this.lowerBound;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float getCenterBound() {
        return this.centerBound;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getUpperBound() {
        return this.upperBound;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStartLabel() {
        return this.startLabel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCenterLabel() {
        return this.centerLabel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEndLabel() {
        return this.endLabel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getSliderValue() {
        return this.sliderValue;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getBarThickness() {
        return this.barThickness;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBarStyle() {
        return this.barStyle;
    }

    public final TriLabelSliderModel copy(float lowerBound, Float centerBound, float upperBound, String startLabel, String centerLabel, String endLabel, float sliderValue, int barThickness, String barStyle) {
        AbstractC22676k.m65750j(startLabel, "startLabel");
        AbstractC22676k.m65750j(endLabel, "endLabel");
        AbstractC22676k.m65750j(barStyle, "barStyle");
        return new TriLabelSliderModel(lowerBound, centerBound, upperBound, startLabel, centerLabel, endLabel, sliderValue, barThickness, barStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TriLabelSliderModel)) {
            return false;
        }
        TriLabelSliderModel triLabelSliderModel = (TriLabelSliderModel) other;
        return Float.compare(this.lowerBound, triLabelSliderModel.lowerBound) == 0 && AbstractC22676k.m65745e(this.centerBound, triLabelSliderModel.centerBound) && Float.compare(this.upperBound, triLabelSliderModel.upperBound) == 0 && AbstractC22676k.m65745e(this.startLabel, triLabelSliderModel.startLabel) && AbstractC22676k.m65745e(this.centerLabel, triLabelSliderModel.centerLabel) && AbstractC22676k.m65745e(this.endLabel, triLabelSliderModel.endLabel) && Float.compare(this.sliderValue, triLabelSliderModel.sliderValue) == 0 && this.barThickness == triLabelSliderModel.barThickness && AbstractC22676k.m65745e(this.barStyle, triLabelSliderModel.barStyle);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    public final String getBarStyle() {
        return this.barStyle;
    }

    public final int getBarThickness() {
        return this.barThickness;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final Float getCenterBound() {
        return this.centerBound;
    }

    public final String getCenterLabel() {
        return this.centerLabel;
    }

    public final String getEndLabel() {
        return this.endLabel;
    }

    public final float getLowerBound() {
        return this.lowerBound;
    }

    public final float getSliderValue() {
        return this.sliderValue;
    }

    public final String getStartLabel() {
        return this.startLabel;
    }

    public final float getUpperBound() {
        return this.upperBound;
    }

    public int hashCode() {
        int iHashCode = Float.hashCode(this.lowerBound) * 31;
        Float f13 = this.centerBound;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30447a(this.upperBound, (iHashCode + (f13 == null ? 0 : f13.hashCode())) * 31, 31), 31, this.startLabel);
        String str = this.centerLabel;
        return this.barStyle.hashCode() + AbstractC11266d.m30448b(this.barThickness, AbstractC11266d.m30447a(this.sliderValue, AbstractC11266d.m30450d((iM30450d + (str != null ? str.hashCode() : 0)) * 31, 31, this.endLabel), 31), 31);
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
        float f13 = this.lowerBound;
        Float f14 = this.centerBound;
        float f15 = this.upperBound;
        String str = this.startLabel;
        String str2 = this.centerLabel;
        String str3 = this.endLabel;
        float f16 = this.sliderValue;
        int i13 = this.barThickness;
        String str4 = this.barStyle;
        StringBuilder sb4 = new StringBuilder("TriLabelSliderModel(lowerBound=");
        sb4.append(f13);
        sb4.append(", centerBound=");
        sb4.append(f14);
        sb4.append(", upperBound=");
        sb4.append(f15);
        sb4.append(", startLabel=");
        sb4.append(str);
        sb4.append(", centerLabel=");
        AbstractC11266d.m30444B(sb4, str2, ", endLabel=", str3, ", sliderValue=");
        sb4.append(f16);
        sb4.append(", barThickness=");
        sb4.append(i13);
        sb4.append(", barStyle=");
        return AbstractC25012a.m73376i(str4, ")", sb4);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public TriLabelSliderModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return TriLabelSliderModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    public /* synthetic */ TriLabelSliderModel(int i13, float f13, Float f14, float f15, String str, String str2, String str3, float f16, int i14, String str4, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, TriLabelSliderModel$$serializer.INSTANCE.getDescriptor());
        }
        this.lowerBound = f13;
        this.centerBound = f14;
        this.upperBound = f15;
        this.startLabel = str;
        this.centerLabel = str2;
        this.endLabel = str3;
        this.sliderValue = f16;
        if ((i13 & 128) == 0) {
            this.barThickness = 8;
        } else {
            this.barThickness = i14;
        }
        if ((i13 & 256) == 0) {
            this.barStyle = "STRAIN_GRADIENT";
        } else {
            this.barStyle = str4;
        }
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

    public /* synthetic */ TriLabelSliderModel(float f13, Float f14, float f15, String str, String str2, String str3, float f16, int i13, String str4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, f15, str, str2, str3, f16, (i14 & 128) != 0 ? 8 : i13, (i14 & 256) != 0 ? "STRAIN_GRADIENT" : str4);
    }
}
