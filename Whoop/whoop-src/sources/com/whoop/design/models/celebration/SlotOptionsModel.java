package com.whoop.design.models.celebration;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j93.InterfaceC21461d;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import ty1.C34260e;
import u91.C34656a;
import wc3.C37142g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0006\u0012\u0013\u0014\u0015\u0016\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/design/models/celebration/SlotOptionsModel;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/whoop/design/models/celebration/SlotOptionsModel;Lzc3/c;Lyc3/g;)V", "Companion", "CumulativeOptionsModel", "ExclusiveOptionsModel", "BooleanOptionsModel", "GroupedCumulativeOptionsModel", "UnknownOptionsModel", "Lcom/whoop/design/models/celebration/SlotOptionsModel$BooleanOptionsModel;", "Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;", "Lcom/whoop/design/models/celebration/SlotOptionsModel$ExclusiveOptionsModel;", "Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;", "Lcom/whoop/design/models/celebration/SlotOptionsModel$UnknownOptionsModel;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public abstract class SlotOptionsModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C34260e(27));

    @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006+"}, m65681d2 = {"Lcom/whoop/design/models/celebration/SlotOptionsModel$BooleanOptionsModel;", "Lcom/whoop/design/models/celebration/SlotOptionsModel;", "", "", "layers", "", "value", "<init>", "(Ljava/util/List;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/celebration/SlotOptionsModel$BooleanOptionsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Z", "copy", "(Ljava/util/List;Z)Lcom/whoop/design/models/celebration/SlotOptionsModel$BooleanOptionsModel;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getLayers", "Z", "getValue", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class BooleanOptionsModel extends SlotOptionsModel {
        private final List<String> layers;
        private final boolean value;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C34260e(28)), null};

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/celebration/SlotOptionsModel$BooleanOptionsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/celebration/SlotOptionsModel$BooleanOptionsModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return SlotOptionsModel$BooleanOptionsModel$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BooleanOptionsModel(int i13, List list, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
            super(i13, serializationConstructorMarker);
            if (3 != (i13 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 3, SlotOptionsModel$BooleanOptionsModel$$serializer.INSTANCE.getDescriptor());
            }
            this.layers = list;
            this.value = z4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BooleanOptionsModel copy$default(BooleanOptionsModel booleanOptionsModel, List list, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = booleanOptionsModel.layers;
            }
            if ((i13 & 2) != 0) {
                z4 = booleanOptionsModel.value;
            }
            return booleanOptionsModel.copy(list, z4);
        }

        public static final /* synthetic */ void write$Self$design_models_release(BooleanOptionsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            SlotOptionsModel.write$Self(self, output, serialDesc);
            output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.layers);
            output.encodeBooleanElement(serialDesc, 1, self.value);
        }

        public final List<String> component1() {
            return this.layers;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getValue() {
            return this.value;
        }

        public final BooleanOptionsModel copy(List<String> layers, boolean value) {
            return new BooleanOptionsModel(layers, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BooleanOptionsModel)) {
                return false;
            }
            BooleanOptionsModel booleanOptionsModel = (BooleanOptionsModel) other;
            return AbstractC22676k.m65745e(this.layers, booleanOptionsModel.layers) && this.value == booleanOptionsModel.value;
        }

        public final List<String> getLayers() {
            return this.layers;
        }

        public final boolean getValue() {
            return this.value;
        }

        public int hashCode() {
            List<String> list = this.layers;
            return Boolean.hashCode(this.value) + ((list == null ? 0 : list.hashCode()) * 31);
        }

        public String toString() {
            return "BooleanOptionsModel(layers=" + this.layers + ", value=" + this.value + ")";
        }

        public BooleanOptionsModel(List<String> list, boolean z4) {
            super(null);
            this.layers = list;
            this.value = z4;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/celebration/SlotOptionsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/celebration/SlotOptionsModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
            return (InterfaceC37138c) SlotOptionsModel.$cachedSerializer$delegate.getValue();
        }

        public final InterfaceC37138c serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0019J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001cR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001e¨\u00061"}, m65681d2 = {"Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;", "Lcom/whoop/design/models/celebration/SlotOptionsModel;", "", "max", "selected", "", "layerPattern", "", "baseLayers", "<init>", "(IILjava/lang/String;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "copy", "(IILjava/lang/String;Ljava/util/List;)Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMax", "getSelected", "Ljava/lang/String;", "getLayerPattern", "Ljava/util/List;", "getBaseLayers", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class CumulativeOptionsModel extends SlotOptionsModel {
        private final List<String> baseLayers;
        private final String layerPattern;
        private final int max;
        private final int selected;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C34260e(29))};

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return SlotOptionsModel$CumulativeOptionsModel$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CumulativeOptionsModel(int i13, int i14, int i15, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
            super(i13, serializationConstructorMarker);
            if (15 != (i13 & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 15, SlotOptionsModel$CumulativeOptionsModel$$serializer.INSTANCE.getDescriptor());
            }
            this.max = i14;
            this.selected = i15;
            this.layerPattern = str;
            this.baseLayers = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CumulativeOptionsModel copy$default(CumulativeOptionsModel cumulativeOptionsModel, int i13, int i14, String str, List list, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i13 = cumulativeOptionsModel.max;
            }
            if ((i15 & 2) != 0) {
                i14 = cumulativeOptionsModel.selected;
            }
            if ((i15 & 4) != 0) {
                str = cumulativeOptionsModel.layerPattern;
            }
            if ((i15 & 8) != 0) {
                list = cumulativeOptionsModel.baseLayers;
            }
            return cumulativeOptionsModel.copy(i13, i14, str, list);
        }

        public static final /* synthetic */ void write$Self$design_models_release(CumulativeOptionsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            SlotOptionsModel.write$Self(self, output, serialDesc);
            InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
            output.encodeIntElement(serialDesc, 0, self.max);
            output.encodeIntElement(serialDesc, 1, self.selected);
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.layerPattern);
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.baseLayers);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getSelected() {
            return this.selected;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getLayerPattern() {
            return this.layerPattern;
        }

        public final List<String> component4() {
            return this.baseLayers;
        }

        public final CumulativeOptionsModel copy(int max, int selected, String layerPattern, List<String> baseLayers) {
            return new CumulativeOptionsModel(max, selected, layerPattern, baseLayers);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CumulativeOptionsModel)) {
                return false;
            }
            CumulativeOptionsModel cumulativeOptionsModel = (CumulativeOptionsModel) other;
            return this.max == cumulativeOptionsModel.max && this.selected == cumulativeOptionsModel.selected && AbstractC22676k.m65745e(this.layerPattern, cumulativeOptionsModel.layerPattern) && AbstractC22676k.m65745e(this.baseLayers, cumulativeOptionsModel.baseLayers);
        }

        public final List<String> getBaseLayers() {
            return this.baseLayers;
        }

        public final String getLayerPattern() {
            return this.layerPattern;
        }

        public final int getMax() {
            return this.max;
        }

        public final int getSelected() {
            return this.selected;
        }

        public int hashCode() {
            int iM30448b = AbstractC11266d.m30448b(this.selected, Integer.hashCode(this.max) * 31, 31);
            String str = this.layerPattern;
            int iHashCode = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
            List<String> list = this.baseLayers;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            int i13 = this.max;
            int i14 = this.selected;
            return AbstractC30007c.m91840j(this.layerPattern, ", baseLayers=", ")", AbstractC11266d.m30465s(i13, i14, "CumulativeOptionsModel(max=", ", selected=", ", layerPattern="), this.baseLayers);
        }

        public CumulativeOptionsModel(int i13, int i14, String str, List<String> list) {
            super(null);
            this.max = i13;
            this.selected = i14;
            this.layerPattern = str;
            this.baseLayers = list;
        }
    }

    @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ0\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006+"}, m65681d2 = {"Lcom/whoop/design/models/celebration/SlotOptionsModel$ExclusiveOptionsModel;", "Lcom/whoop/design/models/celebration/SlotOptionsModel;", "", "max", "selected", "", "layerPattern", "<init>", "(IILjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/celebration/SlotOptionsModel$ExclusiveOptionsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "copy", "(IILjava/lang/String;)Lcom/whoop/design/models/celebration/SlotOptionsModel$ExclusiveOptionsModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMax", "getSelected", "Ljava/lang/String;", "getLayerPattern", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class ExclusiveOptionsModel extends SlotOptionsModel {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String layerPattern;
        private final int max;
        private final int selected;

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/celebration/SlotOptionsModel$ExclusiveOptionsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/celebration/SlotOptionsModel$ExclusiveOptionsModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return SlotOptionsModel$ExclusiveOptionsModel$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ExclusiveOptionsModel(int i13, int i14, int i15, String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(i13, serializationConstructorMarker);
            if (7 != (i13 & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 7, SlotOptionsModel$ExclusiveOptionsModel$$serializer.INSTANCE.getDescriptor());
            }
            this.max = i14;
            this.selected = i15;
            this.layerPattern = str;
        }

        public static /* synthetic */ ExclusiveOptionsModel copy$default(ExclusiveOptionsModel exclusiveOptionsModel, int i13, int i14, String str, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i13 = exclusiveOptionsModel.max;
            }
            if ((i15 & 2) != 0) {
                i14 = exclusiveOptionsModel.selected;
            }
            if ((i15 & 4) != 0) {
                str = exclusiveOptionsModel.layerPattern;
            }
            return exclusiveOptionsModel.copy(i13, i14, str);
        }

        public static final /* synthetic */ void write$Self$design_models_release(ExclusiveOptionsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            SlotOptionsModel.write$Self(self, output, serialDesc);
            output.encodeIntElement(serialDesc, 0, self.max);
            output.encodeIntElement(serialDesc, 1, self.selected);
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.layerPattern);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getSelected() {
            return this.selected;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getLayerPattern() {
            return this.layerPattern;
        }

        public final ExclusiveOptionsModel copy(int max, int selected, String layerPattern) {
            return new ExclusiveOptionsModel(max, selected, layerPattern);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExclusiveOptionsModel)) {
                return false;
            }
            ExclusiveOptionsModel exclusiveOptionsModel = (ExclusiveOptionsModel) other;
            return this.max == exclusiveOptionsModel.max && this.selected == exclusiveOptionsModel.selected && AbstractC22676k.m65745e(this.layerPattern, exclusiveOptionsModel.layerPattern);
        }

        public final String getLayerPattern() {
            return this.layerPattern;
        }

        public final int getMax() {
            return this.max;
        }

        public final int getSelected() {
            return this.selected;
        }

        public int hashCode() {
            int iM30448b = AbstractC11266d.m30448b(this.selected, Integer.hashCode(this.max) * 31, 31);
            String str = this.layerPattern;
            return iM30448b + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.layerPattern, ")", AbstractC11266d.m30465s(this.max, this.selected, "ExclusiveOptionsModel(max=", ", selected=", ", layerPattern="));
        }

        public ExclusiveOptionsModel(int i13, int i14, String str) {
            super(null);
            this.max = i13;
            this.selected = i14;
            this.layerPattern = str;
        }
    }

    @Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0018J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001b¨\u0006."}, m65681d2 = {"Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;", "Lcom/whoop/design/models/celebration/SlotOptionsModel;", "", "selectedGroup", "selectedLevel", "", "Lcom/whoop/design/models/celebration/SlotGroupModel;", "groups", "<init>", "(IILjava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "component3", "()Ljava/util/List;", "copy", "(IILjava/util/List;)Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getSelectedGroup", "getSelectedLevel", "Ljava/util/List;", "getGroups", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class GroupedCumulativeOptionsModel extends SlotOptionsModel {
        private final List<SlotGroupModel> groups;
        private final int selectedGroup;
        private final int selectedLevel;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C34656a(0))};

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return SlotOptionsModel$GroupedCumulativeOptionsModel$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GroupedCumulativeOptionsModel(int i13, int i14, int i15, List list, SerializationConstructorMarker serializationConstructorMarker) {
            super(i13, serializationConstructorMarker);
            if (7 != (i13 & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 7, SlotOptionsModel$GroupedCumulativeOptionsModel$$serializer.INSTANCE.getDescriptor());
            }
            this.selectedGroup = i14;
            this.selectedLevel = i15;
            this.groups = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
            return new ArrayListSerializer(SlotGroupModel$$serializer.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GroupedCumulativeOptionsModel copy$default(GroupedCumulativeOptionsModel groupedCumulativeOptionsModel, int i13, int i14, List list, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i13 = groupedCumulativeOptionsModel.selectedGroup;
            }
            if ((i15 & 2) != 0) {
                i14 = groupedCumulativeOptionsModel.selectedLevel;
            }
            if ((i15 & 4) != 0) {
                list = groupedCumulativeOptionsModel.groups;
            }
            return groupedCumulativeOptionsModel.copy(i13, i14, list);
        }

        public static final /* synthetic */ void write$Self$design_models_release(GroupedCumulativeOptionsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            SlotOptionsModel.write$Self(self, output, serialDesc);
            InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
            output.encodeIntElement(serialDesc, 0, self.selectedGroup);
            output.encodeIntElement(serialDesc, 1, self.selectedLevel);
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.groups);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getSelectedGroup() {
            return this.selectedGroup;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getSelectedLevel() {
            return this.selectedLevel;
        }

        public final List<SlotGroupModel> component3() {
            return this.groups;
        }

        public final GroupedCumulativeOptionsModel copy(int selectedGroup, int selectedLevel, List<SlotGroupModel> groups) {
            AbstractC22676k.m65750j(groups, "groups");
            return new GroupedCumulativeOptionsModel(selectedGroup, selectedLevel, groups);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GroupedCumulativeOptionsModel)) {
                return false;
            }
            GroupedCumulativeOptionsModel groupedCumulativeOptionsModel = (GroupedCumulativeOptionsModel) other;
            return this.selectedGroup == groupedCumulativeOptionsModel.selectedGroup && this.selectedLevel == groupedCumulativeOptionsModel.selectedLevel && AbstractC22676k.m65745e(this.groups, groupedCumulativeOptionsModel.groups);
        }

        public final List<SlotGroupModel> getGroups() {
            return this.groups;
        }

        public final int getSelectedGroup() {
            return this.selectedGroup;
        }

        public final int getSelectedLevel() {
            return this.selectedLevel;
        }

        public int hashCode() {
            return this.groups.hashCode() + AbstractC11266d.m30448b(this.selectedLevel, Integer.hashCode(this.selectedGroup) * 31, 31);
        }

        public String toString() {
            int i13 = this.selectedGroup;
            int i14 = this.selectedLevel;
            return AbstractC3855a.m11829m(AbstractC11266d.m30465s(i13, i14, "GroupedCumulativeOptionsModel(selectedGroup=", ", selectedLevel=", ", groups="), this.groups, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GroupedCumulativeOptionsModel(int i13, int i14, List<SlotGroupModel> groups) {
            super(null);
            AbstractC22676k.m65750j(groups, "groups");
            this.selectedGroup = i13;
            this.selectedLevel = i14;
            this.groups = groups;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/design/models/celebration/SlotOptionsModel$UnknownOptionsModel;", "Lcom/whoop/design/models/celebration/SlotOptionsModel;", "<init>", "()V", "Lwc3/c;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final class UnknownOptionsModel extends SlotOptionsModel {
        public static final int $stable = 0;
        public static final UnknownOptionsModel INSTANCE = new UnknownOptionsModel();
        private static final /* synthetic */ InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C34656a(1));

        private UnknownOptionsModel() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
            return new ObjectSerializer("com.whoop.design.models.celebration.SlotOptionsModel.UnknownOptionsModel", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
            return (InterfaceC37138c) $cachedSerializer$delegate.getValue();
        }

        public final InterfaceC37138c serializer() {
            return get$cachedSerializer();
        }
    }

    public /* synthetic */ SlotOptionsModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _init_$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37142g("com.whoop.design.models.celebration.SlotOptionsModel", c22673i0.getOrCreateKotlinClass(SlotOptionsModel.class), new InterfaceC21461d[]{c22673i0.getOrCreateKotlinClass(BooleanOptionsModel.class), c22673i0.getOrCreateKotlinClass(CumulativeOptionsModel.class), c22673i0.getOrCreateKotlinClass(ExclusiveOptionsModel.class), c22673i0.getOrCreateKotlinClass(GroupedCumulativeOptionsModel.class), c22673i0.getOrCreateKotlinClass(UnknownOptionsModel.class)}, new InterfaceC37138c[]{SlotOptionsModel$BooleanOptionsModel$$serializer.INSTANCE, SlotOptionsModel$CumulativeOptionsModel$$serializer.INSTANCE, SlotOptionsModel$ExclusiveOptionsModel$$serializer.INSTANCE, SlotOptionsModel$GroupedCumulativeOptionsModel$$serializer.INSTANCE, new ObjectSerializer("com.whoop.design.models.celebration.SlotOptionsModel.UnknownOptionsModel", UnknownOptionsModel.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(SlotOptionsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
    }

    private SlotOptionsModel() {
    }

    public /* synthetic */ SlotOptionsModel(int i13, SerializationConstructorMarker serializationConstructorMarker) {
    }
}
