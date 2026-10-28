package com.whoop.whooplabs.data.room.entity;

import no.nordicsemi.android.dfu.DfuBaseService;
import org.joda.time.DateTime;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0014B\u007f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0015J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0096\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00106J\u0014\u00107\u001a\u00020\f2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00109\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010:\u001a\u00020\u000eHÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"¨\u0006;"}, m65681d2 = {"Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;", "", "campaignId", "", "resultId", "order", "startTimestamp", "Lorg/joda/time/DateTime;", "endTimestamp", "mysticReading", "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;", "typeformSubmitted", "", "textOption", "", "numberInput", "textInput", "timestampInput", "stepType", "<init>", "(IIILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;)V", "(IIILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "getCampaignId", "()I", "getResultId", "getOrder", "getStartTimestamp", "()Lorg/joda/time/DateTime;", "getEndTimestamp", "getMysticReading", "()Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;", "getTypeformSubmitted", "()Z", "getTextOption", "()Ljava/lang/String;", "getNumberInput", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTextInput", "getTimestampInput", "getStepType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(IIILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;", "equals", "other", "hashCode", "toString", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ProtocolStepResult {
    public static final int $stable = 8;
    private final int campaignId;
    private final DateTime endTimestamp;
    private final ProtocolStepMysticReading mysticReading;
    private final Integer numberInput;
    private final int order;
    private final int resultId;
    private final DateTime startTimestamp;
    private final transient String stepType;
    private final String textInput;
    private final String textOption;
    private final DateTime timestampInput;
    private final boolean typeformSubmitted;

    public ProtocolStepResult(int i13, int i14, int i15, DateTime dateTime, DateTime dateTime2, ProtocolStepMysticReading protocolStepMysticReading, boolean z4, String str, Integer num, String str2, DateTime dateTime3, String str3) {
        this.campaignId = i13;
        this.resultId = i14;
        this.order = i15;
        this.startTimestamp = dateTime;
        this.endTimestamp = dateTime2;
        this.mysticReading = protocolStepMysticReading;
        this.typeformSubmitted = z4;
        this.textOption = str;
        this.numberInput = num;
        this.textInput = str2;
        this.timestampInput = dateTime3;
        this.stepType = str3;
    }

    public static /* synthetic */ ProtocolStepResult copy$default(ProtocolStepResult protocolStepResult, int i13, int i14, int i15, DateTime dateTime, DateTime dateTime2, ProtocolStepMysticReading protocolStepMysticReading, boolean z4, String str, Integer num, String str2, DateTime dateTime3, String str3, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i13 = protocolStepResult.campaignId;
        }
        if ((i16 & 2) != 0) {
            i14 = protocolStepResult.resultId;
        }
        if ((i16 & 4) != 0) {
            i15 = protocolStepResult.order;
        }
        if ((i16 & 8) != 0) {
            dateTime = protocolStepResult.startTimestamp;
        }
        if ((i16 & 16) != 0) {
            dateTime2 = protocolStepResult.endTimestamp;
        }
        if ((i16 & 32) != 0) {
            protocolStepMysticReading = protocolStepResult.mysticReading;
        }
        if ((i16 & 64) != 0) {
            z4 = protocolStepResult.typeformSubmitted;
        }
        if ((i16 & 128) != 0) {
            str = protocolStepResult.textOption;
        }
        if ((i16 & 256) != 0) {
            num = protocolStepResult.numberInput;
        }
        if ((i16 & 512) != 0) {
            str2 = protocolStepResult.textInput;
        }
        if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            dateTime3 = protocolStepResult.timestampInput;
        }
        if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            str3 = protocolStepResult.stepType;
        }
        DateTime dateTime4 = dateTime3;
        String str4 = str3;
        Integer num2 = num;
        String str5 = str2;
        boolean z13 = z4;
        String str6 = str;
        DateTime dateTime5 = dateTime2;
        ProtocolStepMysticReading protocolStepMysticReading2 = protocolStepMysticReading;
        return protocolStepResult.copy(i13, i14, i15, dateTime, dateTime5, protocolStepMysticReading2, z13, str6, num2, str5, dateTime4, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCampaignId() {
        return this.campaignId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTextInput() {
        return this.textInput;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final DateTime getTimestampInput() {
        return this.timestampInput;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getStepType() {
        return this.stepType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getResultId() {
        return this.resultId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DateTime getStartTimestamp() {
        return this.startTimestamp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DateTime getEndTimestamp() {
        return this.endTimestamp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ProtocolStepMysticReading getMysticReading() {
        return this.mysticReading;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getTypeformSubmitted() {
        return this.typeformSubmitted;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTextOption() {
        return this.textOption;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getNumberInput() {
        return this.numberInput;
    }

    public final ProtocolStepResult copy(int campaignId, int resultId, int order, DateTime startTimestamp, DateTime endTimestamp, ProtocolStepMysticReading mysticReading, boolean typeformSubmitted, String textOption, Integer numberInput, String textInput, DateTime timestampInput, String stepType) {
        return new ProtocolStepResult(campaignId, resultId, order, startTimestamp, endTimestamp, mysticReading, typeformSubmitted, textOption, numberInput, textInput, timestampInput, stepType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProtocolStepResult)) {
            return false;
        }
        ProtocolStepResult protocolStepResult = (ProtocolStepResult) other;
        return this.campaignId == protocolStepResult.campaignId && this.resultId == protocolStepResult.resultId && this.order == protocolStepResult.order && AbstractC22676k.m65745e(this.startTimestamp, protocolStepResult.startTimestamp) && AbstractC22676k.m65745e(this.endTimestamp, protocolStepResult.endTimestamp) && AbstractC22676k.m65745e(this.mysticReading, protocolStepResult.mysticReading) && this.typeformSubmitted == protocolStepResult.typeformSubmitted && AbstractC22676k.m65745e(this.textOption, protocolStepResult.textOption) && AbstractC22676k.m65745e(this.numberInput, protocolStepResult.numberInput) && AbstractC22676k.m65745e(this.textInput, protocolStepResult.textInput) && AbstractC22676k.m65745e(this.timestampInput, protocolStepResult.timestampInput) && AbstractC22676k.m65745e(this.stepType, protocolStepResult.stepType);
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    public final DateTime getEndTimestamp() {
        return this.endTimestamp;
    }

    public final ProtocolStepMysticReading getMysticReading() {
        return this.mysticReading;
    }

    public final Integer getNumberInput() {
        return this.numberInput;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int getResultId() {
        return this.resultId;
    }

    public final DateTime getStartTimestamp() {
        return this.startTimestamp;
    }

    public final String getStepType() {
        return this.stepType;
    }

    public final String getTextInput() {
        return this.textInput;
    }

    public final String getTextOption() {
        return this.textOption;
    }

    public final DateTime getTimestampInput() {
        return this.timestampInput;
    }

    public final boolean getTypeformSubmitted() {
        return this.typeformSubmitted;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.order, AbstractC11266d.m30448b(this.resultId, Integer.hashCode(this.campaignId) * 31, 31), 31);
        DateTime dateTime = this.startTimestamp;
        int iHashCode = (iM30448b + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.endTimestamp;
        int iHashCode2 = (iHashCode + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        ProtocolStepMysticReading protocolStepMysticReading = this.mysticReading;
        int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (protocolStepMysticReading == null ? 0 : protocolStepMysticReading.hashCode())) * 31, 31, this.typeformSubmitted);
        String str = this.textOption;
        int iHashCode3 = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.numberInput;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.textInput;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DateTime dateTime3 = this.timestampInput;
        int iHashCode6 = (iHashCode5 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        String str3 = this.stepType;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.campaignId;
        int i14 = this.resultId;
        int i15 = this.order;
        DateTime dateTime = this.startTimestamp;
        DateTime dateTime2 = this.endTimestamp;
        ProtocolStepMysticReading protocolStepMysticReading = this.mysticReading;
        boolean z4 = this.typeformSubmitted;
        String str = this.textOption;
        Integer num = this.numberInput;
        String str2 = this.textInput;
        DateTime dateTime3 = this.timestampInput;
        String str3 = this.stepType;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "ProtocolStepResult(campaignId=", ", resultId=", ", order=");
        sbM30465s.append(i15);
        sbM30465s.append(", startTimestamp=");
        sbM30465s.append(dateTime);
        sbM30465s.append(", endTimestamp=");
        sbM30465s.append(dateTime2);
        sbM30465s.append(", mysticReading=");
        sbM30465s.append(protocolStepMysticReading);
        sbM30465s.append(", typeformSubmitted=");
        AbstractC38963t7.m124391u(sbM30465s, z4, ", textOption=", str, ", numberInput=");
        AbstractC13673n.m38577x(num, ", textInput=", str2, ", timestampInput=", sbM30465s);
        sbM30465s.append(dateTime3);
        sbM30465s.append(", stepType=");
        sbM30465s.append(str3);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }

    public /* synthetic */ ProtocolStepResult(int i13, int i14, int i15, DateTime dateTime, DateTime dateTime2, ProtocolStepMysticReading protocolStepMysticReading, boolean z4, String str, Integer num, String str2, DateTime dateTime3, String str3, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, i15, (i16 & 8) != 0 ? null : dateTime, (i16 & 16) != 0 ? null : dateTime2, (i16 & 32) != 0 ? null : protocolStepMysticReading, (i16 & 64) != 0 ? false : z4, (i16 & 128) != 0 ? null : str, (i16 & 256) != 0 ? null : num, (i16 & 512) != 0 ? null : str2, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : dateTime3, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str3);
    }

    public /* synthetic */ ProtocolStepResult(int i13, int i14, int i15, DateTime dateTime, DateTime dateTime2, ProtocolStepMysticReading protocolStepMysticReading, boolean z4, String str, Integer num, String str2, DateTime dateTime3, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, i15, (i16 & 8) != 0 ? null : dateTime, (i16 & 16) != 0 ? null : dateTime2, (i16 & 32) != 0 ? null : protocolStepMysticReading, (i16 & 64) != 0 ? false : z4, (i16 & 128) != 0 ? null : str, (i16 & 256) != 0 ? null : num, (i16 & 512) != 0 ? null : str2, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : dateTime3);
    }

    public ProtocolStepResult(int i13, int i14, int i15, DateTime dateTime, DateTime dateTime2, ProtocolStepMysticReading protocolStepMysticReading, boolean z4, String str, Integer num, String str2, DateTime dateTime3) {
        this(i13, i14, i15, dateTime, dateTime2, protocolStepMysticReading, z4, str, num, str2, dateTime3, null);
    }
}
