package tw2;

import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tw2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0011B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\f¨\u0006\u001a"}, m65681d2 = {"Ltw2/b;", "", "", "maxDimension", "", "maxBytes", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "getMaxDimension", "()Ljava/lang/Integer;", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "maxEdgePx", "c", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34225b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Integer maxDimension;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Long maxBytes;

    public C34225b(Integer num, Long l7) {
        this.maxDimension = num;
        this.maxBytes = l7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getMaxBytes() {
        return this.maxBytes;
    }

    /* JADX INFO: renamed from: b */
    public final int m108174b() {
        Integer num = this.maxDimension;
        if (num == null) {
            return DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        }
        if (num.intValue() <= 0) {
            num = null;
        }
        return num != null ? num.intValue() : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34225b)) {
            return false;
        }
        C34225b c34225b = (C34225b) other;
        return AbstractC22676k.m65745e(this.maxDimension, c34225b.maxDimension) && AbstractC22676k.m65745e(this.maxBytes, c34225b.maxBytes);
    }

    public int hashCode() {
        Integer num = this.maxDimension;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l7 = this.maxBytes;
        return iHashCode + (l7 != null ? l7.hashCode() : 0);
    }

    public String toString() {
        return "MediaBounds(maxDimension=" + this.maxDimension + ", maxBytes=" + this.maxBytes + ")";
    }
}
