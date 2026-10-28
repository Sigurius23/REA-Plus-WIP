package br0;

import com.whoop.communityfollowercontainer.domain.model.CommunityFollowerContainerResponse;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: br0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJP\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b%\u0010\u001a¨\u0006&"}, m65681d2 = {"Lbr0/b;", "", "", "isLoading", "isError", "Lcom/whoop/communityfollowercontainer/domain/model/CommunityFollowerContainerResponse;", "data", "", "initialPath", "Lbr0/d;", "paginationState", "isFilterSheetVisible", "<init>", "(ZZLcom/whoop/communityfollowercontainer/domain/model/CommunityFollowerContainerResponse;Ljava/lang/String;Lbr0/d;Z)V", "a", "(ZZLcom/whoop/communityfollowercontainer/domain/model/CommunityFollowerContainerResponse;Ljava/lang/String;Lbr0/d;Z)Lbr0/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "b", "f", "c", "Lcom/whoop/communityfollowercontainer/domain/model/CommunityFollowerContainerResponse;", "()Lcom/whoop/communityfollowercontainer/domain/model/CommunityFollowerContainerResponse;", "d", "Ljava/lang/String;", "e", "Lbr0/d;", "()Lbr0/d;", "g", "community-follower-container-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3555b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final CommunityFollowerContainerResponse data;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String initialPath;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC3557d paginationState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isFilterSheetVisible;

    public C3555b(boolean z4, boolean z13, CommunityFollowerContainerResponse communityFollowerContainerResponse, String str, AbstractC3557d paginationState, boolean z14) {
        AbstractC22676k.m65750j(paginationState, "paginationState");
        this.isLoading = z4;
        this.isError = z13;
        this.data = communityFollowerContainerResponse;
        this.initialPath = str;
        this.paginationState = paginationState;
        this.isFilterSheetVisible = z14;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C3555b m10609b(C3555b c3555b, boolean z4, boolean z13, CommunityFollowerContainerResponse communityFollowerContainerResponse, String str, AbstractC3557d abstractC3557d, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c3555b.isLoading;
        }
        if ((i13 & 2) != 0) {
            z13 = c3555b.isError;
        }
        if ((i13 & 4) != 0) {
            communityFollowerContainerResponse = c3555b.data;
        }
        if ((i13 & 8) != 0) {
            str = c3555b.initialPath;
        }
        if ((i13 & 16) != 0) {
            abstractC3557d = c3555b.paginationState;
        }
        if ((i13 & 32) != 0) {
            z14 = c3555b.isFilterSheetVisible;
        }
        AbstractC3557d abstractC3557d2 = abstractC3557d;
        boolean z15 = z14;
        return c3555b.m10610a(z4, z13, communityFollowerContainerResponse, str, abstractC3557d2, z15);
    }

    /* JADX INFO: renamed from: a */
    public final C3555b m10610a(boolean isLoading, boolean isError, CommunityFollowerContainerResponse data, String initialPath, AbstractC3557d paginationState, boolean isFilterSheetVisible) {
        AbstractC22676k.m65750j(paginationState, "paginationState");
        return new C3555b(isLoading, isError, data, initialPath, paginationState, isFilterSheetVisible);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CommunityFollowerContainerResponse getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInitialPath() {
        return this.initialPath;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC3557d getPaginationState() {
        return this.paginationState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3555b)) {
            return false;
        }
        C3555b c3555b = (C3555b) other;
        return this.isLoading == c3555b.isLoading && this.isError == c3555b.isError && AbstractC22676k.m65745e(this.data, c3555b.data) && AbstractC22676k.m65745e(this.initialPath, c3555b.initialPath) && AbstractC22676k.m65745e(this.paginationState, c3555b.paginationState) && this.isFilterSheetVisible == c3555b.isFilterSheetVisible;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsFilterSheetVisible() {
        return this.isFilterSheetVisible;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError);
        CommunityFollowerContainerResponse communityFollowerContainerResponse = this.data;
        int iHashCode = (iM8289b + (communityFollowerContainerResponse == null ? 0 : communityFollowerContainerResponse.hashCode())) * 31;
        String str = this.initialPath;
        return Boolean.hashCode(this.isFilterSheetVisible) + ((this.paginationState.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        CommunityFollowerContainerResponse communityFollowerContainerResponse = this.data;
        String str = this.initialPath;
        AbstractC3557d abstractC3557d = this.paginationState;
        boolean z14 = this.isFilterSheetVisible;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("CommunityFollowerContainerDomainState(isLoading=", ", isError=", ", data=", z4, z13);
        sbM32002u.append(communityFollowerContainerResponse);
        sbM32002u.append(", initialPath=");
        sbM32002u.append(str);
        sbM32002u.append(", paginationState=");
        sbM32002u.append(abstractC3557d);
        sbM32002u.append(", isFilterSheetVisible=");
        sbM32002u.append(z14);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C3555b(boolean z4, boolean z13, CommunityFollowerContainerResponse communityFollowerContainerResponse, String str, AbstractC3557d abstractC3557d, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : communityFollowerContainerResponse, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? AbstractC3557d.c.f14393a : abstractC3557d, (i13 & 32) != 0 ? false : z14);
    }
}
