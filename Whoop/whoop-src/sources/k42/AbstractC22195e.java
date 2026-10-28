package k42;

import c13.AbstractC3855a;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: k42.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lk42/e;", "", "<init>", "()V", "b", "e", "f", "a", "g", "d", "c", "Lk42/e$a;", "Lk42/e$b;", "Lk42/e$c;", "Lk42/e$d;", "Lk42/e$e;", "Lk42/e$f;", "Lk42/e$g;", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22195e {

    /* JADX INFO: renamed from: k42.e$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lk42/e$a;", "Lk42/e;", "", "searchable", "mutualCommunitySharing", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC22195e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean searchable;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean mutualCommunitySharing;

        public a(boolean z4, boolean z13) {
            super(null);
            this.searchable = z4;
            this.mutualCommunitySharing = z13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getMutualCommunitySharing() {
            return this.mutualCommunitySharing;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getSearchable() {
            return this.searchable;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.searchable == aVar.searchable && this.mutualCommunitySharing == aVar.mutualCommunitySharing;
        }

        public int hashCode() {
            return Boolean.hashCode(this.mutualCommunitySharing) + (Boolean.hashCode(this.searchable) * 31);
        }

        public String toString() {
            return AbstractC30802r.m94762k("CommunitySettingsRefresh(searchable=", ", mutualCommunitySharing=", ")", this.searchable, this.mutualCommunitySharing);
        }
    }

    /* JADX INFO: renamed from: k42.e$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lk42/e$b;", "Lk42/e;", "<init>", "()V", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC22195e {

        /* JADX INFO: renamed from: a */
        public static final b f86093a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: k42.e$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lk42/e$c;", "Lk42/e;", "<init>", "()V", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC22195e {

        /* JADX INFO: renamed from: a */
        public static final c f86094a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: k42.e$d */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lk42/e$d;", "Lk42/e;", "", "isEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC22195e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isEnabled;

        public d(boolean z4) {
            super(null);
            this.isEnabled = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && this.isEnabled == ((d) other).isEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isEnabled);
        }

        public String toString() {
            return AbstractC3855a.m11827k("RecommendationRefresh(isEnabled=", ")", this.isEnabled);
        }
    }

    /* JADX INFO: renamed from: k42.e$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lk42/e$e;", "Lk42/e;", "", "accountName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC22195e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String accountName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String accountName) {
            super(null);
            AbstractC22676k.m65750j(accountName, "accountName");
            this.accountName = accountName;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccountName() {
            return this.accountName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.accountName, ((e) other).accountName);
        }

        public int hashCode() {
            return this.accountName.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ShowDataSharingSheet(accountName=", this.accountName, ")");
        }
    }

    /* JADX INFO: renamed from: k42.e$f */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lk42/e$f;", "Lk42/e;", "", "searchable", "mutualCommunitySharing", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC22195e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean searchable;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean mutualCommunitySharing;

        public f(boolean z4, boolean z13) {
            super(null);
            this.searchable = z4;
            this.mutualCommunitySharing = z13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getMutualCommunitySharing() {
            return this.mutualCommunitySharing;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getSearchable() {
            return this.searchable;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return this.searchable == fVar.searchable && this.mutualCommunitySharing == fVar.mutualCommunitySharing;
        }

        public int hashCode() {
            return Boolean.hashCode(this.mutualCommunitySharing) + (Boolean.hashCode(this.searchable) * 31);
        }

        public String toString() {
            return AbstractC30802r.m94762k("ToggleCommunitySettings(searchable=", ", mutualCommunitySharing=", ")", this.searchable, this.mutualCommunitySharing);
        }
    }

    /* JADX INFO: renamed from: k42.e$g */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lk42/e$g;", "Lk42/e;", "", "isEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC22195e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isEnabled;

        public g(boolean z4) {
            super(null);
            this.isEnabled = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && this.isEnabled == ((g) other).isEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isEnabled);
        }

        public String toString() {
            return AbstractC3855a.m11827k("ToggleRecommendation(isEnabled=", ")", this.isEnabled);
        }
    }

    public /* synthetic */ AbstractC22195e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC22195e() {
    }
}
