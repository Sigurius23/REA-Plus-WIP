package h80;

import live.hms.video.media.tracks.HMSTrackSource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: h80.d */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lh80/d;", "", "b", "d", "a", "c", "Lh80/d$a;", "Lh80/d$b;", "Lh80/d$c;", "Lh80/d$d;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC17004d {

    /* JADX INFO: renamed from: h80.d$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lh80/d$a;", "Lh80/d;", "Lh80/e;", "mode", "", "success", "<init>", "(Lh80/e;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lh80/e;", "()Lh80/e;", "b", "Z", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC17004d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC17005e mode;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean success;

        public a(EnumC17005e mode, boolean z4) {
            AbstractC22676k.m65750j(mode, "mode");
            this.mode = mode;
            this.success = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC17005e getMode() {
            return this.mode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.mode == aVar.mode && this.success == aVar.success;
        }

        public int hashCode() {
            return Boolean.hashCode(this.success) + (this.mode.hashCode() * 31);
        }

        public String toString() {
            return "LoginResult(mode=" + this.mode + ", success=" + this.success + ")";
        }
    }

    /* JADX INFO: renamed from: h80.d$c */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lh80/d$c;", "Lh80/d;", "Lh80/g;", HMSTrackSource.SCREEN, "Lh80/f;", "result", "<init>", "(Lh80/g;Lh80/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh80/g;", "b", "()Lh80/g;", "Lh80/f;", "()Lh80/f;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC17004d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC17007g screen;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC17006f result;

        public c(EnumC17007g screen, EnumC17006f result) {
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(result, "result");
            this.screen = screen;
            this.result = result;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC17006f getResult() {
            return this.result;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC17007g getScreen() {
            return this.screen;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.screen == cVar.screen && this.result == cVar.result;
        }

        public int hashCode() {
            return this.result.hashCode() + (this.screen.hashCode() * 31);
        }

        public String toString() {
            return "SaveResult(screen=" + this.screen + ", result=" + this.result + ")";
        }
    }

    /* JADX INFO: renamed from: h80.d$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lh80/d$d;", "Lh80/d;", "Lh80/e;", "mode", "<init>", "(Lh80/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh80/e;", "()Lh80/e;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC17004d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC17005e mode;

        public d(EnumC17005e mode) {
            AbstractC22676k.m65750j(mode, "mode");
            this.mode = mode;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC17005e getMode() {
            return this.mode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && this.mode == ((d) other).mode;
        }

        public int hashCode() {
            return this.mode.hashCode();
        }

        public String toString() {
            return "SignIn(mode=" + this.mode + ")";
        }
    }

    /* JADX INFO: renamed from: h80.d$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lh80/d$b;", "Lh80/d;", "Lh80/f;", "result", "", "failureReason", "<init>", "(Lh80/f;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh80/f;", "b", "()Lh80/f;", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC17004d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC17006f result;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String failureReason;

        public b(EnumC17006f result, String str) {
            AbstractC22676k.m65750j(result, "result");
            this.result = result;
            this.failureReason = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFailureReason() {
            return this.failureReason;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC17006f getResult() {
            return this.result;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.result == bVar.result && AbstractC22676k.m65745e(this.failureReason, bVar.failureReason);
        }

        public int hashCode() {
            int iHashCode = this.result.hashCode() * 31;
            String str = this.failureReason;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "RetrieveResult(result=" + this.result + ", failureReason=" + this.failureReason + ")";
        }

        public /* synthetic */ b(EnumC17006f enumC17006f, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(enumC17006f, (i13 & 2) != 0 ? null : str);
        }
    }
}
