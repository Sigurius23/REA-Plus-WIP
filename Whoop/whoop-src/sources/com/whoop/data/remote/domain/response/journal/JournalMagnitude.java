package com.whoop.data.remote.domain.response.journal;

import com.whoop.data.remote.domain.dto.QuestionType;
import java.util.List;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jp\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010'J\u0014\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010+\u001a\u00020,HÖ\u0081\u0004J\n\u0010-\u001a\u00020\u0005HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;", "", "intervalSize", "", "label", "", "maxInclusive", "minInclusive", "type", "units", "stepValues", "", "Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;", "questionType", "Lcom/whoop/data/remote/domain/dto/QuestionType;", "<init>", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/data/remote/domain/dto/QuestionType;)V", "getIntervalSize", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getLabel", "()Ljava/lang/String;", "getMaxInclusive", "getMinInclusive", "getType", "getUnits", "getStepValues", "()Ljava/util/List;", "getQuestionType", "()Lcom/whoop/data/remote/domain/dto/QuestionType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/data/remote/domain/dto/QuestionType;)Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;", "equals", "", "other", "hashCode", "", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class JournalMagnitude {
    private final Float intervalSize;
    private final String label;
    private final Float maxInclusive;
    private final Float minInclusive;
    private final QuestionType questionType;
    private final List<JournalMagnitudeValue> stepValues;
    private final String type;
    private final String units;

    public JournalMagnitude(Float f13, String label, Float f14, Float f15, String type, String str, List<JournalMagnitudeValue> list, QuestionType questionType) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(type, "type");
        this.intervalSize = f13;
        this.label = label;
        this.maxInclusive = f14;
        this.minInclusive = f15;
        this.type = type;
        this.units = str;
        this.stepValues = list;
        this.questionType = questionType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JournalMagnitude copy$default(JournalMagnitude journalMagnitude, Float f13, String str, Float f14, Float f15, String str2, String str3, List list, QuestionType questionType, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = journalMagnitude.intervalSize;
        }
        if ((i13 & 2) != 0) {
            str = journalMagnitude.label;
        }
        if ((i13 & 4) != 0) {
            f14 = journalMagnitude.maxInclusive;
        }
        if ((i13 & 8) != 0) {
            f15 = journalMagnitude.minInclusive;
        }
        if ((i13 & 16) != 0) {
            str2 = journalMagnitude.type;
        }
        if ((i13 & 32) != 0) {
            str3 = journalMagnitude.units;
        }
        if ((i13 & 64) != 0) {
            list = journalMagnitude.stepValues;
        }
        if ((i13 & 128) != 0) {
            questionType = journalMagnitude.questionType;
        }
        List list2 = list;
        QuestionType questionType2 = questionType;
        String str4 = str2;
        String str5 = str3;
        return journalMagnitude.copy(f13, str, f14, f15, str4, str5, list2, questionType2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float getIntervalSize() {
        return this.intervalSize;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getMaxInclusive() {
        return this.maxInclusive;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getMinInclusive() {
        return this.minInclusive;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUnits() {
        return this.units;
    }

    public final List<JournalMagnitudeValue> component7() {
        return this.stepValues;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final QuestionType getQuestionType() {
        return this.questionType;
    }

    public final JournalMagnitude copy(Float intervalSize, String label, Float maxInclusive, Float minInclusive, String type, String units, List<JournalMagnitudeValue> stepValues, QuestionType questionType) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(type, "type");
        return new JournalMagnitude(intervalSize, label, maxInclusive, minInclusive, type, units, stepValues, questionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalMagnitude)) {
            return false;
        }
        JournalMagnitude journalMagnitude = (JournalMagnitude) other;
        return AbstractC22676k.m65745e(this.intervalSize, journalMagnitude.intervalSize) && AbstractC22676k.m65745e(this.label, journalMagnitude.label) && AbstractC22676k.m65745e(this.maxInclusive, journalMagnitude.maxInclusive) && AbstractC22676k.m65745e(this.minInclusive, journalMagnitude.minInclusive) && AbstractC22676k.m65745e(this.type, journalMagnitude.type) && AbstractC22676k.m65745e(this.units, journalMagnitude.units) && AbstractC22676k.m65745e(this.stepValues, journalMagnitude.stepValues) && this.questionType == journalMagnitude.questionType;
    }

    public final Float getIntervalSize() {
        return this.intervalSize;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Float getMaxInclusive() {
        return this.maxInclusive;
    }

    public final Float getMinInclusive() {
        return this.minInclusive;
    }

    public final QuestionType getQuestionType() {
        return this.questionType;
    }

    public final List<JournalMagnitudeValue> getStepValues() {
        return this.stepValues;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUnits() {
        return this.units;
    }

    public int hashCode() {
        Float f13 = this.intervalSize;
        int iM30450d = AbstractC11266d.m30450d((f13 == null ? 0 : f13.hashCode()) * 31, 31, this.label);
        Float f14 = this.maxInclusive;
        int iHashCode = (iM30450d + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.minInclusive;
        int iM30450d2 = AbstractC11266d.m30450d((iHashCode + (f15 == null ? 0 : f15.hashCode())) * 31, 31, this.type);
        String str = this.units;
        int iHashCode2 = (iM30450d2 + (str == null ? 0 : str.hashCode())) * 31;
        List<JournalMagnitudeValue> list = this.stepValues;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        QuestionType questionType = this.questionType;
        return iHashCode3 + (questionType != null ? questionType.hashCode() : 0);
    }

    public String toString() {
        Float f13 = this.intervalSize;
        String str = this.label;
        Float f14 = this.maxInclusive;
        Float f15 = this.minInclusive;
        String str2 = this.type;
        String str3 = this.units;
        List<JournalMagnitudeValue> list = this.stepValues;
        QuestionType questionType = this.questionType;
        StringBuilder sb4 = new StringBuilder("JournalMagnitude(intervalSize=");
        sb4.append(f13);
        sb4.append(", label=");
        sb4.append(str);
        sb4.append(", maxInclusive=");
        sb4.append(f14);
        sb4.append(", minInclusive=");
        sb4.append(f15);
        sb4.append(", type=");
        AbstractC11266d.m30444B(sb4, str2, ", units=", str3, ", stepValues=");
        sb4.append(list);
        sb4.append(", questionType=");
        sb4.append(questionType);
        sb4.append(")");
        return sb4.toString();
    }
}
