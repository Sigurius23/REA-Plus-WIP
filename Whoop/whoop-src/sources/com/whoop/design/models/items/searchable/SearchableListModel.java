package com.whoop.design.models.items.searchable;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.C25271y;
import p000.AbstractC11266d;
import p025b1.C2217h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yb3.AbstractC39414r;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0002EFB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBu\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000b\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020\u00002\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f0\u000fH\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b)\u0010*J@\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b-\u0010(J\u0010\u0010.\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010$R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b\n\u0010*R0\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>RE\u0010\u0012\u001a%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fj\u0004\u0018\u0001`?¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\t0B8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010:\u001a\u0004\bC\u0010<\"\u0004\bD\u0010>¨\u0006G"}, m65681d2 = {"Lcom/whoop/design/models/items/searchable/SearchableListModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "Lcom/whoop/design/models/DesignSystemModel;", "emptyResultsItem", "", "Lcom/whoop/design/models/items/searchable/SearchableSectionModel;", "sections", "", "stateUpdateSearchKey", "", "isSearchActive", "<init>", "(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/searchable/SearchableListModel;Lzc3/c;Lyc3/g;)V", "write$Self", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/items/searchable/SearchableListModel;", "component1", "()Lcom/whoop/design/models/DesignSystemModel;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Boolean;", "copy", "(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/searchable/SearchableListModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/DesignSystemModel;", "getEmptyResultsItem", "Ljava/util/List;", "getSections", "Ljava/lang/String;", "getStateUpdateSearchKey", "Ljava/lang/Boolean;", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SearchableListModel implements WithGeneratedBindings, DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private static final String FILTERED_SECTION_ID = "filtered-search-section";
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final DesignSystemModel emptyResultsItem;
    private final Boolean isSearchActive;
    private final List<SearchableSectionModel> sections;
    private final String stateUpdateSearchKey;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/design/models/items/searchable/SearchableListModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/searchable/SearchableListModel;", "serializer", "()Lwc3/c;", "", "FILTERED_SECTION_ID", "Ljava/lang/String;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SearchableListModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C2217h(19)), AbstractC30060g.m92087G(enumC23463i, new C2217h(20)), null, null, AbstractC30060g.m92087G(enumC23463i, new C2217h(21)), null};
    }

    public /* synthetic */ SearchableListModel(int i13, DesignSystemModel designSystemModel, List list, String str, Boolean bool, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, SearchableListModel$$serializer.INSTANCE.getDescriptor());
        }
        this.emptyResultsItem = designSystemModel;
        this.sections = list;
        this.stateUpdateSearchKey = str;
        this.isSearchActive = bool;
        if ((i13 & 16) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 32) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(SearchableSectionModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchableListModel copy$default(SearchableListModel searchableListModel, DesignSystemModel designSystemModel, List list, String str, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            designSystemModel = searchableListModel.emptyResultsItem;
        }
        if ((i13 & 2) != 0) {
            list = searchableListModel.sections;
        }
        if ((i13 & 4) != 0) {
            str = searchableListModel.stateUpdateSearchKey;
        }
        if ((i13 & 8) != 0) {
            bool = searchableListModel.isSearchActive;
        }
        return searchableListModel.copy(designSystemModel, list, str, bool);
    }

    public static final /* synthetic */ void write$Self$design_models_release(SearchableListModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.emptyResultsItem);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.sections);
        output.encodeStringElement(serialDesc, 2, self.stateUpdateSearchKey);
        output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, self.isSearchActive);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public /* bridge */ /* synthetic */ WithGeneratedBindings bind(Map map) {
        return bind((Map<String, ? extends Object>) map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DesignSystemModel getEmptyResultsItem() {
        return this.emptyResultsItem;
    }

    public final List<SearchableSectionModel> component2() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStateUpdateSearchKey() {
        return this.stateUpdateSearchKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsSearchActive() {
        return this.isSearchActive;
    }

    public final SearchableListModel copy(DesignSystemModel emptyResultsItem, List<SearchableSectionModel> sections, String stateUpdateSearchKey, Boolean isSearchActive) {
        AbstractC22676k.m65750j(emptyResultsItem, "emptyResultsItem");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(stateUpdateSearchKey, "stateUpdateSearchKey");
        return new SearchableListModel(emptyResultsItem, sections, stateUpdateSearchKey, isSearchActive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchableListModel)) {
            return false;
        }
        SearchableListModel searchableListModel = (SearchableListModel) other;
        return AbstractC22676k.m65745e(this.emptyResultsItem, searchableListModel.emptyResultsItem) && AbstractC22676k.m65745e(this.sections, searchableListModel.sections) && AbstractC22676k.m65745e(this.stateUpdateSearchKey, searchableListModel.stateUpdateSearchKey) && AbstractC22676k.m65745e(this.isSearchActive, searchableListModel.isSearchActive);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final DesignSystemModel getEmptyResultsItem() {
        return this.emptyResultsItem;
    }

    public final List<SearchableSectionModel> getSections() {
        return this.sections;
    }

    public final String getStateUpdateSearchKey() {
        return this.stateUpdateSearchKey;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11895b.m31983b(this.emptyResultsItem.hashCode() * 31, 31, this.sections), 31, this.stateUpdateSearchKey);
        Boolean bool = this.isSearchActive;
        return iM30450d + (bool == null ? 0 : bool.hashCode());
    }

    public final Boolean isSearchActive() {
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
        return "SearchableListModel(emptyResultsItem=" + this.emptyResultsItem + ", sections=" + this.sections + ", stateUpdateSearchKey=" + this.stateUpdateSearchKey + ", isSearchActive=" + this.isSearchActive + ")";
    }

    public SearchableListModel(DesignSystemModel emptyResultsItem, List<SearchableSectionModel> sections, String stateUpdateSearchKey, Boolean bool) {
        AbstractC22676k.m65750j(emptyResultsItem, "emptyResultsItem");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(stateUpdateSearchKey, "stateUpdateSearchKey");
        this.emptyResultsItem = emptyResultsItem;
        this.sections = sections;
        this.stateUpdateSearchKey = stateUpdateSearchKey;
        this.isSearchActive = bool;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public SearchableListModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        Object obj = accumulatedState.get(this.stateUpdateSearchKey);
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        String string = AbstractC39414r.m125869O0(str).toString();
        if (string.length() == 0) {
            return this;
        }
        List<SearchableSectionModel> list = this.sections;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((SearchableSectionModel) it.next()).getRows());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            List<String> searchKeys = ((SearchableRowModel) obj2).getSearchKeys();
            if (!(searchKeys instanceof Collection) || !searchKeys.isEmpty()) {
                for (String str2 : searchKeys) {
                    Locale locale = Locale.ROOT;
                    String lowerCase = str2.toLowerCase(locale);
                    AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                    String lowerCase2 = string.toLowerCase(locale);
                    AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
                    if (AbstractC39414r.m125876U(lowerCase, lowerCase2, false)) {
                        arrayList2.add(obj2);
                        break;
                    }
                }
            }
        }
        List listM74152u1 = AbstractC25265s.m74152u1(arrayList2, new Comparator() { // from class: com.whoop.design.models.items.searchable.SearchableListModel$bind$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t14, T t15) {
                String lowerCase3;
                String str3 = (String) AbstractC25265s.m74100H0(((SearchableRowModel) t14).getSearchKeys());
                String lowerCase4 = "";
                if (str3 != null) {
                    lowerCase3 = str3.toLowerCase(Locale.ROOT);
                    AbstractC22676k.m65749i(lowerCase3, "toLowerCase(...)");
                } else {
                    lowerCase3 = "";
                }
                String str4 = (String) AbstractC25265s.m74100H0(((SearchableRowModel) t15).getSearchKeys());
                if (str4 != null) {
                    lowerCase4 = str4.toLowerCase(Locale.ROOT);
                    AbstractC22676k.m65749i(lowerCase4, "toLowerCase(...)");
                }
                return AbstractC30060g.m92127q(lowerCase3, lowerCase4);
            }
        });
        boolean zIsEmpty = listM74152u1.isEmpty();
        List listM118958J = C25271y.f99162w;
        if (!zIsEmpty) {
            listM118958J = AbstractC37056f.m118958J(new SearchableSectionModel(FILTERED_SECTION_ID, listM118958J, listM74152u1));
        }
        return copy$default(this, null, listM118958J, null, Boolean.TRUE, 5, null);
    }
}
