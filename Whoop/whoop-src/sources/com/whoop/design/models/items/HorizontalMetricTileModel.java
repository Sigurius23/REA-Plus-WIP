package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import w91.C36958e;
import w91.C36959f;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fBc\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010%J^\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010!J\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010%R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010;\u0012\u0004\b=\u0010>\u001a\u0004\b<\u0010'R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b?\u0010%¨\u0006B"}, m65681d2 = {"Lcom/whoop/design/models/items/HorizontalMetricTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "", "endIcon", "Lcom/whoop/design/models/items/HorizontalMetricTileFooter;", "footer", "", "Lcom/whoop/design/models/items/HorizontalMetricTileMetric;", "metrics", "Lcom/whoop/navigation/e;", "destination", "subItems", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/items/HorizontalMetricTileFooter;Ljava/util/List;Lcom/whoop/navigation/e;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/items/HorizontalMetricTileFooter;Ljava/util/List;Lcom/whoop/navigation/e;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/HorizontalMetricTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/design/models/items/HorizontalMetricTileFooter;", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/navigation/e;", "component6", "copy", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/items/HorizontalMetricTileFooter;Ljava/util/List;Lcom/whoop/navigation/e;Ljava/util/List;)Lcom/whoop/design/models/items/HorizontalMetricTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitle", "Ljava/lang/String;", "getEndIcon", "Lcom/whoop/design/models/items/HorizontalMetricTileFooter;", "getFooter", "Ljava/util/List;", "getMetrics", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "getSubItems", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HorizontalMetricTileModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final C9598e destination;
    private final String endIcon;
    private final HorizontalMetricTileFooter footer;
    private final List<HorizontalMetricTileMetric> metrics;
    private final List<DesignSystemModel> subItems;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/HorizontalMetricTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/HorizontalMetricTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HorizontalMetricTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36958e(29)), AbstractC30060g.m92087G(enumC23463i, new C36959f(0)), AbstractC30060g.m92087G(enumC23463i, new C36959f(1))};
    }

    public /* synthetic */ HorizontalMetricTileModel(int i13, TextResource textResource, String str, HorizontalMetricTileFooter horizontalMetricTileFooter, List list, C9598e c9598e, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, HorizontalMetricTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.endIcon = str;
        this.footer = horizontalMetricTileFooter;
        this.metrics = list;
        this.destination = c9598e;
        if ((i13 & 32) == 0) {
            this.subItems = null;
        } else {
            this.subItems = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(HorizontalMetricTileMetric$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HorizontalMetricTileModel copy$default(HorizontalMetricTileModel horizontalMetricTileModel, TextResource textResource, String str, HorizontalMetricTileFooter horizontalMetricTileFooter, List list, C9598e c9598e, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = horizontalMetricTileModel.title;
        }
        if ((i13 & 2) != 0) {
            str = horizontalMetricTileModel.endIcon;
        }
        if ((i13 & 4) != 0) {
            horizontalMetricTileFooter = horizontalMetricTileModel.footer;
        }
        if ((i13 & 8) != 0) {
            list = horizontalMetricTileModel.metrics;
        }
        if ((i13 & 16) != 0) {
            c9598e = horizontalMetricTileModel.destination;
        }
        if ((i13 & 32) != 0) {
            list2 = horizontalMetricTileModel.subItems;
        }
        C9598e c9598e2 = c9598e;
        List list3 = list2;
        return horizontalMetricTileModel.copy(textResource, str, horizontalMetricTileFooter, list, c9598e2, list3);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(HorizontalMetricTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.title);
        output.encodeStringElement(serialDesc, 1, self.endIcon);
        output.encodeNullableSerializableElement(serialDesc, 2, HorizontalMetricTileFooter$$serializer.INSTANCE, self.footer);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.metrics);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.destination);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.subItems == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.subItems);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HorizontalMetricTileFooter getFooter() {
        return this.footer;
    }

    public final List<HorizontalMetricTileMetric> component4() {
        return this.metrics;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final List<DesignSystemModel> component6() {
        return this.subItems;
    }

    public final HorizontalMetricTileModel copy(TextResource title, String endIcon, HorizontalMetricTileFooter footer, List<HorizontalMetricTileMetric> metrics, C9598e destination, List<? extends DesignSystemModel> subItems) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(endIcon, "endIcon");
        AbstractC22676k.m65750j(metrics, "metrics");
        return new HorizontalMetricTileModel(title, endIcon, footer, metrics, destination, subItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalMetricTileModel)) {
            return false;
        }
        HorizontalMetricTileModel horizontalMetricTileModel = (HorizontalMetricTileModel) other;
        return AbstractC22676k.m65745e(this.title, horizontalMetricTileModel.title) && AbstractC22676k.m65745e(this.endIcon, horizontalMetricTileModel.endIcon) && AbstractC22676k.m65745e(this.footer, horizontalMetricTileModel.footer) && AbstractC22676k.m65745e(this.metrics, horizontalMetricTileModel.metrics) && AbstractC22676k.m65745e(this.destination, horizontalMetricTileModel.destination) && AbstractC22676k.m65745e(this.subItems, horizontalMetricTileModel.subItems);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getEndIcon() {
        return this.endIcon;
    }

    public final HorizontalMetricTileFooter getFooter() {
        return this.footer;
    }

    public final List<HorizontalMetricTileMetric> getMetrics() {
        return this.metrics;
    }

    public final List<DesignSystemModel> getSubItems() {
        return this.subItems;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.endIcon);
        HorizontalMetricTileFooter horizontalMetricTileFooter = this.footer;
        int iM31983b = AbstractC11895b.m31983b((iM30450d + (horizontalMetricTileFooter == null ? 0 : horizontalMetricTileFooter.hashCode())) * 31, 31, this.metrics);
        C9598e c9598e = this.destination;
        int iHashCode = (iM31983b + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        List<DesignSystemModel> list = this.subItems;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.endIcon;
        HorizontalMetricTileFooter horizontalMetricTileFooter = this.footer;
        List<HorizontalMetricTileMetric> list = this.metrics;
        C9598e c9598e = this.destination;
        List<DesignSystemModel> list2 = this.subItems;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("HorizontalMetricTileModel(title=", textResource, ", endIcon=", str, ", footer=");
        sbM91845o.append(horizontalMetricTileFooter);
        sbM91845o.append(", metrics=");
        sbM91845o.append(list);
        sbM91845o.append(", destination=");
        sbM91845o.append(c9598e);
        sbM91845o.append(", subItems=");
        sbM91845o.append(list2);
        sbM91845o.append(")");
        return sbM91845o.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HorizontalMetricTileModel(TextResource title, String endIcon, HorizontalMetricTileFooter horizontalMetricTileFooter, List<HorizontalMetricTileMetric> metrics, C9598e c9598e, List<? extends DesignSystemModel> list) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(endIcon, "endIcon");
        AbstractC22676k.m65750j(metrics, "metrics");
        this.title = title;
        this.endIcon = endIcon;
        this.footer = horizontalMetricTileFooter;
        this.metrics = metrics;
        this.destination = c9598e;
        this.subItems = list;
    }

    public /* synthetic */ HorizontalMetricTileModel(TextResource textResource, String str, HorizontalMetricTileFooter horizontalMetricTileFooter, List list, C9598e c9598e, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, str, horizontalMetricTileFooter, list, c9598e, (i13 & 32) != 0 ? null : list2);
    }
}
