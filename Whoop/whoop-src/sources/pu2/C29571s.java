package pu2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pu2.s */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lpu2/s;", "", "Lcom/whoop/design/util/TextResource;", "timerText", "", "color", "<init>", "(Lcom/whoop/design/util/TextResource;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "I", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29571s {

    /* JADX INFO: renamed from: c */
    public static final int f120640c = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource timerText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int color;

    public C29571s(TextResource timerText, int i13) {
        AbstractC22676k.m65750j(timerText, "timerText");
        this.timerText = timerText;
        this.color = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getTimerText() {
        return this.timerText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29571s)) {
            return false;
        }
        C29571s c29571s = (C29571s) other;
        return AbstractC22676k.m65745e(this.timerText, c29571s.timerText) && this.color == c29571s.color;
    }

    public int hashCode() {
        return Integer.hashCode(this.color) + (this.timerText.hashCode() * 31);
    }

    public String toString() {
        return "NotificationTimerState(timerText=" + this.timerText + ", color=" + this.color + ")";
    }
}
