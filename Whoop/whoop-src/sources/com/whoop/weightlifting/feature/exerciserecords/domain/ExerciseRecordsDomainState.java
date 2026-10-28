package com.whoop.weightlifting.feature.exerciserecords.domain;

import com.whoop.design.models.DesignSystemModel;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003JU\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0014\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004J\n\u0010#\u001a\u00020\bHÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006$"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;", "", "currentDialogType", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType;", "response", "", "Lcom/whoop/design/models/DesignSystemModel;", "path", "", "isLoadingMore", "", "nextStartDate", "analyticsActionFromApi", "<init>", "(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getCurrentDialogType", "()Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType;", "getResponse", "()Ljava/util/List;", "getPath", "()Ljava/lang/String;", "()Z", "getNextStartDate", "getAnalyticsActionFromApi", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ExerciseRecordsDomainState {
    public static final int $stable = 8;
    private final String analyticsActionFromApi;
    private final ExerciseRecordsDomainDialogType currentDialogType;
    private final boolean isLoadingMore;
    private final String nextStartDate;
    private final String path;
    private final List<DesignSystemModel> response;

    public ExerciseRecordsDomainState() {
        this(null, null, null, false, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExerciseRecordsDomainState copy$default(ExerciseRecordsDomainState exerciseRecordsDomainState, ExerciseRecordsDomainDialogType exerciseRecordsDomainDialogType, List list, String str, boolean z4, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            exerciseRecordsDomainDialogType = exerciseRecordsDomainState.currentDialogType;
        }
        if ((i13 & 2) != 0) {
            list = exerciseRecordsDomainState.response;
        }
        if ((i13 & 4) != 0) {
            str = exerciseRecordsDomainState.path;
        }
        if ((i13 & 8) != 0) {
            z4 = exerciseRecordsDomainState.isLoadingMore;
        }
        if ((i13 & 16) != 0) {
            str2 = exerciseRecordsDomainState.nextStartDate;
        }
        if ((i13 & 32) != 0) {
            str3 = exerciseRecordsDomainState.analyticsActionFromApi;
        }
        String str4 = str2;
        String str5 = str3;
        return exerciseRecordsDomainState.copy(exerciseRecordsDomainDialogType, list, str, z4, str4, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ExerciseRecordsDomainDialogType getCurrentDialogType() {
        return this.currentDialogType;
    }

    public final List<DesignSystemModel> component2() {
        return this.response;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsLoadingMore() {
        return this.isLoadingMore;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNextStartDate() {
        return this.nextStartDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAnalyticsActionFromApi() {
        return this.analyticsActionFromApi;
    }

    public final ExerciseRecordsDomainState copy(ExerciseRecordsDomainDialogType currentDialogType, List<? extends DesignSystemModel> response, String path, boolean isLoadingMore, String nextStartDate, String analyticsActionFromApi) {
        return new ExerciseRecordsDomainState(currentDialogType, response, path, isLoadingMore, nextStartDate, analyticsActionFromApi);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExerciseRecordsDomainState)) {
            return false;
        }
        ExerciseRecordsDomainState exerciseRecordsDomainState = (ExerciseRecordsDomainState) other;
        return AbstractC22676k.m65745e(this.currentDialogType, exerciseRecordsDomainState.currentDialogType) && AbstractC22676k.m65745e(this.response, exerciseRecordsDomainState.response) && AbstractC22676k.m65745e(this.path, exerciseRecordsDomainState.path) && this.isLoadingMore == exerciseRecordsDomainState.isLoadingMore && AbstractC22676k.m65745e(this.nextStartDate, exerciseRecordsDomainState.nextStartDate) && AbstractC22676k.m65745e(this.analyticsActionFromApi, exerciseRecordsDomainState.analyticsActionFromApi);
    }

    public final String getAnalyticsActionFromApi() {
        return this.analyticsActionFromApi;
    }

    public final ExerciseRecordsDomainDialogType getCurrentDialogType() {
        return this.currentDialogType;
    }

    public final String getNextStartDate() {
        return this.nextStartDate;
    }

    public final String getPath() {
        return this.path;
    }

    public final List<DesignSystemModel> getResponse() {
        return this.response;
    }

    public int hashCode() {
        ExerciseRecordsDomainDialogType exerciseRecordsDomainDialogType = this.currentDialogType;
        int iHashCode = (exerciseRecordsDomainDialogType == null ? 0 : exerciseRecordsDomainDialogType.hashCode()) * 31;
        List<DesignSystemModel> list = this.response;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.path;
        int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isLoadingMore);
        String str2 = this.nextStartDate;
        int iHashCode3 = (iM8289b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.analyticsActionFromApi;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isLoadingMore() {
        return this.isLoadingMore;
    }

    public String toString() {
        ExerciseRecordsDomainDialogType exerciseRecordsDomainDialogType = this.currentDialogType;
        List<DesignSystemModel> list = this.response;
        String str = this.path;
        boolean z4 = this.isLoadingMore;
        String str2 = this.nextStartDate;
        String str3 = this.analyticsActionFromApi;
        StringBuilder sb4 = new StringBuilder("ExerciseRecordsDomainState(currentDialogType=");
        sb4.append(exerciseRecordsDomainDialogType);
        sb4.append(", response=");
        sb4.append(list);
        sb4.append(", path=");
        AbstractC38963t7.m124390t(sb4, str, ", isLoadingMore=", z4, ", nextStartDate=");
        return AbstractC11266d.m30464r(sb4, str2, ", analyticsActionFromApi=", str3, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExerciseRecordsDomainState(ExerciseRecordsDomainDialogType exerciseRecordsDomainDialogType, List<? extends DesignSystemModel> list, String str, boolean z4, String str2, String str3) {
        this.currentDialogType = exerciseRecordsDomainDialogType;
        this.response = list;
        this.path = str;
        this.isLoadingMore = z4;
        this.nextStartDate = str2;
        this.analyticsActionFromApi = str3;
    }

    public /* synthetic */ ExerciseRecordsDomainState(ExerciseRecordsDomainDialogType exerciseRecordsDomainDialogType, List list, String str, boolean z4, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? ExerciseRecordsDomainDialogType.Loading.INSTANCE : exerciseRecordsDomainDialogType, (i13 & 2) != 0 ? null : list, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? null : str3);
    }
}
