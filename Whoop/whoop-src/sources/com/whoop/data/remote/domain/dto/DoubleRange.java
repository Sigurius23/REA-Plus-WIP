package com.whoop.data.remote.domain.dto;

import hc3.AbstractC17176i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003J \u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J \u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006!"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/DoubleRange;", "", "lowerEndpoint", "", "lowerBoundType", "Lcom/whoop/data/remote/domain/dto/BoundType;", "upperEndpoint", "upperBoundType", "<init>", "(DLcom/whoop/data/remote/domain/dto/BoundType;DLcom/whoop/data/remote/domain/dto/BoundType;)V", "getLowerEndpoint", "()D", "getLowerBoundType", "()Lcom/whoop/data/remote/domain/dto/BoundType;", "getUpperEndpoint", "getUpperBoundType", "isInBounds", "", "value", "isAboveBound", "endPoint", "isBelowBound", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class DoubleRange {
    private final BoundType lowerBoundType;
    private final double lowerEndpoint;
    private final BoundType upperBoundType;
    private final double upperEndpoint;

    public DoubleRange(double d3, BoundType lowerBoundType, double d14, BoundType upperBoundType) {
        AbstractC22676k.m65750j(lowerBoundType, "lowerBoundType");
        AbstractC22676k.m65750j(upperBoundType, "upperBoundType");
        this.lowerEndpoint = d3;
        this.lowerBoundType = lowerBoundType;
        this.upperEndpoint = d14;
        this.upperBoundType = upperBoundType;
    }

    public static /* synthetic */ DoubleRange copy$default(DoubleRange doubleRange, double d3, BoundType boundType, double d14, BoundType boundType2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = doubleRange.lowerEndpoint;
        }
        double d15 = d3;
        if ((i13 & 2) != 0) {
            boundType = doubleRange.lowerBoundType;
        }
        BoundType boundType3 = boundType;
        if ((i13 & 4) != 0) {
            d14 = doubleRange.upperEndpoint;
        }
        double d16 = d14;
        if ((i13 & 8) != 0) {
            boundType2 = doubleRange.upperBoundType;
        }
        return doubleRange.copy(d15, boundType3, d16, boundType2);
    }

    private final boolean isAboveBound(double value, double endPoint, BoundType lowerBoundType) {
        if (lowerBoundType == BoundType.OPEN) {
            return value > endPoint;
        }
        return value >= endPoint;
    }

    private final boolean isBelowBound(double value, double endPoint, BoundType upperBoundType) {
        if (upperBoundType == BoundType.OPEN) {
            return value < endPoint;
        }
        return value <= endPoint;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getLowerEndpoint() {
        return this.lowerEndpoint;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BoundType getLowerBoundType() {
        return this.lowerBoundType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getUpperEndpoint() {
        return this.upperEndpoint;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BoundType getUpperBoundType() {
        return this.upperBoundType;
    }

    public final DoubleRange copy(double lowerEndpoint, BoundType lowerBoundType, double upperEndpoint, BoundType upperBoundType) {
        AbstractC22676k.m65750j(lowerBoundType, "lowerBoundType");
        AbstractC22676k.m65750j(upperBoundType, "upperBoundType");
        return new DoubleRange(lowerEndpoint, lowerBoundType, upperEndpoint, upperBoundType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DoubleRange)) {
            return false;
        }
        DoubleRange doubleRange = (DoubleRange) other;
        return Double.compare(this.lowerEndpoint, doubleRange.lowerEndpoint) == 0 && this.lowerBoundType == doubleRange.lowerBoundType && Double.compare(this.upperEndpoint, doubleRange.upperEndpoint) == 0 && this.upperBoundType == doubleRange.upperBoundType;
    }

    public final BoundType getLowerBoundType() {
        return this.lowerBoundType;
    }

    public final double getLowerEndpoint() {
        return this.lowerEndpoint;
    }

    public final BoundType getUpperBoundType() {
        return this.upperBoundType;
    }

    public final double getUpperEndpoint() {
        return this.upperEndpoint;
    }

    public int hashCode() {
        return this.upperBoundType.hashCode() + AbstractC17176i.m48499a((this.lowerBoundType.hashCode() + (Double.hashCode(this.lowerEndpoint) * 31)) * 31, 31, this.upperEndpoint);
    }

    public final boolean isInBounds(double value) {
        return isAboveBound(value, this.lowerEndpoint, this.lowerBoundType) && isBelowBound(value, this.upperEndpoint, this.upperBoundType);
    }

    public String toString() {
        double d3 = this.lowerEndpoint;
        BoundType boundType = this.lowerBoundType;
        double d14 = this.upperEndpoint;
        BoundType boundType2 = this.upperBoundType;
        StringBuilder sb4 = new StringBuilder("DoubleRange(lowerEndpoint=");
        sb4.append(d3);
        sb4.append(", lowerBoundType=");
        sb4.append(boundType);
        AbstractC31061c.m95622B(sb4, ", upperEndpoint=", d14, ", upperBoundType=");
        sb4.append(boundType2);
        sb4.append(")");
        return sb4.toString();
    }
}
