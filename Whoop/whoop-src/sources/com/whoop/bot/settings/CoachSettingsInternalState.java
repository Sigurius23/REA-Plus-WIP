package com.whoop.bot.settings;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsInternalState;", "", "state", "Lcom/whoop/bot/settings/CoachSettingsDomainState;", "response", "Lcom/whoop/bot/settings/CoachSettingsResponse;", "lastToggle", "Lcom/whoop/bot/settings/InternalEvent$Toggle;", "<init>", "(Lcom/whoop/bot/settings/CoachSettingsDomainState;Lcom/whoop/bot/settings/CoachSettingsResponse;Lcom/whoop/bot/settings/InternalEvent$Toggle;)V", "getState", "()Lcom/whoop/bot/settings/CoachSettingsDomainState;", "getResponse", "()Lcom/whoop/bot/settings/CoachSettingsResponse;", "getLastToggle", "()Lcom/whoop/bot/settings/InternalEvent$Toggle;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class CoachSettingsInternalState {
    private final InternalEvent.Toggle lastToggle;
    private final CoachSettingsResponse response;
    private final CoachSettingsDomainState state;

    public CoachSettingsInternalState(CoachSettingsDomainState state, CoachSettingsResponse response, InternalEvent.Toggle toggle) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(response, "response");
        this.state = state;
        this.response = response;
        this.lastToggle = toggle;
    }

    public static /* synthetic */ CoachSettingsInternalState copy$default(CoachSettingsInternalState coachSettingsInternalState, CoachSettingsDomainState coachSettingsDomainState, CoachSettingsResponse coachSettingsResponse, InternalEvent.Toggle toggle, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            coachSettingsDomainState = coachSettingsInternalState.state;
        }
        if ((i13 & 2) != 0) {
            coachSettingsResponse = coachSettingsInternalState.response;
        }
        if ((i13 & 4) != 0) {
            toggle = coachSettingsInternalState.lastToggle;
        }
        return coachSettingsInternalState.copy(coachSettingsDomainState, coachSettingsResponse, toggle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CoachSettingsDomainState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CoachSettingsResponse getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final InternalEvent.Toggle getLastToggle() {
        return this.lastToggle;
    }

    public final CoachSettingsInternalState copy(CoachSettingsDomainState state, CoachSettingsResponse response, InternalEvent.Toggle lastToggle) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(response, "response");
        return new CoachSettingsInternalState(state, response, lastToggle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoachSettingsInternalState)) {
            return false;
        }
        CoachSettingsInternalState coachSettingsInternalState = (CoachSettingsInternalState) other;
        return AbstractC22676k.m65745e(this.state, coachSettingsInternalState.state) && AbstractC22676k.m65745e(this.response, coachSettingsInternalState.response) && AbstractC22676k.m65745e(this.lastToggle, coachSettingsInternalState.lastToggle);
    }

    public final InternalEvent.Toggle getLastToggle() {
        return this.lastToggle;
    }

    public final CoachSettingsResponse getResponse() {
        return this.response;
    }

    public final CoachSettingsDomainState getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = (this.response.hashCode() + (this.state.hashCode() * 31)) * 31;
        InternalEvent.Toggle toggle = this.lastToggle;
        return iHashCode + (toggle == null ? 0 : toggle.hashCode());
    }

    public String toString() {
        return "CoachSettingsInternalState(state=" + this.state + ", response=" + this.response + ", lastToggle=" + this.lastToggle + ")";
    }

    public /* synthetic */ CoachSettingsInternalState(CoachSettingsDomainState coachSettingsDomainState, CoachSettingsResponse coachSettingsResponse, InternalEvent.Toggle toggle, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(coachSettingsDomainState, coachSettingsResponse, (i13 & 4) != 0 ? null : toggle);
    }
}
