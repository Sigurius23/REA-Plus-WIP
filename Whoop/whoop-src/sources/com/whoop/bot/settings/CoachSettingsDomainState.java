package com.whoop.bot.settings;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y82.EnumC39339b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsDomainState;", "", "<init>", "()V", "Loading", "Saving", "Saved", "Error", EnumC39339b.RESULT_SUCCESS, "Lcom/whoop/bot/settings/CoachSettingsDomainState$Error;", "Lcom/whoop/bot/settings/CoachSettingsDomainState$Loading;", "Lcom/whoop/bot/settings/CoachSettingsDomainState$Saved;", "Lcom/whoop/bot/settings/CoachSettingsDomainState$Saving;", "Lcom/whoop/bot/settings/CoachSettingsDomainState$Success;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class CoachSettingsDomainState {
    public static final int $stable = 0;

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsDomainState$Error;", "Lcom/whoop/bot/settings/CoachSettingsDomainState;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Error extends CoachSettingsDomainState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsDomainState$Loading;", "Lcom/whoop/bot/settings/CoachSettingsDomainState;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Loading extends CoachSettingsDomainState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsDomainState$Saved;", "Lcom/whoop/bot/settings/CoachSettingsDomainState;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Saved extends CoachSettingsDomainState {
        public static final int $stable = 0;
        public static final Saved INSTANCE = new Saved();

        private Saved() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsDomainState$Saving;", "Lcom/whoop/bot/settings/CoachSettingsDomainState;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Saving extends CoachSettingsDomainState {
        public static final int $stable = 0;
        public static final Saving INSTANCE = new Saving();

        private Saving() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsDomainState$Success;", "Lcom/whoop/bot/settings/CoachSettingsDomainState;", "response", "Lcom/whoop/bot/settings/CoachSettingsResponse;", "<init>", "(Lcom/whoop/bot/settings/CoachSettingsResponse;)V", "getResponse", "()Lcom/whoop/bot/settings/CoachSettingsResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class Success extends CoachSettingsDomainState {
        public static final int $stable = 8;
        private final CoachSettingsResponse response;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(CoachSettingsResponse response) {
            super(null);
            AbstractC22676k.m65750j(response, "response");
            this.response = response;
        }

        public static /* synthetic */ Success copy$default(Success success, CoachSettingsResponse coachSettingsResponse, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                coachSettingsResponse = success.response;
            }
            return success.copy(coachSettingsResponse);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CoachSettingsResponse getResponse() {
            return this.response;
        }

        public final Success copy(CoachSettingsResponse response) {
            AbstractC22676k.m65750j(response, "response");
            return new Success(response);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && AbstractC22676k.m65745e(this.response, ((Success) other).response);
        }

        public final CoachSettingsResponse getResponse() {
            return this.response;
        }

        public int hashCode() {
            return this.response.hashCode();
        }

        public String toString() {
            return "Success(response=" + this.response + ")";
        }
    }

    public /* synthetic */ CoachSettingsDomainState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CoachSettingsDomainState() {
    }
}
