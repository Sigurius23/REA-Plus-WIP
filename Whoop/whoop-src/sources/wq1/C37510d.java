package wq1;

import ep0.C13404j;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import xq1.C38544c;

/* JADX INFO: renamed from: wq1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u0019\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b\u001d\u0010*¨\u0006+"}, m65681d2 = {"Lwq1/d;", "", "Lm91/u;", "journalEnableState", "Lxq1/c;", "headerState", "", "itemStates", "", "cycleId", "Lep0/j;", "screenContextMetadata", "", "hasAutomatedTag", "<init>", "(Lm91/u;Lxq1/c;Ljava/util/List;Ljava/lang/Long;Lep0/j;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lm91/u;", "e", "()Lm91/u;", "b", "Lxq1/c;", "c", "()Lxq1/c;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ljava/lang/Long;", "()Ljava/lang/Long;", "Lep0/j;", "f", "()Lep0/j;", "Z", "()Z", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37510d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC25312u journalEnableState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C38544c headerState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<InterfaceC25312u> itemStates;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Long cycleId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C13404j screenContextMetadata;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean hasAutomatedTag;

    /* JADX WARN: Multi-variable type inference failed */
    public C37510d(InterfaceC25312u interfaceC25312u, C38544c headerState, List<? extends InterfaceC25312u> itemStates, Long l7, C13404j c13404j, boolean z4) {
        AbstractC22676k.m65750j(headerState, "headerState");
        AbstractC22676k.m65750j(itemStates, "itemStates");
        this.journalEnableState = interfaceC25312u;
        this.headerState = headerState;
        this.itemStates = itemStates;
        this.cycleId = l7;
        this.screenContextMetadata = c13404j;
        this.hasAutomatedTag = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getCycleId() {
        return this.cycleId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHasAutomatedTag() {
        return this.hasAutomatedTag;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C38544c getHeaderState() {
        return this.headerState;
    }

    /* JADX INFO: renamed from: d */
    public final List<InterfaceC25312u> m120259d() {
        return this.itemStates;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC25312u getJournalEnableState() {
        return this.journalEnableState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37510d)) {
            return false;
        }
        C37510d c37510d = (C37510d) other;
        return AbstractC22676k.m65745e(this.journalEnableState, c37510d.journalEnableState) && AbstractC22676k.m65745e(this.headerState, c37510d.headerState) && AbstractC22676k.m65745e(this.itemStates, c37510d.itemStates) && AbstractC22676k.m65745e(this.cycleId, c37510d.cycleId) && AbstractC22676k.m65745e(this.screenContextMetadata, c37510d.screenContextMetadata) && this.hasAutomatedTag == c37510d.hasAutomatedTag;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C13404j getScreenContextMetadata() {
        return this.screenContextMetadata;
    }

    public int hashCode() {
        InterfaceC25312u interfaceC25312u = this.journalEnableState;
        int iM31983b = AbstractC11895b.m31983b((this.headerState.hashCode() + ((interfaceC25312u == null ? 0 : interfaceC25312u.hashCode()) * 31)) * 31, 31, this.itemStates);
        Long l7 = this.cycleId;
        int iHashCode = (iM31983b + (l7 == null ? 0 : l7.hashCode())) * 31;
        C13404j c13404j = this.screenContextMetadata;
        return Boolean.hashCode(this.hasAutomatedTag) + ((iHashCode + (c13404j != null ? c13404j.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "BehaviorImpactScreenState(journalEnableState=" + this.journalEnableState + ", headerState=" + this.headerState + ", itemStates=" + this.itemStates + ", cycleId=" + this.cycleId + ", screenContextMetadata=" + this.screenContextMetadata + ", hasAutomatedTag=" + this.hasAutomatedTag + ")";
    }
}
