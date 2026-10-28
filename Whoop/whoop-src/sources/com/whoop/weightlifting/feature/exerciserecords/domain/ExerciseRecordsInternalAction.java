package com.whoop.weightlifting.feature.exerciserecords.domain;

import com.whoop.design.models.DesignSystemModel;
import java.util.List;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction;", "", "<init>", "()V", "Loading", "LoadingMore", "SkipPagination", "PageLoaded", "PageAppended", "OfflineError", "RequestFailedError", "PageAppendError", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$Loading;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$LoadingMore;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$OfflineError;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageAppendError;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageAppended;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageLoaded;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$RequestFailedError;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$SkipPagination;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
abstract class ExerciseRecordsInternalAction {

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$Loading;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction;", "path", "", "<init>", "(Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class Loading extends ExerciseRecordsInternalAction {
        public static final int $stable = 0;
        private final String path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(String path) {
            super(null);
            AbstractC22676k.m65750j(path, "path");
            this.path = path;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = loading.path;
            }
            return loading.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public final Loading copy(String path) {
            AbstractC22676k.m65750j(path, "path");
            return new Loading(path);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && AbstractC22676k.m65745e(this.path, ((Loading) other).path);
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.path.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Loading(path=", this.path, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$LoadingMore;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class LoadingMore extends ExerciseRecordsInternalAction {
        public static final int $stable = 0;
        public static final LoadingMore INSTANCE = new LoadingMore();

        private LoadingMore() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$OfflineError;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction;", "path", "", "<init>", "(Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class OfflineError extends ExerciseRecordsInternalAction {
        public static final int $stable = 0;
        private final String path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OfflineError(String path) {
            super(null);
            AbstractC22676k.m65750j(path, "path");
            this.path = path;
        }

        public static /* synthetic */ OfflineError copy$default(OfflineError offlineError, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = offlineError.path;
            }
            return offlineError.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public final OfflineError copy(String path) {
            AbstractC22676k.m65750j(path, "path");
            return new OfflineError(path);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OfflineError) && AbstractC22676k.m65745e(this.path, ((OfflineError) other).path);
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.path.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("OfflineError(path=", this.path, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageAppendError;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class PageAppendError extends ExerciseRecordsInternalAction {
        public static final int $stable = 0;
        public static final PageAppendError INSTANCE = new PageAppendError();

        private PageAppendError() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0006HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageAppended;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction;", "items", "", "Lcom/whoop/design/models/DesignSystemModel;", "nextStartDate", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "getNextStartDate", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class PageAppended extends ExerciseRecordsInternalAction {
        public static final int $stable = 8;
        private final List<DesignSystemModel> items;
        private final String nextStartDate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PageAppended(List<? extends DesignSystemModel> items, String str) {
            super(null);
            AbstractC22676k.m65750j(items, "items");
            this.items = items;
            this.nextStartDate = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PageAppended copy$default(PageAppended pageAppended, List list, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = pageAppended.items;
            }
            if ((i13 & 2) != 0) {
                str = pageAppended.nextStartDate;
            }
            return pageAppended.copy(list, str);
        }

        public final List<DesignSystemModel> component1() {
            return this.items;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getNextStartDate() {
            return this.nextStartDate;
        }

        public final PageAppended copy(List<? extends DesignSystemModel> items, String nextStartDate) {
            AbstractC22676k.m65750j(items, "items");
            return new PageAppended(items, nextStartDate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageAppended)) {
                return false;
            }
            PageAppended pageAppended = (PageAppended) other;
            return AbstractC22676k.m65745e(this.items, pageAppended.items) && AbstractC22676k.m65745e(this.nextStartDate, pageAppended.nextStartDate);
        }

        public final List<DesignSystemModel> getItems() {
            return this.items;
        }

        public final String getNextStartDate() {
            return this.nextStartDate;
        }

        public int hashCode() {
            int iHashCode = this.items.hashCode() * 31;
            String str = this.nextStartDate;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC30802r.m94761j("PageAppended(items=", ", nextStartDate=", this.nextStartDate, ")", this.items);
        }
    }

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageLoaded;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction;", "path", "", "items", "", "Lcom/whoop/design/models/DesignSystemModel;", "nextStartDate", "analyticsActionFromApi", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "getNextStartDate", "getAnalyticsActionFromApi", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class PageLoaded extends ExerciseRecordsInternalAction {
        public static final int $stable = 8;
        private final String analyticsActionFromApi;
        private final List<DesignSystemModel> items;
        private final String nextStartDate;
        private final String path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PageLoaded(String path, List<? extends DesignSystemModel> items, String str, String str2) {
            super(null);
            AbstractC22676k.m65750j(path, "path");
            AbstractC22676k.m65750j(items, "items");
            this.path = path;
            this.items = items;
            this.nextStartDate = str;
            this.analyticsActionFromApi = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PageLoaded copy$default(PageLoaded pageLoaded, String str, List list, String str2, String str3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = pageLoaded.path;
            }
            if ((i13 & 2) != 0) {
                list = pageLoaded.items;
            }
            if ((i13 & 4) != 0) {
                str2 = pageLoaded.nextStartDate;
            }
            if ((i13 & 8) != 0) {
                str3 = pageLoaded.analyticsActionFromApi;
            }
            return pageLoaded.copy(str, list, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public final List<DesignSystemModel> component2() {
            return this.items;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getNextStartDate() {
            return this.nextStartDate;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAnalyticsActionFromApi() {
            return this.analyticsActionFromApi;
        }

        public final PageLoaded copy(String path, List<? extends DesignSystemModel> items, String nextStartDate, String analyticsActionFromApi) {
            AbstractC22676k.m65750j(path, "path");
            AbstractC22676k.m65750j(items, "items");
            return new PageLoaded(path, items, nextStartDate, analyticsActionFromApi);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageLoaded)) {
                return false;
            }
            PageLoaded pageLoaded = (PageLoaded) other;
            return AbstractC22676k.m65745e(this.path, pageLoaded.path) && AbstractC22676k.m65745e(this.items, pageLoaded.items) && AbstractC22676k.m65745e(this.nextStartDate, pageLoaded.nextStartDate) && AbstractC22676k.m65745e(this.analyticsActionFromApi, pageLoaded.analyticsActionFromApi);
        }

        public final String getAnalyticsActionFromApi() {
            return this.analyticsActionFromApi;
        }

        public final List<DesignSystemModel> getItems() {
            return this.items;
        }

        public final String getNextStartDate() {
            return this.nextStartDate;
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b(this.path.hashCode() * 31, 31, this.items);
            String str = this.nextStartDate;
            int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.analyticsActionFromApi;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.path;
            List<DesignSystemModel> list = this.items;
            return AbstractC11266d.m30464r(AbstractC30802r.m94766o("PageLoaded(path=", str, ", items=", ", nextStartDate=", list), this.nextStartDate, ", analyticsActionFromApi=", this.analyticsActionFromApi, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$RequestFailedError;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction;", "path", "", "<init>", "(Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class RequestFailedError extends ExerciseRecordsInternalAction {
        public static final int $stable = 0;
        private final String path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestFailedError(String path) {
            super(null);
            AbstractC22676k.m65750j(path, "path");
            this.path = path;
        }

        public static /* synthetic */ RequestFailedError copy$default(RequestFailedError requestFailedError, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = requestFailedError.path;
            }
            return requestFailedError.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public final RequestFailedError copy(String path) {
            AbstractC22676k.m65750j(path, "path");
            return new RequestFailedError(path);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RequestFailedError) && AbstractC22676k.m65745e(this.path, ((RequestFailedError) other).path);
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.path.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("RequestFailedError(path=", this.path, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$SkipPagination;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class SkipPagination extends ExerciseRecordsInternalAction {
        public static final int $stable = 0;
        public static final SkipPagination INSTANCE = new SkipPagination();

        private SkipPagination() {
            super(null);
        }
    }

    public /* synthetic */ ExerciseRecordsInternalAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ExerciseRecordsInternalAction() {
    }
}
