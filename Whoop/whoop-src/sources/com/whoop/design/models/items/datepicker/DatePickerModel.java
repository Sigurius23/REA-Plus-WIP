package com.whoop.design.models.items.datepicker;

import bo2.C3509a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 V2\u00020\u00012\u00020\u0002:\u0002WVB_\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011B\u0097\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0010\u0010\u001aJ#\u0010\u001d\u001a\u00020\u00012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b)\u0010 J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b,\u0010 Jv\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b>\u0010 R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b?\u0010 R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\b@\u0010 R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\bA\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\b\u000b\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\bE\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bG\u0010+R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010=\u0012\u0004\bI\u0010J\u001a\u0004\bH\u0010 R0\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010ORE\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014j\u0004\u0018\u0001`P¢\u0006\f\bQ\u0012\b\bR\u0012\u0004\b\t0S8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010K\u001a\u0004\bT\u0010M\"\u0004\bU\u0010O¨\u0006X"}, m65681d2 = {"Lcom/whoop/design/models/items/datepicker/DatePickerModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "selectedDate", "minimumDate", "maximumDate", "Lcom/whoop/design/models/items/datepicker/ValidDateRange;", "validDateRange", "", "isDisabled", "stateUpdateValueKey", "Lcom/whoop/design/models/items/datepicker/DateStateUpdateFormat;", "stateDateFormat", "stateSelectedDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/datepicker/ValidDateRange;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/datepicker/DateStateUpdateFormat;Ljava/lang/String;)V", "", "seen0", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/datepicker/ValidDateRange;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/datepicker/DateStateUpdateFormat;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "toString", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "()Lcom/whoop/design/models/items/datepicker/ValidDateRange;", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "()Lcom/whoop/design/models/items/datepicker/DateStateUpdateFormat;", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/datepicker/ValidDateRange;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/datepicker/DateStateUpdateFormat;Ljava/lang/String;)Lcom/whoop/design/models/items/datepicker/DatePickerModel;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/datepicker/DatePickerModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getSelectedDate", "getMinimumDate", "getMaximumDate", "Lcom/whoop/design/models/items/datepicker/ValidDateRange;", "getValidDateRange", "Ljava/lang/Boolean;", "getStateUpdateValueKey", "Lcom/whoop/design/models/items/datepicker/DateStateUpdateFormat;", "getStateDateFormat", "getStateSelectedDate", "getStateSelectedDate$annotations", "()V", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DatePickerModel implements WithGeneratedBindings, DesignSystemModel {
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final String id;
    private final Boolean isDisabled;
    private final String maximumDate;
    private final String minimumDate;
    private final String selectedDate;
    private final DateStateUpdateFormat stateDateFormat;
    private final String stateSelectedDate;
    private final String stateUpdateValueKey;
    private final ValidDateRange validDateRange;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C3509a(29)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/datepicker/DatePickerModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/datepicker/DatePickerModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DatePickerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DatePickerModel(int i13, String str, String str2, String str3, String str4, ValidDateRange validDateRange, Boolean bool, String str5, DateStateUpdateFormat dateStateUpdateFormat, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (239 != (i13 & 239)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 239, DatePickerModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.selectedDate = str2;
        this.minimumDate = str3;
        this.maximumDate = str4;
        if ((i13 & 16) == 0) {
            this.validDateRange = null;
        } else {
            this.validDateRange = validDateRange;
        }
        this.isDisabled = bool;
        this.stateUpdateValueKey = str5;
        this.stateDateFormat = dateStateUpdateFormat;
        this.stateSelectedDate = null;
        if ((i13 & 256) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 512) == 0) {
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

    public static /* synthetic */ DatePickerModel copy$default(DatePickerModel datePickerModel, String str, String str2, String str3, String str4, ValidDateRange validDateRange, Boolean bool, String str5, DateStateUpdateFormat dateStateUpdateFormat, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = datePickerModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = datePickerModel.selectedDate;
        }
        if ((i13 & 4) != 0) {
            str3 = datePickerModel.minimumDate;
        }
        if ((i13 & 8) != 0) {
            str4 = datePickerModel.maximumDate;
        }
        if ((i13 & 16) != 0) {
            validDateRange = datePickerModel.validDateRange;
        }
        if ((i13 & 32) != 0) {
            bool = datePickerModel.isDisabled;
        }
        if ((i13 & 64) != 0) {
            str5 = datePickerModel.stateUpdateValueKey;
        }
        if ((i13 & 128) != 0) {
            dateStateUpdateFormat = datePickerModel.stateDateFormat;
        }
        if ((i13 & 256) != 0) {
            str6 = datePickerModel.stateSelectedDate;
        }
        DateStateUpdateFormat dateStateUpdateFormat2 = dateStateUpdateFormat;
        String str7 = str6;
        Boolean bool2 = bool;
        String str8 = str5;
        ValidDateRange validDateRange2 = validDateRange;
        String str9 = str3;
        return datePickerModel.copy(str, str2, str9, str4, validDateRange2, bool2, str8, dateStateUpdateFormat2, str7);
    }

    public static /* synthetic */ void getStateSelectedDate$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(DatePickerModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.id);
        output.encodeStringElement(serialDesc, 1, self.selectedDate);
        output.encodeStringElement(serialDesc, 2, self.minimumDate);
        output.encodeStringElement(serialDesc, 3, self.maximumDate);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.validDateRange != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, ValidDateRange$$serializer.INSTANCE, self.validDateRange);
        }
        output.encodeNullableSerializableElement(serialDesc, 5, BooleanSerializer.INSTANCE, self.isDisabled);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.stateUpdateValueKey);
        output.encodeNullableSerializableElement(serialDesc, 7, DateStateUpdateFormat$$serializer.INSTANCE, self.stateDateFormat);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public WithGeneratedBindings bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        DatePickerModel datePickerModelGeneratedBind = DatePickerModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
        String str = this.stateUpdateValueKey;
        String str2 = null;
        if (str != null) {
            Object obj = accumulatedState.get(str);
            if (obj instanceof String) {
                str2 = (String) obj;
            }
        }
        return copy$default(datePickerModelGeneratedBind, null, null, null, null, null, null, null, null, str2, 255, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSelectedDate() {
        return this.selectedDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMinimumDate() {
        return this.minimumDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMaximumDate() {
        return this.maximumDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ValidDateRange getValidDateRange() {
        return this.validDateRange;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsDisabled() {
        return this.isDisabled;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStateUpdateValueKey() {
        return this.stateUpdateValueKey;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DateStateUpdateFormat getStateDateFormat() {
        return this.stateDateFormat;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStateSelectedDate() {
        return this.stateSelectedDate;
    }

    public final DatePickerModel copy(String id4, String selectedDate, String minimumDate, String maximumDate, ValidDateRange validDateRange, Boolean isDisabled, String stateUpdateValueKey, DateStateUpdateFormat stateDateFormat, String stateSelectedDate) {
        AbstractC22676k.m65750j(selectedDate, "selectedDate");
        AbstractC22676k.m65750j(minimumDate, "minimumDate");
        AbstractC22676k.m65750j(maximumDate, "maximumDate");
        return new DatePickerModel(id4, selectedDate, minimumDate, maximumDate, validDateRange, isDisabled, stateUpdateValueKey, stateDateFormat, stateSelectedDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DatePickerModel)) {
            return false;
        }
        DatePickerModel datePickerModel = (DatePickerModel) other;
        return AbstractC22676k.m65745e(this.id, datePickerModel.id) && AbstractC22676k.m65745e(this.selectedDate, datePickerModel.selectedDate) && AbstractC22676k.m65745e(this.minimumDate, datePickerModel.minimumDate) && AbstractC22676k.m65745e(this.maximumDate, datePickerModel.maximumDate) && AbstractC22676k.m65745e(this.validDateRange, datePickerModel.validDateRange) && AbstractC22676k.m65745e(this.isDisabled, datePickerModel.isDisabled) && AbstractC22676k.m65745e(this.stateUpdateValueKey, datePickerModel.stateUpdateValueKey) && AbstractC22676k.m65745e(this.stateDateFormat, datePickerModel.stateDateFormat) && AbstractC22676k.m65745e(this.stateSelectedDate, datePickerModel.stateSelectedDate);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMaximumDate() {
        return this.maximumDate;
    }

    public final String getMinimumDate() {
        return this.minimumDate;
    }

    public final String getSelectedDate() {
        return this.selectedDate;
    }

    public final DateStateUpdateFormat getStateDateFormat() {
        return this.stateDateFormat;
    }

    public final String getStateSelectedDate() {
        return this.stateSelectedDate;
    }

    public final String getStateUpdateValueKey() {
        return this.stateUpdateValueKey;
    }

    public final ValidDateRange getValidDateRange() {
        return this.validDateRange;
    }

    public int hashCode() {
        String str = this.id;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.selectedDate), 31, this.minimumDate), 31, this.maximumDate);
        ValidDateRange validDateRange = this.validDateRange;
        int iHashCode = (iM30450d + (validDateRange == null ? 0 : validDateRange.hashCode())) * 31;
        Boolean bool = this.isDisabled;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.stateUpdateValueKey;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DateStateUpdateFormat dateStateUpdateFormat = this.stateDateFormat;
        int iHashCode4 = (iHashCode3 + (dateStateUpdateFormat == null ? 0 : dateStateUpdateFormat.hashCode())) * 31;
        String str3 = this.stateSelectedDate;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Boolean isDisabled() {
        return this.isDisabled;
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
        String str2 = this.minimumDate;
        String str3 = this.maximumDate;
        ValidDateRange validDateRange = this.validDateRange;
        Boolean bool = this.isDisabled;
        String str4 = this.stateUpdateValueKey;
        DateStateUpdateFormat dateStateUpdateFormat = this.stateDateFormat;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DatePickerModel(id=", str, ", selectedDate=REDACTED, minimumDate=", str2, ", maximumDate=");
        sbM32001t.append(str3);
        sbM32001t.append(", validDateRange=");
        sbM32001t.append(validDateRange);
        sbM32001t.append(", isDisabled=");
        AbstractC13673n.m38576w(bool, ", stateUpdateValueKey=", str4, ", stateDateFormat=", sbM32001t);
        sbM32001t.append(dateStateUpdateFormat);
        sbM32001t.append(", stateSelectedDate=REDACTED)");
        return sbM32001t.toString();
    }

    public DatePickerModel(String str, String selectedDate, String minimumDate, String maximumDate, ValidDateRange validDateRange, Boolean bool, String str2, DateStateUpdateFormat dateStateUpdateFormat, String str3) {
        AbstractC22676k.m65750j(selectedDate, "selectedDate");
        AbstractC22676k.m65750j(minimumDate, "minimumDate");
        AbstractC22676k.m65750j(maximumDate, "maximumDate");
        this.id = str;
        this.selectedDate = selectedDate;
        this.minimumDate = minimumDate;
        this.maximumDate = maximumDate;
        this.validDateRange = validDateRange;
        this.isDisabled = bool;
        this.stateUpdateValueKey = str2;
        this.stateDateFormat = dateStateUpdateFormat;
        this.stateSelectedDate = str3;
    }

    public /* synthetic */ DatePickerModel(String str, String str2, String str3, String str4, ValidDateRange validDateRange, Boolean bool, String str5, DateStateUpdateFormat dateStateUpdateFormat, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i13 & 16) != 0 ? null : validDateRange, bool, str5, dateStateUpdateFormat, (i13 & 256) != 0 ? null : str6);
    }
}
