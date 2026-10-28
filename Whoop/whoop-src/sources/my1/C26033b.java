package my1;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: my1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\f¨\u0006\u001d"}, m65681d2 = {"Lmy1/b;", "", "", "heapPercent", "", "threadCount", "trimLevel", "", "trimLevelName", "<init>", "(DIILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "I", "c", "getTrimLevel", "d", "Ljava/lang/String;", "e", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26033b {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final double heapPercent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int threadCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int trimLevel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String trimLevelName;

    /* JADX INFO: renamed from: my1.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lmy1/b$a;", "", "<init>", "()V", "", "trimLevel", "Lmy1/b;", "a", "(I)Lmy1/b;", "level", "", "b", "(I)Ljava/lang/String;", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C26033b m77450a(int trimLevel) {
            Runtime runtime = Runtime.getRuntime();
            long jMaxMemory = runtime.maxMemory();
            return new C26033b(jMaxMemory > 0 ? ((runtime.totalMemory() - runtime.freeMemory()) / jMaxMemory) * 100.0d : 0.0d, Thread.activeCount(), trimLevel, m77451b(trimLevel));
        }

        /* JADX INFO: renamed from: b */
        public final String m77451b(int level) {
            if (level >= 40) {
                return "BACKGROUND";
            }
            return level >= 20 ? "UI_HIDDEN" : "OTHER";
        }

        private Companion() {
        }
    }

    public C26033b(double d3, int i13, int i14, String trimLevelName) {
        AbstractC22676k.m65750j(trimLevelName, "trimLevelName");
        this.heapPercent = d3;
        this.threadCount = i13;
        this.trimLevel = i14;
        this.trimLevelName = trimLevelName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getHeapPercent() {
        return this.heapPercent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getThreadCount() {
        return this.threadCount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTrimLevelName() {
        return this.trimLevelName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26033b)) {
            return false;
        }
        C26033b c26033b = (C26033b) other;
        return Double.compare(this.heapPercent, c26033b.heapPercent) == 0 && this.threadCount == c26033b.threadCount && this.trimLevel == c26033b.trimLevel && AbstractC22676k.m65745e(this.trimLevelName, c26033b.trimLevelName);
    }

    public int hashCode() {
        return this.trimLevelName.hashCode() + AbstractC11266d.m30448b(this.trimLevel, AbstractC11266d.m30448b(this.threadCount, Double.hashCode(this.heapPercent) * 31, 31), 31);
    }

    public String toString() {
        return "MemorySnapshot(heapPercent=" + this.heapPercent + ", threadCount=" + this.threadCount + ", trimLevel=" + this.trimLevel + ", trimLevelName=" + this.trimLevelName + ")";
    }
}
