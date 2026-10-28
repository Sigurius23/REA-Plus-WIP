package com.whoop.searcharchmini.domain.model;

import c13.AbstractC3855a;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j02.C21179y0;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b#\u0010$JP\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010$¨\u00069"}, m65681d2 = {"Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;", "", "", "searchPlaceHolderText", "", "searchDebounceMs", "loadingHintText", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$search_arch_mini_release", "(Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "component3", "component4", "()Lcom/whoop/analytics/AnalyticEventModel;", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;)Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSearchPlaceHolderText", "Ljava/lang/Long;", "getSearchDebounceMs", "getLoadingHintText", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "Ljava/util/List;", "getItems", "Companion", "$serializer", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SearchArchMiniResponse {
    private final AnalyticEventModel analyticEvent;
    private final List<DesignSystemModel> items;
    private final String loadingHintText;
    private final Long searchDebounceMs;
    private final String searchPlaceHolderText;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21179y0(8))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;", "serializer", "()Lwc3/c;", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SearchArchMiniResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SearchArchMiniResponse() {
        this((String) null, (Long) null, (String) null, (AnalyticEventModel) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchArchMiniResponse copy$default(SearchArchMiniResponse searchArchMiniResponse, String str, Long l7, String str2, AnalyticEventModel analyticEventModel, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = searchArchMiniResponse.searchPlaceHolderText;
        }
        if ((i13 & 2) != 0) {
            l7 = searchArchMiniResponse.searchDebounceMs;
        }
        if ((i13 & 4) != 0) {
            str2 = searchArchMiniResponse.loadingHintText;
        }
        if ((i13 & 8) != 0) {
            analyticEventModel = searchArchMiniResponse.analyticEvent;
        }
        if ((i13 & 16) != 0) {
            list = searchArchMiniResponse.items;
        }
        List list2 = list;
        String str3 = str2;
        return searchArchMiniResponse.copy(str, l7, str3, analyticEventModel, list2);
    }

    public static final /* synthetic */ void write$Self$search_arch_mini_release(SearchArchMiniResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.searchPlaceHolderText != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.searchPlaceHolderText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.searchDebounceMs != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, LongSerializer.INSTANCE, self.searchDebounceMs);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.loadingHintText != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.loadingHintText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.analyticEvent != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, AnalyticEventModel$$serializer.INSTANCE, self.analyticEvent);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.items);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSearchPlaceHolderText() {
        return this.searchPlaceHolderText;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getSearchDebounceMs() {
        return this.searchDebounceMs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLoadingHintText() {
        return this.loadingHintText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final List<DesignSystemModel> component5() {
        return this.items;
    }

    public final SearchArchMiniResponse copy(String searchPlaceHolderText, Long searchDebounceMs, String loadingHintText, AnalyticEventModel analyticEvent, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(items, "items");
        return new SearchArchMiniResponse(searchPlaceHolderText, searchDebounceMs, loadingHintText, analyticEvent, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchArchMiniResponse)) {
            return false;
        }
        SearchArchMiniResponse searchArchMiniResponse = (SearchArchMiniResponse) other;
        return AbstractC22676k.m65745e(this.searchPlaceHolderText, searchArchMiniResponse.searchPlaceHolderText) && AbstractC22676k.m65745e(this.searchDebounceMs, searchArchMiniResponse.searchDebounceMs) && AbstractC22676k.m65745e(this.loadingHintText, searchArchMiniResponse.loadingHintText) && AbstractC22676k.m65745e(this.analyticEvent, searchArchMiniResponse.analyticEvent) && AbstractC22676k.m65745e(this.items, searchArchMiniResponse.items);
    }

    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final String getLoadingHintText() {
        return this.loadingHintText;
    }

    public final Long getSearchDebounceMs() {
        return this.searchDebounceMs;
    }

    public final String getSearchPlaceHolderText() {
        return this.searchPlaceHolderText;
    }

    public int hashCode() {
        String str = this.searchPlaceHolderText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l7 = this.searchDebounceMs;
        int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str2 = this.loadingHintText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return this.items.hashCode() + ((iHashCode3 + (analyticEventModel != null ? analyticEventModel.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.searchPlaceHolderText;
        Long l7 = this.searchDebounceMs;
        String str2 = this.loadingHintText;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        List<DesignSystemModel> list = this.items;
        StringBuilder sb4 = new StringBuilder("SearchArchMiniResponse(searchPlaceHolderText=");
        sb4.append(str);
        sb4.append(", searchDebounceMs=");
        sb4.append(l7);
        sb4.append(", loadingHintText=");
        sb4.append(str2);
        sb4.append(", analyticEvent=");
        sb4.append(analyticEventModel);
        sb4.append(", items=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    public /* synthetic */ SearchArchMiniResponse(int i13, String str, Long l7, String str2, AnalyticEventModel analyticEventModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.searchPlaceHolderText = null;
        } else {
            this.searchPlaceHolderText = str;
        }
        if ((i13 & 2) == 0) {
            this.searchDebounceMs = null;
        } else {
            this.searchDebounceMs = l7;
        }
        if ((i13 & 4) == 0) {
            this.loadingHintText = null;
        } else {
            this.loadingHintText = str2;
        }
        if ((i13 & 8) == 0) {
            this.analyticEvent = null;
        } else {
            this.analyticEvent = analyticEventModel;
        }
        if ((i13 & 16) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchArchMiniResponse(String str, Long l7, String str2, AnalyticEventModel analyticEventModel, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(items, "items");
        this.searchPlaceHolderText = str;
        this.searchDebounceMs = l7;
        this.loadingHintText = str2;
        this.analyticEvent = analyticEventModel;
        this.items = items;
    }

    public /* synthetic */ SearchArchMiniResponse(String str, Long l7, String str2, AnalyticEventModel analyticEventModel, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : l7, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : analyticEventModel, (i13 & 16) != 0 ? C25271y.f99162w : list);
    }
}
