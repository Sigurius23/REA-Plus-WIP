package com.whoop.membership.returns.domain.models;

import com.whoop.design.util.TextResource;
import java.util.List;
import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003Jo\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0014\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010+\u001a\u00020,HÖ\u0081\u0004J\n\u0010-\u001a\u00020\u000fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, m65681d2 = {"Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;", "", "navbarTitle", "Lcom/whoop/design/util/TextResource;", "alertTitle", "alertSubtitle", "instructionsTitle", "instructions", "", "Lcom/whoop/membership/returns/domain/models/InstructionDomainHolder;", "buttons", "Lcom/whoop/membership/returns/domain/models/DownloadButtonDomainHolder;", "footerText", "policyCtaText", "policyCtaUrl", "", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "getNavbarTitle", "()Lcom/whoop/design/util/TextResource;", "getAlertTitle", "getAlertSubtitle", "getInstructionsTitle", "getInstructions", "()Ljava/util/List;", "getButtons", "getFooterText", "getPolicyCtaText", "getPolicyCtaUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ReturnDomainHolder {
    public static final int $stable = 8;
    private final TextResource alertSubtitle;
    private final TextResource alertTitle;
    private final List<DownloadButtonDomainHolder> buttons;
    private final TextResource footerText;
    private final List<InstructionDomainHolder> instructions;
    private final TextResource instructionsTitle;
    private final TextResource navbarTitle;
    private final TextResource policyCtaText;
    private final String policyCtaUrl;

    public ReturnDomainHolder(TextResource navbarTitle, TextResource alertTitle, TextResource alertSubtitle, TextResource instructionsTitle, List<InstructionDomainHolder> instructions, List<DownloadButtonDomainHolder> buttons, TextResource footerText, TextResource policyCtaText, String policyCtaUrl) {
        AbstractC22676k.m65750j(navbarTitle, "navbarTitle");
        AbstractC22676k.m65750j(alertTitle, "alertTitle");
        AbstractC22676k.m65750j(alertSubtitle, "alertSubtitle");
        AbstractC22676k.m65750j(instructionsTitle, "instructionsTitle");
        AbstractC22676k.m65750j(instructions, "instructions");
        AbstractC22676k.m65750j(buttons, "buttons");
        AbstractC22676k.m65750j(footerText, "footerText");
        AbstractC22676k.m65750j(policyCtaText, "policyCtaText");
        AbstractC22676k.m65750j(policyCtaUrl, "policyCtaUrl");
        this.navbarTitle = navbarTitle;
        this.alertTitle = alertTitle;
        this.alertSubtitle = alertSubtitle;
        this.instructionsTitle = instructionsTitle;
        this.instructions = instructions;
        this.buttons = buttons;
        this.footerText = footerText;
        this.policyCtaText = policyCtaText;
        this.policyCtaUrl = policyCtaUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReturnDomainHolder copy$default(ReturnDomainHolder returnDomainHolder, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, List list, List list2, TextResource textResource5, TextResource textResource6, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = returnDomainHolder.navbarTitle;
        }
        if ((i13 & 2) != 0) {
            textResource2 = returnDomainHolder.alertTitle;
        }
        if ((i13 & 4) != 0) {
            textResource3 = returnDomainHolder.alertSubtitle;
        }
        if ((i13 & 8) != 0) {
            textResource4 = returnDomainHolder.instructionsTitle;
        }
        if ((i13 & 16) != 0) {
            list = returnDomainHolder.instructions;
        }
        if ((i13 & 32) != 0) {
            list2 = returnDomainHolder.buttons;
        }
        if ((i13 & 64) != 0) {
            textResource5 = returnDomainHolder.footerText;
        }
        if ((i13 & 128) != 0) {
            textResource6 = returnDomainHolder.policyCtaText;
        }
        if ((i13 & 256) != 0) {
            str = returnDomainHolder.policyCtaUrl;
        }
        TextResource textResource7 = textResource6;
        String str2 = str;
        List list3 = list2;
        TextResource textResource8 = textResource5;
        List list4 = list;
        TextResource textResource9 = textResource3;
        return returnDomainHolder.copy(textResource, textResource2, textResource9, textResource4, list4, list3, textResource8, textResource7, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getNavbarTitle() {
        return this.navbarTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getAlertTitle() {
        return this.alertTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getAlertSubtitle() {
        return this.alertSubtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getInstructionsTitle() {
        return this.instructionsTitle;
    }

    public final List<InstructionDomainHolder> component5() {
        return this.instructions;
    }

    public final List<DownloadButtonDomainHolder> component6() {
        return this.buttons;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TextResource getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TextResource getPolicyCtaText() {
        return this.policyCtaText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPolicyCtaUrl() {
        return this.policyCtaUrl;
    }

    public final ReturnDomainHolder copy(TextResource navbarTitle, TextResource alertTitle, TextResource alertSubtitle, TextResource instructionsTitle, List<InstructionDomainHolder> instructions, List<DownloadButtonDomainHolder> buttons, TextResource footerText, TextResource policyCtaText, String policyCtaUrl) {
        AbstractC22676k.m65750j(navbarTitle, "navbarTitle");
        AbstractC22676k.m65750j(alertTitle, "alertTitle");
        AbstractC22676k.m65750j(alertSubtitle, "alertSubtitle");
        AbstractC22676k.m65750j(instructionsTitle, "instructionsTitle");
        AbstractC22676k.m65750j(instructions, "instructions");
        AbstractC22676k.m65750j(buttons, "buttons");
        AbstractC22676k.m65750j(footerText, "footerText");
        AbstractC22676k.m65750j(policyCtaText, "policyCtaText");
        AbstractC22676k.m65750j(policyCtaUrl, "policyCtaUrl");
        return new ReturnDomainHolder(navbarTitle, alertTitle, alertSubtitle, instructionsTitle, instructions, buttons, footerText, policyCtaText, policyCtaUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnDomainHolder)) {
            return false;
        }
        ReturnDomainHolder returnDomainHolder = (ReturnDomainHolder) other;
        return AbstractC22676k.m65745e(this.navbarTitle, returnDomainHolder.navbarTitle) && AbstractC22676k.m65745e(this.alertTitle, returnDomainHolder.alertTitle) && AbstractC22676k.m65745e(this.alertSubtitle, returnDomainHolder.alertSubtitle) && AbstractC22676k.m65745e(this.instructionsTitle, returnDomainHolder.instructionsTitle) && AbstractC22676k.m65745e(this.instructions, returnDomainHolder.instructions) && AbstractC22676k.m65745e(this.buttons, returnDomainHolder.buttons) && AbstractC22676k.m65745e(this.footerText, returnDomainHolder.footerText) && AbstractC22676k.m65745e(this.policyCtaText, returnDomainHolder.policyCtaText) && AbstractC22676k.m65745e(this.policyCtaUrl, returnDomainHolder.policyCtaUrl);
    }

    public final TextResource getAlertSubtitle() {
        return this.alertSubtitle;
    }

    public final TextResource getAlertTitle() {
        return this.alertTitle;
    }

    public final List<DownloadButtonDomainHolder> getButtons() {
        return this.buttons;
    }

    public final TextResource getFooterText() {
        return this.footerText;
    }

    public final List<InstructionDomainHolder> getInstructions() {
        return this.instructions;
    }

    public final TextResource getInstructionsTitle() {
        return this.instructionsTitle;
    }

    public final TextResource getNavbarTitle() {
        return this.navbarTitle;
    }

    public final TextResource getPolicyCtaText() {
        return this.policyCtaText;
    }

    public final String getPolicyCtaUrl() {
        return this.policyCtaUrl;
    }

    public int hashCode() {
        return this.policyCtaUrl.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.navbarTitle.hashCode() * 31, this.alertTitle, 31), this.alertSubtitle, 31), this.instructionsTitle, 31), 31, this.instructions), 31, this.buttons), this.footerText, 31), this.policyCtaText, 31);
    }

    public String toString() {
        TextResource textResource = this.navbarTitle;
        TextResource textResource2 = this.alertTitle;
        TextResource textResource3 = this.alertSubtitle;
        TextResource textResource4 = this.instructionsTitle;
        List<InstructionDomainHolder> list = this.instructions;
        List<DownloadButtonDomainHolder> list2 = this.buttons;
        TextResource textResource5 = this.footerText;
        TextResource textResource6 = this.policyCtaText;
        String str = this.policyCtaUrl;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ReturnDomainHolder(navbarTitle=", textResource, ", alertTitle=", textResource2, ", alertSubtitle=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", instructionsTitle=", textResource4, ", instructions=");
        AbstractC21702c.m61148s(sbM106658q, list, ", buttons=", list2, ", footerText=");
        AbstractC30007c.m91855y(sbM106658q, textResource5, ", policyCtaText=", textResource6, ", policyCtaUrl=");
        return AbstractC25012a.m73376i(str, ")", sbM106658q);
    }
}
