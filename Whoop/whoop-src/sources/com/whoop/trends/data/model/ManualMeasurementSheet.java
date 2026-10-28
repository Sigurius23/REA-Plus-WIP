package com.whoop.trends.data.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0002XWBs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u0091\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0012\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0019J\u0094\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0019J\u0010\u0010+\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010:\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010:\u0012\u0004\b?\u0010=\u001a\u0004\b>\u0010\u0019R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010@\u0012\u0004\bB\u0010=\u001a\u0004\bA\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010C\u0012\u0004\bE\u0010=\u001a\u0004\bD\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010C\u0012\u0004\bG\u0010=\u001a\u0004\bF\u0010\u001eR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010:\u0012\u0004\bI\u0010=\u001a\u0004\bH\u0010\u0019R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010:\u0012\u0004\bK\u0010=\u001a\u0004\bJ\u0010\u0019R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010:\u0012\u0004\bM\u0010=\u001a\u0004\bL\u0010\u0019R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010N\u0012\u0004\bP\u0010=\u001a\u0004\bO\u0010$R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010:\u0012\u0004\bR\u0010=\u001a\u0004\bQ\u0010\u0019R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010:\u0012\u0004\bT\u0010=\u001a\u0004\bS\u0010\u0019R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010:\u0012\u0004\bV\u0010=\u001a\u0004\bU\u0010\u0019¨\u0006Y"}, m65681d2 = {"Lcom/whoop/trends/data/model/ManualMeasurementSheet;", "", "", "timestamp", "startDateTimestamp", "", "weightKG", "bodyFatPercent", "leanBodyMassKG", "bodyFatSuffix", "leanBodyMassSuffix", "metricType", "Lcom/whoop/trends/data/model/ReplaceDialog;", "replaceDialog", "source", "saveTitle", "deleteTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ReplaceDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ReplaceDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()D", "component4", "()Ljava/lang/Double;", "component5", "component6", "component7", "component8", "component9", "()Lcom/whoop/trends/data/model/ReplaceDialog;", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ReplaceDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/trends/data/model/ManualMeasurementSheet;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTimestamp", "getTimestamp$annotations", "()V", "getStartDateTimestamp", "getStartDateTimestamp$annotations", "D", "getWeightKG", "getWeightKG$annotations", "Ljava/lang/Double;", "getBodyFatPercent", "getBodyFatPercent$annotations", "getLeanBodyMassKG", "getLeanBodyMassKG$annotations", "getBodyFatSuffix", "getBodyFatSuffix$annotations", "getLeanBodyMassSuffix", "getLeanBodyMassSuffix$annotations", "getMetricType", "getMetricType$annotations", "Lcom/whoop/trends/data/model/ReplaceDialog;", "getReplaceDialog", "getReplaceDialog$annotations", "getSource", "getSource$annotations", "getSaveTitle", "getSaveTitle$annotations", "getDeleteTitle", "getDeleteTitle$annotations", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ManualMeasurementSheet {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("body_fat_percent")
    private final Double bodyFatPercent;

    @SerializedName("body_fat_suffix")
    private final String bodyFatSuffix;

    @SerializedName("delete_title")
    private final String deleteTitle;

    @SerializedName("lean_body_mass_kg")
    private final Double leanBodyMassKG;

    @SerializedName("lean_body_mass_suffix")
    private final String leanBodyMassSuffix;

    @SerializedName("metric_type")
    private final String metricType;

    @SerializedName("replace_dialog")
    private final ReplaceDialog replaceDialog;

    @SerializedName("save_title")
    private final String saveTitle;

    @SerializedName("source")
    private final String source;

    @SerializedName("start_date_timestamp")
    private final String startDateTimestamp;

    @SerializedName("timestamp")
    private final String timestamp;

    @SerializedName("weight_kg")
    private final double weightKG;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/ManualMeasurementSheet$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/ManualMeasurementSheet;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ManualMeasurementSheet$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ManualMeasurementSheet(int i13, String str, String str2, double d3, Double d14, Double d15, String str3, String str4, String str5, ReplaceDialog replaceDialog, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i13 & 4095)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 4095, ManualMeasurementSheet$$serializer.INSTANCE.getDescriptor());
        }
        this.timestamp = str;
        this.startDateTimestamp = str2;
        this.weightKG = d3;
        this.bodyFatPercent = d14;
        this.leanBodyMassKG = d15;
        this.bodyFatSuffix = str3;
        this.leanBodyMassSuffix = str4;
        this.metricType = str5;
        this.replaceDialog = replaceDialog;
        this.source = str6;
        this.saveTitle = str7;
        this.deleteTitle = str8;
    }

    public static /* synthetic */ ManualMeasurementSheet copy$default(ManualMeasurementSheet manualMeasurementSheet, String str, String str2, double d3, Double d14, Double d15, String str3, String str4, String str5, ReplaceDialog replaceDialog, String str6, String str7, String str8, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = manualMeasurementSheet.timestamp;
        }
        return manualMeasurementSheet.copy(str, (i13 & 2) != 0 ? manualMeasurementSheet.startDateTimestamp : str2, (i13 & 4) != 0 ? manualMeasurementSheet.weightKG : d3, (i13 & 8) != 0 ? manualMeasurementSheet.bodyFatPercent : d14, (i13 & 16) != 0 ? manualMeasurementSheet.leanBodyMassKG : d15, (i13 & 32) != 0 ? manualMeasurementSheet.bodyFatSuffix : str3, (i13 & 64) != 0 ? manualMeasurementSheet.leanBodyMassSuffix : str4, (i13 & 128) != 0 ? manualMeasurementSheet.metricType : str5, (i13 & 256) != 0 ? manualMeasurementSheet.replaceDialog : replaceDialog, (i13 & 512) != 0 ? manualMeasurementSheet.source : str6, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? manualMeasurementSheet.saveTitle : str7, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? manualMeasurementSheet.deleteTitle : str8);
    }

    @InterfaceC37143h("body_fat_percent")
    public static /* synthetic */ void getBodyFatPercent$annotations() {
    }

    @InterfaceC37143h("body_fat_suffix")
    public static /* synthetic */ void getBodyFatSuffix$annotations() {
    }

    @InterfaceC37143h("delete_title")
    public static /* synthetic */ void getDeleteTitle$annotations() {
    }

    @InterfaceC37143h("lean_body_mass_kg")
    public static /* synthetic */ void getLeanBodyMassKG$annotations() {
    }

    @InterfaceC37143h("lean_body_mass_suffix")
    public static /* synthetic */ void getLeanBodyMassSuffix$annotations() {
    }

    @InterfaceC37143h("metric_type")
    public static /* synthetic */ void getMetricType$annotations() {
    }

    @InterfaceC37143h("replace_dialog")
    public static /* synthetic */ void getReplaceDialog$annotations() {
    }

    @InterfaceC37143h("save_title")
    public static /* synthetic */ void getSaveTitle$annotations() {
    }

    @InterfaceC37143h("source")
    public static /* synthetic */ void getSource$annotations() {
    }

    @InterfaceC37143h("start_date_timestamp")
    public static /* synthetic */ void getStartDateTimestamp$annotations() {
    }

    @InterfaceC37143h("timestamp")
    public static /* synthetic */ void getTimestamp$annotations() {
    }

    @InterfaceC37143h("weight_kg")
    public static /* synthetic */ void getWeightKG$annotations() {
    }

    public static final /* synthetic */ void write$Self$trends_release(ManualMeasurementSheet self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.timestamp);
        output.encodeStringElement(serialDesc, 1, self.startDateTimestamp);
        output.encodeDoubleElement(serialDesc, 2, self.weightKG);
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, doubleSerializer, self.bodyFatPercent);
        output.encodeNullableSerializableElement(serialDesc, 4, doubleSerializer, self.leanBodyMassKG);
        output.encodeStringElement(serialDesc, 5, self.bodyFatSuffix);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.leanBodyMassSuffix);
        output.encodeStringElement(serialDesc, 7, self.metricType);
        output.encodeNullableSerializableElement(serialDesc, 8, ReplaceDialog$$serializer.INSTANCE, self.replaceDialog);
        output.encodeStringElement(serialDesc, 9, self.source);
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.saveTitle);
        output.encodeNullableSerializableElement(serialDesc, 11, stringSerializer, self.deleteTitle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSaveTitle() {
        return this.saveTitle;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDeleteTitle() {
        return this.deleteTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getWeightKG() {
        return this.weightKG;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getBodyFatPercent() {
        return this.bodyFatPercent;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getLeanBodyMassKG() {
        return this.leanBodyMassKG;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBodyFatSuffix() {
        return this.bodyFatSuffix;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLeanBodyMassSuffix() {
        return this.leanBodyMassSuffix;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMetricType() {
        return this.metricType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ReplaceDialog getReplaceDialog() {
        return this.replaceDialog;
    }

    public final ManualMeasurementSheet copy(String timestamp, String startDateTimestamp, double weightKG, Double bodyFatPercent, Double leanBodyMassKG, String bodyFatSuffix, String leanBodyMassSuffix, String metricType, ReplaceDialog replaceDialog, String source, String saveTitle, String deleteTitle) {
        AbstractC22676k.m65750j(timestamp, "timestamp");
        AbstractC22676k.m65750j(startDateTimestamp, "startDateTimestamp");
        AbstractC22676k.m65750j(bodyFatSuffix, "bodyFatSuffix");
        AbstractC22676k.m65750j(metricType, "metricType");
        AbstractC22676k.m65750j(source, "source");
        return new ManualMeasurementSheet(timestamp, startDateTimestamp, weightKG, bodyFatPercent, leanBodyMassKG, bodyFatSuffix, leanBodyMassSuffix, metricType, replaceDialog, source, saveTitle, deleteTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManualMeasurementSheet)) {
            return false;
        }
        ManualMeasurementSheet manualMeasurementSheet = (ManualMeasurementSheet) other;
        return AbstractC22676k.m65745e(this.timestamp, manualMeasurementSheet.timestamp) && AbstractC22676k.m65745e(this.startDateTimestamp, manualMeasurementSheet.startDateTimestamp) && Double.compare(this.weightKG, manualMeasurementSheet.weightKG) == 0 && AbstractC22676k.m65745e(this.bodyFatPercent, manualMeasurementSheet.bodyFatPercent) && AbstractC22676k.m65745e(this.leanBodyMassKG, manualMeasurementSheet.leanBodyMassKG) && AbstractC22676k.m65745e(this.bodyFatSuffix, manualMeasurementSheet.bodyFatSuffix) && AbstractC22676k.m65745e(this.leanBodyMassSuffix, manualMeasurementSheet.leanBodyMassSuffix) && AbstractC22676k.m65745e(this.metricType, manualMeasurementSheet.metricType) && AbstractC22676k.m65745e(this.replaceDialog, manualMeasurementSheet.replaceDialog) && AbstractC22676k.m65745e(this.source, manualMeasurementSheet.source) && AbstractC22676k.m65745e(this.saveTitle, manualMeasurementSheet.saveTitle) && AbstractC22676k.m65745e(this.deleteTitle, manualMeasurementSheet.deleteTitle);
    }

    public final Double getBodyFatPercent() {
        return this.bodyFatPercent;
    }

    public final String getBodyFatSuffix() {
        return this.bodyFatSuffix;
    }

    public final String getDeleteTitle() {
        return this.deleteTitle;
    }

    public final Double getLeanBodyMassKG() {
        return this.leanBodyMassKG;
    }

    public final String getLeanBodyMassSuffix() {
        return this.leanBodyMassSuffix;
    }

    public final String getMetricType() {
        return this.metricType;
    }

    public final ReplaceDialog getReplaceDialog() {
        return this.replaceDialog;
    }

    public final String getSaveTitle() {
        return this.saveTitle;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final double getWeightKG() {
        return this.weightKG;
    }

    public int hashCode() {
        int iM48499a = AbstractC17176i.m48499a(AbstractC11266d.m30450d(this.timestamp.hashCode() * 31, 31, this.startDateTimestamp), 31, this.weightKG);
        Double d3 = this.bodyFatPercent;
        int iHashCode = (iM48499a + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d14 = this.leanBodyMassKG;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31, 31, this.bodyFatSuffix);
        String str = this.leanBodyMassSuffix;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.metricType);
        ReplaceDialog replaceDialog = this.replaceDialog;
        int iM30450d3 = AbstractC11266d.m30450d((iM30450d2 + (replaceDialog == null ? 0 : replaceDialog.hashCode())) * 31, 31, this.source);
        String str2 = this.saveTitle;
        int iHashCode2 = (iM30450d3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deleteTitle;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.timestamp;
        String str2 = this.startDateTimestamp;
        double d3 = this.weightKG;
        Double d14 = this.bodyFatPercent;
        Double d15 = this.leanBodyMassKG;
        String str3 = this.bodyFatSuffix;
        String str4 = this.leanBodyMassSuffix;
        String str5 = this.metricType;
        ReplaceDialog replaceDialog = this.replaceDialog;
        String str6 = this.source;
        String str7 = this.saveTitle;
        String str8 = this.deleteTitle;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ManualMeasurementSheet(timestamp=", str, ", startDateTimestamp=", str2, ", weightKG=");
        sbM32001t.append(d3);
        sbM32001t.append(", bodyFatPercent=");
        sbM32001t.append(d14);
        sbM32001t.append(", leanBodyMassKG=");
        sbM32001t.append(d15);
        sbM32001t.append(", bodyFatSuffix=");
        sbM32001t.append(str3);
        AbstractC11266d.m30444B(sbM32001t, ", leanBodyMassSuffix=", str4, ", metricType=", str5);
        sbM32001t.append(", replaceDialog=");
        sbM32001t.append(replaceDialog);
        sbM32001t.append(", source=");
        sbM32001t.append(str6);
        AbstractC11266d.m30444B(sbM32001t, ", saveTitle=", str7, ", deleteTitle=", str8);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ManualMeasurementSheet(String timestamp, String startDateTimestamp, double d3, Double d14, Double d15, String bodyFatSuffix, String str, String metricType, ReplaceDialog replaceDialog, String source, String str2, String str3) {
        AbstractC22676k.m65750j(timestamp, "timestamp");
        AbstractC22676k.m65750j(startDateTimestamp, "startDateTimestamp");
        AbstractC22676k.m65750j(bodyFatSuffix, "bodyFatSuffix");
        AbstractC22676k.m65750j(metricType, "metricType");
        AbstractC22676k.m65750j(source, "source");
        this.timestamp = timestamp;
        this.startDateTimestamp = startDateTimestamp;
        this.weightKG = d3;
        this.bodyFatPercent = d14;
        this.leanBodyMassKG = d15;
        this.bodyFatSuffix = bodyFatSuffix;
        this.leanBodyMassSuffix = str;
        this.metricType = metricType;
        this.replaceDialog = replaceDialog;
        this.source = source;
        this.saveTitle = str2;
        this.deleteTitle = str3;
    }
}
