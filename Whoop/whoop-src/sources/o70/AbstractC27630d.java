package o70;

import java.util.List;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r90.C31103j;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: o70.d */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lo70/d;", "", "<init>", "()V", "f", "c", "a", "d", "e", "b", "Lo70/d$a;", "Lo70/d$b;", "Lo70/d$c;", "Lo70/d$d;", "Lo70/d$e;", "Lo70/d$f;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27630d {

    /* JADX INFO: renamed from: o70.d$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lo70/d$a;", "Lo70/d;", "", "termId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC27630d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String termId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String termId) {
            super(null);
            AbstractC22676k.m65750j(termId, "termId");
            this.termId = termId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTermId() {
            return this.termId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.termId, ((a) other).termId);
        }

        public int hashCode() {
            return this.termId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("CheckChanged(termId=", this.termId, ")");
        }
    }

    /* JADX INFO: renamed from: o70.d$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lo70/d$b;", "Lo70/d;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC27630d {

        /* JADX INFO: renamed from: a */
        public static final b f111184a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o70.d$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lo70/d$c;", "Lo70/d;", "", "termId", "fullTermsUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC27630d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String termId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String fullTermsUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String termId, String fullTermsUrl) {
            super(null);
            AbstractC22676k.m65750j(termId, "termId");
            AbstractC22676k.m65750j(fullTermsUrl, "fullTermsUrl");
            this.termId = termId;
            this.fullTermsUrl = fullTermsUrl;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFullTermsUrl() {
            return this.fullTermsUrl;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTermId() {
            return this.termId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.termId, cVar.termId) && AbstractC22676k.m65745e(this.fullTermsUrl, cVar.fullTermsUrl);
        }

        public int hashCode() {
            return this.fullTermsUrl.hashCode() + (this.termId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("FetchTermDetails(termId=", this.termId, ", fullTermsUrl=", this.fullTermsUrl, ")");
        }
    }

    /* JADX INFO: renamed from: o70.d$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lo70/d$d;", "Lo70/d;", "", "termId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC27630d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String termId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String termId) {
            super(null);
            AbstractC22676k.m65750j(termId, "termId");
            this.termId = termId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTermId() {
            return this.termId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.termId, ((d) other).termId);
        }

        public int hashCode() {
            return this.termId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("IsExpandedChanged(termId=", this.termId, ")");
        }
    }

    /* JADX INFO: renamed from: o70.d$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lo70/d$e;", "Lo70/d;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC27630d {

        /* JADX INFO: renamed from: a */
        public static final e f111188a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o70.d$f */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lo70/d$f;", "Lo70/d;", "", "Lr90/j;", "details", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC27630d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C31103j> details;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<C31103j> details) {
            super(null);
            AbstractC22676k.m65750j(details, "details");
            this.details = details;
        }

        /* JADX INFO: renamed from: a */
        public final List<C31103j> m83405a() {
            return this.details;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.details, ((f) other).details);
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("SetTerms(details=", ")", this.details);
        }
    }

    public /* synthetic */ AbstractC27630d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC27630d() {
    }
}
