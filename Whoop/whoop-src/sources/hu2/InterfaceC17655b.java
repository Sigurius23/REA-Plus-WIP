package hu2;

import c13.AbstractC3855a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: hu2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, m65681d2 = {"Lhu2/b;", "", "p", "k", "i", "a", "m", "l", "j", "e", "n", "b", "f", "c", "d", "o", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "Lhu2/b$f;", "Lhu2/b$p;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC17655b {

    /* JADX INFO: renamed from: hu2.b$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lhu2/b$a;", "Lhu2/b$p;", "", "groupIndex", "exerciseIndex", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "I", "b", "x", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements p {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final int groupIndex;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private final int exerciseIndex;

        public a(int i13, int i14) {
            this.groupIndex = i13;
            this.exerciseIndex = i14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getExerciseIndex() {
            return this.exerciseIndex;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getGroupIndex() {
            return this.groupIndex;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.groupIndex == aVar.groupIndex && this.exerciseIndex == aVar.exerciseIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.exerciseIndex) + (Integer.hashCode(this.groupIndex) * 31);
        }

        public String toString() {
            return AbstractC25012a.m73372e(this.groupIndex, this.exerciseIndex, "DeleteExerciseClicked(groupIndex=", ", exerciseIndex=", ")");
        }
    }

    /* JADX INFO: renamed from: hu2.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhu2/b$b;", "Lhu2/b$p;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements p {

        /* JADX INFO: renamed from: w */
        public static final b f68492w = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: hu2.b$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhu2/b$c;", "Lhu2/b$f;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements f {

        /* JADX INFO: renamed from: w */
        public static final c f68493w = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: hu2.b$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhu2/b$d;", "Lhu2/b$f;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements f {

        /* JADX INFO: renamed from: w */
        public static final d f68494w = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: hu2.b$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhu2/b$e;", "Lhu2/b$p;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements p {

        /* JADX INFO: renamed from: w */
        public static final e f68495w = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: hu2.b$f */
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lhu2/b$f;", "Lhu2/b;", "Lhu2/b$c;", "Lhu2/b$d;", "Lhu2/b$g;", "Lhu2/b$h;", "Lhu2/b$o;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface f extends InterfaceC17655b {
    }

    /* JADX INFO: renamed from: hu2.b$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lhu2/b$g;", "Lhu2/b$f;", "", "exerciseId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements f {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final String exerciseId;

        public g(String exerciseId) {
            AbstractC22676k.m65750j(exerciseId, "exerciseId");
            this.exerciseId = exerciseId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getExerciseId() {
            return this.exerciseId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.exerciseId, ((g) other).exerciseId);
        }

        public int hashCode() {
            return this.exerciseId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("OpenExerciseDetails(exerciseId=", this.exerciseId, ")");
        }
    }

    /* JADX INFO: renamed from: hu2.b$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhu2/b$h;", "Lhu2/b$f;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements f {

        /* JADX INFO: renamed from: w */
        public static final h f68497w = new h();

        private h() {
        }
    }

    /* JADX INFO: renamed from: hu2.b$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhu2/b$i;", "Lhu2/b$p;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements p {

        /* JADX INFO: renamed from: w */
        public static final i f68498w = new i();

        private i() {
        }
    }

    /* JADX INFO: renamed from: hu2.b$j */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhu2/b$j;", "Lhu2/b$p;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements p {

        /* JADX INFO: renamed from: w */
        public static final j f68499w = new j();

        private j() {
        }
    }

    /* JADX INFO: renamed from: hu2.b$k */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u000f¨\u0006*"}, m65681d2 = {"Lhu2/b$k;", "Lhu2/b$p;", "", "templateId", "", "activityId", "sharedTemplateId", "", "isFromWhoopCoach", "isCopyFlow", "copySuffix", "entryPoint", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "x", "Ljava/lang/String;", "a", "y", "d", "z", "Z", "g", "()Z", "E", "f", "F", "b", "G", "c", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k implements p {

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        private final boolean isCopyFlow;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        private final String copySuffix;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        private final String entryPoint;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final Long templateId;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private final String activityId;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private final String sharedTemplateId;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        private final boolean isFromWhoopCoach;

        public k(Long l7, String str, String str2, boolean z4, boolean z13, String copySuffix, String str3) {
            AbstractC22676k.m65750j(copySuffix, "copySuffix");
            this.templateId = l7;
            this.activityId = str;
            this.sharedTemplateId = str2;
            this.isFromWhoopCoach = z4;
            this.isCopyFlow = z13;
            this.copySuffix = copySuffix;
            this.entryPoint = str3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivityId() {
            return this.activityId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCopySuffix() {
            return this.copySuffix;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSharedTemplateId() {
            return this.sharedTemplateId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Long getTemplateId() {
            return this.templateId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.templateId, kVar.templateId) && AbstractC22676k.m65745e(this.activityId, kVar.activityId) && AbstractC22676k.m65745e(this.sharedTemplateId, kVar.sharedTemplateId) && this.isFromWhoopCoach == kVar.isFromWhoopCoach && this.isCopyFlow == kVar.isCopyFlow && AbstractC22676k.m65745e(this.copySuffix, kVar.copySuffix) && AbstractC22676k.m65745e(this.entryPoint, kVar.entryPoint);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsCopyFlow() {
            return this.isCopyFlow;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsFromWhoopCoach() {
            return this.isFromWhoopCoach;
        }

        public int hashCode() {
            Long l7 = this.templateId;
            int iHashCode = (l7 == null ? 0 : l7.hashCode()) * 31;
            String str = this.activityId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.sharedTemplateId;
            int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isFromWhoopCoach), 31, this.isCopyFlow), 31, this.copySuffix);
            String str3 = this.entryPoint;
            return iM30450d + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            Long l7 = this.templateId;
            String str = this.activityId;
            String str2 = this.sharedTemplateId;
            boolean z4 = this.isFromWhoopCoach;
            boolean z13 = this.isCopyFlow;
            String str3 = this.copySuffix;
            String str4 = this.entryPoint;
            StringBuilder sb4 = new StringBuilder("RefreshWorkoutTemplate(templateId=");
            sb4.append(l7);
            sb4.append(", activityId=");
            sb4.append(str);
            sb4.append(", sharedTemplateId=");
            AbstractC38963t7.m124390t(sb4, str2, ", isFromWhoopCoach=", z4, ", isCopyFlow=");
            AbstractC38963t7.m124391u(sb4, z13, ", copySuffix=", str3, ", entryPoint=");
            return AbstractC25012a.m73376i(str4, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: hu2.b$l */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhu2/b$l;", "Lhu2/b$p;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements p {

        /* JADX INFO: renamed from: w */
        public static final l f68507w = new l();

        private l() {
        }
    }

    /* JADX INFO: renamed from: hu2.b$m */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhu2/b$m;", "Lhu2/b$p;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements p {

        /* JADX INFO: renamed from: w */
        public static final m f68508w = new m();

        private m() {
        }
    }

    /* JADX INFO: renamed from: hu2.b$n */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lhu2/b$n;", "Lhu2/b$p;", "", "isCopyFlow", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Z", "a", "()Z", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n implements p {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final boolean isCopyFlow;

        public n(boolean z4) {
            this.isCopyFlow = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsCopyFlow() {
            return this.isCopyFlow;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof n) && this.isCopyFlow == ((n) other).isCopyFlow;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isCopyFlow);
        }

        public String toString() {
            return AbstractC3855a.m11827k("SavingModalDisplayed(isCopyFlow=", ")", this.isCopyFlow);
        }
    }

    /* JADX INFO: renamed from: hu2.b$o */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhu2/b$o;", "Lhu2/b$f;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements f {

        /* JADX INFO: renamed from: w */
        public static final o f68510w = new o();

        private o() {
        }
    }

    /* JADX INFO: renamed from: hu2.b$p */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lhu2/b$p;", "Lhu2/b;", "Lhu2/b$a;", "Lhu2/b$b;", "Lhu2/b$e;", "Lhu2/b$i;", "Lhu2/b$j;", "Lhu2/b$k;", "Lhu2/b$l;", "Lhu2/b$m;", "Lhu2/b$n;", "Lhu2/m;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface p extends InterfaceC17655b {
    }
}
