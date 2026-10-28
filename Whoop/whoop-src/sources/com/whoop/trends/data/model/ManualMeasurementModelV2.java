package com.whoop.trends.data.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import wi0.C37312d;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 V2\u00020\u0001:\u0002WVBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u008d\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0086\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001aJ\u0010\u0010+\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101J'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b8\u00109R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010;\u0012\u0004\b=\u0010>\u001a\u0004\b<\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010;\u0012\u0004\b@\u0010>\u001a\u0004\b?\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010;\u0012\u0004\bB\u0010>\u001a\u0004\bA\u0010\u001aR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010;\u0012\u0004\bD\u0010>\u001a\u0004\bC\u0010\u001aR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010E\u0012\u0004\bG\u0010>\u001a\u0004\bF\u0010\u001fR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010;\u0012\u0004\bI\u0010>\u001a\u0004\bH\u0010\u001aR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010;\u0012\u0004\bK\u0010>\u001a\u0004\bJ\u0010\u001aR \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010;\u0012\u0004\bM\u0010>\u001a\u0004\bL\u0010\u001aR \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010;\u0012\u0004\bO\u0010>\u001a\u0004\bN\u0010\u001aR&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010P\u0012\u0004\bR\u0010>\u001a\u0004\bQ\u0010%R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010S\u0012\u0004\bU\u0010>\u001a\u0004\bT\u0010'¨\u0006X"}, m65681d2 = {"Lcom/whoop/trends/data/model/ManualMeasurementModelV2;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "timestamp", "startDateTimestamp", "measurementTitle", "", "vo2MaxValue", "vo2MaxUnit", "deleteTitle", "saveTitle", "selectedSource", "", "Lcom/whoop/trends/data/model/TrendMenuSheetSourceItem;", "sourceItems", "Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;", "confirmDialog", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()D", "component6", "component7", "component8", "component9", "component10", "()Ljava/util/List;", "component11", "()Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;)Lcom/whoop/trends/data/model/ManualMeasurementModelV2;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/ManualMeasurementModelV2;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getTimestamp", "getTimestamp$annotations", "getStartDateTimestamp", "getStartDateTimestamp$annotations", "getMeasurementTitle", "getMeasurementTitle$annotations", "D", "getVo2MaxValue", "getVo2MaxValue$annotations", "getVo2MaxUnit", "getVo2MaxUnit$annotations", "getDeleteTitle", "getDeleteTitle$annotations", "getSaveTitle", "getSaveTitle$annotations", "getSelectedSource", "getSelectedSource$annotations", "Ljava/util/List;", "getSourceItems", "getSourceItems$annotations", "Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;", "getConfirmDialog", "getConfirmDialog$annotations", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ManualMeasurementModelV2 implements DesignSystemModel {

    @SerializedName("confirm_dialog")
    private final TrendMenuSheetConfirmDialog confirmDialog;

    @SerializedName("delete_title")
    private final String deleteTitle;

    @SerializedName("measurement_title")
    private final String measurementTitle;

    @SerializedName("save_title")
    private final String saveTitle;

    @SerializedName("selected_source")
    private final String selectedSource;

    @SerializedName("source_items")
    private final List<TrendMenuSheetSourceItem> sourceItems;

    @SerializedName("start_date_timestamp")
    private final String startDateTimestamp;

    @SerializedName("timestamp")
    private final String timestamp;

    @SerializedName("title")
    private final String title;

    @SerializedName("vo2_max_unit")
    private final String vo2MaxUnit;

    @SerializedName("vo2_max_value")
    private final double vo2MaxValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37312d(20)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/ManualMeasurementModelV2$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/ManualMeasurementModelV2;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ManualMeasurementModelV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ManualMeasurementModelV2(int i13, String str, String str2, String str3, String str4, double d3, String str5, String str6, String str7, String str8, List list, TrendMenuSheetConfirmDialog trendMenuSheetConfirmDialog, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i13 & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2047, ManualMeasurementModelV2$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.timestamp = str2;
        this.startDateTimestamp = str3;
        this.measurementTitle = str4;
        this.vo2MaxValue = d3;
        this.vo2MaxUnit = str5;
        this.deleteTitle = str6;
        this.saveTitle = str7;
        this.selectedSource = str8;
        this.sourceItems = list;
        this.confirmDialog = trendMenuSheetConfirmDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(TrendMenuSheetSourceItem$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ManualMeasurementModelV2 copy$default(ManualMeasurementModelV2 manualMeasurementModelV2, String str, String str2, String str3, String str4, double d3, String str5, String str6, String str7, String str8, List list, TrendMenuSheetConfirmDialog trendMenuSheetConfirmDialog, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = manualMeasurementModelV2.title;
        }
        if ((i13 & 2) != 0) {
            str2 = manualMeasurementModelV2.timestamp;
        }
        if ((i13 & 4) != 0) {
            str3 = manualMeasurementModelV2.startDateTimestamp;
        }
        if ((i13 & 8) != 0) {
            str4 = manualMeasurementModelV2.measurementTitle;
        }
        if ((i13 & 16) != 0) {
            d3 = manualMeasurementModelV2.vo2MaxValue;
        }
        if ((i13 & 32) != 0) {
            str5 = manualMeasurementModelV2.vo2MaxUnit;
        }
        if ((i13 & 64) != 0) {
            str6 = manualMeasurementModelV2.deleteTitle;
        }
        if ((i13 & 128) != 0) {
            str7 = manualMeasurementModelV2.saveTitle;
        }
        if ((i13 & 256) != 0) {
            str8 = manualMeasurementModelV2.selectedSource;
        }
        if ((i13 & 512) != 0) {
            list = manualMeasurementModelV2.sourceItems;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            trendMenuSheetConfirmDialog = manualMeasurementModelV2.confirmDialog;
        }
        List list2 = list;
        TrendMenuSheetConfirmDialog trendMenuSheetConfirmDialog2 = trendMenuSheetConfirmDialog;
        double d14 = d3;
        String str9 = str3;
        String str10 = str4;
        return manualMeasurementModelV2.copy(str, str2, str9, str10, d14, str5, str6, str7, str8, list2, trendMenuSheetConfirmDialog2);
    }

    @InterfaceC37143h("confirm_dialog")
    public static /* synthetic */ void getConfirmDialog$annotations() {
    }

    @InterfaceC37143h("delete_title")
    public static /* synthetic */ void getDeleteTitle$annotations() {
    }

    @InterfaceC37143h("measurement_title")
    public static /* synthetic */ void getMeasurementTitle$annotations() {
    }

    @InterfaceC37143h("save_title")
    public static /* synthetic */ void getSaveTitle$annotations() {
    }

    @InterfaceC37143h("selected_source")
    public static /* synthetic */ void getSelectedSource$annotations() {
    }

    @InterfaceC37143h("source_items")
    public static /* synthetic */ void getSourceItems$annotations() {
    }

    @InterfaceC37143h("start_date_timestamp")
    public static /* synthetic */ void getStartDateTimestamp$annotations() {
    }

    @InterfaceC37143h("timestamp")
    public static /* synthetic */ void getTimestamp$annotations() {
    }

    @InterfaceC37143h("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @InterfaceC37143h("vo2_max_unit")
    public static /* synthetic */ void getVo2MaxUnit$annotations() {
    }

    @InterfaceC37143h("vo2_max_value")
    public static /* synthetic */ void getVo2MaxValue$annotations() {
    }

    public static final /* synthetic */ void write$Self$trends_release(ManualMeasurementModelV2 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.timestamp);
        output.encodeStringElement(serialDesc, 2, self.startDateTimestamp);
        output.encodeStringElement(serialDesc, 3, self.measurementTitle);
        output.encodeDoubleElement(serialDesc, 4, self.vo2MaxValue);
        output.encodeStringElement(serialDesc, 5, self.vo2MaxUnit);
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.deleteTitle);
        output.encodeStringElement(serialDesc, 7, self.saveTitle);
        output.encodeStringElement(serialDesc, 8, self.selectedSource);
        output.encodeSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.sourceItems);
        output.encodeSerializableElement(serialDesc, 10, TrendMenuSheetConfirmDialog$$serializer.INSTANCE, self.confirmDialog);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<TrendMenuSheetSourceItem> component10() {
        return this.sourceItems;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final TrendMenuSheetConfirmDialog getConfirmDialog() {
        return this.confirmDialog;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMeasurementTitle() {
        return this.measurementTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getVo2MaxValue() {
        return this.vo2MaxValue;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getVo2MaxUnit() {
        return this.vo2MaxUnit;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeleteTitle() {
        return this.deleteTitle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSaveTitle() {
        return this.saveTitle;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSelectedSource() {
        return this.selectedSource;
    }

    public final ManualMeasurementModelV2 copy(String title, String timestamp, String startDateTimestamp, String measurementTitle, double vo2MaxValue, String vo2MaxUnit, String deleteTitle, String saveTitle, String selectedSource, List<TrendMenuSheetSourceItem> sourceItems, TrendMenuSheetConfirmDialog confirmDialog) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(timestamp, "timestamp");
        AbstractC22676k.m65750j(startDateTimestamp, "startDateTimestamp");
        AbstractC22676k.m65750j(measurementTitle, "measurementTitle");
        AbstractC22676k.m65750j(vo2MaxUnit, "vo2MaxUnit");
        AbstractC22676k.m65750j(saveTitle, "saveTitle");
        AbstractC22676k.m65750j(selectedSource, "selectedSource");
        AbstractC22676k.m65750j(sourceItems, "sourceItems");
        AbstractC22676k.m65750j(confirmDialog, "confirmDialog");
        return new ManualMeasurementModelV2(title, timestamp, startDateTimestamp, measurementTitle, vo2MaxValue, vo2MaxUnit, deleteTitle, saveTitle, selectedSource, sourceItems, confirmDialog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManualMeasurementModelV2)) {
            return false;
        }
        ManualMeasurementModelV2 manualMeasurementModelV2 = (ManualMeasurementModelV2) other;
        return AbstractC22676k.m65745e(this.title, manualMeasurementModelV2.title) && AbstractC22676k.m65745e(this.timestamp, manualMeasurementModelV2.timestamp) && AbstractC22676k.m65745e(this.startDateTimestamp, manualMeasurementModelV2.startDateTimestamp) && AbstractC22676k.m65745e(this.measurementTitle, manualMeasurementModelV2.measurementTitle) && Double.compare(this.vo2MaxValue, manualMeasurementModelV2.vo2MaxValue) == 0 && AbstractC22676k.m65745e(this.vo2MaxUnit, manualMeasurementModelV2.vo2MaxUnit) && AbstractC22676k.m65745e(this.deleteTitle, manualMeasurementModelV2.deleteTitle) && AbstractC22676k.m65745e(this.saveTitle, manualMeasurementModelV2.saveTitle) && AbstractC22676k.m65745e(this.selectedSource, manualMeasurementModelV2.selectedSource) && AbstractC22676k.m65745e(this.sourceItems, manualMeasurementModelV2.sourceItems) && AbstractC22676k.m65745e(this.confirmDialog, manualMeasurementModelV2.confirmDialog);
    }

    public final TrendMenuSheetConfirmDialog getConfirmDialog() {
        return this.confirmDialog;
    }

    public final String getDeleteTitle() {
        return this.deleteTitle;
    }

    public final String getMeasurementTitle() {
        return this.measurementTitle;
    }

    public final String getSaveTitle() {
        return this.saveTitle;
    }

    public final String getSelectedSource() {
        return this.selectedSource;
    }

    public final List<TrendMenuSheetSourceItem> getSourceItems() {
        return this.sourceItems;
    }

    public final String getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getVo2MaxUnit() {
        return this.vo2MaxUnit;
    }

    public final double getVo2MaxValue() {
        return this.vo2MaxValue;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC17176i.m48499a(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.timestamp), 31, this.startDateTimestamp), 31, this.measurementTitle), 31, this.vo2MaxValue), 31, this.vo2MaxUnit);
        String str = this.deleteTitle;
        return this.confirmDialog.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.saveTitle), 31, this.selectedSource), 31, this.sourceItems);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.timestamp;
        String str3 = this.startDateTimestamp;
        String str4 = this.measurementTitle;
        double d3 = this.vo2MaxValue;
        String str5 = this.vo2MaxUnit;
        String str6 = this.deleteTitle;
        String str7 = this.saveTitle;
        String str8 = this.selectedSource;
        List<TrendMenuSheetSourceItem> list = this.sourceItems;
        TrendMenuSheetConfirmDialog trendMenuSheetConfirmDialog = this.confirmDialog;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ManualMeasurementModelV2(title=", str, ", timestamp=", str2, ", startDateTimestamp=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", measurementTitle=", str4, ", vo2MaxValue=");
        sbM32001t.append(d3);
        sbM32001t.append(", vo2MaxUnit=");
        sbM32001t.append(str5);
        AbstractC11266d.m30444B(sbM32001t, ", deleteTitle=", str6, ", saveTitle=", str7);
        sbM32001t.append(", selectedSource=");
        sbM32001t.append(str8);
        sbM32001t.append(", sourceItems=");
        sbM32001t.append(list);
        sbM32001t.append(", confirmDialog=");
        sbM32001t.append(trendMenuSheetConfirmDialog);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ManualMeasurementModelV2(String title, String timestamp, String startDateTimestamp, String measurementTitle, double d3, String vo2MaxUnit, String str, String saveTitle, String selectedSource, List<TrendMenuSheetSourceItem> sourceItems, TrendMenuSheetConfirmDialog confirmDialog) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(timestamp, "timestamp");
        AbstractC22676k.m65750j(startDateTimestamp, "startDateTimestamp");
        AbstractC22676k.m65750j(measurementTitle, "measurementTitle");
        AbstractC22676k.m65750j(vo2MaxUnit, "vo2MaxUnit");
        AbstractC22676k.m65750j(saveTitle, "saveTitle");
        AbstractC22676k.m65750j(selectedSource, "selectedSource");
        AbstractC22676k.m65750j(sourceItems, "sourceItems");
        AbstractC22676k.m65750j(confirmDialog, "confirmDialog");
        this.title = title;
        this.timestamp = timestamp;
        this.startDateTimestamp = startDateTimestamp;
        this.measurementTitle = measurementTitle;
        this.vo2MaxValue = d3;
        this.vo2MaxUnit = vo2MaxUnit;
        this.deleteTitle = str;
        this.saveTitle = saveTitle;
        this.selectedSource = selectedSource;
        this.sourceItems = sourceItems;
        this.confirmDialog = confirmDialog;
    }
}
