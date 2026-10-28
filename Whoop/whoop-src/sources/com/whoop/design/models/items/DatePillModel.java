package com.whoop.design.models.items;

import androidx.core.app.NotificationCompat;
import com.mapbox.common.HttpHeaders;
import com.whoop.design.models.DateDisplay;
import com.whoop.design.models.DateDisplay$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import w91.C36956c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 V2\u00020\u00012\u00020\u0002:\u0002WVB\u0090\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012+\b\u0002\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u008b\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ#\u0010!\u001a\u00020\u00022\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f0\u0010H\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b.\u0010/J\u001e\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b0\u00101J3\u00102\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u0016HÆ\u0003¢\u0006\u0004\b2\u00101J¡\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102+\b\u0002\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u0016HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b5\u0010$J\u0010\u00106\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u00109\u001a\u00020\b2\b\u00108\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b9\u0010:J'\u0010C\u001a\u00020@2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0001¢\u0006\u0004\bA\u0010BR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010D\u001a\u0004\bE\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bF\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010G\u001a\u0004\bH\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010I\u001a\u0004\b\t\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010J\u001a\u0004\bK\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010L\u001a\u0004\bM\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010N\u001a\u0004\bO\u0010/R0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010P\u001a\u0004\bQ\u00101\"\u0004\bR\u0010SRE\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010P\u001a\u0004\bT\u00101\"\u0004\bU\u0010S¨\u0006X"}, m65681d2 = {"Lcom/whoop/design/models/items/DatePillModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", HttpHeaders.DATE, "Lcom/whoop/design/models/DateDisplay;", "display", "", "isSelected", "Lcom/whoop/design/models/items/DatePillStatus;", NotificationCompat.CATEGORY_STATUS, "Ly81/f;", "selectedColor", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;ZLcom/whoop/design/models/items/DatePillStatus;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;ZLcom/whoop/design/models/items/DatePillStatus;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/DateDisplay;", "component4", "()Z", "component5", "()Lcom/whoop/design/models/items/DatePillStatus;", "component6", "()Ly81/f;", "component7", "()Lcom/whoop/navigation/models/GenericInteraction;", "component8", "()Ljava/util/Map;", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;ZLcom/whoop/design/models/items/DatePillStatus;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/DatePillModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/DatePillModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getDate", "Lcom/whoop/design/models/DateDisplay;", "getDisplay", "Z", "Lcom/whoop/design/models/items/DatePillStatus;", "getStatus", "Ly81/f;", "getSelectedColor", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DatePillModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final String date;
    private final DateDisplay display;
    private final String id;
    private final GenericInteraction interaction;
    private final boolean isSelected;
    private final EnumC39333f selectedColor;
    private final DatePillStatus status;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/DatePillModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/DatePillModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DatePillModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36956c(7)), AbstractC30060g.m92087G(enumC23463i, new C36956c(8)), null, AbstractC30060g.m92087G(enumC23463i, new C36956c(9)), null};
    }

    public /* synthetic */ DatePillModel(int i13, String str, String str2, DateDisplay dateDisplay, boolean z4, DatePillStatus datePillStatus, EnumC39333f enumC39333f, GenericInteraction genericInteraction, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (29 != (i13 & 29)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 29, DatePillModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        if ((i13 & 2) == 0) {
            this.date = null;
        } else {
            this.date = str2;
        }
        this.display = dateDisplay;
        this.isSelected = z4;
        this.status = datePillStatus;
        if ((i13 & 32) == 0) {
            this.selectedColor = null;
        } else {
            this.selectedColor = enumC39333f;
        }
        if ((i13 & 64) == 0) {
            this.interaction = null;
        } else {
            this.interaction = genericInteraction;
        }
        if ((i13 & 128) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 256) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.DatePillStatus", DatePillStatus.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DatePillModel copy$default(DatePillModel datePillModel, String str, String str2, DateDisplay dateDisplay, boolean z4, DatePillStatus datePillStatus, EnumC39333f enumC39333f, GenericInteraction genericInteraction, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = datePillModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = datePillModel.date;
        }
        if ((i13 & 4) != 0) {
            dateDisplay = datePillModel.display;
        }
        if ((i13 & 8) != 0) {
            z4 = datePillModel.isSelected;
        }
        if ((i13 & 16) != 0) {
            datePillStatus = datePillModel.status;
        }
        if ((i13 & 32) != 0) {
            enumC39333f = datePillModel.selectedColor;
        }
        if ((i13 & 64) != 0) {
            genericInteraction = datePillModel.interaction;
        }
        if ((i13 & 128) != 0) {
            map = datePillModel.bindings;
        }
        if ((i13 & 256) != 0) {
            map2 = datePillModel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        EnumC39333f enumC39333f2 = enumC39333f;
        GenericInteraction genericInteraction2 = genericInteraction;
        DatePillStatus datePillStatus2 = datePillStatus;
        DateDisplay dateDisplay2 = dateDisplay;
        return datePillModel.copy(str, str2, dateDisplay2, z4, datePillStatus2, enumC39333f2, genericInteraction2, map3, map4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(DatePillModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.date != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.date);
        }
        output.encodeSerializableElement(serialDesc, 2, DateDisplay$$serializer.INSTANCE, self.display);
        output.encodeBooleanElement(serialDesc, 3, self.isSelected);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.status);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.selectedColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.selectedColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.interaction != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, GenericInteraction$$serializer.INSTANCE, self.interaction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public WithGeneratedBindings bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return DatePillModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DateDisplay getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DatePillStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final EnumC39333f getSelectedColor() {
        return this.selectedColor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final Map<String, String> component8() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component9() {
        return this.aggregateBindings;
    }

    public final DatePillModel copy(String id4, String date, DateDisplay display, boolean isSelected, DatePillStatus status, EnumC39333f selectedColor, GenericInteraction interaction, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(display, "display");
        AbstractC22676k.m65750j(status, "status");
        return new DatePillModel(id4, date, display, isSelected, status, selectedColor, interaction, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DatePillModel)) {
            return false;
        }
        DatePillModel datePillModel = (DatePillModel) other;
        return AbstractC22676k.m65745e(this.id, datePillModel.id) && AbstractC22676k.m65745e(this.date, datePillModel.date) && AbstractC22676k.m65745e(this.display, datePillModel.display) && this.isSelected == datePillModel.isSelected && this.status == datePillModel.status && this.selectedColor == datePillModel.selectedColor && AbstractC22676k.m65745e(this.interaction, datePillModel.interaction) && AbstractC22676k.m65745e(this.bindings, datePillModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, datePillModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final String getDate() {
        return this.date;
    }

    public final DateDisplay getDisplay() {
        return this.display;
    }

    public final String getId() {
        return this.id;
    }

    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final EnumC39333f getSelectedColor() {
        return this.selectedColor;
    }

    public final DatePillStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.date;
        int iHashCode2 = (this.status.hashCode() + AbstractC2875y.m8289b((this.display.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.isSelected)) * 31;
        EnumC39333f enumC39333f = this.selectedColor;
        int iHashCode3 = (iHashCode2 + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31;
        GenericInteraction genericInteraction = this.interaction;
        int iHashCode4 = (iHashCode3 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        Map<String, String> map = this.bindings;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode5 + (map2 != null ? map2.hashCode() : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
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
        String str2 = this.date;
        DateDisplay dateDisplay = this.display;
        boolean z4 = this.isSelected;
        DatePillStatus datePillStatus = this.status;
        EnumC39333f enumC39333f = this.selectedColor;
        GenericInteraction genericInteraction = this.interaction;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DatePillModel(id=", str, ", date=", str2, ", display=");
        sbM32001t.append(dateDisplay);
        sbM32001t.append(", isSelected=");
        sbM32001t.append(z4);
        sbM32001t.append(", status=");
        sbM32001t.append(datePillStatus);
        sbM32001t.append(", selectedColor=");
        sbM32001t.append(enumC39333f);
        sbM32001t.append(", interaction=");
        sbM32001t.append(genericInteraction);
        sbM32001t.append(", bindings=");
        sbM32001t.append(map);
        sbM32001t.append(", aggregateBindings=");
        return AbstractC13673n.m38565l(sbM32001t, map2, ")");
    }

    public DatePillModel(String id4, String str, DateDisplay display, boolean z4, DatePillStatus status, EnumC39333f enumC39333f, GenericInteraction genericInteraction, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(display, "display");
        AbstractC22676k.m65750j(status, "status");
        this.id = id4;
        this.date = str;
        this.display = display;
        this.isSelected = z4;
        this.status = status;
        this.selectedColor = enumC39333f;
        this.interaction = genericInteraction;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    public /* synthetic */ DatePillModel(String str, String str2, DateDisplay dateDisplay, boolean z4, DatePillStatus datePillStatus, EnumC39333f enumC39333f, GenericInteraction genericInteraction, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, dateDisplay, z4, datePillStatus, (i13 & 32) != 0 ? null : enumC39333f, (i13 & 64) != 0 ? null : genericInteraction, (i13 & 128) != 0 ? null : map, (i13 & 256) != 0 ? null : map2);
    }
}
