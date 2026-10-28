package gt0;

import bt0.AbstractC3619c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import nh3.AbstractC26725a;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: gt0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011À\u0006\u0003"}, m65681d2 = {"Lgt0/h;", "", "a", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "e", "b", "g", "c", "Lgt0/h$b;", "Lgt0/h$c;", "Lgt0/h$d;", "Lgt0/h$e;", "Lgt0/h$f;", "Lgt0/h$g;", "Lgt0/h$h;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC16186h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f61480a;

    /* JADX INFO: renamed from: gt0.h$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\n\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0015\u0010\f\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0015\u0010\u000e\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0015\u0010\u0010\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0015\u0010\u0012\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lgt0/h$a;", "", "<init>", "()V", "Lgt0/h;", "", "d", "(Lgt0/h;)Z", "isUpdateInProgress", "e", "isUpdateSuccessful", "a", "retryFwUpdate", "c", "isUpdateFailed", "f", "isUserAcceptanceRequired", "b", "isLocationPermissionRequired", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f61480a = new Companion();

        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m45723a(InterfaceC16186h interfaceC16186h) {
            AbstractC22676k.m65750j(interfaceC16186h, "<this>");
            if (!(interfaceC16186h instanceof b)) {
                return false;
            }
            b bVar = (b) interfaceC16186h;
            return !AbstractC22676k.m65745e(bVar.getCause(), AbstractC16184f.d.f61472b) && bVar.getIsForeground();
        }

        /* JADX INFO: renamed from: b */
        public final boolean m45724b(InterfaceC16186h interfaceC16186h) {
            AbstractC22676k.m65750j(interfaceC16186h, "<this>");
            return interfaceC16186h instanceof c;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m45725c(InterfaceC16186h interfaceC16186h) {
            AbstractC22676k.m65750j(interfaceC16186h, "<this>");
            if (!(interfaceC16186h instanceof b)) {
                return false;
            }
            b bVar = (b) interfaceC16186h;
            return AbstractC22676k.m65745e(bVar.getCause(), AbstractC16184f.d.f61472b) && bVar.getIsForeground();
        }

        /* JADX INFO: renamed from: d */
        public final boolean m45726d(InterfaceC16186h interfaceC16186h) {
            AbstractC22676k.m65750j(interfaceC16186h, "<this>");
            return (interfaceC16186h instanceof g) && ((g) interfaceC16186h).getIsForeground();
        }

        /* JADX INFO: renamed from: e */
        public final boolean m45727e(InterfaceC16186h interfaceC16186h) {
            AbstractC22676k.m65750j(interfaceC16186h, "<this>");
            return interfaceC16186h.equals(e.f61486b);
        }

        /* JADX INFO: renamed from: f */
        public final boolean m45728f(InterfaceC16186h interfaceC16186h) {
            AbstractC22676k.m65750j(interfaceC16186h, "<this>");
            return interfaceC16186h instanceof d;
        }
    }

    /* JADX INFO: renamed from: gt0.h$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lgt0/h$b;", "Lgt0/h;", "Lgt0/f;", "cause", "", "isForeground", "<init>", "(Lgt0/f;Z)V", "a", "(Lgt0/f;Z)Lgt0/h$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lgt0/f;", "c", "()Lgt0/f;", "Z", "d", "()Z", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC16186h {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AbstractC16184f cause;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isForeground;

        public b(AbstractC16184f cause, boolean z4) {
            AbstractC22676k.m65750j(cause, "cause");
            this.cause = cause;
            this.isForeground = z4;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ b m45729b(b bVar, AbstractC16184f abstractC16184f, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                abstractC16184f = bVar.cause;
            }
            if ((i13 & 2) != 0) {
                z4 = bVar.isForeground;
            }
            return bVar.m45730a(abstractC16184f, z4);
        }

        /* JADX INFO: renamed from: a */
        public final b m45730a(AbstractC16184f cause, boolean isForeground) {
            AbstractC22676k.m65750j(cause, "cause");
            return new b(cause, isForeground);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AbstractC16184f getCause() {
            return this.cause;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsForeground() {
            return this.isForeground;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.cause, bVar.cause) && this.isForeground == bVar.isForeground;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isForeground) + (this.cause.hashCode() * 31);
        }

        public String toString() {
            return "Error(cause=" + this.cause + ", isForeground=" + this.isForeground + ")";
        }

        public /* synthetic */ b(AbstractC16184f abstractC16184f, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC16184f, (i13 & 2) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: gt0.h$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgt0/h$c;", "Lgt0/h;", "<init>", "()V", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC16186h {

        /* JADX INFO: renamed from: b */
        public static final c f61483b = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: gt0.h$d */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m65681d2 = {"Lgt0/h$d;", "Lgt0/h;", "", "isForcedUpdate", "showDialog", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "()Z", "c", "a", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC16186h {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isForcedUpdate;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean showDialog;

        public d(boolean z4, boolean z13) {
            this.isForcedUpdate = z4;
            this.showDialog = z13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getShowDialog() {
            return this.showDialog;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsForcedUpdate() {
            return this.isForcedUpdate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return this.isForcedUpdate == dVar.isForcedUpdate && this.showDialog == dVar.showDialog;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showDialog) + (Boolean.hashCode(this.isForcedUpdate) * 31);
        }

        public String toString() {
            return AbstractC30802r.m94762k("ProcessFwAcceptanceRequired(isForcedUpdate=", ", showDialog=", ")", this.isForcedUpdate, this.showDialog);
        }
    }

    /* JADX INFO: renamed from: gt0.h$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgt0/h$e;", "Lgt0/h;", "<init>", "()V", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC16186h {

        /* JADX INFO: renamed from: b */
        public static final e f61486b = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: gt0.h$f */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgt0/h$f;", "Lgt0/h;", "<init>", "()V", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC16186h {

        /* JADX INFO: renamed from: b */
        public static final f f61487b = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: gt0.h$g */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lgt0/h$g;", "Lgt0/h;", "Lbt0/c;", "progressPercentage", "", "isForeground", "<init>", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(IZ)Lgt0/h$g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "I", "getProgressPercentage-UefM2is", "c", "Z", "()Z", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements InterfaceC16186h {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int progressPercentage;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isForeground;

        public /* synthetic */ g(int i13, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
            this(i13, z4);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ g m45735b(g gVar, int i13, boolean z4, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i13 = gVar.progressPercentage;
            }
            if ((i14 & 2) != 0) {
                z4 = gVar.isForeground;
            }
            return gVar.m45736a(i13, z4);
        }

        /* JADX INFO: renamed from: a */
        public final g m45736a(int progressPercentage, boolean isForeground) {
            return new g(progressPercentage, isForeground, null);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsForeground() {
            return this.isForeground;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC3619c.m10982b(this.progressPercentage, gVar.progressPercentage) && this.isForeground == gVar.isForeground;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isForeground) + (AbstractC3619c.m10983c(this.progressPercentage) * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("UpdateInProgress(progressPercentage=", AbstractC3619c.m10984d(this.progressPercentage), ", isForeground=", ")", this.isForeground);
        }

        private g(int i13, boolean z4) {
            this.progressPercentage = i13;
            this.isForeground = z4;
        }

        public /* synthetic */ g(int i13, boolean z4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(i13, (i14 & 2) != 0 ? false : z4, null);
        }
    }

    /* JADX INFO: renamed from: gt0.h$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgt0/h$h;", "Lgt0/h;", "<init>", "()V", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC16186h {

        /* JADX INFO: renamed from: b */
        public static final h f61490b = new h();

        private h() {
        }
    }
}
