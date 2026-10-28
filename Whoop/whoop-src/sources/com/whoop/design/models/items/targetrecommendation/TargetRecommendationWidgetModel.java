package com.whoop.design.models.items.targetrecommendation;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.calendar.archmini.C7011a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
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
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bBO\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJF\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b1\u0010\u001f¨\u00064"}, m65681d2 = {"Lcom/whoop/design/models/items/targetrecommendation/TargetRecommendationWidgetModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/items/targetrecommendation/WidgetStatus;", NotificationCompat.CATEGORY_STATUS, "", "targetBatchId", "", "body", "Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButton;", "footerButtons", "<init>", "(Lcom/whoop/design/models/items/targetrecommendation/WidgetStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/targetrecommendation/WidgetStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/targetrecommendation/TargetRecommendationWidgetModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/targetrecommendation/WidgetStatus;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "copy", "(Lcom/whoop/design/models/items/targetrecommendation/WidgetStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/whoop/design/models/items/targetrecommendation/TargetRecommendationWidgetModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/targetrecommendation/WidgetStatus;", "getStatus", "Ljava/lang/String;", "getTargetBatchId", "Ljava/util/List;", "getBody", "getFooterButtons", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TargetRecommendationWidgetModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<DesignSystemModel> body;
    private final List<WidgetFooterButton> footerButtons;
    private final WidgetStatus status;
    private final String targetBatchId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/targetrecommendation/TargetRecommendationWidgetModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/targetrecommendation/TargetRecommendationWidgetModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TargetRecommendationWidgetModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C7011a(3)), AbstractC30060g.m92087G(enumC23463i, new C7011a(4))};
    }

    public TargetRecommendationWidgetModel() {
        this((WidgetStatus) null, (String) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(WidgetFooterButton$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TargetRecommendationWidgetModel copy$default(TargetRecommendationWidgetModel targetRecommendationWidgetModel, WidgetStatus widgetStatus, String str, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            widgetStatus = targetRecommendationWidgetModel.status;
        }
        if ((i13 & 2) != 0) {
            str = targetRecommendationWidgetModel.targetBatchId;
        }
        if ((i13 & 4) != 0) {
            list = targetRecommendationWidgetModel.body;
        }
        if ((i13 & 8) != 0) {
            list2 = targetRecommendationWidgetModel.footerButtons;
        }
        return targetRecommendationWidgetModel.copy(widgetStatus, str, list, list2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(TargetRecommendationWidgetModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.status != WidgetStatus.ENABLED) {
            output.encodeSerializableElement(serialDesc, 0, WidgetStatus.INSTANCE.serializer(), self.status);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.targetBatchId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.targetBatchId);
        }
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 2);
        C25271y c25271y = C25271y.f99162w;
        if (zShouldEncodeElementDefault || !AbstractC22676k.m65745e(self.body, c25271y)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.body);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && AbstractC22676k.m65745e(self.footerButtons, c25271y)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.footerButtons);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WidgetStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTargetBatchId() {
        return this.targetBatchId;
    }

    public final List<DesignSystemModel> component3() {
        return this.body;
    }

    public final List<WidgetFooterButton> component4() {
        return this.footerButtons;
    }

    public final TargetRecommendationWidgetModel copy(WidgetStatus status, String targetBatchId, List<? extends DesignSystemModel> body, List<WidgetFooterButton> footerButtons) {
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(footerButtons, "footerButtons");
        return new TargetRecommendationWidgetModel(status, targetBatchId, body, footerButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TargetRecommendationWidgetModel)) {
            return false;
        }
        TargetRecommendationWidgetModel targetRecommendationWidgetModel = (TargetRecommendationWidgetModel) other;
        return this.status == targetRecommendationWidgetModel.status && AbstractC22676k.m65745e(this.targetBatchId, targetRecommendationWidgetModel.targetBatchId) && AbstractC22676k.m65745e(this.body, targetRecommendationWidgetModel.body) && AbstractC22676k.m65745e(this.footerButtons, targetRecommendationWidgetModel.footerButtons);
    }

    public final List<DesignSystemModel> getBody() {
        return this.body;
    }

    public final List<WidgetFooterButton> getFooterButtons() {
        return this.footerButtons;
    }

    public final WidgetStatus getStatus() {
        return this.status;
    }

    public final String getTargetBatchId() {
        return this.targetBatchId;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        String str = this.targetBatchId;
        return this.footerButtons.hashCode() + AbstractC11895b.m31983b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.body);
    }

    public String toString() {
        WidgetStatus widgetStatus = this.status;
        String str = this.targetBatchId;
        List<DesignSystemModel> list = this.body;
        List<WidgetFooterButton> list2 = this.footerButtons;
        StringBuilder sb4 = new StringBuilder("TargetRecommendationWidgetModel(status=");
        sb4.append(widgetStatus);
        sb4.append(", targetBatchId=");
        sb4.append(str);
        sb4.append(", body=");
        return AbstractC30007c.m91843m(sb4, list, ", footerButtons=", list2, ")");
    }

    public /* synthetic */ TargetRecommendationWidgetModel(int i13, WidgetStatus widgetStatus, String str, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.status = (i13 & 1) == 0 ? WidgetStatus.ENABLED : widgetStatus;
        if ((i13 & 2) == 0) {
            this.targetBatchId = null;
        } else {
            this.targetBatchId = str;
        }
        int i14 = i13 & 4;
        C25271y c25271y = C25271y.f99162w;
        if (i14 == 0) {
            this.body = c25271y;
        } else {
            this.body = list;
        }
        if ((i13 & 8) == 0) {
            this.footerButtons = c25271y;
        } else {
            this.footerButtons = list2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TargetRecommendationWidgetModel(WidgetStatus status, String str, List<? extends DesignSystemModel> body, List<WidgetFooterButton> footerButtons) {
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(footerButtons, "footerButtons");
        this.status = status;
        this.targetBatchId = str;
        this.body = body;
        this.footerButtons = footerButtons;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TargetRecommendationWidgetModel(WidgetStatus widgetStatus, String str, List list, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        widgetStatus = (i13 & 1) != 0 ? WidgetStatus.ENABLED : widgetStatus;
        str = (i13 & 2) != 0 ? null : str;
        int i14 = i13 & 4;
        C25271y c25271y = C25271y.f99162w;
        this(widgetStatus, str, i14 != 0 ? c25271y : list, (i13 & 8) != 0 ? c25271y : list2);
    }
}
