package ub0;

import c13.AbstractC3855a;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ub0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m65681d2 = {"Lub0/a;", "", "", "", "addedBiomarkers", "removedBiomarkers", "updatedBiomarkers", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "c", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34736a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<String> addedBiomarkers;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<String> removedBiomarkers;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<String> updatedBiomarkers;

    public C34736a(List<String> addedBiomarkers, List<String> removedBiomarkers, List<String> updatedBiomarkers) {
        AbstractC22676k.m65750j(addedBiomarkers, "addedBiomarkers");
        AbstractC22676k.m65750j(removedBiomarkers, "removedBiomarkers");
        AbstractC22676k.m65750j(updatedBiomarkers, "updatedBiomarkers");
        this.addedBiomarkers = addedBiomarkers;
        this.removedBiomarkers = removedBiomarkers;
        this.updatedBiomarkers = updatedBiomarkers;
    }

    /* JADX INFO: renamed from: a */
    public final List<String> m109678a() {
        return this.addedBiomarkers;
    }

    /* JADX INFO: renamed from: b */
    public final List<String> m109679b() {
        return this.removedBiomarkers;
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m109680c() {
        return this.updatedBiomarkers;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34736a)) {
            return false;
        }
        C34736a c34736a = (C34736a) other;
        return AbstractC22676k.m65745e(this.addedBiomarkers, c34736a.addedBiomarkers) && AbstractC22676k.m65745e(this.removedBiomarkers, c34736a.removedBiomarkers) && AbstractC22676k.m65745e(this.updatedBiomarkers, c34736a.updatedBiomarkers);
    }

    public int hashCode() {
        return this.updatedBiomarkers.hashCode() + AbstractC11895b.m31983b(this.addedBiomarkers.hashCode() * 31, 31, this.removedBiomarkers);
    }

    public String toString() {
        List<String> list = this.addedBiomarkers;
        List<String> list2 = this.removedBiomarkers;
        return AbstractC3855a.m11829m(AbstractC38963t7.m124380j("BiomarkerChanges(addedBiomarkers=", ", removedBiomarkers=", list, ", updatedBiomarkers=", list2), this.updatedBiomarkers, ")");
    }
}
