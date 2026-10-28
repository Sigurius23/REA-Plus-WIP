package com.whoop.profile.view.components;

import java.util.List;
import m83.C25271y;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/profile/view/components/ReferredListViewState;", "", "id", "", "referredMembers", "", "Lcom/whoop/profile/view/components/ReferredMemberViewState;", "additionalReferralDisplay", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getReferredMembers", "()Ljava/util/List;", "getAdditionalReferralDisplay", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ReferredListViewState {
    public static final int $stable = 8;
    private final String additionalReferralDisplay;
    private final String id;
    private final List<ReferredMemberViewState> referredMembers;

    public ReferredListViewState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReferredListViewState copy$default(ReferredListViewState referredListViewState, String str, List list, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = referredListViewState.id;
        }
        if ((i13 & 2) != 0) {
            list = referredListViewState.referredMembers;
        }
        if ((i13 & 4) != 0) {
            str2 = referredListViewState.additionalReferralDisplay;
        }
        return referredListViewState.copy(str, list, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<ReferredMemberViewState> component2() {
        return this.referredMembers;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAdditionalReferralDisplay() {
        return this.additionalReferralDisplay;
    }

    public final ReferredListViewState copy(String id4, List<ReferredMemberViewState> referredMembers, String additionalReferralDisplay) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(referredMembers, "referredMembers");
        return new ReferredListViewState(id4, referredMembers, additionalReferralDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferredListViewState)) {
            return false;
        }
        ReferredListViewState referredListViewState = (ReferredListViewState) other;
        return AbstractC22676k.m65745e(this.id, referredListViewState.id) && AbstractC22676k.m65745e(this.referredMembers, referredListViewState.referredMembers) && AbstractC22676k.m65745e(this.additionalReferralDisplay, referredListViewState.additionalReferralDisplay);
    }

    public final String getAdditionalReferralDisplay() {
        return this.additionalReferralDisplay;
    }

    public final String getId() {
        return this.id;
    }

    public final List<ReferredMemberViewState> getReferredMembers() {
        return this.referredMembers;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.id.hashCode() * 31, 31, this.referredMembers);
        String str = this.additionalReferralDisplay;
        return iM31983b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.additionalReferralDisplay, ")", AbstractC30802r.m94766o("ReferredListViewState(id=", this.id, ", referredMembers=", ", additionalReferralDisplay=", this.referredMembers));
    }

    public ReferredListViewState(String id4, List<ReferredMemberViewState> referredMembers, String str) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(referredMembers, "referredMembers");
        this.id = id4;
        this.referredMembers = referredMembers;
        this.additionalReferralDisplay = str;
    }

    public /* synthetic */ ReferredListViewState(String str, List list, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : str2);
    }
}
