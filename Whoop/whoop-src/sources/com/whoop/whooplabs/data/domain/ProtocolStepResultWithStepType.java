package com.whoop.whooplabs.data.domain;

import com.whoop.whooplabs.data.room.entity.ProtocolStepResult;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/whooplabs/data/domain/ProtocolStepResultWithStepType;", "", "protocolStepResult", "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;", "inputType", "", "<init>", "(Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;Ljava/lang/String;)V", "getProtocolStepResult", "()Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;", "getInputType", "()Ljava/lang/String;", "isTimePickerStep", "", "()Z", "isDateTimePickerStep", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ProtocolStepResultWithStepType {
    public static final int $stable = 8;
    private final String inputType;
    private final ProtocolStepResult protocolStepResult;

    public ProtocolStepResultWithStepType(ProtocolStepResult protocolStepResult, String str) {
        AbstractC22676k.m65750j(protocolStepResult, "protocolStepResult");
        this.protocolStepResult = protocolStepResult;
        this.inputType = str;
    }

    public static /* synthetic */ ProtocolStepResultWithStepType copy$default(ProtocolStepResultWithStepType protocolStepResultWithStepType, ProtocolStepResult protocolStepResult, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            protocolStepResult = protocolStepResultWithStepType.protocolStepResult;
        }
        if ((i13 & 2) != 0) {
            str = protocolStepResultWithStepType.inputType;
        }
        return protocolStepResultWithStepType.copy(protocolStepResult, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProtocolStepResult getProtocolStepResult() {
        return this.protocolStepResult;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInputType() {
        return this.inputType;
    }

    public final ProtocolStepResultWithStepType copy(ProtocolStepResult protocolStepResult, String inputType) {
        AbstractC22676k.m65750j(protocolStepResult, "protocolStepResult");
        return new ProtocolStepResultWithStepType(protocolStepResult, inputType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProtocolStepResultWithStepType)) {
            return false;
        }
        ProtocolStepResultWithStepType protocolStepResultWithStepType = (ProtocolStepResultWithStepType) other;
        return AbstractC22676k.m65745e(this.protocolStepResult, protocolStepResultWithStepType.protocolStepResult) && AbstractC22676k.m65745e(this.inputType, protocolStepResultWithStepType.inputType);
    }

    public final String getInputType() {
        return this.inputType;
    }

    public final ProtocolStepResult getProtocolStepResult() {
        return this.protocolStepResult;
    }

    public int hashCode() {
        int iHashCode = this.protocolStepResult.hashCode() * 31;
        String str = this.inputType;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isDateTimePickerStep() {
        return AbstractC22676k.m65745e(this.inputType, "DATETIME_PICKER");
    }

    public final boolean isTimePickerStep() {
        return AbstractC22676k.m65745e(this.inputType, "TIME_PICKER");
    }

    public String toString() {
        return "ProtocolStepResultWithStepType(protocolStepResult=" + this.protocolStepResult + ", inputType=" + this.inputType + ")";
    }

    public /* synthetic */ ProtocolStepResultWithStepType(ProtocolStepResult protocolStepResult, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(protocolStepResult, (i13 & 2) != 0 ? null : str);
    }
}
