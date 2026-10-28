package yv0;

import c13.AbstractC3855a;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import java.util.List;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yv0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lyv0/e;", "", "a", "b", "Lyv0/e$a;", "Lyv0/e$b;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC39802e {

    /* JADX INFO: renamed from: yv0.e$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lyv0/e$a;", "Lyv0/e;", "", "title", "Lgz0/m0;", "icon", "value", "target", "", "isCompleted", "<init>", "(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lgz0/m0;", "()Lgz0/m0;", "d", "e", "Z", "()Z", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC39802e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC16313m0 icon;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String target;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isCompleted;

        public a(String title, EnumC16313m0 icon, String value, String target, boolean z4) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(icon, "icon");
            AbstractC22676k.m65750j(value, "value");
            AbstractC22676k.m65750j(target, "target");
            this.title = title;
            this.icon = icon;
            this.value = value;
            this.target = target;
            this.isCompleted = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC16313m0 getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTarget() {
            return this.target;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsCompleted() {
            return this.isCompleted;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.title, aVar.title) && this.icon == aVar.icon && AbstractC22676k.m65745e(this.value, aVar.value) && AbstractC22676k.m65745e(this.target, aVar.target) && this.isCompleted == aVar.isCompleted;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isCompleted) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC17176i.m48500b(this.icon, this.title.hashCode() * 31, 31), 31, this.value), 31, this.target);
        }

        public String toString() {
            String str = this.title;
            EnumC16313m0 enumC16313m0 = this.icon;
            String str2 = this.value;
            String str3 = this.target;
            boolean z4 = this.isCompleted;
            StringBuilder sbM61141l = AbstractC21702c.m61141l("Target(title=", str, ", icon=", enumC16313m0, ", value=");
            AbstractC11266d.m30444B(sbM61141l, str2, ", target=", str3, ", isCompleted=");
            return AbstractC18489d0.m53372m(sbM61141l, z4, ")");
        }
    }

    /* JADX INFO: renamed from: yv0.e$b */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lyv0/e$b;", "Lyv0/e;", "", "title", "Lgz0/m0;", "icon", "", "Lyv0/f;", "zones", "<init>", "(Ljava/lang/String;Lgz0/m0;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lgz0/m0;", "()Lgz0/m0;", "c", "Ljava/util/List;", "()Ljava/util/List;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC39802e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC16313m0 icon;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<C39803f> zones;

        public b(String title, EnumC16313m0 icon, List<C39803f> zones) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(icon, "icon");
            AbstractC22676k.m65750j(zones, "zones");
            this.title = title;
            this.icon = icon;
            this.zones = zones;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC16313m0 getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: c */
        public final List<C39803f> m127591c() {
            return this.zones;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.title, bVar.title) && this.icon == bVar.icon && AbstractC22676k.m65745e(this.zones, bVar.zones);
        }

        public int hashCode() {
            return this.zones.hashCode() + AbstractC17176i.m48500b(this.icon, this.title.hashCode() * 31, 31);
        }

        public String toString() {
            String str = this.title;
            EnumC16313m0 enumC16313m0 = this.icon;
            return AbstractC3855a.m11829m(AbstractC21702c.m61141l("Zones(title=", str, ", icon=", enumC16313m0, ", zones="), this.zones, ")");
        }
    }
}
