package com.whoop.bot.settings;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;", "", "title", "Lcom/whoop/design/util/TextResource;", "selectedState", "Lcom/whoop/bot/settings/CoachingMode;", "enabled", "", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/bot/settings/CoachingMode;Z)V", "getTitle", "()Lcom/whoop/design/util/TextResource;", "getSelectedState", "()Lcom/whoop/bot/settings/CoachingMode;", "getEnabled", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class CoachSettingsCoachingModeState {
    public static final int $stable = TextResource.$stable;
    private final boolean enabled;
    private final CoachingMode selectedState;
    private final TextResource title;

    public CoachSettingsCoachingModeState() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ CoachSettingsCoachingModeState copy$default(CoachSettingsCoachingModeState coachSettingsCoachingModeState, TextResource textResource, CoachingMode coachingMode, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = coachSettingsCoachingModeState.title;
        }
        if ((i13 & 2) != 0) {
            coachingMode = coachSettingsCoachingModeState.selectedState;
        }
        if ((i13 & 4) != 0) {
            z4 = coachSettingsCoachingModeState.enabled;
        }
        return coachSettingsCoachingModeState.copy(textResource, coachingMode, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CoachingMode getSelectedState() {
        return this.selectedState;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final CoachSettingsCoachingModeState copy(TextResource title, CoachingMode selectedState, boolean enabled) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(selectedState, "selectedState");
        return new CoachSettingsCoachingModeState(title, selectedState, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoachSettingsCoachingModeState)) {
            return false;
        }
        CoachSettingsCoachingModeState coachSettingsCoachingModeState = (CoachSettingsCoachingModeState) other;
        return AbstractC22676k.m65745e(this.title, coachSettingsCoachingModeState.title) && this.selectedState == coachSettingsCoachingModeState.selectedState && this.enabled == coachSettingsCoachingModeState.enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final CoachingMode getSelectedState() {
        return this.selectedState;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enabled) + ((this.selectedState.hashCode() + (this.title.hashCode() * 31)) * 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        CoachingMode coachingMode = this.selectedState;
        boolean z4 = this.enabled;
        StringBuilder sb4 = new StringBuilder("CoachSettingsCoachingModeState(title=");
        sb4.append(textResource);
        sb4.append(", selectedState=");
        sb4.append(coachingMode);
        sb4.append(", enabled=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public CoachSettingsCoachingModeState(TextResource title, CoachingMode selectedState, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(selectedState, "selectedState");
        this.title = title;
        this.selectedState = selectedState;
        this.enabled = z4;
    }

    public /* synthetic */ CoachSettingsCoachingModeState(TextResource textResource, CoachingMode coachingMode, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? CoachingMode.EDUCATION : coachingMode, (i13 & 4) != 0 ? false : z4);
    }
}
