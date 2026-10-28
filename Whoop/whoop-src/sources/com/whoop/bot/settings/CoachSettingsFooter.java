package com.whoop.bot.settings;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsFooter;", "", "title", "", "body", "ctaTitle", "ctaIcon", "ctaUrlLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getBody", "getCtaTitle", "getCtaIcon", "getCtaUrlLink", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class CoachSettingsFooter {
    public static final int $stable = 0;
    private final String body;
    private final String ctaIcon;
    private final String ctaTitle;
    private final String ctaUrlLink;
    private final String title;

    public CoachSettingsFooter() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ CoachSettingsFooter copy$default(CoachSettingsFooter coachSettingsFooter, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = coachSettingsFooter.title;
        }
        if ((i13 & 2) != 0) {
            str2 = coachSettingsFooter.body;
        }
        if ((i13 & 4) != 0) {
            str3 = coachSettingsFooter.ctaTitle;
        }
        if ((i13 & 8) != 0) {
            str4 = coachSettingsFooter.ctaIcon;
        }
        if ((i13 & 16) != 0) {
            str5 = coachSettingsFooter.ctaUrlLink;
        }
        String str6 = str5;
        String str7 = str3;
        return coachSettingsFooter.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCtaIcon() {
        return this.ctaIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCtaUrlLink() {
        return this.ctaUrlLink;
    }

    public final CoachSettingsFooter copy(String title, String body, String ctaTitle, String ctaIcon, String ctaUrlLink) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(ctaTitle, "ctaTitle");
        AbstractC22676k.m65750j(ctaIcon, "ctaIcon");
        AbstractC22676k.m65750j(ctaUrlLink, "ctaUrlLink");
        return new CoachSettingsFooter(title, body, ctaTitle, ctaIcon, ctaUrlLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoachSettingsFooter)) {
            return false;
        }
        CoachSettingsFooter coachSettingsFooter = (CoachSettingsFooter) other;
        return AbstractC22676k.m65745e(this.title, coachSettingsFooter.title) && AbstractC22676k.m65745e(this.body, coachSettingsFooter.body) && AbstractC22676k.m65745e(this.ctaTitle, coachSettingsFooter.ctaTitle) && AbstractC22676k.m65745e(this.ctaIcon, coachSettingsFooter.ctaIcon) && AbstractC22676k.m65745e(this.ctaUrlLink, coachSettingsFooter.ctaUrlLink);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCtaIcon() {
        return this.ctaIcon;
    }

    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    public final String getCtaUrlLink() {
        return this.ctaUrlLink;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.ctaUrlLink.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.body), 31, this.ctaTitle), 31, this.ctaIcon);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.body;
        String str3 = this.ctaTitle;
        String str4 = this.ctaIcon;
        String str5 = this.ctaUrlLink;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CoachSettingsFooter(title=", str, ", body=", str2, ", ctaTitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", ctaIcon=", str4, ", ctaUrlLink=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }

    public CoachSettingsFooter(String title, String body, String ctaTitle, String ctaIcon, String ctaUrlLink) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(ctaTitle, "ctaTitle");
        AbstractC22676k.m65750j(ctaIcon, "ctaIcon");
        AbstractC22676k.m65750j(ctaUrlLink, "ctaUrlLink");
        this.title = title;
        this.body = body;
        this.ctaTitle = ctaTitle;
        this.ctaIcon = ctaIcon;
        this.ctaUrlLink = ctaUrlLink;
    }

    public /* synthetic */ CoachSettingsFooter(String str, String str2, String str3, String str4, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? "" : str5);
    }
}
