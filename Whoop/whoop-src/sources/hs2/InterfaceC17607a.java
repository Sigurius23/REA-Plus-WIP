package hs2;

import c13.AbstractC3855a;
import com.whoop.navigation.C9598e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: hs2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\u0002\f\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lhs2/a;", "", "j", "c", "i", "d", "f", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "b", "a", "Lhs2/a$g;", "Lhs2/a$j;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC17607a {

    /* JADX INFO: renamed from: hs2.a$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lhs2/a$a;", "Lhs2/a$g;", "Lcom/whoop/navigation/e;", "navAction", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements g {

        /* JADX INFO: renamed from: b */
        public static final int f68217b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e navAction;

        public a(C9598e navAction) {
            AbstractC22676k.m65750j(navAction, "navAction");
            this.navAction = navAction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getNavAction() {
            return this.navAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.navAction, ((a) other).navAction);
        }

        public int hashCode() {
            return this.navAction.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("BackendDrivenNavigation(navAction=", this.navAction, ")");
        }
    }

    /* JADX INFO: renamed from: hs2.a$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhs2/a$b;", "Lhs2/a$g;", "<init>", "()V", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements g {

        /* JADX INFO: renamed from: a */
        public static final b f68219a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: hs2.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lhs2/a$c;", "Lhs2/a$j;", "", "callId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements j {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String callId;

        public c(String callId) {
            AbstractC22676k.m65750j(callId, "callId");
            this.callId = callId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.callId, ((c) other).callId);
        }

        public int hashCode() {
            return this.callId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Initialize(callId=", this.callId, ")");
        }
    }

    /* JADX INFO: renamed from: hs2.a$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhs2/a$d;", "Lhs2/a$j;", "<init>", "()V", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements j {

        /* JADX INFO: renamed from: a */
        public static final d f68221a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: hs2.a$e */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lhs2/a$e;", "Lhs2/a$j;", "Lcom/whoop/navigation/e;", "navAction", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements j {

        /* JADX INFO: renamed from: b */
        public static final int f68222b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e navAction;

        public e(C9598e navAction) {
            AbstractC22676k.m65750j(navAction, "navAction");
            this.navAction = navAction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getNavAction() {
            return this.navAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.navAction, ((e) other).navAction);
        }

        public int hashCode() {
            return this.navAction.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("LeaveAndNavigate(navAction=", this.navAction, ")");
        }
    }

    /* JADX INFO: renamed from: hs2.a$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhs2/a$f;", "Lhs2/a$j;", "<init>", "()V", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements j {

        /* JADX INFO: renamed from: a */
        public static final f f68224a = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: hs2.a$g */
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, m65681d2 = {"Lhs2/a$g;", "Lhs2/a;", "Lhs2/a$a;", "Lhs2/a$b;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface g extends InterfaceC17607a {
    }

    /* JADX INFO: renamed from: hs2.a$h */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lhs2/a$h;", "Lhs2/a$j;", "", "isDisabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h implements j {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isDisabled;

        public h(boolean z4) {
            this.isDisabled = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsDisabled() {
            return this.isDisabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && this.isDisabled == ((h) other).isDisabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isDisabled);
        }

        public String toString() {
            return AbstractC3855a.m11827k("PermissionsUpdated(isDisabled=", ")", this.isDisabled);
        }
    }

    /* JADX INFO: renamed from: hs2.a$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhs2/a$i;", "Lhs2/a$j;", "<init>", "()V", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements j {

        /* JADX INFO: renamed from: a */
        public static final i f68226a = new i();

        private i() {
        }
    }

    /* JADX INFO: renamed from: hs2.a$j */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lhs2/a$j;", "Lhs2/a;", "Lhs2/a$c;", "Lhs2/a$d;", "Lhs2/a$e;", "Lhs2/a$f;", "Lhs2/a$h;", "Lhs2/a$i;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface j extends InterfaceC17607a {
    }
}
