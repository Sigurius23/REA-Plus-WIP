package com.whoop.design.models.items;

import ad3.AbstractC0770m;
import com.whoop.design.models.SearchFilterableModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.BindCoercionKt;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.binding.StateBindingDeserializerKt;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36963j;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yb3.AbstractC39414r;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 b2\u00020\u00012\u00020\u0002:\u0002cbBº\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013\u0012+\b\u0002\u0010\u001a\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0004\u0018\u0001`\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u0019¢\u0006\u0004\b\u001b\u0010\u001cB¡\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001b\u0010 J\u0019\u0010\"\u001a\u0004\u0018\u00010\u00002\u0006\u0010!\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\u00020\u00022\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020$0\u0013H\u0016¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b/\u0010)J\u0012\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b0\u0010)J\u0012\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b1\u0010)J\u0012\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b6\u0010)J\u001e\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b7\u00108J3\u00109\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0004\u0018\u0001`\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u0019HÆ\u0003¢\u0006\u0004\b9\u00108JÉ\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00132+\b\u0002\u0010\u001a\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0004\u0018\u0001`\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u0019HÆ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b<\u0010)J\u0010\u0010=\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b=\u0010+J\u001a\u0010?\u001a\u00020\u00102\b\u0010>\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b?\u0010@J#\u0010A\u001a\u00020\u00002\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020$0\u0013H\u0002¢\u0006\u0004\bA\u0010BJ'\u0010K\u001a\u00020H2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0001¢\u0006\u0004\bI\u0010JR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010L\u001a\u0004\bM\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010N\u001a\u0004\bO\u0010+R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bP\u0010+R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010Q\u001a\u0004\bR\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010L\u001a\u0004\bS\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010L\u001a\u0004\bT\u0010)R\"\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010L\u0012\u0004\bV\u0010W\u001a\u0004\bU\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010X\u001a\u0004\bY\u00103R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010Z\u001a\u0004\b\u0011\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\b[\u0010)R0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\\\u001a\u0004\b]\u00108\"\u0004\b^\u0010_RE\u0010\u001a\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0004\u0018\u0001`\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\\\u001a\u0004\b`\u00108\"\u0004\ba\u0010_¨\u0006d"}, m65681d2 = {"Lcom/whoop/design/models/items/SelectableCellListModel;", "Lcom/whoop/design/models/SearchFilterableModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "", "maxSelection", "minSelection", "", "Lcom/whoop/design/models/items/SelectableCellModel;", "cells", "stateUpdateValueKey", "stateUpdateSearchKey", "searchQuery", "Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;", "searchBehavior", "", "isDisabled", "disabledStateKey", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;ZLjava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;ZLjava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "query", "filteredForSearch", "(Ljava/lang/String;)Lcom/whoop/design/models/items/SelectableCellListModel;", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "component8", "()Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;", "component9", "()Z", "component10", "component11", "()Ljava/util/Map;", "component12", "copy", "(Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;ZLjava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/SelectableCellListModel;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "withResolvedDisabled", "(Ljava/util/Map;)Lcom/whoop/design/models/items/SelectableCellListModel;", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/SelectableCellListModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "I", "getMaxSelection", "getMinSelection", "Ljava/util/List;", "getCells", "getStateUpdateValueKey", "getStateUpdateSearchKey", "getSearchQuery", "getSearchQuery$annotations", "()V", "Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;", "getSearchBehavior", "Z", "getDisabledStateKey", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SelectableCellListModel implements SearchFilterableModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final List<SelectableCellModel> cells;
    private final String disabledStateKey;
    private final String id;
    private final boolean isDisabled;
    private final int maxSelection;
    private final int minSelection;
    private final SelectableCellListSearchBehavior searchBehavior;
    private final String searchQuery;
    private final String stateUpdateSearchKey;
    private final String stateUpdateValueKey;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/SelectableCellListModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/SelectableCellListModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SelectableCellListModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36963j(3)), null, null, AbstractC30060g.m92087G(enumC23463i, new C36963j(4)), null, null, AbstractC30060g.m92087G(enumC23463i, new C36963j(5)), null};
    }

    public /* synthetic */ SelectableCellListModel(int i13, String str, int i14, int i15, List list, String str2, String str3, SelectableCellListSearchBehavior selectableCellListSearchBehavior, boolean z4, String str4, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i13 & 11)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 11, SelectableCellListModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.maxSelection = i14;
        if ((i13 & 4) == 0) {
            this.minSelection = 0;
        } else {
            this.minSelection = i15;
        }
        this.cells = list;
        if ((i13 & 16) == 0) {
            this.stateUpdateValueKey = null;
        } else {
            this.stateUpdateValueKey = str2;
        }
        if ((i13 & 32) == 0) {
            this.stateUpdateSearchKey = null;
        } else {
            this.stateUpdateSearchKey = str3;
        }
        this.searchQuery = null;
        if ((i13 & 64) == 0) {
            this.searchBehavior = null;
        } else {
            this.searchBehavior = selectableCellListSearchBehavior;
        }
        if ((i13 & 128) == 0) {
            this.isDisabled = false;
        } else {
            this.isDisabled = z4;
        }
        if ((i13 & 256) == 0) {
            this.disabledStateKey = null;
        } else {
            this.disabledStateKey = str4;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SelectableCellModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.SelectableCellListSearchBehavior", SelectableCellListSearchBehavior.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectableCellListModel copy$default(SelectableCellListModel selectableCellListModel, String str, int i13, int i14, List list, String str2, String str3, String str4, SelectableCellListSearchBehavior selectableCellListSearchBehavior, boolean z4, String str5, Map map, Map map2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = selectableCellListModel.id;
        }
        if ((i15 & 2) != 0) {
            i13 = selectableCellListModel.maxSelection;
        }
        if ((i15 & 4) != 0) {
            i14 = selectableCellListModel.minSelection;
        }
        if ((i15 & 8) != 0) {
            list = selectableCellListModel.cells;
        }
        if ((i15 & 16) != 0) {
            str2 = selectableCellListModel.stateUpdateValueKey;
        }
        if ((i15 & 32) != 0) {
            str3 = selectableCellListModel.stateUpdateSearchKey;
        }
        if ((i15 & 64) != 0) {
            str4 = selectableCellListModel.searchQuery;
        }
        if ((i15 & 128) != 0) {
            selectableCellListSearchBehavior = selectableCellListModel.searchBehavior;
        }
        if ((i15 & 256) != 0) {
            z4 = selectableCellListModel.isDisabled;
        }
        if ((i15 & 512) != 0) {
            str5 = selectableCellListModel.disabledStateKey;
        }
        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            map = selectableCellListModel.bindings;
        }
        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            map2 = selectableCellListModel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        boolean z13 = z4;
        String str6 = str5;
        String str7 = str4;
        SelectableCellListSearchBehavior selectableCellListSearchBehavior2 = selectableCellListSearchBehavior;
        String str8 = str2;
        String str9 = str3;
        return selectableCellListModel.copy(str, i13, i14, list, str8, str9, str7, selectableCellListSearchBehavior2, z13, str6, map3, map4);
    }

    public static /* synthetic */ void getSearchQuery$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    private final SelectableCellListModel withResolvedDisabled(Map<String, ? extends Object> accumulatedState) {
        String str;
        if (this.isDisabled || (str = this.disabledStateKey) == null) {
            return this;
        }
        Object objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(accumulatedState.get(str));
        if (objUnwrapForCoercion == null) {
            objUnwrapForCoercion = null;
        } else if (objUnwrapForCoercion instanceof JsonElement) {
            JsonElement jsonElement = (JsonElement) objUnwrapForCoercion;
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                objUnwrapForCoercion = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonElement);
            } catch (Exception unused) {
                objUnwrapForCoercion = null;
            }
        } else if (!(objUnwrapForCoercion instanceof Boolean)) {
            if (objUnwrapForCoercion instanceof Number) {
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Boolean.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    objUnwrapForCoercion = (Boolean) Integer.valueOf(((Number) objUnwrapForCoercion).intValue());
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    objUnwrapForCoercion = (Boolean) Long.valueOf(((Number) objUnwrapForCoercion).longValue());
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    objUnwrapForCoercion = (Boolean) Double.valueOf(((Number) objUnwrapForCoercion).doubleValue());
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    objUnwrapForCoercion = (Boolean) Float.valueOf(((Number) objUnwrapForCoercion).floatValue());
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    objUnwrapForCoercion = (Boolean) Short.valueOf(((Number) objUnwrapForCoercion).shortValue());
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    objUnwrapForCoercion = (Boolean) Byte.valueOf(((Number) objUnwrapForCoercion).byteValue());
                } else {
                    objUnwrapForCoercion = null;
                }
            } else if (objUnwrapForCoercion instanceof String) {
                JsonPrimitive jsonPrimitiveM1841c = AbstractC0770m.m1841c((String) objUnwrapForCoercion);
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    objUnwrapForCoercion = StateBindingDeserializerKt.getStateBindingJson().m1830a(BooleanSerializer.INSTANCE, jsonPrimitiveM1841c);
                } catch (Exception unused2) {
                    objUnwrapForCoercion = null;
                }
                if (objUnwrapForCoercion == null) {
                    objUnwrapForCoercion = null;
                }
            } else {
                objUnwrapForCoercion = null;
            }
        }
        return AbstractC22676k.m65745e(objUnwrapForCoercion, Boolean.TRUE) ? copy$default(this, null, 0, 0, null, null, null, null, null, true, null, null, null, 3839, null) : this;
    }

    public static final /* synthetic */ void write$Self$design_models_release(SelectableCellListModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeIntElement(serialDesc, 1, self.maxSelection);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.minSelection != 0) {
            output.encodeIntElement(serialDesc, 2, self.minSelection);
        }
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.cells);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.stateUpdateValueKey != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.stateUpdateValueKey);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.stateUpdateSearchKey != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.stateUpdateSearchKey);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.searchBehavior != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.searchBehavior);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.isDisabled) {
            output.encodeBooleanElement(serialDesc, 7, self.isDisabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.disabledStateKey != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.disabledStateKey);
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
    public WithGeneratedBindings bind(Map<String, ? extends Object> accumulatedState) {
        String string;
        String string2;
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        SelectableCellListModel selectableCellListModelWithResolvedDisabled = SelectableCellListModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState).withResolvedDisabled(accumulatedState);
        String str = selectableCellListModelWithResolvedDisabled.stateUpdateValueKey;
        Set selectedCellIdsOrNull = str != null ? SelectableCellListModelKt.toSelectedCellIdsOrNull(accumulatedState.get(str)) : null;
        if (selectedCellIdsOrNull == null) {
            List<SelectableCellModel> list = selectableCellListModelWithResolvedDisabled.cells;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((SelectableCellModel) obj).getSelected()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((SelectableCellModel) it.next()).getId());
            }
            selectedCellIdsOrNull = AbstractC25265s.m74103I1(arrayList2);
        }
        Object obj2 = accumulatedState.get(selectableCellListModelWithResolvedDisabled.stateUpdateSearchKey);
        String str2 = (obj2 == null || (string = obj2.toString()) == null || (string2 = AbstractC39414r.m125869O0(string).toString()) == null || string2.length() <= 0) ? null : string2;
        List<SelectableCellModel> list2 = selectableCellListModelWithResolvedDisabled.cells;
        if (str2 != null) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list2) {
                if (hashSet.add(((SelectableCellModel) obj3).getId())) {
                    arrayList3.add(obj3);
                }
            }
            list2 = arrayList3;
        }
        List<SelectableCellModel> list3 = list2;
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
        for (SelectableCellModel selectableCellModel : list3) {
            arrayList4.add(SelectableCellModel.copy$default(selectableCellModel, null, null, null, null, null, false, null, selectedCellIdsOrNull.contains(selectableCellModel.getId()), false, false, null, null, null, null, str2 == null ? selectableCellModel.getSectionTitle() : null, null, null, null, 245631, null));
        }
        return copy$default(selectableCellListModelWithResolvedDisabled, null, 0, 0, arrayList4, null, null, str2, null, false, null, null, null, 4023, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDisabledStateKey() {
        return this.disabledStateKey;
    }

    public final Map<String, String> component11() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component12() {
        return this.aggregateBindings;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxSelection() {
        return this.maxSelection;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMinSelection() {
        return this.minSelection;
    }

    public final List<SelectableCellModel> component4() {
        return this.cells;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStateUpdateValueKey() {
        return this.stateUpdateValueKey;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStateUpdateSearchKey() {
        return this.stateUpdateSearchKey;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final SelectableCellListSearchBehavior getSearchBehavior() {
        return this.searchBehavior;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    public final SelectableCellListModel copy(String id4, int maxSelection, int minSelection, List<SelectableCellModel> cells, String stateUpdateValueKey, String stateUpdateSearchKey, String searchQuery, SelectableCellListSearchBehavior searchBehavior, boolean isDisabled, String disabledStateKey, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(cells, "cells");
        return new SelectableCellListModel(id4, maxSelection, minSelection, cells, stateUpdateValueKey, stateUpdateSearchKey, searchQuery, searchBehavior, isDisabled, disabledStateKey, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectableCellListModel)) {
            return false;
        }
        SelectableCellListModel selectableCellListModel = (SelectableCellListModel) other;
        return AbstractC22676k.m65745e(this.id, selectableCellListModel.id) && this.maxSelection == selectableCellListModel.maxSelection && this.minSelection == selectableCellListModel.minSelection && AbstractC22676k.m65745e(this.cells, selectableCellListModel.cells) && AbstractC22676k.m65745e(this.stateUpdateValueKey, selectableCellListModel.stateUpdateValueKey) && AbstractC22676k.m65745e(this.stateUpdateSearchKey, selectableCellListModel.stateUpdateSearchKey) && AbstractC22676k.m65745e(this.searchQuery, selectableCellListModel.searchQuery) && this.searchBehavior == selectableCellListModel.searchBehavior && this.isDisabled == selectableCellListModel.isDisabled && AbstractC22676k.m65745e(this.disabledStateKey, selectableCellListModel.disabledStateKey) && AbstractC22676k.m65745e(this.bindings, selectableCellListModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, selectableCellListModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final List<SelectableCellModel> getCells() {
        return this.cells;
    }

    public final String getDisabledStateKey() {
        return this.disabledStateKey;
    }

    public final String getId() {
        return this.id;
    }

    public final int getMaxSelection() {
        return this.maxSelection;
    }

    public final int getMinSelection() {
        return this.minSelection;
    }

    public final SelectableCellListSearchBehavior getSearchBehavior() {
        return this.searchBehavior;
    }

    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public final String getStateUpdateSearchKey() {
        return this.stateUpdateSearchKey;
    }

    public final String getStateUpdateValueKey() {
        return this.stateUpdateValueKey;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.minSelection, AbstractC11266d.m30448b(this.maxSelection, this.id.hashCode() * 31, 31), 31), 31, this.cells);
        String str = this.stateUpdateValueKey;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.stateUpdateSearchKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.searchQuery;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SelectableCellListSearchBehavior selectableCellListSearchBehavior = this.searchBehavior;
        int iM8289b = AbstractC2875y.m8289b((iHashCode3 + (selectableCellListSearchBehavior == null ? 0 : selectableCellListSearchBehavior.hashCode())) * 31, 31, this.isDisabled);
        String str4 = this.disabledStateKey;
        int iHashCode4 = (iM8289b + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, String> map = this.bindings;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode5 + (map2 != null ? map2.hashCode() : 0);
    }

    public final boolean isDisabled() {
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
        int i13 = this.maxSelection;
        int i14 = this.minSelection;
        List<SelectableCellModel> list = this.cells;
        String str2 = this.stateUpdateValueKey;
        String str3 = this.stateUpdateSearchKey;
        String str4 = this.searchQuery;
        SelectableCellListSearchBehavior selectableCellListSearchBehavior = this.searchBehavior;
        boolean z4 = this.isDisabled;
        String str5 = this.disabledStateKey;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "SelectableCellListModel(id=", str, ", maxSelection=", ", minSelection=");
        sbM30467u.append(i14);
        sbM30467u.append(", cells=");
        sbM30467u.append(list);
        sbM30467u.append(", stateUpdateValueKey=");
        AbstractC11266d.m30444B(sbM30467u, str2, ", stateUpdateSearchKey=", str3, ", searchQuery=");
        sbM30467u.append(str4);
        sbM30467u.append(", searchBehavior=");
        sbM30467u.append(selectableCellListSearchBehavior);
        sbM30467u.append(", isDisabled=");
        AbstractC38963t7.m124391u(sbM30467u, z4, ", disabledStateKey=", str5, ", bindings=");
        return AbstractC30802r.m94765n(sbM30467u, map, ", aggregateBindings=", map2, ")");
    }

    public SelectableCellListModel(String id4, int i13, int i14, List<SelectableCellModel> cells, String str, String str2, String str3, SelectableCellListSearchBehavior selectableCellListSearchBehavior, boolean z4, String str4, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(cells, "cells");
        this.id = id4;
        this.maxSelection = i13;
        this.minSelection = i14;
        this.cells = cells;
        this.stateUpdateValueKey = str;
        this.stateUpdateSearchKey = str2;
        this.searchQuery = str3;
        this.searchBehavior = selectableCellListSearchBehavior;
        this.isDisabled = z4;
        this.disabledStateKey = str4;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    @Override // com.whoop.design.models.SearchFilterableModel
    public SelectableCellListModel filteredForSearch(String query) {
        AbstractC22676k.m65750j(query, "query");
        String str = this.stateUpdateSearchKey;
        if (str != null && str.length() != 0) {
            return this;
        }
        List<SelectableCellModel> list = this.cells;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            SelectableCellModel selectableCellModel = (SelectableCellModel) obj;
            if (SelectableCellListModelKt.matchesSearch(selectableCellModel, query) || selectableCellModel.getSelected()) {
                arrayList.add(obj);
            }
        }
        SelectableCellListModel selectableCellListModelCopy$default = copy$default(this, null, 0, 0, arrayList, null, null, null, null, false, null, null, null, 4087, null);
        if (arrayList.isEmpty()) {
            return null;
        }
        return selectableCellListModelCopy$default;
    }

    public /* synthetic */ SelectableCellListModel(String str, int i13, int i14, List list, String str2, String str3, String str4, SelectableCellListSearchBehavior selectableCellListSearchBehavior, boolean z4, String str5, Map map, Map map2, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, (i15 & 4) != 0 ? 0 : i14, list, (i15 & 16) != 0 ? null : str2, (i15 & 32) != 0 ? null : str3, (i15 & 64) != 0 ? null : str4, (i15 & 128) != 0 ? null : selectableCellListSearchBehavior, (i15 & 256) != 0 ? false : z4, (i15 & 512) != 0 ? null : str5, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : map, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : map2);
    }
}
