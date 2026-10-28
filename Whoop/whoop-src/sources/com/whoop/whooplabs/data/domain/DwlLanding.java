package com.whoop.whooplabs.data.domain;

import com.whoop.design.models.DesignSystemModel;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jg\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0014\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010)\u001a\u00020*HÖ\u0081\u0004J\n\u0010+\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, m65681d2 = {"Lcom/whoop/whooplabs/data/domain/DwlLanding;", "", "toolbarTitle", "", "headerTitle", "headerBody", "pageBackgroundImageUrl", "campaignSections", "", "Lcom/whoop/whooplabs/data/domain/DwlCampaignSection;", "impactSection", "Lcom/whoop/whooplabs/data/domain/DwlImpactSection;", "footerText", "footer", "Lcom/whoop/design/models/DesignSystemModel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whooplabs/data/domain/DwlImpactSection;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;)V", "getToolbarTitle", "()Ljava/lang/String;", "getHeaderTitle", "getHeaderBody", "getPageBackgroundImageUrl", "getCampaignSections", "()Ljava/util/List;", "getImpactSection", "()Lcom/whoop/whooplabs/data/domain/DwlImpactSection;", "getFooterText", "getFooter", "()Lcom/whoop/design/models/DesignSystemModel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class DwlLanding {
    public static final int $stable = 8;
    private final List<DwlCampaignSection> campaignSections;
    private final DesignSystemModel footer;
    private final String footerText;
    private final String headerBody;
    private final String headerTitle;
    private final DwlImpactSection impactSection;
    private final String pageBackgroundImageUrl;
    private final String toolbarTitle;

    public DwlLanding(String toolbarTitle, String headerTitle, String headerBody, String str, List<DwlCampaignSection> campaignSections, DwlImpactSection dwlImpactSection, String str2, DesignSystemModel designSystemModel) {
        AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
        AbstractC22676k.m65750j(headerTitle, "headerTitle");
        AbstractC22676k.m65750j(headerBody, "headerBody");
        AbstractC22676k.m65750j(campaignSections, "campaignSections");
        this.toolbarTitle = toolbarTitle;
        this.headerTitle = headerTitle;
        this.headerBody = headerBody;
        this.pageBackgroundImageUrl = str;
        this.campaignSections = campaignSections;
        this.impactSection = dwlImpactSection;
        this.footerText = str2;
        this.footer = designSystemModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DwlLanding copy$default(DwlLanding dwlLanding, String str, String str2, String str3, String str4, List list, DwlImpactSection dwlImpactSection, String str5, DesignSystemModel designSystemModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dwlLanding.toolbarTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = dwlLanding.headerTitle;
        }
        if ((i13 & 4) != 0) {
            str3 = dwlLanding.headerBody;
        }
        if ((i13 & 8) != 0) {
            str4 = dwlLanding.pageBackgroundImageUrl;
        }
        if ((i13 & 16) != 0) {
            list = dwlLanding.campaignSections;
        }
        if ((i13 & 32) != 0) {
            dwlImpactSection = dwlLanding.impactSection;
        }
        if ((i13 & 64) != 0) {
            str5 = dwlLanding.footerText;
        }
        if ((i13 & 128) != 0) {
            designSystemModel = dwlLanding.footer;
        }
        String str6 = str5;
        DesignSystemModel designSystemModel2 = designSystemModel;
        List list2 = list;
        DwlImpactSection dwlImpactSection2 = dwlImpactSection;
        return dwlLanding.copy(str, str2, str3, str4, list2, dwlImpactSection2, str6, designSystemModel2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToolbarTitle() {
        return this.toolbarTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHeaderBody() {
        return this.headerBody;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPageBackgroundImageUrl() {
        return this.pageBackgroundImageUrl;
    }

    public final List<DwlCampaignSection> component5() {
        return this.campaignSections;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DwlImpactSection getImpactSection() {
        return this.impactSection;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DesignSystemModel getFooter() {
        return this.footer;
    }

    public final DwlLanding copy(String toolbarTitle, String headerTitle, String headerBody, String pageBackgroundImageUrl, List<DwlCampaignSection> campaignSections, DwlImpactSection impactSection, String footerText, DesignSystemModel footer) {
        AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
        AbstractC22676k.m65750j(headerTitle, "headerTitle");
        AbstractC22676k.m65750j(headerBody, "headerBody");
        AbstractC22676k.m65750j(campaignSections, "campaignSections");
        return new DwlLanding(toolbarTitle, headerTitle, headerBody, pageBackgroundImageUrl, campaignSections, impactSection, footerText, footer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DwlLanding)) {
            return false;
        }
        DwlLanding dwlLanding = (DwlLanding) other;
        return AbstractC22676k.m65745e(this.toolbarTitle, dwlLanding.toolbarTitle) && AbstractC22676k.m65745e(this.headerTitle, dwlLanding.headerTitle) && AbstractC22676k.m65745e(this.headerBody, dwlLanding.headerBody) && AbstractC22676k.m65745e(this.pageBackgroundImageUrl, dwlLanding.pageBackgroundImageUrl) && AbstractC22676k.m65745e(this.campaignSections, dwlLanding.campaignSections) && AbstractC22676k.m65745e(this.impactSection, dwlLanding.impactSection) && AbstractC22676k.m65745e(this.footerText, dwlLanding.footerText) && AbstractC22676k.m65745e(this.footer, dwlLanding.footer);
    }

    public final List<DwlCampaignSection> getCampaignSections() {
        return this.campaignSections;
    }

    public final DesignSystemModel getFooter() {
        return this.footer;
    }

    public final String getFooterText() {
        return this.footerText;
    }

    public final String getHeaderBody() {
        return this.headerBody;
    }

    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    public final DwlImpactSection getImpactSection() {
        return this.impactSection;
    }

    public final String getPageBackgroundImageUrl() {
        return this.pageBackgroundImageUrl;
    }

    public final String getToolbarTitle() {
        return this.toolbarTitle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.toolbarTitle.hashCode() * 31, 31, this.headerTitle), 31, this.headerBody);
        String str = this.pageBackgroundImageUrl;
        int iM31983b = AbstractC11895b.m31983b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.campaignSections);
        DwlImpactSection dwlImpactSection = this.impactSection;
        int iHashCode = (iM31983b + (dwlImpactSection == null ? 0 : dwlImpactSection.hashCode())) * 31;
        String str2 = this.footerText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DesignSystemModel designSystemModel = this.footer;
        return iHashCode2 + (designSystemModel != null ? designSystemModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.toolbarTitle;
        String str2 = this.headerTitle;
        String str3 = this.headerBody;
        String str4 = this.pageBackgroundImageUrl;
        List<DwlCampaignSection> list = this.campaignSections;
        DwlImpactSection dwlImpactSection = this.impactSection;
        String str5 = this.footerText;
        DesignSystemModel designSystemModel = this.footer;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DwlLanding(toolbarTitle=", str, ", headerTitle=", str2, ", headerBody=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", pageBackgroundImageUrl=", str4, ", campaignSections=");
        sbM32001t.append(list);
        sbM32001t.append(", impactSection=");
        sbM32001t.append(dwlImpactSection);
        sbM32001t.append(", footerText=");
        sbM32001t.append(str5);
        sbM32001t.append(", footer=");
        sbM32001t.append(designSystemModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
