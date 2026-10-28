package com.whoop.data.remote.domain.response.journal;

import androidx.core.app.NotificationCompat;
import com.whoop.data.remote.domain.dto.QuestionType;
import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\b\u0086\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\nHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010,J\t\u0010B\u001a\u00020\u0011HÆ\u0003J\t\u0010C\u001a\u00020\u0011HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0019HÆ\u0003JÀ\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010IJ\u0014\u0010J\u001a\u00020\n2\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010L\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010M\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006N"}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;", "", "id", "", "description", "", "questionText", "title", NotificationCompat.CATEGORY_STATUS, "sticky", "", "magnitude", "Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;", "timeLabel", "category", "deprecated", "createdAt", "", "updatedAt", "timeContextLabel", "questionType", "Lcom/whoop/data/remote/domain/dto/QuestionType;", "weeklyPlanGoal", "Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;", "destination", "Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/response/journal/JournalMagnitude;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Lcom/whoop/data/remote/domain/dto/QuestionType;Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;)V", "getId", "()I", "setId", "(I)V", "getDescription", "()Ljava/lang/String;", "getQuestionText", "getTitle", "getStatus", "getSticky", "()Z", "getMagnitude", "()Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;", "getTimeLabel", "getCategory", "getDeprecated", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCreatedAt", "()D", "getUpdatedAt", "getTimeContextLabel", "getQuestionType", "()Lcom/whoop/data/remote/domain/dto/QuestionType;", "getWeeklyPlanGoal", "()Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;", "getDestination", "()Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/response/journal/JournalMagnitude;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Lcom/whoop/data/remote/domain/dto/QuestionType;Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;)Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;", "equals", "other", "hashCode", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class JournalBehaviorTracker {
    private final String category;
    private final double createdAt;
    private final Boolean deprecated;
    private final String description;
    private final BehaviorTrackerDestination destination;
    private int id;
    private final JournalMagnitude magnitude;
    private final String questionText;
    private final QuestionType questionType;
    private final String status;
    private final boolean sticky;
    private final String timeContextLabel;
    private final String timeLabel;
    private final String title;
    private final double updatedAt;
    private final WeeklyPlanGoal weeklyPlanGoal;

    public JournalBehaviorTracker(int i13, String str, String str2, String title, String status, boolean z4, JournalMagnitude journalMagnitude, String str3, String category, Boolean bool, double d3, double d14, String str4, QuestionType questionType, WeeklyPlanGoal weeklyPlanGoal, BehaviorTrackerDestination behaviorTrackerDestination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(category, "category");
        this.id = i13;
        this.description = str;
        this.questionText = str2;
        this.title = title;
        this.status = status;
        this.sticky = z4;
        this.magnitude = journalMagnitude;
        this.timeLabel = str3;
        this.category = category;
        this.deprecated = bool;
        this.createdAt = d3;
        this.updatedAt = d14;
        this.timeContextLabel = str4;
        this.questionType = questionType;
        this.weeklyPlanGoal = weeklyPlanGoal;
        this.destination = behaviorTrackerDestination;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getDeprecated() {
        return this.deprecated;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final double getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final double getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTimeContextLabel() {
        return this.timeContextLabel;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final QuestionType getQuestionType() {
        return this.questionType;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final WeeklyPlanGoal getWeeklyPlanGoal() {
        return this.weeklyPlanGoal;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BehaviorTrackerDestination getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getQuestionText() {
        return this.questionText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getSticky() {
        return this.sticky;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final JournalMagnitude getMagnitude() {
        return this.magnitude;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTimeLabel() {
        return this.timeLabel;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    public final JournalBehaviorTracker copy(int id4, String description, String questionText, String title, String status, boolean sticky, JournalMagnitude magnitude, String timeLabel, String category, Boolean deprecated, double createdAt, double updatedAt, String timeContextLabel, QuestionType questionType, WeeklyPlanGoal weeklyPlanGoal, BehaviorTrackerDestination destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(category, "category");
        return new JournalBehaviorTracker(id4, description, questionText, title, status, sticky, magnitude, timeLabel, category, deprecated, createdAt, updatedAt, timeContextLabel, questionType, weeklyPlanGoal, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalBehaviorTracker)) {
            return false;
        }
        JournalBehaviorTracker journalBehaviorTracker = (JournalBehaviorTracker) other;
        return this.id == journalBehaviorTracker.id && AbstractC22676k.m65745e(this.description, journalBehaviorTracker.description) && AbstractC22676k.m65745e(this.questionText, journalBehaviorTracker.questionText) && AbstractC22676k.m65745e(this.title, journalBehaviorTracker.title) && AbstractC22676k.m65745e(this.status, journalBehaviorTracker.status) && this.sticky == journalBehaviorTracker.sticky && AbstractC22676k.m65745e(this.magnitude, journalBehaviorTracker.magnitude) && AbstractC22676k.m65745e(this.timeLabel, journalBehaviorTracker.timeLabel) && AbstractC22676k.m65745e(this.category, journalBehaviorTracker.category) && AbstractC22676k.m65745e(this.deprecated, journalBehaviorTracker.deprecated) && Double.compare(this.createdAt, journalBehaviorTracker.createdAt) == 0 && Double.compare(this.updatedAt, journalBehaviorTracker.updatedAt) == 0 && AbstractC22676k.m65745e(this.timeContextLabel, journalBehaviorTracker.timeContextLabel) && this.questionType == journalBehaviorTracker.questionType && AbstractC22676k.m65745e(this.weeklyPlanGoal, journalBehaviorTracker.weeklyPlanGoal) && AbstractC22676k.m65745e(this.destination, journalBehaviorTracker.destination);
    }

    public final String getCategory() {
        return this.category;
    }

    public final double getCreatedAt() {
        return this.createdAt;
    }

    public final Boolean getDeprecated() {
        return this.deprecated;
    }

    public final String getDescription() {
        return this.description;
    }

    public final BehaviorTrackerDestination getDestination() {
        return this.destination;
    }

    public final int getId() {
        return this.id;
    }

    public final JournalMagnitude getMagnitude() {
        return this.magnitude;
    }

    public final String getQuestionText() {
        return this.questionText;
    }

    public final QuestionType getQuestionType() {
        return this.questionType;
    }

    public final String getStatus() {
        return this.status;
    }

    public final boolean getSticky() {
        return this.sticky;
    }

    public final String getTimeContextLabel() {
        return this.timeContextLabel;
    }

    public final String getTimeLabel() {
        return this.timeLabel;
    }

    public final String getTitle() {
        return this.title;
    }

    public final double getUpdatedAt() {
        return this.updatedAt;
    }

    public final WeeklyPlanGoal getWeeklyPlanGoal() {
        return this.weeklyPlanGoal;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.questionText;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.title), 31, this.status), 31, this.sticky);
        JournalMagnitude journalMagnitude = this.magnitude;
        int iHashCode3 = (iM8289b + (journalMagnitude == null ? 0 : journalMagnitude.hashCode())) * 31;
        String str3 = this.timeLabel;
        int iM30450d = AbstractC11266d.m30450d((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.category);
        Boolean bool = this.deprecated;
        int iM48499a = AbstractC17176i.m48499a(AbstractC17176i.m48499a((iM30450d + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.createdAt), 31, this.updatedAt);
        String str4 = this.timeContextLabel;
        int iHashCode4 = (iM48499a + (str4 == null ? 0 : str4.hashCode())) * 31;
        QuestionType questionType = this.questionType;
        int iHashCode5 = (iHashCode4 + (questionType == null ? 0 : questionType.hashCode())) * 31;
        WeeklyPlanGoal weeklyPlanGoal = this.weeklyPlanGoal;
        int iHashCode6 = (iHashCode5 + (weeklyPlanGoal == null ? 0 : weeklyPlanGoal.hashCode())) * 31;
        BehaviorTrackerDestination behaviorTrackerDestination = this.destination;
        return iHashCode6 + (behaviorTrackerDestination != null ? behaviorTrackerDestination.hashCode() : 0);
    }

    public final void setId(int i13) {
        this.id = i13;
    }

    public String toString() {
        int i13 = this.id;
        String str = this.description;
        String str2 = this.questionText;
        String str3 = this.title;
        String str4 = this.status;
        boolean z4 = this.sticky;
        JournalMagnitude journalMagnitude = this.magnitude;
        String str5 = this.timeLabel;
        String str6 = this.category;
        Boolean bool = this.deprecated;
        double d3 = this.createdAt;
        double d14 = this.updatedAt;
        String str7 = this.timeContextLabel;
        QuestionType questionType = this.questionType;
        WeeklyPlanGoal weeklyPlanGoal = this.weeklyPlanGoal;
        BehaviorTrackerDestination behaviorTrackerDestination = this.destination;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "JournalBehaviorTracker(id=", ", description=", str, ", questionText=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", title=", str3, ", status=");
        AbstractC38963t7.m124390t(sbM53373n, str4, ", sticky=", z4, ", magnitude=");
        sbM53373n.append(journalMagnitude);
        sbM53373n.append(", timeLabel=");
        sbM53373n.append(str5);
        sbM53373n.append(", category=");
        AbstractC36095b.m114692t(bool, str6, ", deprecated=", ", createdAt=", sbM53373n);
        sbM53373n.append(d3);
        AbstractC31061c.m95622B(sbM53373n, ", updatedAt=", d14, ", timeContextLabel=");
        sbM53373n.append(str7);
        sbM53373n.append(", questionType=");
        sbM53373n.append(questionType);
        sbM53373n.append(", weeklyPlanGoal=");
        sbM53373n.append(weeklyPlanGoal);
        sbM53373n.append(", destination=");
        sbM53373n.append(behaviorTrackerDestination);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }
}
