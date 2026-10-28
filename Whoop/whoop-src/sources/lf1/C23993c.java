package lf1;

import hf1.InterfaceC17234a;
import java.util.Set;
import m83.AbstractC25260n;
import m83.C25235a0;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: lf1.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0014B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a¨\u0006\u001f"}, m65681d2 = {"Llf1/c;", "Lhf1/a;", "", "name", "", "variants", "defaultVariant", "requiredFeatureFlags", "<init>", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Ljava/util/Set;", "getVariants", "()Ljava/util/Set;", "c", "d", "getRequiredFeatureFlags", "e", "experiments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23993c implements InterfaceC17234a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Set<String> variants;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String defaultVariant;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Set<String> requiredFeatureFlags;

    public C23993c(String name, Set<String> variants, String defaultVariant, Set<String> requiredFeatureFlags) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(variants, "variants");
        AbstractC22676k.m65750j(defaultVariant, "defaultVariant");
        AbstractC22676k.m65750j(requiredFeatureFlags, "requiredFeatureFlags");
        this.name = name;
        this.variants = variants;
        this.defaultVariant = defaultVariant;
        this.requiredFeatureFlags = requiredFeatureFlags;
    }

    @Override // hf1.InterfaceC17234a
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getDefaultVariant() {
        return this.defaultVariant;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23993c)) {
            return false;
        }
        C23993c c23993c = (C23993c) other;
        return AbstractC22676k.m65745e(this.name, c23993c.name) && AbstractC22676k.m65745e(this.variants, c23993c.variants) && AbstractC22676k.m65745e(this.defaultVariant, c23993c.defaultVariant) && AbstractC22676k.m65745e(this.requiredFeatureFlags, c23993c.requiredFeatureFlags);
    }

    @Override // hf1.InterfaceC17234a
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.requiredFeatureFlags.hashCode() + AbstractC11266d.m30450d(AbstractC25012a.m73368a(this.variants, this.name.hashCode() * 31, 31), 31, this.defaultVariant);
    }

    public String toString() {
        return "CalibrationWteExperiment(name=" + this.name + ", variants=" + this.variants + ", defaultVariant=" + this.defaultVariant + ", requiredFeatureFlags=" + this.requiredFeatureFlags + ")";
    }

    public C23993c(String str, Set set, String str2, Set set2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "calibration-what-to-expect" : str, (i13 & 2) != 0 ? AbstractC25260n.m74059b1(new String[]{"test", "control"}) : set, (i13 & 4) != 0 ? "control" : str2, (i13 & 8) != 0 ? C25235a0.f99113w : set2);
    }
}
