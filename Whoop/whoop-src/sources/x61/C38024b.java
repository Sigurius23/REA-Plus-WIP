package x61;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;
import y61.C39260a;

/* JADX INFO: renamed from: x61.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lx61/b;", "", "", "Ly61/a;", "groups", "Lx61/d;", "merger", "Landroid/content/Context;", "context", "Lx61/c;", "mergeDecider", "", "parentWidth", "fontScale", "<init>", "(Ljava/util/List;Lx61/d;Landroid/content/Context;Lx61/c;FF)V", "accumulatedGroups", "nextGroup", "a", "(Ljava/util/List;Ly61/a;)Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/util/List;", "Lx61/d;", "c", "Landroid/content/Context;", "d", "Lx61/c;", "e", "F", "f", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38024b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C39260a> groups;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C38026d merger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C38025c mergeDecider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float parentWidth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float fontScale;

    public C38024b(List<C39260a> groups, C38026d merger, Context context, C38025c mergeDecider, float f13, float f14) {
        AbstractC22676k.m65750j(groups, "groups");
        AbstractC22676k.m65750j(merger, "merger");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(mergeDecider, "mergeDecider");
        this.groups = groups;
        this.merger = merger;
        this.context = context;
        this.mergeDecider = mergeDecider;
        this.parentWidth = f13;
        this.fontScale = f14;
    }

    /* JADX INFO: renamed from: a */
    private final List<C39260a> m121750a(List<C39260a> accumulatedGroups, C39260a nextGroup) {
        C39260a c39260a = (C39260a) AbstractC25265s.m74114R0(accumulatedGroups);
        if (c39260a == null) {
            return AbstractC37056f.m118958J(nextGroup);
        }
        if (!this.mergeDecider.m121754c(c39260a, nextGroup, this.parentWidth, this.fontScale)) {
            return AbstractC25265s.m74128f1(nextGroup, accumulatedGroups);
        }
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(accumulatedGroups);
        arrayListM74097F1.set(AbstractC37056f.m118951C(arrayListM74097F1), this.merger.m121757b(c39260a, nextGroup));
        return arrayListM74097F1;
    }

    /* JADX INFO: renamed from: b */
    public final List<C39260a> m121751b() {
        Iterator<T> it = this.groups.iterator();
        List<C39260a> listM121750a = C25271y.f99162w;
        while (it.hasNext()) {
            listM121750a = m121750a(listM121750a, (C39260a) it.next());
        }
        return listM121750a;
    }

    public /* synthetic */ C38024b(List list, C38026d c38026d, Context context, C38025c c38025c, float f13, float f14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i13 & 2) != 0 ? new C38026d() : c38026d, context, (i13 & 8) != 0 ? new C38025c(context, null, 2, null) : c38025c, f13, f14);
    }
}
