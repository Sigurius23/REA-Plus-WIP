package com.whoop.bot.settings;

import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y82.EnumC39339b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/bot/settings/InternalEvent;", "", "<init>", "()V", "Toggle", "Saving", "SavingSuccess", "DismissError", "Loading", "ToggleError", "LoadSettingsError", EnumC39339b.RESULT_SUCCESS, "Lcom/whoop/bot/settings/InternalEvent$DismissError;", "Lcom/whoop/bot/settings/InternalEvent$LoadSettingsError;", "Lcom/whoop/bot/settings/InternalEvent$Loading;", "Lcom/whoop/bot/settings/InternalEvent$Saving;", "Lcom/whoop/bot/settings/InternalEvent$SavingSuccess;", "Lcom/whoop/bot/settings/InternalEvent$Success;", "Lcom/whoop/bot/settings/InternalEvent$Toggle;", "Lcom/whoop/bot/settings/InternalEvent$ToggleError;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
abstract class InternalEvent {

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/bot/settings/InternalEvent$DismissError;", "Lcom/whoop/bot/settings/InternalEvent;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DismissError extends InternalEvent {
        public static final int $stable = 0;
        public static final DismissError INSTANCE = new DismissError();

        private DismissError() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/bot/settings/InternalEvent$LoadSettingsError;", "Lcom/whoop/bot/settings/InternalEvent;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class LoadSettingsError extends InternalEvent {
        public static final int $stable = 0;
        public static final LoadSettingsError INSTANCE = new LoadSettingsError();

        private LoadSettingsError() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/bot/settings/InternalEvent$Loading;", "Lcom/whoop/bot/settings/InternalEvent;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Loading extends InternalEvent {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/bot/settings/InternalEvent$Saving;", "Lcom/whoop/bot/settings/InternalEvent;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Saving extends InternalEvent {
        public static final int $stable = 0;
        public static final Saving INSTANCE = new Saving();

        private Saving() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/bot/settings/InternalEvent$SavingSuccess;", "Lcom/whoop/bot/settings/InternalEvent;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class SavingSuccess extends InternalEvent {
        public static final int $stable = 0;
        public static final SavingSuccess INSTANCE = new SavingSuccess();

        private SavingSuccess() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/bot/settings/InternalEvent$Success;", "Lcom/whoop/bot/settings/InternalEvent;", "response", "Lcom/whoop/bot/settings/CoachSettingsResponse;", "<init>", "(Lcom/whoop/bot/settings/CoachSettingsResponse;)V", "getResponse", "()Lcom/whoop/bot/settings/CoachSettingsResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class Success extends InternalEvent {
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

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/bot/settings/InternalEvent$Toggle;", "Lcom/whoop/bot/settings/InternalEvent;", "key", "", "enabled", "", "<init>", "(Ljava/lang/String;Z)V", "getKey", "()Ljava/lang/String;", "getEnabled", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class Toggle extends InternalEvent {
        public static final int $stable = 0;
        private final boolean enabled;
        private final String key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Toggle(String key, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(key, "key");
            this.key = key;
            this.enabled = z4;
        }

        public static /* synthetic */ Toggle copy$default(Toggle toggle, String str, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = toggle.key;
            }
            if ((i13 & 2) != 0) {
                z4 = toggle.enabled;
            }
            return toggle.copy(str, z4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public final Toggle copy(String key, boolean enabled) {
            AbstractC22676k.m65750j(key, "key");
            return new Toggle(key, enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Toggle)) {
                return false;
            }
            Toggle toggle = (Toggle) other;
            return AbstractC22676k.m65745e(this.key, toggle.key) && this.enabled == toggle.enabled;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final String getKey() {
            return this.key;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enabled) + (this.key.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("Toggle(key=", this.key, ", enabled=", ")", this.enabled);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/bot/settings/InternalEvent$ToggleError;", "Lcom/whoop/bot/settings/InternalEvent;", "<init>", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class ToggleError extends InternalEvent {
        public static final int $stable = 0;
        public static final ToggleError INSTANCE = new ToggleError();

        private ToggleError() {
            super(null);
        }
    }

    public /* synthetic */ InternalEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InternalEvent() {
    }
}
