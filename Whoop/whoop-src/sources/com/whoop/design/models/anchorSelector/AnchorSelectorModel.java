package com.whoop.design.models.anchorSelector;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.tiles.EmptyTileModel;
import com.whoop.design.models.tiles.EmptyTileModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q70.C30009a;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0002UTB\u0096\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0010\u0012+\b\u0002\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u0085\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0010\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ#\u0010!\u001a\u00020\u00002\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001f0\u0010H\u0016¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J\u001e\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b.\u0010/J3\u00100\u001a%\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u0016HÆ\u0003¢\u0006\u0004\b0\u0010/J£\u0001\u00101\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00102+\b\u0002\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u0016HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b3\u0010'J\u0010\u00104\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00107\u001a\u00020\u000e2\b\u00106\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b7\u00108J'\u0010A\u001a\u00020>2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0001¢\u0006\u0004\b?\u0010@R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010B\u001a\u0004\bC\u0010$R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bD\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bF\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\bH\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bJ\u0010+R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010K\u0012\u0004\bL\u0010M\u001a\u0004\b\u000f\u0010-R0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010N\u001a\u0004\bO\u0010/\"\u0004\bP\u0010QRE\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010N\u001a\u0004\bR\u0010/\"\u0004\bS\u0010Q¨\u0006V"}, m65681d2 = {"Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;", "tags", "Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;", "items", "", "stateUpdateSearchKey", "Lcom/whoop/design/models/tiles/EmptyTileModel;", "emptyTile", "", "tagsHorizontalInset", "", "isSearchActive", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Ljava/lang/Double;ZLjava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Lcom/whoop/design/models/tiles/EmptyTileModel;", "component5", "()Ljava/lang/Double;", "component6", "()Z", "component7", "()Ljava/util/Map;", "component8", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Ljava/lang/Double;ZLjava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/util/List;", "getTags", "getItems", "Ljava/lang/String;", "getStateUpdateSearchKey", "Lcom/whoop/design/models/tiles/EmptyTileModel;", "getEmptyTile", "Ljava/lang/Double;", "getTagsHorizontalInset", "Z", "isSearchActive$annotations", "()V", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AnchorSelectorModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final EmptyTileModel emptyTile;
    private final boolean isSearchActive;
    private final List<AnchorSectionModel> items;
    private final String stateUpdateSearchKey;
    private final List<SegmentedControlDisplayModel> tags;
    private final Double tagsHorizontalInset;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AnchorSelectorModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C30009a(27)), AbstractC30060g.m92087G(enumC23463i, new C30009a(28)), null, null, null, AbstractC30060g.m92087G(enumC23463i, new C30009a(29)), null};
    }

    public /* synthetic */ AnchorSelectorModel(int i13, List list, List list2, String str, EmptyTileModel emptyTileModel, Double d3, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, AnchorSelectorModel$$serializer.INSTANCE.getDescriptor());
        }
        this.tags = list;
        this.items = list2;
        if ((i13 & 4) == 0) {
            this.stateUpdateSearchKey = null;
        } else {
            this.stateUpdateSearchKey = str;
        }
        if ((i13 & 8) == 0) {
            this.emptyTile = null;
        } else {
            this.emptyTile = emptyTileModel;
        }
        if ((i13 & 16) == 0) {
            this.tagsHorizontalInset = null;
        } else {
            this.tagsHorizontalInset = d3;
        }
        this.isSearchActive = false;
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
        return new ArrayListSerializer(SegmentedControlDisplayModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(AnchorSectionModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnchorSelectorModel copy$default(AnchorSelectorModel anchorSelectorModel, List list, List list2, String str, EmptyTileModel emptyTileModel, Double d3, boolean z4, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = anchorSelectorModel.tags;
        }
        if ((i13 & 2) != 0) {
            list2 = anchorSelectorModel.items;
        }
        if ((i13 & 4) != 0) {
            str = anchorSelectorModel.stateUpdateSearchKey;
        }
        if ((i13 & 8) != 0) {
            emptyTileModel = anchorSelectorModel.emptyTile;
        }
        if ((i13 & 16) != 0) {
            d3 = anchorSelectorModel.tagsHorizontalInset;
        }
        if ((i13 & 32) != 0) {
            z4 = anchorSelectorModel.isSearchActive;
        }
        if ((i13 & 64) != 0) {
            map = anchorSelectorModel.bindings;
        }
        if ((i13 & 128) != 0) {
            map2 = anchorSelectorModel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        Double d14 = d3;
        boolean z13 = z4;
        return anchorSelectorModel.copy(list, list2, str, emptyTileModel, d14, z13, map3, map4);
    }

    public static /* synthetic */ void isSearchActive$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(AnchorSelectorModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.tags);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.items);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.stateUpdateSearchKey != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.stateUpdateSearchKey);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.emptyTile != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, EmptyTileModel$$serializer.INSTANCE, self.emptyTile);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.tagsHorizontalInset != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, DoubleSerializer.INSTANCE, self.tagsHorizontalInset);
        }
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

    public final List<SegmentedControlDisplayModel> component1() {
        return this.tags;
    }

    public final List<AnchorSectionModel> component2() {
        return this.items;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStateUpdateSearchKey() {
        return this.stateUpdateSearchKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EmptyTileModel getEmptyTile() {
        return this.emptyTile;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getTagsHorizontalInset() {
        return this.tagsHorizontalInset;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsSearchActive() {
        return this.isSearchActive;
    }

    public final Map<String, String> component7() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component8() {
        return this.aggregateBindings;
    }

    public final AnchorSelectorModel copy(List<SegmentedControlDisplayModel> tags, List<AnchorSectionModel> items, String stateUpdateSearchKey, EmptyTileModel emptyTile, Double tagsHorizontalInset, boolean isSearchActive, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(tags, "tags");
        AbstractC22676k.m65750j(items, "items");
        return new AnchorSelectorModel(tags, items, stateUpdateSearchKey, emptyTile, tagsHorizontalInset, isSearchActive, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnchorSelectorModel)) {
            return false;
        }
        AnchorSelectorModel anchorSelectorModel = (AnchorSelectorModel) other;
        return AbstractC22676k.m65745e(this.tags, anchorSelectorModel.tags) && AbstractC22676k.m65745e(this.items, anchorSelectorModel.items) && AbstractC22676k.m65745e(this.stateUpdateSearchKey, anchorSelectorModel.stateUpdateSearchKey) && AbstractC22676k.m65745e(this.emptyTile, anchorSelectorModel.emptyTile) && AbstractC22676k.m65745e(this.tagsHorizontalInset, anchorSelectorModel.tagsHorizontalInset) && this.isSearchActive == anchorSelectorModel.isSearchActive && AbstractC22676k.m65745e(this.bindings, anchorSelectorModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, anchorSelectorModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final EmptyTileModel getEmptyTile() {
        return this.emptyTile;
    }

    public final List<AnchorSectionModel> getItems() {
        return this.items;
    }

    public final String getStateUpdateSearchKey() {
        return this.stateUpdateSearchKey;
    }

    public final List<SegmentedControlDisplayModel> getTags() {
        return this.tags;
    }

    public final Double getTagsHorizontalInset() {
        return this.tagsHorizontalInset;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.tags.hashCode() * 31, 31, this.items);
        String str = this.stateUpdateSearchKey;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        EmptyTileModel emptyTileModel = this.emptyTile;
        int iHashCode2 = (iHashCode + (emptyTileModel == null ? 0 : emptyTileModel.hashCode())) * 31;
        Double d3 = this.tagsHorizontalInset;
        int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31, 31, this.isSearchActive);
        Map<String, String> map = this.bindings;
        int iHashCode3 = (iM8289b + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    public final boolean isSearchActive() {
        return this.isSearchActive;
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
        List<SegmentedControlDisplayModel> list = this.tags;
        List<AnchorSectionModel> list2 = this.items;
        String str = this.stateUpdateSearchKey;
        EmptyTileModel emptyTileModel = this.emptyTile;
        Double d3 = this.tagsHorizontalInset;
        boolean z4 = this.isSearchActive;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sbM124380j = AbstractC38963t7.m124380j("AnchorSelectorModel(tags=", ", items=", list, ", stateUpdateSearchKey=", list2);
        sbM124380j.append(str);
        sbM124380j.append(", emptyTile=");
        sbM124380j.append(emptyTileModel);
        sbM124380j.append(", tagsHorizontalInset=");
        sbM124380j.append(d3);
        sbM124380j.append(", isSearchActive=");
        sbM124380j.append(z4);
        sbM124380j.append(", bindings=");
        return AbstractC30802r.m94765n(sbM124380j, map, ", aggregateBindings=", map2, ")");
    }

    public AnchorSelectorModel(List<SegmentedControlDisplayModel> tags, List<AnchorSectionModel> items, String str, EmptyTileModel emptyTileModel, Double d3, boolean z4, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(tags, "tags");
        AbstractC22676k.m65750j(items, "items");
        this.tags = tags;
        this.items = items;
        this.stateUpdateSearchKey = str;
        this.emptyTile = emptyTileModel;
        this.tagsHorizontalInset = d3;
        this.isSearchActive = z4;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007f  */
    @Override // com.whoop.design.models.WithGeneratedBindings
    public AnchorSelectorModel bind(Map<String, ? extends Object> accumulatedState) {
        AnchorSectionModel anchorSectionModelCopy$default;
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        AnchorSelectorModel anchorSelectorModelGeneratedBind = AnchorSelectorModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
        String str = this.stateUpdateSearchKey;
        if (str == null) {
            return copy$default(anchorSelectorModelGeneratedBind, null, null, null, null, null, false, null, null, 223, null);
        }
        Object obj = accumulatedState.get(str);
        String string = obj != null ? obj.toString() : null;
        if (string == null) {
            string = "";
        }
        String string2 = AbstractC39414r.m125869O0(string).toString();
        if (string2.length() == 0) {
            return copy$default(anchorSelectorModelGeneratedBind, null, null, null, null, null, false, null, null, 223, null);
        }
        List<AnchorSectionModel> list = anchorSelectorModelGeneratedBind.items;
        ArrayList arrayList = new ArrayList();
        for (AnchorSectionModel anchorSectionModel : list) {
            if (AbstractC39421y.m125921F(anchorSectionModel.getType(), "suggested", true)) {
                anchorSectionModelCopy$default = null;
                break;
            }
            List<DesignSystemModel> items = anchorSectionModel.getItems();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                DesignSystemModel designSystemModelWithFilteredSearchResults = AnchorSelectorModelKt.withFilteredSearchResults((DesignSystemModel) it.next(), string2);
                if (designSystemModelWithFilteredSearchResults != null) {
                    arrayList2.add(designSystemModelWithFilteredSearchResults);
                }
            }
            if (arrayList2.isEmpty()) {
                anchorSectionModelCopy$default = null;
                break;
            }
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    anchorSectionModelCopy$default = null;
                    break;
                }
                if (AnchorSelectorModelKt.isSearchResult((DesignSystemModel) it3.next())) {
                    anchorSectionModelCopy$default = AnchorSectionModel.copy$default(anchorSectionModel, null, null, arrayList2, null, null, null, null, null, null, null, 1019, null);
                    break;
                }
            }
            if (anchorSectionModelCopy$default != null) {
                arrayList.add(anchorSectionModelCopy$default);
            }
        }
        return copy$default(anchorSelectorModelGeneratedBind, C25271y.f99162w, arrayList, null, null, null, true, null, null, 220, null);
    }

    public /* synthetic */ AnchorSelectorModel(List list, List list2, String str, EmptyTileModel emptyTileModel, Double d3, boolean z4, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : emptyTileModel, (i13 & 16) != 0 ? null : d3, (i13 & 32) != 0 ? false : z4, (i13 & 64) != 0 ? null : map, (i13 & 128) != 0 ? null : map2);
    }
}
