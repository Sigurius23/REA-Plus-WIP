package qf2;

import org.joda.time.Instant;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qf2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lqf2/b;", "Lqf2/d;", "Lorg/joda/time/Instant;", "lwt", "<init>", "(Lorg/joda/time/Instant;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/joda/time/Instant;", "()Lorg/joda/time/Instant;", "smart-alarm_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30323b extends AbstractC30325d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Instant lwt;

    public C30323b(Instant instant) {
        super(null);
        this.lwt = instant;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Instant getLwt() {
        return this.lwt;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C30323b) && AbstractC22676k.m65745e(this.lwt, ((C30323b) other).lwt);
    }

    public int hashCode() {
        Instant instant = this.lwt;
        if (instant == null) {
            return 0;
        }
        return instant.hashCode();
    }

    public String toString() {
        return "Enabled(lwt=" + this.lwt + ")";
    }
}
