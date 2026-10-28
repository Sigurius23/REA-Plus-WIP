package com.whoop.bot.settings;

import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsRequest;", "", "settingKey", "", "active", "", "<init>", "(Ljava/lang/String;Z)V", "getSettingKey", "()Ljava/lang/String;", "getActive", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class CoachSettingsRequest {
    public static final int $stable = 0;
    private final boolean active;
    private final String settingKey;

    /* JADX WARN: Multi-variable type inference failed */
    public CoachSettingsRequest() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CoachSettingsRequest copy$default(CoachSettingsRequest coachSettingsRequest, String str, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = coachSettingsRequest.settingKey;
        }
        if ((i13 & 2) != 0) {
            z4 = coachSettingsRequest.active;
        }
        return coachSettingsRequest.copy(str, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSettingKey() {
        return this.settingKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    public final CoachSettingsRequest copy(String settingKey, boolean active) {
        AbstractC22676k.m65750j(settingKey, "settingKey");
        return new CoachSettingsRequest(settingKey, active);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoachSettingsRequest)) {
            return false;
        }
        CoachSettingsRequest coachSettingsRequest = (CoachSettingsRequest) other;
        return AbstractC22676k.m65745e(this.settingKey, coachSettingsRequest.settingKey) && this.active == coachSettingsRequest.active;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getSettingKey() {
        return this.settingKey;
    }

    public int hashCode() {
        return Boolean.hashCode(this.active) + (this.settingKey.hashCode() * 31);
    }

    public String toString() {
        return AbstractC26725a.m79503g("CoachSettingsRequest(settingKey=", this.settingKey, ", active=", ")", this.active);
    }

    public CoachSettingsRequest(String settingKey, boolean z4) {
        AbstractC22676k.m65750j(settingKey, "settingKey");
        this.settingKey = settingKey;
        this.active = z4;
    }

    public /* synthetic */ CoachSettingsRequest(String str, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? false : z4);
    }
}
