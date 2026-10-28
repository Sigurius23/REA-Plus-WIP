package za0;

import com.whoop.advancedlabs.domain.models.BiomarkerDetailsResponse;
import java.util.Set;
import m83.C25235a0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: za0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\b\u0082\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, m65681d2 = {"Lza0/a;", "", "Lza0/b;", "action", "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;", "currentResponse", "", "emitDateSelectorLoading", "", "", "dismissedCardIds", "<init>", "(Lza0/b;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;ZLjava/util/Set;)V", "a", "(Lza0/b;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;ZLjava/util/Set;)Lza0/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lza0/b;", "c", "()Lza0/b;", "b", "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;", "getCurrentResponse", "()Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;", "Z", "e", "()Z", "d", "Ljava/util/Set;", "()Ljava/util/Set;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C40221a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC40222b action;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final BiomarkerDetailsResponse currentResponse;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean emitDateSelectorLoading;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Set<String> dismissedCardIds;

    public C40221a(AbstractC40222b action, BiomarkerDetailsResponse biomarkerDetailsResponse, boolean z4, Set<String> dismissedCardIds) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(dismissedCardIds, "dismissedCardIds");
        this.action = action;
        this.currentResponse = biomarkerDetailsResponse;
        this.emitDateSelectorLoading = z4;
        this.dismissedCardIds = dismissedCardIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C40221a m129112b(C40221a c40221a, AbstractC40222b abstractC40222b, BiomarkerDetailsResponse biomarkerDetailsResponse, boolean z4, Set set, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC40222b = c40221a.action;
        }
        if ((i13 & 2) != 0) {
            biomarkerDetailsResponse = c40221a.currentResponse;
        }
        if ((i13 & 4) != 0) {
            z4 = c40221a.emitDateSelectorLoading;
        }
        if ((i13 & 8) != 0) {
            set = c40221a.dismissedCardIds;
        }
        return c40221a.m129113a(abstractC40222b, biomarkerDetailsResponse, z4, set);
    }

    /* JADX INFO: renamed from: a */
    public final C40221a m129113a(AbstractC40222b action, BiomarkerDetailsResponse currentResponse, boolean emitDateSelectorLoading, Set<String> dismissedCardIds) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(dismissedCardIds, "dismissedCardIds");
        return new C40221a(action, currentResponse, emitDateSelectorLoading, dismissedCardIds);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC40222b getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: d */
    public final Set<String> m129115d() {
        return this.dismissedCardIds;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getEmitDateSelectorLoading() {
        return this.emitDateSelectorLoading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40221a)) {
            return false;
        }
        C40221a c40221a = (C40221a) other;
        return AbstractC22676k.m65745e(this.action, c40221a.action) && AbstractC22676k.m65745e(this.currentResponse, c40221a.currentResponse) && this.emitDateSelectorLoading == c40221a.emitDateSelectorLoading && AbstractC22676k.m65745e(this.dismissedCardIds, c40221a.dismissedCardIds);
    }

    public int hashCode() {
        int iHashCode = this.action.hashCode() * 31;
        BiomarkerDetailsResponse biomarkerDetailsResponse = this.currentResponse;
        return this.dismissedCardIds.hashCode() + AbstractC2875y.m8289b((iHashCode + (biomarkerDetailsResponse == null ? 0 : biomarkerDetailsResponse.hashCode())) * 31, 31, this.emitDateSelectorLoading);
    }

    public String toString() {
        return "BiomarkerDetailsAccumulator(action=" + this.action + ", currentResponse=" + this.currentResponse + ", emitDateSelectorLoading=" + this.emitDateSelectorLoading + ", dismissedCardIds=" + this.dismissedCardIds + ")";
    }

    public /* synthetic */ C40221a(AbstractC40222b abstractC40222b, BiomarkerDetailsResponse biomarkerDetailsResponse, boolean z4, Set set, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC40222b, (i13 & 2) != 0 ? null : biomarkerDetailsResponse, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? C25235a0.f99113w : set);
    }
}
