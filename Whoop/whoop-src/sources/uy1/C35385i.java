package uy1;

import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: uy1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Luy1/i;", "", "", "mfaConfigured", "mfaRequired", "Luy1/h;", "requirementReason", "<init>", "(ZZLuy1/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "c", "Luy1/h;", "()Luy1/h;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35385i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean mfaConfigured;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean mfaRequired;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC35384h requirementReason;

    public C35385i(boolean z4, boolean z13, EnumC35384h requirementReason) {
        AbstractC22676k.m65750j(requirementReason, "requirementReason");
        this.mfaConfigured = z4;
        this.mfaRequired = z13;
        this.requirementReason = requirementReason;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getMfaConfigured() {
        return this.mfaConfigured;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getMfaRequired() {
        return this.mfaRequired;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC35384h getRequirementReason() {
        return this.requirementReason;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35385i)) {
            return false;
        }
        C35385i c35385i = (C35385i) other;
        return this.mfaConfigured == c35385i.mfaConfigured && this.mfaRequired == c35385i.mfaRequired && this.requirementReason == c35385i.requirementReason;
    }

    public int hashCode() {
        return this.requirementReason.hashCode() + AbstractC2875y.m8289b(Boolean.hashCode(this.mfaConfigured) * 31, 31, this.mfaRequired);
    }

    public String toString() {
        boolean z4 = this.mfaConfigured;
        boolean z13 = this.mfaRequired;
        EnumC35384h enumC35384h = this.requirementReason;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("MfaState(mfaConfigured=", ", mfaRequired=", ", requirementReason=", z4, z13);
        sbM32002u.append(enumC35384h);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }
}
