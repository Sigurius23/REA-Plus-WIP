package gr0;

import c13.AbstractC3855a;
import com.whoop.communityfollowerlookup.domain.model.CommunityFollowerLookupResponse;
import com.whoop.navigation.models.GenericInteraction;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import m83.C25272z;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: gr0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jr\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b&\u00100R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103¨\u00064"}, m65681d2 = {"Lgr0/b;", "", "", "isLoading", "isError", "Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;", "data", "", "initialPath", "Lgr0/h;", "paginationState", "Lgr0/g;", "itemActionState", "", "Lgr0/f;", "followerRequestUiStages", "Lcom/whoop/navigation/models/GenericInteraction;", "pendingHostInteraction", "<init>", "(ZZLcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;Ljava/lang/String;Lgr0/h;Lgr0/g;Ljava/util/Map;Lcom/whoop/navigation/models/GenericInteraction;)V", "a", "(ZZLcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;Ljava/lang/String;Lgr0/h;Lgr0/g;Ljava/util/Map;Lcom/whoop/navigation/models/GenericInteraction;)Lgr0/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "j", "()Z", "b", "i", "c", "Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;", "()Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;", "d", "Ljava/lang/String;", "e", "Lgr0/h;", "g", "()Lgr0/h;", "f", "Lgr0/g;", "()Lgr0/g;", "Ljava/util/Map;", "()Ljava/util/Map;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "community-follower-lookup-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16087b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final CommunityFollowerLookupResponse data;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String initialPath;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC16093h paginationState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC16092g itemActionState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Map<String, EnumC16091f> followerRequestUiStages;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final GenericInteraction pendingHostInteraction;

    /* JADX WARN: Multi-variable type inference failed */
    public C16087b(boolean z4, boolean z13, CommunityFollowerLookupResponse communityFollowerLookupResponse, String str, AbstractC16093h paginationState, AbstractC16092g itemActionState, Map<String, ? extends EnumC16091f> followerRequestUiStages, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(paginationState, "paginationState");
        AbstractC22676k.m65750j(itemActionState, "itemActionState");
        AbstractC22676k.m65750j(followerRequestUiStages, "followerRequestUiStages");
        this.isLoading = z4;
        this.isError = z13;
        this.data = communityFollowerLookupResponse;
        this.initialPath = str;
        this.paginationState = paginationState;
        this.itemActionState = itemActionState;
        this.followerRequestUiStages = followerRequestUiStages;
        this.pendingHostInteraction = genericInteraction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C16087b m45453b(C16087b c16087b, boolean z4, boolean z13, CommunityFollowerLookupResponse communityFollowerLookupResponse, String str, AbstractC16093h abstractC16093h, AbstractC16092g abstractC16092g, Map map, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c16087b.isLoading;
        }
        if ((i13 & 2) != 0) {
            z13 = c16087b.isError;
        }
        if ((i13 & 4) != 0) {
            communityFollowerLookupResponse = c16087b.data;
        }
        if ((i13 & 8) != 0) {
            str = c16087b.initialPath;
        }
        if ((i13 & 16) != 0) {
            abstractC16093h = c16087b.paginationState;
        }
        if ((i13 & 32) != 0) {
            abstractC16092g = c16087b.itemActionState;
        }
        if ((i13 & 64) != 0) {
            map = c16087b.followerRequestUiStages;
        }
        if ((i13 & 128) != 0) {
            genericInteraction = c16087b.pendingHostInteraction;
        }
        Map map2 = map;
        GenericInteraction genericInteraction2 = genericInteraction;
        AbstractC16093h abstractC16093h2 = abstractC16093h;
        AbstractC16092g abstractC16092g2 = abstractC16092g;
        return c16087b.m45454a(z4, z13, communityFollowerLookupResponse, str, abstractC16093h2, abstractC16092g2, map2, genericInteraction2);
    }

    /* JADX INFO: renamed from: a */
    public final C16087b m45454a(boolean isLoading, boolean isError, CommunityFollowerLookupResponse data, String initialPath, AbstractC16093h paginationState, AbstractC16092g itemActionState, Map<String, ? extends EnumC16091f> followerRequestUiStages, GenericInteraction pendingHostInteraction) {
        AbstractC22676k.m65750j(paginationState, "paginationState");
        AbstractC22676k.m65750j(itemActionState, "itemActionState");
        AbstractC22676k.m65750j(followerRequestUiStages, "followerRequestUiStages");
        return new C16087b(isLoading, isError, data, initialPath, paginationState, itemActionState, followerRequestUiStages, pendingHostInteraction);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CommunityFollowerLookupResponse getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: d */
    public final Map<String, EnumC16091f> m45456d() {
        return this.followerRequestUiStages;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getInitialPath() {
        return this.initialPath;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16087b)) {
            return false;
        }
        C16087b c16087b = (C16087b) other;
        return this.isLoading == c16087b.isLoading && this.isError == c16087b.isError && AbstractC22676k.m65745e(this.data, c16087b.data) && AbstractC22676k.m65745e(this.initialPath, c16087b.initialPath) && AbstractC22676k.m65745e(this.paginationState, c16087b.paginationState) && AbstractC22676k.m65745e(this.itemActionState, c16087b.itemActionState) && AbstractC22676k.m65745e(this.followerRequestUiStages, c16087b.followerRequestUiStages) && AbstractC22676k.m65745e(this.pendingHostInteraction, c16087b.pendingHostInteraction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC16092g getItemActionState() {
        return this.itemActionState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC16093h getPaginationState() {
        return this.paginationState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final GenericInteraction getPendingHostInteraction() {
        return this.pendingHostInteraction;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError);
        CommunityFollowerLookupResponse communityFollowerLookupResponse = this.data;
        int iHashCode = (iM8289b + (communityFollowerLookupResponse == null ? 0 : communityFollowerLookupResponse.hashCode())) * 31;
        String str = this.initialPath;
        int iM11821e = AbstractC3855a.m11821e(this.followerRequestUiStages, (this.itemActionState.hashCode() + ((this.paginationState.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31);
        GenericInteraction genericInteraction = this.pendingHostInteraction;
        return iM11821e + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        CommunityFollowerLookupResponse communityFollowerLookupResponse = this.data;
        String str = this.initialPath;
        AbstractC16093h abstractC16093h = this.paginationState;
        AbstractC16092g abstractC16092g = this.itemActionState;
        Map<String, EnumC16091f> map = this.followerRequestUiStages;
        GenericInteraction genericInteraction = this.pendingHostInteraction;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("CommunityFollowerLookupDomainState(isLoading=", ", isError=", ", data=", z4, z13);
        sbM32002u.append(communityFollowerLookupResponse);
        sbM32002u.append(", initialPath=");
        sbM32002u.append(str);
        sbM32002u.append(", paginationState=");
        sbM32002u.append(abstractC16093h);
        sbM32002u.append(", itemActionState=");
        sbM32002u.append(abstractC16092g);
        sbM32002u.append(", followerRequestUiStages=");
        sbM32002u.append(map);
        sbM32002u.append(", pendingHostInteraction=");
        sbM32002u.append(genericInteraction);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C16087b(boolean z4, boolean z13, CommunityFollowerLookupResponse communityFollowerLookupResponse, String str, AbstractC16093h abstractC16093h, AbstractC16092g abstractC16092g, Map map, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : communityFollowerLookupResponse, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? AbstractC16093h.c.f60994a : abstractC16093h, (i13 & 32) != 0 ? AbstractC16092g.c.f60990a : abstractC16092g, (i13 & 64) != 0 ? C25272z.f99163w : map, (i13 & 128) != 0 ? null : genericInteraction);
    }
}
