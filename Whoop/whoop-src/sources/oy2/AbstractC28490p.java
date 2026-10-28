package oy2;

import org.joda.time.DateTime;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: oy2.p */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\r\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Loy2/p;", "", "<init>", "()V", "", "a", "()Ljava/lang/Integer;", "seconds", "", "c", "()Z", "isCountDown", "Lorg/joda/time/DateTime;", "b", "()Lorg/joda/time/DateTime;", "startTime", "Loy2/p$a;", "Loy2/p$b;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28490p {

    /* JADX INFO: renamed from: oy2.p$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Loy2/p$a;", "Loy2/p;", "", "seconds", "", "isCountDown", "Lorg/joda/time/DateTime;", "startTime", "<init>", "(Ljava/lang/Integer;ZLorg/joda/time/DateTime;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "Z", "c", "()Z", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC28490p {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Integer seconds;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isCountDown;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final DateTime startTime;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num, boolean z4, DateTime startTime) {
            super(null);
            AbstractC22676k.m65750j(startTime, "startTime");
            this.seconds = num;
            this.isCountDown = z4;
            this.startTime = startTime;
        }

        @Override // oy2.AbstractC28490p
        /* JADX INFO: renamed from: a, reason: from getter */
        public Integer getSeconds() {
            return this.seconds;
        }

        @Override // oy2.AbstractC28490p
        /* JADX INFO: renamed from: b, reason: from getter */
        public DateTime getStartTime() {
            return this.startTime;
        }

        @Override // oy2.AbstractC28490p
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsCountDown() {
            return this.isCountDown;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.seconds, aVar.seconds) && this.isCountDown == aVar.isCountDown && AbstractC22676k.m65745e(this.startTime, aVar.startTime);
        }

        public int hashCode() {
            Integer num = this.seconds;
            return this.startTime.hashCode() + AbstractC2875y.m8289b((num == null ? 0 : num.hashCode()) * 31, 31, this.isCountDown);
        }

        public String toString() {
            return "Active(seconds=" + this.seconds + ", isCountDown=" + this.isCountDown + ", startTime=" + this.startTime + ")";
        }
    }

    /* JADX INFO: renamed from: oy2.p$b */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Loy2/p$b;", "Loy2/p;", "<init>", "()V", "", "b", "Ljava/lang/Integer;", "a", "()Ljava/lang/Integer;", "seconds", "", "c", "Z", "()Z", "isCountDown", "Lorg/joda/time/DateTime;", "d", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "startTime", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC28490p {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final Integer seconds = null;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final boolean isCountDown = false;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private static final DateTime startTime = null;

        /* JADX INFO: renamed from: a */
        public static final b f115367a = new b();

        /* JADX INFO: renamed from: e */
        public static final int f115371e = 8;

        private b() {
            super(null);
        }

        @Override // oy2.AbstractC28490p
        /* JADX INFO: renamed from: a */
        public Integer getSeconds() {
            return seconds;
        }

        @Override // oy2.AbstractC28490p
        /* JADX INFO: renamed from: b */
        public DateTime getStartTime() {
            return startTime;
        }

        @Override // oy2.AbstractC28490p
        /* JADX INFO: renamed from: c */
        public boolean getIsCountDown() {
            return isCountDown;
        }
    }

    public /* synthetic */ AbstractC28490p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract Integer getSeconds();

    /* JADX INFO: renamed from: b */
    public abstract DateTime getStartTime();

    /* JADX INFO: renamed from: c */
    public abstract boolean getIsCountDown();

    private AbstractC28490p() {
    }
}
