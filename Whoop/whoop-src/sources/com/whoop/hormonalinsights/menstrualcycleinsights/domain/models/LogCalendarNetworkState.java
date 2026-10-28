package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import com.mapbox.common.HttpHeaders;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y82.EnumC39339b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;", "", "<init>", "()V", "Loading", "Error", "Saving", "SaveError", "SaveSuccess", EnumC39339b.RESULT_SUCCESS, "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Loading;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$SaveError;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$SaveSuccess;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Saving;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Success;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class LogCalendarNetworkState {
    public static final int $stable = 0;

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Error;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;", "error", "", HttpHeaders.DATE, "errorType", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;)V", "getError", "()Ljava/lang/String;", "getDate", "getErrorType", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarErrorType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class Error extends LogCalendarNetworkState {
        public static final int $stable = 0;
        private final String date;
        private final String error;
        private final LogCalendarErrorType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String error, String date, LogCalendarErrorType errorType) {
            super(null);
            AbstractC22676k.m65750j(error, "error");
            AbstractC22676k.m65750j(date, "date");
            AbstractC22676k.m65750j(errorType, "errorType");
            this.error = error;
            this.date = date;
            this.errorType = errorType;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, String str2, LogCalendarErrorType logCalendarErrorType, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = error.error;
            }
            if ((i13 & 2) != 0) {
                str2 = error.date;
            }
            if ((i13 & 4) != 0) {
                logCalendarErrorType = error.errorType;
            }
            return error.copy(str, str2, logCalendarErrorType);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final LogCalendarErrorType getErrorType() {
            return this.errorType;
        }

        public final Error copy(String error, String date, LogCalendarErrorType errorType) {
            AbstractC22676k.m65750j(error, "error");
            AbstractC22676k.m65750j(date, "date");
            AbstractC22676k.m65750j(errorType, "errorType");
            return new Error(error, date, errorType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return AbstractC22676k.m65745e(this.error, error.error) && AbstractC22676k.m65745e(this.date, error.date) && this.errorType == error.errorType;
        }

        public final String getDate() {
            return this.date;
        }

        public final String getError() {
            return this.error;
        }

        public final LogCalendarErrorType getErrorType() {
            return this.errorType;
        }

        public int hashCode() {
            return this.errorType.hashCode() + AbstractC11266d.m30450d(this.error.hashCode() * 31, 31, this.date);
        }

        public String toString() {
            String str = this.error;
            String str2 = this.date;
            LogCalendarErrorType logCalendarErrorType = this.errorType;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Error(error=", str, ", date=", str2, ", errorType=");
            sbM32001t.append(logCalendarErrorType);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        public /* synthetic */ Error(String str, String str2, LogCalendarErrorType logCalendarErrorType, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i13 & 4) != 0 ? LogCalendarErrorType.GENERIC_ERROR : logCalendarErrorType);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Loading;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Loading extends LogCalendarNetworkState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$SaveError;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class SaveError extends LogCalendarNetworkState {
        public static final int $stable = 0;
        public static final SaveError INSTANCE = new SaveError();

        private SaveError() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$SaveSuccess;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class SaveSuccess extends LogCalendarNetworkState {
        public static final int $stable = 0;
        public static final SaveSuccess INSTANCE = new SaveSuccess();

        private SaveSuccess() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Saving;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Saving extends LogCalendarNetworkState {
        public static final int $stable = 0;
        public static final Saving INSTANCE = new Saving();

        private Saving() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState$Success;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;", "model", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;", "<init>", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;)V", "getModel", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class Success extends LogCalendarNetworkState {
        public static final int $stable = 8;
        private final LogCalendarDomainModel model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(LogCalendarDomainModel model) {
            super(null);
            AbstractC22676k.m65750j(model, "model");
            this.model = model;
        }

        public static /* synthetic */ Success copy$default(Success success, LogCalendarDomainModel logCalendarDomainModel, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                logCalendarDomainModel = success.model;
            }
            return success.copy(logCalendarDomainModel);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final LogCalendarDomainModel getModel() {
            return this.model;
        }

        public final Success copy(LogCalendarDomainModel model) {
            AbstractC22676k.m65750j(model, "model");
            return new Success(model);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && AbstractC22676k.m65745e(this.model, ((Success) other).model);
        }

        public final LogCalendarDomainModel getModel() {
            return this.model;
        }

        public int hashCode() {
            return this.model.hashCode();
        }

        public String toString() {
            return "Success(model=" + this.model + ")";
        }
    }

    public /* synthetic */ LogCalendarNetworkState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LogCalendarNetworkState() {
    }
}
