package com.whoop.service.network.model.cycles;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/service/network/model/cycles/PostWorkoutAdditionalMetadata;", "", "realTimeCalories", "", "<init>", "(D)V", "getRealTimeCalories", "()D", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class PostWorkoutAdditionalMetadata {
    private final double realTimeCalories;

    public PostWorkoutAdditionalMetadata(double d3) {
        this.realTimeCalories = d3;
    }

    public static /* synthetic */ PostWorkoutAdditionalMetadata copy$default(PostWorkoutAdditionalMetadata postWorkoutAdditionalMetadata, double d3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = postWorkoutAdditionalMetadata.realTimeCalories;
        }
        return postWorkoutAdditionalMetadata.copy(d3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getRealTimeCalories() {
        return this.realTimeCalories;
    }

    public final PostWorkoutAdditionalMetadata copy(double realTimeCalories) {
        return new PostWorkoutAdditionalMetadata(realTimeCalories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PostWorkoutAdditionalMetadata) && Double.compare(this.realTimeCalories, ((PostWorkoutAdditionalMetadata) other).realTimeCalories) == 0;
    }

    public final double getRealTimeCalories() {
        return this.realTimeCalories;
    }

    public int hashCode() {
        return Double.hashCode(this.realTimeCalories);
    }

    public String toString() {
        return "PostWorkoutAdditionalMetadata(realTimeCalories=" + this.realTimeCalories + ")";
    }
}
