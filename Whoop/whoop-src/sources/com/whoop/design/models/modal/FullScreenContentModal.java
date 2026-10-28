package com.whoop.design.models.modal;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.calendar.archmini.C7011a;
import com.whoop.design.models.items.FooterModel;
import com.whoop.design.models.items.FooterModel$$serializer;
import com.whoop.design.models.items.NavigationBarModel;
import com.whoop.design.models.items.NavigationBarModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0002LKB?\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eB\u007f\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\r\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010#\u001a\u00020\u00002\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u0011H\u0016¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b-\u0010&JP\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b0\u0010&J\u0010\u00101\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b5\u00106R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b8\u0010&R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b:\u0010(R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b?\u0010&R0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DRE\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`E¢\u0006\f\bF\u0012\b\bG\u0012\u0004\b\t0H8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010@\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010D¨\u0006M"}, m65681d2 = {"Lcom/whoop/design/models/modal/FullScreenContentModal;", "Lcom/whoop/design/models/modal/Modal;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "Lcom/whoop/design/models/items/NavigationBarModel;", "navigationBar", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "Lcom/whoop/design/models/items/FooterModel;", "footer", "backgroundImageUrl", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Ljava/lang/String;)V", "", "seen0", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/modal/FullScreenContentModal;Lzc3/c;Lyc3/g;)V", "write$Self", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/modal/FullScreenContentModal;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/NavigationBarModel;", "component3", "()Ljava/util/List;", "component4", "()Lcom/whoop/design/models/items/FooterModel;", "component5", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Ljava/lang/String;)Lcom/whoop/design/models/modal/FullScreenContentModal;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/whoop/design/models/items/NavigationBarModel;", "getNavigationBar", "Ljava/util/List;", "getItems", "Lcom/whoop/design/models/items/FooterModel;", "getFooter", "getBackgroundImageUrl", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FullScreenContentModal implements Modal, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private final String backgroundImageUrl;
    private Map<String, String> bindings;
    private final FooterModel footer;
    private final String id;
    private final List<DesignSystemModel> items;
    private final NavigationBarModel navigationBar;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/modal/FullScreenContentModal$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/modal/FullScreenContentModal;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FullScreenContentModal$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C7011a(22)), null, null, AbstractC30060g.m92087G(enumC23463i, new C7011a(23)), null};
    }

    public /* synthetic */ FullScreenContentModal(int i13, String str, NavigationBarModel navigationBarModel, List list, FooterModel footerModel, String str2, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (27 != (i13 & 27)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 27, FullScreenContentModal$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.navigationBar = navigationBarModel;
        if ((i13 & 4) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
        this.footer = footerModel;
        this.backgroundImageUrl = str2;
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
    public static /* synthetic */ FullScreenContentModal copy$default(FullScreenContentModal fullScreenContentModal, String str, NavigationBarModel navigationBarModel, List list, FooterModel footerModel, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = fullScreenContentModal.id;
        }
        if ((i13 & 2) != 0) {
            navigationBarModel = fullScreenContentModal.navigationBar;
        }
        if ((i13 & 4) != 0) {
            list = fullScreenContentModal.items;
        }
        if ((i13 & 8) != 0) {
            footerModel = fullScreenContentModal.footer;
        }
        if ((i13 & 16) != 0) {
            str2 = fullScreenContentModal.backgroundImageUrl;
        }
        String str3 = str2;
        List list2 = list;
        return fullScreenContentModal.copy(str, navigationBarModel, list2, footerModel, str3);
    }

    public static final /* synthetic */ void write$Self$design_models_release(FullScreenContentModal self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.id);
        output.encodeNullableSerializableElement(serialDesc, 1, NavigationBarModel$$serializer.INSTANCE, self.navigationBar);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.items);
        }
        output.encodeNullableSerializableElement(serialDesc, 3, FooterModel$$serializer.INSTANCE, self.footer);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.backgroundImageUrl);
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
    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public final List<DesignSystemModel> component3() {
        return this.items;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FooterModel getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final FullScreenContentModal copy(String id4, NavigationBarModel navigationBar, List<? extends DesignSystemModel> items, FooterModel footer, String backgroundImageUrl) {
        AbstractC22676k.m65750j(items, "items");
        return new FullScreenContentModal(id4, navigationBar, items, footer, backgroundImageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FullScreenContentModal)) {
            return false;
        }
        FullScreenContentModal fullScreenContentModal = (FullScreenContentModal) other;
        return AbstractC22676k.m65745e(this.id, fullScreenContentModal.id) && AbstractC22676k.m65745e(this.navigationBar, fullScreenContentModal.navigationBar) && AbstractC22676k.m65745e(this.items, fullScreenContentModal.items) && AbstractC22676k.m65745e(this.footer, fullScreenContentModal.footer) && AbstractC22676k.m65745e(this.backgroundImageUrl, fullScreenContentModal.backgroundImageUrl);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final FooterModel getFooter() {
        return this.footer;
    }

    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        NavigationBarModel navigationBarModel = this.navigationBar;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (navigationBarModel == null ? 0 : navigationBarModel.hashCode())) * 31, 31, this.items);
        FooterModel footerModel = this.footer;
        int iHashCode2 = (iM31983b + (footerModel == null ? 0 : footerModel.hashCode())) * 31;
        String str2 = this.backgroundImageUrl;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
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
        NavigationBarModel navigationBarModel = this.navigationBar;
        List<DesignSystemModel> list = this.items;
        FooterModel footerModel = this.footer;
        String str2 = this.backgroundImageUrl;
        StringBuilder sb4 = new StringBuilder("FullScreenContentModal(id=");
        sb4.append(str);
        sb4.append(", navigationBar=");
        sb4.append(navigationBarModel);
        sb4.append(", items=");
        sb4.append(list);
        sb4.append(", footer=");
        sb4.append(footerModel);
        sb4.append(", backgroundImageUrl=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public FullScreenContentModal bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return FullScreenContentModalStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FullScreenContentModal(String str, NavigationBarModel navigationBarModel, List<? extends DesignSystemModel> items, FooterModel footerModel, String str2) {
        AbstractC22676k.m65750j(items, "items");
        this.id = str;
        this.navigationBar = navigationBarModel;
        this.items = items;
        this.footer = footerModel;
        this.backgroundImageUrl = str2;
    }

    public /* synthetic */ FullScreenContentModal(String str, NavigationBarModel navigationBarModel, List list, FooterModel footerModel, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, navigationBarModel, (i13 & 4) != 0 ? C25271y.f99162w : list, footerModel, str2);
    }
}
