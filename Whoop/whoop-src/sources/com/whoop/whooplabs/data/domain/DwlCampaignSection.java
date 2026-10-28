package com.whoop.whooplabs.data.domain;

import com.whoop.design.models.DesignSystemModel;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/whooplabs/data/domain/DwlCampaignSection;", "", "title", "", "subtitle", "items", "", "Lcom/whoop/design/models/DesignSystemModel;", "emptyState", "Lcom/whoop/whooplabs/data/domain/DwlCampaignSectionEmptyState;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whooplabs/data/domain/DwlCampaignSectionEmptyState;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getItems", "()Ljava/util/List;", "getEmptyState", "()Lcom/whoop/whooplabs/data/domain/DwlCampaignSectionEmptyState;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class DwlCampaignSection {
    public static final int $stable = 8;
    private final DwlCampaignSectionEmptyState emptyState;
    private final List<DesignSystemModel> items;
    private final String subtitle;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public DwlCampaignSection(String str, String str2, List<? extends DesignSystemModel> list, DwlCampaignSectionEmptyState dwlCampaignSectionEmptyState) {
        this.title = str;
        this.subtitle = str2;
        this.items = list;
        this.emptyState = dwlCampaignSectionEmptyState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DwlCampaignSection copy$default(DwlCampaignSection dwlCampaignSection, String str, String str2, List list, DwlCampaignSectionEmptyState dwlCampaignSectionEmptyState, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dwlCampaignSection.title;
        }
        if ((i13 & 2) != 0) {
            str2 = dwlCampaignSection.subtitle;
        }
        if ((i13 & 4) != 0) {
            list = dwlCampaignSection.items;
        }
        if ((i13 & 8) != 0) {
            dwlCampaignSectionEmptyState = dwlCampaignSection.emptyState;
        }
        return dwlCampaignSection.copy(str, str2, list, dwlCampaignSectionEmptyState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<DesignSystemModel> component3() {
        return this.items;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DwlCampaignSectionEmptyState getEmptyState() {
        return this.emptyState;
    }

    public final DwlCampaignSection copy(String title, String subtitle, List<? extends DesignSystemModel> items, DwlCampaignSectionEmptyState emptyState) {
        return new DwlCampaignSection(title, subtitle, items, emptyState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DwlCampaignSection)) {
            return false;
        }
        DwlCampaignSection dwlCampaignSection = (DwlCampaignSection) other;
        return AbstractC22676k.m65745e(this.title, dwlCampaignSection.title) && AbstractC22676k.m65745e(this.subtitle, dwlCampaignSection.subtitle) && AbstractC22676k.m65745e(this.items, dwlCampaignSection.items) && AbstractC22676k.m65745e(this.emptyState, dwlCampaignSection.emptyState);
    }

    public final DwlCampaignSectionEmptyState getEmptyState() {
        return this.emptyState;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<DesignSystemModel> list = this.items;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        DwlCampaignSectionEmptyState dwlCampaignSectionEmptyState = this.emptyState;
        return iHashCode3 + (dwlCampaignSectionEmptyState != null ? dwlCampaignSectionEmptyState.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        List<DesignSystemModel> list = this.items;
        DwlCampaignSectionEmptyState dwlCampaignSectionEmptyState = this.emptyState;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DwlCampaignSection(title=", str, ", subtitle=", str2, ", items=");
        sbM32001t.append(list);
        sbM32001t.append(", emptyState=");
        sbM32001t.append(dwlCampaignSectionEmptyState);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
