package f52;

import ih0.AbstractC18489d0;
import java.util.List;
import lt0.AbstractC24734k;
import m83.C25271y;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: f52.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, m65681d2 = {"Lf52/g;", "", "", "Llt0/k;", "relativeConsolePackets", "relativeFirmwareEventPackets", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "a", "(Ljava/util/List;Ljava/util/List;)Lf52/g;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "d", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14109g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<AbstractC24734k> relativeConsolePackets;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<AbstractC24734k> relativeFirmwareEventPackets;

    /* JADX WARN: Multi-variable type inference failed */
    public C14109g(List<? extends AbstractC24734k> relativeConsolePackets, List<? extends AbstractC24734k> relativeFirmwareEventPackets) {
        AbstractC22676k.m65750j(relativeConsolePackets, "relativeConsolePackets");
        AbstractC22676k.m65750j(relativeFirmwareEventPackets, "relativeFirmwareEventPackets");
        this.relativeConsolePackets = relativeConsolePackets;
        this.relativeFirmwareEventPackets = relativeFirmwareEventPackets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C14109g m40199b(C14109g c14109g, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = c14109g.relativeConsolePackets;
        }
        if ((i13 & 2) != 0) {
            list2 = c14109g.relativeFirmwareEventPackets;
        }
        return c14109g.m40200a(list, list2);
    }

    /* JADX INFO: renamed from: a */
    public final C14109g m40200a(List<? extends AbstractC24734k> relativeConsolePackets, List<? extends AbstractC24734k> relativeFirmwareEventPackets) {
        AbstractC22676k.m65750j(relativeConsolePackets, "relativeConsolePackets");
        AbstractC22676k.m65750j(relativeFirmwareEventPackets, "relativeFirmwareEventPackets");
        return new C14109g(relativeConsolePackets, relativeFirmwareEventPackets);
    }

    /* JADX INFO: renamed from: c */
    public final List<AbstractC24734k> m40201c() {
        return this.relativeConsolePackets;
    }

    /* JADX INFO: renamed from: d */
    public final List<AbstractC24734k> m40202d() {
        return this.relativeFirmwareEventPackets;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14109g)) {
            return false;
        }
        C14109g c14109g = (C14109g) other;
        return AbstractC22676k.m65745e(this.relativeConsolePackets, c14109g.relativeConsolePackets) && AbstractC22676k.m65745e(this.relativeFirmwareEventPackets, c14109g.relativeFirmwareEventPackets);
    }

    public int hashCode() {
        return this.relativeFirmwareEventPackets.hashCode() + (this.relativeConsolePackets.hashCode() * 31);
    }

    public String toString() {
        int size = this.relativeConsolePackets.size();
        int size2 = this.relativeFirmwareEventPackets.size();
        return AbstractC18489d0.m53371l(AbstractC11266d.m30465s(size, size2, "BurstData(", " console + ", " firmware = "), AbstractC14110h.m40203a(this), " total)");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C14109g(List list, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 1;
        C25271y c25271y = C25271y.f99162w;
        this(i14 != 0 ? c25271y : list, (i13 & 2) != 0 ? c25271y : list2);
    }
}
