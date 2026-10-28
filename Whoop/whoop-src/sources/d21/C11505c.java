package d21;

import c93.InterfaceC4351m;
import i93.C18284j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: d21.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b \u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b#\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\b)\u0010\u0015R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b\u001c\u0010\u0015R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u0015R)\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b*\u0010-¨\u0006."}, m65681d2 = {"Ld21/c;", "Lm91/u;", "", "isImperial", "", "heightInCentimeters", "Li93/j;", "feetRange", "centimetersRange", "", "feetLabel", "inchesLabel", "centimetersLabel", "stateUpdateHeightKey", "Lkotlin/Function2;", "Lcom/whoop/domain/model/UnitSystem;", "Lcom/whoop/whoopaction/domain/models/StateUpdateAction;", "stateUpdate", "<init>", "(ZILi93/j;Li93/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc93/m;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "j", "()Z", "b", "I", "f", "c", "Li93/j;", "e", "()Li93/j;", "d", "Ljava/lang/String;", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Lc93/m;", "()Lc93/m;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11505c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isImperial;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int heightInCentimeters;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C18284j feetRange;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C18284j centimetersRange;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String feetLabel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String inchesLabel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String centimetersLabel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String stateUpdateHeightKey;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC4351m stateUpdate;

    public C11505c(boolean z4, int i13, C18284j feetRange, C18284j centimetersRange, String feetLabel, String inchesLabel, String centimetersLabel, String str, InterfaceC4351m stateUpdate) {
        AbstractC22676k.m65750j(feetRange, "feetRange");
        AbstractC22676k.m65750j(centimetersRange, "centimetersRange");
        AbstractC22676k.m65750j(feetLabel, "feetLabel");
        AbstractC22676k.m65750j(inchesLabel, "inchesLabel");
        AbstractC22676k.m65750j(centimetersLabel, "centimetersLabel");
        AbstractC22676k.m65750j(stateUpdate, "stateUpdate");
        this.isImperial = z4;
        this.heightInCentimeters = i13;
        this.feetRange = feetRange;
        this.centimetersRange = centimetersRange;
        this.feetLabel = feetLabel;
        this.inchesLabel = inchesLabel;
        this.centimetersLabel = centimetersLabel;
        this.stateUpdateHeightKey = str;
        this.stateUpdate = stateUpdate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCentimetersLabel() {
        return this.centimetersLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C18284j getCentimetersRange() {
        return this.centimetersRange;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFeetLabel() {
        return this.feetLabel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C18284j getFeetRange() {
        return this.feetRange;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11505c)) {
            return false;
        }
        C11505c c11505c = (C11505c) other;
        return this.isImperial == c11505c.isImperial && this.heightInCentimeters == c11505c.heightInCentimeters && AbstractC22676k.m65745e(this.feetRange, c11505c.feetRange) && AbstractC22676k.m65745e(this.centimetersRange, c11505c.centimetersRange) && AbstractC22676k.m65745e(this.feetLabel, c11505c.feetLabel) && AbstractC22676k.m65745e(this.inchesLabel, c11505c.inchesLabel) && AbstractC22676k.m65745e(this.centimetersLabel, c11505c.centimetersLabel) && AbstractC22676k.m65745e(this.stateUpdateHeightKey, c11505c.stateUpdateHeightKey) && AbstractC22676k.m65745e(this.stateUpdate, c11505c.stateUpdate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getHeightInCentimeters() {
        return this.heightInCentimeters;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getInchesLabel() {
        return this.inchesLabel;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final InterfaceC4351m getStateUpdate() {
        return this.stateUpdate;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.centimetersRange.hashCode() + ((this.feetRange.hashCode() + AbstractC11266d.m30448b(this.heightInCentimeters, Boolean.hashCode(this.isImperial) * 31, 31)) * 31)) * 31, 31, this.feetLabel), 31, this.inchesLabel), 31, this.centimetersLabel);
        String str = this.stateUpdateHeightKey;
        return this.stateUpdate.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getStateUpdateHeightKey() {
        return this.stateUpdateHeightKey;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsImperial() {
        return this.isImperial;
    }

    public String toString() {
        boolean z4 = this.isImperial;
        int i13 = this.heightInCentimeters;
        C18284j c18284j = this.feetRange;
        C18284j c18284j2 = this.centimetersRange;
        String str = this.feetLabel;
        String str2 = this.inchesLabel;
        String str3 = this.centimetersLabel;
        String str4 = this.stateUpdateHeightKey;
        InterfaceC4351m interfaceC4351m = this.stateUpdate;
        StringBuilder sb4 = new StringBuilder("WhoopHeightPickerItemState(isImperial=");
        sb4.append(z4);
        sb4.append(", heightInCentimeters=");
        sb4.append(i13);
        sb4.append(", feetRange=");
        sb4.append(c18284j);
        sb4.append(", centimetersRange=");
        sb4.append(c18284j2);
        sb4.append(", feetLabel=");
        AbstractC11266d.m30444B(sb4, str, ", inchesLabel=", str2, ", centimetersLabel=");
        AbstractC11266d.m30444B(sb4, str3, ", stateUpdateHeightKey=", str4, ", stateUpdate=");
        sb4.append(interfaceC4351m);
        sb4.append(")");
        return sb4.toString();
    }
}
