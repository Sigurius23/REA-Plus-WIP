package pr0;

import com.whoop.communityhighlightscontainer.domain.model.CommunityHighlightsContainerResponse;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pr0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJF\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, m65681d2 = {"Lpr0/b;", "", "", "isLoading", "isError", "Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;", "data", "", "initialPath", "Lpr0/d;", "paginationState", "<init>", "(ZZLcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;Ljava/lang/String;Lpr0/d;)V", "a", "(ZZLcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;Ljava/lang/String;Lpr0/d;)Lpr0/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "g", "()Z", "b", "f", "c", "Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;", "()Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;", "d", "Ljava/lang/String;", "e", "Lpr0/d;", "()Lpr0/d;", "community-highlights-container-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29487b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final CommunityHighlightsContainerResponse data;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String initialPath;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC29489d paginationState;

    public C29487b(boolean z4, boolean z13, CommunityHighlightsContainerResponse communityHighlightsContainerResponse, String str, AbstractC29489d paginationState) {
        AbstractC22676k.m65750j(paginationState, "paginationState");
        this.isLoading = z4;
        this.isError = z13;
        this.data = communityHighlightsContainerResponse;
        this.initialPath = str;
        this.paginationState = paginationState;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C29487b m90071b(C29487b c29487b, boolean z4, boolean z13, CommunityHighlightsContainerResponse communityHighlightsContainerResponse, String str, AbstractC29489d abstractC29489d, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c29487b.isLoading;
        }
        if ((i13 & 2) != 0) {
            z13 = c29487b.isError;
        }
        if ((i13 & 4) != 0) {
            communityHighlightsContainerResponse = c29487b.data;
        }
        if ((i13 & 8) != 0) {
            str = c29487b.initialPath;
        }
        if ((i13 & 16) != 0) {
            abstractC29489d = c29487b.paginationState;
        }
        AbstractC29489d abstractC29489d2 = abstractC29489d;
        CommunityHighlightsContainerResponse communityHighlightsContainerResponse2 = communityHighlightsContainerResponse;
        return c29487b.m90072a(z4, z13, communityHighlightsContainerResponse2, str, abstractC29489d2);
    }

    /* JADX INFO: renamed from: a */
    public final C29487b m90072a(boolean isLoading, boolean isError, CommunityHighlightsContainerResponse data, String initialPath, AbstractC29489d paginationState) {
        AbstractC22676k.m65750j(paginationState, "paginationState");
        return new C29487b(isLoading, isError, data, initialPath, paginationState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CommunityHighlightsContainerResponse getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInitialPath() {
        return this.initialPath;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC29489d getPaginationState() {
        return this.paginationState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29487b)) {
            return false;
        }
        C29487b c29487b = (C29487b) other;
        return this.isLoading == c29487b.isLoading && this.isError == c29487b.isError && AbstractC22676k.m65745e(this.data, c29487b.data) && AbstractC22676k.m65745e(this.initialPath, c29487b.initialPath) && AbstractC22676k.m65745e(this.paginationState, c29487b.paginationState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError);
        CommunityHighlightsContainerResponse communityHighlightsContainerResponse = this.data;
        int iHashCode = (iM8289b + (communityHighlightsContainerResponse == null ? 0 : communityHighlightsContainerResponse.hashCode())) * 31;
        String str = this.initialPath;
        return this.paginationState.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        CommunityHighlightsContainerResponse communityHighlightsContainerResponse = this.data;
        String str = this.initialPath;
        AbstractC29489d abstractC29489d = this.paginationState;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("CommunityHighlightsContainerDomainState(isLoading=", ", isError=", ", data=", z4, z13);
        sbM32002u.append(communityHighlightsContainerResponse);
        sbM32002u.append(", initialPath=");
        sbM32002u.append(str);
        sbM32002u.append(", paginationState=");
        sbM32002u.append(abstractC29489d);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C29487b(boolean z4, boolean z13, CommunityHighlightsContainerResponse communityHighlightsContainerResponse, String str, AbstractC29489d abstractC29489d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : communityHighlightsContainerResponse, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? AbstractC29489d.c.f119831a : abstractC29489d);
    }
}
