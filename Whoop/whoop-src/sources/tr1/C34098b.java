package tr1;

import com.whoop.data.remote.domain.response.journal.JournalBehaviorTracker;
import com.whoop.data.remote.domain.response.journal.TrackerInput;
import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: tr1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Ltr1/b;", "", "Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;", "tracker", "Lcom/whoop/data/remote/domain/response/journal/TrackerInput;", "value", "", "hasModified", "<init>", "(Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;Lcom/whoop/data/remote/domain/response/journal/TrackerInput;Z)V", "a", "(Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;Lcom/whoop/data/remote/domain/response/journal/TrackerInput;Z)Ltr1/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;", "c", "()Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;", "b", "Lcom/whoop/data/remote/domain/response/journal/TrackerInput;", "d", "()Lcom/whoop/data/remote/domain/response/journal/TrackerInput;", "setValue", "(Lcom/whoop/data/remote/domain/response/journal/TrackerInput;)V", "Z", "getHasModified", "()Z", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34098b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final JournalBehaviorTracker tracker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private TrackerInput value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean hasModified;

    public C34098b(JournalBehaviorTracker tracker, TrackerInput value, boolean z4) {
        AbstractC22676k.m65750j(tracker, "tracker");
        AbstractC22676k.m65750j(value, "value");
        this.tracker = tracker;
        this.value = value;
        this.hasModified = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C34098b m107783b(C34098b c34098b, JournalBehaviorTracker journalBehaviorTracker, TrackerInput trackerInput, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            journalBehaviorTracker = c34098b.tracker;
        }
        if ((i13 & 2) != 0) {
            trackerInput = c34098b.value;
        }
        if ((i13 & 4) != 0) {
            z4 = c34098b.hasModified;
        }
        return c34098b.m107784a(journalBehaviorTracker, trackerInput, z4);
    }

    /* JADX INFO: renamed from: a */
    public final C34098b m107784a(JournalBehaviorTracker tracker, TrackerInput value, boolean hasModified) {
        AbstractC22676k.m65750j(tracker, "tracker");
        AbstractC22676k.m65750j(value, "value");
        return new C34098b(tracker, value, hasModified);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final JournalBehaviorTracker getTracker() {
        return this.tracker;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TrackerInput getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34098b)) {
            return false;
        }
        C34098b c34098b = (C34098b) other;
        return AbstractC22676k.m65745e(this.tracker, c34098b.tracker) && AbstractC22676k.m65745e(this.value, c34098b.value) && this.hasModified == c34098b.hasModified;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasModified) + ((this.value.hashCode() + (this.tracker.hashCode() * 31)) * 31);
    }

    public String toString() {
        JournalBehaviorTracker journalBehaviorTracker = this.tracker;
        TrackerInput trackerInput = this.value;
        boolean z4 = this.hasModified;
        StringBuilder sb4 = new StringBuilder("JournalBehaviorTrackerItem(tracker=");
        sb4.append(journalBehaviorTracker);
        sb4.append(", value=");
        sb4.append(trackerInput);
        sb4.append(", hasModified=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ C34098b(JournalBehaviorTracker journalBehaviorTracker, TrackerInput trackerInput, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(journalBehaviorTracker, trackerInput, (i13 & 4) != 0 ? false : z4);
    }
}
