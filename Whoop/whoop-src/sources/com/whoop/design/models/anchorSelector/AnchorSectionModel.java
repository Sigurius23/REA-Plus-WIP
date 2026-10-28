package com.whoop.design.models.anchorSelector;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q70.C30009a;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 R2\u00020\u0001:\u0002SRB¦\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012+\b\u0002\u0010\u0015\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u009d\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ#\u0010\u001f\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001d0\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\"J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b+\u0010*J\u001e\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J3\u0010.\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014HÆ\u0003¢\u0006\u0004\b.\u0010-Jµ\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2+\b\u0002\u0010\u0015\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\"J\u0010\u00102\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b6\u00107J'\u0010@\u001a\u00020=2\u0006\u00108\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0001¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010A\u001a\u0004\bC\u0010\"R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bE\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bF\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bG\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bH\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010I\u001a\u0004\bJ\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bK\u0010*R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010L\u001a\u0004\bM\u0010-\"\u0004\bN\u0010ORE\u0010\u0015\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010L\u001a\u0004\bP\u0010-\"\u0004\bQ\u0010O¨\u0006T"}, m65681d2 = {"Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "title", "type", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "spacingType", "titleTypography", "style", "", "leadingPadding", "trailingPadding", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "component7", "()Ljava/lang/Double;", "component8", "component9", "()Ljava/util/Map;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getType", "Ljava/util/List;", "getItems", "getSpacingType", "getTitleTypography", "getStyle", "Ljava/lang/Double;", "getLeadingPadding", "getTrailingPadding", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AnchorSectionModel implements WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final List<DesignSystemModel> items;
    private final Double leadingPadding;
    private final String spacingType;
    private final String style;
    private final String title;
    private final String titleTypography;
    private final Double trailingPadding;
    private final String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/anchorSelector/AnchorSectionModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AnchorSectionModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C30009a(25)), null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C30009a(26)), null};
    }

    public /* synthetic */ AnchorSectionModel(int i13, String str, String str2, List list, String str3, String str4, String str5, Double d3, Double d14, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, AnchorSectionModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.type = str2;
        this.items = list;
        if ((i13 & 8) == 0) {
            this.spacingType = null;
        } else {
            this.spacingType = str3;
        }
        if ((i13 & 16) == 0) {
            this.titleTypography = null;
        } else {
            this.titleTypography = str4;
        }
        if ((i13 & 32) == 0) {
            this.style = null;
        } else {
            this.style = str5;
        }
        if ((i13 & 64) == 0) {
            this.leadingPadding = null;
        } else {
            this.leadingPadding = d3;
        }
        if ((i13 & 128) == 0) {
            this.trailingPadding = null;
        } else {
            this.trailingPadding = d14;
        }
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
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnchorSectionModel copy$default(AnchorSectionModel anchorSectionModel, String str, String str2, List list, String str3, String str4, String str5, Double d3, Double d14, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = anchorSectionModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = anchorSectionModel.type;
        }
        if ((i13 & 4) != 0) {
            list = anchorSectionModel.items;
        }
        if ((i13 & 8) != 0) {
            str3 = anchorSectionModel.spacingType;
        }
        if ((i13 & 16) != 0) {
            str4 = anchorSectionModel.titleTypography;
        }
        if ((i13 & 32) != 0) {
            str5 = anchorSectionModel.style;
        }
        if ((i13 & 64) != 0) {
            d3 = anchorSectionModel.leadingPadding;
        }
        if ((i13 & 128) != 0) {
            d14 = anchorSectionModel.trailingPadding;
        }
        if ((i13 & 256) != 0) {
            map = anchorSectionModel.bindings;
        }
        if ((i13 & 512) != 0) {
            map2 = anchorSectionModel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        Double d15 = d3;
        Double d16 = d14;
        String str6 = str4;
        String str7 = str5;
        return anchorSectionModel.copy(str, str2, list, str3, str6, str7, d15, d16, map3, map4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(AnchorSectionModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.type);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.items);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.spacingType != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.spacingType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.titleTypography != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.titleTypography);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.style != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.leadingPadding != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, DoubleSerializer.INSTANCE, self.leadingPadding);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.trailingPadding != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, DoubleSerializer.INSTANCE, self.trailingPadding);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public /* bridge */ /* synthetic */ WithGeneratedBindings bind(Map map) {
        return bind((Map<String, ? extends Object>) map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, AggregateBinding> component10() {
        return this.aggregateBindings;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final List<DesignSystemModel> component3() {
        return this.items;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSpacingType() {
        return this.spacingType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitleTypography() {
        return this.titleTypography;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getLeadingPadding() {
        return this.leadingPadding;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getTrailingPadding() {
        return this.trailingPadding;
    }

    public final Map<String, String> component9() {
        return this.bindings;
    }

    public final AnchorSectionModel copy(String title, String type, List<? extends DesignSystemModel> items, String spacingType, String titleTypography, String style, Double leadingPadding, Double trailingPadding, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(items, "items");
        return new AnchorSectionModel(title, type, items, spacingType, titleTypography, style, leadingPadding, trailingPadding, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnchorSectionModel)) {
            return false;
        }
        AnchorSectionModel anchorSectionModel = (AnchorSectionModel) other;
        return AbstractC22676k.m65745e(this.title, anchorSectionModel.title) && AbstractC22676k.m65745e(this.type, anchorSectionModel.type) && AbstractC22676k.m65745e(this.items, anchorSectionModel.items) && AbstractC22676k.m65745e(this.spacingType, anchorSectionModel.spacingType) && AbstractC22676k.m65745e(this.titleTypography, anchorSectionModel.titleTypography) && AbstractC22676k.m65745e(this.style, anchorSectionModel.style) && AbstractC22676k.m65745e(this.leadingPadding, anchorSectionModel.leadingPadding) && AbstractC22676k.m65745e(this.trailingPadding, anchorSectionModel.trailingPadding) && AbstractC22676k.m65745e(this.bindings, anchorSectionModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, anchorSectionModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final Double getLeadingPadding() {
        return this.leadingPadding;
    }

    public final String getSpacingType() {
        return this.spacingType;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleTypography() {
        return this.titleTypography;
    }

    public final Double getTrailingPadding() {
        return this.trailingPadding;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.type), 31, this.items);
        String str = this.spacingType;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.titleTypography;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.style;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d3 = this.leadingPadding;
        int iHashCode4 = (iHashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d14 = this.trailingPadding;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Map<String, String> map = this.bindings;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode6 + (map2 != null ? map2.hashCode() : 0);
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
        String str = this.title;
        String str2 = this.type;
        List<DesignSystemModel> list = this.items;
        String str3 = this.spacingType;
        String str4 = this.titleTypography;
        String str5 = this.style;
        Double d3 = this.leadingPadding;
        Double d14 = this.trailingPadding;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AnchorSectionModel(title=", str, ", type=", str2, ", items=");
        AbstractC17176i.m48511m(", spacingType=", str3, ", titleTypography=", sbM32001t, list);
        AbstractC11266d.m30444B(sbM32001t, str4, ", style=", str5, ", leadingPadding=");
        AbstractC21702c.m61146q(sbM32001t, d3, ", trailingPadding=", d14, ", bindings=");
        return AbstractC30802r.m94765n(sbM32001t, map, ", aggregateBindings=", map2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnchorSectionModel(String title, String type, List<? extends DesignSystemModel> items, String str, String str2, String str3, Double d3, Double d14, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(items, "items");
        this.title = title;
        this.type = type;
        this.items = items;
        this.spacingType = str;
        this.titleTypography = str2;
        this.style = str3;
        this.leadingPadding = d3;
        this.trailingPadding = d14;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public AnchorSectionModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return AnchorSectionModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    public /* synthetic */ AnchorSectionModel(String str, String str2, List list, String str3, String str4, String str5, Double d3, Double d14, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : str5, (i13 & 64) != 0 ? null : d3, (i13 & 128) != 0 ? null : d14, (i13 & 256) != 0 ? null : map, (i13 & 512) != 0 ? null : map2);
    }
}
