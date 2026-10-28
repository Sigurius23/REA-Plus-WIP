package com.whoop.settings.journalv2;

import com.whoop.journal.model.CurrentCycle;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: com.whoop.settings.journalv2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/settings/journalv2/c;", "", "<init>", "()V", "a", "b", "Lcom/whoop/settings/journalv2/c$a;", "Lcom/whoop/settings/journalv2/c$b;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10112c {

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.c$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/settings/journalv2/c$a;", "Lcom/whoop/settings/journalv2/c;", "", "cycleId", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getCycleId", "()J", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC10112c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long cycleId;

        public a(long j7) {
            super(null);
            this.cycleId = j7;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.cycleId == ((a) other).cycleId;
        }

        public int hashCode() {
            return Long.hashCode(this.cycleId);
        }

        public String toString() {
            return AbstractC31061c.m95636l(this.cycleId, "ToCustomizeJournal(cycleId=", ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.c$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/settings/journalv2/c$b;", "Lcom/whoop/settings/journalv2/c;", "", "cycleId", "Lcom/whoop/journal/model/CurrentCycle;", "currentCycle", "<init>", "(JLcom/whoop/journal/model/CurrentCycle;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "Lcom/whoop/journal/model/CurrentCycle;", "()Lcom/whoop/journal/model/CurrentCycle;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC10112c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long cycleId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final CurrentCycle currentCycle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j7, CurrentCycle currentCycle) {
            super(null);
            AbstractC22676k.m65750j(currentCycle, "currentCycle");
            this.cycleId = j7;
            this.currentCycle = currentCycle;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CurrentCycle getCurrentCycle() {
            return this.currentCycle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getCycleId() {
            return this.cycleId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.cycleId == bVar.cycleId && AbstractC22676k.m65745e(this.currentCycle, bVar.currentCycle);
        }

        public int hashCode() {
            return this.currentCycle.hashCode() + (Long.hashCode(this.cycleId) * 31);
        }

        public String toString() {
            return "ToViewJournal(cycleId=" + this.cycleId + ", currentCycle=" + this.currentCycle + ")";
        }
    }

    public /* synthetic */ AbstractC10112c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC10112c() {
    }
}
