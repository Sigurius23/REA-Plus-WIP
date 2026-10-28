package com.whoop.design.models.modal;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.calendar.archmini.C7011a;
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
@Metadata(m65680d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0002UTBK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0010\u0010\u001aJ#\u0010\u001d\u001a\u00020\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b)\u0010*JX\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b>\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\b@\u0010\"R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bB\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bD\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010G\u001a\u0004\bH\u0010*R0\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MRE\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014j\u0004\u0018\u0001`N¢\u0006\f\bO\u0012\b\bP\u0012\u0004\b\t0Q8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010I\u001a\u0004\bR\u0010K\"\u0004\bS\u0010M¨\u0006V"}, m65681d2 = {"Lcom/whoop/design/models/modal/BottomSheet;", "Lcom/whoop/design/models/modal/Modal;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "Lcom/whoop/design/models/items/NavigationBarModel;", "navigationBar", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "Lcom/whoop/design/models/modal/BottomSheetHeight;", "height", "Lcom/whoop/design/models/modal/BottomSheetFixedHeader;", "fixedHeader", "Lcom/whoop/design/models/modal/BottomSheetFixedFooter;", "fixedFooter", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/modal/BottomSheetHeight;Lcom/whoop/design/models/modal/BottomSheetFixedHeader;Lcom/whoop/design/models/modal/BottomSheetFixedFooter;)V", "", "seen0", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/modal/BottomSheetHeight;Lcom/whoop/design/models/modal/BottomSheetFixedHeader;Lcom/whoop/design/models/modal/BottomSheetFixedFooter;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/modal/BottomSheet;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/NavigationBarModel;", "component3", "()Ljava/util/List;", "component4", "()Lcom/whoop/design/models/modal/BottomSheetHeight;", "component5", "()Lcom/whoop/design/models/modal/BottomSheetFixedHeader;", "component6", "()Lcom/whoop/design/models/modal/BottomSheetFixedFooter;", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/modal/BottomSheetHeight;Lcom/whoop/design/models/modal/BottomSheetFixedHeader;Lcom/whoop/design/models/modal/BottomSheetFixedFooter;)Lcom/whoop/design/models/modal/BottomSheet;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/modal/BottomSheet;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "Lcom/whoop/design/models/items/NavigationBarModel;", "getNavigationBar", "Ljava/util/List;", "getItems", "Lcom/whoop/design/models/modal/BottomSheetHeight;", "getHeight", "Lcom/whoop/design/models/modal/BottomSheetFixedHeader;", "getFixedHeader", "Lcom/whoop/design/models/modal/BottomSheetFixedFooter;", "getFixedFooter", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BottomSheet implements Modal, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final BottomSheetFixedFooter fixedFooter;
    private final BottomSheetFixedHeader fixedHeader;
    private final BottomSheetHeight height;
    private final String id;
    private final List<DesignSystemModel> items;
    private final NavigationBarModel navigationBar;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/modal/BottomSheet$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/modal/BottomSheet;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BottomSheet$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C7011a(9)), AbstractC30060g.m92087G(enumC23463i, new C7011a(10)), null, null, AbstractC30060g.m92087G(enumC23463i, new C7011a(11)), null};
    }

    public /* synthetic */ BottomSheet(int i13, String str, NavigationBarModel navigationBarModel, List list, BottomSheetHeight bottomSheetHeight, BottomSheetFixedHeader bottomSheetFixedHeader, BottomSheetFixedFooter bottomSheetFixedFooter, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, BottomSheet$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.navigationBar = navigationBarModel;
        if ((i13 & 4) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
        if ((i13 & 8) == 0) {
            this.height = BottomSheetHeight.PARTIAL;
        } else {
            this.height = bottomSheetHeight;
        }
        if ((i13 & 16) == 0) {
            this.fixedHeader = null;
        } else {
            this.fixedHeader = bottomSheetFixedHeader;
        }
        if ((i13 & 32) == 0) {
            this.fixedFooter = null;
        } else {
            this.fixedFooter = bottomSheetFixedFooter;
        }
        if ((i13 & 64) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 128) == 0) {
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
        return BottomSheetHeight.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BottomSheet copy$default(BottomSheet bottomSheet, String str, NavigationBarModel navigationBarModel, List list, BottomSheetHeight bottomSheetHeight, BottomSheetFixedHeader bottomSheetFixedHeader, BottomSheetFixedFooter bottomSheetFixedFooter, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = bottomSheet.id;
        }
        if ((i13 & 2) != 0) {
            navigationBarModel = bottomSheet.navigationBar;
        }
        if ((i13 & 4) != 0) {
            list = bottomSheet.items;
        }
        if ((i13 & 8) != 0) {
            bottomSheetHeight = bottomSheet.height;
        }
        if ((i13 & 16) != 0) {
            bottomSheetFixedHeader = bottomSheet.fixedHeader;
        }
        if ((i13 & 32) != 0) {
            bottomSheetFixedFooter = bottomSheet.fixedFooter;
        }
        BottomSheetFixedHeader bottomSheetFixedHeader2 = bottomSheetFixedHeader;
        BottomSheetFixedFooter bottomSheetFixedFooter2 = bottomSheetFixedFooter;
        return bottomSheet.copy(str, navigationBarModel, list, bottomSheetHeight, bottomSheetFixedHeader2, bottomSheetFixedFooter2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(BottomSheet self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeNullableSerializableElement(serialDesc, 1, NavigationBarModel$$serializer.INSTANCE, self.navigationBar);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.items);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.height != BottomSheetHeight.PARTIAL) {
            output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.height);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.fixedHeader != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, BottomSheetFixedHeader$$serializer.INSTANCE, self.fixedHeader);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.fixedFooter != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, BottomSheetFixedFooter$$serializer.INSTANCE, self.fixedFooter);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
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
    public final BottomSheetHeight getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BottomSheetFixedHeader getFixedHeader() {
        return this.fixedHeader;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BottomSheetFixedFooter getFixedFooter() {
        return this.fixedFooter;
    }

    public final BottomSheet copy(String id4, NavigationBarModel navigationBar, List<? extends DesignSystemModel> items, BottomSheetHeight height, BottomSheetFixedHeader fixedHeader, BottomSheetFixedFooter fixedFooter) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(height, "height");
        return new BottomSheet(id4, navigationBar, items, height, fixedHeader, fixedFooter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomSheet)) {
            return false;
        }
        BottomSheet bottomSheet = (BottomSheet) other;
        return AbstractC22676k.m65745e(this.id, bottomSheet.id) && AbstractC22676k.m65745e(this.navigationBar, bottomSheet.navigationBar) && AbstractC22676k.m65745e(this.items, bottomSheet.items) && this.height == bottomSheet.height && AbstractC22676k.m65745e(this.fixedHeader, bottomSheet.fixedHeader) && AbstractC22676k.m65745e(this.fixedFooter, bottomSheet.fixedFooter);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final BottomSheetFixedFooter getFixedFooter() {
        return this.fixedFooter;
    }

    public final BottomSheetFixedHeader getFixedHeader() {
        return this.fixedHeader;
    }

    public final BottomSheetHeight getHeight() {
        return this.height;
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
        int iHashCode = this.id.hashCode() * 31;
        NavigationBarModel navigationBarModel = this.navigationBar;
        int iHashCode2 = (this.height.hashCode() + AbstractC11895b.m31983b((iHashCode + (navigationBarModel == null ? 0 : navigationBarModel.hashCode())) * 31, 31, this.items)) * 31;
        BottomSheetFixedHeader bottomSheetFixedHeader = this.fixedHeader;
        int iHashCode3 = (iHashCode2 + (bottomSheetFixedHeader == null ? 0 : bottomSheetFixedHeader.hashCode())) * 31;
        BottomSheetFixedFooter bottomSheetFixedFooter = this.fixedFooter;
        return iHashCode3 + (bottomSheetFixedFooter != null ? bottomSheetFixedFooter.hashCode() : 0);
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
        return "BottomSheet(id=" + this.id + ", navigationBar=" + this.navigationBar + ", items=" + this.items + ", height=" + this.height + ", fixedHeader=" + this.fixedHeader + ", fixedFooter=" + this.fixedFooter + ")";
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public BottomSheet bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return BottomSheetStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheet(String id4, NavigationBarModel navigationBarModel, List<? extends DesignSystemModel> items, BottomSheetHeight height, BottomSheetFixedHeader bottomSheetFixedHeader, BottomSheetFixedFooter bottomSheetFixedFooter) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(height, "height");
        this.id = id4;
        this.navigationBar = navigationBarModel;
        this.items = items;
        this.height = height;
        this.fixedHeader = bottomSheetFixedHeader;
        this.fixedFooter = bottomSheetFixedFooter;
    }

    public /* synthetic */ BottomSheet(String str, NavigationBarModel navigationBarModel, List list, BottomSheetHeight bottomSheetHeight, BottomSheetFixedHeader bottomSheetFixedHeader, BottomSheetFixedFooter bottomSheetFixedFooter, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, navigationBarModel, (i13 & 4) != 0 ? C25271y.f99162w : list, (i13 & 8) != 0 ? BottomSheetHeight.PARTIAL : bottomSheetHeight, (i13 & 16) != 0 ? null : bottomSheetFixedHeader, (i13 & 32) != 0 ? null : bottomSheetFixedFooter);
    }
}
