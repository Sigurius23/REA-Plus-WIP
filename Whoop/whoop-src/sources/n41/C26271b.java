package n41;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: n41.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\r¨\u0006!"}, m65681d2 = {"Ln41/b;", "Lm91/u;", "", "expiresAt", "Ln41/c;", "variant", "", "hourLabel", "minLabel", "secondLabel", "<init>", "(JLn41/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ln41/c;", "f", "()Ln41/c;", "c", "Ljava/lang/String;", "d", "e", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26271b implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f104437f = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long expiresAt;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC26272c variant;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String hourLabel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String minLabel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String secondLabel;

    public C26271b(long j7, EnumC26272c variant, String hourLabel, String minLabel, String secondLabel) {
        AbstractC22676k.m65750j(variant, "variant");
        AbstractC22676k.m65750j(hourLabel, "hourLabel");
        AbstractC22676k.m65750j(minLabel, "minLabel");
        AbstractC22676k.m65750j(secondLabel, "secondLabel");
        this.expiresAt = j7;
        this.variant = variant;
        this.hourLabel = hourLabel;
        this.minLabel = minLabel;
        this.secondLabel = secondLabel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHourLabel() {
        return this.hourLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMinLabel() {
        return this.minLabel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSecondLabel() {
        return this.secondLabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26271b)) {
            return false;
        }
        C26271b c26271b = (C26271b) other;
        return this.expiresAt == c26271b.expiresAt && this.variant == c26271b.variant && AbstractC22676k.m65745e(this.hourLabel, c26271b.hourLabel) && AbstractC22676k.m65745e(this.minLabel, c26271b.minLabel) && AbstractC22676k.m65745e(this.secondLabel, c26271b.secondLabel);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC26272c getVariant() {
        return this.variant;
    }

    public int hashCode() {
        return this.secondLabel.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.variant.hashCode() + (Long.hashCode(this.expiresAt) * 31)) * 31, 31, this.hourLabel), 31, this.minLabel);
    }

    public String toString() {
        long j7 = this.expiresAt;
        EnumC26272c enumC26272c = this.variant;
        String str = this.hourLabel;
        String str2 = this.minLabel;
        String str3 = this.secondLabel;
        StringBuilder sb4 = new StringBuilder("TimerComponentState(expiresAt=");
        sb4.append(j7);
        sb4.append(", variant=");
        sb4.append(enumC26272c);
        AbstractC11266d.m30444B(sb4, ", hourLabel=", str, ", minLabel=", str2);
        return AbstractC2875y.m8304q(sb4, ", secondLabel=", str3, ")");
    }
}
