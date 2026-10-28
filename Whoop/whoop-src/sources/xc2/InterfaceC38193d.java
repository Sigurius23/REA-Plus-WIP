package xc2;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xc2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lxc2/d;", "", "c", "b", "a", "d", "Lxc2/d$a;", "Lxc2/d$b;", "Lxc2/d$c;", "Lxc2/d$d;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC38193d {

    /* JADX INFO: renamed from: xc2.d$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lxc2/d$a;", "Lxc2/d;", "Lxc2/a;", "type", "", "plan", "<init>", "(Lxc2/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxc2/a;", "b", "()Lxc2/a;", "Ljava/lang/String;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC38193d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC38190a type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String plan;

        public a(EnumC38190a type, String plan) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(plan, "plan");
            this.type = type;
            this.plan = plan;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPlan() {
            return this.plan;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC38190a getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.type == aVar.type && AbstractC22676k.m65745e(this.plan, aVar.plan);
        }

        public int hashCode() {
            return this.plan.hashCode() + (this.type.hashCode() * 31);
        }

        public String toString() {
            return "Error(type=" + this.type + ", plan=" + this.plan + ")";
        }
    }

    /* JADX INFO: renamed from: xc2.d$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Lxc2/d$b;", "Lxc2/d;", "", "title", "subtitle", "acceptCta", "rejectCta", "plan", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "d", "c", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC38193d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String subtitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String acceptCta;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String rejectCta;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String plan;

        public b(String title, String subtitle, String acceptCta, String rejectCta, String plan) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            AbstractC22676k.m65750j(acceptCta, "acceptCta");
            AbstractC22676k.m65750j(rejectCta, "rejectCta");
            AbstractC22676k.m65750j(plan, "plan");
            this.title = title;
            this.subtitle = subtitle;
            this.acceptCta = acceptCta;
            this.rejectCta = rejectCta;
            this.plan = plan;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAcceptCta() {
            return this.acceptCta;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPlan() {
            return this.plan;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getRejectCta() {
            return this.rejectCta;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.title, bVar.title) && AbstractC22676k.m65745e(this.subtitle, bVar.subtitle) && AbstractC22676k.m65745e(this.acceptCta, bVar.acceptCta) && AbstractC22676k.m65745e(this.rejectCta, bVar.rejectCta) && AbstractC22676k.m65745e(this.plan, bVar.plan);
        }

        public int hashCode() {
            return this.plan.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.acceptCta), 31, this.rejectCta);
        }

        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            String str3 = this.acceptCta;
            String str4 = this.rejectCta;
            String str5 = this.plan;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Landing(title=", str, ", subtitle=", str2, ", acceptCta=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", rejectCta=", str4, ", plan=");
            return AbstractC25012a.m73376i(str5, ")", sbM32001t);
        }
    }

    /* JADX INFO: renamed from: xc2.d$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxc2/d$c;", "Lxc2/d;", "<init>", "()V", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC38193d {

        /* JADX INFO: renamed from: a */
        public static final c f163559a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: xc2.d$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lxc2/d$d;", "Lxc2/d;", "", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC38193d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String subtitle;

        public d(String title, String subtitle) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            this.title = title;
            this.subtitle = subtitle;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.title, dVar.title) && AbstractC22676k.m65745e(this.subtitle, dVar.subtitle);
        }

        public int hashCode() {
            return this.subtitle.hashCode() + (this.title.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("SwitchBillingPlanSuccess(title=", this.title, ", subtitle=", this.subtitle, ")");
        }
    }
}
