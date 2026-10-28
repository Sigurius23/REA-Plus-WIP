package com.whoop.bot.settings;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y82.EnumC39339b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsViewState;", "", "<init>", "()V", "Loading", "Saving", "Saved", "Error", EnumC39339b.RESULT_SUCCESS, "Lcom/whoop/bot/settings/CoachSettingsViewState$Error;", "Lcom/whoop/bot/settings/CoachSettingsViewState$Loading;", "Lcom/whoop/bot/settings/CoachSettingsViewState$Saved;", "Lcom/whoop/bot/settings/CoachSettingsViewState$Saving;", "Lcom/whoop/bot/settings/CoachSettingsViewState$Success;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class CoachSettingsViewState {
    public static final int $stable = 0;

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsViewState$Error;", "Lcom/whoop/bot/settings/CoachSettingsViewState;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Error extends CoachSettingsViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsViewState$Loading;", "Lcom/whoop/bot/settings/CoachSettingsViewState;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Loading extends CoachSettingsViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsViewState$Saved;", "Lcom/whoop/bot/settings/CoachSettingsViewState;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Saved extends CoachSettingsViewState {
        public static final int $stable = 0;
        public static final Saved INSTANCE = new Saved();

        private Saved() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsViewState$Saving;", "Lcom/whoop/bot/settings/CoachSettingsViewState;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Saving extends CoachSettingsViewState {
        public static final int $stable = 0;
        public static final Saving INSTANCE = new Saving();

        private Saving() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsViewState$Success;", "Lcom/whoop/bot/settings/CoachSettingsViewState;", "displayState", "Lcom/whoop/bot/settings/CoachSettingsDisplayState;", "coachingModeState", "Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;", "concisenessState", "Lcom/whoop/bot/settings/CoachSettingsConciseState;", "recommendedActivitiesState", "Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;", "<init>", "(Lcom/whoop/bot/settings/CoachSettingsDisplayState;Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;Lcom/whoop/bot/settings/CoachSettingsConciseState;Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;)V", "getDisplayState", "()Lcom/whoop/bot/settings/CoachSettingsDisplayState;", "getCoachingModeState", "()Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;", "getConcisenessState", "()Lcom/whoop/bot/settings/CoachSettingsConciseState;", "getRecommendedActivitiesState", "()Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class Success extends CoachSettingsViewState {
        public static final int $stable = 8;
        private final CoachSettingsCoachingModeState coachingModeState;
        private final CoachSettingsConciseState concisenessState;
        private final CoachSettingsDisplayState displayState;
        private final CoachSettingsRecommendedActivitiesState recommendedActivitiesState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(CoachSettingsDisplayState displayState, CoachSettingsCoachingModeState coachSettingsCoachingModeState, CoachSettingsConciseState coachSettingsConciseState, CoachSettingsRecommendedActivitiesState recommendedActivitiesState) {
            super(null);
            AbstractC22676k.m65750j(displayState, "displayState");
            AbstractC22676k.m65750j(recommendedActivitiesState, "recommendedActivitiesState");
            this.displayState = displayState;
            this.coachingModeState = coachSettingsCoachingModeState;
            this.concisenessState = coachSettingsConciseState;
            this.recommendedActivitiesState = recommendedActivitiesState;
        }

        public static /* synthetic */ Success copy$default(Success success, CoachSettingsDisplayState coachSettingsDisplayState, CoachSettingsCoachingModeState coachSettingsCoachingModeState, CoachSettingsConciseState coachSettingsConciseState, CoachSettingsRecommendedActivitiesState coachSettingsRecommendedActivitiesState, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                coachSettingsDisplayState = success.displayState;
            }
            if ((i13 & 2) != 0) {
                coachSettingsCoachingModeState = success.coachingModeState;
            }
            if ((i13 & 4) != 0) {
                coachSettingsConciseState = success.concisenessState;
            }
            if ((i13 & 8) != 0) {
                coachSettingsRecommendedActivitiesState = success.recommendedActivitiesState;
            }
            return success.copy(coachSettingsDisplayState, coachSettingsCoachingModeState, coachSettingsConciseState, coachSettingsRecommendedActivitiesState);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CoachSettingsDisplayState getDisplayState() {
            return this.displayState;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CoachSettingsCoachingModeState getCoachingModeState() {
            return this.coachingModeState;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final CoachSettingsConciseState getConcisenessState() {
            return this.concisenessState;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final CoachSettingsRecommendedActivitiesState getRecommendedActivitiesState() {
            return this.recommendedActivitiesState;
        }

        public final Success copy(CoachSettingsDisplayState displayState, CoachSettingsCoachingModeState coachingModeState, CoachSettingsConciseState concisenessState, CoachSettingsRecommendedActivitiesState recommendedActivitiesState) {
            AbstractC22676k.m65750j(displayState, "displayState");
            AbstractC22676k.m65750j(recommendedActivitiesState, "recommendedActivitiesState");
            return new Success(displayState, coachingModeState, concisenessState, recommendedActivitiesState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return AbstractC22676k.m65745e(this.displayState, success.displayState) && AbstractC22676k.m65745e(this.coachingModeState, success.coachingModeState) && AbstractC22676k.m65745e(this.concisenessState, success.concisenessState) && AbstractC22676k.m65745e(this.recommendedActivitiesState, success.recommendedActivitiesState);
        }

        public final CoachSettingsCoachingModeState getCoachingModeState() {
            return this.coachingModeState;
        }

        public final CoachSettingsConciseState getConcisenessState() {
            return this.concisenessState;
        }

        public final CoachSettingsDisplayState getDisplayState() {
            return this.displayState;
        }

        public final CoachSettingsRecommendedActivitiesState getRecommendedActivitiesState() {
            return this.recommendedActivitiesState;
        }

        public int hashCode() {
            int iHashCode = this.displayState.hashCode() * 31;
            CoachSettingsCoachingModeState coachSettingsCoachingModeState = this.coachingModeState;
            int iHashCode2 = (iHashCode + (coachSettingsCoachingModeState == null ? 0 : coachSettingsCoachingModeState.hashCode())) * 31;
            CoachSettingsConciseState coachSettingsConciseState = this.concisenessState;
            return this.recommendedActivitiesState.hashCode() + ((iHashCode2 + (coachSettingsConciseState != null ? coachSettingsConciseState.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "Success(displayState=" + this.displayState + ", coachingModeState=" + this.coachingModeState + ", concisenessState=" + this.concisenessState + ", recommendedActivitiesState=" + this.recommendedActivitiesState + ")";
        }
    }

    public /* synthetic */ CoachSettingsViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CoachSettingsViewState() {
    }
}
