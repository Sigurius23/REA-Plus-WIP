package com.whoop.health.monitor.medical.domain.model;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
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
import wi0.C37312d;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 72\u00020\u0001:\u000287BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010\"JN\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b6\u0010\"¨\u00069"}, m65681d2 = {"Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;", "header", "", "body", "", "items", "", "latestProcessedTimestamp", "trailingEcgTimeStamp", "<init>", "(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$kennel_release", "(Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/Long;", "component5", "copy", "(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;", "getHeader", "Ljava/lang/String;", "getBody", "Ljava/util/List;", "getItems", "Ljava/lang/Long;", "getLatestProcessedTimestamp", "getTrailingEcgTimeStamp", "Companion", "$serializer", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShepherdDetectionModel implements DesignSystemModel {
    private final String body;
    private final SamdCardHeaderModel header;
    private final List<DesignSystemModel> items;
    private final Long latestProcessedTimestamp;
    private final Long trailingEcgTimeStamp;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37312d(10)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;", "serializer", "()Lwc3/c;", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShepherdDetectionModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ShepherdDetectionModel() {
        this((SamdCardHeaderModel) null, (String) null, (List) null, (Long) null, (Long) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShepherdDetectionModel copy$default(ShepherdDetectionModel shepherdDetectionModel, SamdCardHeaderModel samdCardHeaderModel, String str, List list, Long l7, Long l12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            samdCardHeaderModel = shepherdDetectionModel.header;
        }
        if ((i13 & 2) != 0) {
            str = shepherdDetectionModel.body;
        }
        if ((i13 & 4) != 0) {
            list = shepherdDetectionModel.items;
        }
        if ((i13 & 8) != 0) {
            l7 = shepherdDetectionModel.latestProcessedTimestamp;
        }
        if ((i13 & 16) != 0) {
            l12 = shepherdDetectionModel.trailingEcgTimeStamp;
        }
        Long l13 = l12;
        List list2 = list;
        return shepherdDetectionModel.copy(samdCardHeaderModel, str, list2, l7, l13);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    public static final /* synthetic */ void write$Self$kennel_release(ShepherdDetectionModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0)) {
            output.encodeSerializableElement(serialDesc, 0, SamdCardHeaderModel$$serializer.INSTANCE, self.header);
        } else {
            if (!AbstractC22676k.m65745e(self.header, new SamdCardHeaderModel((TextResource) null, (String) null, (String) null, (C9598e) null, 15, (DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 0, SamdCardHeaderModel$$serializer.INSTANCE, self.header);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.body != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.body);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.items);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.latestProcessedTimestamp != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, LongSerializer.INSTANCE, self.latestProcessedTimestamp);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.trailingEcgTimeStamp == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, LongSerializer.INSTANCE, self.trailingEcgTimeStamp);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SamdCardHeaderModel getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    public final List<DesignSystemModel> component3() {
        return this.items;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getLatestProcessedTimestamp() {
        return this.latestProcessedTimestamp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getTrailingEcgTimeStamp() {
        return this.trailingEcgTimeStamp;
    }

    public final ShepherdDetectionModel copy(SamdCardHeaderModel header, String body, List<? extends DesignSystemModel> items, Long latestProcessedTimestamp, Long trailingEcgTimeStamp) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(items, "items");
        return new ShepherdDetectionModel(header, body, items, latestProcessedTimestamp, trailingEcgTimeStamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShepherdDetectionModel)) {
            return false;
        }
        ShepherdDetectionModel shepherdDetectionModel = (ShepherdDetectionModel) other;
        return AbstractC22676k.m65745e(this.header, shepherdDetectionModel.header) && AbstractC22676k.m65745e(this.body, shepherdDetectionModel.body) && AbstractC22676k.m65745e(this.items, shepherdDetectionModel.items) && AbstractC22676k.m65745e(this.latestProcessedTimestamp, shepherdDetectionModel.latestProcessedTimestamp) && AbstractC22676k.m65745e(this.trailingEcgTimeStamp, shepherdDetectionModel.trailingEcgTimeStamp);
    }

    public final String getBody() {
        return this.body;
    }

    public final SamdCardHeaderModel getHeader() {
        return this.header;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final Long getLatestProcessedTimestamp() {
        return this.latestProcessedTimestamp;
    }

    public final Long getTrailingEcgTimeStamp() {
        return this.trailingEcgTimeStamp;
    }

    public int hashCode() {
        int iHashCode = this.header.hashCode() * 31;
        String str = this.body;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.items);
        Long l7 = this.latestProcessedTimestamp;
        int iHashCode2 = (iM31983b + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l12 = this.trailingEcgTimeStamp;
        return iHashCode2 + (l12 != null ? l12.hashCode() : 0);
    }

    public String toString() {
        return "ShepherdDetectionModel(header=" + this.header + ", body=" + this.body + ", items=" + this.items + ", latestProcessedTimestamp=" + this.latestProcessedTimestamp + ", trailingEcgTimeStamp=" + this.trailingEcgTimeStamp + ")";
    }

    public /* synthetic */ ShepherdDetectionModel(int i13, SamdCardHeaderModel samdCardHeaderModel, String str, List list, Long l7, Long l12, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.header = new SamdCardHeaderModel((TextResource) null, (String) null, (String) null, (C9598e) null, 15, (DefaultConstructorMarker) null);
        } else {
            this.header = samdCardHeaderModel;
        }
        if ((i13 & 2) == 0) {
            this.body = null;
        } else {
            this.body = str;
        }
        if ((i13 & 4) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
        if ((i13 & 8) == 0) {
            this.latestProcessedTimestamp = null;
        } else {
            this.latestProcessedTimestamp = l7;
        }
        if ((i13 & 16) == 0) {
            this.trailingEcgTimeStamp = null;
        } else {
            this.trailingEcgTimeStamp = l12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShepherdDetectionModel(SamdCardHeaderModel header, String str, List<? extends DesignSystemModel> items, Long l7, Long l12) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(items, "items");
        this.header = header;
        this.body = str;
        this.items = items;
        this.latestProcessedTimestamp = l7;
        this.trailingEcgTimeStamp = l12;
    }

    public /* synthetic */ ShepherdDetectionModel(SamdCardHeaderModel samdCardHeaderModel, String str, List list, Long l7, Long l12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new SamdCardHeaderModel((TextResource) null, (String) null, (String) null, (C9598e) null, 15, (DefaultConstructorMarker) null) : samdCardHeaderModel, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? C25271y.f99162w : list, (i13 & 8) != 0 ? null : l7, (i13 & 16) != 0 ? null : l12);
    }
}
