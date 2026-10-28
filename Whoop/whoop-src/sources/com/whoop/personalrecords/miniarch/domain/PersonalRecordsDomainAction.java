package com.whoop.personalrecords.miniarch.domain;

import d13.AbstractC11478a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction;", "", "<init>", "()V", "Refresh", "LoadMore", "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;", "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$Refresh;", "personal-records-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class PersonalRecordsDomainAction {
    public static final int $stable = 0;

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;", "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction;", "startDate", "", "endDate", "nextExerciseOffset", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getStartDate", "()Ljava/lang/String;", "getEndDate", "getNextExerciseOffset", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;", "equals", "", "other", "", "hashCode", "toString", "personal-records-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class LoadMore extends PersonalRecordsDomainAction {
        public static final int $stable = 0;
        private final String endDate;
        private final Integer nextExerciseOffset;
        private final String startDate;

        public LoadMore(String str, String str2, Integer num) {
            super(null);
            this.startDate = str;
            this.endDate = str2;
            this.nextExerciseOffset = num;
        }

        public static /* synthetic */ LoadMore copy$default(LoadMore loadMore, String str, String str2, Integer num, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = loadMore.startDate;
            }
            if ((i13 & 2) != 0) {
                str2 = loadMore.endDate;
            }
            if ((i13 & 4) != 0) {
                num = loadMore.nextExerciseOffset;
            }
            return loadMore.copy(str, str2, num);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getStartDate() {
            return this.startDate;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getEndDate() {
            return this.endDate;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getNextExerciseOffset() {
            return this.nextExerciseOffset;
        }

        public final LoadMore copy(String startDate, String endDate, Integer nextExerciseOffset) {
            return new LoadMore(startDate, endDate, nextExerciseOffset);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadMore)) {
                return false;
            }
            LoadMore loadMore = (LoadMore) other;
            return AbstractC22676k.m65745e(this.startDate, loadMore.startDate) && AbstractC22676k.m65745e(this.endDate, loadMore.endDate) && AbstractC22676k.m65745e(this.nextExerciseOffset, loadMore.nextExerciseOffset);
        }

        public final String getEndDate() {
            return this.endDate;
        }

        public final Integer getNextExerciseOffset() {
            return this.nextExerciseOffset;
        }

        public final String getStartDate() {
            return this.startDate;
        }

        public int hashCode() {
            String str = this.startDate;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.endDate;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.nextExerciseOffset;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            String str = this.startDate;
            String str2 = this.endDate;
            return AbstractC11478a.m30859k(AbstractC11895b.m32001t("LoadMore(startDate=", str, ", endDate=", str2, ", nextExerciseOffset="), this.nextExerciseOffset, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$Refresh;", "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction;", "path", "", "<init>", "(Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "personal-records-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class Refresh extends PersonalRecordsDomainAction {
        public static final int $stable = 0;
        private final String path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Refresh(String path) {
            super(null);
            AbstractC22676k.m65750j(path, "path");
            this.path = path;
        }

        public static /* synthetic */ Refresh copy$default(Refresh refresh, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = refresh.path;
            }
            return refresh.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public final Refresh copy(String path) {
            AbstractC22676k.m65750j(path, "path");
            return new Refresh(path);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Refresh) && AbstractC22676k.m65745e(this.path, ((Refresh) other).path);
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.path.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Refresh(path=", this.path, ")");
        }
    }

    public /* synthetic */ PersonalRecordsDomainAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PersonalRecordsDomainAction() {
    }
}
