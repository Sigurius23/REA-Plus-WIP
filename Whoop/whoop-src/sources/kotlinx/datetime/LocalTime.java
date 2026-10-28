package kotlinx.datetime;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DateTimeException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.DurationKt;
import pc3.C29090l;
import pc3.C29093o;
import vc3.C35892k;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001-B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B-\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b(\u0010\u0016R\u0011\u0010\t\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b*\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b+\u0010\u0016¨\u0006."}, m65681d2 = {"Lkotlinx/datetime/LocalTime;", "", "Ljava/io/Serializable;", "Ljava/time/LocalTime;", "value", "<init>", "(Ljava/time/LocalTime;)V", "", "hour", "minute", "second", "nanosecond", "(IIII)V", "Ljava/io/ObjectInputStream;", "ois", "Ll83/a0;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "writeReplace", "()Ljava/lang/Object;", "toSecondOfDay", "()I", "toMillisecondOfDay", "", "toNanosecondOfDay", "()J", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "compareTo", "(Lkotlinx/datetime/LocalTime;)I", "Ljava/time/LocalTime;", "getValue$kotlinx_datetime", "()Ljava/time/LocalTime;", "getHour", "getMinute", "getSecond", "getNanosecond", "Companion", "pc3/l", "kotlinx-datetime"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i(with = C35892k.class)
public final class LocalTime implements Comparable<LocalTime>, Serializable {
    public static final C29090l Companion = new C29090l();
    private static final LocalTime MAX;
    private static final LocalTime MIN;
    private static final long serialVersionUID = 0;
    private final java.time.LocalTime value;

    static {
        java.time.LocalTime MIN2 = java.time.LocalTime.MIN;
        AbstractC22676k.m65749i(MIN2, "MIN");
        MIN = new LocalTime(MIN2);
        java.time.LocalTime MAX2 = java.time.LocalTime.MAX;
        AbstractC22676k.m65749i(MAX2, "MAX");
        MAX = new LocalTime(MAX2);
    }

    public LocalTime(java.time.LocalTime value) {
        AbstractC22676k.m65750j(value, "value");
        this.value = value;
    }

    private final void readObject(ObjectInputStream ois) throws InvalidObjectException {
        throw new InvalidObjectException("kotlinx.datetime.LocalTime must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new C29093o(3, this);
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof LocalTime) && AbstractC22676k.m65745e(this.value, ((LocalTime) other).value);
        }
        return true;
    }

    public final int getHour() {
        return this.value.getHour();
    }

    public final int getMinute() {
        return this.value.getMinute();
    }

    public final int getNanosecond() {
        return this.value.getNano();
    }

    public final int getSecond() {
        return this.value.getSecond();
    }

    /* JADX INFO: renamed from: getValue$kotlinx_datetime, reason: from getter */
    public final java.time.LocalTime getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public final int toMillisecondOfDay() {
        return (int) (this.value.toNanoOfDay() / ((long) DurationKt.NANOS_IN_MILLIS));
    }

    public final long toNanosecondOfDay() {
        return this.value.toNanoOfDay();
    }

    public final int toSecondOfDay() {
        return this.value.toSecondOfDay();
    }

    public String toString() {
        String string = this.value.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalTime other) {
        AbstractC22676k.m65750j(other, "other");
        return this.value.compareTo(other.value);
    }

    public /* synthetic */ LocalTime(int i13, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, (i17 & 4) != 0 ? 0 : i15, (i17 & 8) != 0 ? 0 : i16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalTime(int i13, int i14, int i15, int i16) {
        try {
            java.time.LocalTime localTimeOf = java.time.LocalTime.of(i13, i14, i15, i16);
            AbstractC22676k.m65747g(localTimeOf);
            this(localTimeOf);
        } catch (DateTimeException e5) {
            throw new IllegalArgumentException(e5);
        }
    }
}
