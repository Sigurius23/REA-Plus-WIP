package ds1;

import gz0.EnumC16313m0;
import h11.C16613h;
import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ds1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lds1/f;", "", "<init>", "()V", "b", "a", "c", "Lds1/f$a;", "Lds1/f$b;", "Lds1/f$c;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12336f {

    /* JADX INFO: renamed from: ds1.f$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lds1/f$a;", "Lds1/f;", "<init>", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC12336f {

        /* JADX INFO: renamed from: a */
        public static final a f41453a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ds1.f$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lds1/f$b;", "Lds1/f;", "<init>", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC12336f {

        /* JADX INFO: renamed from: a */
        public static final b f41454a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ds1.f$c */
    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u0018\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Lds1/f$c;", "Lds1/f;", "Lds1/p;", "todayCta", "Lgz0/m0;", "leftCalendarDisplayIcon", "rightCalendarDisplayIcon", "", "Lh11/h;", "entries", "", "shouldAnimate", "<init>", "(Lds1/p;Lgz0/m0;Lgz0/m0;Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lds1/p;", "d", "()Lds1/p;", "b", "Lgz0/m0;", "()Lgz0/m0;", "c", "Ljava/util/List;", "()Ljava/util/List;", "e", "Z", "getShouldAnimate", "()Z", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC12336f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C12346p todayCta;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC16313m0 leftCalendarDisplayIcon;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC16313m0 rightCalendarDisplayIcon;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<C16613h> entries;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean shouldAnimate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C12346p c12346p, EnumC16313m0 leftCalendarDisplayIcon, EnumC16313m0 enumC16313m0, List<C16613h> entries, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(leftCalendarDisplayIcon, "leftCalendarDisplayIcon");
            AbstractC22676k.m65750j(entries, "entries");
            this.todayCta = c12346p;
            this.leftCalendarDisplayIcon = leftCalendarDisplayIcon;
            this.rightCalendarDisplayIcon = enumC16313m0;
            this.entries = entries;
            this.shouldAnimate = z4;
        }

        /* JADX INFO: renamed from: a */
        public final List<C16613h> m34463a() {
            return this.entries;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC16313m0 getLeftCalendarDisplayIcon() {
            return this.leftCalendarDisplayIcon;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC16313m0 getRightCalendarDisplayIcon() {
            return this.rightCalendarDisplayIcon;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C12346p getTodayCta() {
            return this.todayCta;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.todayCta, cVar.todayCta) && this.leftCalendarDisplayIcon == cVar.leftCalendarDisplayIcon && this.rightCalendarDisplayIcon == cVar.rightCalendarDisplayIcon && AbstractC22676k.m65745e(this.entries, cVar.entries) && this.shouldAnimate == cVar.shouldAnimate;
        }

        public int hashCode() {
            C12346p c12346p = this.todayCta;
            int iM48500b = AbstractC17176i.m48500b(this.leftCalendarDisplayIcon, (c12346p == null ? 0 : c12346p.hashCode()) * 31, 31);
            EnumC16313m0 enumC16313m0 = this.rightCalendarDisplayIcon;
            return Boolean.hashCode(this.shouldAnimate) + AbstractC11895b.m31983b((iM48500b + (enumC16313m0 != null ? enumC16313m0.hashCode() : 0)) * 31, 31, this.entries);
        }

        public String toString() {
            C12346p c12346p = this.todayCta;
            EnumC16313m0 enumC16313m0 = this.leftCalendarDisplayIcon;
            EnumC16313m0 enumC16313m1 = this.rightCalendarDisplayIcon;
            List<C16613h> list = this.entries;
            boolean z4 = this.shouldAnimate;
            StringBuilder sb4 = new StringBuilder("Success(todayCta=");
            sb4.append(c12346p);
            sb4.append(", leftCalendarDisplayIcon=");
            sb4.append(enumC16313m0);
            sb4.append(", rightCalendarDisplayIcon=");
            sb4.append(enumC16313m1);
            sb4.append(", entries=");
            sb4.append(list);
            sb4.append(", shouldAnimate=");
            return AbstractC18489d0.m53372m(sb4, z4, ")");
        }
    }

    public /* synthetic */ AbstractC12336f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC12336f() {
    }
}
