package wt2;

import com.mapbox.common.HttpHeaders;
import ep0.C13404j;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: wt2.q */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lwt2/q;", "", "<init>", "()V", "b", "a", "c", "Lwt2/q$a;", "Lwt2/q$b;", "Lwt2/q$c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37636q {

    /* JADX INFO: renamed from: wt2.q$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lwt2/q$a;", "Lwt2/q;", "", HttpHeaders.DATE, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC37636q {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String date;

        public a(String str) {
            super(null);
            this.date = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.date, ((a) other).date);
        }

        public int hashCode() {
            String str = this.date;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Error(date=", this.date, ")");
        }
    }

    /* JADX INFO: renamed from: wt2.q$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lwt2/q$b;", "Lwt2/q;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC37636q {

        /* JADX INFO: renamed from: a */
        public static final b f161161a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC37636q(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC37636q() {
    }

    /* JADX INFO: renamed from: wt2.q$c */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b#\u0010)¨\u0006*"}, m65681d2 = {"Lwt2/q$c;", "Lwt2/q;", "Lwt2/n;", "plan", "Lwt2/l;", "summary", "Lwt2/f;", "presets", "", "planState", "", "isUpdating", "Lep0/j;", "screenContextMetadata", "<init>", "(Lwt2/n;Lwt2/l;Lwt2/f;Ljava/lang/String;ZLep0/j;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lwt2/n;", "()Lwt2/n;", "b", "Lwt2/l;", "e", "()Lwt2/l;", "c", "Lwt2/f;", "()Lwt2/f;", "d", "Ljava/lang/String;", "Z", "f", "()Z", "Lep0/j;", "()Lep0/j;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC37636q {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C37633n plan;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C37631l summary;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final AbstractC37625f presets;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String planState;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isUpdating;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C13404j screenContextMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C37633n c37633n, C37631l c37631l, AbstractC37625f abstractC37625f, String planState, boolean z4, C13404j c13404j) {
            super(null);
            AbstractC22676k.m65750j(planState, "planState");
            this.plan = c37633n;
            this.summary = c37631l;
            this.presets = abstractC37625f;
            this.planState = planState;
            this.isUpdating = z4;
            this.screenContextMetadata = c13404j;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C37633n getPlan() {
            return this.plan;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPlanState() {
            return this.planState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AbstractC37625f getPresets() {
            return this.presets;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C13404j getScreenContextMetadata() {
            return this.screenContextMetadata;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C37631l getSummary() {
            return this.summary;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.plan, cVar.plan) && AbstractC22676k.m65745e(this.summary, cVar.summary) && AbstractC22676k.m65745e(this.presets, cVar.presets) && AbstractC22676k.m65745e(this.planState, cVar.planState) && this.isUpdating == cVar.isUpdating && AbstractC22676k.m65745e(this.screenContextMetadata, cVar.screenContextMetadata);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsUpdating() {
            return this.isUpdating;
        }

        public int hashCode() {
            C37633n c37633n = this.plan;
            int iHashCode = (c37633n == null ? 0 : c37633n.hashCode()) * 31;
            C37631l c37631l = this.summary;
            int iHashCode2 = (iHashCode + (c37631l == null ? 0 : c37631l.hashCode())) * 31;
            AbstractC37625f abstractC37625f = this.presets;
            int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d((iHashCode2 + (abstractC37625f == null ? 0 : abstractC37625f.hashCode())) * 31, 31, this.planState), 31, this.isUpdating);
            C13404j c13404j = this.screenContextMetadata;
            return iM8289b + (c13404j != null ? c13404j.hashCode() : 0);
        }

        public String toString() {
            return "Success(plan=" + this.plan + ", summary=" + this.summary + ", presets=" + this.presets + ", planState=" + this.planState + ", isUpdating=" + this.isUpdating + ", screenContextMetadata=" + this.screenContextMetadata + ")";
        }

        public /* synthetic */ c(C37633n c37633n, C37631l c37631l, AbstractC37625f abstractC37625f, String str, boolean z4, C13404j c13404j, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c37633n, c37631l, (i13 & 4) != 0 ? null : abstractC37625f, str, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? null : c13404j);
        }
    }
}
