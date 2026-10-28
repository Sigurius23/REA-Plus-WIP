package com.whoop.labrador.feature.details.domain.model;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.items.CtaSupplementalInfo;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.models.items.TileBorderStyle;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import java.util.List;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\r0\tHÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0012HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u001bHÆ\u0003JÝ\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001J\u0014\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010M\u001a\u00020NHÖ\u0081\u0004J\n\u0010O\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006P"}, m65681d2 = {"Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;", "", "id", "", "pageTitle", "navIcon", "reportTimestamp", "trailingTimestamp", "samples", "", "", "arrhythmiaDetermination", "arrhythmiaReadings", "Lcom/whoop/labrador/feature/details/domain/model/ShepherdReading;", "arrhythmiaInsightInformation", "averageHeartRate", "averageHeartRateLabel", "shareResultTile", "Lcom/whoop/design/models/items/CtaTileModel;", "disclaimerLabel", "addSymptomsAndNotesTile", "readingSymptomsAndNotesTile", "Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;", "clearReadingIcon", "clearReadingLabel", "pdfPresignedUrl", "protectYourPrivacy", "Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;)V", "getId", "()Ljava/lang/String;", "getPageTitle", "getNavIcon", "getReportTimestamp", "getTrailingTimestamp", "getSamples", "()Ljava/util/List;", "getArrhythmiaDetermination", "getArrhythmiaReadings", "getArrhythmiaInsightInformation", "getAverageHeartRate", "getAverageHeartRateLabel", "getShareResultTile", "()Lcom/whoop/design/models/items/CtaTileModel;", "getDisclaimerLabel", "getAddSymptomsAndNotesTile", "getReadingSymptomsAndNotesTile", "()Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;", "getClearReadingIcon", "getClearReadingLabel", "getPdfPresignedUrl", "getProtectYourPrivacy", "()Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", "", "other", "hashCode", "", "toString", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class LabradorDetailsResponse {
    public static final int $stable = 8;
    private final CtaTileModel addSymptomsAndNotesTile;
    private final String arrhythmiaDetermination;
    private final String arrhythmiaInsightInformation;
    private final List<ShepherdReading> arrhythmiaReadings;
    private final String averageHeartRate;
    private final String averageHeartRateLabel;
    private final String clearReadingIcon;
    private final String clearReadingLabel;
    private final String disclaimerLabel;
    private final String id;
    private final String navIcon;
    private final String pageTitle;
    private final String pdfPresignedUrl;
    private final PrivacyText protectYourPrivacy;
    private final LabradorReadingNotesSymptomsModel readingSymptomsAndNotesTile;
    private final String reportTimestamp;
    private final List<Double> samples;
    private final CtaTileModel shareResultTile;
    private final String trailingTimestamp;

    public LabradorDetailsResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LabradorDetailsResponse copy$default(LabradorDetailsResponse labradorDetailsResponse, String str, String str2, String str3, String str4, String str5, List list, String str6, List list2, String str7, String str8, String str9, CtaTileModel ctaTileModel, String str10, CtaTileModel ctaTileModel2, LabradorReadingNotesSymptomsModel labradorReadingNotesSymptomsModel, String str11, String str12, String str13, PrivacyText privacyText, int i13, Object obj) {
        PrivacyText privacyText2;
        String str14;
        String str15 = (i13 & 1) != 0 ? labradorDetailsResponse.id : str;
        String str16 = (i13 & 2) != 0 ? labradorDetailsResponse.pageTitle : str2;
        String str17 = (i13 & 4) != 0 ? labradorDetailsResponse.navIcon : str3;
        String str18 = (i13 & 8) != 0 ? labradorDetailsResponse.reportTimestamp : str4;
        String str19 = (i13 & 16) != 0 ? labradorDetailsResponse.trailingTimestamp : str5;
        List list3 = (i13 & 32) != 0 ? labradorDetailsResponse.samples : list;
        String str20 = (i13 & 64) != 0 ? labradorDetailsResponse.arrhythmiaDetermination : str6;
        List list4 = (i13 & 128) != 0 ? labradorDetailsResponse.arrhythmiaReadings : list2;
        String str21 = (i13 & 256) != 0 ? labradorDetailsResponse.arrhythmiaInsightInformation : str7;
        String str22 = (i13 & 512) != 0 ? labradorDetailsResponse.averageHeartRate : str8;
        String str23 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? labradorDetailsResponse.averageHeartRateLabel : str9;
        CtaTileModel ctaTileModel3 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? labradorDetailsResponse.shareResultTile : ctaTileModel;
        String str24 = (i13 & 4096) != 0 ? labradorDetailsResponse.disclaimerLabel : str10;
        CtaTileModel ctaTileModel4 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? labradorDetailsResponse.addSymptomsAndNotesTile : ctaTileModel2;
        String str25 = str15;
        LabradorReadingNotesSymptomsModel labradorReadingNotesSymptomsModel2 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? labradorDetailsResponse.readingSymptomsAndNotesTile : labradorReadingNotesSymptomsModel;
        String str26 = (i13 & 32768) != 0 ? labradorDetailsResponse.clearReadingIcon : str11;
        String str27 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? labradorDetailsResponse.clearReadingLabel : str12;
        String str28 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? labradorDetailsResponse.pdfPresignedUrl : str13;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
            str14 = str28;
            privacyText2 = labradorDetailsResponse.protectYourPrivacy;
        } else {
            privacyText2 = privacyText;
            str14 = str28;
        }
        return labradorDetailsResponse.copy(str25, str16, str17, str18, str19, list3, str20, list4, str21, str22, str23, ctaTileModel3, str24, ctaTileModel4, labradorReadingNotesSymptomsModel2, str26, str27, str14, privacyText2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAverageHeartRate() {
        return this.averageHeartRate;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAverageHeartRateLabel() {
        return this.averageHeartRateLabel;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final CtaTileModel getShareResultTile() {
        return this.shareResultTile;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDisclaimerLabel() {
        return this.disclaimerLabel;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final CtaTileModel getAddSymptomsAndNotesTile() {
        return this.addSymptomsAndNotesTile;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final LabradorReadingNotesSymptomsModel getReadingSymptomsAndNotesTile() {
        return this.readingSymptomsAndNotesTile;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getClearReadingIcon() {
        return this.clearReadingIcon;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getClearReadingLabel() {
        return this.clearReadingLabel;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getPdfPresignedUrl() {
        return this.pdfPresignedUrl;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final PrivacyText getProtectYourPrivacy() {
        return this.protectYourPrivacy;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPageTitle() {
        return this.pageTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNavIcon() {
        return this.navIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReportTimestamp() {
        return this.reportTimestamp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTrailingTimestamp() {
        return this.trailingTimestamp;
    }

    public final List<Double> component6() {
        return this.samples;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getArrhythmiaDetermination() {
        return this.arrhythmiaDetermination;
    }

    public final List<ShepherdReading> component8() {
        return this.arrhythmiaReadings;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getArrhythmiaInsightInformation() {
        return this.arrhythmiaInsightInformation;
    }

    public final LabradorDetailsResponse copy(String id4, String pageTitle, String navIcon, String reportTimestamp, String trailingTimestamp, List<Double> samples, String arrhythmiaDetermination, List<ShepherdReading> arrhythmiaReadings, String arrhythmiaInsightInformation, String averageHeartRate, String averageHeartRateLabel, CtaTileModel shareResultTile, String disclaimerLabel, CtaTileModel addSymptomsAndNotesTile, LabradorReadingNotesSymptomsModel readingSymptomsAndNotesTile, String clearReadingIcon, String clearReadingLabel, String pdfPresignedUrl, PrivacyText protectYourPrivacy) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(pageTitle, "pageTitle");
        AbstractC22676k.m65750j(navIcon, "navIcon");
        AbstractC22676k.m65750j(reportTimestamp, "reportTimestamp");
        AbstractC22676k.m65750j(trailingTimestamp, "trailingTimestamp");
        AbstractC22676k.m65750j(samples, "samples");
        AbstractC22676k.m65750j(arrhythmiaReadings, "arrhythmiaReadings");
        AbstractC22676k.m65750j(arrhythmiaInsightInformation, "arrhythmiaInsightInformation");
        AbstractC22676k.m65750j(averageHeartRateLabel, "averageHeartRateLabel");
        AbstractC22676k.m65750j(shareResultTile, "shareResultTile");
        AbstractC22676k.m65750j(disclaimerLabel, "disclaimerLabel");
        AbstractC22676k.m65750j(clearReadingIcon, "clearReadingIcon");
        AbstractC22676k.m65750j(clearReadingLabel, "clearReadingLabel");
        AbstractC22676k.m65750j(pdfPresignedUrl, "pdfPresignedUrl");
        return new LabradorDetailsResponse(id4, pageTitle, navIcon, reportTimestamp, trailingTimestamp, samples, arrhythmiaDetermination, arrhythmiaReadings, arrhythmiaInsightInformation, averageHeartRate, averageHeartRateLabel, shareResultTile, disclaimerLabel, addSymptomsAndNotesTile, readingSymptomsAndNotesTile, clearReadingIcon, clearReadingLabel, pdfPresignedUrl, protectYourPrivacy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabradorDetailsResponse)) {
            return false;
        }
        LabradorDetailsResponse labradorDetailsResponse = (LabradorDetailsResponse) other;
        return AbstractC22676k.m65745e(this.id, labradorDetailsResponse.id) && AbstractC22676k.m65745e(this.pageTitle, labradorDetailsResponse.pageTitle) && AbstractC22676k.m65745e(this.navIcon, labradorDetailsResponse.navIcon) && AbstractC22676k.m65745e(this.reportTimestamp, labradorDetailsResponse.reportTimestamp) && AbstractC22676k.m65745e(this.trailingTimestamp, labradorDetailsResponse.trailingTimestamp) && AbstractC22676k.m65745e(this.samples, labradorDetailsResponse.samples) && AbstractC22676k.m65745e(this.arrhythmiaDetermination, labradorDetailsResponse.arrhythmiaDetermination) && AbstractC22676k.m65745e(this.arrhythmiaReadings, labradorDetailsResponse.arrhythmiaReadings) && AbstractC22676k.m65745e(this.arrhythmiaInsightInformation, labradorDetailsResponse.arrhythmiaInsightInformation) && AbstractC22676k.m65745e(this.averageHeartRate, labradorDetailsResponse.averageHeartRate) && AbstractC22676k.m65745e(this.averageHeartRateLabel, labradorDetailsResponse.averageHeartRateLabel) && AbstractC22676k.m65745e(this.shareResultTile, labradorDetailsResponse.shareResultTile) && AbstractC22676k.m65745e(this.disclaimerLabel, labradorDetailsResponse.disclaimerLabel) && AbstractC22676k.m65745e(this.addSymptomsAndNotesTile, labradorDetailsResponse.addSymptomsAndNotesTile) && AbstractC22676k.m65745e(this.readingSymptomsAndNotesTile, labradorDetailsResponse.readingSymptomsAndNotesTile) && AbstractC22676k.m65745e(this.clearReadingIcon, labradorDetailsResponse.clearReadingIcon) && AbstractC22676k.m65745e(this.clearReadingLabel, labradorDetailsResponse.clearReadingLabel) && AbstractC22676k.m65745e(this.pdfPresignedUrl, labradorDetailsResponse.pdfPresignedUrl) && AbstractC22676k.m65745e(this.protectYourPrivacy, labradorDetailsResponse.protectYourPrivacy);
    }

    public final CtaTileModel getAddSymptomsAndNotesTile() {
        return this.addSymptomsAndNotesTile;
    }

    public final String getArrhythmiaDetermination() {
        return this.arrhythmiaDetermination;
    }

    public final String getArrhythmiaInsightInformation() {
        return this.arrhythmiaInsightInformation;
    }

    public final List<ShepherdReading> getArrhythmiaReadings() {
        return this.arrhythmiaReadings;
    }

    public final String getAverageHeartRate() {
        return this.averageHeartRate;
    }

    public final String getAverageHeartRateLabel() {
        return this.averageHeartRateLabel;
    }

    public final String getClearReadingIcon() {
        return this.clearReadingIcon;
    }

    public final String getClearReadingLabel() {
        return this.clearReadingLabel;
    }

    public final String getDisclaimerLabel() {
        return this.disclaimerLabel;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNavIcon() {
        return this.navIcon;
    }

    public final String getPageTitle() {
        return this.pageTitle;
    }

    public final String getPdfPresignedUrl() {
        return this.pdfPresignedUrl;
    }

    public final PrivacyText getProtectYourPrivacy() {
        return this.protectYourPrivacy;
    }

    public final LabradorReadingNotesSymptomsModel getReadingSymptomsAndNotesTile() {
        return this.readingSymptomsAndNotesTile;
    }

    public final String getReportTimestamp() {
        return this.reportTimestamp;
    }

    public final List<Double> getSamples() {
        return this.samples;
    }

    public final CtaTileModel getShareResultTile() {
        return this.shareResultTile;
    }

    public final String getTrailingTimestamp() {
        return this.trailingTimestamp;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.pageTitle), 31, this.navIcon), 31, this.reportTimestamp), 31, this.trailingTimestamp), 31, this.samples);
        String str = this.arrhythmiaDetermination;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11895b.m31983b((iM31983b + (str == null ? 0 : str.hashCode())) * 31, 31, this.arrhythmiaReadings), 31, this.arrhythmiaInsightInformation);
        String str2 = this.averageHeartRate;
        int iM30450d2 = AbstractC11266d.m30450d((this.shareResultTile.hashCode() + AbstractC11266d.m30450d((iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.averageHeartRateLabel)) * 31, 31, this.disclaimerLabel);
        CtaTileModel ctaTileModel = this.addSymptomsAndNotesTile;
        int iHashCode = (iM30450d2 + (ctaTileModel == null ? 0 : ctaTileModel.hashCode())) * 31;
        LabradorReadingNotesSymptomsModel labradorReadingNotesSymptomsModel = this.readingSymptomsAndNotesTile;
        int iM30450d3 = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (labradorReadingNotesSymptomsModel == null ? 0 : labradorReadingNotesSymptomsModel.hashCode())) * 31, 31, this.clearReadingIcon), 31, this.clearReadingLabel), 31, this.pdfPresignedUrl);
        PrivacyText privacyText = this.protectYourPrivacy;
        return iM30450d3 + (privacyText != null ? privacyText.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.pageTitle;
        String str3 = this.navIcon;
        String str4 = this.reportTimestamp;
        String str5 = this.trailingTimestamp;
        List<Double> list = this.samples;
        String str6 = this.arrhythmiaDetermination;
        List<ShepherdReading> list2 = this.arrhythmiaReadings;
        String str7 = this.arrhythmiaInsightInformation;
        String str8 = this.averageHeartRate;
        String str9 = this.averageHeartRateLabel;
        CtaTileModel ctaTileModel = this.shareResultTile;
        String str10 = this.disclaimerLabel;
        CtaTileModel ctaTileModel2 = this.addSymptomsAndNotesTile;
        LabradorReadingNotesSymptomsModel labradorReadingNotesSymptomsModel = this.readingSymptomsAndNotesTile;
        String str11 = this.clearReadingIcon;
        String str12 = this.clearReadingLabel;
        String str13 = this.pdfPresignedUrl;
        PrivacyText privacyText = this.protectYourPrivacy;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("LabradorDetailsResponse(id=", str, ", pageTitle=", str2, ", navIcon=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", reportTimestamp=", str4, ", trailingTimestamp=");
        AbstractC36095b.m114694v(str5, ", samples=", ", arrhythmiaDetermination=", sbM32001t, list);
        AbstractC36095b.m114694v(str6, ", arrhythmiaReadings=", ", arrhythmiaInsightInformation=", sbM32001t, list2);
        AbstractC11266d.m30444B(sbM32001t, str7, ", averageHeartRate=", str8, ", averageHeartRateLabel=");
        sbM32001t.append(str9);
        sbM32001t.append(", shareResultTile=");
        sbM32001t.append(ctaTileModel);
        sbM32001t.append(", disclaimerLabel=");
        sbM32001t.append(str10);
        sbM32001t.append(", addSymptomsAndNotesTile=");
        sbM32001t.append(ctaTileModel2);
        sbM32001t.append(", readingSymptomsAndNotesTile=");
        sbM32001t.append(labradorReadingNotesSymptomsModel);
        sbM32001t.append(", clearReadingIcon=");
        sbM32001t.append(str11);
        sbM32001t.append(", clearReadingLabel=");
        AbstractC11266d.m30444B(sbM32001t, str12, ", pdfPresignedUrl=", str13, ", protectYourPrivacy=");
        sbM32001t.append(privacyText);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public LabradorDetailsResponse(String id4, String pageTitle, String navIcon, String reportTimestamp, String trailingTimestamp, List<Double> samples, String str, List<ShepherdReading> arrhythmiaReadings, String arrhythmiaInsightInformation, String str2, String averageHeartRateLabel, CtaTileModel shareResultTile, String disclaimerLabel, CtaTileModel ctaTileModel, LabradorReadingNotesSymptomsModel labradorReadingNotesSymptomsModel, String clearReadingIcon, String clearReadingLabel, String pdfPresignedUrl, PrivacyText privacyText) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(pageTitle, "pageTitle");
        AbstractC22676k.m65750j(navIcon, "navIcon");
        AbstractC22676k.m65750j(reportTimestamp, "reportTimestamp");
        AbstractC22676k.m65750j(trailingTimestamp, "trailingTimestamp");
        AbstractC22676k.m65750j(samples, "samples");
        AbstractC22676k.m65750j(arrhythmiaReadings, "arrhythmiaReadings");
        AbstractC22676k.m65750j(arrhythmiaInsightInformation, "arrhythmiaInsightInformation");
        AbstractC22676k.m65750j(averageHeartRateLabel, "averageHeartRateLabel");
        AbstractC22676k.m65750j(shareResultTile, "shareResultTile");
        AbstractC22676k.m65750j(disclaimerLabel, "disclaimerLabel");
        AbstractC22676k.m65750j(clearReadingIcon, "clearReadingIcon");
        AbstractC22676k.m65750j(clearReadingLabel, "clearReadingLabel");
        AbstractC22676k.m65750j(pdfPresignedUrl, "pdfPresignedUrl");
        this.id = id4;
        this.pageTitle = pageTitle;
        this.navIcon = navIcon;
        this.reportTimestamp = reportTimestamp;
        this.trailingTimestamp = trailingTimestamp;
        this.samples = samples;
        this.arrhythmiaDetermination = str;
        this.arrhythmiaReadings = arrhythmiaReadings;
        this.arrhythmiaInsightInformation = arrhythmiaInsightInformation;
        this.averageHeartRate = str2;
        this.averageHeartRateLabel = averageHeartRateLabel;
        this.shareResultTile = shareResultTile;
        this.disclaimerLabel = disclaimerLabel;
        this.addSymptomsAndNotesTile = ctaTileModel;
        this.readingSymptomsAndNotesTile = labradorReadingNotesSymptomsModel;
        this.clearReadingIcon = clearReadingIcon;
        this.clearReadingLabel = clearReadingLabel;
        this.pdfPresignedUrl = pdfPresignedUrl;
        this.protectYourPrivacy = privacyText;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LabradorDetailsResponse(String str, String str2, String str3, String str4, String str5, List list, String str6, List list2, String str7, String str8, String str9, CtaTileModel ctaTileModel, String str10, CtaTileModel ctaTileModel2, LabradorReadingNotesSymptomsModel labradorReadingNotesSymptomsModel, String str11, String str12, String str13, PrivacyText privacyText, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        String str14 = (i13 & 1) != 0 ? "" : str;
        String str15 = (i13 & 2) != 0 ? "" : str2;
        String str16 = (i13 & 4) != 0 ? "" : str3;
        String str17 = (i13 & 8) != 0 ? "" : str4;
        String str18 = (i13 & 16) != 0 ? "" : str5;
        int i14 = i13 & 32;
        List list3 = C25271y.f99162w;
        this(str14, str15, str16, str17, str18, i14 != 0 ? list3 : list, (i13 & 64) != 0 ? null : str6, (i13 & 128) == 0 ? list2 : list3, (i13 & 256) != 0 ? "" : str7, (i13 & 512) != 0 ? null : str8, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? "" : str9, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? new CtaTileModel((TextResource) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TextResource) null, (String) null, (String) null, false, false, false, (TileBorderStyle) null, (CtaSupplementalInfo) null, (C9598e) null, 65535, (DefaultConstructorMarker) null) : ctaTileModel, (i13 & 4096) != 0 ? "" : str10, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : ctaTileModel2, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : labradorReadingNotesSymptomsModel, (i13 & 32768) != 0 ? "" : str11, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? "" : str12, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) == 0 ? str13 : "", (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : privacyText);
    }
}
