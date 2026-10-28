package io.getstream.android.video.generated.models;

import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/android/video/generated/models/Bound;", "", "inclusive", "", "value", "", "(ZF)V", "getInclusive", "()Z", "getValue", "()F", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class Bound {
    private final boolean inclusive;
    private final float value;

    public Bound(@InterfaceC30731q(name = "inclusive") boolean z4, @InterfaceC30731q(name = "value") float f13) {
        this.inclusive = z4;
        this.value = f13;
    }

    public static /* synthetic */ Bound copy$default(Bound bound, boolean z4, float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = bound.inclusive;
        }
        if ((i13 & 2) != 0) {
            f13 = bound.value;
        }
        return bound.copy(z4, f13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getInclusive() {
        return this.inclusive;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    public final Bound copy(@InterfaceC30731q(name = "inclusive") boolean inclusive, @InterfaceC30731q(name = "value") float value) {
        return new Bound(inclusive, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Bound)) {
            return false;
        }
        Bound bound = (Bound) other;
        return this.inclusive == bound.inclusive && Float.compare(this.value, bound.value) == 0;
    }

    public final boolean getInclusive() {
        return this.inclusive;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.hashCode(this.value) + (Boolean.hashCode(this.inclusive) * 31);
    }

    public String toString() {
        return "Bound(inclusive=" + this.inclusive + ", value=" + this.value + ")";
    }
}
