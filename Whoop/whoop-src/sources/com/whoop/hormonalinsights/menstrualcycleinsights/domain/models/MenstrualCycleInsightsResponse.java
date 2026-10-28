package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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
import qo1.C30526a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB]\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(JV\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001fJ\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010(¨\u0006?"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;", "", "", "navigationTitle", "style", "", "Lcom/whoop/design/models/DesignSystemModel;", "tiles", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodBottomSheet;", "logPeriodBottomSheet", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;", "editingHiddenCycleModal", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MetaData;", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodBottomSheet;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MetaData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodBottomSheet;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodBottomSheet;", "component5", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;", "component6", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MetaData;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodBottomSheet;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MetaData;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNavigationTitle", "getStyle", "Ljava/util/List;", "getTiles", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodBottomSheet;", "getLogPeriodBottomSheet", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;", "getEditingHiddenCycleModal", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MetaData;", "getMetadata", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MenstrualCycleInsightsResponse {
    private final HormonalInsightsConfirmDialog editingHiddenCycleModal;
    private final LogPeriodBottomSheet logPeriodBottomSheet;
    private final MetaData metadata;
    private final String navigationTitle;
    private final String style;
    private final List<DesignSystemModel> tiles;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C30526a(29)), null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MenstrualCycleInsightsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MenstrualCycleInsightsResponse(int i13, String str, String str2, List list, LogPeriodBottomSheet logPeriodBottomSheet, HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog, MetaData metaData, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, MenstrualCycleInsightsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationTitle = str;
        this.style = str2;
        this.tiles = list;
        this.logPeriodBottomSheet = logPeriodBottomSheet;
        this.editingHiddenCycleModal = hormonalInsightsConfirmDialog;
        this.metadata = metaData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MenstrualCycleInsightsResponse copy$default(MenstrualCycleInsightsResponse menstrualCycleInsightsResponse, String str, String str2, List list, LogPeriodBottomSheet logPeriodBottomSheet, HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog, MetaData metaData, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = menstrualCycleInsightsResponse.navigationTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = menstrualCycleInsightsResponse.style;
        }
        if ((i13 & 4) != 0) {
            list = menstrualCycleInsightsResponse.tiles;
        }
        if ((i13 & 8) != 0) {
            logPeriodBottomSheet = menstrualCycleInsightsResponse.logPeriodBottomSheet;
        }
        if ((i13 & 16) != 0) {
            hormonalInsightsConfirmDialog = menstrualCycleInsightsResponse.editingHiddenCycleModal;
        }
        if ((i13 & 32) != 0) {
            metaData = menstrualCycleInsightsResponse.metadata;
        }
        HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog2 = hormonalInsightsConfirmDialog;
        MetaData metaData2 = metaData;
        return menstrualCycleInsightsResponse.copy(str, str2, list, logPeriodBottomSheet, hormonalInsightsConfirmDialog2, metaData2);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(MenstrualCycleInsightsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.navigationTitle);
        output.encodeStringElement(serialDesc, 1, self.style);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.tiles);
        output.encodeNullableSerializableElement(serialDesc, 3, LogPeriodBottomSheet$$serializer.INSTANCE, self.logPeriodBottomSheet);
        output.encodeSerializableElement(serialDesc, 4, HormonalInsightsConfirmDialog$$serializer.INSTANCE, self.editingHiddenCycleModal);
        output.encodeNullableSerializableElement(serialDesc, 5, MetaData$$serializer.INSTANCE, self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final List<DesignSystemModel> component3() {
        return this.tiles;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LogPeriodBottomSheet getLogPeriodBottomSheet() {
        return this.logPeriodBottomSheet;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HormonalInsightsConfirmDialog getEditingHiddenCycleModal() {
        return this.editingHiddenCycleModal;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final MenstrualCycleInsightsResponse copy(String navigationTitle, String style, List<? extends DesignSystemModel> tiles, LogPeriodBottomSheet logPeriodBottomSheet, HormonalInsightsConfirmDialog editingHiddenCycleModal, MetaData metadata) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(tiles, "tiles");
        AbstractC22676k.m65750j(editingHiddenCycleModal, "editingHiddenCycleModal");
        return new MenstrualCycleInsightsResponse(navigationTitle, style, tiles, logPeriodBottomSheet, editingHiddenCycleModal, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstrualCycleInsightsResponse)) {
            return false;
        }
        MenstrualCycleInsightsResponse menstrualCycleInsightsResponse = (MenstrualCycleInsightsResponse) other;
        return AbstractC22676k.m65745e(this.navigationTitle, menstrualCycleInsightsResponse.navigationTitle) && AbstractC22676k.m65745e(this.style, menstrualCycleInsightsResponse.style) && AbstractC22676k.m65745e(this.tiles, menstrualCycleInsightsResponse.tiles) && AbstractC22676k.m65745e(this.logPeriodBottomSheet, menstrualCycleInsightsResponse.logPeriodBottomSheet) && AbstractC22676k.m65745e(this.editingHiddenCycleModal, menstrualCycleInsightsResponse.editingHiddenCycleModal) && AbstractC22676k.m65745e(this.metadata, menstrualCycleInsightsResponse.metadata);
    }

    public final HormonalInsightsConfirmDialog getEditingHiddenCycleModal() {
        return this.editingHiddenCycleModal;
    }

    public final LogPeriodBottomSheet getLogPeriodBottomSheet() {
        return this.logPeriodBottomSheet;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final String getStyle() {
        return this.style;
    }

    public final List<DesignSystemModel> getTiles() {
        return this.tiles;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.navigationTitle.hashCode() * 31, 31, this.style), 31, this.tiles);
        LogPeriodBottomSheet logPeriodBottomSheet = this.logPeriodBottomSheet;
        int iHashCode = (this.editingHiddenCycleModal.hashCode() + ((iM31983b + (logPeriodBottomSheet == null ? 0 : logPeriodBottomSheet.hashCode())) * 31)) * 31;
        MetaData metaData = this.metadata;
        return iHashCode + (metaData != null ? metaData.hashCode() : 0);
    }

    public String toString() {
        String str = this.navigationTitle;
        String str2 = this.style;
        List<DesignSystemModel> list = this.tiles;
        LogPeriodBottomSheet logPeriodBottomSheet = this.logPeriodBottomSheet;
        HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog = this.editingHiddenCycleModal;
        MetaData metaData = this.metadata;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MenstrualCycleInsightsResponse(navigationTitle=", str, ", style=", str2, ", tiles=");
        sbM32001t.append(list);
        sbM32001t.append(", logPeriodBottomSheet=");
        sbM32001t.append(logPeriodBottomSheet);
        sbM32001t.append(", editingHiddenCycleModal=");
        sbM32001t.append(hormonalInsightsConfirmDialog);
        sbM32001t.append(", metadata=");
        sbM32001t.append(metaData);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MenstrualCycleInsightsResponse(String navigationTitle, String style, List<? extends DesignSystemModel> tiles, LogPeriodBottomSheet logPeriodBottomSheet, HormonalInsightsConfirmDialog editingHiddenCycleModal, MetaData metaData) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(tiles, "tiles");
        AbstractC22676k.m65750j(editingHiddenCycleModal, "editingHiddenCycleModal");
        this.navigationTitle = navigationTitle;
        this.style = style;
        this.tiles = tiles;
        this.logPeriodBottomSheet = logPeriodBottomSheet;
        this.editingHiddenCycleModal = editingHiddenCycleModal;
        this.metadata = metaData;
    }
}
