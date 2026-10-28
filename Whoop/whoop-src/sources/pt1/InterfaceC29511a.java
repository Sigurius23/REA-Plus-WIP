package pt1;

import ht1.EnumC17628e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pt1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lpt1/a;", "", "b", "a", "Lpt1/a$a;", "Lpt1/a$b;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC29511a {

    /* JADX INFO: renamed from: pt1.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lpt1/a$a;", "Lpt1/a;", "<init>", "()V", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC29511a {

        /* JADX INFO: renamed from: a */
        public static final a f120034a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: pt1.a$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lpt1/a$b;", "Lpt1/a;", "Lht1/e;", "wrist", "", "fromInconclusiveRetry", "<init>", "(Lht1/e;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lht1/e;", "b", "()Lht1/e;", "Z", "()Z", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC29511a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC17628e wrist;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean fromInconclusiveRetry;

        public b(EnumC17628e enumC17628e, boolean z4) {
            this.wrist = enumC17628e;
            this.fromInconclusiveRetry = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getFromInconclusiveRetry() {
            return this.fromInconclusiveRetry;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC17628e getWrist() {
            return this.wrist;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.wrist == bVar.wrist && this.fromInconclusiveRetry == bVar.fromInconclusiveRetry;
        }

        public int hashCode() {
            EnumC17628e enumC17628e = this.wrist;
            return Boolean.hashCode(this.fromInconclusiveRetry) + ((enumC17628e == null ? 0 : enumC17628e.hashCode()) * 31);
        }

        public String toString() {
            return "Initial(wrist=" + this.wrist + ", fromInconclusiveRetry=" + this.fromInconclusiveRetry + ")";
        }

        public /* synthetic */ b(EnumC17628e enumC17628e, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(enumC17628e, (i13 & 2) != 0 ? false : z4);
        }
    }
}
