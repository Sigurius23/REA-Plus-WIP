package com.whoop.design.models.items;

import com.whoop.design.atomic.organism.horizontalscrollcontainer.HorizontalScrollBehavior;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36959f;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB[\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%JT\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010 R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010%¨\u0006="}, m65681d2 = {"Lcom/whoop/design/models/items/HorizontalScrollContainerModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "title", "", "items", "accessibilityLabel", "Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;", "scrollBehavior", "", "pagingIndicatorEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/HorizontalScrollContainerModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;Z)Lcom/whoop/design/models/items/HorizontalScrollContainerModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "Ljava/util/List;", "getItems", "getAccessibilityLabel", "getAccessibilityLabel$annotations", "()V", "Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;", "getScrollBehavior", "Z", "getPagingIndicatorEnabled", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HorizontalScrollContainerModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String accessibilityLabel;
    private final String id;
    private final List<DesignSystemModel> items;
    private final boolean pagingIndicatorEnabled;
    private final HorizontalScrollBehavior scrollBehavior;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/HorizontalScrollContainerModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/HorizontalScrollContainerModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HorizontalScrollContainerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C36959f(2)), null, AbstractC30060g.m92087G(enumC23463i, new C36959f(3)), null};
    }

    public /* synthetic */ HorizontalScrollContainerModel(int i13, String str, String str2, List list, String str3, HorizontalScrollBehavior horizontalScrollBehavior, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, HorizontalScrollContainerModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = str2;
        this.items = list;
        this.accessibilityLabel = str3;
        if ((i13 & 16) == 0) {
            this.scrollBehavior = HorizontalScrollBehavior.FREE;
        } else {
            this.scrollBehavior = horizontalScrollBehavior;
        }
        if ((i13 & 32) == 0) {
            this.pagingIndicatorEnabled = false;
        } else {
            this.pagingIndicatorEnabled = z4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return HorizontalScrollBehavior.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HorizontalScrollContainerModel copy$default(HorizontalScrollContainerModel horizontalScrollContainerModel, String str, String str2, List list, String str3, HorizontalScrollBehavior horizontalScrollBehavior, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = horizontalScrollContainerModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = horizontalScrollContainerModel.title;
        }
        if ((i13 & 4) != 0) {
            list = horizontalScrollContainerModel.items;
        }
        if ((i13 & 8) != 0) {
            str3 = horizontalScrollContainerModel.accessibilityLabel;
        }
        if ((i13 & 16) != 0) {
            horizontalScrollBehavior = horizontalScrollContainerModel.scrollBehavior;
        }
        if ((i13 & 32) != 0) {
            z4 = horizontalScrollContainerModel.pagingIndicatorEnabled;
        }
        HorizontalScrollBehavior horizontalScrollBehavior2 = horizontalScrollBehavior;
        boolean z13 = z4;
        return horizontalScrollContainerModel.copy(str, str2, list, str3, horizontalScrollBehavior2, z13);
    }

    @InterfaceC37143h("accessibility_label")
    public static /* synthetic */ void getAccessibilityLabel$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(HorizontalScrollContainerModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.title);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.items);
        output.encodeStringElement(serialDesc, 3, self.accessibilityLabel);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.scrollBehavior != HorizontalScrollBehavior.FREE) {
            output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.scrollBehavior);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.pagingIndicatorEnabled) {
            output.encodeBooleanElement(serialDesc, 5, self.pagingIndicatorEnabled);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<DesignSystemModel> component3() {
        return this.items;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HorizontalScrollBehavior getScrollBehavior() {
        return this.scrollBehavior;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getPagingIndicatorEnabled() {
        return this.pagingIndicatorEnabled;
    }

    public final HorizontalScrollContainerModel copy(String id4, String title, List<? extends DesignSystemModel> items, String accessibilityLabel, HorizontalScrollBehavior scrollBehavior, boolean pagingIndicatorEnabled) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(accessibilityLabel, "accessibilityLabel");
        AbstractC22676k.m65750j(scrollBehavior, "scrollBehavior");
        return new HorizontalScrollContainerModel(id4, title, items, accessibilityLabel, scrollBehavior, pagingIndicatorEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalScrollContainerModel)) {
            return false;
        }
        HorizontalScrollContainerModel horizontalScrollContainerModel = (HorizontalScrollContainerModel) other;
        return AbstractC22676k.m65745e(this.id, horizontalScrollContainerModel.id) && AbstractC22676k.m65745e(this.title, horizontalScrollContainerModel.title) && AbstractC22676k.m65745e(this.items, horizontalScrollContainerModel.items) && AbstractC22676k.m65745e(this.accessibilityLabel, horizontalScrollContainerModel.accessibilityLabel) && this.scrollBehavior == horizontalScrollContainerModel.scrollBehavior && this.pagingIndicatorEnabled == horizontalScrollContainerModel.pagingIndicatorEnabled;
    }

    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final boolean getPagingIndicatorEnabled() {
        return this.pagingIndicatorEnabled;
    }

    public final HorizontalScrollBehavior getScrollBehavior() {
        return this.scrollBehavior;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        return Boolean.hashCode(this.pagingIndicatorEnabled) + ((this.scrollBehavior.hashCode() + AbstractC11266d.m30450d(AbstractC11895b.m31983b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.items), 31, this.accessibilityLabel)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        List<DesignSystemModel> list = this.items;
        String str3 = this.accessibilityLabel;
        HorizontalScrollBehavior horizontalScrollBehavior = this.scrollBehavior;
        boolean z4 = this.pagingIndicatorEnabled;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HorizontalScrollContainerModel(id=", str, ", title=", str2, ", items=");
        AbstractC17176i.m48511m(", accessibilityLabel=", str3, ", scrollBehavior=", sbM32001t, list);
        sbM32001t.append(horizontalScrollBehavior);
        sbM32001t.append(", pagingIndicatorEnabled=");
        sbM32001t.append(z4);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HorizontalScrollContainerModel(String id4, String str, List<? extends DesignSystemModel> items, String accessibilityLabel, HorizontalScrollBehavior scrollBehavior, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(accessibilityLabel, "accessibilityLabel");
        AbstractC22676k.m65750j(scrollBehavior, "scrollBehavior");
        this.id = id4;
        this.title = str;
        this.items = items;
        this.accessibilityLabel = accessibilityLabel;
        this.scrollBehavior = scrollBehavior;
        this.pagingIndicatorEnabled = z4;
    }

    public /* synthetic */ HorizontalScrollContainerModel(String str, String str2, List list, String str3, HorizontalScrollBehavior horizontalScrollBehavior, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, str3, (i13 & 16) != 0 ? HorizontalScrollBehavior.FREE : horizontalScrollBehavior, (i13 & 32) != 0 ? false : z4);
    }
}
