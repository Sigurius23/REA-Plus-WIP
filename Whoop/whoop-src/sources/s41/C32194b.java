package s41;

import c93.InterfaceC4351m;
import i93.C18284j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: s41.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b\u001f\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b\u001b\u0010\u0014R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b)\u0010\u0014R)\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b!\u0010*\u001a\u0004\b(\u0010+¨\u0006,"}, m65681d2 = {"Ls41/b;", "Lm91/u;", "", "isImperial", "", "weightInPounds", "Li93/j;", "poundsRange", "kilogramsRange", "", "poundsLabel", "kilogramsLabel", "stateUpdateWeightKey", "Lkotlin/Function2;", "Lcom/whoop/domain/model/UnitSystem;", "Lcom/whoop/whoopaction/domain/models/StateUpdateAction;", "stateUpdate", "<init>", "(ZILi93/j;Li93/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc93/m;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "i", "()Z", "b", "I", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "Li93/j;", "e", "()Li93/j;", "d", "Ljava/lang/String;", "f", "g", "Lc93/m;", "()Lc93/m;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32194b implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isImperial;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int weightInPounds;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C18284j poundsRange;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C18284j kilogramsRange;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String poundsLabel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String kilogramsLabel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String stateUpdateWeightKey;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC4351m stateUpdate;

    public C32194b(boolean z4, int i13, C18284j poundsRange, C18284j kilogramsRange, String poundsLabel, String kilogramsLabel, String str, InterfaceC4351m stateUpdate) {
        AbstractC22676k.m65750j(poundsRange, "poundsRange");
        AbstractC22676k.m65750j(kilogramsRange, "kilogramsRange");
        AbstractC22676k.m65750j(poundsLabel, "poundsLabel");
        AbstractC22676k.m65750j(kilogramsLabel, "kilogramsLabel");
        AbstractC22676k.m65750j(stateUpdate, "stateUpdate");
        this.isImperial = z4;
        this.weightInPounds = i13;
        this.poundsRange = poundsRange;
        this.kilogramsRange = kilogramsRange;
        this.poundsLabel = poundsLabel;
        this.kilogramsLabel = kilogramsLabel;
        this.stateUpdateWeightKey = str;
        this.stateUpdate = stateUpdate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getKilogramsLabel() {
        return this.kilogramsLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C18284j getKilogramsRange() {
        return this.kilogramsRange;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPoundsLabel() {
        return this.poundsLabel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C18284j getPoundsRange() {
        return this.poundsRange;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32194b)) {
            return false;
        }
        C32194b c32194b = (C32194b) other;
        return this.isImperial == c32194b.isImperial && this.weightInPounds == c32194b.weightInPounds && AbstractC22676k.m65745e(this.poundsRange, c32194b.poundsRange) && AbstractC22676k.m65745e(this.kilogramsRange, c32194b.kilogramsRange) && AbstractC22676k.m65745e(this.poundsLabel, c32194b.poundsLabel) && AbstractC22676k.m65745e(this.kilogramsLabel, c32194b.kilogramsLabel) && AbstractC22676k.m65745e(this.stateUpdateWeightKey, c32194b.stateUpdateWeightKey) && AbstractC22676k.m65745e(this.stateUpdate, c32194b.stateUpdate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC4351m getStateUpdate() {
        return this.stateUpdate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStateUpdateWeightKey() {
        return this.stateUpdateWeightKey;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getWeightInPounds() {
        return this.weightInPounds;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.kilogramsRange.hashCode() + ((this.poundsRange.hashCode() + AbstractC11266d.m30448b(this.weightInPounds, Boolean.hashCode(this.isImperial) * 31, 31)) * 31)) * 31, 31, this.poundsLabel), 31, this.kilogramsLabel);
        String str = this.stateUpdateWeightKey;
        return this.stateUpdate.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsImperial() {
        return this.isImperial;
    }

    public String toString() {
        boolean z4 = this.isImperial;
        int i13 = this.weightInPounds;
        C18284j c18284j = this.poundsRange;
        C18284j c18284j2 = this.kilogramsRange;
        String str = this.poundsLabel;
        String str2 = this.kilogramsLabel;
        String str3 = this.stateUpdateWeightKey;
        InterfaceC4351m interfaceC4351m = this.stateUpdate;
        StringBuilder sb4 = new StringBuilder("WhoopWeightPickerItemState(isImperial=");
        sb4.append(z4);
        sb4.append(", weightInPounds=");
        sb4.append(i13);
        sb4.append(", poundsRange=");
        sb4.append(c18284j);
        sb4.append(", kilogramsRange=");
        sb4.append(c18284j2);
        sb4.append(", poundsLabel=");
        AbstractC11266d.m30444B(sb4, str, ", kilogramsLabel=", str2, ", stateUpdateWeightKey=");
        sb4.append(str3);
        sb4.append(", stateUpdate=");
        sb4.append(interfaceC4351m);
        sb4.append(")");
        return sb4.toString();
    }
}
