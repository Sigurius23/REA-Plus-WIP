package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import w91.C36958e;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001e¨\u00063"}, m65681d2 = {"Lcom/whoop/design/models/items/HealthMonitorCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "", "Lcom/whoop/design/models/items/HealthMonitorMetricModel;", "metrics", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/HealthMonitorCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/HealthMonitorCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getMetrics", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HealthMonitorCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final C9598e destination;
    private final List<HealthMonitorMetricModel> metrics;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/HealthMonitorCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/HealthMonitorCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HealthMonitorCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C36958e(16)), AbstractC30060g.m92087G(enumC23463i, new C36958e(17))};
    }

    public HealthMonitorCardModel() {
        this((String) null, (List) null, (C9598e) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(HealthMonitorMetricModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthMonitorCardModel copy$default(HealthMonitorCardModel healthMonitorCardModel, String str, List list, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = healthMonitorCardModel.title;
        }
        if ((i13 & 2) != 0) {
            list = healthMonitorCardModel.metrics;
        }
        if ((i13 & 4) != 0) {
            c9598e = healthMonitorCardModel.destination;
        }
        return healthMonitorCardModel.copy(str, list, c9598e);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(HealthMonitorCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 0, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.metrics, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.metrics);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.destination == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<HealthMonitorMetricModel> component2() {
        return this.metrics;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final HealthMonitorCardModel copy(String title, List<HealthMonitorMetricModel> metrics, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(metrics, "metrics");
        return new HealthMonitorCardModel(title, metrics, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthMonitorCardModel)) {
            return false;
        }
        HealthMonitorCardModel healthMonitorCardModel = (HealthMonitorCardModel) other;
        return AbstractC22676k.m65745e(this.title, healthMonitorCardModel.title) && AbstractC22676k.m65745e(this.metrics, healthMonitorCardModel.metrics) && AbstractC22676k.m65745e(this.destination, healthMonitorCardModel.destination);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final List<HealthMonitorMetricModel> getMetrics() {
        return this.metrics;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.metrics);
        C9598e c9598e = this.destination;
        return iM31983b + (c9598e == null ? 0 : c9598e.hashCode());
    }

    public String toString() {
        String str = this.title;
        List<HealthMonitorMetricModel> list = this.metrics;
        return AbstractC33745d.m106656o(AbstractC30802r.m94766o("HealthMonitorCardModel(title=", str, ", metrics=", ", destination=", list), this.destination, ")");
    }

    public /* synthetic */ HealthMonitorCardModel(int i13, String str, List list, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        this.title = (i13 & 1) == 0 ? "" : str;
        if ((i13 & 2) == 0) {
            this.metrics = C25271y.f99162w;
        } else {
            this.metrics = list;
        }
        if ((i13 & 4) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
    }

    public HealthMonitorCardModel(String title, List<HealthMonitorMetricModel> metrics, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(metrics, "metrics");
        this.title = title;
        this.metrics = metrics;
        this.destination = c9598e;
    }

    public /* synthetic */ HealthMonitorCardModel(String str, List list, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : c9598e);
    }
}
