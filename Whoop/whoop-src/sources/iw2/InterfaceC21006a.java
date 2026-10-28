package iw2;

import c13.AbstractC3855a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import s21.C32085h;

/* JADX INFO: renamed from: iw2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Liw2/a;", "", "a", "b", "Liw2/a$a;", "Liw2/a$b;", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC21006a {

    /* JADX INFO: renamed from: iw2.a$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Liw2/a$a;", "Liw2/a;", "", "isInitialLoad", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC21006a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isInitialLoad;

        public a(boolean z4) {
            this.isInitialLoad = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsInitialLoad() {
            return this.isInitialLoad;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.isInitialLoad == ((a) other).isInitialLoad;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isInitialLoad);
        }

        public String toString() {
            return AbstractC3855a.m11827k("LoadBffData(isInitialLoad=", ")", this.isInitialLoad);
        }
    }

    /* JADX INFO: renamed from: iw2.a$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Liw2/a$b;", "Liw2/a;", "Ls21/h;", "milestone", "<init>", "(Ls21/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ls21/h;", "()Ls21/h;", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC21006a {

        /* JADX INFO: renamed from: b */
        public static final int f79497b = C32085h.f133051r;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C32085h milestone;

        public b(C32085h c32085h) {
            this.milestone = c32085h;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C32085h getMilestone() {
            return this.milestone;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.milestone, ((b) other).milestone);
        }

        public int hashCode() {
            C32085h c32085h = this.milestone;
            if (c32085h == null) {
                return 0;
            }
            return c32085h.hashCode();
        }

        public String toString() {
            return "UpdateSelectedMilestone(milestone=" + this.milestone + ")";
        }
    }
}
