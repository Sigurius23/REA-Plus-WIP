package com.whoop.profile.view.components;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/profile/view/components/ReferralsTileFooterViewState;", "", "tag", "", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ReferralsTileFooterViewState {
    public static final int $stable = 0;
    private final String tag;
    private final String title;

    public ReferralsTileFooterViewState(String tag, String title) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(title, "title");
        this.tag = tag;
        this.title = title;
    }

    public static /* synthetic */ ReferralsTileFooterViewState copy$default(ReferralsTileFooterViewState referralsTileFooterViewState, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = referralsTileFooterViewState.tag;
        }
        if ((i13 & 2) != 0) {
            str2 = referralsTileFooterViewState.title;
        }
        return referralsTileFooterViewState.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final ReferralsTileFooterViewState copy(String tag, String title) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(title, "title");
        return new ReferralsTileFooterViewState(tag, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferralsTileFooterViewState)) {
            return false;
        }
        ReferralsTileFooterViewState referralsTileFooterViewState = (ReferralsTileFooterViewState) other;
        return AbstractC22676k.m65745e(this.tag, referralsTileFooterViewState.tag) && AbstractC22676k.m65745e(this.title, referralsTileFooterViewState.title);
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + (this.tag.hashCode() * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("ReferralsTileFooterViewState(tag=", this.tag, ", title=", this.title, ")");
    }
}
