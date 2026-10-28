package ti0;

import c13.AbstractC3855a;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: ti0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lti0/h;", "", "a", "b", "c", "Lti0/h$b;", "Lti0/h$c;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC33843h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f141735a;

    /* JADX INFO: renamed from: ti0.h$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lti0/h$a;", "", "<init>", "()V", "", "enabled", "isRefreshing", "Lti0/h;", "a", "(ZZ)Lti0/h;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f141735a = new Companion();

        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC33843h m107034a(boolean enabled, boolean isRefreshing) {
            return enabled ? new c(isRefreshing) : b.f141736b;
        }
    }

    /* JADX INFO: renamed from: ti0.h$b */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lti0/h$b;", "Lti0/h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC33843h {

        /* JADX INFO: renamed from: b */
        public static final b f141736b = new b();

        private b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -1548542340;
        }

        public String toString() {
            return "Disabled";
        }
    }

    /* JADX INFO: renamed from: ti0.h$c */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lti0/h$c;", "Lti0/h;", "", "isRefreshing", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "a", "()Z", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC33843h {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isRefreshing;

        public c(boolean z4) {
            this.isRefreshing = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsRefreshing() {
            return this.isRefreshing;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && this.isRefreshing == ((c) other).isRefreshing;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRefreshing);
        }

        public String toString() {
            return AbstractC3855a.m11827k("Enabled(isRefreshing=", ")", this.isRefreshing);
        }
    }
}
