package fu2;

import c13.AbstractC3855a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.UUID;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: fu2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0001\u0015¨\u0006\u0016À\u0006\u0003"}, m65681d2 = {"Lfu2/b;", "", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "s", "g", "l", "b", "f", "m", "n", "o", "d", "a", "j", "p", "q", "r", "k", "c", "Lfu2/b$n;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC14787b {

    /* JADX INFO: renamed from: fu2.b$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lfu2/b$a;", "Lfu2/b$n;", "", "groupIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int groupIndex;

        public a(int i13) {
            this.groupIndex = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getGroupIndex() {
            return this.groupIndex;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.groupIndex == ((a) other).groupIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.groupIndex);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.groupIndex, "AddSet(groupIndex=", ")");
        }
    }

    /* JADX INFO: renamed from: fu2.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfu2/b$b;", "", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC14787b {

        /* JADX INFO: renamed from: a */
        public static final b f54847a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: fu2.b$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfu2/b$c;", "Lfu2/b$n;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements n {

        /* JADX INFO: renamed from: a */
        public static final c f54848a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: fu2.b$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, m65681d2 = {"Lfu2/b$d;", "Lfu2/b$n;", "", "groupIndex", "exerciseIndex", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int groupIndex;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int exerciseIndex;

        public d(int i13, int i14) {
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
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return this.groupIndex == dVar.groupIndex && this.exerciseIndex == dVar.exerciseIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.exerciseIndex) + (Integer.hashCode(this.groupIndex) * 31);
        }

        public String toString() {
            return AbstractC25012a.m73372e(this.groupIndex, this.exerciseIndex, "DeleteExercise(groupIndex=", ", exerciseIndex=", ")");
        }
    }

    /* JADX INFO: renamed from: fu2.b$e */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, m65681d2 = {"Lfu2/b$e;", "", "", "groupIndex", "exerciseIndex", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC14787b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int groupIndex;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int exerciseIndex;

        public e(int i13, int i14) {
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
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return this.groupIndex == eVar.groupIndex && this.exerciseIndex == eVar.exerciseIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.exerciseIndex) + (Integer.hashCode(this.groupIndex) * 31);
        }

        public String toString() {
            return AbstractC25012a.m73372e(this.groupIndex, this.exerciseIndex, "OpenDeleteExerciseDialog(groupIndex=", ", exerciseIndex=", ")");
        }
    }

    /* JADX INFO: renamed from: fu2.b$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfu2/b$f;", "", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC14787b {

        /* JADX INFO: renamed from: a */
        public static final f f54853a = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: fu2.b$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfu2/b$g;", "", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC14787b {

        /* JADX INFO: renamed from: a */
        public static final g f54854a = new g();

        private g() {
        }
    }

    /* JADX INFO: renamed from: fu2.b$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfu2/b$h;", "", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC14787b {

        /* JADX INFO: renamed from: a */
        public static final h f54855a = new h();

        private h() {
        }
    }

    /* JADX INFO: renamed from: fu2.b$i */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001c\u0010\u000f¨\u0006\""}, m65681d2 = {"Lfu2/b$i;", "", "", "templateId", "", "activityId", "sharedTemplateId", "", "isFromWhoopCoach", "isCopyFlow", "copySuffix", "entryPoint", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "c", "d", "Z", "g", "()Z", "f", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i implements InterfaceC14787b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Long templateId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String activityId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String sharedTemplateId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isFromWhoopCoach;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isCopyFlow;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String copySuffix;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String entryPoint;

        public i(Long l7, String str, String str2, boolean z4, boolean z13, String copySuffix, String str3) {
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
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.templateId, iVar.templateId) && AbstractC22676k.m65745e(this.activityId, iVar.activityId) && AbstractC22676k.m65745e(this.sharedTemplateId, iVar.sharedTemplateId) && this.isFromWhoopCoach == iVar.isFromWhoopCoach && this.isCopyFlow == iVar.isCopyFlow && AbstractC22676k.m65745e(this.copySuffix, iVar.copySuffix) && AbstractC22676k.m65745e(this.entryPoint, iVar.entryPoint);
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

    /* JADX INFO: renamed from: fu2.b$j */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, m65681d2 = {"Lfu2/b$j;", "Lfu2/b$n;", "", "groupIndex", "setIndex", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j implements n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int groupIndex;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int setIndex;

        public j(int i13, int i14) {
            this.groupIndex = i13;
            this.setIndex = i14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getGroupIndex() {
            return this.groupIndex;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getSetIndex() {
            return this.setIndex;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return this.groupIndex == jVar.groupIndex && this.setIndex == jVar.setIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.setIndex) + (Integer.hashCode(this.groupIndex) * 31);
        }

        public String toString() {
            return AbstractC25012a.m73372e(this.groupIndex, this.setIndex, "RemoveSet(groupIndex=", ", setIndex=", ")");
        }
    }

    /* JADX INFO: renamed from: fu2.b$k */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, m65681d2 = {"Lfu2/b$k;", "Lfu2/b$n;", "", "fromIndex", "toIndex", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k implements n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int fromIndex;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int toIndex;

        public k(int i13, int i14) {
            this.fromIndex = i13;
            this.toIndex = i14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getFromIndex() {
            return this.fromIndex;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getToIndex() {
            return this.toIndex;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return this.fromIndex == kVar.fromIndex && this.toIndex == kVar.toIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.toIndex) + (Integer.hashCode(this.fromIndex) * 31);
        }

        public String toString() {
            return AbstractC25012a.m73372e(this.fromIndex, this.toIndex, "ReorderGroup(fromIndex=", ", toIndex=", ")");
        }
    }

    /* JADX INFO: renamed from: fu2.b$l */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lfu2/b$l;", "", "", "isCopyFlow", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l implements InterfaceC14787b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isCopyFlow;

        public l(boolean z4) {
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
            return (other instanceof l) && this.isCopyFlow == ((l) other).isCopyFlow;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isCopyFlow);
        }

        public String toString() {
            return AbstractC3855a.m11827k("SaveWorkoutToServer(isCopyFlow=", ")", this.isCopyFlow);
        }
    }

    /* JADX INFO: renamed from: fu2.b$m */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfu2/b$m;", "", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements InterfaceC14787b {

        /* JADX INFO: renamed from: a */
        public static final m f54868a = new m();

        private m() {
        }
    }

    /* JADX INFO: renamed from: fu2.b$n */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lfu2/b$n;", "Lfu2/b;", "Lfu2/a;", "Lfu2/b$a;", "Lfu2/b$c;", "Lfu2/b$d;", "Lfu2/b$j;", "Lfu2/b$k;", "Lfu2/b$o;", "Lfu2/b$p;", "Lfu2/b$q;", "Lfu2/b$r;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface n extends InterfaceC14787b, InterfaceC14786a {
    }

    /* JADX INFO: renamed from: fu2.b$o */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lfu2/b$o;", "Lfu2/b$n;", "Ljava/util/UUID;", "exerciseId", "<init>", "(Ljava/util/UUID;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o implements n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final UUID exerciseId;

        public o(UUID exerciseId) {
            AbstractC22676k.m65750j(exerciseId, "exerciseId");
            this.exerciseId = exerciseId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final UUID getExerciseId() {
            return this.exerciseId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof o) && AbstractC22676k.m65745e(this.exerciseId, ((o) other).exerciseId);
        }

        public int hashCode() {
            return this.exerciseId.hashCode();
        }

        public String toString() {
            return "ToggleExerciseEditing(exerciseId=" + this.exerciseId + ")";
        }
    }

    /* JADX INFO: renamed from: fu2.b$p */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0019"}, m65681d2 = {"Lfu2/b$p;", "Lfu2/b$n;", "", "groupIndex", "exerciseIndex", "setIndex", "", "newRepsText", "<init>", "(IIILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "d", "Ljava/lang/String;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p implements n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int groupIndex;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int exerciseIndex;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int setIndex;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String newRepsText;

        public p(int i13, int i14, int i15, String newRepsText) {
            AbstractC22676k.m65750j(newRepsText, "newRepsText");
            this.groupIndex = i13;
            this.exerciseIndex = i14;
            this.setIndex = i15;
            this.newRepsText = newRepsText;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getExerciseIndex() {
            return this.exerciseIndex;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getGroupIndex() {
            return this.groupIndex;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getNewRepsText() {
            return this.newRepsText;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getSetIndex() {
            return this.setIndex;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof p)) {
                return false;
            }
            p pVar = (p) other;
            return this.groupIndex == pVar.groupIndex && this.exerciseIndex == pVar.exerciseIndex && this.setIndex == pVar.setIndex && AbstractC22676k.m65745e(this.newRepsText, pVar.newRepsText);
        }

        public int hashCode() {
            return this.newRepsText.hashCode() + AbstractC11266d.m30448b(this.setIndex, AbstractC11266d.m30448b(this.exerciseIndex, Integer.hashCode(this.groupIndex) * 31, 31), 31);
        }

        public String toString() {
            return AbstractC38963t7.m124376f(this.setIndex, ", newRepsText=", this.newRepsText, ")", AbstractC11266d.m30465s(this.groupIndex, this.exerciseIndex, "UpdateReps(groupIndex=", ", exerciseIndex=", ", setIndex="));
        }
    }

    /* JADX INFO: renamed from: fu2.b$r */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0019"}, m65681d2 = {"Lfu2/b$r;", "Lfu2/b$n;", "", "groupIndex", "exerciseIndex", "setIndex", "", "newWeightText", "<init>", "(IIILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "d", "Ljava/lang/String;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r implements n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int groupIndex;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int exerciseIndex;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int setIndex;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String newWeightText;

        public r(int i13, int i14, int i15, String newWeightText) {
            AbstractC22676k.m65750j(newWeightText, "newWeightText");
            this.groupIndex = i13;
            this.exerciseIndex = i14;
            this.setIndex = i15;
            this.newWeightText = newWeightText;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getExerciseIndex() {
            return this.exerciseIndex;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getGroupIndex() {
            return this.groupIndex;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getNewWeightText() {
            return this.newWeightText;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getSetIndex() {
            return this.setIndex;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof r)) {
                return false;
            }
            r rVar = (r) other;
            return this.groupIndex == rVar.groupIndex && this.exerciseIndex == rVar.exerciseIndex && this.setIndex == rVar.setIndex && AbstractC22676k.m65745e(this.newWeightText, rVar.newWeightText);
        }

        public int hashCode() {
            return this.newWeightText.hashCode() + AbstractC11266d.m30448b(this.setIndex, AbstractC11266d.m30448b(this.exerciseIndex, Integer.hashCode(this.groupIndex) * 31, 31), 31);
        }

        public String toString() {
            return AbstractC38963t7.m124376f(this.setIndex, ", newWeightText=", this.newWeightText, ")", AbstractC11266d.m30465s(this.groupIndex, this.exerciseIndex, "UpdateWeight(groupIndex=", ", exerciseIndex=", ", setIndex="));
        }
    }

    /* JADX INFO: renamed from: fu2.b$s */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfu2/b$s;", "", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements InterfaceC14787b {

        /* JADX INFO: renamed from: a */
        public static final s f54883a = new s();

        private s() {
        }
    }

    /* JADX INFO: renamed from: fu2.b$q */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lfu2/b$q;", "Lfu2/b$n;", "", "groupIndex", "exerciseIndex", "setIndex", "", "newTimeText", "", "skipCascading", "<init>", "(IIILjava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "d", "Ljava/lang/String;", "e", "Z", "()Z", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class q implements n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int groupIndex;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int exerciseIndex;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int setIndex;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String newTimeText;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean skipCascading;

        public q(int i13, int i14, int i15, String newTimeText, boolean z4) {
            AbstractC22676k.m65750j(newTimeText, "newTimeText");
            this.groupIndex = i13;
            this.exerciseIndex = i14;
            this.setIndex = i15;
            this.newTimeText = newTimeText;
            this.skipCascading = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getExerciseIndex() {
            return this.exerciseIndex;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getGroupIndex() {
            return this.groupIndex;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getNewTimeText() {
            return this.newTimeText;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getSetIndex() {
            return this.setIndex;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getSkipCascading() {
            return this.skipCascading;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof q)) {
                return false;
            }
            q qVar = (q) other;
            return this.groupIndex == qVar.groupIndex && this.exerciseIndex == qVar.exerciseIndex && this.setIndex == qVar.setIndex && AbstractC22676k.m65745e(this.newTimeText, qVar.newTimeText) && this.skipCascading == qVar.skipCascading;
        }

        public int hashCode() {
            return Boolean.hashCode(this.skipCascading) + AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.setIndex, AbstractC11266d.m30448b(this.exerciseIndex, Integer.hashCode(this.groupIndex) * 31, 31), 31), 31, this.newTimeText);
        }

        public String toString() {
            int i13 = this.groupIndex;
            int i14 = this.exerciseIndex;
            int i15 = this.setIndex;
            String str = this.newTimeText;
            boolean z4 = this.skipCascading;
            StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "UpdateTime(groupIndex=", ", exerciseIndex=", ", setIndex=");
            AbstractC11895b.m31979B(i15, ", newTimeText=", str, ", skipCascading=", sbM30465s);
            return AbstractC18489d0.m53372m(sbM30465s, z4, ")");
        }

        public /* synthetic */ q(int i13, int i14, int i15, String str, boolean z4, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this(i13, i14, i15, str, (i16 & 16) != 0 ? false : z4);
        }
    }
}
