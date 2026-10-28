package com.whoop.weightlifting.feature.exerciserecords.domain;

import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction;", "", "<init>", "()V", "LoadInitial", "LoadMore", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction$LoadInitial;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction$LoadMore;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class ExerciseRecordsDomainAction {
    public static final int $stable = 0;

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction$LoadInitial;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction;", "path", "", "<init>", "(Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class LoadInitial extends ExerciseRecordsDomainAction {
        public static final int $stable = 0;
        private final String path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadInitial(String path) {
            super(null);
            AbstractC22676k.m65750j(path, "path");
            this.path = path;
        }

        public static /* synthetic */ LoadInitial copy$default(LoadInitial loadInitial, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = loadInitial.path;
            }
            return loadInitial.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public final LoadInitial copy(String path) {
            AbstractC22676k.m65750j(path, "path");
            return new LoadInitial(path);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoadInitial) && AbstractC22676k.m65745e(this.path, ((LoadInitial) other).path);
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.path.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("LoadInitial(path=", this.path, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction$LoadMore;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction;", "path", "", "nextStartDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "getNextStartDate", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class LoadMore extends ExerciseRecordsDomainAction {
        public static final int $stable = 0;
        private final String nextStartDate;
        private final String path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadMore(String path, String str) {
            super(null);
            AbstractC22676k.m65750j(path, "path");
            this.path = path;
            this.nextStartDate = str;
        }

        public static /* synthetic */ LoadMore copy$default(LoadMore loadMore, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = loadMore.path;
            }
            if ((i13 & 2) != 0) {
                str2 = loadMore.nextStartDate;
            }
            return loadMore.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getNextStartDate() {
            return this.nextStartDate;
        }

        public final LoadMore copy(String path, String nextStartDate) {
            AbstractC22676k.m65750j(path, "path");
            return new LoadMore(path, nextStartDate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadMore)) {
                return false;
            }
            LoadMore loadMore = (LoadMore) other;
            return AbstractC22676k.m65745e(this.path, loadMore.path) && AbstractC22676k.m65745e(this.nextStartDate, loadMore.nextStartDate);
        }

        public final String getNextStartDate() {
            return this.nextStartDate;
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            int iHashCode = this.path.hashCode() * 31;
            String str = this.nextStartDate;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC2875y.m8300m("LoadMore(path=", this.path, ", nextStartDate=", this.nextStartDate, ")");
        }
    }

    public /* synthetic */ ExerciseRecordsDomainAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ExerciseRecordsDomainAction() {
    }
}
