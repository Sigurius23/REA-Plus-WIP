package com.whoop.profile.view.components;

import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0011¨\u0006!"}, m65681d2 = {"Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;", "", "", "title", "subtitle", "", "referralsCount", "Lkd1/o;", "referralsImg", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILkd1/o;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "()Lkd1/o;", "copy", "(Ljava/lang/String;Ljava/lang/String;ILkd1/o;)Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "I", "getReferralsCount", "Lkd1/o;", "getReferralsImg", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ReferralsTileHeaderViewState {
    public static final int $stable = AbstractC22403o.f87638a;
    private final int referralsCount;
    private final AbstractC22403o referralsImg;
    private final String subtitle;
    private final String title;

    public ReferralsTileHeaderViewState(String title, String subtitle, int i13, AbstractC22403o referralsImg) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(referralsImg, "referralsImg");
        this.title = title;
        this.subtitle = subtitle;
        this.referralsCount = i13;
        this.referralsImg = referralsImg;
    }

    public static /* synthetic */ ReferralsTileHeaderViewState copy$default(ReferralsTileHeaderViewState referralsTileHeaderViewState, String str, String str2, int i13, AbstractC22403o abstractC22403o, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = referralsTileHeaderViewState.title;
        }
        if ((i14 & 2) != 0) {
            str2 = referralsTileHeaderViewState.subtitle;
        }
        if ((i14 & 4) != 0) {
            i13 = referralsTileHeaderViewState.referralsCount;
        }
        if ((i14 & 8) != 0) {
            abstractC22403o = referralsTileHeaderViewState.referralsImg;
        }
        return referralsTileHeaderViewState.copy(str, str2, i13, abstractC22403o);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getReferralsCount() {
        return this.referralsCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AbstractC22403o getReferralsImg() {
        return this.referralsImg;
    }

    public final ReferralsTileHeaderViewState copy(String title, String subtitle, int referralsCount, AbstractC22403o referralsImg) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(referralsImg, "referralsImg");
        return new ReferralsTileHeaderViewState(title, subtitle, referralsCount, referralsImg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferralsTileHeaderViewState)) {
            return false;
        }
        ReferralsTileHeaderViewState referralsTileHeaderViewState = (ReferralsTileHeaderViewState) other;
        return AbstractC22676k.m65745e(this.title, referralsTileHeaderViewState.title) && AbstractC22676k.m65745e(this.subtitle, referralsTileHeaderViewState.subtitle) && this.referralsCount == referralsTileHeaderViewState.referralsCount && AbstractC22676k.m65745e(this.referralsImg, referralsTileHeaderViewState.referralsImg);
    }

    public final int getReferralsCount() {
        return this.referralsCount;
    }

    public final AbstractC22403o getReferralsImg() {
        return this.referralsImg;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.referralsImg.hashCode() + AbstractC11266d.m30448b(this.referralsCount, AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        int i13 = this.referralsCount;
        AbstractC22403o abstractC22403o = this.referralsImg;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ReferralsTileHeaderViewState(title=", str, ", subtitle=", str2, ", referralsCount=");
        sbM32001t.append(i13);
        sbM32001t.append(", referralsImg=");
        sbM32001t.append(abstractC22403o);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
