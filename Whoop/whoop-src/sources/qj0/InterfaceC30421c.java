package qj0;

import kt0.C22823a;
import mj0.EnumC25613b;
import mj0.InterfaceC25612a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qj0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lqj0/c;", "", "a", "b", "Lqj0/c$a;", "Lqj0/c$b;", "whoop-ble_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC30421c {

    /* JADX INFO: renamed from: qj0.c$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lqj0/c$a;", "Lqj0/c;", "Lkt0/a;", "hello", "<init>", "(Lkt0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkt0/a;", "()Lkt0/a;", "whoop-ble_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC30421c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C22823a hello;

        public a(C22823a hello) {
            AbstractC22676k.m65750j(hello, "hello");
            this.hello = hello;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C22823a getHello() {
            return this.hello;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.hello, ((a) other).hello);
        }

        public int hashCode() {
            return this.hello.hashCode();
        }

        public String toString() {
            return "Connected(hello=" + this.hello + ")";
        }
    }

    /* JADX INFO: renamed from: qj0.c$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lqj0/c$b;", "Lqj0/c;", "Lmj0/b;", "phase", "Lmj0/a;", "cause", "<init>", "(Lmj0/b;Lmj0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmj0/b;", "b", "()Lmj0/b;", "Lmj0/a;", "()Lmj0/a;", "whoop-ble_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC30421c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC25613b phase;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC25612a cause;

        public b(EnumC25613b phase, InterfaceC25612a cause) {
            AbstractC22676k.m65750j(phase, "phase");
            AbstractC22676k.m65750j(cause, "cause");
            this.phase = phase;
            this.cause = cause;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC25612a getCause() {
            return this.cause;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC25613b getPhase() {
            return this.phase;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.phase == bVar.phase && AbstractC22676k.m65745e(this.cause, bVar.cause);
        }

        public int hashCode() {
            return this.cause.hashCode() + (this.phase.hashCode() * 31);
        }

        public String toString() {
            return "Failed(phase=" + this.phase + ", cause=" + this.cause + ")";
        }
    }
}
