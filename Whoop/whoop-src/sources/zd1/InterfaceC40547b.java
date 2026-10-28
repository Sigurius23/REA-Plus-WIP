package zd1;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import n82.EnumC26455a;
import org.joda.time.LocalDateTime;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sp0.C32870j;
import sp0.EnumC32861a;
import tp0.EnumC34058c;

/* JADX INFO: renamed from: zd1.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0013\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006(À\u0006\u0003"}, m65681d2 = {"Lzd1/b;", "", "k", "o", "m", "s", "r", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "p", "a", "j", "b", "l", "i", "c", "q", "f", "d", "n", "g", "e", "Lzd1/b$a;", "Lzd1/b$b;", "Lzd1/b$c;", "Lzd1/b$d;", "Lzd1/b$e;", "Lzd1/b$f;", "Lzd1/b$g;", "Lzd1/b$h;", "Lzd1/b$i;", "Lzd1/b$j;", "Lzd1/b$k;", "Lzd1/b$l;", "Lzd1/b$m;", "Lzd1/b$n;", "Lzd1/b$o;", "Lzd1/b$p;", "Lzd1/b$q;", "Lzd1/b$r;", "Lzd1/b$s;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC40547b {

    /* JADX INFO: renamed from: zd1.b$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lzd1/b$a;", "Lzd1/b;", "", "internalName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC40547b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String internalName;

        public a(String internalName) {
            AbstractC22676k.m65750j(internalName, "internalName");
            this.internalName = internalName;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getInternalName() {
            return this.internalName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.internalName, ((a) other).internalName);
        }

        public int hashCode() {
            return this.internalName.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ActivitySelected(internalName=", this.internalName, ")");
        }
    }

    /* JADX INFO: renamed from: zd1.b$b */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lzd1/b$b;", "Lzd1/b;", "", "isCancel", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC40547b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isCancel;

        public b(boolean z4) {
            this.isCancel = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsCancel() {
            return this.isCancel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.isCancel == ((b) other).isCancel;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isCancel);
        }

        public String toString() {
            return AbstractC3855a.m11827k("BackClicked(isCancel=", ")", this.isCancel);
        }
    }

    /* JADX INFO: renamed from: zd1.b$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lzd1/b$c;", "Lzd1/b;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC40547b {

        /* JADX INFO: renamed from: a */
        public static final c f174462a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: zd1.b$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lzd1/b$d;", "Lzd1/b;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC40547b {

        /* JADX INFO: renamed from: a */
        public static final d f174463a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: zd1.b$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lzd1/b$e;", "Lzd1/b;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC40547b {

        /* JADX INFO: renamed from: a */
        public static final e f174464a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: zd1.b$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lzd1/b$f;", "Lzd1/b;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC40547b {

        /* JADX INFO: renamed from: a */
        public static final f f174465a = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: zd1.b$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lzd1/b$g;", "Lzd1/b;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC40547b {

        /* JADX INFO: renamed from: a */
        public static final g f174466a = new g();

        private g() {
        }
    }

    /* JADX INFO: renamed from: zd1.b$h */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lzd1/b$h;", "Lzd1/b;", "Lorg/joda/time/LocalDateTime;", "endDateTime", "<init>", "(Lorg/joda/time/LocalDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/joda/time/LocalDateTime;", "()Lorg/joda/time/LocalDateTime;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h implements InterfaceC40547b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDateTime endDateTime;

        public h(LocalDateTime endDateTime) {
            AbstractC22676k.m65750j(endDateTime, "endDateTime");
            this.endDateTime = endDateTime;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDateTime getEndDateTime() {
            return this.endDateTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && AbstractC22676k.m65745e(this.endDateTime, ((h) other).endDateTime);
        }

        public int hashCode() {
            return this.endDateTime.hashCode();
        }

        public String toString() {
            return "EndDateTimeUpdated(endDateTime=" + this.endDateTime + ")";
        }
    }

    /* JADX INFO: renamed from: zd1.b$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lzd1/b$i;", "Lzd1/b;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC40547b {

        /* JADX INFO: renamed from: a */
        public static final i f174468a = new i();

        private i() {
        }
    }

    /* JADX INFO: renamed from: zd1.b$j */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lzd1/b$j;", "Lzd1/b;", "Lzd1/e;", "errorCloseEvent", "<init>", "(Lzd1/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzd1/e;", "()Lzd1/e;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j implements InterfaceC40547b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC40550e errorCloseEvent;

        public j(EnumC40550e errorCloseEvent) {
            AbstractC22676k.m65750j(errorCloseEvent, "errorCloseEvent");
            this.errorCloseEvent = errorCloseEvent;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC40550e getErrorCloseEvent() {
            return this.errorCloseEvent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j) && this.errorCloseEvent == ((j) other).errorCloseEvent;
        }

        public int hashCode() {
            return this.errorCloseEvent.hashCode();
        }

        public String toString() {
            return "HideFullScreenModal(errorCloseEvent=" + this.errorCloseEvent + ")";
        }
    }

    /* JADX INFO: renamed from: zd1.b$k */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, m65681d2 = {"Lzd1/b$k;", "Lzd1/b;", "", "startDate", "endDate", "internalName", "Lsp0/a;", "activityType", "activityId", "analyticFlow", "", "isDeletable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsp0/a;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "d", "c", "e", "Lsp0/a;", "()Lsp0/a;", "g", "Z", "()Z", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k implements InterfaceC40547b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String startDate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String endDate;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String internalName;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC32861a activityType;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String activityId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String analyticFlow;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean isDeletable;

        public k(String startDate, String endDate, String internalName, EnumC32861a activityType, String activityId, String analyticFlow, boolean z4) {
            AbstractC22676k.m65750j(startDate, "startDate");
            AbstractC22676k.m65750j(endDate, "endDate");
            AbstractC22676k.m65750j(internalName, "internalName");
            AbstractC22676k.m65750j(activityType, "activityType");
            AbstractC22676k.m65750j(activityId, "activityId");
            AbstractC22676k.m65750j(analyticFlow, "analyticFlow");
            this.startDate = startDate;
            this.endDate = endDate;
            this.internalName = internalName;
            this.activityType = activityType;
            this.activityId = activityId;
            this.analyticFlow = analyticFlow;
            this.isDeletable = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivityId() {
            return this.activityId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC32861a getActivityType() {
            return this.activityType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getAnalyticFlow() {
            return this.analyticFlow;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getEndDate() {
            return this.endDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getInternalName() {
            return this.internalName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.startDate, kVar.startDate) && AbstractC22676k.m65745e(this.endDate, kVar.endDate) && AbstractC22676k.m65745e(this.internalName, kVar.internalName) && this.activityType == kVar.activityType && AbstractC22676k.m65745e(this.activityId, kVar.activityId) && AbstractC22676k.m65745e(this.analyticFlow, kVar.analyticFlow) && this.isDeletable == kVar.isDeletable;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getStartDate() {
            return this.startDate;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsDeletable() {
            return this.isDeletable;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isDeletable) + AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.activityType.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.startDate.hashCode() * 31, 31, this.endDate), 31, this.internalName)) * 31, 31, this.activityId), 31, this.analyticFlow);
        }

        public String toString() {
            String str = this.startDate;
            String str2 = this.endDate;
            String str3 = this.internalName;
            EnumC32861a enumC32861a = this.activityType;
            String str4 = this.activityId;
            String str5 = this.analyticFlow;
            boolean z4 = this.isDeletable;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("LoadEditedActivity(startDate=", str, ", endDate=", str2, ", internalName=");
            sbM32001t.append(str3);
            sbM32001t.append(", activityType=");
            sbM32001t.append(enumC32861a);
            sbM32001t.append(", activityId=");
            AbstractC11266d.m30444B(sbM32001t, str4, ", analyticFlow=", str5, ", isDeletable=");
            return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
        }
    }

    /* JADX INFO: renamed from: zd1.b$l */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lzd1/b$l;", "Lzd1/b;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements InterfaceC40547b {

        /* JADX INFO: renamed from: a */
        public static final l f174477a = new l();

        private l() {
        }
    }

    /* JADX INFO: renamed from: zd1.b$m */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lzd1/b$m;", "Lzd1/b;", "Ln82/a;", "pageType", "<init>", "(Ln82/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln82/a;", "()Ln82/a;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m implements InterfaceC40547b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC26455a pageType;

        public m(EnumC26455a pageType) {
            AbstractC22676k.m65750j(pageType, "pageType");
            this.pageType = pageType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC26455a getPageType() {
            return this.pageType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof m) && this.pageType == ((m) other).pageType;
        }

        public int hashCode() {
            return this.pageType.hashCode();
        }

        public String toString() {
            return "SelectActivityClicked(pageType=" + this.pageType + ")";
        }
    }

    /* JADX INFO: renamed from: zd1.b$n */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lzd1/b$n;", "Lzd1/b;", "Ltp0/c;", "selectedSection", "<init>", "(Ltp0/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltp0/c;", "()Ltp0/c;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n implements InterfaceC40547b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC34058c selectedSection;

        public n(EnumC34058c selectedSection) {
            AbstractC22676k.m65750j(selectedSection, "selectedSection");
            this.selectedSection = selectedSection;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC34058c getSelectedSection() {
            return this.selectedSection;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof n) && this.selectedSection == ((n) other).selectedSection;
        }

        public int hashCode() {
            return this.selectedSection.hashCode();
        }

        public String toString() {
            return "SelectScreenSection(selectedSection=" + this.selectedSection + ")";
        }
    }

    /* JADX INFO: renamed from: zd1.b$o */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lzd1/b$o;", "Lzd1/b;", "Lsp0/a;", "activityType", "<init>", "(Lsp0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsp0/a;", "()Lsp0/a;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o implements InterfaceC40547b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC32861a activityType;

        public o(EnumC32861a activityType) {
            AbstractC22676k.m65750j(activityType, "activityType");
            this.activityType = activityType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC32861a getActivityType() {
            return this.activityType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof o) && this.activityType == ((o) other).activityType;
        }

        public int hashCode() {
            return this.activityType.hashCode();
        }

        public String toString() {
            return "SetInitialActivityType(activityType=" + this.activityType + ")";
        }
    }

    /* JADX INFO: renamed from: zd1.b$p */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lzd1/b$p;", "Lzd1/b;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements InterfaceC40547b {

        /* JADX INFO: renamed from: a */
        public static final p f174481a = new p();

        private p() {
        }
    }

    /* JADX INFO: renamed from: zd1.b$q */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lzd1/b$q;", "Lzd1/b;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements InterfaceC40547b {

        /* JADX INFO: renamed from: a */
        public static final q f174482a = new q();

        private q() {
        }
    }

    /* JADX INFO: renamed from: zd1.b$r */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lzd1/b$r;", "Lzd1/b;", "Lorg/joda/time/LocalDateTime;", "startDateTime", "<init>", "(Lorg/joda/time/LocalDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/joda/time/LocalDateTime;", "()Lorg/joda/time/LocalDateTime;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r implements InterfaceC40547b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDateTime startDateTime;

        public r(LocalDateTime startDateTime) {
            AbstractC22676k.m65750j(startDateTime, "startDateTime");
            this.startDateTime = startDateTime;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDateTime getStartDateTime() {
            return this.startDateTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof r) && AbstractC22676k.m65745e(this.startDateTime, ((r) other).startDateTime);
        }

        public int hashCode() {
            return this.startDateTime.hashCode();
        }

        public String toString() {
            return "StartDateTimeUpdated(startDateTime=" + this.startDateTime + ")";
        }
    }

    /* JADX INFO: renamed from: zd1.b$s */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lzd1/b$s;", "Lzd1/b;", "Lsp0/j;", "strapLocation", "<init>", "(Lsp0/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsp0/j;", "()Lsp0/j;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s implements InterfaceC40547b {

        /* JADX INFO: renamed from: b */
        public static final int f174484b = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C32870j strapLocation;

        public s(C32870j strapLocation) {
            AbstractC22676k.m65750j(strapLocation, "strapLocation");
            this.strapLocation = strapLocation;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C32870j getStrapLocation() {
            return this.strapLocation;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof s) && AbstractC22676k.m65745e(this.strapLocation, ((s) other).strapLocation);
        }

        public int hashCode() {
            return this.strapLocation.hashCode();
        }

        public String toString() {
            return "StrapLocationUpdated(strapLocation=" + this.strapLocation + ")";
        }
    }
}
