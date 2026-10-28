package com.whoop.profile.view.components;

import com.whoop.navigation.C9598e;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJT\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u0010\u001b¨\u00063"}, m65681d2 = {"Lcom/whoop/profile/view/components/ReferralsTileViewState;", "Lm91/u;", "", "id", "Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;", "header", "Lcom/whoop/profile/view/components/ReferredListViewState;", "referredList", "Lcom/whoop/profile/view/components/ReferralsTileFooterViewState;", "footer", "Lny0/h;", "button", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;Lcom/whoop/profile/view/components/ReferredListViewState;Lcom/whoop/profile/view/components/ReferralsTileFooterViewState;Lny0/h;Lcom/whoop/navigation/e;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;", "component3", "()Lcom/whoop/profile/view/components/ReferredListViewState;", "component4", "()Lcom/whoop/profile/view/components/ReferralsTileFooterViewState;", "component5", "()Lny0/h;", "component6", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;Lcom/whoop/profile/view/components/ReferredListViewState;Lcom/whoop/profile/view/components/ReferralsTileFooterViewState;Lny0/h;Lcom/whoop/navigation/e;)Lcom/whoop/profile/view/components/ReferralsTileViewState;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;", "getHeader", "Lcom/whoop/profile/view/components/ReferredListViewState;", "getReferredList", "Lcom/whoop/profile/view/components/ReferralsTileFooterViewState;", "getFooter", "Lny0/h;", "getButton", "Lcom/whoop/navigation/e;", "getDestination", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ReferralsTileViewState implements InterfaceC25312u {
    public static final int $stable = 8;
    private final C27256h button;
    private final C9598e destination;
    private final ReferralsTileFooterViewState footer;
    private final ReferralsTileHeaderViewState header;
    private final String id;
    private final ReferredListViewState referredList;

    public ReferralsTileViewState(String id4, ReferralsTileHeaderViewState header, ReferredListViewState referredListViewState, ReferralsTileFooterViewState referralsTileFooterViewState, C27256h c27256h, C9598e c9598e) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(header, "header");
        this.id = id4;
        this.header = header;
        this.referredList = referredListViewState;
        this.footer = referralsTileFooterViewState;
        this.button = c27256h;
        this.destination = c9598e;
    }

    public static /* synthetic */ ReferralsTileViewState copy$default(ReferralsTileViewState referralsTileViewState, String str, ReferralsTileHeaderViewState referralsTileHeaderViewState, ReferredListViewState referredListViewState, ReferralsTileFooterViewState referralsTileFooterViewState, C27256h c27256h, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = referralsTileViewState.id;
        }
        if ((i13 & 2) != 0) {
            referralsTileHeaderViewState = referralsTileViewState.header;
        }
        if ((i13 & 4) != 0) {
            referredListViewState = referralsTileViewState.referredList;
        }
        if ((i13 & 8) != 0) {
            referralsTileFooterViewState = referralsTileViewState.footer;
        }
        if ((i13 & 16) != 0) {
            c27256h = referralsTileViewState.button;
        }
        if ((i13 & 32) != 0) {
            c9598e = referralsTileViewState.destination;
        }
        C27256h c27256h2 = c27256h;
        C9598e c9598e2 = c9598e;
        return referralsTileViewState.copy(str, referralsTileHeaderViewState, referredListViewState, referralsTileFooterViewState, c27256h2, c9598e2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ReferralsTileHeaderViewState getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ReferredListViewState getReferredList() {
        return this.referredList;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ReferralsTileFooterViewState getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C27256h getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final ReferralsTileViewState copy(String id4, ReferralsTileHeaderViewState header, ReferredListViewState referredList, ReferralsTileFooterViewState footer, C27256h button, C9598e destination) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(header, "header");
        return new ReferralsTileViewState(id4, header, referredList, footer, button, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferralsTileViewState)) {
            return false;
        }
        ReferralsTileViewState referralsTileViewState = (ReferralsTileViewState) other;
        return AbstractC22676k.m65745e(this.id, referralsTileViewState.id) && AbstractC22676k.m65745e(this.header, referralsTileViewState.header) && AbstractC22676k.m65745e(this.referredList, referralsTileViewState.referredList) && AbstractC22676k.m65745e(this.footer, referralsTileViewState.footer) && AbstractC22676k.m65745e(this.button, referralsTileViewState.button) && AbstractC22676k.m65745e(this.destination, referralsTileViewState.destination);
    }

    public final C27256h getButton() {
        return this.button;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    @Override // p720m91.InterfaceC25312u
    /* JADX INFO: renamed from: getEvent */
    public /* bridge */ Object getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() {
        return super.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
    }

    public final ReferralsTileFooterViewState getFooter() {
        return this.footer;
    }

    public final ReferralsTileHeaderViewState getHeader() {
        return this.header;
    }

    public final String getId() {
        return this.id;
    }

    public final ReferredListViewState getReferredList() {
        return this.referredList;
    }

    public int hashCode() {
        int iHashCode = (this.header.hashCode() + (this.id.hashCode() * 31)) * 31;
        ReferredListViewState referredListViewState = this.referredList;
        int iHashCode2 = (iHashCode + (referredListViewState == null ? 0 : referredListViewState.hashCode())) * 31;
        ReferralsTileFooterViewState referralsTileFooterViewState = this.footer;
        int iHashCode3 = (iHashCode2 + (referralsTileFooterViewState == null ? 0 : referralsTileFooterViewState.hashCode())) * 31;
        C27256h c27256h = this.button;
        int iHashCode4 = (iHashCode3 + (c27256h == null ? 0 : c27256h.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode4 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        return "ReferralsTileViewState(id=" + this.id + ", header=" + this.header + ", referredList=" + this.referredList + ", footer=" + this.footer + ", button=" + this.button + ", destination=" + this.destination + ")";
    }

    public /* synthetic */ ReferralsTileViewState(String str, ReferralsTileHeaderViewState referralsTileHeaderViewState, ReferredListViewState referredListViewState, ReferralsTileFooterViewState referralsTileFooterViewState, C27256h c27256h, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, referralsTileHeaderViewState, (i13 & 4) != 0 ? null : referredListViewState, (i13 & 8) != 0 ? null : referralsTileFooterViewState, (i13 & 16) != 0 ? null : c27256h, (i13 & 32) != 0 ? null : c9598e);
    }
}
