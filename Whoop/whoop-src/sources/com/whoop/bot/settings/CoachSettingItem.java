package com.whoop.bot.settings;

import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingItem;", "", "title", "", "tag", "body", "disabled", "", "settingKey", "active", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getTag", "getBody", "getDisabled", "()Z", "getSettingKey", "getActive", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class CoachSettingItem {
    public static final int $stable = 0;
    private final boolean active;
    private final String body;
    private final boolean disabled;
    private final String settingKey;
    private final String tag;
    private final String title;

    public CoachSettingItem() {
        this(null, null, null, false, null, false, 63, null);
    }

    public static /* synthetic */ CoachSettingItem copy$default(CoachSettingItem coachSettingItem, String str, String str2, String str3, boolean z4, String str4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = coachSettingItem.title;
        }
        if ((i13 & 2) != 0) {
            str2 = coachSettingItem.tag;
        }
        if ((i13 & 4) != 0) {
            str3 = coachSettingItem.body;
        }
        if ((i13 & 8) != 0) {
            z4 = coachSettingItem.disabled;
        }
        if ((i13 & 16) != 0) {
            str4 = coachSettingItem.settingKey;
        }
        if ((i13 & 32) != 0) {
            z13 = coachSettingItem.active;
        }
        String str5 = str4;
        boolean z14 = z13;
        return coachSettingItem.copy(str, str2, str3, z4, str5, z14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSettingKey() {
        return this.settingKey;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    public final CoachSettingItem copy(String title, String tag, String body, boolean disabled, String settingKey, boolean active) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(settingKey, "settingKey");
        return new CoachSettingItem(title, tag, body, disabled, settingKey, active);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoachSettingItem)) {
            return false;
        }
        CoachSettingItem coachSettingItem = (CoachSettingItem) other;
        return AbstractC22676k.m65745e(this.title, coachSettingItem.title) && AbstractC22676k.m65745e(this.tag, coachSettingItem.tag) && AbstractC22676k.m65745e(this.body, coachSettingItem.body) && this.disabled == coachSettingItem.disabled && AbstractC22676k.m65745e(this.settingKey, coachSettingItem.settingKey) && this.active == coachSettingItem.active;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getBody() {
        return this.body;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final String getSettingKey() {
        return this.settingKey;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.tag;
        return Boolean.hashCode(this.active) + AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.body), 31, this.disabled), 31, this.settingKey);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.tag;
        String str3 = this.body;
        boolean z4 = this.disabled;
        String str4 = this.settingKey;
        boolean z13 = this.active;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CoachSettingItem(title=", str, ", tag=", str2, ", body=");
        AbstractC38963t7.m124390t(sbM32001t, str3, ", disabled=", z4, ", settingKey=");
        return AbstractC21702c.m61137h(sbM32001t, str4, ", active=", z13, ")");
    }

    public CoachSettingItem(String title, String str, String body, boolean z4, String settingKey, boolean z13) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(settingKey, "settingKey");
        this.title = title;
        this.tag = str;
        this.body = body;
        this.disabled = z4;
        this.settingKey = settingKey;
        this.active = z13;
    }

    public /* synthetic */ CoachSettingItem(String str, String str2, String str3, boolean z4, String str4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? "" : str4, (i13 & 32) != 0 ? true : z13);
    }
}
