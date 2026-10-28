package com.whoop.data.interactor;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/data/interactor/ExportedMetricsAction;", "", "<init>", "()V", "StartForcedSync", "Lcom/whoop/data/interactor/ExportedMetricsAction$StartForcedSync;", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class ExportedMetricsAction {
    public static final int $stable = 0;

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/data/interactor/ExportedMetricsAction$StartForcedSync;", "Lcom/whoop/data/interactor/ExportedMetricsAction;", "secondsToRetrieveBeforeNow", "", "<init>", "(I)V", "getSecondsToRetrieveBeforeNow", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class StartForcedSync extends ExportedMetricsAction {
        public static final int $stable = 0;
        private final int secondsToRetrieveBeforeNow;

        public StartForcedSync(int i13) {
            super(null);
            this.secondsToRetrieveBeforeNow = i13;
        }

        public static /* synthetic */ StartForcedSync copy$default(StartForcedSync startForcedSync, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i13 = startForcedSync.secondsToRetrieveBeforeNow;
            }
            return startForcedSync.copy(i13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getSecondsToRetrieveBeforeNow() {
            return this.secondsToRetrieveBeforeNow;
        }

        public final StartForcedSync copy(int secondsToRetrieveBeforeNow) {
            return new StartForcedSync(secondsToRetrieveBeforeNow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StartForcedSync) && this.secondsToRetrieveBeforeNow == ((StartForcedSync) other).secondsToRetrieveBeforeNow;
        }

        public final int getSecondsToRetrieveBeforeNow() {
            return this.secondsToRetrieveBeforeNow;
        }

        public int hashCode() {
            return Integer.hashCode(this.secondsToRetrieveBeforeNow);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.secondsToRetrieveBeforeNow, "StartForcedSync(secondsToRetrieveBeforeNow=", ")");
        }
    }

    public /* synthetic */ ExportedMetricsAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ExportedMetricsAction() {
    }
}
