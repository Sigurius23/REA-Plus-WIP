package com.whoop.archv2.model.template;

import cb1.C4387a;
import cj0.AbstractC4743e;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.coacheverywherecommon.models.AiContextMetadata$$serializer;
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
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 72\u00020\u00012\u00020\u0002:\u000289B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006BQ\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0005\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\u00020\u00002\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a0\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u001fR0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100RE\u0010\r\u001a%\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tj\u0004\u0018\u0001`1¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\t048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00100¨\u0006:"}, m65681d2 = {"Lcom/whoop/archv2/model/template/MetaData;", "Lcom/whoop/design/models/WithGeneratedBindings;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "aiContextMetadata", "<init>", "(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V", "", "seen0", "", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/coacheverywherecommon/models/AiContextMetadata;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$arch_v2_release", "(Lcom/whoop/archv2/model/template/MetaData;Lzc3/c;Lyc3/g;)V", "write$Self", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/archv2/model/template/MetaData;", "component1", "()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "copy", "(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lcom/whoop/archv2/model/template/MetaData;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "getAiContextMetadata", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "a", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MetaData implements WithGeneratedBindings, DesignSystemModel {
    private Map<String, AggregateBinding> aggregateBindings;
    private final AiContextMetadata aiContextMetadata;
    private Map<String, String> bindings;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C4387a(27)), null};

    /* JADX INFO: renamed from: com.whoop.archv2.model.template.MetaData$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/archv2/model/template/MetaData$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/archv2/model/template/MetaData;", "serializer", "()Lwc3/c;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MetaData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MetaData(int i13, AiContextMetadata aiContextMetadata, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, MetaData$$serializer.INSTANCE.getDescriptor());
        }
        this.aiContextMetadata = aiContextMetadata;
        if ((i13 & 2) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 4) == 0) {
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

    public static /* synthetic */ MetaData copy$default(MetaData metaData, AiContextMetadata aiContextMetadata, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            aiContextMetadata = metaData.aiContextMetadata;
        }
        return metaData.copy(aiContextMetadata);
    }

    public static final /* synthetic */ void write$Self$arch_v2_release(MetaData self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, AiContextMetadata$$serializer.INSTANCE, self.aiContextMetadata);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public /* bridge */ /* synthetic */ WithGeneratedBindings bind(Map map) {
        return bind((Map<String, ? extends Object>) map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AiContextMetadata getAiContextMetadata() {
        return this.aiContextMetadata;
    }

    public final MetaData copy(AiContextMetadata aiContextMetadata) {
        return new MetaData(aiContextMetadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MetaData) && AbstractC22676k.m65745e(this.aiContextMetadata, ((MetaData) other).aiContextMetadata);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    public final AiContextMetadata getAiContextMetadata() {
        return this.aiContextMetadata;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public int hashCode() {
        AiContextMetadata aiContextMetadata = this.aiContextMetadata;
        if (aiContextMetadata == null) {
            return 0;
        }
        return aiContextMetadata.hashCode();
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
        return "MetaData(aiContextMetadata=" + this.aiContextMetadata + ")";
    }

    public MetaData(AiContextMetadata aiContextMetadata) {
        this.aiContextMetadata = aiContextMetadata;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public MetaData bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return AbstractC4743e.m14916a(this, getBindings(), getAggregateBindings(), accumulatedState);
    }
}
