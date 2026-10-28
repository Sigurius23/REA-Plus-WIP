package x61;

import com.whoop.design.util.AbstractC8693b;
import java.util.ArrayList;
import java.util.List;
import kd1.AbstractC22403o;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import u61.C34555d;
import x81.C38072d;
import y61.C39260a;
import y61.C39261b;

/* JADX INFO: renamed from: x61.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lx61/d;", "", "<init>", "()V", "", "Ly61/b;", "mergedBars", "Lx61/d$a;", "c", "(Ljava/util/List;)Lx61/d$a;", "", "a", "(Ljava/util/List;)F", "Ly61/a;", "previousGroup", "nextGroup", "b", "(Ly61/a;Ly61/a;)Ly61/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38026d {

    /* JADX INFO: renamed from: x61.d$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lx61/d$a;", "", "", "topXPercent", "Lu61/d;", "topText", "<init>", "(FLu61/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "b", "()F", "Lu61/d;", "()Lu61/d;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final float topXPercent;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C34555d topText;

        public a(float f13, C34555d c34555d) {
            this.topXPercent = f13;
            this.topText = c34555d;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C34555d getTopText() {
            return this.topText;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getTopXPercent() {
            return this.topXPercent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return Float.compare(this.topXPercent, aVar.topXPercent) == 0 && AbstractC22676k.m65745e(this.topText, aVar.topText);
        }

        public int hashCode() {
            int iHashCode = Float.hashCode(this.topXPercent) * 31;
            C34555d c34555d = this.topText;
            return iHashCode + (c34555d == null ? 0 : c34555d.hashCode());
        }

        public String toString() {
            return "OverlayBarLabelInfo(topXPercent=" + this.topXPercent + ", topText=" + this.topText + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    private final float m121755a(List<C39261b> mergedBars) {
        if (mergedBars.isEmpty()) {
            return 0.5f;
        }
        List<C39261b> list = mergedBars;
        float fMin = 1.0f;
        for (C39261b c39261b : list) {
            fMin = Math.min(fMin, c39261b.getXPercent() - (c39261b.getWidthPercent() / 2.0f));
        }
        float fMax = 0.0f;
        for (C39261b c39261b2 : list) {
            fMax = Math.max(fMax, (c39261b2.getWidthPercent() / 2.0f) + c39261b2.getXPercent());
        }
        return (fMin + fMax) / 2.0f;
    }

    /* JADX INFO: renamed from: c */
    private final a m121756c(List<C39261b> mergedBars) {
        return new a(m121755a(mergedBars), new C34555d(AbstractC8693b.m21278l(String.valueOf(mergedBars.size())), null, false, false, 14, null));
    }

    /* JADX INFO: renamed from: b */
    public final C39260a m121757b(C39260a previousGroup, C39260a nextGroup) {
        AbstractC22676k.m65750j(previousGroup, "previousGroup");
        AbstractC22676k.m65750j(nextGroup, "nextGroup");
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(previousGroup.m125039d(), nextGroup.m125039d());
        boolean zM65745e = AbstractC22676k.m65745e(previousGroup.getTopIcon(), nextGroup.getTopIcon());
        a aVarM121756c = m121756c(arrayListM74129g1);
        return new C39260a(null, arrayListM74129g1, aVarM121756c.getTopXPercent(), aVarM121756c.getTopText(), zM65745e ? previousGroup.getTopIcon() : new AbstractC22403o.a(C38072d.f163053a.m121951d().getActivities().getOther()), EnumC39333f.WHITE_50, null, null, null, null, null, 1985, null);
    }
}
