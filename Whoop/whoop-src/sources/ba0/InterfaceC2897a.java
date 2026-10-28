package ba0;

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

/* JADX INFO: renamed from: ba0.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001aÀ\u0006\u0003"}, m65681d2 = {"Lba0/a;", "", "g", "f", "l", "k", "j", "i", "a", "e", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "b", "Lba0/a$a;", "Lba0/a$b;", "Lba0/a$c;", "Lba0/a$d;", "Lba0/a$e;", "Lba0/a$f;", "Lba0/a$g;", "Lba0/a$h;", "Lba0/a$i;", "Lba0/a$j;", "Lba0/a$k;", "Lba0/a$l;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC2897a {

    /* JADX INFO: renamed from: ba0.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lba0/a$a;", "Lba0/a;", "", "internalName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC2897a {

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

    /* JADX INFO: renamed from: ba0.a$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lba0/a$b;", "Lba0/a;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC2897a {

        /* JADX INFO: renamed from: a */
        public static final b f11600a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: ba0.a$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lba0/a$c;", "Lba0/a;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC2897a {

        /* JADX INFO: renamed from: a */
        public static final c f11601a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: ba0.a$d */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lba0/a$d;", "Lba0/a;", "", "isCancel", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC2897a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isCancel;

        public d(boolean z4) {
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
            return (other instanceof d) && this.isCancel == ((d) other).isCancel;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isCancel);
        }

        public String toString() {
            return AbstractC3855a.m11827k("GoBack(isCancel=", ")", this.isCancel);
        }
    }

    /* JADX INFO: renamed from: ba0.a$e */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lba0/a$e;", "Lba0/a;", "Lsp0/f;", "errorCloseEvent", "<init>", "(Lsp0/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsp0/f;", "getErrorCloseEvent", "()Lsp0/f;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC2897a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC32866f errorCloseEvent;

        public e(EnumC32866f errorCloseEvent) {
            AbstractC22676k.m65750j(errorCloseEvent, "errorCloseEvent");
            this.errorCloseEvent = errorCloseEvent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && this.errorCloseEvent == ((e) other).errorCloseEvent;
        }

        public int hashCode() {
            return this.errorCloseEvent.hashCode();
        }

        public String toString() {
            return "HideFullScreenModal(errorCloseEvent=" + this.errorCloseEvent + ")";
        }
    }

    /* JADX INFO: renamed from: ba0.a$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lba0/a$f;", "Lba0/a;", "Ln82/a;", "screenType", "<init>", "(Ln82/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln82/a;", "()Ln82/a;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements InterfaceC2897a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC26455a screenType;

        public f(EnumC26455a screenType) {
            AbstractC22676k.m65750j(screenType, "screenType");
            this.screenType = screenType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC26455a getScreenType() {
            return this.screenType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && this.screenType == ((f) other).screenType;
        }

        public int hashCode() {
            return this.screenType.hashCode();
        }

        public String toString() {
            return "LaunchSelectActivityScreen(screenType=" + this.screenType + ")";
        }
    }

    /* JADX INFO: renamed from: ba0.a$g */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lba0/a$g;", "Lba0/a;", "Ln82/a;", "initialScreenType", "", "startDate", "endDate", "internalName", "", "isGdcFlow", "<init>", "(Ln82/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ln82/a;", "b", "()Ln82/a;", "Ljava/lang/String;", "d", "c", "e", "Z", "()Z", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements InterfaceC2897a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC26455a initialScreenType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String startDate;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String endDate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String internalName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isGdcFlow;

        public g(EnumC26455a initialScreenType, String startDate, String endDate, String internalName, boolean z4) {
            AbstractC22676k.m65750j(initialScreenType, "initialScreenType");
            AbstractC22676k.m65750j(startDate, "startDate");
            AbstractC22676k.m65750j(endDate, "endDate");
            AbstractC22676k.m65750j(internalName, "internalName");
            this.initialScreenType = initialScreenType;
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
        public final EnumC26455a getInitialScreenType() {
            return this.initialScreenType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getInternalName() {
            return this.internalName;
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
            return this.initialScreenType == gVar.initialScreenType && AbstractC22676k.m65745e(this.startDate, gVar.startDate) && AbstractC22676k.m65745e(this.endDate, gVar.endDate) && AbstractC22676k.m65745e(this.internalName, gVar.internalName) && this.isGdcFlow == gVar.isGdcFlow;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isGdcFlow) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.initialScreenType.hashCode() * 31, 31, this.startDate), 31, this.endDate), 31, this.internalName);
        }

        public String toString() {
            EnumC26455a enumC26455a = this.initialScreenType;
            String str = this.startDate;
            String str2 = this.endDate;
            String str3 = this.internalName;
            boolean z4 = this.isGdcFlow;
            StringBuilder sb4 = new StringBuilder("LoadAddActivity(initialScreenType=");
            sb4.append(enumC26455a);
            sb4.append(", startDate=");
            sb4.append(str);
            sb4.append(", endDate=");
            AbstractC11266d.m30444B(sb4, str2, ", internalName=", str3, ", isGdcFlow=");
            return AbstractC18489d0.m53372m(sb4, z4, ")");
        }
    }

    /* JADX INFO: renamed from: ba0.a$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lba0/a$h;", "Lba0/a;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC2897a {

        /* JADX INFO: renamed from: a */
        public static final h f11610a = new h();

        private h() {
        }
    }

    /* JADX INFO: renamed from: ba0.a$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lba0/a$i;", "Lba0/a;", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC2897a {

        /* JADX INFO: renamed from: a */
        public static final i f11611a = new i();

        private i() {
        }
    }

    /* JADX INFO: renamed from: ba0.a$j */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lba0/a$j;", "Lba0/a;", "Lorg/joda/time/LocalDateTime;", "endTime", "<init>", "(Lorg/joda/time/LocalDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/joda/time/LocalDateTime;", "()Lorg/joda/time/LocalDateTime;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j implements InterfaceC2897a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDateTime endTime;

        public j(LocalDateTime endTime) {
            AbstractC22676k.m65750j(endTime, "endTime");
            this.endTime = endTime;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDateTime getEndTime() {
            return this.endTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j) && AbstractC22676k.m65745e(this.endTime, ((j) other).endTime);
        }

        public int hashCode() {
            return this.endTime.hashCode();
        }

        public String toString() {
            return "UpdateEndDateTime(endTime=" + this.endTime + ")";
        }
    }

    /* JADX INFO: renamed from: ba0.a$k */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lba0/a$k;", "Lba0/a;", "Lorg/joda/time/LocalDateTime;", "startTime", "<init>", "(Lorg/joda/time/LocalDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/joda/time/LocalDateTime;", "()Lorg/joda/time/LocalDateTime;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k implements InterfaceC2897a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDateTime startTime;

        public k(LocalDateTime startTime) {
            AbstractC22676k.m65750j(startTime, "startTime");
            this.startTime = startTime;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDateTime getStartTime() {
            return this.startTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof k) && AbstractC22676k.m65745e(this.startTime, ((k) other).startTime);
        }

        public int hashCode() {
            return this.startTime.hashCode();
        }

        public String toString() {
            return "UpdateStartDateTime(startTime=" + this.startTime + ")";
        }
    }

    /* JADX INFO: renamed from: ba0.a$l */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lba0/a$l;", "Lba0/a;", "Lsp0/j;", "strapLocation", "<init>", "(Lsp0/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsp0/j;", "()Lsp0/j;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l implements InterfaceC2897a {

        /* JADX INFO: renamed from: b */
        public static final int f11614b = TextResource.$stable;

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
            return "UpdateStrapLocation(strapLocation=" + this.strapLocation + ")";
        }
    }
}
