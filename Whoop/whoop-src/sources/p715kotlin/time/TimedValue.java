package p715kotlin.time;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\bF\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000e\u001a\u00028\u0000HÆ\u0083\u0004¢\u0006\u0002\u0010\tJ\u0011\u0010\u000f\u001a\u00020\u0005HÆ\u0083\u0004¢\u0006\u0004\b\u0010\u0010\fJ+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0081\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0017\u0010\u0003\u001a\u00028\u0000X\u0086\u0084\b¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u0005X\u0086\u0084\b¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, m65681d2 = {"Lkotlin/time/TimedValue;", "T", "", "value", AttachmentExtensionsKt.EXTRA_DURATION, "Lkotlin/time/Duration;", "<init>", "(Ljava/lang/Object;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getDuration-UwyO8pc", "()J", "J", "component1", "component2", "component2-UwyO8pc", "copy", "copy-RFiDyg4", "(Ljava/lang/Object;J)Lkotlin/time/TimedValue;", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class TimedValue<T> {
    private final long duration;
    private final T value;

    public /* synthetic */ TimedValue(Object obj, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, j7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-RFiDyg4$default, reason: not valid java name */
    public static /* synthetic */ TimedValue m134398copyRFiDyg4$default(TimedValue timedValue, Object obj, long j7, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            obj = timedValue.value;
        }
        if ((i13 & 2) != 0) {
            j7 = timedValue.duration;
        }
        return timedValue.m134400copyRFiDyg4(obj, j7);
    }

    public final T component1() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2-UwyO8pc, reason: not valid java name and from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: copy-RFiDyg4, reason: not valid java name */
    public final TimedValue<T> m134400copyRFiDyg4(T value, long duration) {
        return new TimedValue<>(value, duration, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimedValue)) {
            return false;
        }
        TimedValue timedValue = (TimedValue) other;
        return AbstractC22676k.m65745e(this.value, timedValue.value) && Duration.m134267equalsimpl0(this.duration, timedValue.duration);
    }

    /* JADX INFO: renamed from: getDuration-UwyO8pc, reason: not valid java name */
    public final long m134401getDurationUwyO8pc() {
        return this.duration;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t14 = this.value;
        return Duration.m134283hashCodeimpl(this.duration) + ((t14 == null ? 0 : t14.hashCode()) * 31);
    }

    public String toString() {
        return "TimedValue(value=" + this.value + ", duration=" + ((Object) Duration.m134302toStringimpl(this.duration)) + ')';
    }

    private TimedValue(T t14, long j7) {
        this.value = t14;
        this.duration = j7;
    }
}
