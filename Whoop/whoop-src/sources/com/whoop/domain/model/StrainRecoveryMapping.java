package com.whoop.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import hc3.AbstractC17176i;
import i93.C18279e;
import i93.InterfaceC18280f;
import java.io.Serializable;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\u0013J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b+\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b,\u0010\u001c¨\u0006-"}, m65681d2 = {"Lcom/whoop/domain/model/StrainRecoveryMapping;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "recovery", "", "lowerRecStrain", "recStrain", "upperRecStrain", "<init>", "(IDDD)V", "Li93/f;", "", "getRecStrainPercentRange", "()Li93/f;", "", "toString", "()Ljava/lang/String;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()D", "component3", "component4", "copy", "(IDDD)Lcom/whoop/domain/model/StrainRecoveryMapping;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getRecovery", "D", "getLowerRecStrain", "getRecStrain", "getUpperRecStrain", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class StrainRecoveryMapping implements Parcelable, Serializable {
    public static final Parcelable.Creator<StrainRecoveryMapping> CREATOR = new Creator();
    private final double lowerRecStrain;
    private final double recStrain;
    private final int recovery;
    private final double upperRecStrain;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<StrainRecoveryMapping> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrainRecoveryMapping createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new StrainRecoveryMapping(parcel.readInt(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrainRecoveryMapping[] newArray(int i13) {
            return new StrainRecoveryMapping[i13];
        }
    }

    public StrainRecoveryMapping(int i13, double d3, double d14, double d15) {
        this.recovery = i13;
        this.lowerRecStrain = d3;
        this.recStrain = d14;
        this.upperRecStrain = d15;
    }

    public static /* synthetic */ StrainRecoveryMapping copy$default(StrainRecoveryMapping strainRecoveryMapping, int i13, double d3, double d14, double d15, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = strainRecoveryMapping.recovery;
        }
        if ((i14 & 2) != 0) {
            d3 = strainRecoveryMapping.lowerRecStrain;
        }
        if ((i14 & 4) != 0) {
            d14 = strainRecoveryMapping.recStrain;
        }
        if ((i14 & 8) != 0) {
            d15 = strainRecoveryMapping.upperRecStrain;
        }
        double d16 = d15;
        return strainRecoveryMapping.copy(i13, d3, d14, d16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRecovery() {
        return this.recovery;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLowerRecStrain() {
        return this.lowerRecStrain;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getRecStrain() {
        return this.recStrain;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getUpperRecStrain() {
        return this.upperRecStrain;
    }

    public final StrainRecoveryMapping copy(int recovery, double lowerRecStrain, double recStrain, double upperRecStrain) {
        return new StrainRecoveryMapping(recovery, lowerRecStrain, recStrain, upperRecStrain);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrainRecoveryMapping)) {
            return false;
        }
        StrainRecoveryMapping strainRecoveryMapping = (StrainRecoveryMapping) other;
        return this.recovery == strainRecoveryMapping.recovery && Double.compare(this.lowerRecStrain, strainRecoveryMapping.lowerRecStrain) == 0 && Double.compare(this.recStrain, strainRecoveryMapping.recStrain) == 0 && Double.compare(this.upperRecStrain, strainRecoveryMapping.upperRecStrain) == 0;
    }

    public final double getLowerRecStrain() {
        return this.lowerRecStrain;
    }

    public final double getRecStrain() {
        return this.recStrain;
    }

    public final InterfaceC18280f getRecStrainPercentRange() {
        return new C18279e((float) (this.lowerRecStrain / 21.0d), (float) (this.upperRecStrain / 21.0d));
    }

    public final int getRecovery() {
        return this.recovery;
    }

    public final double getUpperRecStrain() {
        return this.upperRecStrain;
    }

    public int hashCode() {
        return Double.hashCode(this.upperRecStrain) + AbstractC17176i.m48499a(AbstractC17176i.m48499a(Integer.hashCode(this.recovery) * 31, 31, this.lowerRecStrain), 31, this.recStrain);
    }

    public String toString() {
        double d3 = this.lowerRecStrain;
        double d14 = this.recStrain;
        double d15 = this.upperRecStrain;
        int i13 = this.recovery;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(d3);
        sb4.append("-");
        sb4.append(d14);
        AbstractC31061c.m95622B(sb4, "-", d15, "/");
        sb4.append(i13);
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.recovery);
        dest.writeDouble(this.lowerRecStrain);
        dest.writeDouble(this.recStrain);
        dest.writeDouble(this.upperRecStrain);
    }
}
