package vu0;

import b12.EnumC2287c;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: vu0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\u0011¨\u0006\u001c"}, m65681d2 = {"Lvu0/c;", "", "", "low", "medium", "high", "<init>", "(III)V", "", "batteryLevel", "Lb12/c;", "a", "(B)Lb12/c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLow", "b", "getMedium", "c", "d", "connectivity-notifications_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36506c {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int low;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int medium;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int high;

    /* JADX INFO: renamed from: vu0.c$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lvu0/c$a;", "", "<init>", "()V", "Lvu0/c;", "a", "()Lvu0/c;", "connectivity-notifications_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C36506c m117015a() {
            return new C36506c(5, 10, 20);
        }

        private Companion() {
        }
    }

    public C36506c(int i13, int i14, int i15) {
        this.low = i13;
        this.medium = i14;
        this.high = i15;
    }

    /* JADX INFO: renamed from: a */
    public final EnumC2287c m117013a(byte batteryLevel) {
        if (batteryLevel < this.low) {
            return EnumC2287c.BUCKET_LOW;
        }
        if (batteryLevel < this.medium) {
            return EnumC2287c.BUCKET_MEDIUM;
        }
        return batteryLevel < this.high ? EnumC2287c.BUCKET_HIGH : EnumC2287c.BUCKET_HIGH;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getHigh() {
        return this.high;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36506c)) {
            return false;
        }
        C36506c c36506c = (C36506c) other;
        return this.low == c36506c.low && this.medium == c36506c.medium && this.high == c36506c.high;
    }

    public int hashCode() {
        return Integer.hashCode(this.high) + AbstractC11266d.m30448b(this.medium, Integer.hashCode(this.low) * 31, 31);
    }

    public String toString() {
        int i13 = this.low;
        int i14 = this.medium;
        return AbstractC18489d0.m53371l(AbstractC11266d.m30465s(i13, i14, "LowBatteryThresholds(low=", ", medium=", ", high="), this.high, ")");
    }
}
