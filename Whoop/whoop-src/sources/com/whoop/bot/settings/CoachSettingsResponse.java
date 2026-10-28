package com.whoop.bot.settings;

import java.util.List;
import m83.C25271y;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsResponse;", "", "title", "", "settings", "", "Lcom/whoop/bot/settings/CoachSettingItem;", "footer", "Lcom/whoop/bot/settings/CoachSettingsFooter;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/bot/settings/CoachSettingsFooter;)V", "getTitle", "()Ljava/lang/String;", "getSettings", "()Ljava/util/List;", "getFooter", "()Lcom/whoop/bot/settings/CoachSettingsFooter;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class CoachSettingsResponse {
    public static final int $stable = 8;
    private final CoachSettingsFooter footer;
    private final List<CoachSettingItem> settings;
    private final String title;

    public CoachSettingsResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoachSettingsResponse copy$default(CoachSettingsResponse coachSettingsResponse, String str, List list, CoachSettingsFooter coachSettingsFooter, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = coachSettingsResponse.title;
        }
        if ((i13 & 2) != 0) {
            list = coachSettingsResponse.settings;
        }
        if ((i13 & 4) != 0) {
            coachSettingsFooter = coachSettingsResponse.footer;
        }
        return coachSettingsResponse.copy(str, list, coachSettingsFooter);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<CoachSettingItem> component2() {
        return this.settings;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CoachSettingsFooter getFooter() {
        return this.footer;
    }

    public final CoachSettingsResponse copy(String title, List<CoachSettingItem> settings, CoachSettingsFooter footer) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(settings, "settings");
        AbstractC22676k.m65750j(footer, "footer");
        return new CoachSettingsResponse(title, settings, footer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoachSettingsResponse)) {
            return false;
        }
        CoachSettingsResponse coachSettingsResponse = (CoachSettingsResponse) other;
        return AbstractC22676k.m65745e(this.title, coachSettingsResponse.title) && AbstractC22676k.m65745e(this.settings, coachSettingsResponse.settings) && AbstractC22676k.m65745e(this.footer, coachSettingsResponse.footer);
    }

    public final CoachSettingsFooter getFooter() {
        return this.footer;
    }

    public final List<CoachSettingItem> getSettings() {
        return this.settings;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.footer.hashCode() + AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.settings);
    }

    public String toString() {
        String str = this.title;
        List<CoachSettingItem> list = this.settings;
        CoachSettingsFooter coachSettingsFooter = this.footer;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("CoachSettingsResponse(title=", str, ", settings=", ", footer=", list);
        sbM94766o.append(coachSettingsFooter);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public CoachSettingsResponse(String title, List<CoachSettingItem> settings, CoachSettingsFooter footer) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(settings, "settings");
        AbstractC22676k.m65750j(footer, "footer");
        this.title = title;
        this.settings = settings;
        this.footer = footer;
    }

    public /* synthetic */ CoachSettingsResponse(String str, List list, CoachSettingsFooter coachSettingsFooter, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "WHOOP COACH" : str, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? new CoachSettingsFooter(null, null, null, null, null, 31, null) : coachSettingsFooter);
    }
}
