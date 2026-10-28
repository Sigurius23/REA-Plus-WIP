package da0;

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
import sp0.EnumC32866f;

/* JADX INFO: renamed from: da0.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001aÀ\u0006\u0003"}, m65681d2 = {"Lda0/b;", "", "g", "i", "l", "k", "d", "j", "a", "f", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "c", "Lda0/b$a;", "Lda0/b$b;", "Lda0/b$c;", "Lda0/b$d;", "Lda0/b$e;", "Lda0/b$f;", "Lda0/b$g;", "Lda0/b$h;", "Lda0/b$i;", "Lda0/b$j;", "Lda0/b$k;", "Lda0/b$l;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC11829b {

    /* JADX INFO: renamed from: da0.b$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lda0/b$a;", "Lda0/b;", "", "internalName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC11829b {

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

    /* JADX INFO: renamed from: da0.b$b */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lda0/b$b;", "Lda0/b;", "", "isCancel", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC11829b {

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

    /* JADX INFO: renamed from: da0.b$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lda0/b$c;", "Lda0/b;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC11829b {

        /* JADX INFO: renamed from: a */
        public static final c f38429a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: da0.b$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lda0/b$d;", "Lda0/b;", "Lorg/joda/time/LocalDateTime;", "endDateTime", "<init>", "(Lorg/joda/time/LocalDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/joda/time/LocalDateTime;", "()Lorg/joda/time/LocalDateTime;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC11829b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDateTime endDateTime;

        public d(LocalDateTime endDateTime) {
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
            return (other instanceof d) && AbstractC22676k.m65745e(this.endDateTime, ((d) other).endDateTime);
        }

        public int hashCode() {
            return this.endDateTime.hashCode();
        }

        public String toString() {
            return "EndDateTimeUpdated(endDateTime=" + this.endDateTime + ")";
        }
    }

    /* JADX INFO: renamed from: da0.b$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lda0/b$e;", "Lda0/b;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC11829b {

        /* JADX INFO: renamed from: a */
        public static final e f38431a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: da0.b$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lda0/b$f;", "Lda0/b;", "Lsp0/f;", "errorCloseEvent", "<init>", "(Lsp0/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsp0/f;", "()Lsp0/f;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements InterfaceC11829b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC32866f errorCloseEvent;

        public f(EnumC32866f errorCloseEvent) {
            AbstractC22676k.m65750j(errorCloseEvent, "errorCloseEvent");
            this.errorCloseEvent = errorCloseEvent;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC32866f getErrorCloseEvent() {
            return this.errorCloseEvent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && this.errorCloseEvent == ((f) other).errorCloseEvent;
        }

        public int hashCode() {
            return this.errorCloseEvent.hashCode();
        }

        public String toString() {
            return "HideFullScreenModal(errorCloseEvent=" + this.errorCloseEvent + ")";
        }
    }

    /* JADX INFO: renamed from: da0.b$g */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lda0/b$g;", "Lda0/b;", "", "pageType", "startDate", "endDate", "internalName", "", "isGdcFlow", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "e", "Z", "()Z", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements InterfaceC11829b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String pageType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String startDate;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String endDate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String internalName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isGdcFlow;

        public g(String pageType, String startDate, String endDate, String internalName, boolean z4) {
            AbstractC22676k.m65750j(pageType, "pageType");
            AbstractC22676k.m65750j(startDate, "startDate");
            AbstractC22676k.m65750j(endDate, "endDate");
            AbstractC22676k.m65750j(internalName, "internalName");
            this.pageType = pageType;
            this.startDate = startDate;
            this.endDate = endDate;
            this.internalName = internalName;
            this.isGdcFlow = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEndDate() {
            return this.endDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getInternalName() {
            return this.internalName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPageType() {
            return this.pageType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getStartDate() {
            return this.startDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsGdcFlow() {
            return this.isGdcFlow;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.pageType, gVar.pageType) && AbstractC22676k.m65745e(this.startDate, gVar.startDate) && AbstractC22676k.m65745e(this.endDate, gVar.endDate) && AbstractC22676k.m65745e(this.internalName, gVar.internalName) && this.isGdcFlow == gVar.isGdcFlow;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isGdcFlow) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.pageType.hashCode() * 31, 31, this.startDate), 31, this.endDate), 31, this.internalName);
        }

        public String toString() {
            String str = this.pageType;
            String str2 = this.startDate;
            String str3 = this.endDate;
            String str4 = this.internalName;
            boolean z4 = this.isGdcFlow;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("LoadAddActivity(pageType=", str, ", startDate=", str2, ", endDate=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", internalName=", str4, ", isGdcFlow=");
            return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
        }
    }

    /* JADX INFO: renamed from: da0.b$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lda0/b$h;", "Lda0/b;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC11829b {

        /* JADX INFO: renamed from: a */
        public static final h f38438a = new h();

        private h() {
        }
    }

    /* JADX INFO: renamed from: da0.b$i */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lda0/b$i;", "Lda0/b;", "Ln82/a;", "pageType", "<init>", "(Ln82/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln82/a;", "()Ln82/a;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i implements InterfaceC11829b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC26455a pageType;

        public i(EnumC26455a pageType) {
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
            return (other instanceof i) && this.pageType == ((i) other).pageType;
        }

        public int hashCode() {
            return this.pageType.hashCode();
        }

        public String toString() {
            return "SelectActivityClicked(pageType=" + this.pageType + ")";
        }
    }

    /* JADX INFO: renamed from: da0.b$j */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lda0/b$j;", "Lda0/b;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC11829b {

        /* JADX INFO: renamed from: a */
        public static final j f38440a = new j();

        private j() {
        }
    }

    /* JADX INFO: renamed from: da0.b$k */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lda0/b$k;", "Lda0/b;", "Lorg/joda/time/LocalDateTime;", "startDateTime", "<init>", "(Lorg/joda/time/LocalDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/joda/time/LocalDateTime;", "()Lorg/joda/time/LocalDateTime;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k implements InterfaceC11829b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDateTime startDateTime;

        public k(LocalDateTime startDateTime) {
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
            return (other instanceof k) && AbstractC22676k.m65745e(this.startDateTime, ((k) other).startDateTime);
        }

        public int hashCode() {
            return this.startDateTime.hashCode();
        }

        public String toString() {
            return "StartDateTimeUpdated(startDateTime=" + this.startDateTime + ")";
        }
    }

    /* JADX INFO: renamed from: da0.b$l */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lda0/b$l;", "Lda0/b;", "Lsp0/j;", "strapLocation", "<init>", "(Lsp0/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsp0/j;", "()Lsp0/j;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l implements InterfaceC11829b {

        /* JADX INFO: renamed from: b */
        public static final int f38442b = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C32870j strapLocation;

        public l(C32870j strapLocation) {
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
            return (other instanceof l) && AbstractC22676k.m65745e(this.strapLocation, ((l) other).strapLocation);
        }

        public int hashCode() {
            return this.strapLocation.hashCode();
        }

        public String toString() {
            return "StrapLocationUpdated(strapLocation=" + this.strapLocation + ")";
        }
    }
}
