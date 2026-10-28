package cj1;

import d11.C11474i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cj1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lcj1/d;", "", "Ld11/i;", "cta", "Lcj1/c;", "iconState", "<init>", "(Ld11/i;Lcj1/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ld11/i;", "()Ld11/i;", "b", "Lcj1/c;", "()Lcj1/c;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4748d {

    /* JADX INFO: renamed from: c */
    public static final int f19470c = C11474i.f36854E;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C11474i cta;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC4747c iconState;

    public C4748d(C11474i c11474i, EnumC4747c enumC4747c) {
        this.cta = c11474i;
        this.iconState = enumC4747c;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C11474i getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC4747c getIconState() {
        return this.iconState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4748d)) {
            return false;
        }
        C4748d c4748d = (C4748d) other;
        return AbstractC22676k.m65745e(this.cta, c4748d.cta) && this.iconState == c4748d.iconState;
    }

    public int hashCode() {
        C11474i c11474i = this.cta;
        int iHashCode = (c11474i == null ? 0 : c11474i.hashCode()) * 31;
        EnumC4747c enumC4747c = this.iconState;
        return iHashCode + (enumC4747c != null ? enumC4747c.hashCode() : 0);
    }

    public String toString() {
        return "DataVisualizationCardTileState(cta=" + this.cta + ", iconState=" + this.iconState + ")";
    }
}
