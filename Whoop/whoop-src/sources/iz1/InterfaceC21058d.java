package iz1;

import gz1.InterfaceC16331b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: iz1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0006\u0004\u0007J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Liz1/d;", "", "Liz1/b;", "state", "a", "(Liz1/b;)Liz1/b;", "b", "c", "Liz1/d$a;", "Liz1/d$b;", "Liz1/d$c;", "motion-tracking-sandbox_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
interface InterfaceC21058d {

    /* JADX INFO: renamed from: iz1.d$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Liz1/d$a;", "Liz1/d;", "Lgz1/b;", "detection", "<init>", "(Lgz1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz1/b;", "b", "()Lgz1/b;", "motion-tracking-sandbox_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC21058d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC16331b detection;

        public a(InterfaceC16331b detection) {
            AbstractC22676k.m65750j(detection, "detection");
            this.detection = detection;
        }

        @Override // iz1.InterfaceC21058d
        /* JADX INFO: renamed from: a */
        public /* bridge */ C21056b mo58906a(C21056b c21056b) {
            return super.mo58906a(c21056b);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC16331b getDetection() {
            return this.detection;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.detection, ((a) other).detection);
        }

        public int hashCode() {
            return this.detection.hashCode();
        }

        public String toString() {
            return "DetectionUpdated(detection=" + this.detection + ")";
        }
    }

    /* JADX INFO: renamed from: iz1.d$b */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Liz1/d$b;", "Liz1/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "motion-tracking-sandbox_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC21058d {

        /* JADX INFO: renamed from: a */
        public static final b f79878a = new b();

        private b() {
        }

        @Override // iz1.InterfaceC21058d
        /* JADX INFO: renamed from: a */
        public /* bridge */ C21056b mo58906a(C21056b c21056b) {
            return super.mo58906a(c21056b);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -1803588148;
        }

        public String toString() {
            return "SessionStarted";
        }
    }

    /* JADX INFO: renamed from: iz1.d$c */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Liz1/d$c;", "Liz1/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "motion-tracking-sandbox_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC21058d {

        /* JADX INFO: renamed from: a */
        public static final c f79879a = new c();

        private c() {
        }

        @Override // iz1.InterfaceC21058d
        /* JADX INFO: renamed from: a */
        public /* bridge */ C21056b mo58906a(C21056b c21056b) {
            return super.mo58906a(c21056b);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return -1790722280;
        }

        public String toString() {
            return "SessionStopped";
        }
    }

    /* JADX INFO: renamed from: a */
    default C21056b mo58906a(C21056b state) {
        AbstractC22676k.m65750j(state, "state");
        if (equals(b.f79878a)) {
            return state.m58899a(EnumC21059e.RUNNING, InterfaceC16331b.b.f62837a);
        }
        if (this instanceof a) {
            return C21056b.m58898b(state, null, ((a) this).getDetection(), 1, null);
        }
        if (equals(c.f79879a)) {
            return state.m58899a(EnumC21059e.IDLE, InterfaceC16331b.a.f62836a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
