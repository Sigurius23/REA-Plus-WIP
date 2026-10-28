package com.whoop.bot.settings;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import x81.C38072d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\tHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/bot/settings/SettingFooter;", "", "title", "Lcom/whoop/design/util/TextResource;", "body", "ctaTitle", "ctaIcon", "", "ctaUrl", "", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILjava/lang/String;)V", "getTitle", "()Lcom/whoop/design/util/TextResource;", "getBody", "getCtaTitle", "getCtaIcon", "()I", "getCtaUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class SettingFooter {
    public static final int $stable = TextResource.$stable;
    private final TextResource body;
    private final int ctaIcon;
    private final TextResource ctaTitle;
    private final String ctaUrl;
    private final TextResource title;

    public SettingFooter() {
        this(null, null, null, 0, null, 31, null);
    }

    public static /* synthetic */ SettingFooter copy$default(SettingFooter settingFooter, TextResource textResource, TextResource textResource2, TextResource textResource3, int i13, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            textResource = settingFooter.title;
        }
        if ((i14 & 2) != 0) {
            textResource2 = settingFooter.body;
        }
        if ((i14 & 4) != 0) {
            textResource3 = settingFooter.ctaTitle;
        }
        if ((i14 & 8) != 0) {
            i13 = settingFooter.ctaIcon;
        }
        if ((i14 & 16) != 0) {
            str = settingFooter.ctaUrl;
        }
        String str2 = str;
        TextResource textResource4 = textResource3;
        return settingFooter.copy(textResource, textResource2, textResource4, i13, str2);
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
    public final TextResource getCtaTitle() {
        return this.ctaTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCtaIcon() {
        return this.ctaIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCtaUrl() {
        return this.ctaUrl;
    }

    public final SettingFooter copy(TextResource title, TextResource body, TextResource ctaTitle, int ctaIcon, String ctaUrl) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(ctaTitle, "ctaTitle");
        AbstractC22676k.m65750j(ctaUrl, "ctaUrl");
        return new SettingFooter(title, body, ctaTitle, ctaIcon, ctaUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingFooter)) {
            return false;
        }
        SettingFooter settingFooter = (SettingFooter) other;
        return AbstractC22676k.m65745e(this.title, settingFooter.title) && AbstractC22676k.m65745e(this.body, settingFooter.body) && AbstractC22676k.m65745e(this.ctaTitle, settingFooter.ctaTitle) && this.ctaIcon == settingFooter.ctaIcon && AbstractC22676k.m65745e(this.ctaUrl, settingFooter.ctaUrl);
    }

    public final TextResource getBody() {
        return this.body;
    }

    public final int getCtaIcon() {
        return this.ctaIcon;
    }

    public final TextResource getCtaTitle() {
        return this.ctaTitle;
    }

    public final String getCtaUrl() {
        return this.ctaUrl;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.ctaUrl.hashCode() + AbstractC11266d.m30448b(this.ctaIcon, AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.body, 31), this.ctaTitle, 31), 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.body;
        TextResource textResource3 = this.ctaTitle;
        int i13 = this.ctaIcon;
        String str = this.ctaUrl;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("SettingFooter(title=", textResource, ", body=", textResource2, ", ctaTitle=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", ctaIcon=");
        sbM106658q.append(i13);
        sbM106658q.append(", ctaUrl=");
        return AbstractC25012a.m73376i(str, ")", sbM106658q);
    }

    public SettingFooter(TextResource title, TextResource body, TextResource ctaTitle, int i13, String ctaUrl) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(ctaTitle, "ctaTitle");
        AbstractC22676k.m65750j(ctaUrl, "ctaUrl");
        this.title = title;
        this.body = body;
        this.ctaTitle = ctaTitle;
        this.ctaIcon = i13;
        this.ctaUrl = ctaUrl;
    }

    public /* synthetic */ SettingFooter(TextResource textResource, TextResource textResource2, TextResource textResource3, int i13, String str, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i14 & 2) != 0 ? AbstractC8693b.m21267a() : textResource2, (i14 & 4) != 0 ? AbstractC8693b.m21267a() : textResource3, (i14 & 8) != 0 ? AbstractC18489d0.m53359E(C38072d.f163053a) : i13, (i14 & 16) != 0 ? "https://www.whoop.com" : str);
    }
}
