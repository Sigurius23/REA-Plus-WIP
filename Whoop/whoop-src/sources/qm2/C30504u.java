package qm2;

import com.whoop.data.remote.domain.response.onboarding.OnboardingInfo;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import st0.EnumC32978v;

/* JADX INFO: renamed from: qm2.u */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lqm2/u;", "Lqm2/q;", "Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;", "onboardingInfo", "", "", "eventMetadata", "Lst0/v;", "strapGen", "<init>", "(Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;Ljava/util/Map;Lst0/v;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;", "b", "()Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "Lst0/v;", "()Lst0/v;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30504u extends AbstractC30500q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final OnboardingInfo onboardingInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Map<String, String> eventMetadata;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC32978v strapGen;

    public C30504u(OnboardingInfo onboardingInfo, Map<String, String> map, EnumC32978v enumC32978v) {
        super(null);
        this.onboardingInfo = onboardingInfo;
        this.eventMetadata = map;
        this.strapGen = enumC32978v;
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, String> m93419a() {
        return this.eventMetadata;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OnboardingInfo getOnboardingInfo() {
        return this.onboardingInfo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC32978v getStrapGen() {
        return this.strapGen;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30504u)) {
            return false;
        }
        C30504u c30504u = (C30504u) other;
        return AbstractC22676k.m65745e(this.onboardingInfo, c30504u.onboardingInfo) && AbstractC22676k.m65745e(this.eventMetadata, c30504u.eventMetadata) && this.strapGen == c30504u.strapGen;
    }

    public int hashCode() {
        OnboardingInfo onboardingInfo = this.onboardingInfo;
        int iHashCode = (onboardingInfo == null ? 0 : onboardingInfo.hashCode()) * 31;
        Map<String, String> map = this.eventMetadata;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        EnumC32978v enumC32978v = this.strapGen;
        return iHashCode2 + (enumC32978v != null ? enumC32978v.hashCode() : 0);
    }

    public String toString() {
        return "StrapConnectionFinishedState(onboardingInfo=" + this.onboardingInfo + ", eventMetadata=" + this.eventMetadata + ", strapGen=" + this.strapGen + ")";
    }

    public /* synthetic */ C30504u(OnboardingInfo onboardingInfo, Map map, EnumC32978v enumC32978v, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : onboardingInfo, (i13 & 2) != 0 ? null : map, enumC32978v);
    }
}
