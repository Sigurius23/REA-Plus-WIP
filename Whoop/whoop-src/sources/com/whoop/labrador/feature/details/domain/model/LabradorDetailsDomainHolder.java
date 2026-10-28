package com.whoop.labrador.feature.details.domain.model;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hc3.AbstractC17176i;
import java.time.Instant;
import java.util.List;
import jh3.AbstractC21702c;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import rs1.AbstractC31794f;
import sk1.C32573b;
import te0.AbstractC33745d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001BË\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004HÆ\u0003¢\u0006\u0004\b+\u0010\u001eJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b,\u0010(J\u0012\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b-\u0010(J\u0012\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b.\u0010(J\u0012\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b/\u0010(JÔ\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b2\u0010(J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b>\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b?\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b@\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\bA\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\bB\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\bC\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\bD\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\bE\u0010\u001cR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\bG\u0010(R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bI\u0010*R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\bJ\u0010\u001eR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010F\u001a\u0004\bK\u0010(R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010F\u001a\u0004\bL\u0010(R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0017\u0010F\u001a\u0004\bM\u0010(R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0018\u0010F\u001a\u0004\bN\u0010(¨\u0006O"}, m65681d2 = {"Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;", "", "Lcom/whoop/design/util/TextResource;", "timestampTitle", "", "", "samples", "determinationTitle", "Lsk1/b;", "readings", "insightBody", "averageHr", "shareText", "disclaimerText", "addNotesText", "removeReadingText", "", "id", "Ljava/time/Instant;", "timestamp", "savedSymptoms", "savedNotes", "pdfPresignedUrl", "protectYourPrivacyTitle", "protectYourPrivacyDescription", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Ljava/lang/String;", "component12", "()Ljava/time/Instant;", "component13", "component14", "component15", "component16", "component17", "copy", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTimestampTitle", "Ljava/util/List;", "getSamples", "getDeterminationTitle", "getReadings", "getInsightBody", "getAverageHr", "getShareText", "getDisclaimerText", "getAddNotesText", "getRemoveReadingText", "Ljava/lang/String;", "getId", "Ljava/time/Instant;", "getTimestamp", "getSavedSymptoms", "getSavedNotes", "getPdfPresignedUrl", "getProtectYourPrivacyTitle", "getProtectYourPrivacyDescription", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class LabradorDetailsDomainHolder {
    public static final int $stable = 8;
    private final TextResource addNotesText;
    private final TextResource averageHr;
    private final TextResource determinationTitle;
    private final TextResource disclaimerText;
    private final String id;
    private final TextResource insightBody;
    private final String pdfPresignedUrl;
    private final String protectYourPrivacyDescription;
    private final String protectYourPrivacyTitle;
    private final List<C32573b> readings;
    private final TextResource removeReadingText;
    private final List<Double> samples;
    private final String savedNotes;
    private final List<String> savedSymptoms;
    private final TextResource shareText;
    private final Instant timestamp;
    private final TextResource timestampTitle;

    public LabradorDetailsDomainHolder() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LabradorDetailsDomainHolder copy$default(LabradorDetailsDomainHolder labradorDetailsDomainHolder, TextResource textResource, List list, TextResource textResource2, List list2, TextResource textResource3, TextResource textResource4, TextResource textResource5, TextResource textResource6, TextResource textResource7, TextResource textResource8, String str, Instant instant, List list3, String str2, String str3, String str4, String str5, int i13, Object obj) {
        String str6;
        String str7;
        TextResource textResource9 = (i13 & 1) != 0 ? labradorDetailsDomainHolder.timestampTitle : textResource;
        List list4 = (i13 & 2) != 0 ? labradorDetailsDomainHolder.samples : list;
        TextResource textResource10 = (i13 & 4) != 0 ? labradorDetailsDomainHolder.determinationTitle : textResource2;
        List list5 = (i13 & 8) != 0 ? labradorDetailsDomainHolder.readings : list2;
        TextResource textResource11 = (i13 & 16) != 0 ? labradorDetailsDomainHolder.insightBody : textResource3;
        TextResource textResource12 = (i13 & 32) != 0 ? labradorDetailsDomainHolder.averageHr : textResource4;
        TextResource textResource13 = (i13 & 64) != 0 ? labradorDetailsDomainHolder.shareText : textResource5;
        TextResource textResource14 = (i13 & 128) != 0 ? labradorDetailsDomainHolder.disclaimerText : textResource6;
        TextResource textResource15 = (i13 & 256) != 0 ? labradorDetailsDomainHolder.addNotesText : textResource7;
        TextResource textResource16 = (i13 & 512) != 0 ? labradorDetailsDomainHolder.removeReadingText : textResource8;
        String str8 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? labradorDetailsDomainHolder.id : str;
        Instant instant2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? labradorDetailsDomainHolder.timestamp : instant;
        List list6 = (i13 & 4096) != 0 ? labradorDetailsDomainHolder.savedSymptoms : list3;
        String str9 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? labradorDetailsDomainHolder.savedNotes : str2;
        TextResource textResource17 = textResource9;
        String str10 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? labradorDetailsDomainHolder.pdfPresignedUrl : str3;
        String str11 = (i13 & 32768) != 0 ? labradorDetailsDomainHolder.protectYourPrivacyTitle : str4;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
            str7 = str11;
            str6 = labradorDetailsDomainHolder.protectYourPrivacyDescription;
        } else {
            str6 = str5;
            str7 = str11;
        }
        return labradorDetailsDomainHolder.copy(textResource17, list4, textResource10, list5, textResource11, textResource12, textResource13, textResource14, textResource15, textResource16, str8, instant2, list6, str9, str10, str7, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTimestampTitle() {
        return this.timestampTitle;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final TextResource getRemoveReadingText() {
        return this.removeReadingText;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final List<String> component13() {
        return this.savedSymptoms;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSavedNotes() {
        return this.savedNotes;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPdfPresignedUrl() {
        return this.pdfPresignedUrl;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getProtectYourPrivacyTitle() {
        return this.protectYourPrivacyTitle;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getProtectYourPrivacyDescription() {
        return this.protectYourPrivacyDescription;
    }

    public final List<Double> component2() {
        return this.samples;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getDeterminationTitle() {
        return this.determinationTitle;
    }

    public final List<C32573b> component4() {
        return this.readings;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextResource getInsightBody() {
        return this.insightBody;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TextResource getAverageHr() {
        return this.averageHr;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TextResource getShareText() {
        return this.shareText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TextResource getDisclaimerText() {
        return this.disclaimerText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final TextResource getAddNotesText() {
        return this.addNotesText;
    }

    public final LabradorDetailsDomainHolder copy(TextResource timestampTitle, List<Double> samples, TextResource determinationTitle, List<C32573b> readings, TextResource insightBody, TextResource averageHr, TextResource shareText, TextResource disclaimerText, TextResource addNotesText, TextResource removeReadingText, String id4, Instant timestamp, List<String> savedSymptoms, String savedNotes, String pdfPresignedUrl, String protectYourPrivacyTitle, String protectYourPrivacyDescription) {
        AbstractC22676k.m65750j(timestampTitle, "timestampTitle");
        AbstractC22676k.m65750j(samples, "samples");
        AbstractC22676k.m65750j(determinationTitle, "determinationTitle");
        AbstractC22676k.m65750j(readings, "readings");
        AbstractC22676k.m65750j(insightBody, "insightBody");
        AbstractC22676k.m65750j(averageHr, "averageHr");
        AbstractC22676k.m65750j(shareText, "shareText");
        AbstractC22676k.m65750j(disclaimerText, "disclaimerText");
        AbstractC22676k.m65750j(addNotesText, "addNotesText");
        AbstractC22676k.m65750j(removeReadingText, "removeReadingText");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(timestamp, "timestamp");
        AbstractC22676k.m65750j(savedSymptoms, "savedSymptoms");
        return new LabradorDetailsDomainHolder(timestampTitle, samples, determinationTitle, readings, insightBody, averageHr, shareText, disclaimerText, addNotesText, removeReadingText, id4, timestamp, savedSymptoms, savedNotes, pdfPresignedUrl, protectYourPrivacyTitle, protectYourPrivacyDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabradorDetailsDomainHolder)) {
            return false;
        }
        LabradorDetailsDomainHolder labradorDetailsDomainHolder = (LabradorDetailsDomainHolder) other;
        return AbstractC22676k.m65745e(this.timestampTitle, labradorDetailsDomainHolder.timestampTitle) && AbstractC22676k.m65745e(this.samples, labradorDetailsDomainHolder.samples) && AbstractC22676k.m65745e(this.determinationTitle, labradorDetailsDomainHolder.determinationTitle) && AbstractC22676k.m65745e(this.readings, labradorDetailsDomainHolder.readings) && AbstractC22676k.m65745e(this.insightBody, labradorDetailsDomainHolder.insightBody) && AbstractC22676k.m65745e(this.averageHr, labradorDetailsDomainHolder.averageHr) && AbstractC22676k.m65745e(this.shareText, labradorDetailsDomainHolder.shareText) && AbstractC22676k.m65745e(this.disclaimerText, labradorDetailsDomainHolder.disclaimerText) && AbstractC22676k.m65745e(this.addNotesText, labradorDetailsDomainHolder.addNotesText) && AbstractC22676k.m65745e(this.removeReadingText, labradorDetailsDomainHolder.removeReadingText) && AbstractC22676k.m65745e(this.id, labradorDetailsDomainHolder.id) && AbstractC22676k.m65745e(this.timestamp, labradorDetailsDomainHolder.timestamp) && AbstractC22676k.m65745e(this.savedSymptoms, labradorDetailsDomainHolder.savedSymptoms) && AbstractC22676k.m65745e(this.savedNotes, labradorDetailsDomainHolder.savedNotes) && AbstractC22676k.m65745e(this.pdfPresignedUrl, labradorDetailsDomainHolder.pdfPresignedUrl) && AbstractC22676k.m65745e(this.protectYourPrivacyTitle, labradorDetailsDomainHolder.protectYourPrivacyTitle) && AbstractC22676k.m65745e(this.protectYourPrivacyDescription, labradorDetailsDomainHolder.protectYourPrivacyDescription);
    }

    public final TextResource getAddNotesText() {
        return this.addNotesText;
    }

    public final TextResource getAverageHr() {
        return this.averageHr;
    }

    public final TextResource getDeterminationTitle() {
        return this.determinationTitle;
    }

    public final TextResource getDisclaimerText() {
        return this.disclaimerText;
    }

    public final String getId() {
        return this.id;
    }

    public final TextResource getInsightBody() {
        return this.insightBody;
    }

    public final String getPdfPresignedUrl() {
        return this.pdfPresignedUrl;
    }

    public final String getProtectYourPrivacyDescription() {
        return this.protectYourPrivacyDescription;
    }

    public final String getProtectYourPrivacyTitle() {
        return this.protectYourPrivacyTitle;
    }

    public final List<C32573b> getReadings() {
        return this.readings;
    }

    public final TextResource getRemoveReadingText() {
        return this.removeReadingText;
    }

    public final List<Double> getSamples() {
        return this.samples;
    }

    public final String getSavedNotes() {
        return this.savedNotes;
    }

    public final List<String> getSavedSymptoms() {
        return this.savedSymptoms;
    }

    public final TextResource getShareText() {
        return this.shareText;
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final TextResource getTimestampTitle() {
        return this.timestampTitle;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC21702c.m61131b(this.timestamp, AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC11895b.m31983b(this.timestampTitle.hashCode() * 31, 31, this.samples), this.determinationTitle, 31), 31, this.readings), this.insightBody, 31), this.averageHr, 31), this.shareText, 31), this.disclaimerText, 31), this.addNotesText, 31), this.removeReadingText, 31), 31, this.id), 31), 31, this.savedSymptoms);
        String str = this.savedNotes;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pdfPresignedUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.protectYourPrivacyTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.protectYourPrivacyDescription;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.timestampTitle;
        List<Double> list = this.samples;
        TextResource textResource2 = this.determinationTitle;
        List<C32573b> list2 = this.readings;
        TextResource textResource3 = this.insightBody;
        TextResource textResource4 = this.averageHr;
        TextResource textResource5 = this.shareText;
        TextResource textResource6 = this.disclaimerText;
        TextResource textResource7 = this.addNotesText;
        TextResource textResource8 = this.removeReadingText;
        String str = this.id;
        Instant instant = this.timestamp;
        List<String> list3 = this.savedSymptoms;
        String str2 = this.savedNotes;
        String str3 = this.pdfPresignedUrl;
        String str4 = this.protectYourPrivacyTitle;
        String str5 = this.protectYourPrivacyDescription;
        StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "LabradorDetailsDomainHolder(timestampTitle=", ", samples=", ", determinationTitle=", list);
        AbstractC21702c.m61143n(textResource2, ", readings=", ", insightBody=", sbM106657p, list2);
        AbstractC30007c.m91855y(sbM106657p, textResource3, ", averageHr=", textResource4, ", shareText=");
        AbstractC30007c.m91855y(sbM106657p, textResource5, ", disclaimerText=", textResource6, ", addNotesText=");
        AbstractC30007c.m91855y(sbM106657p, textResource7, ", removeReadingText=", textResource8, ", id=");
        sbM106657p.append(str);
        sbM106657p.append(", timestamp=");
        sbM106657p.append(instant);
        sbM106657p.append(", savedSymptoms=");
        AbstractC17176i.m48511m(", savedNotes=", str2, ", pdfPresignedUrl=", sbM106657p, list3);
        AbstractC11266d.m30444B(sbM106657p, str3, ", protectYourPrivacyTitle=", str4, ", protectYourPrivacyDescription=");
        return AbstractC25012a.m73376i(str5, ")", sbM106657p);
    }

    public LabradorDetailsDomainHolder(TextResource timestampTitle, List<Double> samples, TextResource determinationTitle, List<C32573b> readings, TextResource insightBody, TextResource averageHr, TextResource shareText, TextResource disclaimerText, TextResource addNotesText, TextResource removeReadingText, String id4, Instant timestamp, List<String> savedSymptoms, String str, String str2, String str3, String str4) {
        AbstractC22676k.m65750j(timestampTitle, "timestampTitle");
        AbstractC22676k.m65750j(samples, "samples");
        AbstractC22676k.m65750j(determinationTitle, "determinationTitle");
        AbstractC22676k.m65750j(readings, "readings");
        AbstractC22676k.m65750j(insightBody, "insightBody");
        AbstractC22676k.m65750j(averageHr, "averageHr");
        AbstractC22676k.m65750j(shareText, "shareText");
        AbstractC22676k.m65750j(disclaimerText, "disclaimerText");
        AbstractC22676k.m65750j(addNotesText, "addNotesText");
        AbstractC22676k.m65750j(removeReadingText, "removeReadingText");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(timestamp, "timestamp");
        AbstractC22676k.m65750j(savedSymptoms, "savedSymptoms");
        this.timestampTitle = timestampTitle;
        this.samples = samples;
        this.determinationTitle = determinationTitle;
        this.readings = readings;
        this.insightBody = insightBody;
        this.averageHr = averageHr;
        this.shareText = shareText;
        this.disclaimerText = disclaimerText;
        this.addNotesText = addNotesText;
        this.removeReadingText = removeReadingText;
        this.id = id4;
        this.timestamp = timestamp;
        this.savedSymptoms = savedSymptoms;
        this.savedNotes = str;
        this.pdfPresignedUrl = str2;
        this.protectYourPrivacyTitle = str3;
        this.protectYourPrivacyDescription = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LabradorDetailsDomainHolder(TextResource textResource, List list, TextResource textResource2, List list2, TextResource textResource3, TextResource textResource4, TextResource textResource5, TextResource textResource6, TextResource textResource7, TextResource textResource8, String str, Instant instant, List list3, String str2, String str3, String str4, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Instant EPOCH;
        TextResource textResourceM21267a = (i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource;
        int i14 = i13 & 2;
        List list4 = C25271y.f99162w;
        List list5 = i14 != 0 ? list4 : list;
        TextResource textResourceM21267a2 = (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2;
        List list6 = (i13 & 8) != 0 ? list4 : list2;
        TextResource textResourceM21267a3 = (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3;
        TextResource textResourceM21267a4 = (i13 & 32) != 0 ? AbstractC8693b.m21267a() : textResource4;
        TextResource textResourceM21277k = (i13 & 64) != 0 ? AbstractC8693b.m21277k(AbstractC31794f.f131678q0) : textResource5;
        TextResource textResourceM21277k2 = (i13 & 128) != 0 ? AbstractC8693b.m21277k(AbstractC31794f.f131668l0) : textResource6;
        TextResource textResourceM21277k3 = (i13 & 256) != 0 ? AbstractC8693b.m21277k(AbstractC31794f.f131667l) : textResource7;
        TextResource textResourceM21277k4 = (i13 & 512) != 0 ? AbstractC8693b.m21277k(AbstractC31794f.f131670m0) : textResource8;
        String str6 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? "" : str;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            EPOCH = Instant.EPOCH;
            AbstractC22676k.m65749i(EPOCH, "EPOCH");
        } else {
            EPOCH = instant;
        }
        this(textResourceM21267a, list5, textResourceM21267a2, list6, textResourceM21267a3, textResourceM21267a4, textResourceM21277k, textResourceM21277k2, textResourceM21277k3, textResourceM21277k4, str6, EPOCH, (i13 & 4096) == 0 ? list3 : list4, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str2, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str3, (i13 & 32768) != 0 ? null : str4, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : str5);
    }
}
