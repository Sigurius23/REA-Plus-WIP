package com.whoop.bot.settings;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.List;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsDisplayState;", "", "title", "Lcom/whoop/design/util/TextResource;", "settingItems", "", "Lcom/whoop/bot/settings/SettingItem;", "footer", "Lcom/whoop/bot/settings/SettingFooter;", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/bot/settings/SettingFooter;)V", "getTitle", "()Lcom/whoop/design/util/TextResource;", "getSettingItems", "()Ljava/util/List;", "getFooter", "()Lcom/whoop/bot/settings/SettingFooter;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class CoachSettingsDisplayState {
    public static final int $stable = 8;
    private final SettingFooter footer;
    private final List<SettingItem> settingItems;
    private final TextResource title;

    public CoachSettingsDisplayState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoachSettingsDisplayState copy$default(CoachSettingsDisplayState coachSettingsDisplayState, TextResource textResource, List list, SettingFooter settingFooter, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = coachSettingsDisplayState.title;
        }
        if ((i13 & 2) != 0) {
            list = coachSettingsDisplayState.settingItems;
        }
        if ((i13 & 4) != 0) {
            settingFooter = coachSettingsDisplayState.footer;
        }
        return coachSettingsDisplayState.copy(textResource, list, settingFooter);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public final List<SettingItem> component2() {
        return this.settingItems;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SettingFooter getFooter() {
        return this.footer;
    }

    public final CoachSettingsDisplayState copy(TextResource title, List<SettingItem> settingItems, SettingFooter footer) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(settingItems, "settingItems");
        AbstractC22676k.m65750j(footer, "footer");
        return new CoachSettingsDisplayState(title, settingItems, footer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoachSettingsDisplayState)) {
            return false;
        }
        CoachSettingsDisplayState coachSettingsDisplayState = (CoachSettingsDisplayState) other;
        return AbstractC22676k.m65745e(this.title, coachSettingsDisplayState.title) && AbstractC22676k.m65745e(this.settingItems, coachSettingsDisplayState.settingItems) && AbstractC22676k.m65745e(this.footer, coachSettingsDisplayState.footer);
    }

    public final SettingFooter getFooter() {
        return this.footer;
    }

    public final List<SettingItem> getSettingItems() {
        return this.settingItems;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.footer.hashCode() + AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.settingItems);
    }

    public String toString() {
        TextResource textResource = this.title;
        List<SettingItem> list = this.settingItems;
        SettingFooter settingFooter = this.footer;
        StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "CoachSettingsDisplayState(title=", ", settingItems=", ", footer=", list);
        sbM106657p.append(settingFooter);
        sbM106657p.append(")");
        return sbM106657p.toString();
    }

    public CoachSettingsDisplayState(TextResource title, List<SettingItem> settingItems, SettingFooter footer) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(settingItems, "settingItems");
        AbstractC22676k.m65750j(footer, "footer");
        this.title = title;
        this.settingItems = settingItems;
        this.footer = footer;
    }

    public /* synthetic */ CoachSettingsDisplayState(TextResource textResource, List list, SettingFooter settingFooter, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? new SettingFooter(null, null, null, 0, null, 31, null) : settingFooter);
    }
}
