package sp0;

import com.whoop.common.network.model.ActivityOverlapError;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sp0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\u0005\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013À\u0006\u0003"}, m65681d2 = {"Lsp0/i;", "", "k", "f", "j", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "a", "d", "i", "l", "b", "c", "g", "Lsp0/h;", "Lsp0/i$a;", "Lsp0/i$d;", "Lsp0/i$i;", "Lsp0/i$l;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC32869i {

    /* JADX INFO: renamed from: sp0.i$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lsp0/i$a;", "Lsp0/i;", "Lcom/whoop/common/network/model/ActivityOverlapError;", "activityOverlapError", "<init>", "(Lcom/whoop/common/network/model/ActivityOverlapError;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/common/network/model/ActivityOverlapError;", "()Lcom/whoop/common/network/model/ActivityOverlapError;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC32869i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ActivityOverlapError activityOverlapError;

        public a(ActivityOverlapError activityOverlapError) {
            AbstractC22676k.m65750j(activityOverlapError, "activityOverlapError");
            this.activityOverlapError = activityOverlapError;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityOverlapError getActivityOverlapError() {
            return this.activityOverlapError;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.activityOverlapError, ((a) other).activityOverlapError);
        }

        public int hashCode() {
            return this.activityOverlapError.hashCode();
        }

        public String toString() {
            return "ActivityOverlapState(activityOverlapError=" + this.activityOverlapError + ")";
        }
    }

    /* JADX INFO: renamed from: sp0.i$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsp0/i$b;", "Lsp0/i$l;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements l {

        /* JADX INFO: renamed from: a */
        public static final b f136908a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: sp0.i$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsp0/i$c;", "Lsp0/i$l;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements l {

        /* JADX INFO: renamed from: a */
        public static final c f136909a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: sp0.i$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsp0/i$d;", "Lsp0/i;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC32869i {

        /* JADX INFO: renamed from: a */
        public static final d f136910a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: sp0.i$e */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lsp0/i$e;", "Lsp0/h;", "Lsp0/g;", "failedAction", "Lsp0/f;", "errorCloseEvent", "<init>", "(Lsp0/g;Lsp0/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsp0/g;", "b", "()Lsp0/g;", "Lsp0/f;", "()Lsp0/f;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC32868h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC32867g failedAction;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC32866f errorCloseEvent;

        public e(InterfaceC32867g failedAction, EnumC32866f errorCloseEvent) {
            AbstractC22676k.m65750j(failedAction, "failedAction");
            AbstractC22676k.m65750j(errorCloseEvent, "errorCloseEvent");
            this.failedAction = failedAction;
            this.errorCloseEvent = errorCloseEvent;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC32866f getErrorCloseEvent() {
            return this.errorCloseEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC32867g getFailedAction() {
            return this.failedAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.failedAction, eVar.failedAction) && this.errorCloseEvent == eVar.errorCloseEvent;
        }

        public int hashCode() {
            return this.errorCloseEvent.hashCode() + (this.failedAction.hashCode() * 31);
        }

        public String toString() {
            return "HttpError(failedAction=" + this.failedAction + ", errorCloseEvent=" + this.errorCloseEvent + ")";
        }
    }

    /* JADX INFO: renamed from: sp0.i$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsp0/i$f;", "Lsp0/h;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC32868h {

        /* JADX INFO: renamed from: a */
        public static final f f136913a = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: sp0.i$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lsp0/i$g;", "Lsp0/i$l;", "", "activityId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String activityId;

        public g(String activityId) {
            AbstractC22676k.m65750j(activityId, "activityId");
            this.activityId = activityId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivityId() {
            return this.activityId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.activityId, ((g) other).activityId);
        }

        public int hashCode() {
            return this.activityId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("NavigateToLinkWorkoutScreen(activityId=", this.activityId, ")");
        }
    }

    /* JADX INFO: renamed from: sp0.i$h */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lsp0/i$h;", "Lsp0/h;", "Lsp0/g;", "failedAction", "Lsp0/f;", "errorCloseEvent", "<init>", "(Lsp0/g;Lsp0/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsp0/g;", "b", "()Lsp0/g;", "Lsp0/f;", "()Lsp0/f;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h implements InterfaceC32868h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC32867g failedAction;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC32866f errorCloseEvent;

        public h(InterfaceC32867g failedAction, EnumC32866f errorCloseEvent) {
            AbstractC22676k.m65750j(failedAction, "failedAction");
            AbstractC22676k.m65750j(errorCloseEvent, "errorCloseEvent");
            this.failedAction = failedAction;
            this.errorCloseEvent = errorCloseEvent;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC32866f getErrorCloseEvent() {
            return this.errorCloseEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC32867g getFailedAction() {
            return this.failedAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.failedAction, hVar.failedAction) && this.errorCloseEvent == hVar.errorCloseEvent;
        }

        public int hashCode() {
            return this.errorCloseEvent.hashCode() + (this.failedAction.hashCode() * 31);
        }

        public String toString() {
            return "NetworkError(failedAction=" + this.failedAction + ", errorCloseEvent=" + this.errorCloseEvent + ")";
        }
    }

    /* JADX INFO: renamed from: sp0.i$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsp0/i$i;", "Lsp0/i;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC32869i {

        /* JADX INFO: renamed from: a */
        public static final i f136917a = new i();

        private i() {
        }
    }

    /* JADX INFO: renamed from: sp0.i$j */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsp0/i$j;", "Lsp0/h;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC32868h {

        /* JADX INFO: renamed from: a */
        public static final j f136918a = new j();

        private j() {
        }
    }

    /* JADX INFO: renamed from: sp0.i$k */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsp0/i$k;", "Lsp0/h;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements InterfaceC32868h {

        /* JADX INFO: renamed from: a */
        public static final k f136919a = new k();

        private k() {
        }
    }

    /* JADX INFO: renamed from: sp0.i$l */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lsp0/i$l;", "Lsp0/i;", "Lsp0/i$b;", "Lsp0/i$c;", "Lsp0/i$g;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface l extends InterfaceC32869i {
    }
}
