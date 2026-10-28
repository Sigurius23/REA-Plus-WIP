package com.whoop.health.domain.models;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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
import sh2.C32513d;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 62\u00020\u0001:\u000276B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JB\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010!¨\u00068"}, m65681d2 = {"Lcom/whoop/health/domain/models/DataVisualizationCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/health/domain/models/DataVisHeaderModel;", "header", "", "items", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;", "heartScreenerUpdatedAtInfo", "<init>", "(Lcom/whoop/health/domain/models/DataVisHeaderModel;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/health/domain/models/DataVisHeaderModel;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_release", "(Lcom/whoop/health/domain/models/DataVisualizationCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/health/domain/models/DataVisHeaderModel;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/navigation/e;", "component4", "()Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;", "copy", "(Lcom/whoop/health/domain/models/DataVisHeaderModel;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;)Lcom/whoop/health/domain/models/DataVisualizationCardModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/health/domain/models/DataVisHeaderModel;", "getHeader", "Ljava/util/List;", "getItems", "Lcom/whoop/navigation/e;", "getNavigation", "Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;", "getHeartScreenerUpdatedAtInfo", "Companion", "$serializer", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DataVisualizationCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final DataVisHeaderModel header;
    private final HeartScreenerUpdatedAtInfoModel heartScreenerUpdatedAtInfo;
    private final List<DesignSystemModel> items;
    private final C9598e navigation;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/health/domain/models/DataVisualizationCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/health/domain/models/DataVisualizationCardModel;", "serializer", "()Lwc3/c;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DataVisualizationCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C32513d(2)), AbstractC30060g.m92087G(enumC23463i, new C32513d(3)), null};
    }

    public DataVisualizationCardModel() {
        this((DataVisHeaderModel) null, (List) null, (C9598e) null, (HeartScreenerUpdatedAtInfoModel) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataVisualizationCardModel copy$default(DataVisualizationCardModel dataVisualizationCardModel, DataVisHeaderModel dataVisHeaderModel, List list, C9598e c9598e, HeartScreenerUpdatedAtInfoModel heartScreenerUpdatedAtInfoModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            dataVisHeaderModel = dataVisualizationCardModel.header;
        }
        if ((i13 & 2) != 0) {
            list = dataVisualizationCardModel.items;
        }
        if ((i13 & 4) != 0) {
            c9598e = dataVisualizationCardModel.navigation;
        }
        if ((i13 & 8) != 0) {
            heartScreenerUpdatedAtInfoModel = dataVisualizationCardModel.heartScreenerUpdatedAtInfo;
        }
        return dataVisualizationCardModel.copy(dataVisHeaderModel, list, c9598e, heartScreenerUpdatedAtInfoModel);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public static final /* synthetic */ void write$Self$health_release(DataVisualizationCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0)) {
            output.encodeSerializableElement(serialDesc, 0, DataVisHeaderModel$$serializer.INSTANCE, self.header);
        } else {
            if (!AbstractC22676k.m65745e(self.header, new DataVisHeaderModel((TextResource) null, (TextResource) null, (String) null, 7, (DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 0, DataVisHeaderModel$$serializer.INSTANCE, self.header);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.items);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.navigation != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.navigation);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.heartScreenerUpdatedAtInfo == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, HeartScreenerUpdatedAtInfoModel$$serializer.INSTANCE, self.heartScreenerUpdatedAtInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DataVisHeaderModel getHeader() {
        return this.header;
    }

    public final List<DesignSystemModel> component2() {
        return this.items;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HeartScreenerUpdatedAtInfoModel getHeartScreenerUpdatedAtInfo() {
        return this.heartScreenerUpdatedAtInfo;
    }

    public final DataVisualizationCardModel copy(DataVisHeaderModel header, List<? extends DesignSystemModel> items, C9598e navigation, HeartScreenerUpdatedAtInfoModel heartScreenerUpdatedAtInfo) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(items, "items");
        return new DataVisualizationCardModel(header, items, navigation, heartScreenerUpdatedAtInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataVisualizationCardModel)) {
            return false;
        }
        DataVisualizationCardModel dataVisualizationCardModel = (DataVisualizationCardModel) other;
        return AbstractC22676k.m65745e(this.header, dataVisualizationCardModel.header) && AbstractC22676k.m65745e(this.items, dataVisualizationCardModel.items) && AbstractC22676k.m65745e(this.navigation, dataVisualizationCardModel.navigation) && AbstractC22676k.m65745e(this.heartScreenerUpdatedAtInfo, dataVisualizationCardModel.heartScreenerUpdatedAtInfo);
    }

    public final DataVisHeaderModel getHeader() {
        return this.header;
    }

    public final HeartScreenerUpdatedAtInfoModel getHeartScreenerUpdatedAtInfo() {
        return this.heartScreenerUpdatedAtInfo;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final C9598e getNavigation() {
        return this.navigation;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.header.hashCode() * 31, 31, this.items);
        C9598e c9598e = this.navigation;
        int iHashCode = (iM31983b + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        HeartScreenerUpdatedAtInfoModel heartScreenerUpdatedAtInfoModel = this.heartScreenerUpdatedAtInfo;
        return iHashCode + (heartScreenerUpdatedAtInfoModel != null ? heartScreenerUpdatedAtInfoModel.hashCode() : 0);
    }

    public String toString() {
        return "DataVisualizationCardModel(header=" + this.header + ", items=" + this.items + ", navigation=" + this.navigation + ", heartScreenerUpdatedAtInfo=" + this.heartScreenerUpdatedAtInfo + ")";
    }

    public /* synthetic */ DataVisualizationCardModel(int i13, DataVisHeaderModel dataVisHeaderModel, List list, C9598e c9598e, HeartScreenerUpdatedAtInfoModel heartScreenerUpdatedAtInfoModel, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.header = new DataVisHeaderModel((TextResource) null, (TextResource) null, (String) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.header = dataVisHeaderModel;
        }
        if ((i13 & 2) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
        if ((i13 & 4) == 0) {
            this.navigation = null;
        } else {
            this.navigation = c9598e;
        }
        if ((i13 & 8) == 0) {
            this.heartScreenerUpdatedAtInfo = null;
        } else {
            this.heartScreenerUpdatedAtInfo = heartScreenerUpdatedAtInfoModel;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DataVisualizationCardModel(DataVisHeaderModel header, List<? extends DesignSystemModel> items, C9598e c9598e, HeartScreenerUpdatedAtInfoModel heartScreenerUpdatedAtInfoModel) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(items, "items");
        this.header = header;
        this.items = items;
        this.navigation = c9598e;
        this.heartScreenerUpdatedAtInfo = heartScreenerUpdatedAtInfoModel;
    }

    public /* synthetic */ DataVisualizationCardModel(DataVisHeaderModel dataVisHeaderModel, List list, C9598e c9598e, HeartScreenerUpdatedAtInfoModel heartScreenerUpdatedAtInfoModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            dataVisHeaderModel = new DataVisHeaderModel((TextResource) null, (TextResource) null, (String) null, 7, (DefaultConstructorMarker) null);
        }
        this(dataVisHeaderModel, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : c9598e, (i13 & 8) != 0 ? null : heartScreenerUpdatedAtInfoModel);
    }
}
