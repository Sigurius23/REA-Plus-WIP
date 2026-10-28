package com.whoop.whooplabs.data.room.entity;

import androidx.core.app.NotificationCompat;
import ih0.AbstractC18489d0;
import org.joda.time.DateTime;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\"\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010#\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010$\u001a\u00020\u0000J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003Ji\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\bHÆ\u0001J\u0014\u0010/\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00101\u001a\u00020\u0003HÖ\u0081\u0004J\n\u00102\u001a\u00020\rHÖ\u0081\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u0016\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001a¨\u00063"}, m65681d2 = {"Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;", "", "studyId", "", "startTime", "Lorg/joda/time/DateTime;", "endTime", "hrDeviceConnected", "", NotificationCompat.CATEGORY_STATUS, "Lcom/whoop/whooplabs/data/room/entity/StudyStatus;", "campaignId", "pdfFileName", "", "protocolStep", "protocolCompleted", "<init>", "(ILorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLcom/whoop/whooplabs/data/room/entity/StudyStatus;ILjava/lang/String;IZ)V", "getStudyId", "()I", "setStudyId", "(I)V", "getStartTime", "()Lorg/joda/time/DateTime;", "getEndTime", "getHrDeviceConnected", "()Z", "getStatus", "()Lcom/whoop/whooplabs/data/room/entity/StudyStatus;", "getCampaignId", "getPdfFileName", "()Ljava/lang/String;", "getProtocolStep", "getProtocolCompleted", "inProgress", "ended", "notStarted", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class WhoopLabsStudy {
    public static final int $stable = 8;
    private final int campaignId;
    private final DateTime endTime;
    private final boolean hrDeviceConnected;
    private final String pdfFileName;
    private final boolean protocolCompleted;
    private final int protocolStep;
    private final DateTime startTime;
    private final StudyStatus status;
    private int studyId;

    public WhoopLabsStudy(int i13, DateTime dateTime, DateTime dateTime2, boolean z4, StudyStatus status, int i14, String str, int i15, boolean z13) {
        AbstractC22676k.m65750j(status, "status");
        this.studyId = i13;
        this.startTime = dateTime;
        this.endTime = dateTime2;
        this.hrDeviceConnected = z4;
        this.status = status;
        this.campaignId = i14;
        this.pdfFileName = str;
        this.protocolStep = i15;
        this.protocolCompleted = z13;
    }

    public static /* synthetic */ WhoopLabsStudy copy$default(WhoopLabsStudy whoopLabsStudy, int i13, DateTime dateTime, DateTime dateTime2, boolean z4, StudyStatus studyStatus, int i14, String str, int i15, boolean z13, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i13 = whoopLabsStudy.studyId;
        }
        if ((i16 & 2) != 0) {
            dateTime = whoopLabsStudy.startTime;
        }
        if ((i16 & 4) != 0) {
            dateTime2 = whoopLabsStudy.endTime;
        }
        if ((i16 & 8) != 0) {
            z4 = whoopLabsStudy.hrDeviceConnected;
        }
        if ((i16 & 16) != 0) {
            studyStatus = whoopLabsStudy.status;
        }
        if ((i16 & 32) != 0) {
            i14 = whoopLabsStudy.campaignId;
        }
        if ((i16 & 64) != 0) {
            str = whoopLabsStudy.pdfFileName;
        }
        if ((i16 & 128) != 0) {
            i15 = whoopLabsStudy.protocolStep;
        }
        if ((i16 & 256) != 0) {
            z13 = whoopLabsStudy.protocolCompleted;
        }
        int i17 = i15;
        boolean z14 = z13;
        int i18 = i14;
        String str2 = str;
        StudyStatus studyStatus2 = studyStatus;
        DateTime dateTime3 = dateTime2;
        return whoopLabsStudy.copy(i13, dateTime, dateTime3, z4, studyStatus2, i18, str2, i17, z14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStudyId() {
        return this.studyId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DateTime getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DateTime getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHrDeviceConnected() {
        return this.hrDeviceConnected;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final StudyStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getCampaignId() {
        return this.campaignId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPdfFileName() {
        return this.pdfFileName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getProtocolStep() {
        return this.protocolStep;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getProtocolCompleted() {
        return this.protocolCompleted;
    }

    public final WhoopLabsStudy copy(int studyId, DateTime startTime, DateTime endTime, boolean hrDeviceConnected, StudyStatus status, int campaignId, String pdfFileName, int protocolStep, boolean protocolCompleted) {
        AbstractC22676k.m65750j(status, "status");
        return new WhoopLabsStudy(studyId, startTime, endTime, hrDeviceConnected, status, campaignId, pdfFileName, protocolStep, protocolCompleted);
    }

    public final WhoopLabsStudy ended(DateTime endTime) {
        return copy$default(this, 0, null, endTime, false, StudyStatus.ENDED, 0, null, 0, false, 491, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhoopLabsStudy)) {
            return false;
        }
        WhoopLabsStudy whoopLabsStudy = (WhoopLabsStudy) other;
        return this.studyId == whoopLabsStudy.studyId && AbstractC22676k.m65745e(this.startTime, whoopLabsStudy.startTime) && AbstractC22676k.m65745e(this.endTime, whoopLabsStudy.endTime) && this.hrDeviceConnected == whoopLabsStudy.hrDeviceConnected && this.status == whoopLabsStudy.status && this.campaignId == whoopLabsStudy.campaignId && AbstractC22676k.m65745e(this.pdfFileName, whoopLabsStudy.pdfFileName) && this.protocolStep == whoopLabsStudy.protocolStep && this.protocolCompleted == whoopLabsStudy.protocolCompleted;
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    public final DateTime getEndTime() {
        return this.endTime;
    }

    public final boolean getHrDeviceConnected() {
        return this.hrDeviceConnected;
    }

    public final String getPdfFileName() {
        return this.pdfFileName;
    }

    public final boolean getProtocolCompleted() {
        return this.protocolCompleted;
    }

    public final int getProtocolStep() {
        return this.protocolStep;
    }

    public final DateTime getStartTime() {
        return this.startTime;
    }

    public final StudyStatus getStatus() {
        return this.status;
    }

    public final int getStudyId() {
        return this.studyId;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.studyId) * 31;
        DateTime dateTime = this.startTime;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.endTime;
        int iM30448b = AbstractC11266d.m30448b(this.campaignId, (this.status.hashCode() + AbstractC2875y.m8289b((iHashCode2 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31, 31, this.hrDeviceConnected)) * 31, 31);
        String str = this.pdfFileName;
        return Boolean.hashCode(this.protocolCompleted) + AbstractC11266d.m30448b(this.protocolStep, (iM30448b + (str != null ? str.hashCode() : 0)) * 31, 31);
    }

    public final WhoopLabsStudy inProgress(DateTime startTime) {
        return copy$default(this, 0, startTime, null, false, StudyStatus.IN_PROGRESS, 0, null, 0, false, 493, null);
    }

    public final WhoopLabsStudy notStarted() {
        return copy$default(this, 0, null, null, false, StudyStatus.NOT_STARTED, 0, null, 0, false, 105, null);
    }

    public final void setStudyId(int i13) {
        this.studyId = i13;
    }

    public String toString() {
        int i13 = this.studyId;
        DateTime dateTime = this.startTime;
        DateTime dateTime2 = this.endTime;
        boolean z4 = this.hrDeviceConnected;
        StudyStatus studyStatus = this.status;
        int i14 = this.campaignId;
        String str = this.pdfFileName;
        int i15 = this.protocolStep;
        boolean z13 = this.protocolCompleted;
        StringBuilder sb4 = new StringBuilder("WhoopLabsStudy(studyId=");
        sb4.append(i13);
        sb4.append(", startTime=");
        sb4.append(dateTime);
        sb4.append(", endTime=");
        sb4.append(dateTime2);
        sb4.append(", hrDeviceConnected=");
        sb4.append(z4);
        sb4.append(", status=");
        sb4.append(studyStatus);
        sb4.append(", campaignId=");
        sb4.append(i14);
        sb4.append(", pdfFileName=");
        AbstractC11266d.m30470x(i15, str, ", protocolStep=", ", protocolCompleted=", sb4);
        return AbstractC18489d0.m53372m(sb4, z13, ")");
    }

    public /* synthetic */ WhoopLabsStudy(int i13, DateTime dateTime, DateTime dateTime2, boolean z4, StudyStatus studyStatus, int i14, String str, int i15, boolean z13, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? 0 : i13, dateTime, dateTime2, z4, studyStatus, i14, str, i15, z13);
    }
}
