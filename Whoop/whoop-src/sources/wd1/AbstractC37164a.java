package wd1;

import java.util.List;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: wd1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lwd1/a;", "", "<init>", "()V", "c", "a", "e", "d", "b", "f", "Lwd1/a$a;", "Lwd1/a$b;", "Lwd1/a$c;", "Lwd1/a$d;", "Lwd1/a$e;", "Lwd1/a$f;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37164a {

    /* JADX INFO: renamed from: wd1.a$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lwd1/a$a;", "Lwd1/a;", "Lwd1/b;", "baseInfo", "<init>", "(Lwd1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwd1/b;", "()Lwd1/b;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC37164a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C37165b baseInfo;

        public a(C37165b c37165b) {
            super(null);
            this.baseInfo = c37165b;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public C37165b getBaseInfo() {
            return this.baseInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.baseInfo, ((a) other).baseInfo);
        }

        public int hashCode() {
            C37165b c37165b = this.baseInfo;
            if (c37165b == null) {
                return 0;
            }
            return c37165b.hashCode();
        }

        public String toString() {
            return "CancelEditAnalyticEvent(baseInfo=" + this.baseInfo + ")";
        }
    }

    /* JADX INFO: renamed from: wd1.a$b */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lwd1/a$b;", "Lwd1/a;", "Lwd1/b;", "baseInfo", "", "", "activityList", "<init>", "(Lwd1/b;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwd1/b;", "b", "()Lwd1/b;", "Ljava/util/List;", "()Ljava/util/List;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC37164a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C37165b baseInfo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<String> activityList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C37165b c37165b, List<String> activityList) {
            super(null);
            AbstractC22676k.m65750j(activityList, "activityList");
            this.baseInfo = c37165b;
            this.activityList = activityList;
        }

        /* JADX INFO: renamed from: a */
        public final List<String> m119089a() {
            return this.activityList;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public C37165b getBaseInfo() {
            return this.baseInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.baseInfo, bVar.baseInfo) && AbstractC22676k.m65745e(this.activityList, bVar.activityList);
        }

        public int hashCode() {
            C37165b c37165b = this.baseInfo;
            return this.activityList.hashCode() + ((c37165b == null ? 0 : c37165b.hashCode()) * 31);
        }

        public String toString() {
            return "CancelOverlapActivityDialog(baseInfo=" + this.baseInfo + ", activityList=" + this.activityList + ")";
        }
    }

    /* JADX INFO: renamed from: wd1.a$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lwd1/a$c;", "Lwd1/a;", "Lwd1/b;", "baseInfo", "<init>", "(Lwd1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwd1/b;", "()Lwd1/b;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC37164a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C37165b baseInfo;

        public c(C37165b c37165b) {
            super(null);
            this.baseInfo = c37165b;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public C37165b getBaseInfo() {
            return this.baseInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.baseInfo, ((c) other).baseInfo);
        }

        public int hashCode() {
            C37165b c37165b = this.baseInfo;
            if (c37165b == null) {
                return 0;
            }
            return c37165b.hashCode();
        }

        public String toString() {
            return "LoadViewAnalyticEvent(baseInfo=" + this.baseInfo + ")";
        }
    }

    /* JADX INFO: renamed from: wd1.a$d */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lwd1/a$d;", "Lwd1/a;", "Lwd1/b;", "baseInfo", "", "", "activityList", "<init>", "(Lwd1/b;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwd1/b;", "b", "()Lwd1/b;", "Ljava/util/List;", "()Ljava/util/List;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC37164a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C37165b baseInfo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<String> activityList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C37165b c37165b, List<String> activityList) {
            super(null);
            AbstractC22676k.m65750j(activityList, "activityList");
            this.baseInfo = c37165b;
            this.activityList = activityList;
        }

        /* JADX INFO: renamed from: a */
        public final List<String> m119092a() {
            return this.activityList;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public C37165b getBaseInfo() {
            return this.baseInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.baseInfo, dVar.baseInfo) && AbstractC22676k.m65745e(this.activityList, dVar.activityList);
        }

        public int hashCode() {
            C37165b c37165b = this.baseInfo;
            return this.activityList.hashCode() + ((c37165b == null ? 0 : c37165b.hashCode()) * 31);
        }

        public String toString() {
            return "OverlapActivityDialogView(baseInfo=" + this.baseInfo + ", activityList=" + this.activityList + ")";
        }
    }

    /* JADX INFO: renamed from: wd1.a$e */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0016\u0010\r¨\u0006\u001f"}, m65681d2 = {"Lwd1/a$e;", "Lwd1/a;", "Lwd1/b;", "baseInfo", "", "previousStartTime", "previousEndTime", "newStartTime", "newEndTime", "activityId", "<init>", "(Lwd1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwd1/b;", "b", "()Lwd1/b;", "Ljava/lang/String;", "f", "c", "e", "d", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC37164a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C37165b baseInfo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String previousStartTime;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String previousEndTime;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String newStartTime;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String newEndTime;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String activityId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C37165b c37165b, String previousStartTime, String previousEndTime, String newStartTime, String newEndTime, String activityId) {
            super(null);
            AbstractC22676k.m65750j(previousStartTime, "previousStartTime");
            AbstractC22676k.m65750j(previousEndTime, "previousEndTime");
            AbstractC22676k.m65750j(newStartTime, "newStartTime");
            AbstractC22676k.m65750j(newEndTime, "newEndTime");
            AbstractC22676k.m65750j(activityId, "activityId");
            this.baseInfo = c37165b;
            this.previousStartTime = previousStartTime;
            this.previousEndTime = previousEndTime;
            this.newStartTime = newStartTime;
            this.newEndTime = newEndTime;
            this.activityId = activityId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivityId() {
            return this.activityId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public C37165b getBaseInfo() {
            return this.baseInfo;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getNewEndTime() {
            return this.newEndTime;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getNewStartTime() {
            return this.newStartTime;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPreviousEndTime() {
            return this.previousEndTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.baseInfo, eVar.baseInfo) && AbstractC22676k.m65745e(this.previousStartTime, eVar.previousStartTime) && AbstractC22676k.m65745e(this.previousEndTime, eVar.previousEndTime) && AbstractC22676k.m65745e(this.newStartTime, eVar.newStartTime) && AbstractC22676k.m65745e(this.newEndTime, eVar.newEndTime) && AbstractC22676k.m65745e(this.activityId, eVar.activityId);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getPreviousStartTime() {
            return this.previousStartTime;
        }

        public int hashCode() {
            C37165b c37165b = this.baseInfo;
            return this.activityId.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((c37165b == null ? 0 : c37165b.hashCode()) * 31, 31, this.previousStartTime), 31, this.previousEndTime), 31, this.newStartTime), 31, this.newEndTime);
        }

        public String toString() {
            C37165b c37165b = this.baseInfo;
            String str = this.previousStartTime;
            String str2 = this.previousEndTime;
            String str3 = this.newStartTime;
            String str4 = this.newEndTime;
            String str5 = this.activityId;
            StringBuilder sb4 = new StringBuilder("SaveActivityAnalyticEvent(baseInfo=");
            sb4.append(c37165b);
            sb4.append(", previousStartTime=");
            sb4.append(str);
            sb4.append(", previousEndTime=");
            AbstractC11266d.m30444B(sb4, str2, ", newStartTime=", str3, ", newEndTime=");
            return AbstractC11266d.m30464r(sb4, str4, ", activityId=", str5, ")");
        }
    }

    /* JADX INFO: renamed from: wd1.a$f */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lwd1/a$f;", "Lwd1/a;", "Lwd1/b;", "baseInfo", "", "", "activityList", "<init>", "(Lwd1/b;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwd1/b;", "b", "()Lwd1/b;", "Ljava/util/List;", "()Ljava/util/List;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC37164a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C37165b baseInfo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<String> activityList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C37165b c37165b, List<String> activityList) {
            super(null);
            AbstractC22676k.m65750j(activityList, "activityList");
            this.baseInfo = c37165b;
            this.activityList = activityList;
        }

        /* JADX INFO: renamed from: a */
        public final List<String> m119100a() {
            return this.activityList;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public C37165b getBaseInfo() {
            return this.baseInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.baseInfo, fVar.baseInfo) && AbstractC22676k.m65745e(this.activityList, fVar.activityList);
        }

        public int hashCode() {
            C37165b c37165b = this.baseInfo;
            return this.activityList.hashCode() + ((c37165b == null ? 0 : c37165b.hashCode()) * 31);
        }

        public String toString() {
            return "SaveOverlapActivityDialogView(baseInfo=" + this.baseInfo + ", activityList=" + this.activityList + ")";
        }
    }

    public /* synthetic */ AbstractC37164a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC37164a() {
    }
}
