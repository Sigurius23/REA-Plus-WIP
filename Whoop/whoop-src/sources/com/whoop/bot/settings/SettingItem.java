package com.whoop.bot.settings;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import jh3.AbstractC21702c;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\nHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m65681d2 = {"Lcom/whoop/bot/settings/SettingItem;", "", "title", "Lcom/whoop/design/util/TextResource;", "betaTag", "body", "enabled", "", "checked", "settingKey", "", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;)V", "getTitle", "()Lcom/whoop/design/util/TextResource;", "getBetaTag", "getBody", "getEnabled", "()Z", "getChecked", "getSettingKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class SettingItem {
    public static final int $stable = TextResource.$stable;
    private final TextResource betaTag;
    private final TextResource body;
    private final boolean checked;
    private final boolean enabled;
    private final String settingKey;
    private final TextResource title;

    public SettingItem() {
        this(null, null, null, false, false, null, 63, null);
    }

    public static /* synthetic */ SettingItem copy$default(SettingItem settingItem, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, boolean z13, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = settingItem.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = settingItem.betaTag;
        }
        if ((i13 & 4) != 0) {
            textResource3 = settingItem.body;
        }
        if ((i13 & 8) != 0) {
            z4 = settingItem.enabled;
        }
        if ((i13 & 16) != 0) {
            z13 = settingItem.checked;
        }
        if ((i13 & 32) != 0) {
            str = settingItem.settingKey;
        }
        boolean z14 = z13;
        String str2 = str;
        return settingItem.copy(textResource, textResource2, textResource3, z4, z14, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getBetaTag() {
        return this.betaTag;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSettingKey() {
        return this.settingKey;
    }

    public final SettingItem copy(TextResource title, TextResource betaTag, TextResource body, boolean enabled, boolean checked, String settingKey) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(settingKey, "settingKey");
        return new SettingItem(title, betaTag, body, enabled, checked, settingKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingItem)) {
            return false;
        }
        SettingItem settingItem = (SettingItem) other;
        return AbstractC22676k.m65745e(this.title, settingItem.title) && AbstractC22676k.m65745e(this.betaTag, settingItem.betaTag) && AbstractC22676k.m65745e(this.body, settingItem.body) && this.enabled == settingItem.enabled && this.checked == settingItem.checked && AbstractC22676k.m65745e(this.settingKey, settingItem.settingKey);
    }

    public final TextResource getBetaTag() {
        return this.betaTag;
    }

    public final TextResource getBody() {
        return this.body;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getSettingKey() {
        return this.settingKey;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        TextResource textResource = this.betaTag;
        return this.settingKey.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC31061c.m95625a((iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31, this.body, 31), 31, this.enabled), 31, this.checked);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.betaTag;
        TextResource textResource3 = this.body;
        boolean z4 = this.enabled;
        boolean z13 = this.checked;
        String str = this.settingKey;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("SettingItem(title=", textResource, ", betaTag=", textResource2, ", body=");
        AbstractC33745d.m106664w(textResource3, ", enabled=", ", checked=", sbM106658q, z4);
        return AbstractC21702c.m61139j(sbM106658q, z13, ", settingKey=", str, ")");
    }

    public SettingItem(TextResource title, TextResource textResource, TextResource body, boolean z4, boolean z13, String settingKey) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(settingKey, "settingKey");
        this.title = title;
        this.betaTag = textResource;
        this.body = body;
        this.enabled = z4;
        this.checked = z13;
        this.settingKey = settingKey;
    }

    public /* synthetic */ SettingItem(TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, boolean z13, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? null : textResource2, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 8) != 0 ? true : z4, (i13 & 16) != 0 ? true : z13, (i13 & 32) != 0 ? "" : str);
    }
}
