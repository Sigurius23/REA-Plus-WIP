package com.whoop.weightlifting.feature.onerepmax.manualentry.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xo1.C38492a;
import xv2.AbstractC38670a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0002PQBt\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012+\b\u0002\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013¢\u0006\u0004\b\u0015\u0010\u0016By\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ'\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J#\u0010'\u001a\u00020\u00002\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020%0\rH\u0016¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b1\u00102J\u001e\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b3\u00104J3\u00105\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013HÆ\u0003¢\u0006\u0004\b5\u00104J\u0087\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2+\b\u0002\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b8\u0010*J\u0010\u00109\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\b@\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bB\u0010,R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bD\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bF\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010G\u001a\u0004\bH\u00102R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010I\u001a\u0004\bJ\u00104\"\u0004\bK\u0010LRE\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010I\u001a\u0004\bM\u00104\"\u0004\bN\u0010L¨\u0006R"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;", "exerciseSummary", "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;", "dateSection", "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;", "valueSection", "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;", "footer", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;Lzc3/c;Lyc3/g;)V", "write$Self", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;", "component3", "()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;", "component4", "()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;", "component5", "()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;", "component6", "()Ljava/util/Map;", "component7", "copy", "(Ljava/lang/String;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;", "getExerciseSummary", "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;", "getDateSection", "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;", "getValueSection", "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;", "getFooter", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OneRepMaxMeasurementModel implements DesignSystemModel, WithGeneratedBindings {
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final OneRepMaxDateSection dateSection;
    private final OneRepMaxExerciseSummary exerciseSummary;
    private final OneRepMaxFooter footer;
    private final String id;
    private final OneRepMaxValueSection valueSection;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C38492a(14)), null};

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.onerepmax.manualentry.models.OneRepMaxMeasurementModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OneRepMaxMeasurementModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ OneRepMaxMeasurementModel(int i13, String str, OneRepMaxExerciseSummary oneRepMaxExerciseSummary, OneRepMaxDateSection oneRepMaxDateSection, OneRepMaxValueSection oneRepMaxValueSection, OneRepMaxFooter oneRepMaxFooter, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, OneRepMaxMeasurementModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.exerciseSummary = oneRepMaxExerciseSummary;
        this.dateSection = oneRepMaxDateSection;
        this.valueSection = oneRepMaxValueSection;
        this.footer = oneRepMaxFooter;
        if ((i13 & 32) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 64) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OneRepMaxMeasurementModel copy$default(OneRepMaxMeasurementModel oneRepMaxMeasurementModel, String str, OneRepMaxExerciseSummary oneRepMaxExerciseSummary, OneRepMaxDateSection oneRepMaxDateSection, OneRepMaxValueSection oneRepMaxValueSection, OneRepMaxFooter oneRepMaxFooter, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = oneRepMaxMeasurementModel.id;
        }
        if ((i13 & 2) != 0) {
            oneRepMaxExerciseSummary = oneRepMaxMeasurementModel.exerciseSummary;
        }
        if ((i13 & 4) != 0) {
            oneRepMaxDateSection = oneRepMaxMeasurementModel.dateSection;
        }
        if ((i13 & 8) != 0) {
            oneRepMaxValueSection = oneRepMaxMeasurementModel.valueSection;
        }
        if ((i13 & 16) != 0) {
            oneRepMaxFooter = oneRepMaxMeasurementModel.footer;
        }
        if ((i13 & 32) != 0) {
            map = oneRepMaxMeasurementModel.bindings;
        }
        if ((i13 & 64) != 0) {
            map2 = oneRepMaxMeasurementModel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        OneRepMaxFooter oneRepMaxFooter2 = oneRepMaxFooter;
        OneRepMaxDateSection oneRepMaxDateSection2 = oneRepMaxDateSection;
        return oneRepMaxMeasurementModel.copy(str, oneRepMaxExerciseSummary, oneRepMaxDateSection2, oneRepMaxValueSection, oneRepMaxFooter2, map3, map4);
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(OneRepMaxMeasurementModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, OneRepMaxExerciseSummary$$serializer.INSTANCE, self.exerciseSummary);
        output.encodeSerializableElement(serialDesc, 2, OneRepMaxDateSection$$serializer.INSTANCE, self.dateSection);
        output.encodeSerializableElement(serialDesc, 3, OneRepMaxValueSection$$serializer.INSTANCE, self.valueSection);
        output.encodeSerializableElement(serialDesc, 4, OneRepMaxFooter$$serializer.INSTANCE, self.footer);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public /* bridge */ /* synthetic */ WithGeneratedBindings bind(Map map) {
        return bind((Map<String, ? extends Object>) map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OneRepMaxExerciseSummary getExerciseSummary() {
        return this.exerciseSummary;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OneRepMaxDateSection getDateSection() {
        return this.dateSection;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OneRepMaxValueSection getValueSection() {
        return this.valueSection;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OneRepMaxFooter getFooter() {
        return this.footer;
    }

    public final Map<String, String> component6() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component7() {
        return this.aggregateBindings;
    }

    public final OneRepMaxMeasurementModel copy(String id4, OneRepMaxExerciseSummary exerciseSummary, OneRepMaxDateSection dateSection, OneRepMaxValueSection valueSection, OneRepMaxFooter footer, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(exerciseSummary, "exerciseSummary");
        AbstractC22676k.m65750j(dateSection, "dateSection");
        AbstractC22676k.m65750j(valueSection, "valueSection");
        AbstractC22676k.m65750j(footer, "footer");
        return new OneRepMaxMeasurementModel(id4, exerciseSummary, dateSection, valueSection, footer, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneRepMaxMeasurementModel)) {
            return false;
        }
        OneRepMaxMeasurementModel oneRepMaxMeasurementModel = (OneRepMaxMeasurementModel) other;
        return AbstractC22676k.m65745e(this.id, oneRepMaxMeasurementModel.id) && AbstractC22676k.m65745e(this.exerciseSummary, oneRepMaxMeasurementModel.exerciseSummary) && AbstractC22676k.m65745e(this.dateSection, oneRepMaxMeasurementModel.dateSection) && AbstractC22676k.m65745e(this.valueSection, oneRepMaxMeasurementModel.valueSection) && AbstractC22676k.m65745e(this.footer, oneRepMaxMeasurementModel.footer) && AbstractC22676k.m65745e(this.bindings, oneRepMaxMeasurementModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, oneRepMaxMeasurementModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final OneRepMaxDateSection getDateSection() {
        return this.dateSection;
    }

    public final OneRepMaxExerciseSummary getExerciseSummary() {
        return this.exerciseSummary;
    }

    public final OneRepMaxFooter getFooter() {
        return this.footer;
    }

    public final String getId() {
        return this.id;
    }

    public final OneRepMaxValueSection getValueSection() {
        return this.valueSection;
    }

    public int hashCode() {
        int iHashCode = (this.footer.hashCode() + ((this.valueSection.hashCode() + ((this.dateSection.hashCode() + ((this.exerciseSummary.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        Map<String, String> map = this.bindings;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
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
        String str = this.id;
        OneRepMaxExerciseSummary oneRepMaxExerciseSummary = this.exerciseSummary;
        OneRepMaxDateSection oneRepMaxDateSection = this.dateSection;
        OneRepMaxValueSection oneRepMaxValueSection = this.valueSection;
        OneRepMaxFooter oneRepMaxFooter = this.footer;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sb4 = new StringBuilder("OneRepMaxMeasurementModel(id=");
        sb4.append(str);
        sb4.append(", exerciseSummary=");
        sb4.append(oneRepMaxExerciseSummary);
        sb4.append(", dateSection=");
        sb4.append(oneRepMaxDateSection);
        sb4.append(", valueSection=");
        sb4.append(oneRepMaxValueSection);
        sb4.append(", footer=");
        sb4.append(oneRepMaxFooter);
        sb4.append(", bindings=");
        sb4.append(map);
        sb4.append(", aggregateBindings=");
        return AbstractC13673n.m38565l(sb4, map2, ")");
    }

    public OneRepMaxMeasurementModel(String id4, OneRepMaxExerciseSummary exerciseSummary, OneRepMaxDateSection dateSection, OneRepMaxValueSection valueSection, OneRepMaxFooter footer, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(exerciseSummary, "exerciseSummary");
        AbstractC22676k.m65750j(dateSection, "dateSection");
        AbstractC22676k.m65750j(valueSection, "valueSection");
        AbstractC22676k.m65750j(footer, "footer");
        this.id = id4;
        this.exerciseSummary = exerciseSummary;
        this.dateSection = dateSection;
        this.valueSection = valueSection;
        this.footer = footer;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public OneRepMaxMeasurementModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return AbstractC38670a.m124018a(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    public /* synthetic */ OneRepMaxMeasurementModel(String str, OneRepMaxExerciseSummary oneRepMaxExerciseSummary, OneRepMaxDateSection oneRepMaxDateSection, OneRepMaxValueSection oneRepMaxValueSection, OneRepMaxFooter oneRepMaxFooter, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, oneRepMaxExerciseSummary, oneRepMaxDateSection, oneRepMaxValueSection, oneRepMaxFooter, (i13 & 32) != 0 ? null : map, (i13 & 64) != 0 ? null : map2);
    }
}
