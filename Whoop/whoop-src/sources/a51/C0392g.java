package a51;

import com.stripe.android.core.networking.AnalyticsRequestV2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import z41.AbstractC40076k;

/* JADX INFO: renamed from: a51.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"La51/g;", "", "Lz41/k;", AnalyticsRequestV2.HEADER_ORIGIN, "La51/c;", "speedAttribute", "<init>", "(Lz41/k;La51/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz41/k;", "()Lz41/k;", "b", "La51/c;", "()La51/c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0392g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC40076k origin;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C0388c speedAttribute;

    public C0392g(AbstractC40076k origin, C0388c speedAttribute) {
        AbstractC22676k.m65750j(origin, "origin");
        AbstractC22676k.m65750j(speedAttribute, "speedAttribute");
        this.origin = origin;
        this.speedAttribute = speedAttribute;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC40076k getOrigin() {
        return this.origin;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C0388c getSpeedAttribute() {
        return this.speedAttribute;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0392g)) {
            return false;
        }
        C0392g c0392g = (C0392g) other;
        return AbstractC22676k.m65745e(this.origin, c0392g.origin) && AbstractC22676k.m65745e(this.speedAttribute, c0392g.speedAttribute);
    }

    public int hashCode() {
        return this.speedAttribute.hashCode() + (this.origin.hashCode() * 31);
    }

    public String toString() {
        return "MagneticAnimationSetting(origin=" + this.origin + ", speedAttribute=" + this.speedAttribute + ")";
    }
}
