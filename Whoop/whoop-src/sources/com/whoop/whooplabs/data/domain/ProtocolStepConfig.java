package com.whoop.whooplabs.data.domain;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJn\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u000fJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b/\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b0\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b1\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b2\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b3\u0010\u001a¨\u00064"}, m65681d2 = {"Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;", "Landroid/os/Parcelable;", "", "stepId", "", "inputLabel", "min", "max", "minErrorText", "maxErrorText", "hint", "rowCount", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "component7", "component8", "copy", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStepId", "Ljava/lang/String;", "getInputLabel", "Ljava/lang/Integer;", "getMin", "getMax", "getMinErrorText", "getMaxErrorText", "getHint", "getRowCount", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ProtocolStepConfig implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ProtocolStepConfig> CREATOR = new Creator();
    private final String hint;
    private final String inputLabel;
    private final Integer max;
    private final String maxErrorText;
    private final Integer min;
    private final String minErrorText;
    private final Integer rowCount;
    private final int stepId;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<ProtocolStepConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProtocolStepConfig createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new ProtocolStepConfig(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProtocolStepConfig[] newArray(int i13) {
            return new ProtocolStepConfig[i13];
        }
    }

    public ProtocolStepConfig(int i13, String str, Integer num, Integer num2, String str2, String str3, String str4, Integer num3) {
        this.stepId = i13;
        this.inputLabel = str;
        this.min = num;
        this.max = num2;
        this.minErrorText = str2;
        this.maxErrorText = str3;
        this.hint = str4;
        this.rowCount = num3;
    }

    public static /* synthetic */ ProtocolStepConfig copy$default(ProtocolStepConfig protocolStepConfig, int i13, String str, Integer num, Integer num2, String str2, String str3, String str4, Integer num3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = protocolStepConfig.stepId;
        }
        if ((i14 & 2) != 0) {
            str = protocolStepConfig.inputLabel;
        }
        if ((i14 & 4) != 0) {
            num = protocolStepConfig.min;
        }
        if ((i14 & 8) != 0) {
            num2 = protocolStepConfig.max;
        }
        if ((i14 & 16) != 0) {
            str2 = protocolStepConfig.minErrorText;
        }
        if ((i14 & 32) != 0) {
            str3 = protocolStepConfig.maxErrorText;
        }
        if ((i14 & 64) != 0) {
            str4 = protocolStepConfig.hint;
        }
        if ((i14 & 128) != 0) {
            num3 = protocolStepConfig.rowCount;
        }
        String str5 = str4;
        Integer num4 = num3;
        String str6 = str2;
        String str7 = str3;
        return protocolStepConfig.copy(i13, str, num, num2, str6, str7, str5, num4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStepId() {
        return this.stepId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInputLabel() {
        return this.inputLabel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMinErrorText() {
        return this.minErrorText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMaxErrorText() {
        return this.maxErrorText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getRowCount() {
        return this.rowCount;
    }

    public final ProtocolStepConfig copy(int stepId, String inputLabel, Integer min, Integer max, String minErrorText, String maxErrorText, String hint, Integer rowCount) {
        return new ProtocolStepConfig(stepId, inputLabel, min, max, minErrorText, maxErrorText, hint, rowCount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProtocolStepConfig)) {
            return false;
        }
        ProtocolStepConfig protocolStepConfig = (ProtocolStepConfig) other;
        return this.stepId == protocolStepConfig.stepId && AbstractC22676k.m65745e(this.inputLabel, protocolStepConfig.inputLabel) && AbstractC22676k.m65745e(this.min, protocolStepConfig.min) && AbstractC22676k.m65745e(this.max, protocolStepConfig.max) && AbstractC22676k.m65745e(this.minErrorText, protocolStepConfig.minErrorText) && AbstractC22676k.m65745e(this.maxErrorText, protocolStepConfig.maxErrorText) && AbstractC22676k.m65745e(this.hint, protocolStepConfig.hint) && AbstractC22676k.m65745e(this.rowCount, protocolStepConfig.rowCount);
    }

    public final String getHint() {
        return this.hint;
    }

    public final String getInputLabel() {
        return this.inputLabel;
    }

    public final Integer getMax() {
        return this.max;
    }

    public final String getMaxErrorText() {
        return this.maxErrorText;
    }

    public final Integer getMin() {
        return this.min;
    }

    public final String getMinErrorText() {
        return this.minErrorText;
    }

    public final Integer getRowCount() {
        return this.rowCount;
    }

    public final int getStepId() {
        return this.stepId;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.stepId) * 31;
        String str = this.inputLabel;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.min;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.max;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.minErrorText;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.maxErrorText;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.hint;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.rowCount;
        return iHashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.stepId;
        String str = this.inputLabel;
        Integer num = this.min;
        Integer num2 = this.max;
        String str2 = this.minErrorText;
        String str3 = this.maxErrorText;
        String str4 = this.hint;
        Integer num3 = this.rowCount;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "ProtocolStepConfig(stepId=", ", inputLabel=", str, ", min=");
        AbstractC31061c.m95621A(sbM53373n, num, ", max=", num2, ", minErrorText=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", maxErrorText=", str3, ", hint=");
        sbM53373n.append(str4);
        sbM53373n.append(", rowCount=");
        sbM53373n.append(num3);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.stepId);
        dest.writeString(this.inputLabel);
        Integer num = this.min;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        Integer num2 = this.max;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num2);
        }
        dest.writeString(this.minErrorText);
        dest.writeString(this.maxErrorText);
        dest.writeString(this.hint);
        Integer num3 = this.rowCount;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num3);
        }
    }

    public /* synthetic */ ProtocolStepConfig(int i13, String str, Integer num, Integer num2, String str2, String str3, String str4, Integer num3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, str, num, num2, str2, str3, str4, (i14 & 128) != 0 ? null : num3);
    }
}
