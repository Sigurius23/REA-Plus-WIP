package com.whoop.health.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import sh2.C32513d;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ>\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b\u0003\u0010\u001aR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b,\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001f¨\u00061"}, m65681d2 = {"Lcom/whoop/health/domain/models/HealthspanHeroMetricModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "isCalibrating", "", "items", "hasOnboarded", "", "style", "<init>", "(ZLjava/util/List;ZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/util/List;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_release", "(Lcom/whoop/health/domain/models/HealthspanHeroMetricModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/util/List;", "component3", "component4", "()Ljava/lang/String;", "copy", "(ZLjava/util/List;ZLjava/lang/String;)Lcom/whoop/health/domain/models/HealthspanHeroMetricModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/util/List;", "getItems", "getHasOnboarded", "Ljava/lang/String;", "getStyle", "Companion", "$serializer", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HealthspanHeroMetricModel implements DesignSystemModel {
    private final boolean hasOnboarded;
    private final boolean isCalibrating;
    private final List<DesignSystemModel> items;
    private final String style;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32513d(7)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/health/domain/models/HealthspanHeroMetricModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/health/domain/models/HealthspanHeroMetricModel;", "serializer", "()Lwc3/c;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HealthspanHeroMetricModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HealthspanHeroMetricModel(int i13, boolean z4, List list, boolean z13, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, HealthspanHeroMetricModel$$serializer.INSTANCE.getDescriptor());
        }
        this.isCalibrating = z4;
        this.items = list;
        this.hasOnboarded = z13;
        this.style = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthspanHeroMetricModel copy$default(HealthspanHeroMetricModel healthspanHeroMetricModel, boolean z4, List list, boolean z13, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = healthspanHeroMetricModel.isCalibrating;
        }
        if ((i13 & 2) != 0) {
            list = healthspanHeroMetricModel.items;
        }
        if ((i13 & 4) != 0) {
            z13 = healthspanHeroMetricModel.hasOnboarded;
        }
        if ((i13 & 8) != 0) {
            str = healthspanHeroMetricModel.style;
        }
        return healthspanHeroMetricModel.copy(z4, list, z13, str);
    }

    public static final /* synthetic */ void write$Self$health_release(HealthspanHeroMetricModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeBooleanElement(serialDesc, 0, self.isCalibrating);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.items);
        output.encodeBooleanElement(serialDesc, 2, self.hasOnboarded);
        output.encodeStringElement(serialDesc, 3, self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsCalibrating() {
        return this.isCalibrating;
    }

    public final List<DesignSystemModel> component2() {
        return this.items;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasOnboarded() {
        return this.hasOnboarded;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final HealthspanHeroMetricModel copy(boolean isCalibrating, List<? extends DesignSystemModel> items, boolean hasOnboarded, String style) {
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(style, "style");
        return new HealthspanHeroMetricModel(isCalibrating, items, hasOnboarded, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthspanHeroMetricModel)) {
            return false;
        }
        HealthspanHeroMetricModel healthspanHeroMetricModel = (HealthspanHeroMetricModel) other;
        return this.isCalibrating == healthspanHeroMetricModel.isCalibrating && AbstractC22676k.m65745e(this.items, healthspanHeroMetricModel.items) && this.hasOnboarded == healthspanHeroMetricModel.hasOnboarded && AbstractC22676k.m65745e(this.style, healthspanHeroMetricModel.style);
    }

    public final boolean getHasOnboarded() {
        return this.hasOnboarded;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final String getStyle() {
        return this.style;
    }

    public int hashCode() {
        return this.style.hashCode() + AbstractC2875y.m8289b(AbstractC11895b.m31983b(Boolean.hashCode(this.isCalibrating) * 31, 31, this.items), 31, this.hasOnboarded);
    }

    public final boolean isCalibrating() {
        return this.isCalibrating;
    }

    public String toString() {
        boolean z4 = this.isCalibrating;
        List<DesignSystemModel> list = this.items;
        boolean z13 = this.hasOnboarded;
        String str = this.style;
        StringBuilder sb4 = new StringBuilder("HealthspanHeroMetricModel(isCalibrating=");
        sb4.append(z4);
        sb4.append(", items=");
        sb4.append(list);
        sb4.append(", hasOnboarded=");
        return AbstractC21702c.m61139j(sb4, z13, ", style=", str, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HealthspanHeroMetricModel(boolean z4, List<? extends DesignSystemModel> items, boolean z13, String style) {
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(style, "style");
        this.isCalibrating = z4;
        this.items = items;
        this.hasOnboarded = z13;
        this.style = style;
    }
}
