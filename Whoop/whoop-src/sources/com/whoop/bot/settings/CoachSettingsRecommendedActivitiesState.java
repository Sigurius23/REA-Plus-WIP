package com.whoop.bot.settings;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0014\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\nHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;", "", "title", "Lcom/whoop/design/util/TextResource;", "body", "selectedState", "Lcom/whoop/bot/settings/RecommendedActivitiesMode;", "enabled", "", "key", "", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/bot/settings/RecommendedActivitiesMode;ZLjava/lang/String;)V", "getTitle", "()Lcom/whoop/design/util/TextResource;", "getBody", "getSelectedState", "()Lcom/whoop/bot/settings/RecommendedActivitiesMode;", "getEnabled", "()Z", "getKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class CoachSettingsRecommendedActivitiesState {
    public static final int $stable = TextResource.$stable;
    private final TextResource body;
    private final boolean enabled;
    private final String key;
    private final RecommendedActivitiesMode selectedState;
    private final TextResource title;

    public CoachSettingsRecommendedActivitiesState() {
        this(null, null, null, false, null, 31, null);
    }

    public static /* synthetic */ CoachSettingsRecommendedActivitiesState copy$default(CoachSettingsRecommendedActivitiesState coachSettingsRecommendedActivitiesState, TextResource textResource, TextResource textResource2, RecommendedActivitiesMode recommendedActivitiesMode, boolean z4, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = coachSettingsRecommendedActivitiesState.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = coachSettingsRecommendedActivitiesState.body;
        }
        if ((i13 & 4) != 0) {
            recommendedActivitiesMode = coachSettingsRecommendedActivitiesState.selectedState;
        }
        if ((i13 & 8) != 0) {
            z4 = coachSettingsRecommendedActivitiesState.enabled;
        }
        if ((i13 & 16) != 0) {
            str = coachSettingsRecommendedActivitiesState.key;
        }
        String str2 = str;
        RecommendedActivitiesMode recommendedActivitiesMode2 = recommendedActivitiesMode;
        return coachSettingsRecommendedActivitiesState.copy(textResource, textResource2, recommendedActivitiesMode2, z4, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RecommendedActivitiesMode getSelectedState() {
        return this.selectedState;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    public final CoachSettingsRecommendedActivitiesState copy(TextResource title, TextResource body, RecommendedActivitiesMode selectedState, boolean enabled, String key) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(selectedState, "selectedState");
        AbstractC22676k.m65750j(key, "key");
        return new CoachSettingsRecommendedActivitiesState(title, body, selectedState, enabled, key);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoachSettingsRecommendedActivitiesState)) {
            return false;
        }
        CoachSettingsRecommendedActivitiesState coachSettingsRecommendedActivitiesState = (CoachSettingsRecommendedActivitiesState) other;
        return AbstractC22676k.m65745e(this.title, coachSettingsRecommendedActivitiesState.title) && AbstractC22676k.m65745e(this.body, coachSettingsRecommendedActivitiesState.body) && this.selectedState == coachSettingsRecommendedActivitiesState.selectedState && this.enabled == coachSettingsRecommendedActivitiesState.enabled && AbstractC22676k.m65745e(this.key, coachSettingsRecommendedActivitiesState.key);
    }

    public final TextResource getBody() {
        return this.body;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getKey() {
        return this.key;
    }

    public final RecommendedActivitiesMode getSelectedState() {
        return this.selectedState;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.key.hashCode() + AbstractC2875y.m8289b((this.selectedState.hashCode() + AbstractC31061c.m95625a(this.title.hashCode() * 31, this.body, 31)) * 31, 31, this.enabled);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.body;
        RecommendedActivitiesMode recommendedActivitiesMode = this.selectedState;
        boolean z4 = this.enabled;
        String str = this.key;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("CoachSettingsRecommendedActivitiesState(title=", textResource, ", body=", textResource2, ", selectedState=");
        sbM106658q.append(recommendedActivitiesMode);
        sbM106658q.append(", enabled=");
        sbM106658q.append(z4);
        sbM106658q.append(", key=");
        return AbstractC25012a.m73376i(str, ")", sbM106658q);
    }

    public CoachSettingsRecommendedActivitiesState(TextResource title, TextResource body, RecommendedActivitiesMode selectedState, boolean z4, String key) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(selectedState, "selectedState");
        AbstractC22676k.m65750j(key, "key");
        this.title = title;
        this.body = body;
        this.selectedState = selectedState;
        this.enabled = z4;
        this.key = key;
    }

    public /* synthetic */ CoachSettingsRecommendedActivitiesState(TextResource textResource, TextResource textResource2, RecommendedActivitiesMode recommendedActivitiesMode, boolean z4, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 4) != 0 ? RecommendedActivitiesMode.ON : recommendedActivitiesMode, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? "" : str);
    }
}
