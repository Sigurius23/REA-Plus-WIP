package com.whoop.profile.view.edit;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/profile/view/edit/HeightWeightState;", "", "height", "", "weight", "<init>", "(FF)V", "getHeight", "()F", "getWeight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class HeightWeightState {
    public static final int $stable = 0;
    private final float height;
    private final float weight;

    /* JADX WARN: Illegal instructions before constructor call */
    public HeightWeightState() {
        float f13 = 0.0f;
        this(f13, f13, 3, null);
    }

    public static /* synthetic */ HeightWeightState copy$default(HeightWeightState heightWeightState, float f13, float f14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = heightWeightState.height;
        }
        if ((i13 & 2) != 0) {
            f14 = heightWeightState.weight;
        }
        return heightWeightState.copy(f13, f14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    public final HeightWeightState copy(float height, float weight) {
        return new HeightWeightState(height, weight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeightWeightState)) {
            return false;
        }
        HeightWeightState heightWeightState = (HeightWeightState) other;
        return Float.compare(this.height, heightWeightState.height) == 0 && Float.compare(this.weight, heightWeightState.weight) == 0;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return Float.hashCode(this.weight) + (Float.hashCode(this.height) * 31);
    }

    public String toString() {
        return AbstractC31061c.m95638n("HeightWeightState(height=", this.height, ", weight=", this.weight, ")");
    }

    public HeightWeightState(float f13, float f14) {
        this.height = f13;
        this.weight = f14;
    }

    public /* synthetic */ HeightWeightState(float f13, float f14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0.0f : f13, (i13 & 2) != 0 ? 0.0f : f14);
    }
}
